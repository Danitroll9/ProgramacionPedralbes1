import java.util.Scanner;

public class DanielOrts301 { 
    public static void main(String[] args)  {
       /**Posem Scanner per a que s'agafin els valors de l'usuari i introduim les variables */
        Scanner input = new Scanner(System.in);
       /**fem que l'usari escrigui 3 valors, 1 per cada costat */
      double A, B, C;

      
     System.out.printf("Escriu un valor para el lado A del triangulo: ");
        A = input.nextDouble();
     System.out.printf("Escriu un valor para el lado B del triangulo: ");
        B = input.nextDouble();
     System.out.printf("Escriu un valor para el lado C del triangulo: ");
        C = input.nextDouble();
        //** Aqui fem que en cas de que es pugui fe un triangle amb aquests valors, digui si es equilater, isoscelenes, escale o no es pot fer */
        if ( A + B > C && A + C > B && B + C > A ){
          if ( A == B && B == C) {
            System.out.printf("El triangulo es un equilatero ");
          }else if ( A == B || A == C || B == C){
            System.out.printf("El triangulo es un isosceles ");
          } else if ( A != B && B != C) {
            System.out.printf("El triangulo es escaleno ");
          }
          else {
            System.out.printf("El triangulo no se puede hacer ");
            
         }
      }      
   }
 }