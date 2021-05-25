#Author: Jayashree Eswaran
#Scenario Outline: Todos task list
@todoslist @delete @positiveflow
Feature: Delete task from the list 
  I want to delete my task from the list

  Scenario: Successfully deleted the task from the list
    Given i am on "https://todomvc.com/examples/angular2/"
    When i enter the following task in list
      | Shopping |
      | Cooking  |
      | Cleaning |
    Then i delete one particualr task in the list
    And i should not see the deleted task in the list
