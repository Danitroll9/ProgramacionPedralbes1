import java.util.Scanner;

class DanielOrts405 {
    public static void main(String[] args) {
        /**Aqui posem Scanner per a que el programa pugui agafar valors introduits per l'usuari */
        Scanner input = new Scanner(System.in);
        /**Introduim les variables i li donem valors si fa falta */
        int numNeg, suma, valors;
        valors = 1;
        System.out.printf(" Escribe un numero: ");
        numNeg = input.nextInt();
        suma = numNeg;
        /** posem la condicio per repetir el bucle i que es vagin sumant tots els valors que siguin positius i despres ens dona la suma i quants valors s'han escrit */
        do 
        {
            if ( numNeg >= 0 )
            {
         System.out.printf(" Prueba otro valor(si puede ser que sea negativo): ");
            numNeg = input.nextInt();
            valors ++;
            }
            if (numNeg > 0)
        suma = numNeg + suma;       

        }
        
        while(numNeg >= 0);
        
        System.out.printf(" Bien hecho, has puesto un valor negativo, el cual es %d, la suma de todos los valores introducidos es %d y se han puesto %d numeros :) ",numNeg, suma, valors );
    }
}