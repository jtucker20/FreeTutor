package edu.mcdaniel.java2206.template.replacewithprojectname;

import edu.mcdaniel.java2206.template.replacewithprojectname.components.Example;
import org.apache.logging.log4j.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application {

	//=============================================================================================
	// Private Assets
	//=============================================================================================

	private Logger log;


	//=============================================================================================
	// Constructor(s)
	//=============================================================================================

	public Application(){}


	//=============================================================================================
	// Major Methods
	//=============================================================================================

	//No major methods to implement


	//=============================================================================================
	// PSVM
	//=============================================================================================

	public static void main(String[] args) {

		//===// Spring Application Hook //=======================================================//
		SpringApplication.run(Application.class, args);

		//===// User Defined Behavior //=========================================================//
		//TODO: INSTANTIATE YOUR APPLICATION'S PRIMARY CLASS
		Example exampleWithStandardGreeting = new Example();

		Example exampleWithCustomGreeting = new Example()
				.withGreeting("Greetings")
				.withAudience("Earthlings");

		//TODO: CALL YOUR APPLICATION'S PRIMARY CLASS METHODS
		System.out.println(exampleWithStandardGreeting.getMessage());

		System.out.println(exampleWithCustomGreeting.getMessage());

	}


	//=============================================================================================
	// Minor Methods(s)
	//=============================================================================================

	//No minor methods made


	//=============================================================================================
	// Getters and Setters
	//=============================================================================================

	//No private assets we want to expose

}
