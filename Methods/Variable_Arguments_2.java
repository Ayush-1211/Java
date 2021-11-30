package methods;
public class Variable_Arguments_2 {
    static void showList(String ...S){
        for(int i=1;i<S.length;i++){
            System.out.println(i+". "+S[i]);
        }
    }
    public static void main(String[] args) {
        showList("Ayush","Anand","Salman","Akshay");
    }
}
