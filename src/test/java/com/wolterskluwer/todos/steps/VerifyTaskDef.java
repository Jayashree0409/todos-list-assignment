package com.wolterskluwer.todos.steps;

import com.wolterskluwer.todos.objects.TodosTaskPage;

import io.cucumber.java.en.*;

public class VerifyTaskDef {
	
	private TodosTaskPage todoListObject;

	public VerifyTaskDef() {
		todoListObject = new TodosTaskPage();
	}
	
	@Then("i should see the list item count match with left item on list")
	public void i_should_see_the_list_item_count_match_with_left_item_on_list() throws Exception {
		todoListObject.countTaskinList();
		
		Thread.sleep(4000);
	}

}
