package object.oriented.programming;

class Subject{
    private String subId;
    private String name;
    private int maxMarks;
    private int marksObtain;
    
    public Subject(String subId, String name, int maxMarks){
        this.subId = subId;
        this.name = name;
        this.maxMarks = maxMarks;
    }
    
    public String getSubId(){
        return subId;
    }
    public String getName(){
        return name;
    }
    public int getMaxMarks(){
        return maxMarks;
    }
    public int getMarksObtain(){
        return marksObtain;
    }
    
    public void setMaxMarks(int mm){
        maxMarks = mm;
    }
    public void setMarksObtain(int m){
        marksObtain = m;
    }
    boolean isQualified(int m){
        return marksObtain >= maxMarks/10*4;
    }
    public String toString(){
        return "\nSubjectId: "+subId+"\nName: "+name+"\nMarks Obtain: "+marksObtain;
    }
}

public class Array_of_Objects {
    public static void main(String[] args) {
        Subject sub[] = new Subject[3];
        sub[0] = new Subject("s101","DS",100);
        sub[1] = new Subject("s102","ADA",100);
        sub[2] = new Subject("s103","OOP",100);
        
        for(Subject s:sub){
            System.out.println(s);
        }
    }
}
