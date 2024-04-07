import java.util.Scanner;
class GradeCalculator{
    public static void main(String args[])
    {   
        int avg=0;
        int marks,total=0;
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter no. of subjects: ");
        int n=sc.nextInt();
        
        for( int i=0;i<n;i++)
        {
            System.out.println("Enter your marks in subject "+(i+1)+": ");
            marks= sc.nextInt();
            total+=marks;
        }
        avg=(total/n);
        char Grade= calculategrade(avg);
        System.out.println("Dear Student, \n Your total marks:"+total+"\n Your Average Percentage:"+avg+"\n Your Final Grade:"+Grade);
        sc.close();
    }
    static  char calculategrade(int marks)
    {   
        if(marks>=90)
            return 'A';
        else if(marks>=80)
            return 'B';
        else if(marks>=70)
            return 'C';
        else if(marks>=60)
            return 'D';
        else
            return 'F';
    }
}