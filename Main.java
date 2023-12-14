import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        int[] tableau = {8,9,7,6,5,33,55,66};
        if ((tableau==null) || (tableau.length==0)){
            System.out.println("le tableau est vide ou null aucune valeur a compare ");
        }
        int max=tableau[0];
        for(int i=1;i<tableau.length;i++){
            if(tableau[i]>max){
                max=tableau[i];
            }
        }

        System.out.println("le plus dans le tableau est  : " + "["+max+"]");
    }
}