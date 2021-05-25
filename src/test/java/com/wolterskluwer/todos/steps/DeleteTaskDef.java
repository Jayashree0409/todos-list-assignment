package com.wolterskluwer.todos.steps;

import com.wolterskluwer.todos.objects.TodosTaskPage;

import io.cucumber.java.en.*;


public class DeleteTaskDef {


	private TodosTaskPage todoListObject;

	public DeleteTaskDef() {
		todoListObject = new TodosTaskPage();
	}
	
	@Then("i delete one particualr task in the list")
	public void i_delete_one_particualr_task_in_the_list() throws Exception {
		todoListObject.deleteTask();
		
		Thread.sleep(4000);
	}

	@And("i should not see the deleted task in the list")
	public void i_should_not_see_the_deleted_task_in_the_list() throws Exception {

		Thread.sleep(3000);
	}
	
}
