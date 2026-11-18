import java.util.Scanner;

public class DanielOrts04 { 
    public static void main(String[] args)  {
       /**Es posa Scanner per a que s'agafin els valors que introduieix l'usuari */
        Scanner input = new Scanner(System.in);
      /**Introduim totes les variables */

       int segons, min, hora, dia, segonsRestants;
      

       /**Es posan tots el calculs per calcular els dies, hores, minuts i segons restants que hi ha a partir
        * dels segons posats per l'usuari        */
        System.out.printf("Escribe una cantidad de segundos: ");
       segons = input.nextInt();
       dia = segons / 86400;
       segons = segons % 86400;
       hora = segons / 3600;
       segons = segons % 3600;
       min = segons / 60;
       segonsRestants = segons % 60;


        System.out.printf("En %d segons n'hi ha %d dies, %d hores, %d minuts i %d segons",segons, dia, hora, min, segonsRestants);
    }
}