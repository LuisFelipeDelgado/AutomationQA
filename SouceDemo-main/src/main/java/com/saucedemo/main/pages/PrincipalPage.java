package com.saucedemo.main.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.WebElement;

import java.util.Objects;

@DefaultUrl("https://www.saucedemo.com/")
public class PrincipalPage extends PageObject {

    @FindBy(xpath = "//*[@id=\"root\"]/div/div[1]")
    private WebElement textoInicioSesion;

    @FindBy(xpath = "//*[@id=\"header_container\"]/div[2]/span")
    private WebElement textovistaProductos;

    @FindBy(xpath = "//*[@id=\"user-name\"]")
    private WebElement inputUser;
    @FindBy(xpath = "//*[@id=\"password\"]")
    private WebElement inputPass;
    @FindBy(xpath = "//*[@id=\"login-button\"]")
    private WebElement buttonInicio;

    //productos
    @FindBy(xpath = "//*[@id=\"item_4_title_link\"]/div")
    private WebElement productoNo1;
    @FindBy(xpath = "//*[@id=\"item_0_title_link\"]/div")
    private WebElement productoNo2;
    @FindBy(xpath = "//*[@id=\"item_1_title_link\"]/div")
    private WebElement productoNo3;

    @FindBy(xpath = "//*[@id=\"add-to-cart-sauce-labs-backpack\"]")
    private WebElement buttonProduct1;

    @FindBy(xpath = "//*[@id=\"add-to-cart-sauce-labs-bike-light\"]")
    private WebElement buttonProduct2;
    @FindBy(xpath = "//*[@id=\"add-to-cart-sauce-labs-bolt-t-shirt\"]")
    private WebElement buttonProduct3;
    public String obtenernombreInicio()
    {
        return textoInicioSesion.getText();
    }

    public String obtenernombreVistaProducto()
    {
        return textovistaProductos.getText();
    }
    public void login(String user, String pass)
    {
        inputUser.sendKeys(user);
        inputPass.sendKeys(pass);
        waitFor(buttonInicio).isClickable();
        buttonInicio.click();
    }

    public void selectProduct1(String value)
    {
        if(Objects.equals(value, productoNo1.getText()))
            System.out.println(productoNo1.getText());
        {
            waitFor(productoNo1).isClickable();
            productoNo1.click();
        }


    }
    public void selectProduct2()
    {
        waitFor(productoNo2).isClickable();
        productoNo2.click();
    }
    public void selectProduct3()
    {
        System.out.println(productoNo3.getText());
        System.out.println(buttonProduct3.getText());
        waitFor(productoNo3).isClickable();
        productoNo3.click();
    }
    public void addCartProduct1(String value)
    {
            buttonProduct1.click();
    }
    public void addCartProduct2()
    {
        buttonProduct2.click();
    }
    public void addCartProduct3()
    {
        buttonProduct3.click();
    }
}
