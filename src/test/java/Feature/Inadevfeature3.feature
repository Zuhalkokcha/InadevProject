Feature: Delete a ToDo task
  Scenario: I should be deleta a ToDo
    Given I am on http://localhost:3000/
    And I click on delete icon
    Then I should see the corresponding task getting deleted