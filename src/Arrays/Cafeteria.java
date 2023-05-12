package Arrays;

import java.security.SecureRandom;

public class Cafeteria {
    public static void main(String[] args) {
        SecureRandom ran = new SecureRandom();
        int [] calidad = new int[6];

        int eleccion;
        final int ALUMNOS=30;
        calidad[1]=0;
        calidad[2]=0;
        calidad[3]=0;
        calidad[4]=0;
        calidad[5]=0;


        for (int i = 0; i < ALUMNOS; i++) {
            eleccion = ran.nextInt(5)+1;
            calidad[eleccion] = calidad[eleccion]+1;
        }
        System.out.println("Solo "+ calidad[5]+" alimnos calificaron como EXCELENTE la comida de la cafeteria");
        System.out.println("Solo "+ calidad[4]+" alimnos calificaron como BUENO la comida de la cafeteria");
        System.out.println("Solo "+ calidad[3]+" alimnos calificaron como REGULAR la comida de la cafeteria");
        System.out.println("Solo "+ calidad[2]+" alimnos calificaron como MALO la comida de la cafeteria");
        System.out.println("Solo "+ calidad[1]+" alimnos calificaron como PESIMO la comida de la cafeteria");
    }
}
