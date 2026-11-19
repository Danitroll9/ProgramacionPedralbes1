import java.util.Scanner;
class DanielOrts5013 {
    public static void main(String[] args) {
        /**Ponemos el Scanner para que el usuario pueda escribir cuando se necesite */
        Scanner input = new Scanner(System.in);
        /** definimos constante de longitud */
        final int LONG = 15;
        /**Introducimos las variables*/
        int[] myList = new int[LONG];
        int resp, edad, sumaE, mediaE, moda, mediana, repe, masRepes;
        boolean ordenado = false;
        sumaE = 0;
        mediaE = 0;
        moda = 0;
        mediana = 0;
        /**Utilizamos un do-while para que el menú se muestre al menos una vez
        y se repita hasta que el usuario seleccione la opción 5  */
        System.out.printf("\n|============================================|");
        System.out.printf("\n   Introduce la edad de "+ LONG +" personas  ");
        System.out.printf("\n|============================================|");
        for ( int i = 0; i < LONG; i++)
        {
            System.out.printf("\n Te quedan " + (LONG-i) + " personas: ");
            edad = input.nextInt();
            while(edad > 150 || edad < 1)
            {
                System.out.printf(" \n La edad que pones no es real, di otra.");
                edad = input.nextInt();
            }
            myList[i] = edad;
        }
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
                    /**Utilizamos un for para pedir el sueldo bruto
                    de cada uno de los empleados. */
                    for (int i = 0; i < LONG; i++) 
                    {
                        sumaE += myList[i];   
                       
                    }
                    mediaE = sumaE / LONG;
                    System.out.printf("\nLa media de edad es de %d años", mediaE); 
                    break;
                case 2:
                    /** Mostramos un menu diciendo que se ha seleccionado la opción 2 y que tiene que hacer */
                    System.out.printf("\n|============================================|");
                    System.out.printf("\n|        Has seleccionado la opción 2,       |");
                    System.out.printf("\n|    El programa va a calcular la moda       |");
                    System.out.printf("\n|         (la edad más frecuente)            |");
                    System.out.printf("\n|============================================|");
                    masRepes = 0;
                    for (int i = 0; i < LONG; i++) 
                    {   
                        
                        repe = 0;
                        for( int j = 0; j < i; j++)
                        {
                            if (myList[i] == myList[j])
                            {
                                repe++;
                            }  
                        }
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
                    
                    int index = 1;
                    int guardar = 0;
                    while (ordenado == false)
                    {
                        ordenado = true;
                        for(int j= 0; j < LONG-index; j++)
                        {
                            if (myList[j] > myList[j])
                            {
                                guardar = myList[j];
                                myList[j]= myList[j+1];
                                myList[j+1] = guardar;
                                ordenado = false;
                            }
                        }
                        index++;
                    }
                    if (i == LONG / 2)
                        {
                            mediana = myList[i];
                        }
                    
                    System.out.printf("\nLa mediana es: %d ", mediana);
                    /**Comprobamos que el empleado que pone el usuario existe */
                    break;
                case 4:
                    /** Mostramos un menu diciendo que se ha seleccionado la opción 4 y que tiene que hacer */
                    System.out.printf("\n|============================================|");
                    System.out.printf("\n|        Has seleccionat la opció 4,         |");
                    System.out.printf("\n|        has terminado el programa           |");
                    System.out.printf("\n|============================================|\n");
                    
                    break;
            }
        } while (resp != 4);        
    }
}