/* ************************************************************************** */
/*                                                                            */
/*                                                      :::    :::    :::     */
/*   Problem Number: 20920                             :+:    :+:      :+:    */
/*                                                    +:+    +:+        +:+   */
/*   By: abc8325767 <boj.kr/u/abc8325767>            +#+    +#+          +#+  */
/*                                                  +#+      +#+        +#+   */
/*   https://boj.kr/20920                          #+#        #+#      #+#    */
/*   Solved: 2025/09/22 22:15:34 by abc8325767    ###          ###   ##.kr    */
/*                                                                            */
/* ************************************************************************** */

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        HashMap<String, Integer> map = new HashMap<String, Integer>();
        for(int i = 0; i < N; i++){
            String input = br.readLine();
            if(input.length() >= M){
                if(map.containsKey(input)){
                    map.replace(input, map.get(input) + 1);
                } else {
                    map.put(input, 1);
                }
            }
            
        }
        List<Dict> list = new LinkedList<Dict>();
        
        for(String key : map.keySet()){
            list.add(new Dict(key, map.get(key)));
        }
        list.sort(new MyCompactor());
        
        StringBuilder sb =new StringBuilder();
        for(Dict elem : list){
            sb.append(elem.word).append("\n");
        }
        bw.write(sb.toString().trim());
        bw.flush();
        bw.close();
    }
}

class Dict {
    int count;
    String word;

    Dict(String word, int count){
        this.count = count;
        this.word = word;
    }
}

class MyCompactor implements Comparator<Dict>{
    @Override
    public int compare(Dict o1, Dict o2){
        if(o1.count > o2.count) return -1;
        else if(o1.count < o2.count) return 1;

        if(o1.word.length() > o2.word.length()) return -1;
        else if(o1.word.length() < o2.word.length()) return 1;
        
        return o1.word.compareTo(o2.word);
    }
}

