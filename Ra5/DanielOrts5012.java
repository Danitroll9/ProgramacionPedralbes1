import java.util.Scanner;
class DanielOrts5012 {
    public static void main(String[] args) {
        /**Ponemos el Scanner para que el usuario pueda escribir cuando se necesite */
        Scanner input = new Scanner(System.in);
        /** definimos constante de longitud */
        final int LONG = 10;
        /**Introducimos las variables*/
        double[] myList = new double[LONG];
        double[] sueldoNeto = new double[LONG];
        int resp,lista, numEmp;
        double salari, irpf, salaNet, nuevoSal,nuevoSalNeto, secuSoc,  percentatge;
        boolean info = false;
        salari = 0;
        irpf = 0;
        numEmp = 0;
        secuSoc = 0.06;
        /**Utilizamos un do-while para que el menú se muestre al menos una vez
        y se repita hasta que el usuario seleccione la opción 5  */
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
        valida, en ese caso volveria a dar opcion de elegir una opcion al usuario       */
            while (resp < 1 || resp > 5)
            {
                System.out.printf("\nNo és una resposta vàlida, intenta-ho de nou:");
                resp = input.nextInt();
            }
            /**Comprobamos que el usuario haya introducido previamente
            los sueldos antes de poder utilizar las opciones 2, 3 y 4.    */
            if( resp > 1 && resp < 5 && !info)
            {
                System.out.printf(" Necesitas por lo menos un salario en la opcion 1: ");
            }
            else
            {
                /**Utilizamos un switch para hacer que el programa ejecute la opción
                que haya dicho el usuario. */
                switch(resp)
                {
                    case 1:
                        /** Mostramos un menu diciendo que se ha seleccionado la opción 1 y que tiene que hacer */
                        System.out.printf("\n|=================================================|");
                        System.out.printf("\n|           Has seleccionat la opció 1            |");
                        System.out.printf("\n|  Escriu un salari brut per "+LONG+" empleats    |");
                        System.out.printf("\n|             entre 500 i 5000 euros              |");
                        System.out.printf("\n|=================================================|");
                        /**Utilizamos un for para pedir el sueldo bruto
                        de cada uno de los empleados. */
                        for (int i = 0; i < LONG; i++) 
                        {
                            /**Utilizamos un do-while para comprobar que
                            el sueldo introducido esté entre 500 y 5000 euros. */
                            do
                            {  
                                /** Pedimos el sueldo del empleado correspondiente */
                                System.out.printf("Sueldo de empleado "+ (i + 1) +": ");                              
                                salari = input.nextDouble();
                                if(salari > 5000 || salari < 500)
                                {
                                    System.out.printf("\n El valor té que estar entre 500 i 5000 euros, torna a escriure: ");
                                }
                            }while(salari > 5000 || salari < 500);
                            /** Guardamos el sueldo bruto en la posición correspondiente de la lista */
                            myList[i] = salari;
                                
                        }
                        /** Indicamos que ya se han introducido los sueldos */
                        info = true;
                        break;
                    case 2:
                        /** Mostramos un menu diciendo que se ha seleccionado la opción 2 y que tiene que hacer */
                        System.out.printf("\n|============================================|");
                        System.out.printf("\n|        Has seleccionat la opció 2          |");
                        System.out.printf("\n|    El programa va a calcular el sou net    |");
                        System.out.printf("\n|               del empleats                 |");
                        System.out.printf("\n|============================================|");
                        /** Hacemos un for para que vaya por la lista entera y calcule el sueldo neto de cada empleado */
                        for (int i = 0; i < LONG; i++) 
                        {                  
                            salari = myList[i];  
                            /**hacemos varios if else para definir el irpf correspondiente segun el sueldo */
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
                            /**calculamos el sueldo neto restando el irpf y la seguridad social */
                            salaNet = myList[i] - (myList[i]* irpf / 100 ) - (myList[i]* secuSoc );
                            /** y guardamos el neto en su posicion */
                            sueldoNeto[i] = salaNet;
                            System.out.printf( "%.2f ", salaNet);
                        }
                                                
                        break;
                    case 3:
                        /** Mostramos un menu diciendo que se ha seleccionado la opción 3 y que tiene que hacer */
                        System.out.printf("\n|============================================|");
                        System.out.printf("\n|        Has seleccionat la opció 3          |");
                        System.out.printf("\n|        Modificar sou d'un empleat          |");
                        System.out.printf("\n|============================================|");
                        System.out.printf("\n|        De quin empleat vols cambiar        |");
                        System.out.printf("\n|                  el sou?                   |");
                        System.out.printf("\n|============================================|\n");
                        /**Le pedimos al usuario el numero del empleado al que queremos modificar el sueldo */
                        numEmp = input.nextInt();
                        /**Comprobamos que el empleado que pone el usuario existe */
                        if ( numEmp >= 1 && numEmp <= LONG)
                        {
                            /**Restamos uno para tener la posicion del empleado dentro de la lista */
                            lista = numEmp - 1;
                            /**mostramos su sueldo y le preguntamos al usuario el nuevo sueldo bruto */
                            System.out.printf("\nEl sou brut de l'empleat %d és: %.2f euros \n", numEmp, myList[lista]);
                            System.out.printf("\nIntrodueix un nou sou brut: ");
                            nuevoSal = input.nextDouble();
                            /**comprobamos que el nuevo sueldo es mayor al anterior y que no pasa de 5000 euros */
                            if (nuevoSal > myList[lista] && nuevoSal <= 5000) 
                            {
                                myList[lista] = nuevoSal;
                                if( nuevoSal <= 700)
                                {
                                    irpf = 8;
                                }
                                else if( 700 < nuevoSal && nuevoSal <= 1100)
                                {
                                    irpf = 11;
                                }
                                else if( 1100 < nuevoSal && nuevoSal <= 1500)
                                {
                                    irpf = 13;
                                } 
                                else if( 1500 < nuevoSal && nuevoSal <= 2100)
                                {
                                    irpf = 17;
                                }
                                else if( 2100 < nuevoSal && nuevoSal <= 3000)
                                {
                                    irpf = 20;
                                }
                                else
                                {
                                    irpf = 25;
                                }
                                /**calculamos el nuevo saldo neto y lo guardamos en la lista, despues le decimos al usuario los cambios hechos */
                                nuevoSalNeto = nuevoSal - (nuevoSal* irpf / 100 ) - (nuevoSal* secuSoc );
                                sueldoNeto[lista] = nuevoSalNeto;
                                System.out.printf( "S'ha modificat el salari, el nou salari brut es: %.2f i el net es: %.2f ", nuevoSal, nuevoSalNeto);
                            }
                            else
                            {
                                /**le decimos al usuario que solo puede introducir un salario mayor que el anterior */
                                System.out.printf("\nEl salari nou només pot incrementar");
                            }
                        }
                        else
                        {
                            /**le decimos al usuario que ese empleado se lo ha inventado */
                            System.out.printf("\nNumero empleat no correcte");
                        }
                        break;
                    case 4:
                        /** Mostramos un menu diciendo que se ha seleccionado la opción 4 y que tiene que hacer */
                        System.out.printf("\n|============================================|");
                        System.out.printf("\n|        Has seleccionat la opció 4          |");
                        System.out.printf("\n|        Pujar tots els sous bruts           |");
                        System.out.printf("\n|============================================|");
                        System.out.printf("\n|        En quin percentatge vols            |");
                        System.out.printf("\n|              pujar els sous                |");
                        System.out.printf("\n|============================================|\n");
                        /**pedimos al usuario el porcentaje de aumento de los sueldos, que si es negativo tiene que volver 
                         * a escribir uno porque solo puede ser positivo                       */
                        do
                        {
                            percentatge = input.nextDouble();
                            if (percentatge < 0)
                            {
                                System.out.printf("El percentatge ha de ser positiu");
                            }
                        }while(percentatge < 0);
                        /**Vamos por la lista para aumentar el sueldo bruto de cada empleado */
                        for (int i = 0; i < LONG; i++) 
                        {
                            /**se aplica el aumento al sueldo */
                            myList[i] = myList[i] * (1 + percentatge / 100);

                            salari = myList[i];
                            /**Calculamos el irpf correspondiente a cada sueldo */
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
                            /**calculamos el nuevo sueldo neto con el aumento y lo guardamos */
                            salaNet = myList[i] - (myList[i]* irpf / 100 ) - (myList[i]* secuSoc );
                            sueldoNeto[i] = salaNet;
                        }
                        break;
                    case 5:
                        /**El usuario termina de usar este programa */
                        System.out.printf( "Has terminado de usar el programa");
                        break;
                }
            }
        } while (resp != 5);        
    }
}