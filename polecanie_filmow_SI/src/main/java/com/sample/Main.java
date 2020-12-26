package com.sample;

import org.kie.api.KieServices;
import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;

import javafx.application.Application;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.RadioButton;


public class Main extends Application {
	
	@Override
	public void start(Stage primaryStage) {	 
		
		try {
	        KieServices k = KieServices.Factory.get();
    	    KieContainer kContainer = k.getKieClasspathContainer();
        	KieSession kSession = kContainer.newKieSession("ksession-rules");

            kSession.fireAllRules();
        } catch (Throwable t) {
            t.printStackTrace();
            
        }
	}
	
    public static final void main(String[] args) {
    	launch(args);
    	
    }
}
