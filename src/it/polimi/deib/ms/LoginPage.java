package it.polimi.deib.ms;

public class LoginPage {

    protected By usernameBy;
    protected By passwordBy;
    protected By logInBtnBy;

    public void setUsername(String username) {

        WebElement txtbxUserName = RunnerTest.driver.findElement(usernameBy);
        txtbxUserName.sendKeys(username);
    }

    public void setPassword(String password) {

        WebElement txtbxPassword = RunnerTest.driver.findElement(passwordBy);
        txtbxPassword.sendKeys(password);
    }

    public void clickBtnLogin() {

        WebElement btnLogIn = RunnerTest.driver.findElement(logInBtnBy);
        btnLogIn.click();
    }


    public void loginAction(String username, String password) {

        setUsername(username);
        setPassword(password);
        clickBtnLogin();
    };



}
