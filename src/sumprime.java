import java.util.*;
import java.io.*;

public class sumprime {
    public static void main(String[] args){
        boolean[] sieve = sieve(1000000);
        sieve[1] = false;
        int input = 72;
        int min = Integer.MAX_VALUE;
        for(int i = input; i >=0; i--){
            if(sieve[i] && sieve[input-i]){
                min = Math.min(min, Math.min(i, input-i));
            }
        }
        System.out.println(min + " " + (input-min));
    }

    static boolean[] sieve(int range) {//finds all primes
        boolean[] primes = new boolean[range+1];
        for(int i = 0; i < primes.length;i++) {
            primes[i] = true;
        }

        for(int i = 2; i*i <= range; i++) {
            if(primes[i]) {
                int largestCurrentPrime = i;
                int index = i*i;
                while(index <= range) {
                    primes[index] = false;
                    index+=largestCurrentPrime;
                }
            }

        }

        return primes;
    }
}
