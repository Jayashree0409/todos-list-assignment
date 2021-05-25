#Author: Jayashree Eswaran
#Scenario Outline: Todos task list
@todoslist @listverify @positiveflow
Feature: Verify task list match with left items in the list
  I want to verify whether my task list count match with the left items

  Scenario: Verify the list in the item match with the left items in list
    Given i am on "https://todomvc.com/examples/angular2/"
    When i enter the following task in list
      | Shopping |
      | Cooking  |
      | Cleaning |
    Then i should see the list item count match with left item on list
    