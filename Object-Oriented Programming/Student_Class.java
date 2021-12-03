package object.oriented.programming;
class Student{
    public int roll;
    public String name;
    public String course;
    public int m1,m2,m3;
    public int total(){
        return m1+m2+m3;
    }
    public float average(){
        return (float)total()/3;
    }
    public char grade(){
        if(average()>=60){
            return 'A';
        }
        else{
            return 'B';
        }
    }
    public String details(){
        return "Roll No: "+roll+"\n"+"Name: "+name+"\n"+"Course: "+course+"\n";
    }
}
public class Student_Class {
    public static void main(String[] args) {
        Student s = new Student();
        s.roll = 1;
        s.name = "Ayush Prajapati";
        s.course = "Information Technology";
        s.m1 = 98;
        s.m2 = 99;
        s.m3 = 98;
        
        System.out.println("Total Marks: "+s.total());
        System.out.println("Average Marks: "+s.average());
        System.out.println("Grade: "+s.grade());
        System.out.println("Student Details: \n"+s.details());
    }
}
