/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package princetonexamples_1_3;

/**
 *
 * @author Fabien
 */
public class test1_3 {
    
    public static void main(String[] args) {
//        int n =100;
//        System.out.println(Integer.toBinaryString(n));
//        Output:
//        1100100
        
//*********************************************************************************
        
        // testing break statement
//        for (int i = 0; i < 10; i++) {
//            System.out.println(i);
//            if(i == 4) break;
//        }
        // Output: 0 1 2 3 4
//        for (int i = 0; i < 4; i++) {
//            System.out.println(i);
//            for (int j = 0; j < 3; j++) {
//                System.out.println(j);
//                if(j == 1) break;
//            }
//            
//        }
        
//*******************************************************************************
        
        // testing continue statement
        
//        for (int i = 0; i < 10; i++) {
//            if(i == 4 || i == 8) continue;
//            System.out.println(i);
//        }
//        // Output: 0 1 2 3 5 6 7 9
        
//*******************************************************************************
        
//        int n = 3;
//        while (--n != 0) {
//                System.out.println(n);
//            }
//        int p = 0;
//        while(++p < 3){
//            System.out.println(p);
//        }
        // Output: 2 1   1 2
        
//        int n = 3;
//        while (n-- != 0) {
//                System.out.println(n);
//            }
//        int p = 0;
//        while(p++ < 3){
//            System.out.println(p);
//        }
        // Output: 2 1 0   1 2 3
        
//********************************************************************************
        
        // testing labeled break
//        int[][] arrayOfInts = { 
//            { 32, 87, 3, 589 },
//            { 12, 1076, 2000, 8 },
//            { 622, 127, 77, 955 }
//        };
//        int searchfor = 12;
//
//        int i;
//        int j = 0;
//        boolean foundIt = false;
//
//    search:
//        for (i = 0; i < arrayOfInts.length; i++) {
//            for (j = 0; j < arrayOfInts[i].length;
//                 j++) {
//                if (arrayOfInts[i][j] == searchfor) {
//                    foundIt = true;
//                    break search;
//                }
//            }
//        }
//
//        if (foundIt) {
//            System.out.println("Found " + searchfor + " at " + i + ", " + j);
//        } else {
//            System.out.println(searchfor + " not in the array");
//        }
        // Output: Found at 1, 0
        
//*******************************************************************************
        
        // testing label continue
        
//        String searchMe = "Look for a substring in me";
//        String substring = "sub";
//        boolean foundIt = false;
//
//        int max = searchMe.length() - 
//                  substring.length();
//
//    test:
//        for (int i = 0; i <= max; i++) {
//            int n = substring.length();
//            int j = i;
//            int k = 0;
//            while (n-- != 0) {
//                if (searchMe.charAt(j++) != substring.charAt(k++)) {
//                    continue test;
//                }
//            }
//            foundIt = true;
//                break test;
//        }
//        System.out.println(foundIt ? "Found it" : "Didn't find it");
        // Output: Found it
        
//*******************************************************************************
//        for (int i = 0; i < 2; i++)
//            for (int j = 0; j < 2; j++)
//                System.out.println("#");
//                System.out.println("$");
        // Output: # # # # $       
            
//        for (int i = 0; i < 3; i++)
//            System.out.println(i+1);
//            //System.out.println(i+2);   // Error: can not find symbol
        
//*******************************************************************************
//        System.out.print("2");
//        System.out.print('\t'); // System.out.print("\t");
//        System.out.print("1");
//        // Output: 2	1  // tab = 4*spaces
        
//********************************************************************************
        
//        int n = 123456789;
//        int m = 0;
//        while (n != 0) {
//           m = (10 * m) + (n % 10);
//           n = n / 10;
//        }
//        System.out.println("n: " + n);
//        System.out.println("m: " + m);
//        // Output: n: 0  m: 987654321
        
//********************************************************************************
        // Fibonacci numbers
//        int f = 0, g = 1;
//        for (int i = 0; i <= 15; i++) {
//           System.out.println(f + "  " + g);
//           f = f + g;
//           g = f - g;
//        }
        
//*******************************************************************************
        
//        int a = 3;
//        double x;  
//        if (a >= 0) x = 3.14;
//        if (a <  0) x = 2.71;
//        System.out.println(x);
        // Compilation error: variable x might not have been initialized
        // Solution
//        int a = 3;
//        double x;
//        if(a >= 0) x = 3.14;
//        else x = 2.71;
//        System.out.println(x);
        // Output: 3.14
        
//******************************************************************************
        
//        int N = 3;
//        for (int i = 0; i < N; i++)
//        for (int j = 0; j < N; j++)
//            if (i != j) System.out.println(i + ", " + j);
//
//        for (int i = 0; i < N; i++)
//           for (int j = 0; (i != j) && (j < N); j++)
//               System.out.println(i + ", " + j);
//
//        Output: 
//        0, 1
//        0, 2
//        1, 0
//        1, 2
//        2, 0
//        2, 1
//        1, 0
//        2, 0
//        2, 1
        
//******************************************************************************
        
//        int cnt = 0;
//        for (int i = 0; i < 10; i++)
//           for (int j = 0; j < 10; j++)
//              for (int k = 0; k < 10; k++)
//                 if (2*i + j >= 3*k)
//                    cnt++;
//        System.out.println(cnt);
       // Output: 517
        
//*******************************************************************************
        
//        int M = 987654321;
//        String s = "";
//        while (M != 0) {
//           int digit = M % 10;
//           s = s + digit;
//           M = M / 10;
//        }
//        System.out.println(s);
        
        // Output: 123456789
        
//*********************************************************************************
        
        int i = 10;
        System.out.println("i = " + i);
        
        int j = 2;

        i = i++;
        System.out.println("(i = i++) = " + i);

        i = ++i;
        System.out.println("(i = ++i) = " + i);

        i = i++ + ++i;
        System.out.println("(i = i++ + ++i) = " + i);
        
        
        
        
    }
        
    }
    

