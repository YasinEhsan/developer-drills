// 5.8.19

import java.util.*;
import java.io.*; 

public class Main {
    public static void main(String[] args) {
        
        int[] a = {7,2,8,5,0,9,1,2,9,5,3,6,6,7,3,2,8,4,3,7,9,5,7,7,4,7,4,9,4,7,0,1,1,1,7,4,0,0,6}, b = {4,3,2,9}, c = {9,9,9};
        System.out.print(Arrays.toString(plusOne(a)));
        
        
    }
    //atttemt 4. consulted discussion
    public static int[] plusOne(int[] digits) {
        for(int i = digits.length - 1; i >= 0; --i){
            if(digits[i] != 9){
                digits[i]++;
                break;
            } 
            digits[i] = 0;
        }
        
        if(digits[0] == 0){
            digits = new int[digits.length + 1];
            digits[0] = 1;
        }
        
        return digits;
    }
    //attempt 3. dn for all cases too. increments element to 10
    public static int[] plusOneV3(int[] d) {
        int pos = d.length -1;
        int[] a = d;
        boolean carryEnd = false;
        
        while(a[pos] == 9){
            a[pos] = 0;
            if(pos == 0){
                    carryEnd = true;
                    break;
                }
                else 
                    a[pos-1]++;
        }
        
        
        if(a[0] == 0){
            a = new int[a.length + 1];
            a[0] = 1;
        }
        // else if (carryEnd){
        //     a[size-1]++;
        //     System.out.printf("\n%s", "wiiygfuewyif");
        // }
        return a;
    }
    
    //attempt two failed. every 9 carried 1
    public static int[] plusOneV2(int[] d) {
        int size = d.length;
        int[] a = d;
        boolean carryEnd = false;
        
        for(int i = size -1; i>=0; --i){
            if(a[i] == 9){
                a[i] = 0;
                if(i == 0){
                    carryEnd = true;
                    break;
                }
                else 
                    a[i-1]++;
            }
        }
        if(a[0] == 0){
            a = new int[++size];
            a[0] = 1;
        }
        // else if (carryEnd){
        //     a[size-1]++;
        //     System.out.printf("\n%s", "wiiygfuewyif");
        // }
        return a;
    }
    
    //attempt one failed. converted to long and then store each val
    public static int[] plusOneV1(int[] digits) {
        
        /*plan
            - loop digits from back
            - multiply digits[i]*10^i
            - += store
            - ++store;
            - modulo 10 and then divde by ten.
            - store in new or old array?
        
        
        */
        
        long store = 0;
        int power = 0, size = digits.length;
        boolean allNine = true; //this cares for edge case when all 9s i.e. 9999 
        for(int i = size -1; i >= 0; --i){
            // allNine = digits[i] != 9 ? false : true;
            store += (long)Math.pow(10,power++)*digits[i];
            System.out.printf("\n%d", store);
        }
        // System.out.printf("\n%d", store);
        for(int e: digits){
            if(e != 9){
                allNine = !allNine;
                break;
            }
        }
            
        // System.out.printf("\n%d", store);
        store++;
        // System.out.printf("\n%d", store);
        power += allNine ? 0 : -1; 
        size += allNine ? 1 : 0;
        int[] a = new int[size];
        
        for(int i = 0; i < size; ++i){
            a[power--] = (int)(store % 10);
            store /= 10;
        }
        
        return a;
        
    }
    
}
