import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.testng.annotations.DataProvider;

@CucumberOptions(
        features = "src/test/java/features",
        glue = "steps",
        plugin = {
                "pretty",
                "io.qameta.allure.cucumber7jvm.AllureCucumber7Jvm"
        },
        // Salida de la consola sea limpia y legible
        monochrome = true,
        // Ignorar escenarios marcados como @Ignore
        tags = "not @Ignore"
)
public class TestRunner extends AbstractTestNGCucumberTests {
    @Override
    @DataProvider(parallel = false) // Cambia a 'true' cuando se quiere paralelismo
    public Object[][] scenarios() {
        return super.scenarios();
    }
}