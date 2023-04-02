package com.saucedemo.main.definitions;

import com.saucedemo.main.steps.GeneralSteps;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;

public class GeneralDefinitions {

    @Steps
    GeneralSteps generalSteps;
    @Given("que un usuario visita la pagina principal")
    public void queUnUsuarioVisitaLaPaginaPrincipal() throws InterruptedException {
        // Write code here that turns the phrase above into concrete actions
        generalSteps.abrirPagina();
        Thread.sleep(3000L);
    }
    @Given("que estoy en la pagina de inicio de sesion")
    public void queEstoyEnLaPaginaDeInicioDeSesion() throws InterruptedException {
        // Write code here that turns the phrase above into concrete actions
        generalSteps.validarInicioSesion();
        Thread.sleep(3000L);
    }
    @When("ingreso mi nombre de usuario {string} y mi contrasena {string}")
    public void ingresoMiNombreDeUsuarioYMiContrasena(String string, String string2) throws InterruptedException {
        // Write code here that turns the phrase above into concrete actions
        generalSteps.IniciarSesion(string,string2);
        Thread.sleep(5000L);
    }

    @Then("veo la pagina de productos")
    public void veoLaPaginaDeProductos() throws InterruptedException {
        // Write code here that turns the phrase above into concrete actions
        generalSteps.validarVistaProductos();
        Thread.sleep(3000L);
    }

    //segundo escenario

    @Given("ingreso mi usuario {string} y mi contrasena {string}")
    public void ingresoMiUsuarioYMiContrasena(String string, String string2) throws InterruptedException {
        // Write code here that turns the phrase above into concrete actions
        generalSteps.IniciarSesion(string,string2);
        Thread.sleep(5000L);
    }
    @Given("que estoy en la pagina de productos")
    public void queEstoyEnLaPaginaDeProductos() throws InterruptedException {
        generalSteps.validarVistaProductos();
        Thread.sleep(3000L);
    }
    /*@Given("he iniciado sesion con exito")
    public void heIniciadoSesionConExito() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }*/
    @When("selecciono el producto {string} de la lista")
    public void seleccionoElProductoDeLaLista(String string)throws InterruptedException {
        // Write code here that turns the phrase above into concrete actions

        generalSteps.seleccionarProducto1(string);
        Thread.sleep(3000L);
    }
    @When("presiono el boton de agregar al carrito {string}")
    public void presionoElBotonDeAgregarAlCarrito(String string)throws InterruptedException {
        // Write code here that turns the phrase above into concrete actions
        generalSteps.agregarProducto(string);
        Thread.sleep(3000L);
    }
    @Then("veo que el producto {string} fue agregado al carrito de compra")
    public void veoQueElProductoFueAgregadoAlCarritoDeCompra(String string)throws InterruptedException {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
}
