#Author: Jayashree Eswaran
#Scenario Outline: Todos task list
@todoslist @add @positiveflow
Feature: Add new task item into list
  I want to add my task list into the todos

  Scenario: Successfully add the task into the list
    Given i am on "https://todomvc.com/examples/angular2/"
    When i enter the following task in list
      | Shopping |
      | Cooking  |
      | Cleaning |
    Then i should see the newly added item in list
