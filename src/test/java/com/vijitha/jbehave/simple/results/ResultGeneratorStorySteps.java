package com.vijitha.jbehave.simple.results;

import java.util.List;

import junit.framework.Assert;

import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Named;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;
import org.jbehave.core.configuration.Configuration;
import org.jbehave.core.configuration.MostUsefulConfiguration;
import org.jbehave.core.io.LoadFromClasspath;
import org.jbehave.core.junit.JUnitStory;
import org.jbehave.core.reporters.Format;
import org.jbehave.core.reporters.StoryReporterBuilder;
import org.jbehave.core.steps.CandidateSteps;
import org.jbehave.core.steps.InstanceStepsFactory;
import org.junit.Test;

/**
 * Behavioural testing steps of the stories defined in
 * result_generator_story.story.
 * 
 * @author Vijitha Epa
 * 
 */
public class ResultGeneratorStorySteps extends JUnitStory {

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

	@Then("results should be <result> for scenario <scenario>")
	public void assertResult(@Named("result") String result) {
		Assert.assertEquals(result, actualResult);
	}

	@Override
	public Configuration configuration() {
		return new MostUsefulConfiguration().useStoryLoader(new LoadFromClasspath(getClass().getClassLoader())).useStoryReporterBuilder(
		                new StoryReporterBuilder().withDefaultFormats().withFormats(Format.CONSOLE, Format.TXT));
	}

	@Override
	public List<CandidateSteps> candidateSteps() {
		return new InstanceStepsFactory(configuration(), this).createCandidateSteps();
	}

	@Override
	@Test
	public void run() throws Throwable {
		super.run();
	}
}
