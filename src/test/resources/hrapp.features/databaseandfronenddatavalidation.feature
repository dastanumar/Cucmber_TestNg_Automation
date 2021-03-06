@hr
Feature: Hr Application Databaseand UI data verification

Background:
		Given I am on DepEmpPage
	

Scenario: Department data UI and Database verification
	When I search for department id 50
	And I query database with sql "SELECT department_name,manager_id,location_id from departments where department_id=50"
	Then UI data and Database data must match
	
Scenario: Firstname and lastname search by email-UI vs DB verification
	When I search for "JWHALEN" to see firstname and lastname
	And I query database with sql "SELECT first_name, last_name FROM employees WHERE email='JWHALEN'"
	Then UI data and Database data must match
	

Scenario Outline: Firstname and lastname search by email-UI vs DB verification
	When I search for email "<email>" to see firstname and lastname
	And I query database with sql "SELECT first_name, last_name FROM employees WHERE email='<email>'"
	Then UI data and Database data must match
	Examples:
	|eamil|
	|JWHALEN|
	|HBAER|
	|JRUSSEL|
	
Scenario Outline: Verify number of employees for departments-UI vs DB verification
When i search for department id <departmentID> and get number of employees
And I query database with sql "SELECT COUNT(*) FROM employees WHERE department_id=<departmentID>"
Then UI data and Database data must match
Examples:
|departmentID|
|10|
|20|
|30|
|40|
|50|
|60|	
	