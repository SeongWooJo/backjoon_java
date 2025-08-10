/* ************************************************************************** */
/*                                                                            */
/*                                                      :::    :::    :::     */
/*   Problem Number: 2581                              :+:    :+:      :+:    */
/*                                                    +:+    +:+        +:+   */
/*   By: abc8325767 <boj.kr/u/abc8325767>            +#+    +#+          +#+  */
/*                                                  +#+      +#+        +#+   */
/*   https://boj.kr/2581                           #+#        #+#      #+#    */
/*   Solved: 2025/08/08 22:41:02 by abc8325767    ###          ###   ##.kr    */
/*                                                                            */
/* ************************************************************************** */

import java.io.*;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int M = Integer.parseInt(br.readLine());
        int N = Integer.parseInt(br.readLine());

        int count = 0;
        int min = 10001;

        StringBuilder sb = new StringBuilder();

        Loop:
        for(int target = M; target <= N; target++){
            if(target == 1) continue;
            
            for(int i=2; i<=target/2; i++){
                if(target % i == 0) continue Loop; 
            }
            if(target < min) min = target;
            
            count += target;
        }

        if(count == 0){
            sb.append("-" + 1);
        } else {
            sb.append("" + count);
            sb.append("\n" + min);
        }
        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }
}