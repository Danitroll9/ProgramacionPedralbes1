import java.util.Scanner;

public class DanielOrts07 { 
    public static void main(String[] args)  {
       /**Posem Scanner per a que s'agafin els valors de l'usuari i introduim les variables */
        Scanner input = new Scanner(System.in);
    
      int num, num1, num2, num3, numSum, numMult;
       
      
       /** Posem els calculs per agafar cada digit del valor proporcionat per l'usuari, els suma i els multiplica    */
        System.out.printf("Escribe un nombre entre 100 i 999: ");
        num = input.nextInt();
        num1 = num % 10;
        num2 = num % 100 / 10;
        num3 = num % 1000 / 100;
        numSum = num1 + num2 + num3;
        numMult = num1 * num2 * num3;
        

        System.out.printf("Si tenim el nombre %d, la suma dels seus digits sera %d i el seu producte sera %d",num, numSum, numMult);
    }
}