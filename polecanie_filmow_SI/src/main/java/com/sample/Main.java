package com.sample;

import org.kie.api.KieServices;
import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;

import java.lang.Exception;

import javafx.application.Application;
import javafx.stage.Stage;


public class Main extends Application {
	
	@Override
	public void start(Stage primaryStage) {	 
		
		try {
	        KieServices k = KieServices.Factory.get();
    	    KieContainer kContainer = k.getKieClasspathContainer();
        	KieSession kSession = kContainer.newKieSession("ksession-rules");

            try {
            	kSession.fireAllRules();
            } catch (Exception ie) {}
        } catch (Throwable t) {
            t.printStackTrace();
            
        }
	}
	
    public static final void main(String[] args) {
    	launch(args);
    	
    }
}
