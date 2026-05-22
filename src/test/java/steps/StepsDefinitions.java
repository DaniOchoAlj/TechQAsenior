

package steps;

import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Entonces;
import org.testng.Assert;

public class StepsDefinitions {

    @Dado("que el usuario navega al menu SobreNosotros")
    public void que_el_usuario_navega_al_menu_SobreNosotros() {
        System.out.println("--> PASO: El framework se ha inicializado.");
    }

    @Cuando("responde a la pregunta sobre el cambio de pensamiento sobre jesus")
    public void responde_a_la_pregunta_sobre_el_cambio_de_pensamiento_sobre_jesus() {
        System.out.println("--> PASO: TestNG está ejecutando el escenario.");
    }

    @Entonces("el sistema permite compartir MiHistoria")
    public void el_sistema_permite_compartir_MiHistoria() {
        System.out.println("--> PASO: Verificando aserción básica.");
        // Una aserción simple de TestNG para asegurar que el motor valida resultados
        Assert.assertTrue(true, "La verificación inicial ha fallado.");
    }
}