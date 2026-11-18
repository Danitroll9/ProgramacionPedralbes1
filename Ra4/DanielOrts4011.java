import java.util.Scanner;

class DanielOrts4011 {
    public static void main(String[] args) {
        /**Aqui posem Scanner per a que el programa pugui agafar valors introduits per l'usuari */
        Scanner input = new Scanner(System.in);
        /**Introduim les variables */
        double x, n, resp;
        System.out.println(" Vamos a elegir valor x y valor n para la operacion x^n. ");
        /**Definimos la variable de respuesta a 0 para mas tarde definirla con la formula y hacemos que x sea 0
         * para que empiece el bucle while y que nos pida un numero superior a 0 para poderlo elevar a algo
         */
        resp = 0;
        x = 0;
        /**En este bucle hacemos que si el usuario escribe un valor que sea 0 o menos, le haga volver a introducir uno hasta que sea superior */
        while( x <= 0)
        {
            System.out.println(" Escribe el valor x :");
            x = input.nextDouble();
            if( x <= 0 ) 
                {
                    System.out.println( " El valor x tiene que ser superior a 0, prueba otra vez: ");
                }
        }
        /**Hacemos que el usuario escriba un valor n por el cual elevar el valor x y, en caso de que sea negativo,
         * que entre en el bucle hasta que escriba uno que sea 0 o superior
          */
        System.out.println( "Escribe el valor n por el cual quieras elevar x: ");
        n = input.nextDouble();
        while( n < 0)
            {
                System.out.println( " El valor n tiene que ser 0 o superior, prueba otra vez: ");
                n = input.nextDouble();
            }
          
        
        /**Aqui ponemos el calculo para que nos haga el calculo de x elevado a n y nos diga la respuesta */
        resp = Math.pow( x, n );
        System.out.printf( " El resultat de " + x + " elevat a "+ n +" es: %.2f ", resp);
    }    
}