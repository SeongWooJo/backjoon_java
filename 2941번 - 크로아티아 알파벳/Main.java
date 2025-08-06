/* ************************************************************************** */
/*                                                                            */
/*                                                      :::    :::    :::     */
/*   Problem Number: 2941                              :+:    :+:      :+:    */
/*                                                    +:+    +:+        +:+   */
/*   By: abc8325767 <boj.kr/u/abc8325767>            +#+    +#+          +#+  */
/*                                                  +#+      +#+        +#+   */
/*   https://boj.kr/2941                           #+#        #+#      #+#    */
/*   Solved: 2025/08/05 20:59:27 by abc8325767    ###          ###   ##.kr    */
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

        String line = br.readLine();

        int count = 0;
        
        String[] alphabet_list = {"c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z="};
        int length = alphabet_list.length;
        Loop:
        for(var i = 0; i<line.length(); i++){
            Loop2:
            for(var j = 0; j<length;j++){
                var k = 0;
                for(k = 0; k<alphabet_list[j].length(); k++){
                    if(i+k>=line.length()){
                        continue Loop2;
                    }
                    if((line.charAt(i+k) != alphabet_list[j].charAt(k))){
                        break;
                    }
                }
                if(k == alphabet_list[j].length()) {
                    i += (alphabet_list[j].length() - 1);
                    count += 1;
                    continue Loop;
                }
            }
            if((line.charAt(i) != '-') &&(line.charAt(i) != '=')) count+=1;
        }
        bw.write("" + count);
        bw.flush();
        bw.close();
    }
}

