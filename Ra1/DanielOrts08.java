import java.util.Scanner;

public class DanielOrts04 { 
    public static void main(String[] args)  {
       /**Posem Scanner per a que s'agafin els valors de l'usuari i introduim les variables */
        Scanner input = new Scanner(System.in);
    
      double dist, kmLitre, preu, cost, res;
      
       
      
       /** Fem que l'usuari ens doni uns valors per despres fer un calcul    */
        System.out.printf("Escriu la distancia que vols recorrer: ");
        dist = input.nextDouble();
        System.out.printf("Escriu quants kilometres per litre fa el teu cotxe: ");
        kmLitre = input.nextDouble();
        System.out.printf("Escriu quin es el cost de la benzina: ");
        preu = input.nextDouble();
        res = dist / kmLitre * preu;

        System.out.printf("Per recorrer una distancia de %.2f, cost del teu viatje sera de %.2f euros.", dist, res );
    }
}