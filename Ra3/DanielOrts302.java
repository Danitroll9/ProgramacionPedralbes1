import java.util.Scanner;

public class DanielOrts301 { 
    public static void main(String[] args)  {
       /**Posem Scanner per a que s'agafin els valors de l'usuari i introduim les variables */
        Scanner input = new Scanner(System.in);
       
        double anysTrue, anysGos;
       /**Fem que l'usuari escrigui una quantitat d'anys per un gos */
        System.out.printf("Escriu una determinada quantitat d'anys que pot tenir un gos:");
        anysGos = input.nextDouble();
         /** Aqui fem que si el nombre que l'usuari ha posat es major o igual a 2, es restin els primers 2 anys 
          * i que despres es multipliquin per 4        */
       if ( anysGos >= 2 ) {
           anysTrue = 21 + 4 * (anysGos - 2) ;
           System.out.printf("Aquest gos que te %.1f anys, te %.1f anys de gos", anysGos, anysTrue);
          }
         /** Auqi fem que si l'edat introduida esta es major que 0 i menor que 2 es multipliqui per 10,5 
          * com surt al'anunciat */
       if ( anysGos < 2 && anysGos > 0 ) {
        anysTrue = anysGos * 10.5 ;
        System.out.printf("Aquest gos que te %.2f anys, te %.2f anys de gos", anysGos, anysTrue);
       } 
       /** Aqui fem que si el valor es 0 o menor, o sigui negatiu, que digui que no ha nascut aquest gos */
       if ( anysGos <= 0) {
        System.out.printf("Aquest gos no ha nascut encara.");
       } 
    }
}