/* ************************************************************************** */
/*                                                                            */
/*                                                      :::    :::    :::     */
/*   Problem Number: 18870                             :+:    :+:      :+:    */
/*                                                    +:+    +:+        +:+   */
/*   By: abc8325767 <boj.kr/u/abc8325767>            +#+    +#+          +#+  */
/*                                                  +#+      +#+        +#+   */
/*   https://boj.kr/18870                          #+#        #+#      #+#    */
/*   Solved: 2025/08/21 23:10:44 by abc8325767    ###          ###   ##.kr    */
/*                                                                            */
/* ************************************************************************** */

import java.io.*;
import java.util.*;


public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int N = Integer.parseInt(br.readLine());
        Point[] numbers = new Point[N];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i = 0; i < N; i++) {
            numbers[i] = new Point(Integer.parseInt(st.nextToken()), i);
        }
        Arrays.sort(numbers);

        int previous_number = Integer.MIN_VALUE;
        int count = 0;
        int[] result = new int[N];
        for(Point number:numbers){
            if(previous_number != number.value){
                result[number.index] = count;
                count += 1;
                previous_number = number.value;
            } else {
                result[number.index] = count - 1;
            }
        }
        
        StringBuilder sb = new StringBuilder();
        
        for(int elem:result){
            sb.append(elem + " ");    
        }
        bw.write(sb.toString().trim());
        bw.flush();
        bw.close();
    }
}

class Point implements Comparable<Point>{
    int value;
    int index;

    Point(int value, int index){
        this.value = value;
        this.index = index;
    }
    
    @Override
    public int compareTo(Point other){
        return this.value - other.value;
    }
}
