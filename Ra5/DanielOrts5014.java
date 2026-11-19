import java.util.Scanner;
class DanielOrts5014 {
    public static void main(String[] args) {
        /**Ponemos el Scanner para que el usuario pueda escribir cuando se necesite */
        Scanner input = new Scanner(System.in);
        /** definimos constante de longitud */
        final int MAXIMO = 20;
        /**Introducimos las variables y la lista*/
        int[] myList = new int[MAXIMO];
        int resp, edad, sumaE, mediaE, moda, mediana, repe, masRepes, numEdades;
        boolean ordenado, negativo;
        negativo = false;
        numEdades = 0;
        mediaE = 0;
        moda = 0;
        mediana = 0;
        /** Le pedimos al usuario que introduzca unos datos, con un maximo delimitado de datos posibles */
        System.out.printf("\n|===================================================|");
        System.out.printf("\n   Introduce la edad de hasta "+ MAXIMO +" personas  ");
        System.out.printf("\n|===================================================|");
        /**si el numero de edades introducidas no iguala o supera el maximo de valores posibles y no se ha puesto un numero negativo
         * se repetira el bucle         */
        while(numEdades < MAXIMO && !negativo)
        {
            /** Le decimos al usuario cuantas edades lleva introducidas y le dejamos introducir mas si es que puede */
            System.out.printf("\n Esta es la edad numero " + (numEdades + 1) + ": ");
            edad = input.nextInt();
            /**Hacemos un while para delimitar la respuesta del usuario y que intente de nuevo */
            while(edad > 150 || edad == 0)
            {
                System.out.printf(" \n La edad que pones no es real, di otra.");
                edad = input.nextInt();
            }
            /**si el numero es negativo significa que se acaba la introduccion de datos */
            if (edad < 0)
            {
                negativo = true;
                System.out.printf("\nSe acabó el programa por introducir un numero negativo");
            }
            else
            {
            /**Guardamos la respuesta en la lista */
            myList[numEdades] = edad;
            numEdades++;
            }
        }
        /**Utilizamos un do-while para que el menú se muestre al menos una vez
        y se repita hasta que el usuario seleccione la opción 4  */
        do
        {
            System.out.printf("\n|============================================|");
            System.out.printf("\n|           Elige una de las opciones        |");
            System.out.printf("\n|============================================|");
            System.out.printf("\n|           1-Calcular la edad media         |");
            System.out.printf("\n|           2-Calcular la moda               |");
            System.out.printf("\n|           3-Calcular la mediana            |");
            System.out.printf("\n|           4-Finalitzar l'execució          |");
            System.out.printf("\n|============================================|\n");
            /**dentro del bucle de do hacemos un bucle de while en caso de que el usuario ponga una opcion que no sea
            valida, en ese caso volveria a dar opcion de elegir una opcion al usuario       */
            resp = input.nextInt();
            while (resp < 1 || resp > 4)
            {
                System.out.printf("\nNo és una resposta vàlida, intenta-ho de nou:");
                resp = input.nextInt();
            }
            /**Utilizamos un switch para hacer que el programa ejecute la opción
            que haya dicho el usuario. */
            switch(resp)
            {
                case 1:
                    /** Mostramos un menu diciendo que se ha seleccionado la opción 1 y que tiene que hacer */
                    System.out.printf("\n|=================================================|");
                    System.out.printf("\n|           Has seleccionado la opción 1,         |");
                    System.out.printf("\n|             calcular la edad media              |");
                    System.out.printf("\n|=================================================|");
                    /** definimos que suma es 0 y hacemos un bucle for para que vaya sumando todos los valores de la lista */
                    sumaE = 0;
                    for (int i = 0; i < numEdades; i++) 
                    {
                        sumaE += myList[i];   
                       
                    }
                    /**Una vez sumados hacemos la media */
                    mediaE = sumaE / numEdades;
                    System.out.printf("\nLa media de edad es de %d años", mediaE); 
                    break;
                case 2:
                    /** Mostramos un menu diciendo que se ha seleccionado la opción 2 y que tiene que hacer */
                    System.out.printf("\n|============================================|");
                    System.out.printf("\n|        Has seleccionado la opción 2,       |");
                    System.out.printf("\n|    El programa va a calcular la moda       |");
                    System.out.printf("\n|         (la edad más frecuente)            |");
                    System.out.printf("\n|============================================|");
                    /**definimos que la variable de repeticiones mas alta es 0 */
                    masRepes = 0;
                    /**hacemos un bucle for porque necesitamos saber cuantas veces ha aparecido cada numero pues  */
                    for (int i = 0; i < numEdades; i++) 
                    {   
                        /**Marcamos que no se ha repetido ningun numero todavia y hacemos el otro bucle for que nos ayudará
                         * a comprobar las edades con todas las demas y si alguna se repite mucho se irá sumando a la variable
                         * de repe
                         */
                        repe = 0;
                        for( int j = 0; j < i; j++)
                        {
                            if (myList[i] == myList[j])
                            {
                                repe++;
                            }  
                        }
                        /**comprobamos cual es la que más se ha repetido y definimos que la moda es esa */
                        if(repe > masRepes)
                        {
                            masRepes = repe;
                            moda = myList[i];
                        }
                        
                    }
                    System.out.printf("\nLa moda es: %d",moda);
                    break;
                case 3:
                    /** Mostramos un menu diciendo que se ha seleccionado la opción 3 y que tiene que hacer */
                    System.out.printf("\n|============================================|");
                    System.out.printf("\n|        Has seleccionado la opción 3,       |");
                    System.out.printf("\n|              calcular la mediana           |");
                    System.out.printf("\n|============================================|\n");
                    /**definimos index como 1 y la variable que usaremos para guardar los valores de la lista para ordenarlos como 0, osea la auxiliar*/
                    int index = 1;
                    int guardar = 0;
                    ordenado = false;
                    /**el bucle while se repetira mientras haya intercambios entre las posiciones */
                    while (ordenado == false)
                    {
                        ordenado = true;
                        for(int j= 0; j < numEdades-index; j++)
                        {
                            /**si el valor es mayor que el siguiente los cambiamos, asi el que sea mayor en la primera vuelta irá al
                             * final y asi sucesivamente
                             */
                            if (myList[j] > myList[j+1])
                            {
                                guardar = myList[j];
                                myList[j]= myList[j+1];
                                myList[j+1] = guardar;
                                ordenado = false;
                            }
                        }
                        index++;
                    }
                    /**Si la lista es par, entonces para la media se pillaran los 2 valores centrales */
                    if (numEdades % 2 == 0)
                    {
                        mediana = (myList[numEdades / 2] + myList[numEdades / 2 + 1]) / 2;
                    }
                    /**sino, con una impar pues se hace con el central */
                    else 
                    {
                        mediana = myList[numEdades / 2];
                    }
                    
                    System.out.printf("\nLa mediana es: %d ", mediana);
                    break;
                case 4:
                    /** Mostramos un menu diciendo que se ha seleccionado la opción 4, que en este caso es salir del programa */
                    System.out.printf("\n|============================================|");
                    System.out.printf("\n|        Has seleccionat la opció 4,         |");
                    System.out.printf("\n|        has terminado el programa           |");
                    System.out.printf("\n|============================================|\n");
                    
                    break;
            }
        } while (resp != 4 );        
    }
}
/**He recibido algo de ayuda de carlos para algunas cosas */