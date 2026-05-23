# TechQAsenior - Test Automation Framework

Este repositorio contiene la suite de pruebas automatizadas para la plataforma, enfocada en la validación de flujos clave de usuario como el envío de historias en la sección de "Sobre Nosotros". El framework está diseñado bajo una arquitectura sólida, escalable y mantenible, mitigando por completo la inestabilidad (*flakiness*) mediante localizadores semánticos y esperas dinámicas.

## 🚀 Pruebas
*   **Prueba funcional de envio de mi historia personal, a traves de la pagina "sobre nosotros", validando distintas consideraciones de distintos tipos de usuarios y datos.**
*   **Usando Cucumber y el metodo "Esquema del escenario", se define una misma prueba que puede recibir distintos tipos de entradas.**

## 🚀 Tecnologías y Herramientas

*   **Lenguaje de Programación:** Java 17
*   **Framework de Automatización:** Selenium WebDriver (v4.44.0)
*   **Enfoque de Pruebas:** BDD (Behavior-Driven Development) con **Cucumber**
*   **Orquestador de Pruebas:** TestNG / JUnit
*   **Gestor de Dependencias:** Maven
*   **Reportes:** Allure Report
*   **Diseño de Arquitectura:** Page Object Model (POM) con Inyección de Dependencias (DI)

## 🏃 Ejecución de Pruebas y Reportes

Sigue estas indicaciones para ejecutar la suite e inspeccionar los resultados:

### 1. Comando de Pruebas: `mvn clean test`
Ejecuta la suite completa inyectando los datos del *Esquema del escenario*.
* **¿Qué hace?** Limpia el historial de la carpeta `target/`, compila los cambios recientes en Java y lanza Selenium.
* **Resultado exitoso:** La terminal debe finalizar con el mensaje `BUILD SUCCESS`.

### 2. Comando de Reportes: `allure serve target/allure-results`
Genera de forma dinámica la interfaz gráfica con las métricas de la ejecución.
* **¿Qué hace?** Lee los resultados en bruto, levanta un servidor web local temporal en tu Mac y abre el reporte automáticamente en el navegador.
* **Nota clave:** La terminal se quedará bloqueada manteniendo vivo el servidor. Para cerrarlo y liberar la consola, presiona `Ctrl + C`.

## 🏗️ Arquitectura del Proyecto

El proyecto sigue el patrón **Page Object Model (POM)**, separando la lógica de la interacción con las páginas de la definición de los pasos del negocio:

```text
src/test/java/
├── features/            # Escenarios de negocio escritos en Gherkin (.feature)
├── pages/               # Clases Page Object (Lógica e interacción con el DOM)
│   ├── BasePage.java
│   └── AboutUsPage.java
└── steps/               # Step Definitions (Mapeo de los pasos de Gherkin a Java)
    └── StepsDefinitions.java