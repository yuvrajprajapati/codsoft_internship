import java.util.*;
public class codsoft_taskno2 {
    public static void main(String args[]){
        Scanner pc = new Scanner(System.in);
        System.out.println("Enter number of subjects");
      int subjects=pc.nextInt();
      int total=0;
      for(int i=1;i<subjects+1;i++){
          System.out.println("Enter marks of "+i+" subject out of 100");
           int marks=pc.nextInt();
           if(marks>0&&marks<=100)
          total = total+marks;
      }
      int percentage=total/subjects;
        System.out.println("Your total marks are:");
            System.out.println(total);
        System.out.println("Your percentage is:");
            System.out.println(percentage+"%");
        if(percentage>=90)
            System.out.println("Grade A");
        if(percentage>=80&&percentage<90)
            System.out.println("Grade B");
        if(percentage>=70&&percentage<80)
            System.out.println("Grade C");
        if(percentage>=60&&percentage<70)
            System.out.println("Grade D");
        if(percentage>=33&&percentage<60)
            System.out.println("Grade F");
        if(percentage>=0&&percentage<33)
            System.out.println("Fail");
        else
            System.out.println("invalid information");
    }
}
