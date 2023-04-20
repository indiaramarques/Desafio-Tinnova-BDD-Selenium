package steps;

import actions.AdicaoAction;
import actions.EntrarAction;
import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Então;
import cucumber.api.java.pt.Quando;
import pages.Home;

public class DesafioBddSteps {

    private Home home = new Home();

    @Dado("que estou na home page da tinnova")
    public void queEstouNaHomePageDaTinnova() {
        home.acessarAplicacao();
    }

    @Quando("clico em Entrar")
    public void clico_em_entrar() {
        EntrarAction.botaoEntrar();
    }

    @Quando("clico em Adicionar")
    public void clico_em_adicionar(){
        EntrarAction.botaoAdicionar();
    }

    @Quando("preencho o campo Nome completo {string}")
    public void preencho_o_campo_nome_completo(String nome) {
        AdicaoAction.fillName(nome);
    }

    @Quando("preencho o campo E-mail {string}")
    public void preencho_o_campo_e_mail(String email) {
        AdicaoAction.fillEmail(email);
    }

    @Quando("preencho o campo CPF {string}")
    public void preencho_o_campo_cpf(String CPF) {
        AdicaoAction.fillCPF(CPF);
    }

    @Quando("preencho o campo Telefone {string}")
    public void preencho_o_campo_telefone(String Telefone) { AdicaoAction.fillTelefone(Telefone);
    }

    @Então("clico em GUARDAR")
    public void clico_em_guardar() { EntrarAction.botaoGuardar(); }
}
