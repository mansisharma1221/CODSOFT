
import java.util.*;
public class StudentGradeCal{
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter number of subjects");
            int sub=sc.nextInt();

            int[] marks=new int[sub];
            int totmarks=0;

            for(int i=0; i<sub; i++){
                System.out.println("Enter marks obtained in " +(i+1) +" subject out of 100:");
                marks[i]=sc.nextInt();

                totmarks+=marks[i];
            }

            double percentage = (double) totmarks/(sub*100)*100;

            System.out.println("Your result is here");
            System.out.println("Total marks: " + totmarks);
            System.out.println("Percentage : "+ percentage);

           String Grade = Calgrade(percentage);
           System.out.println("Grage: "+ Grade);

        }
    }

    public static String Calgrade(double percentage) {
      
        if(percentage >90){
           return "A+";
        }
        else if(percentage >80){
            return"A";
         }
        else  if(percentage >70){
          return "B";
         }
        else if(percentage >60){
         return "C";
         }
         else{
            return "D";
         }
        
        
    }
}
