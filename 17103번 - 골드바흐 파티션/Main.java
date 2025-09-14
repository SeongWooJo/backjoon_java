/* ************************************************************************** */
/*                                                                            */
/*                                                      :::    :::    :::     */
/*   Problem Number: 17103                             :+:    :+:      :+:    */
/*                                                    +:+    +:+        +:+   */
/*   By: abc8325767 <boj.kr/u/abc8325767>            +#+    +#+          +#+  */
/*                                                  +#+      +#+        +#+   */
/*   https://boj.kr/17103                          #+#        #+#      #+#    */
/*   Solved: 2025/09/14 13:02:23 by abc8325767    ###          ###   ##.kr    */
/*                                                                            */
/* ************************************************************************** */

import java.io.*;
import java.util.*;


public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
        int N = Integer.parseInt(br.readLine());

        boolean[] demicals = check_demicals(1000000);
        
        StringBuilder sb = new StringBuilder();
        
        for(int i = 0; i < N; i++){
            int partition = 0;
            int input = Integer.parseInt(br.readLine());
            for(int j = 2; j < input; j++){
                if((demicals[j] != true) && (demicals[input - j] != true) && (input - j >= j)){
                    partition += 1;
                }
            }
            sb.append(partition + "\n");
        }

        bw.write(sb.toString().trim());
        bw.flush();
        bw.close();
    }

    static boolean[] check_demicals(int input){
        boolean[] checks = new boolean[input + 1];
        
        int limit = (int) Math.sqrt(input);

        for(int i = 2; i <= input; i++){
            if(checks[i] == true) continue;
            else {        
                if(i > limit) break;
                for(int j=i*i; j <= input; j+=i){
                    checks[j] = true;
                }
            }
        }

        return checks;
    }
}
