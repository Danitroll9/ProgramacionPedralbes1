import java.util.Scanner;

public class DanielOrts04 { 
    public static void main(String[] args)  {
       /**Posem Scanner per a que s'agafin els valors de l'usuari i introduim les variables */
        Scanner input = new Scanner(System.in);
    

       int segons, min, segonsRestants;
      

       /** Posem els calculs per a que en el resultat ens doni els minuts que hi ha en la quantitat de segons donats per l'usuari
        * i el segons restants        */
        System.out.printf("Escribe una cantidad de segundos: ");
       segons = input.nextInt();
       min = segons / 60;
       segonsRestants = segons % 60;


        System.out.printf("En %d segons n'hi ha %d min i %d segons",segons, min, segonsRestants);
    }
}