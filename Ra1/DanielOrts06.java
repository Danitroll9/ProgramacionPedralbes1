import java.util.Scanner;

public class DanielOrts06 { 
    public static void main(String[] args)  {
       /**Posem Scanner per a que s'agafin els valors de l'usuari i introduim les variables */
        Scanner input = new Scanner(System.in);
    
      double km, milla;
       
      
       /** Posem el calcul per calcular els kilòmetres segons les milles donadas per l'usuari       */
        System.out.printf("Escribe un nombre determinat de milles: ");
        milla = input.nextDouble();
        km = milla / 1.6;
    


        System.out.printf("Si tenim %.2f millas, tindrem %.2f kilometres",milla, km);
    }
}