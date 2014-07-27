package com.owler.ui.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by kumaran on 7/26/14.
 */
public class HomePage {

  private WebDriver driver;

  private final String LOGINLINK=".//*[@id='loginLink']";
  private final String EMAIL=".//*[@id='emailSignIn']";
  private final String PASSWORD=".//*[@id='passwordSignIn']";
  private final String SUBMITBUTTON=".//*[@id='signInSubmit']";
  private final String CLOSEBUTTON=".//*[@class='close-popup']";



    @FindBy(id = LOGINLINK)
    private WebElement loginLink;

    @FindBy(id = EMAIL)
    private WebElement emailSignIn;

    @FindBy(id = PASSWORD)
    private WebElement passwordSignIn;

    @FindBy(id = SUBMITBUTTON)
    private WebElement signInSubmit;

    @FindBy(id = CLOSEBUTTON)
    private WebElement  closeButton;





    public  HomePage(WebDriver driver)
    {
        this.driver=driver;
        
    }


    public HomePage clickLoginLink()
    {
        loginLink.click();
        return PageFactory.initElements(driver,HomePage.class);
    }

    public void setEmail(String email)
    {
        emailSignIn.click();
        emailSignIn.clear();
        emailSignIn.sendKeys(email);
    }


    public void setPassword(String password)
    {
        passwordSignIn.click();
        passwordSignIn.clear();
        passwordSignIn.sendKeys(password);
    }


    public void clickSubmitButton()
    {
        signInSubmit.click();
        //return dashboard
    }


    public HomePage closePOP()
    {
        closeButton.click();
        return PageFactory.initElements(driver,HomePage.class);

    }

    public boolean isPopUpDisplayed()
    {
       return closeButton.isDisplayed();
    }


}
