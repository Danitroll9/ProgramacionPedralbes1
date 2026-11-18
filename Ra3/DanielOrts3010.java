import java.util.Scanner;

public class DanielOrts3010 { 
    public static void main(String[] args)  {
       /**Posem Scanner per a que s'agafin els valors de l'usuari i introduim les variables */
        Scanner input = new Scanner(System.in);
       /**fem que l'usari escrigui 5 valors */
      int num1, num2, num3, num4, num5;
      
      System.out.printf("Escribe 5 numeros: ");     
        num1 = input.nextInt();
        num2 = input.nextInt();
        num3 = input.nextInt();
        num4 = input.nextInt();
        num5 = input.nextInt();
       int dist2 = Math.abs(num2 - num1);
       int dist3 = Math.abs(num3 - num1);
       int dist4 = Math.abs(num4 - num1);
       int dist5 = Math.abs(num5 - num1);
      /** Aqui posem per a que calculi quin es el valor mes proper al primer */
        if (dist2 <= dist3 && dist2 <= dist4 && dist2 <= dist5) {
            System.out.printf("El mas cercano es el %d", num2);
        } else if (dist3 <= dist4 && dist3 <= dist5) {
            System.out.printf("El mas cercano es el %d", num3);
        } else if (dist4 <= dist5) {
            System.out.printf("El mas cercano es el %d", num4);
        } else {
            System.out.printf("El mas cercano es el %d", num5);
    }
    }
}