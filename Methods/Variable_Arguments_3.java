package methods;
public class Variable_Arguments_3 {
    static void showList(int start,String ...S){
        for(int i=1;i<S.length;i++){
            System.out.println(start+". "+S[i]);
            start++;
        }
    }
    public static void main(String[] args) {
        showList(5,"Ayush","Anand","Salman","Akshay");
    }
}
