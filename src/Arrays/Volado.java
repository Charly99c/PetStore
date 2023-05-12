package Arrays;

import java.security.SecureRandom;

public class Volado {
    public static void main(String[] args){
        SecureRandom random = new SecureRandom();
        int [] volado = new int[3];

        final int AGUILA = 1;
        final int SOL =  2;         /*variables que no se pueden cambiar*/
        final int LANZAMIENTO = 100;

        volado[AGUILA]=0;
        volado[SOL]=0;

        for (int i = 0; i <= LANZAMIENTO; i++) {
            if((random.nextInt(2)+1)==AGUILA) {
                volado[AGUILA]=volado[AGUILA]+1;
            }else{
                volado[SOL]=volado[SOL]+1;     /*modo mas corto (volado[SOL]+1)*/
            }
        }
        System.out.println("Aguila cayó: "+volado[AGUILA]+" veces aguila");
        System.out.println("Aguila cayó: "+volado[SOL]+" veces sol");
    }
}
