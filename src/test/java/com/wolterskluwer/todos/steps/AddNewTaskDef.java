package com.wolterskluwer.todos.steps;

import java.util.List;

import com.wolterskluwer.todos.objects.TodosTaskPage;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AddNewTaskDef {
	

	private TodosTaskPage todoListObject;

	public AddNewTaskDef() {
		todoListObject = new TodosTaskPage();
	}

	@Given("i am on {string}")
	public void i_am_on(String url) throws Exception {
		todoListObject.openURL(url);
		Thread.sleep(1000);
	}
	
	@When("i enter the following task in list")
	public void i_enter_the_following_task_in_list(DataTable data) throws Exception {
		
		List<String> taskList = data.asList();
		
		todoListObject.addTask(taskList);
		
	}

	@Then("i should see the newly added item in list")
	public void i_should_see_the_newly_added_item_in_list() throws Exception {

		Thread.sleep(2000);
	}
}
