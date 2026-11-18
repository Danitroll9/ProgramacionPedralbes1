import java.util.Scanner;

public class SumaEnters { 
    public static void main(String[] args)  {
        /**Es posa Scanner per llegir el que posa l'usuari que en aquest cas son un dividend real i un divisor enter */
        Scanner input = new Scanner(System.in);
    

        double num1, res;
        int num2;


        System.out.printf("Escribe dos numeros, uno real y otro entero: ");
        num1 = input.nextDouble();
        num2 = input.nextInt();
        /**Una vegada tenim els nombres enters el programa fa la divisió per obtenir el resultat */


        res = (num1 / num2);


        System.out.printf("El resultado de %f entre %d = %.2f", num1, num2, res);
    }
}