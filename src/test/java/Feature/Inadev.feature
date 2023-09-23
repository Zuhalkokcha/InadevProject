 Feature: First time user
  Scenario: I should see no ToDos
    Given I am on http://localhost:3000/ for the first time
    Then I should see No ToDos

   