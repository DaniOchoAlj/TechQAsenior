# language: es
Característica: Validar que puedo compartir mi historia sobre "Cambio de mi forma de pensar de Jesus?"

  @Smoke
  Escenario: Verificar que puedo compartir mi historia en la pantalla de SobreNosotros
    Dado que el usuario navega al menu SobreNosotros
    Cuando responde a la pregunta sobre el cambio de pensamiento sobre jesus
    Entonces el sistema permite compartir MiHistoria
