import java.io.*;
import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int testCases;
        testCases = sc.nextInt();
        sc.nextLine();
        String[] name = new String[testCases];
        for(int i=0;i<name.length;i++){
        name[i] = sc.nextLine();
        }
            for(int i=0;i<testCases;i++){
            char[] nameArray = new char[name[i].length()];
            for(int j=0;j<name[i].length();j++){
                nameArray[j] = name[i].charAt(j);
            }
            for(int j=0;j<name[i].length();j++){
                if(j%2==0){
                    System.out.print(nameArray[j]);
                }
            }
            System.out.print(" ");
            for(int k =0;k<name[i].length();k++){
                if(k%2!=0){
                    System.out.print(nameArray[k]);
                }

            }
             System.out.println();
            
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    }
    sc.close();
}
}
