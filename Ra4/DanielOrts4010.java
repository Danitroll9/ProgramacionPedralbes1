import java.util.Scanner;

class DanielOrts4011 {
    public static void main(String[] args) {
        /**Aqui posem Scanner per a que el programa pugui agafar valors introduits per l'usuari */
        Scanner input = new Scanner(System.in);
        /**Introduim les variables */
        int i,numUser;
        double numSuma, mitjana, num;
        System.out.printf(" Cuantos numeros quieres poner? ");
        num = input.nextInt();
        System.out.printf( "Escribe el primer numero: ");
        numUser = input.nextInt();
        /** Despues de decirle al usuario que nos ponga cuantos numeros quiere poner y el valor del primero,
         * luego ponemos que la i es 1 ya que nos ha dado ya el primer numero y hacemos que el numero de la suma
         * cuente el primer valor introducido, además ponemos que la mediana es 0
         */
        i = 1;
        numSuma = numUser;
        mitjana = 0;
        /** En este bucle haremos que se repita la acción de darle numeros al programa hasta que la cantidad sea la
         * especificada por el usuario, en caso de que no lo sea le pedira al usuario que ponga otro numero y este se 
         * sumara a la variable de la suma final para luego hacer la mediana
         */
        while( i < num)
        {  
            i++;
            System.out.printf( " Pon otro numero: ");
            numUser = input.nextInt();
            numSuma = numSuma + numUser;
            
        }
        /**Aqui ponemos el calculo para que nos haga la mediana luego de haber introducido todos los valores */
        mitjana = numSuma /num;
        System.out.printf(" La mitjana es: %.2f ", mitjana);
        
    }
}