import java.util.Scanner;

public class DanielOrts3011 { 
    public static void main(String[] args)  {
       /**Posem Scanner per a que s'agafin els valors de l'usuari i introduim les variables */
        Scanner input = new Scanner(System.in);
       /**fem que l'usari escrigui una quantitat de minuts */
      int minutos;
      double movimoon, earthel, antena;
      System.out.printf("Escribe una cantidad de minutos: ");
      minutos = input.nextInt();
        
      movimoon = 5 + minutos * 0.45;
        /**Aqui posem formulas per calcular quin es el cost de cada companyia per una quantitat de minuts donada per l'usuari */
     if ( minutos <= 40){
         earthel = 5 + minutos * 0.49;
        }
         else if ( minutos > 40 && minutos <= 120){
         earthel = 5 + minutos * 0.33;
         } else {
          earthel = 5 + minutos * 0.20;
         }
      if (minutos <= 30){
          antena = 5 + minutos * 0.60;
          
        } else if (minutos > 30 && 30 <= 50){
          antena = 5 + minutos * 0.25;
          
        } else  {
          antena = 5 + minutos * 0.10;
        }
        System.out.printf(" La cuota de la companyia MOVIMOON, serán: %.2f euros", movimoon);
        System.out.printf("La cuota de la companyia EARTHEL, serán: %.2f euros", earthel);
        System.out.printf(" La cuota de la companyia ANTENA, serán: %.2f euros", antena);
    }
}