package com.vijitha.jbehave.simple.calc;

import java.util.List;

import junit.framework.Assert;

import org.jbehave.core.annotations.BeforeStories;
import org.jbehave.core.annotations.Given;
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
 * This is behave as a Story itself and do the behaviour driven testing.
 * 
 * @author Vijitha Epa
 * 
 */
public class CalculatorScenario extends JUnitStory {

	private int x;
	private int y;
	private static Calculator calculator;// = new Calculator();

	@BeforeStories
	public static void setUp() {
		if (null == calculator)
			calculator = new Calculator();
	}

	@Given("input values $x , $y")
	public void setValues(int x, int y) {
		this.x = x;
		this.y = y;
	}

	@When("do add function")
	public void doAddFuntion() {
		calculator.addNumbers(x, y);
	}

	@When("do subtract function")
	public void dosubtractFuntion() {
		calculator.subtractNumbers(x, y);
	}

	@Then("result should be $result")
	public void validateResult(int result) {
		Assert.assertEquals(result, calculator.getResult());
	}

	@Override
	public Configuration configuration() {
		return new MostUsefulConfiguration().useStoryLoader(new LoadFromClasspath(getClass().getClassLoader())).useStoryReporterBuilder(
		                new StoryReporterBuilder().withFormats(Format.CONSOLE));
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
