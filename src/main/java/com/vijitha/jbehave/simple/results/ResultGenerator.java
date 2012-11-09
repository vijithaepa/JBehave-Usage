package com.vijitha.jbehave.simple.results;

/**
 * Calculate the result for given marks
 * 
 * @author Vijitha Epa
 * 
 */
public class ResultGenerator {

	private int computerScienceMarks;
	private int chemistryMarks;
	private int physicsMarks;

	public ResultGenerator(int com, int phy, int chem) {
		computerScienceMarks = com;
		chemistryMarks = chem;
		physicsMarks = phy;
	}

	/**
	 * @return 'pass' if average >50, else return 'fail'.
	 */
	public String getResult() {
		int average = (computerScienceMarks + chemistryMarks + physicsMarks) / 3;

		return average > 50 ? "pass" : "fail";
	}

}
