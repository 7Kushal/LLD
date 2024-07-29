import java.io.BufferedReader;
import java.io.InputStreamReader;

public class pro {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while(true){
            String input = br.readLine();
            System.out.println(input);
            if(input.toUpperCase().equals("EXIT")){
                br.close();
            break;}
        }
        
        // Integer.parseInt();
        
    }
}
