import java.util.Scanner;

public class DanielOrts3012_opc { 
    public static void main(String[] args)  {
       /**Posem Scanner per a que s'agafin els valors de l'usuari i introduim les variables */
        Scanner input = new Scanner(System.in);
       /**fem que l'usari escrigui quin dia es y quants vol que pasin*/
      int any;
        System.out.printf("Que anio naciste? : " );
        any = input.nextInt();
        /** Aqui posem una formula per calcular el dia que arriba despres de sumar els que pasan al dia inicial */
        
        
        System.out.printf("Tu animal del horoscopo chino es: ");
       /** Aqui introduim el primer switch per calcular el primer dia, l'inicial, quin seria */
        switch (any % 12) {
            case 0:
                System.out.printf("Mono");
                break;
            case 1:
                System.out.printf("Gallo");
                break;
            case 2:
                System.out.printf("Perro");
                break;
            case 3:
                System.out.printf("Cerdo");
                break;
            case 4:
                System.out.printf("Rata");
                break;
            case 5:
                System.out.printf("Buey");
                break;
            case 6:
                System.out.printf("Tigre");
                break;
            case 7:
                System.out.printf("Conejo");
                break;
            case 8:
                System.out.printf("Dragon");
                break;
            case 9:
                System.out.printf("Serpiente");
                break;
            case 10:
                System.out.printf("Caballo");
                break;
            case 11:
                System.out.printf("Oveja");
                break;
                  
        }
        
        }
    }
