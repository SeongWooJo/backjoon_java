/* ************************************************************************** */
/*                                                                            */
/*                                                      :::    :::    :::     */
/*   Problem Number: 1316                              :+:    :+:      :+:    */
/*                                                    +:+    +:+        +:+   */
/*   By: abc8325767 <boj.kr/u/abc8325767>            +#+    +#+          +#+  */
/*                                                  +#+      +#+        +#+   */
/*   https://boj.kr/1316                           #+#        #+#      #+#    */
/*   Solved: 2025/08/05 21:48:55 by abc8325767    ###          ###   ##.kr    */
/*                                                                            */
/* ************************************************************************** */
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

       
        String alphabet = "qwertyuiopasdfghjklzxcvbnm";
        
        int num = Integer.parseInt(br.readLine());
        int sum = 0;
        for(var input_count = 0; input_count < num; input_count++){
            String line = br.readLine();
            int[] count = new int[26];
            char previous = 'A';
            boolean check = true;
            for(var i = 0; i<line.length(); i++){
                char current = line.charAt(i);
                if(previous == current) {
                    continue;
                }
                if (count[alphabet.indexOf(current)] == 0){
                    previous = current;
                    count[alphabet.indexOf(current)] += 1;
                } else {
                    check = false;
                    break;
                }
                
            }
            if(check) sum += 1;
        }
        
        
        bw.write("" +sum);
        bw.flush();
        bw.close();
    }
}

