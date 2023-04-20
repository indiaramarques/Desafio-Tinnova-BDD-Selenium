package actions;

import pages.BasePage;
import pages.EntrarPage;

public class EntrarAction extends BasePage {

    public static EntrarPage entrarPage = new EntrarPage();

    public static void botaoEntrar(){
        delay(3000);
        click(entrarPage.btnEntrar);
    }

    public static void botaoAdicionar(){
        delay(3000);
        click(entrarPage.btnAdicionar);
    }

    public static void botaoGuardar() {
        delay(3000);
        click(entrarPage.btnGuardar);
    }
}
