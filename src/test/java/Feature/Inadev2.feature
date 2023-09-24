Feature: Update a ToDo task
  Scenario: I should be able to see a Update ToDo dialog box
    Given I am on http://localhost:3000/
    And I click on Pencil (Edit) icon
    Then I should see Update TODO dialog box

  Scenario: I should be able to update a ToDo
    Given I am on a Update TODO dialog box
    And I update the Title and Status
    And I click Update Task
    Then I should see the updated task on ToDo list home page