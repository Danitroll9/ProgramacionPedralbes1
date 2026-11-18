import java.util.Scanner;

public class DanielOrts04 { 
    public static void main(String[] args)  {
        /**Es posa Scanner per llegir el que posa l'usuari que en aquest cas son dos nombres enters */
        Scanner input = new Scanner(System.in);
    

       int num1, num2, res;


        System.out.printf("Escribe dos numeros enteros: ");
        num1 = input.nextInt();
        num2 = input.nextInt();
        /**Una vegada tenim els nombres enters el programa fa la divisió per obtenir el resultat */


        res = (num1 / num2);


        System.out.printf("El resultado de %d entre %d = %d", num1, num2, res);
    }
}