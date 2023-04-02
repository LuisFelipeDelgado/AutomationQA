package com.saucedemo.main.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.WebElement;

import java.util.Objects;
@DefaultUrl("https://www.saucedemo.com/")
public class productPage extends PageObject {

    @FindBy(xpath = "//*[@id=\"add-to-cart-sauce-labs-backpack\"]")
    private WebElement buttonProduct1;
    public void addCartProduct1(String value)
    {
        buttonProduct1.click();
    }
}
