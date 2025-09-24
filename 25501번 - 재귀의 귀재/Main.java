/* ************************************************************************** */
/*                                                                            */
/*                                                      :::    :::    :::     */
/*   Problem Number: 25501                             :+:    :+:      :+:    */
/*                                                    +:+    +:+        +:+   */
/*   By: abc8325767 <boj.kr/u/abc8325767>            +#+    +#+          +#+  */
/*                                                  +#+      +#+        +#+   */
/*   https://boj.kr/25501                          #+#        #+#      #+#    */
/*   Solved: 2025/09/23 22:14:25 by abc8325767    ###          ###   ##.kr    */
/*                                                                            */
/* ************************************************************************** */

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
        int N = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < N; i++){
            String input = br.readLine();
            Palindrome p = new Palindrome(input);
            
            sb.append(p.check ? 1 : 0).append(" ").append(p.count).append("\n");
        }

        bw.write(sb.toString().trim());
        bw.flush();
        bw.close();
    }
}

class Palindrome{
    String str;
    int count;
    boolean check;

    Palindrome(String str){
        this.str = str;
        this.count = 0;
        this.check = check_palindrome(str, 0, str.length() - 1);
    }
    
    boolean check_palindrome(String str, int start, int end){
        this.count += 1;
        if(start >= end) return true;
        else if(str.charAt(start) != str.charAt(end)) return false;
        else return check_palindrome(str, start + 1, end - 1);
    }
}