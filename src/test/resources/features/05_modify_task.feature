#Author: Jayashree Eswaran
#Scenario Outline:Todos task list
@todoslist @edit @negativeflow
Feature: Verify null values should not be accepted in the list 
  I want to change or add new task in list

  Scenario: Successfully modified the task in list
    Given i am on "https://todomvc.com/examples/angular2/"
    When i enter the following task in list
      | Shopping |
      | Cooking  |
      | Cleaning |
    Then i edit the item in list with null value
    And i should see the modified item