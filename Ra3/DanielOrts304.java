import java.util.Scanner;

public class DanielOrts304 { 
    public static void main(String[] args)  {
       /**Posem Scanner per a que s'agafin els valors de l'usuari i introduim les variables */
        Scanner input = new Scanner(System.in);
       
        double mida;
        /**Fem que l'usuari ens doni un valor que sigui la mida d'un cargol */
        System.out.printf("Escriu una mida de cargol:");
        mida = input.nextDouble();
        /**Fem que el programa ens digui quina mida te el cargol segons el valor introduit per l'usuari */
        if ( mida >= 1 && mida < 3){
            System.out.printf("Aquest cargol es petit");
        }
        else if ( mida >= 3 && mida < 5){
            System.out.printf("Aquest cargol es mitja");
        }
        else if ( mida >= 5 && mida < 6.5){
            System.out.printf("Aquest cargol es gran");
        }
        else if ( mida >= 6.5 && mida < 8.5){
            System.out.printf("Aquest cargol es molt gran");
        } else if ( mida > 0 && mida < 1 ){
            System.out.printf("Aquest cargol es molt petit");
        } else if ( mida > 8.5) {
            System.out.printf("Aquest cargol es massa gran");
        } else if ( mida <= 0) {
            System.out.printf("Aquest cargol no existeix");
        }              
       
    }
}