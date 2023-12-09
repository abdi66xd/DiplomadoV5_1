package ui;

import org.openqa.selenium.By;

public class HomePageUI {
    public static By signButton = By.xpath("//img[@src='/Images/design/pagesignup.png']");
    public static By loginButton = By.xpath("//img[@src='/Images/design/pagelogin.png']");

    public static By fullName = By.xpath("//input[@id='ctl00_MainContent_SignupControl1_TextBoxFullName']");
    public static By email = By.xpath("//input[@id='ctl00_MainContent_SignupControl1_TextBoxEmail']");
    public static By password = By.xpath("(//input[@id='ctl00_MainContent_SignupControl1_TextBoxPassword'])[1]");

    public static By readCheck = By.xpath("(//input[@id='ctl00_MainContent_SignupControl1_CheckBoxTerms'])[1]");
    public static By signUpButton = By.xpath("(//input[@id='ctl00_MainContent_SignupControl1_ButtonSignup'])[1]");


}