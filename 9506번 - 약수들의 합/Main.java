/* ************************************************************************** */
/*                                                                            */
/*                                                      :::    :::    :::     */
/*   Problem Number: 9506                              :+:    :+:      :+:    */
/*                                                    +:+    +:+        +:+   */
/*   By: abc8325767 <boj.kr/u/abc8325767>            +#+    +#+          +#+  */
/*                                                  +#+      +#+        +#+   */
/*   https://boj.kr/9506                           #+#        #+#      #+#    */
/*   Solved: 2025/08/08 20:37:33 by abc8325767    ###          ###   ##.kr    */
/*                                                                            */
/* ************************************************************************** */

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int input;
        
        StringBuilder output_sb = new StringBuilder();
        while((input = Integer.parseInt(br.readLine())) != -1){
            List<Integer> list = new ArrayList<>();
            for(int i = 1; i <= input/2; i++) if(input % i == 0) list.add(i);
            
            int count = 0;
            for(int elem:list) count += elem;

            StringBuilder sb = new StringBuilder();
            
            if(count == input){    
                sb.append(input + " = ");
                int end = list.size();
                for(int i = 0; i < end - 1; i++) sb.append(list.get(i) + " + ");
                sb.append(list.get(end - 1));
                output_sb.append(sb.toString() + "\n");
            } else {
                output_sb.append(input + " is NOT perfect.\n");
            }
        }
        bw.write(output_sb.toString().trim());
        bw.flush();
        bw.close();
    }
}