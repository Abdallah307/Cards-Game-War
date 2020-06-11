import java.io.*;
import java.util.*;

public class Solution {
    static int a[];

    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
        int size = input.nextInt();
       a = new int[size];
        
        for(int i=0;i<size;i++) {
            a[i] = input.nextInt();
        }
        
         f(0 , size-1);
        
    }
    
        public static void f(int start , int end) {
        int x = 0;
        int dynamic[][] = new int[end][end+1];
        //first loop is to fill the table with the known values
        int counter = 0;
        for(int j=1;j<end+1;j++) {
            if(a[counter] > a[j]) {
                dynamic[counter][j] = a[counter];
            }
            else{
                dynamic[counter][j] = a[j];
            }
            counter = counter+1;
        }


        for(int i=3;i<end+1;i=i+2) {
            int adder = 0;
            for(int j=i;j<end+1;j++) {
                int com1 = dynamic[adder+2][j];
                int com2 = dynamic[adder+1][j-1];
                int com3 = dynamic[adder+1][j-1];
                int com4 = dynamic[adder][j-2];

                int s1;
                int s2;

                if(com1<com2) {
                    s1 = com1 + a[adder];
                }
                else s1 = com2 + a[adder];

                if(com3<com4) {
                    s2 = com3 + a[j];
                }
                else s2 = com4 + a[j];

                if(s1>s2) {
                    dynamic[adder][j] = s1;
                }
                else dynamic[adder][j] = s2;

                adder++;
            }
        }
        System.out.println(dynamic[start][end]);

    }
    
    
}
