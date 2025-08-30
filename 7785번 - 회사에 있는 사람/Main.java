/* ************************************************************************** */
/*                                                                            */
/*                                                      :::    :::    :::     */
/*   Problem Number: 7785                              :+:    :+:      :+:    */
/*                                                    +:+    +:+        +:+   */
/*   By: abc8325767 <boj.kr/u/abc8325767>            +#+    +#+          +#+  */
/*                                                  +#+      +#+        +#+   */
/*   https://boj.kr/7785                           #+#        #+#      #+#    */
/*   Solved: 2025/08/25 21:54:47 by abc8325767    ###          ###   ##.kr    */
/*                                                                            */
/* ************************************************************************** */

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
        int n = Integer.parseInt(br.readLine());

        Set<String> set = new HashSet<String>();

        for(int i = 0; i < n; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());

            String name = st.nextToken();
            String command = st.nextToken();
            if(command.equals("enter")){
                set.add(name);
            } else if(command.equals("leave")){
                set.remove(name);
            }
        }
        List<String> list = new ArrayList<String>();

        for(String elem:set){
            list.add(elem);
        }

        list.sort(Comparator.reverseOrder());

        StringBuilder sb = new StringBuilder();
        
        for(String elem:list){
            sb.append(elem + "\n");
        }
        bw.write(sb.toString().trim());
        bw.flush();
        bw.close();
    }
}