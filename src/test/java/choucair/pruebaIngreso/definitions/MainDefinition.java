package choucair.pruebaIngreso.definitions;

import choucair.pruebaIngreso.steps.MainSteps;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import net.thucydides.core.annotations.Steps;

public class MainDefinition {
	@Steps
	MainSteps stepsMain;
	
	@Given("^I want to write a step with \"([^\"]*)\"$")
	public void iWantToWriteAStepWith(String arg1) {
		stepsMain.ingresoAlNavegador();
	}
	
	@Then("^valido final \"([^\"]*)\" \"([^\"]*)\"$")
	public void validoFinal(String arg1, String arg2) {
	    
	}
	

}
