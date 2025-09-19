/* ************************************************************************** */
/*                                                                            */
/*                                                      :::    :::    :::     */
/*   Problem Number: 28279                             :+:    :+:      :+:    */
/*                                                    +:+    +:+        +:+   */
/*   By: abc8325767 <boj.kr/u/abc8325767>            +#+    +#+          +#+  */
/*                                                  +#+      +#+        +#+   */
/*   https://boj.kr/28279                          #+#        #+#      #+#    */
/*   Solved: 2025/09/19 18:25:39 by abc8325767    ###          ###   ##.kr    */
/*                                                                            */
/* ************************************************************************** */

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
        int N = Integer.parseInt(br.readLine());
        Deque<Integer> deque = new ArrayDeque<Integer>();
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < N; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int command = Integer.parseInt(st.nextToken());

            if(command == 1){
                deque.addFirst(Integer.parseInt(st.nextToken()));
            } else if(command == 2){
                deque.addLast(Integer.parseInt(st.nextToken()));
            } else if(command == 3){
                if(deque.isEmpty()) sb.append(-1 + "\n");
                else sb.append(deque.removeFirst() + "\n");
            } else if(command == 4){
                if(deque.isEmpty()) sb.append(-1 + "\n");
                else sb.append(deque.removeLast() + "\n");
            } else if(command == 5){
                sb.append(deque.size() + "\n");
            } else if(command == 6){
                if(deque.isEmpty()) sb.append(1 + "\n");
                else sb.append(0 + "\n");
            } else if(command == 7){
                if(deque.isEmpty()) sb.append(-1 + "\n");
                else sb.append(deque.getFirst() + "\n");
            } else if(command == 8){
                if(deque.isEmpty()) sb.append(-1 + "\n");
                else sb.append(deque.getLast() + "\n");
            }
        }
        bw.write(sb.toString().trim() + "");
        bw.flush();
        bw.close();
    }
}