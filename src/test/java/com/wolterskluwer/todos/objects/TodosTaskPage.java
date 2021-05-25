package com.wolterskluwer.todos.objects;

import static com.wolterskluwer.todos.utils.TodosConstants.TODOS_URL;

import java.util.List;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.wolterskluwer.todos.steps.Hooks;

public class TodosTaskPage {

	private static Logger Log = Logger.getLogger(TodosTaskPage.class.getName());

	public TodosTaskPage() {
		PageFactory.initElements(Hooks.getDriver(), this);
	}

	@FindBy(how = How.XPATH, using = "/html/body/todo-app/section/header/input")
	private WebElement addTask;

	@FindBy(how = How.XPATH, using = "/html/body/todo-app/section/section/ul/li[1]/div/label")
	private WebElement editTask;

	@FindBy(how = How.XPATH, using = "/html/body/todo-app/section/section/ul/li[1]/div/input")
	private WebElement selectTask;

	@FindBy(how = How.CLASS_NAME, using = "destroy")
	private WebElement clearTask;

	@FindBy(how = How.XPATH, using = "/html/body/todo-app/section/footer/span/strong")
	private WebElement taskListCount;
	
	
	public void openURL(String url) {

		Hooks.getDriver().get(url);
		Hooks.getDriver().manage().window().maximize();
		Log.info("Browser Opened Successfully");
	}

	public void addTask(List<String> taskList) throws Exception {

		addTask.sendKeys(taskList.get(0));
		addTask.sendKeys(Keys.ENTER);

		Thread.sleep(2000);

		addTask.sendKeys(taskList.get(1));
		addTask.sendKeys(Keys.ENTER);

		Thread.sleep(2000);

		addTask.sendKeys(taskList.get(2));
		addTask.sendKeys(Keys.ENTER);

	}

	public void editTask() throws Exception {

		Actions action = new Actions(Hooks.getDriver());
		action.doubleClick(editTask).click().sendKeys("Laundry").sendKeys(Keys.ENTER).build().perform();
		Thread.sleep(2000);

	}

	public void addNewTaskToExisitingList(String task) throws Exception {

		addTask.sendKeys(task);
		addTask.sendKeys(Keys.ENTER);

		Thread.sleep(2000);

	}

	public void modifyTaskItem() throws Exception {

		Actions action = new Actions(Hooks.getDriver());
		action.doubleClick(editTask).click().sendKeys(Keys.DELETE).moveToElement(addTask).click().build().perform();
		Thread.sleep(2000);
	}

	public void deleteTask() throws Exception {
		
		Actions action = new Actions(Hooks.getDriver());
		action.moveToElement(editTask).click(selectTask).moveToElement(clearTask).click().perform();
		Thread.sleep(4000);
	}

	public boolean countTaskinList() {

		List<WebElement> items = Hooks.getDriver().findElements(By.xpath("/html/body/todo-app/section/section/ul/li"));
		{			
			if (items.size() == Integer.parseInt(taskListCount.getText())) {
				return true;
			}
			return false;
		}
	}
}

