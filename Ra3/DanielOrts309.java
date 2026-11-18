import java.util.Scanner;

public class DanielOrts309 { 
    public static void main(String[] args)  {
       /**Posem Scanner per a que s'agafin els valors de l'usuari i introduim les variables */
        Scanner input = new Scanner(System.in);
       /**fem que l'usari escrigui una quantitat de diners */
      int euros, cantidad;
        System.out.printf("Escribe una cantidad de dinero: ");
        euros = input.nextInt();
        /*Aqui posem las formules necesaries per calcular la quantitat de cada billet o moneda i que es resti per el següent if */
        cantidad = euros /  500;
        if (cantidad > 0){
          if (cantidad == 1){
            System.out.printf("es un billete de 500 ");
            }else{
              System.out.printf(" %d billetes de 500 ", cantidad);
            }
              euros = euros % 500;
            
         }
        cantidad = euros /  200;
        if (cantidad > 0){
          if (cantidad == 1){
            System.out.printf("es un billete de 200 ");
            }else{
              System.out.printf(" %d billetes de 200 ", cantidad);
              euros = euros % 200;
            }
         }
        cantidad = euros /  100;
        if (cantidad > 0){
          if (cantidad == 1){
            System.out.printf("es un billete de 100 ");
            }else{
              System.out.printf(" %d billetes de 100 ", cantidad);
              euros = euros % 100;
            }
         }
        cantidad = euros /  50;
        if (cantidad > 0){
          if (cantidad == 1){
            System.out.printf("es un billete de 50 ");
            }else{
              System.out.printf(" %d billetes de 50 ", cantidad);
            }euros = euros % 50;
         }
        cantidad = euros /  20;
        if (cantidad > 0){
          if (cantidad == 1){
            System.out.printf("es un billete de 20 ");
            }else{
              System.out.printf(" %d billetes de 20 ", cantidad);
             } euros = euros % 20;
         }
        cantidad = euros /  10;
        if (cantidad > 0){
          if (cantidad == 1){
            System.out.printf("es un billete de 10 ");
            }else{
              System.out.printf(" %d billetes de 10 ", cantidad);
             } euros = euros % 10;
         }
        cantidad = euros /  5;
        if (cantidad > 0){
          if (cantidad == 1){
            System.out.printf(" es un billete de 5 ");
            }else{
              System.out.printf(" %d billetes de 5 ", cantidad);
             } euros = euros % 5;
         }
        cantidad = euros /  2;
        if (cantidad > 0){
          if (cantidad == 1){
            System.out.printf(" es un monedas de 2");
            }else{
              System.out.printf(" %d monedas de 2", cantidad);
            }euros = euros % 2;
         }
        cantidad = euros /  1;
        if (cantidad > 0){
          if (cantidad == 1){
            System.out.printf(" es una moneda de 1");
            }else{
              System.out.printf(" %d monedas de 1", cantidad);
             } euros = euros % 1;
         }
        
    }
}