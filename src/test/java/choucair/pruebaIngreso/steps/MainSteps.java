package choucair.pruebaIngreso.steps;

import choucair.pruebaIngreso.pageObjects.MainPageObject;

public class MainSteps {
	
	MainPageObject pageObjeMainPageObject;
	
	public void ingresoAlNavegador() {
		pageObjeMainPageObject.open();
		pageObjeMainPageObject.getDriver().manage().window().maximize();
		pageObjeMainPageObject.waitFor(1).seconds();
	}

}
