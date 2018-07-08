package com.tiff.ccengine.ccgenerator.rest;

import java.text.SimpleDateFormat;
import java.util.List;

import javax.inject.Inject;
import javax.ws.rs.Path;
import javax.ws.rs.core.Response;

import com.tiff.ccengine.ccgenerator.services.CCGeneratorService;
import com.tiff.ccengine.ccgenerator.services.CCValidatorService;
import com.tiff.ccengine.creditcard.CardType;
import com.tiff.ccengine.creditcard.CreditCard;

@Path("CCEngine")
public class CCManagementImpl implements CCManagement {

	@Inject
	private CCGeneratorService ccGeneratorService;

	@Inject
	private CCValidatorService ccValidatorService;

	@Override
	public Response generateCCdetails(String ccType, int numberOfCards) {

		if (validateInput(ccType, numberOfCards)) {
			CardType cardType = CardType.getCardType(ccType);

			List<CreditCard> creditCardList = ccGeneratorService.generateCreditCard(cardType, numberOfCards);
			try {
				creditCardList = ccValidatorService.validateAndGenerateExpiry(creditCardList);
			} catch (Exception e) {
				Response.status(500, "Invalid input for the service.").build();
			}

			SimpleDateFormat formatter = new SimpleDateFormat("MM/dd/yyyy");

			if (!creditCardList.isEmpty()) {
				String response = creditCardList.size() + " CC numbers of '" + cardType.getCardTypeName()
						+ "' and Expiry date: " + formatter.format(creditCardList.get(0).getExpiryDate());

				return Response.ok(response).build();
			}else {
				Response.status(500, "Invalid input for the service.").build();
			}
		}
		return Response.status(400, "Invalid card type for the service.").build();
	}

	private boolean validateInput(String ccType, int numberOfCards) {
		boolean isValid = true;
		if (CardType.getCardType(ccType) == null)
			isValid = false;
		if (numberOfCards < 1)
			isValid = false;

		return isValid;
	}

}
