package com.tiff.ccengine.ccgenerator.rest;

import javax.validation.constraints.Digits;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

public interface CCManagement {
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Path("{ccType}/{numberOfCards}")

	public Response generateCCdetails(
			@PathParam(value = "ccType") @NotNull(message = "Card name can not be empty") @Size(max = 10) String ccType,
			@PathParam("numberOfCards")  int numberOfCards);
}
