package com.cu.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.cu.base.BaseClass;

public class IndexPage extends BaseClass {

	@FindBy(xpath = "//a[text()='Home']")
	@CacheLookup
	private WebElement homeMenu;

	@FindBy(xpath = "//a[text()='About']")
	@CacheLookup
	private WebElement aboutMenu;

	@FindBy(xpath = "//a[text()='Students']")
	@CacheLookup
	private WebElement studentsMenu;

	@FindBy(xpath = "//a[text()='Courses']")
	@CacheLookup
	private WebElement coursesMenu;

	@FindBy(xpath = "//a[text()='Instructors']")
	@CacheLookup
	private WebElement instructorsMenu;

	@FindBy(xpath = "//a[text()='Departments']")
	@CacheLookup
	private WebElement departmentsMenu;

	@FindBy(xpath = "//h1[text()='Contoso University']")
	@CacheLookup
	private WebElement contosoUniversityText;

	public IndexPage() {
		PageFactory.initElements(driver, this);
	}

	public String getContosoUniversityText() {
		return contosoUniversityText.getText();
	}

}
