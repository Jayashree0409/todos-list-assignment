package com.wolterskluwer.todos.steps;

import com.wolterskluwer.todos.objects.TodosTaskPage;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

public class EditTaskDef {
	

	private TodosTaskPage todoListObject;

	public EditTaskDef() {
		todoListObject = new TodosTaskPage();
	}

	
	@Then("i edit the item in list")
	public void i_edit_the_item_in_list() throws Exception {
		todoListObject.editTask();
		
		Thread.sleep(2000);
	}
	
	@Then("i add a new task {string} in list")
	public void i_add_a_new_task_in_list(String task) throws Exception {
		
		todoListObject.addNewTaskToExisitingList(task);
		
		Thread.sleep(2000);
	}

	@And("i should see the modified item")
	public void i_should_see_the_modified_item() throws Exception {
	
		Thread.sleep(1000);
	}
}
