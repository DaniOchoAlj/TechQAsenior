# language: es
Característica: Validar que puedo compartir mi historia sobre "Cambio de mi forma de pensar de Jesus?"

  Esquema del escenario: Verificar que puedo compartir mi historia en la pantalla de SobreNosotros
    Dado que el usuario navega al menu SobreNosotros
    Cuando responde a la pregunta sobre el cambio de pensamiento sobre jesus "<Nombre>" "<Apellido>" "<Email>" "<Mensaje>"
    Entonces el sistema permite compartir MiHistoria

    Ejemplos:
    |Nombre|Apellido|Email|Mensaje|
    |Alvaro|Gonzalez|alvagon@hotmail.com|Hello world|
    |D@n13l|0ch0@|dan8a@latinmail.com|Hola mundo|
    |a|o|d@g.c|Solo datos erroneos|