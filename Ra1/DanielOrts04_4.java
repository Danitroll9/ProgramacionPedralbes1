import java.util.Scanner;

public class SumaEnters { 
    public static void main(String[] args)  {
        /**Es posa Scanner per llegir el que posa l'usuari que en aquest cas son un dividend enter i un divisor real */
        Scanner input = new Scanner(System.in);
    

        double num2, res;
        int num1;


        System.out.printf("Escribe dos numeros, uno entero y otro real: ");
        num1 = input.nextInt();
        num2 = input.nextDouble();
        /**Una vegada tenim els nombres enters el programa fa la divisió per obtenir el resultat */


        res = (num1 / num2);


        System.out.printf("El resultado de %d entre %f = %.2f", num1, num2, res);
    }
}