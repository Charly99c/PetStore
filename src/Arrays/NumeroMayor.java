package Arrays;
import java.util.Scanner;
public class NumeroMayor {
    public static void main(String[] args) {

        int [] numeros = new int[10];
        Scanner sc = new Scanner (System.in);
        int mayor = 0;
        int menor;


        for (int i = 0; i<numeros.length; i++) {

            System.out.println("Dame el numero "+(i+1)+":");
            numeros[i]= sc.nextInt();
        }

        for (int i=0; i<numeros.length; i++) {
            if(numeros[i]>mayor){
                mayor = numeros[i];
            }
        }
        System.out.println("El numero mayor es "+mayor);
        menor = numeros[0];

        for(int i=1; i<numeros.length; i++){
            if(numeros[i]<menor){
            menor=numeros[i];
        }
    }
        System.out.println("El numero menor es "+menor);
   }
}