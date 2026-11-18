import java.util.Scanner;

public class DanielOrts306 { 
    public static void main(String[] args)  {
       /**Posem Scanner per a que s'agafin els valors de l'usuari i introduim les variables */
        Scanner input = new Scanner(System.in);
       /**fem que l'usari escrigui quin dia es y quants vol que pasin*/
      int dia1, dia2, diaTot;
        System.out.printf("Que dia de la semana es? (1=lunes, 2=martes, ... 7=domingo): " );
        dia1 = input.nextInt();
        System.out.printf("Cuantos dias quieres que pasen? ");
        dia2 = input.nextInt();
        /** Aqui posem una formula per calcular el dia que arriba despres de sumar els que pasan al dia inicial */
        diaTot = (dia1 + dia2 - 1) % 7 + 1;
        
        System.out.printf("El dia inicial es: ");
       /** Aqui introduim el primer switch per calcular el primer dia, l'inicial, quin seria */
        switch (dia1) {
            case 1:
                System.out.printf("lunes");
                break;
            case 2:
                System.out.printf("martes");
                break;
            case 3:
                System.out.printf("miercoles");
                break;
            case 4:
                System.out.printf("jueves");
                break;
            case 5:
                System.out.printf("viernes");
                break;
            case 6:
                System.out.printf("sabado");
                break;
            case 7:
                System.out.printf("domingo");
                break;
        }
         System.out.printf(" , despues de %d dias sera: ", dia2);
            /**Aqui introduim el segon switch pel dia final, que mitjançant la formula calcula quin sera */
        switch (diaTot) {
            case 1:
                System.out.printf("lunes");
                break;
            case 2:
                System.out.printf("martes");
                break;
            case 3:
                System.out.printf("miercoles");
                break;
            case 4:
                System.out.printf("jueves");
                break;
            case 5:
                System.out.printf("viernes");
                break;
            case 6:
                System.out.printf("sabado");
                break;
            case 7:
                System.out.printf("domingo");
                break;
            }
        }
    }
