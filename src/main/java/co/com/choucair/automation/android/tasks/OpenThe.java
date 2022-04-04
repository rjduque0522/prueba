package co.com.choucair.automation.android.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

import static co.com.choucair.automation.android.userinterfaces.ApplicationHomepage.LOGIN_BUTTON;


public class OpenThe implements Task {

    public static OpenThe wordpressApp() {
        return Tasks.instrumented(OpenThe.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(LOGIN_BUTTON));

    }
}
