# TP-JUEGO-ESTRATEGIA

Actividad Obligatoria para el portafolio 2019 (ambos turnos)
Introducción:
Vamos a modelar y desarrollar las distintas unidades de un juego de estrategia.

Especificación: 
Del juego participan las siguientes Unidades:

Soldados
Arqueros
Lanceros
Caballeros


Reglas del juego:
Los soldados pueden atacar cuerpo a cuerpo a otras unidades si tienen suficiente energı́a. Cada ataque les consume 10 puntos de energı́a, y comienzan con 100. Restauran energı́a si reciben la poción de agua. Infringen un daño de 10 puntos y comienzan con 200 de salud.
Los Arqueros pueden atacar a una distancia de entre 2 y 5 respecto de su enemigo, y si tienen suficientes flechas. Comienzan con 20 flechas en su carcaj, y pueden recargar si reciben un paquete de seis flechas. Infringen un daño de 5 puntos, y comienzan con 50 de salud.
Los lanceros pueden atacar a una distancia de 1 a 3, sin condición. Infringen un daño de 25 puntos, y comienzan con 150 de salud.
Los caballeros pueden atacar a una distancia de 1 a 2, siempre que su caballo no se haya puesto rebelde. Infringe un daño de 50 puntos y comienza con 200 de salud. Un caballo se pone rebelde luego de 3 ataques, y puede calmarse si recibe una poción de agua.
Ninguna unidad muerta pueda atacar, por supuesto.
Se debe probar cada aspecto de la definición, y simular encuentros entre las unidades.

 4. Entrega: La presente actividad se realizará de manera grupal en equipos de 4 integrantes. Todos los integrantes del equipo deben conocer de manera completa cualquier aspecto de la mismo, ya que serán evaluados al momento de la entrega.
Se deberán subir al portafolio del equipo los siguientes elementos:

Diagrama de clases: 
Código java. 
Casos de prueba exhaustivos con JUnit 
