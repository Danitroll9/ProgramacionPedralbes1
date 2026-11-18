import java.util.Scanner;

public class DanielOrts301 { 
    public static void main(String[] args)  {
       /**Posem Scanner per a que s'agafin els valors de l'usuari i introduim les variables */
        Scanner input = new Scanner(System.in);
       /**fem que l'usari escrigui un nombre parell i un senar */
      int num1, num2;
        System.out.printf("Escriu un nombre par i un senar:");
        num1 = input.nextInt();
        num2 = input.nextInt();
      /**Posem que si el primer nombre es par i el segon es senar, posi un altre condicio dient que si el doble del senar es igual al par que digui que es el doble i sino no ho es   */
      if (num1 % 2 == 0 ) {
        if (num2 * 2 == num1 ) {
        System.out.printf("El nombre %d es el doble de %d ", num1, num2);
       } else if ( num2 * 2 != num1)  {
        System.out.printf("El nombre %d no es el doble de %d ", num1, num2);
       }
      }else {
        System.out.printf("No s'han introduit correctament els valors");
      }
    }
  }