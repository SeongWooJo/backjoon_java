/* ************************************************************************** */
/*                                                                            */
/*                                                      :::    :::    :::     */
/*   Problem Number: 28278                             :+:    :+:      :+:    */
/*                                                    +:+    +:+        +:+   */
/*   By: abc8325767 <boj.kr/u/abc8325767>            +#+    +#+          +#+  */
/*                                                  +#+      +#+        +#+   */
/*   https://boj.kr/28278                          #+#        #+#      #+#    */
/*   Solved: 2025/08/09 13:03:39 by abc8325767    ###          ###   ##.kr    */
/*                                                                            */
/* ************************************************************************** */
/* ************************************************************************** */
/*                                                                            */
/*                                                      :::    :::    :::     */
/*   Problem Number: 2750                              :+:    :+:      :+:    */
/*                                                    +:+    +:+        +:+   */
/*   By: abc8325767 <boj.kr/u/abc8325767>            +#+    +#+          +#+  */
/*                                                  +#+      +#+        +#+   */
/*   https://boj.kr/2750                           #+#        #+#      #+#    */
/*   Solved: 2025/08/09 12:33:22 by abc8325767    ###          ###   ##.kr    */
/*                                                                            */
/* ************************************************************************** */
import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        Stack<Integer> st = new Stack<Integer>();

        int number = Integer.parseInt(br.readLine());
        
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < number; i++){
            String[] arr = br.readLine().split(" ");
            
            int command = Integer.parseInt(arr[0]);
            
            if(command == 1){
                st.push(Integer.parseInt(arr[1]));
            } else if(command == 2){
                if(st.isEmpty()){
                    sb.append("-1\n");
                } else {
                    sb.append(st.pop() + "\n");
                }
            } else if(command == 3){
                sb.append(st.size() + "\n");
            } else if(command == 4){
                if(st.isEmpty()){
                    sb.append("1\n");
                } else {
                    sb.append("0\n");
                }
            } else if(command == 5){
                if(st.isEmpty()){
                    sb.append("-1\n");
                } else {
                    sb.append(st.peek() + "\n");
                }
            }
        }
        bw.write(sb.toString().trim());
        bw.flush();
        bw.close();
    }
}

