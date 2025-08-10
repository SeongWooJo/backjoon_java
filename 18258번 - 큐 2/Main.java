/* ************************************************************************** */
/*                                                                            */
/*                                                      :::    :::    :::     */
/*   Problem Number: 18258                             :+:    :+:      :+:    */
/*                                                    +:+    +:+        +:+   */
/*   By: abc8325767 <boj.kr/u/abc8325767>            +#+    +#+          +#+  */
/*                                                  +#+      +#+        +#+   */
/*   https://boj.kr/18258                          #+#        #+#      #+#    */
/*   Solved: 2025/08/09 13:21:04 by abc8325767    ###          ###   ##.kr    */
/*                                                                            */
/* ************************************************************************** */
import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        Deque<Integer> q = new LinkedList<Integer>();

        int number = Integer.parseInt(br.readLine());
        
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < number; i++){
            String[] arr = br.readLine().split(" ");
            
            switch(arr[0]){
                case "push":
                    q.add(Integer.parseInt(arr[1]));
                break;
                case "pop":
                    if(q.isEmpty()) sb.append("-1\n");
                    else sb.append(q.remove() + "\n");
                break;
                case "size":
                    sb.append(q.size() + "\n");
                break;
                case "empty":
                    if(q.isEmpty()) sb.append("1\n");
                    else sb.append("0\n");
                break;
                case "front":
                    if(q.isEmpty()) sb.append("-1\n");
                    else sb.append(q.peekFirst() + "\n");
                break;
                case "back":
                    if(q.isEmpty()) sb.append("-1\n");
                    else sb.append(q.peekLast() + "\n");
                break;
            }
        }
        bw.write(sb.toString().trim());
        bw.flush();
        bw.close();
    }
}

