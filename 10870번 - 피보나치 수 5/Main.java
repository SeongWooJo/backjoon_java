/* ************************************************************************** */
/*                                                                            */
/*                                                      :::    :::    :::     */
/*   Problem Number: 10870                             :+:    :+:      :+:    */
/*                                                    +:+    +:+        +:+   */
/*   By: abc8325767 <boj.kr/u/abc8325767>            +#+    +#+          +#+  */
/*                                                  +#+      +#+        +#+   */
/*   https://boj.kr/10870                          #+#        #+#      #+#    */
/*   Solved: 2025/09/23 21:59:13 by abc8325767    ###          ###   ##.kr    */
/*                                                                            */
/* ************************************************************************** */

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int N = Integer.parseInt(br.readLine());

        if(N == 0) bw.write(0 + "");
        else {
            Group number = new Group(0, 1, 1);
            for(int i = 1; i < N; i++){
                number = number.nextGroup();
            }
            bw.write(number.current + "");
        }

        bw.flush();
        bw.close();
    }
}

class Group{
    int previous;
    int current;
    int count;

    Group(int previous, int current, int count){
        this.previous = previous;
        this.current = current;
        this.count = count;
    }

    public Group nextGroup() {
        Group result = new Group(
            this.current,
            this.current + this.previous,
            this.count + 1
            );
        return result;
    }
}