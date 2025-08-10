/* ************************************************************************** */
/*                                                                            */
/*                                                      :::    :::    :::     */
/*   Problem Number: 11653                             :+:    :+:      :+:    */
/*                                                    +:+    +:+        +:+   */
/*   By: abc8325767 <boj.kr/u/abc8325767>            +#+    +#+          +#+  */
/*                                                  +#+      +#+        +#+   */
/*   https://boj.kr/11653                          #+#        #+#      #+#    */
/*   Solved: 2025/08/08 22:48:02 by abc8325767    ###          ###   ##.kr    */
/*                                                                            */
/* ************************************************************************** */

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        List<Integer> list = new ArrayList<Integer>();
        StringBuilder sb = new StringBuilder();

        Loop:
        while(N > 1){
            for(int i=2; i<=N/2; i++){
                if(N % i == 0){
                    list.add(i);
                    N /= i;
                    continue Loop;
                }
            }
            list.add(N);
            break;
        }
        
        if(list.size() != 0){
            for(int elem:list){
                sb.append(elem + "\n");
            }
        }
        bw.write(sb.toString().trim());
        bw.flush();
        bw.close();
    }
}