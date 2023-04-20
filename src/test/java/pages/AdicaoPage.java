package pages;

import org.openqa.selenium.By;

public class AdicaoPage extends BasePage{

    public By txtName = By.xpath("//*[@id=\"root\"]/div/div[2]/input");

    public By txtEmail = By.xpath("//*[@id=\"root\"]/div/div[3]/input");

    public By txtCPF = By.xpath("//*[@id=\"root\"]/div/div[4]/input");

    public By txtTelefone= By.xpath("//*[@id=\"root\"]/div/div[5]/input");

    public By bntGuardar= By.xpath("//*[@id=\"root\"]/div/div[6]");
}

