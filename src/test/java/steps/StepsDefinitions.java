
package steps;

import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Entonces;
import org.testng.Assert;
import pages.AboutUsPage;
import pages.HomePage;

public class StepsDefinitions {
    private HomePage homePage = new HomePage(hooks.driver);
    private AboutUsPage aboutUsPage = new AboutUsPage(hooks.driver);
    String result = "";

    @Dado("que el usuario navega al menu SobreNosotros")
    public void que_el_usuario_navega_al_menu_SobreNosotros() {
        homePage.browseAboutUsPage();
    }

    @Cuando("responde a la pregunta sobre el cambio de pensamiento sobre jesus")
    public void responde_a_la_pregunta_sobre_el_cambio_de_pensamiento_sobre_jesus() {
        aboutUsPage.answerJesusQuestion();
        aboutUsPage.fillForm();
        result = aboutUsPage.submitStory();
    }

    @Entonces("el sistema permite compartir MiHistoria")
    public void el_sistema_permite_compartir_MiHistoria() {
        Assert.assertEquals(result, "Your feedback has been submitted successfully.");
    }
}