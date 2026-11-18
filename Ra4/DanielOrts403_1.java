import java.util.Scanner;

class DanielOrts403_1 {
    public static void main(String[] args) {
        /**Aqui posem Scanner per a que el programa pugui agafar valors introduits per l'usuari */
        Scanner input = new Scanner(System.in);
        /**Introduim la variable */
        int numNeg, numMayor;
        System.out.printf(" Escribe un numero: ");
        numNeg = input.nextInt();
        /** Li donem valor a la variable i posem la condicio de if per a que en cas de ser el primer nombre el de mayor valor, que ho tigui en compte */
        numMayor = 0;
         if( numNeg > numMayor )
         {
            numMayor = numNeg;          
         }
         /**Aqui comencem el bucle i fem que amb un if vegi si el valor es negatiu o no, si no ho es segueix fins que ho sigui */          
        do 
        {
            if ( numNeg >= 0 )
            {
         System.out.printf(" Prueba otro valor(si puede ser que sea negativo): ");
            numNeg = input.nextInt();
            }

            if( numNeg > numMayor )
            {
                numMayor = numNeg;          
            }           
        }
        
        while(numNeg >= 0);
        
        System.out.printf(" Bien hecho, has puesto un valor negativo, el numero con mayor valor que has puesto es %d :) ", numMayor);
    }
}