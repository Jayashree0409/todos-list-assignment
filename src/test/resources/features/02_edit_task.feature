#Author: Jayashree Eswaran
#Scenario Outline:Todos task list
@todoslist @edit @positiveflow
Feature: Change or add new item in task lists
  I want to change or add new task in list

  Scenario: Successfully modified the task in list
    Given i am on "https://todomvc.com/examples/angular2/"
    When i enter the following task in list
      | Shopping |
      | Cooking  |
      | Cleaning |
    Then i edit the item in list
    Then i add a new task "Buy Milk" in list
    And i should see the modified item
