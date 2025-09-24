/* ************************************************************************** */
/*                                                                            */
/*                                                      :::    :::    :::     */
/*   Problem Number: 24511                             :+:    :+:      :+:    */
/*                                                    +:+    +:+        +:+   */
/*   By: abc8325767 <boj.kr/u/abc8325767>            +#+    +#+          +#+  */
/*                                                  +#+      +#+        +#+   */
/*   https://boj.kr/24511                          #+#        #+#      #+#    */
/*   Solved: 2025/09/22 20:25:44 by abc8325767    ###          ###   ##.kr    */
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

        StringTokenizer st1 = new StringTokenizer(br.readLine());
        StringTokenizer st2 = new StringTokenizer(br.readLine());
        
        int check = 1;
        for(int i = 0; i < N; i++){
            int input1 = Integer.parseInt(st1.nextToken());
            int input2 = Integer.parseInt(st2.nextToken());
            
            check *= input1;
            if(input1 == 0) {
                deque.addFirst(input2);
            }
        }
        int M = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();
        
        if(check == 0) {
            for(int i = 0; i < M; i++){
                int input = Integer.parseInt(st.nextToken());
                sb.append(deque.removeFirst()).append(" ");
                deque.addLast(input);
            }
        } else {
            for(int i = 0; i < M; i++){
                int input = Integer.parseInt(st.nextToken());
                sb.append(input).append(" ");
            }
        }
        
        bw.write(sb.toString().trim());
        bw.flush();
        bw.close();
    }
}

class StackQueue{
    int option;
    int value;

    StackQueue(int option, int value){
        this.option = option;
        this.value = value;
    }

    int add(int new_value){
        if(this.option == 1){
            return new_value;
        } else {
            int result = this.value;
            this.value = new_value;
            return result;
        }
    }
}