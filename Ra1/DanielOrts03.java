import java.util.Scanner;

public class RadiCercle { 
    public static void main(String[] args)  {
        /**Es posa Scanner per llegir el que escriu l'usuari per el radi del cercle */
        Scanner input = new Scanner(System.in);
        double radi, superficie, llargada, pi;
        
        pi = 3.14159;
        System.out.printf("Escriu un radi: ");
        radi = input.nextDouble();
        /**Escribo las formulas de la llargada i superficie para que faci el calcul una vegada te el radi  */
        llargada = radi * 2 * pi;
        superficie = Math.pow(radi,2) * pi;
        /**Una vegada te tota la informacio, escriu quina es la llargada i la superficie del cercle */

        System.out.printf("La llargada d'aquest cercle es %.2f i la superficie es %.2f", llargada, superficie); 
    }
}