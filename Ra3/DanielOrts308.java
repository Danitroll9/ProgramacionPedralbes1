import java.util.Scanner;

public class DanielOrts308 { 
    public static void main(String[] args)  {
       /**Posem Scanner per a que s'agafin els valors de l'usuari i introduim les variables */
        Scanner input = new Scanner(System.in);
       /**fem que l'usari escrigui un dia, un mes i un any */
      int any, mes , dia;
        System.out.printf("Escribe un dia: ");
        dia = input.nextInt();
        System.out.printf("Escribe un mes: ");
        mes = input.nextInt();
        System.out.printf("Escribe un año: ");
        any = input.nextInt();
      /**Posem la condicio per assegurar primer que la fecha pot existir i despres posem las condicions 
       * de l'any de traspas i dels dias dels mesos
        */
    if (dia < 1 || dia > 31 || mes < 1 || mes > 12) {
            System.out.printf("La fecha no existe");
        } else if (mes == 2) {
            if ((any % 4 == 0 && any % 100 != 0) || any % 400 == 0) {
                if (dia > 29) {
                    System.out.printf("La fecha no existe");
                } else {
                    System.out.printf("La fecha es correcta");
                }
            } else if (dia > 28) {
                System.out.printf("La fecha no existe");
            } else {
                System.out.printf("La fecha es correcta");
            }
        } else if (mes == 4 || mes == 6 || mes == 9 || mes == 11) {
            if (dia > 30) {
                System.out.printf("La fecha no existe");
            } else {
                System.out.printf("La fecha es correcta");
            }
        } else {
            System.out.printf("La fecha es correcta");
        }
    }
}