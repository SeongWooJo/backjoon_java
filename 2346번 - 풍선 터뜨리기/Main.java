/* ************************************************************************** */
/*                                                                            */
/*                                                      :::    :::    :::     */
/*   Problem Number: 2346                              :+:    :+:      :+:    */
/*                                                    +:+    +:+        +:+   */
/*   By: abc8325767 <boj.kr/u/abc8325767>            +#+    +#+          +#+  */
/*                                                  +#+      +#+        +#+   */
/*   https://boj.kr/2346                           #+#        #+#      #+#    */
/*   Solved: 2025/09/22 19:36:08 by abc8325767    ###          ###   ##.kr    */
/*                                                                            */
/* ************************************************************************** */

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
        int N = Integer.parseInt(br.readLine());

        Deque<Dict> deque = new ArrayDeque<Dict>();
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i = 0; i < N; i++){
            int input = Integer.parseInt(st.nextToken());           
            deque.add(new Dict(i+1, input));    
        }
        StringBuilder sb = new StringBuilder();
        
        while(true){
            Dict elem = deque.removeFirst();
            int number = elem.value;
            sb.append(elem.idx).append(" ");
            if(deque.isEmpty()) break;
            if(number > 0){
                for(int i = 0; i < number - 1; i++){
                    deque.add(deque.removeFirst());
                }
            } else {
                number *= -1;
                for(int i = 0; i < number; i++){
                    deque.addFirst(deque.removeLast());
                }
            }
        }
        bw.write(sb.toString().trim());
        bw.flush();
        bw.close();
    }
}

class Dict {
    int idx;
    int value;

    Dict(int idx, int value) {
        this.idx = idx;
        this.value = value;
    }
}