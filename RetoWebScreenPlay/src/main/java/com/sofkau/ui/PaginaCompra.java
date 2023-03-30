package com.sofkau.ui;

import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class PaginaCompra extends PageObject {
    public static final Target CATEGORIA_PRODUCTO = Target.the("categoria producto")
            .located(By.xpath("//span[@class='name' and text()='Lácteos, Huevos y Refrigerados']//ancestor::a[@class='level-top']"));
}
