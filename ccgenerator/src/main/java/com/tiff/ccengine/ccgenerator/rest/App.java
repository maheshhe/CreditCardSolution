package com.tiff.ccengine.ccgenerator.rest;
 
import org.glassfish.jersey.server.ResourceConfig;
/**
 *
 * @author skargopolov
 */
public class App extends ResourceConfig{
    public App() {
       packages("com.tiff.ccengine.ccgenerator.rest");
       register(new ApplicationBinder());  
    }
}