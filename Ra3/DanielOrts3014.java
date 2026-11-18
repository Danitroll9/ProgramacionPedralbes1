import java.util.Scanner;

public class DanielOrts3014 { 
    public static void main(String[] args)  {
       /**Posem Scanner per a que s'agafin els valors de l'usuari i introduim les variables */
        Scanner input = new Scanner(System.in);
       /**fem que l'usari escrigui 5 valors */
      double temp, kelvin, fah, rank, reau;
      int sistema;
      System.out.printf("Ecribe una temperatura en grados celsius: ");    
      temp = input.nextDouble(); 
      System.out.printf(" 1. Kelvin  ");
      System.out.printf(" 2. Fahrenheit  ");
      System.out.printf(" 3. Rankine  ");
      System.out.printf(" 4. Reaumur  ");
      System.out.printf(" Elige una opcion ");
      sistema = input.nextInt();
        kelvin = 273.15 + temp;
        fah = (9.0 /5) * temp + 32;
        rank = (9.0/5) * temp + 491.67;
        reau = (4.0/5) * temp;
      switch (sistema) {
            case 1:
              temp = kelvin;
                System.out.printf(" Aquests graus en Kelvin son %.2f ", temp);
                break;
            case 2:
                temp = fah;
                System.out.printf(" Aquests graus en Fahrenheit son %.2f ", temp);
                break;
            case 3:
                temp = rank;
                System.out.printf(" Aquests graus en Rankine son %.2f ", temp);
                break;
            case 4:
                temp = reau;
                System.out.printf(" Aquests graus en Reaumur son %.2f ", temp);
                break;
        
      }
      
    }
}