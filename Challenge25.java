import java.util.Scanner;
public class Challenge25 {    
     public static void main(String[] args) { 
      Task object = new Task();
      Scanner obj = new Scanner(System.in);
      System.out.println("The number of students");
      int p=obj.nextInt();
      object.setnum(p);
       for(int i=0;i<p;i++){
        System.out.println("Enter the student name");
        object.setstu(obj.next(),i);
        System.out.println("Enter the his/her Roll NUmber");
        object.setroll(obj.nextInt(),i);
        System.out.println("Enter the his/her Marks in math");
        object.setmath(obj.nextFloat(),i);
        System.out.println("Enter the his/her Marks in Science");
        object.setsci(obj.nextFloat(),i);
        System.out.println("Enter the his/her Marks in English");
        object.seteng(obj.nextFloat(),i);
        System.out.println("Enter the his/her Marks in Language");
        object.setlang(obj.nextFloat(),i);
        System.out.println("Enter the his/her Marks in Social Studies");
        object.setss(obj.nextFloat(),i);
       }
         System.out.println("Studentname");
         for (int i = 0; i < p; i++) {
         System.out.println(object.getMarks(i));
         System.out.println(object.getavgMarks(i));
         System.out.println(object.getgrade(i));
         System.out.println(object.getstatus(i)); 
         System.out.println();
         }        
    } 
}
class Task {
  private int n;
  private String []stn=new String[100];
  private int []rl=new int[100];
  private float []math=new float[100];
  private float []sci=new float[100];
  private float []eng=new float[100];
  private float []lang=new float[100];
  private float []ss=new float[100];
  private float []total=new float[100];
  private float []avg=new float[100];
  private char  []grade=new char[100];
    Scanner obj = new Scanner(System.in);
    public void setnum(int n) {
        this.n=n;
    }
    public void setstu(String n, int i) {
        this.stn[i]=n;
    }
    public void setroll(int n, int i) {
        this.rl[i]=n;
    }
    public void setmath(float n, int i) {
        this.math[i]=n;
    }
    public void setsci(float n, int i) {
        this.sci[i]=n;
    }
    public void seteng(float n, int i) {
        this.eng[i]=n;
    }
    public void setlang(float n, int i) {
        this.lang[i]=n;
    }
    public void setss(float n, int i) {
        this.ss[i]=n;
    }
    public String getMarks(int j) {
         total[j]=(math[j]+sci[j]+eng[j]+lang[j]+ss[j]); 
         return ""+stn[j]+"\t\t\t"+total[j]+" (Total marks)";
    }
    public String getavgMarks(int j) {
            total[j]=(math[j]+sci[j]+eng[j]+lang[j]+ss[j]); 
            return "     \t\t\t"+total[j]/5.0+" (average marks)";
    }

    public String getgrade(int j) {
            avg[j]=total[j]/5;
            if(avg[j]>=90)
              grade[j]='O';
             else if(avg[j]>=80&&avg[j]<90)
              grade[j]='A';
             else if(avg[j]>=70&&avg[j]<80)
              grade[j]='B';
             else if(avg[j]>=60&&avg[j]<70)
              grade[j]='C';
             else if(avg[j]>=50&&avg[j]<60)
              grade[j]='D';
             else 
              grade[j]='E';
              return "     \t\t\t"+grade[j]+" (Grade)";
    }
    public String getstatus(int j) {
            if(math[j]>=35&&sci[j]>=35&&eng[j]>=35&&lang[j]>=35&&ss[j]>=35){
             return "     \t\t\tPassed (Status)";
            }
            else 
            return "     \t\t\tFailed (Status)";
    }
}
