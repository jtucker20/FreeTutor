package edu.mcdaniel.freetutor.components;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Example {

    //=============================================================================================
    // Private Assets
    //=============================================================================================

    private final Logger log;

    private String greeting;
    private String audience;


    //=============================================================================================
    // Constructor(s)
    //=============================================================================================

    public Example(){
        this.greeting = "Hello";
        this.audience = "World";

        this.log = LogManager.getLogger(this);

        log.debug("The output message is {} {}!", this.greeting, this.audience);
    }


    //=============================================================================================
    // Major Methods
    //=============================================================================================

    public Example withGreeting(String customGreeting){

        this.greeting = customGreeting;

        log.debug("The greeting was changed to: {}", this.greeting);

        return this;
    }

    public Example withAudience(String customAudience){

        this.audience = customAudience;

        log.debug("The audience was changed to: {}", this.audience);

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
