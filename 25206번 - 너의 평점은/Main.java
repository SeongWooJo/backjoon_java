/* ************************************************************************** */
/*                                                                            */
/*                                                      :::    :::    :::     */
/*   Problem Number: 25206                             :+:    :+:      :+:    */
/*                                                    +:+    +:+        +:+   */
/*   By: abc8325767 <boj.kr/u/abc8325767>            +#+    +#+          +#+  */
/*                                                  +#+      +#+        +#+   */
/*   https://boj.kr/25206                          #+#        #+#      #+#    */
/*   Solved: 2025/08/06 19:05:28 by abc8325767    ###          ###   ##.kr    */
/*                                                                            */
/* ************************************************************************** */
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

       
        String line;
        float total_grade = 0.0f;
        float sum_grade = 0.0f;
        while((line = br.readLine()) != null){
            String arr_str[] = line.split(" ");
            
            float grade_point = Float.parseFloat(arr_str[1]);
            String str_grade = arr_str[2];
            
            float grade = 0.0f;

            switch(str_grade.charAt(0)){
                case 'A':
                    grade+=1;
                case 'B':
                    grade+=1;
                case 'C':
                    grade+=1;
                case 'D':
                    grade+=1;
                default:
                    break;
            }
            if(str_grade.length() > 1){
                switch(str_grade.charAt(1)){
                    case '+':
                        grade+=0.5f;
                        break;
                    case '0':
                    default:
                        break;
                }
            } else {
                if(str_grade.charAt(0) == 'P'){
                    grade_point = 0.0f;
                }
            }
            
            total_grade += grade * grade_point;
            sum_grade += grade_point;
        }
        
        
        bw.write("" +total_grade/sum_grade);
        bw.flush();
        bw.close();
    }
}

