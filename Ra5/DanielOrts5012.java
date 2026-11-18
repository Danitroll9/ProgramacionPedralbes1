import java.util.Scanner;
class DanielOrts5012 {
    public static void main(String[] args) {
        /**Ponemos el Scanner para que el usuario pueda escribir cuando se necesite */
        Scanner input = new Scanner(System.in);
        /** definimos constante de longitud */
        final int LONG = 6;
        /**Introducimos las variables*/
        double[] myList = new double[LONG];
        double[] sueldoNeto = new double[LONG];
        int resp;
        double salari, irpf, salaNet;
        boolean info;
        salari = 0;
        info = false;
        do
        {
        System.out.printf("\n|============================================|");
        System.out.printf("\n| Introdueix salari de "+ LONG +" empleats   |");
        System.out.printf("\n|============================================|");
        System.out.printf("\n|           1-Introduir sous bruts           |");
        System.out.printf("\n|           2-Calcular sou net               |");
        System.out.printf("\n|           3-Modificar sou brut             |");
        System.out.printf("\n|           4-Pujar sous bruts               |");
        System.out.printf("\n|           5-Finalitzar l'execució          |");
        System.out.printf("\n|============================================|\n");

        resp = input.nextInt();
        /**dentro del bucle de do hacemos un bucle de while en caso de que el usuario ponga una opcion que no sea
         * valida, en ese caso volveria a dar opcion de elegir una opcion al usuario
         */
            while (resp < 1 || resp > 5)
            {
            System.out.printf("\nNo és una resposta vàlida, intenta-ho de nou:");
            resp = input.nextInt();
            }
        /**Ponemos un switch para las opciones a elegir por el usuario y en caso de que no elija la opcion de salir
         * del programa, que se repita por si quiere elegir otra opcion
         */
            if( resp > 1 && resp < 4 && !info)
            {
                System.out.printf(" Necesitas por lo menos un salario en la opcion 1");
                resp = input.nextInt();
            }else
            {

                switch(resp)
                {
                    case 1:
                            System.out.printf("\n|=================================================|");
                            System.out.printf("\n|           Has seleccionat la opció 1            |");
                            System.out.printf("\n|  Escriu un salari brut per "+LONG+" empleats    |");
                            System.out.printf("\n|             entre 500 i 5000 euros              |");
                            System.out.printf("\n|=================================================|");
                        for (int i = 0; i < LONG; i++) 
                        {

                            do
                            {
                            salari = input.nextDouble();
                            if(salari > 5000 || salari < 500)
                            {
                                System.out.printf("\n El valor té que estar entre 500 i 5000 euros, torna a escriure: ");
                            }
                            }while(salari > 5000 || salari < 500);
                            myList[i] = salari;
                                
                        }
                        info = true;
                        
                    case 2:
                        System.out.printf("\n|============================================|");
                        System.out.printf("\n|        Has seleccionat la opció 2          |");
                        System.out.printf("\n|    El programa va a calcular el sou net    |");
                        System.out.printf("\n|               del empleats                 |");
                        System.out.printf("\n|============================================|");
                        for (int i = 0; i < LONG; i++) 
                        {                    
                            if( salari <= 700)
                            {
                                irpf = 8;
                            }
                            else if( 700 < salari && salari <= 1100)
                            {
                                irpf = 11;
                            }
                            else if( 1100 < salari && salari <= 1500)
                            {
                                irpf = 13;
                            } 
                            else if( 1500 < salari && salari <= 2100)
                            {
                                irpf = 17;
                            }
                            else if( 2100 < salari && salari <= 3000)
                            {
                                irpf = 20;
                            }
                            else
                            {
                                irpf = 25;
                            }
                            salaNet = myList[i] - (myList[i]* irpf / 100);
                            sueldoNeto[i] = salaNet;
                            System.out.printf( "%.2f ", salaNet);
                        }
                        
                        
                        break;
                    case 3:
                        System.out.printf("\n|============================================|");
                        break;
                    case 4:
                        System.out.printf( "Has terminado de usar el programa");
                        break;
                    case 5:
                        System.out.printf( "Has terminado de usar el programa");
                        break;
                }
            }
        } while (resp != 5);
        
    }
}