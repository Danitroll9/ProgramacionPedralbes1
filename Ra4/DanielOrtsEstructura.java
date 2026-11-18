import java.util.Scanner;

class DanielOrtsEstructura {
    public static void main(String[] args) {
        /**Aqui posem Scanner per a que el programa pugui agafar valors introduits per l'usuari */
        Scanner input = new Scanner(System.in);
        /**Introduim les variables */
        int resp;
        /**Empezamos el bucle con un do para que nos de las opciones del menu y hacemos que el usuario elija una */
        do
        {
        System.out.printf(" Elige una de estas opciones: ");
        System.out.printf(" 1-Pokemon ");
        System.out.printf(" 2-Hollow Knight ");
        System.out.printf(" 3-Castle Crashers ");
        System.out.printf(" 4-Salir ");
        resp = input.nextInt();
        /**dentro del bucle de do hacemos un bucle de while en caso de que el usuario ponga una opcion que no sea
         * valida, en ese caso volveria a dar opcion de elegir una opcion al usuario
         */
            while (resp < 1 || resp > 4)
            {
            System.out.printf( "Esa no es una respuesta valida, elige una entre 1 y 4 :");
            resp = input.nextInt();
            }
        /**Ponemos un switch para las opciones a elegir por el usuario y en caso de que no elija la opcion de salir
         * del programa, que se repita por si quiere elegir otra opcion
         */
        switch(resp)
        {
            case 1:
                System.out.printf(" Los Pokemon son criaturas ficticias de formas y tamanios muy diversos que poseen habilidades y poderes especiales (como lanzar fuego, electricidad o ataques psiquicos). En el universo de la franquicia, conviven con los seres humanos. Las personas que los capturan, cuidan y entrenan se denominan Entrenadores Pokemon, cuyo objetivo es viajar, ganar experiencia y participar en combates deportivos. Actualmente existen mas de 1.000 especies diferentes descubiertas. ");
                break;
            case 2:
                System.out.printf(" Hollow Knight es un aclamado videojuego independiente de accion y aventuras del genero metroidvania desarrollado por Team Cherry. Ambientado en el vasto y ruinino reino subterraneo de Hallownest, controlas a un pequenio caballero sin nombre que explora cavernas, combate insectos corrompidos y descubre una oscura y melancolica historia sobre una plaga llamada La Infeccion. ");
                break;
            case 3:
                System.out.printf(" Castle Crashers es un popular videojuego de accion en 2D de tipo beat 'em up y rol, desarrollado por The Behemoth. Permite jugar en modo cooperativo (hasta cuatro jugadores, en linea o local) para rescatar a cuatro princesas y recuperar un cristal magico tras ser robados por un malvado hechicero. ");    
                break;
            case 4:
                System.out.printf( "Has terminado de usar el programa");
                break;
        }
        } while (resp != 4);     
    }    
}