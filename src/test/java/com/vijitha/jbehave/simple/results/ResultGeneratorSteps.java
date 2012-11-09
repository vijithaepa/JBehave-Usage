package com.vijitha.jbehave.simple.results;

import junit.framework.Assert;

import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Named;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;
import org.jbehave.core.embedder.Embedder;

/**
 * Behavioural testing steps of the stories defined in
 * result_generator_story.story.
 * 
 * @author Vijitha Epa
 * 
 */
public class ResultGeneratorSteps extends Embedder{

	private ResultGenerator resultCalculator;
	private String actualResult;

	@Given("a result with marks <computer>, <phy>, <chem> for subjects")
	public void ctreateResult(@Named("computer") int com, @Named("phy") int phy, @Named("chem") int chem) {
		resultCalculator = new ResultGenerator(com, phy, chem);
	}

	@When("calculate result")
	public void calculateResult() {
		actualResult = resultCalculator.getResult();
	}

	@Then("result should be <result> for scenario <scenario>")
	public void assertResult(@Named("result") String result) {
		Assert.assertEquals(result, actualResult);
	}

}
