import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // soit deux tableaux avec leurs initialisation
        int[] t1={1,2,3,4,5};
        int[] t2={6,7,8,9,10};
        int[] t3= new int[5];
        for(int i=0;i<5;i++){
            int val1=(i<t1.length) ? t1[i]:0;
            int val2=(i<t2.length) ? t2[i]:0;
            t3[i]=val1+val2;
        }
        System.out.println(" Resultat de l'addition : "+ Arrays.toString(t3) );
    }
}