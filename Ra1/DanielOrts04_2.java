import java.util.Scanner;

public class SumaEnters { 
    public static void main(String[] args)  {
        /**Es posa Scanner per llegir el que posa l'usuari que en aquest cas son dos nombres amb decimals */
        Scanner input = new Scanner(System.in);
    

        double num1, num2, res;


        System.out.printf("Escribe dos numeros reales: ");
        num1 = input.nextDouble();
        num2 = input.nextDouble();
        /**Una vegada tenim els nombres enters el programa fa la divisió per obtenir el resultat */


        res = (num1 / num2);


        System.out.printf("El resultado de %f entre %f = %.2f", num1, num2, res);
    }
}