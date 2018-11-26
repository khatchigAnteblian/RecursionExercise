/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package recursion;
import java.util.Scanner;

/**
 *
 * @author 345983704
 */
public class Recursion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Question 1
//        System.out.print("Enter X: ");
//        int x = sc.nextInt();
//        System.out.print("Enter N: ");
//        int exp = sc.nextInt();
//        System.out.println(exponent(x, exp));
//        
//        // Question 2
//        System.out.print("Enter M: ");
//        int m = sc.nextInt();
//        System.out.print("Enter N: ");
//        int n = sc.nextInt();
//        System.out.println(gcd(m, n));
//        
//        // Question 3
//        System.out.print("Enter an integer: ");
//        int i = sc.nextInt();
//        System.out.println(square(i));
//        
//        // Question 4
//        System.out.print("Enter an integer: ");
//        int j = sc.nextInt();
//        System.out.println(prime(j, j-1));
//        
//        // Question 5
//        System.out.print("Enter an integer: ");
//        int num = sc.nextInt();
//        System.out.println(digitSum(num));
        
        // Question 6
    }
    
    // 1) X to the power of n recursively
    public static int exponent(int x, int exp) {
        // Base case
        if (exp == 1) {
            return x;
        }
        // X^n is the same as X * X^n-1
        return x * exponent(x, exp-1);
    }
    
    // 2) Euclid's gcd algorithm
    public static int gcd(int m, int n) {
        // Base case
        if (m == n) {
            return m;
        }
        // If m is greater, return gcd(n, m-n)
        if (m > n) {
            return gcd(n, m-n);
        }
        // If n is greater, swap m and n
        return gcd(n, m);
    }
    
    // 3) Square numbers
    public static int square(int x) {
        // Base case
        if (x == 1) {
            return 1;
        }
        // Square number definition
        return square(x - 1) + ((2 * x) - 1);
    }
    
    // 4) Primes
    public static boolean prime(int x, int y) {
        // Base case
        if (y == 1) {
            return true;
        }
        // If the number is divisible by an intger, it's not prime
        if (x % y == 0) {
            return false;
        }
        return prime(x, y-1);
    }
    
    // 5) Sum of digits
    public static int digitSum(int num) {
        // Base case
        if (num / 10 == 0) {
            return num;
        }
        // Mod by ten and remove last digit
        return num % 10 + digitSum(num / 10);
    }
    
    // 6) N Triangle
//    public static int nTriangle(int n, int k) {
//        if (n < 1) {
//            return 0;
//        }
//        System.out.print()
//    }
}
