import java.util.Scanner;

class DanielOrts403_1 {
    public static void main(String[] args) {
        /**Aqui posem Scanner per a que el programa pugui agafar valors introduits per l'usuari */
        Scanner input = new Scanner(System.in);
        /**Introduim la variable */
        int numNeg, suma;
        System.out.printf(" Escribe un numero: ");
        numNeg = input.nextInt();
        /** Li donem valor a la variable */
        suma = numNeg;
        /** posem la condicio per repetir el bucle i que es vagin sumant tots els valors que siguin positius */
        do 
        {
            if ( numNeg >= 0 )
            {
         System.out.printf(" Prueba otro valor(si puede ser que sea negativo): ");
            numNeg = input.nextInt();
            }
            if (numNeg > 0)
        suma = numNeg + suma;       

        }
        
        while(numNeg >= 0);
        
        
        System.out.printf(" Bien hecho, has puesto un valor negativo, el cual es %d y la suma de todos los valores introducidos es %d :) ",numNeg, suma );
    }
}