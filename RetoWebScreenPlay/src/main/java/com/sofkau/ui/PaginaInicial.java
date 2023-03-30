package com.sofkau.ui;

import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class PaginaInicial extends PageObject {
    public static final Target BOTON_USUARIO = Target.the("boton para desplegar formulario inicio sesion")
            .located(By.cssSelector("body.toolbar-nobg.ox-lazy.ox-messages-fixed.menu-style-4.menu--align-center.menu--align-sticky-center.minicart--style-modern.mobile-header--layout-2.footer--layout-3.header--layout-6.contacts-fullwidth.categories--fullwidth.tabs-style--minimal.minicart-btn--minimal.minicart--show-counter-mobile.sticky-simple.inputs-style--underlined.quickview-mobile--hide.cms-la_vaquita_home.cms-index-index.page-layout-1column:nth-child(2) div.page-wrapper:nth-child(4) div.page-header.header--layout-6.header__menu--position-1.ox-sticky:nth-child(1) div.sticky-wrapper div.container div.row div.col.header__content-wrapper div.header__content div.header__right.flex-row.modal__right div.header__item.header__item-account:nth-child(2) > a.button.js-item-myaccount-action"));
    public static final Target CAMPO_USUARIO = Target.the("campo usuario")
            .located(By.id("email"));
    public static final Target CAMPO_PASSWORD = Target.the("campo password")
            .located(By.xpath("//*[@id='pass'][@name='login[password]']"));
    public static final Target BOTON_INICIO_SESION = Target.the("boton inicio sesion")
            .located(By.id("send2"));
}
