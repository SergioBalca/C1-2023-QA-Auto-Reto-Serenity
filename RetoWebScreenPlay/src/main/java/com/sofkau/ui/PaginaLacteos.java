package com.sofkau.ui;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class PaginaLacteos {
    public static final Target BEBIDAS_LACTEAS = Target.the("Bebidas lacteas")
            .located(By.xpath("//*[@class='label' and contains(text(), 'Bebidas L')]"));

    public static final Target ORDENAR_POR = Target.the("ordenar por")
            .located(By.className("js-toolbar-switch"));

    public static final Target PRECIO = Target.the("precio")
            .located(By.xpath("//*[@data-value='price' and contains(text(), 'Precio')]"));

    public static final Target DESCENDENTE = Target.the("descendente")
            .located(By.xpath("(//*[name()='polygon'])[1]"));

    public static final Target ELEGIR_PRODUCTO = Target.the("Elegir producto de mayor precio")
            .located(By.xpath("(//img[@class='product-image-photo'])[1]"));

}
