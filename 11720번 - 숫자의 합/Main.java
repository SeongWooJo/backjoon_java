
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        String str_num = br.readLine();
        int num = Integer.parseInt(str_num);
        String str = br.readLine();
        
        int sum = 0;
        for(var i=0; i<num; i++) sum += str.charAt(i) - '0';
        
        System.out.print(sum);
        
    }
}
