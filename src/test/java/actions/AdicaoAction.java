package actions;

import pages.AdicaoPage;
import pages.BasePage;

public class AdicaoAction extends BasePage {

    public static AdicaoPage adicaoPage = new AdicaoPage();

    public static void fillName(String nome) {
        sendKeys(adicaoPage.txtName, nome);
    }

    public static void fillEmail(String email) {
        sendKeys(adicaoPage.txtEmail, email);
    }

    public static void fillCPF(String CPF) {
        sendKeys(adicaoPage.txtCPF, CPF);
    }

    public static void fillTelefone(String Telefone) {
        sendKeys(adicaoPage.txtTelefone, Telefone);
    }

    public static void fillGuardar() {
        click(adicaoPage.bntGuardar);
    }
}

