package com.vijitha.jbehave.simple;

import java.util.List;

import org.jbehave.core.configuration.Configuration;
import org.jbehave.core.configuration.MostUsefulConfiguration;
import org.jbehave.core.io.LoadFromClasspath;
import org.jbehave.core.junit.JUnitStory;
import org.jbehave.core.reporters.Format;
import org.jbehave.core.reporters.StoryReporterBuilder;
import org.jbehave.core.steps.CandidateSteps;
import org.jbehave.core.steps.InstanceStepsFactory;

import com.vijitha.jbehave.simple.results.ResultGenerator;
import com.vijitha.jbehave.simple.results.ResultGeneratorSteps;

/**
 * Behavioural story testing class for {@link ResultGenerator}
 * 
 * @author Vijitha Epa
 * 
 */
public class ResultGeneratorStory extends JUnitStory {

	// Here we specify the configuration, starting from default
	// MostUsefulConfiguration, and changing only what is needed
	@Override
	public Configuration configuration() {

		return new MostUsefulConfiguration()
		// where to find the stories
		                .useStoryLoader(new LoadFromClasspath(this.getClass()))
		                // CONSOLE and TXT reporting
		                .useStoryReporterBuilder(new StoryReporterBuilder().withDefaultFormats().withFormats(Format.CONSOLE, Format.TXT));
	}

	// Here we specify the steps classes
	@Override
	public List<CandidateSteps> candidateSteps() {
		// can have more that one steps classes
		return new InstanceStepsFactory(configuration(), new ResultGeneratorSteps()).createCandidateSteps();
	}
}
