Feature: Create a ToDo task
  Scenario: I should be able to see a Add ToDo dialog box
    Given I am on http://localhost:3000/
    And I click on Add Task button
    Then I should see a dialog to add tasks 
    
  Scenario: I should be able to create a ToDo
    Given I am on a Add ToDo dialog box
    And I provide Title and Status
    And I click Add Task
    Then I should see that task on ToDo list home page