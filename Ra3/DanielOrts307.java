import java.util.Scanner;

public class DanielOrts307 { 
    public static void main(String[] args)  {
       /**Posem Scanner per a que s'agafin els valors de l'usuari i introduim les variables */
        Scanner input = new Scanner(System.in);
       /**fem que l'usari escrigui un any entre un interval */
      int any;
        System.out.printf("Escribe un año que este entre 1700 y 2100: ");
        any = input.nextInt();
        
      /**Posem que la condicio de que si l'any no esta dintre del interval digui q es incorrecte i despres posem l'operacio per a que digui si es traspas o no  */
     if (any < 1700 || any > 2100) {
      System.out.printf(" El año %d es incorrecto ", any);
     }else{
      if (any % 4 == 0 && any % 100 != 0 || any % 400 == 0){
        System.out.printf(" El año %d es bisiesto ", any);
      }else{
        System.out.printf(" El año %d no es bisiesto ", any);
      }
     
     }
      
    }
}