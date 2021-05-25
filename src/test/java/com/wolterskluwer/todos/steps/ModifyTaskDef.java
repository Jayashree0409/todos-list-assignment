package com.wolterskluwer.todos.steps;

import com.wolterskluwer.todos.objects.TodosTaskPage;

import io.cucumber.java.en.Then;

public class ModifyTaskDef {
	
	private TodosTaskPage todoListObject;

	public ModifyTaskDef() {
		todoListObject = new TodosTaskPage();
	}

	
	@Then("i edit the item in list with null value")
	public void i_edit_the_item_in_list_with_null_value() throws Exception {
		todoListObject.modifyTaskItem();
		
		Thread.sleep(4000);
	}

}
