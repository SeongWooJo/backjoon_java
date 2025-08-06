/* ************************************************************************** */
/*                                                                            */
/*                                                      :::    :::    :::     */
/*   Problem Number: 1157                              :+:    :+:      :+:    */
/*                                                    +:+    +:+        +:+   */
/*   By: abc8325767 <boj.kr/u/abc8325767>            +#+    +#+          +#+  */
/*                                                  +#+      +#+        +#+   */
/*   https://boj.kr/1157                           #+#        #+#      #+#    */
/*   Solved: 2025/08/05 20:43:48 by abc8325767    ###          ###   ##.kr    */
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
        line = line.toUpperCase();
        String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        
        int[] count = new int[alphabet.length()];


        for(var i=0; i<line.length(); i++) count[alphabet.indexOf(line.charAt(i))] += 1;
        
        int max = 0;
        int idx = 0;
        int max_count = 0;
        for(var i=0; i<alphabet.length(); i++){
            if(max < count[i]){
                max = count[i];
                idx = i;
                max_count = 1;
            } else if(max == count[i]){
                max_count += 1;
            }
        }
        if(max_count == 1) {
            bw.write(alphabet.charAt(idx));
        } else {
            bw.write("?");
        }
        bw.flush();
        bw.close();
    }
}

