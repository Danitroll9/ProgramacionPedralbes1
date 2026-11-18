import java.util.Scanner;

class DanielOrtsJoc1 {
    public static void main(String[] args) {
        /**Aqui posem Scanner per a que el programa pugui agafar valors introduits per l'usuari */
        Scanner input = new Scanner(System.in);
        /**Introduim les variables */
        int valor1, valor2, resta, numUser, intents;
        long inici, fin, tiempo;
        /**Aqui empezamos el bucle y hacemos que se generen 2 numeros aleatorios del 0 al 9,
         * luego ponemos que se sume uno para que ya sea entre el 1 al 10 el numero generado y
         * hacemos que repita el bucle en caso de que los 2 numeros sean iguales o el segundo numero, el cual tiene que ser menor que 
         * el primero sea mayor
         */
        do 
        {
            valor1 = (int) (Math.random() * 10);
            valor2 = (int) (Math.random() * 10);

			valor1++;
			valor2++;

		} while (valor1 == valor2 || valor1 < valor2 );
        /** Aqui damos por iniciado el temporizador, declaramos que el usuario tiene 5 intentos
         * y declaramos el resultado de la resta entre los 2 valores
         */
        inici = System.currentTimeMillis() / 1000;
        intents = 5;
        resta = valor1 - valor2;
        /**Empezamos el bucle preguntando al usuario la respuesta a la resta, si no la acierta, se resta 1 intento y se vuelve a preguntar 
         * al usuario, siempre que queden intentos
         */
        do
        {
           System.out.printf("Cual es la respuesta a la resta de " +valor1 +" - " + valor2 +"?\n");
           numUser =input.nextInt();
           
           if ( numUser != resta)
           {
                intents--;
                System.out.printf("\n No es el resultado correcto! Vuelve a intentarlo, te quedan %d intentos", intents);

           }
        }while ( numUser != resta && intents > 0);
        /** Aqui declaramos el final del temporizador, y calculamos el tiempo total */
        fin = System.currentTimeMillis() / 1000;
        tiempo = fin - inici;
        /** Aqui decimos que si el usuario acierta, se reste 1 intento y le diga al usuario cuanto ha tardado y cuantos intentos le quedaban
         * y si no lo consigue pues le dice que muy mal
         */
        if (intents >= 0 && numUser == resta)
        {
            intents--;
            System.out.printf( "\nBIEN HECHO, BERBERECHO! Has dado con la respuesta en %d segundos y con %d intentos restantes", tiempo, intents);
        }
        else
        {
            System.out.printf("\nMuy mal, no lo has conseguido");
        }
    }
}