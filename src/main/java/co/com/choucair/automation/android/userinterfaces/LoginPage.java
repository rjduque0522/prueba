package co.com.choucair.automation.android.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class LoginPage {
    public static final Target EMAIL_INPUT = Target.the("Ingresar email")
            .located(By.id("com.loginmodule.learning:id/textInputEditTextEmail"));

    public static final Target PASSWORD = Target.the("Ingresar contraseña")
            .located(By.id("com.loginmodule.learning:id/textInputEditTextPassword"));

    public static final Target LOGIN_BUTTON = Target.the("Login button")
            .located(By.id("com.loginmodule.learning:id/textInputEditTextPassword"));
}
