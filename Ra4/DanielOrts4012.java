import java.util.Scanner;

class DanielOrts4012 {
    public static void main(String[] args) {
        /**Aqui posem Scanner per a que el programa pugui agafar valors introduits per l'usuari */
        Scanner input = new Scanner(System.in);
        /**Introduim les variables */
        int i;
        double numSuma, mitjana, num;
        /**Definimos cada variable */
        num = 0;
        mitjana = 0;
        i = 0;
        numSuma = 0;
        /** Hacemos un bucle que en caso de que el numero introducido por el usuario no sea -1 se va a repetir todo el rato hasta que lo sea */
        while(num != -1)
        {
            System.out.printf(" Escribe -1 para terminar el programa o escribe otros numeros para ver que pasa: ");             
            num = input.nextInt();
            /**En caso de estar entre los numeros 0 y 10, este numero se ira sumando y al final dara el resultado de la suma */
            if( num > 0 && num <= 10)
            {
                i++;
                numSuma = numSuma + num;
            }
            /**En caso de que el numero no sea -1 ni este entre 0 y 10, le dira al usuario que no se suma ese valor */
            else if ( (num < 0 || num > 10) && num != -1 )
            {
                System.out.printf( " El valor " + num + " no suma." );
            }
        }
        /**Aqui ponemos el calculo para que nos haga la suma de los numeros que esten entre 0 y 10 y nos dara la mediana   */
        mitjana = numSuma / i;
        System.out.printf(" La suma de los valores entre 0 y 10 es: %.2f ", numSuma);
        System.out.printf(" La mitjana es: %.2f ", mitjana);
        
    }
}