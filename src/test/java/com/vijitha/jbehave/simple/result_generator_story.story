Narrative: Calculate result for given marks
In order to check the results
As a User
I want to Calculate result for given marks

Scenario: get the result as pass
Given a result with marks <computer>, <phy>, <chem> for subjects
When calculate result
Then result should be <result> for scenario <scenario>

Examples:
|scenario|computer|phy|chem|result|
|1|70 |65 |80 |pass|
|2|45 |55 |35 |fail|
