import java.util.Scanner;

public class DanielOrts301 { 
    public static void main(String[] args)  {
       /**Posem Scanner per a que s'agafin els valors de l'usuari i introduim les variables */
        Scanner input = new Scanner(System.in);
       /**fem que l'usari escrigui un nombre parell o senar */
      int num1;
        System.out.printf("Escriu un nombre par o senar:");
        num1 = input.nextInt();
       
      /**Posem que si  residu de dividir el nombre entre 2 és 0 digui
       *  que es parell i que sino ho es que posi que es senar      */
       if (num1 % 2 == 0) {
        System.out.printf("El nombre %d es parell", num1);
       } else {
        System.out.printf("El nombre %d es senar", num1);
       } 
    }
}