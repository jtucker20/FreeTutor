package edu.mcdaniel.java2206.template.replacewithprojectname.components;

import org.apache.logging.log4j.Logger;

public class Example {

    //=============================================================================================
    // Private Assets
    //=============================================================================================

    private Logger log;

    private String greeting;
    private String audience;


    //=============================================================================================
    // Constructor(s)
    //=============================================================================================

    public Example(){
        this.greeting = "Hello";
        this.audience = "World";
    }


    //=============================================================================================
    // Major Methods
    //=============================================================================================

    public Example withGreeting(String customGreeting){

        this.greeting = customGreeting;

        return this;
    }

    public Example withAudience(String customAudience){

        this.audience = customAudience;

        return this;
    }


    //=============================================================================================
    // Minor Methods(s)
    //=============================================================================================

    public String getMessage(){
        return getGreeting() + " " + getAudience() + "!";
    }


    //=============================================================================================
    // Getters and Setters
    //=============================================================================================

    public String getGreeting() {
        return greeting;
    }

    public void setGreeting(String greeting) {
        this.greeting = greeting;
    }

    public String getAudience() {
        return audience;
    }

    public void setAudience(String audience) {
        this.audience = audience;
    }
}
