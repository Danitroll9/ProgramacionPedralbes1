import java.util.Scanner;

public class DanielOrts3012 { 
    public static void main(String[] args)  {
       /**Posem Scanner per a que s'agafin els valors de l'usuari i introduim les variables */
        Scanner input = new Scanner(System.in);
       /**fem que l'usari escrigui un valor entre el 10 i el 99 despres que es generes un valor aleatori entre aquells nombres */
      int numRandom, numUser;
      numRandom =(int) (Math.random() * 90 + 10);
      System.out.printf("%d", numRandom);
      System.out.printf("Escribe un numero entre el 10 y el 99: ");
      numUser = input.nextInt();
      
      /**Aque posem els if per cada opcio de premi i per si no guanyas res i les sever formules */
      if (numUser == numRandom)
      {
        System.out.printf(" Has ganado el premio gordo, ir una semana a las Islas de la Palma ");
      }
      else if (numUser % 10 == numRandom / 10 && numUser / 10 == numRandom % 10)
      {
        System.out.printf(" Has ganado el segundo premio, una cena en un restaurante lujoso de la ciudad ");
      }
      else if ( numUser % 10 == numRandom % 10 || numUser / 10 == numRandom / 10 || numUser % 10 == numRandom / 10 || numUser / 10 == numRandom % 10)
      {
        System.out.printf(" Has ganado el premio de consolacion por acertar un numero, el premio es una guia de viaje ");
      }
      else
      {
        System.out.printf(" No has ganado nada " );
      } 
    }
}