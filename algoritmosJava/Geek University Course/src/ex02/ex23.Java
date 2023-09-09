import java.util.ArrayList;
import java.util.Scanner;

public class App {

    public static void main(String[] args) {
       //Variables
         ArrayList<Integer> vetor = new ArrayList<Integer>();
         ArrayList<Integer> pares = new ArrayList<Integer>();

        for (int i = 0; i < 5; i++){
            vetor.add(i);
            if(i % 2 == 0){
                if(i > 0){
                pares.add(i);
            }
        }
        }
          
        for(Integer n : pares){
            System.out.println(n);
        }
       //Input
      

       //Process
       
       //Output
       

    }
}