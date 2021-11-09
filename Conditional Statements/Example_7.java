package conditional;
import java.util.*;
public class Example_7 {
    public static void main(String[] args) {
        // Find type of website and the protocol used
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter URL: ");
        String url = sc.nextLine();
        String protocol = url.substring(0, url.indexOf(":"));
        
        if(protocol.equals("http")){
            System.out.println("Hypertext Transfer Protocol");
        }
        else if(protocol.equals("ftp")){
            System.out.println("File Transfer Protocol");
        }
        else if(protocol.equals("https")){
            System.out.println("Hypertext Transfer Protocol Secure");
        }
        
        String ext = url.substring(url.lastIndexOf(".")+1);
        
        if(ext.equals("com")){
            System.out.println("Commercial Website");
        }
        else if(ext.equals("org")){
            System.out.println("Organisation Website");
        }
        else if(ext.equals("net")){
            System.out.println("Network Website");
        }
    }
}
