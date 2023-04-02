package com.saucedemo.main.steps;

import com.saucedemo.main.pages.PrincipalPage;
import com.saucedemo.main.pages.productPage;
import net.thucydides.core.annotations.ManagedPages;
import net.thucydides.core.annotations.Step;
import org.junit.Assert;

public class GeneralSteps {
    @ManagedPages
    PrincipalPage principalPage;
    @ManagedPages
    productPage productPage;

    @Step
    public void abrirPagina()
    {
        principalPage.open();
    }

    @Step
    public void validarInicioSesion()
    {
        Assert.assertEquals("El inicio de sesion tiene texto esperado","Swag Labs",principalPage.obtenernombreInicio());
        String nombreInicio = principalPage.obtenernombreInicio();
        if(!"Swag Labs".equals(nombreInicio))
        {
            throw new IllegalStateException("el inicio es incorrecto");
        }
    }

    @Step
    public void IniciarSesion(String value, String value2)
    {
        value ="standard_user";
        value2="secret_sauce";
        principalPage.login(value,value2);

    }
    @Step
    public void validarVistaProductos()
    {
        Assert.assertEquals("inico de la vista de productos","Products",principalPage.obtenernombreVistaProducto());
        String nombreInicioProductos = principalPage.obtenernombreVistaProducto();
        if(!"Products".equals(nombreInicioProductos))
        {
            throw new IllegalStateException("vista de productos incorrecto"+nombreInicioProductos);
        }
    }

    //segundo escenario
    @Step
    public void seleccionarProducto1(String value1)
    {
        if("Sauce Labs Backpack".equals(value1)){
            principalPage.selectProduct1(value1);
        } else if ("Sauce Labs Bike Light".equals(value1)) {
            principalPage.selectProduct2();
        }
        else{
            principalPage.selectProduct3();
        }
    }
    @Step
    public void agregarProducto(String value1)
    {
        if("Sauce Labs Backpack".equals(value1)){
            productPage.addCartProduct1(value1);
        } else if ("Sauce Labs Bike Light".equals(value1)) {
            principalPage.addCartProduct2();
        }
        else{
            principalPage.addCartProduct3();
        }
    }

}
