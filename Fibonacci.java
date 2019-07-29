/**
 * The Fibonacci numbers, commonly denoted F(n) form a sequence, called the Fibonacci sequence, such that each number is the sum of the two preceding ones, starting from 0 and 1. That is,
 *
 * F(0) = 0,   F(1) = 1
 * F(N) = F(N - 1) + F(N - 2), for N > 1.
 * Given N, calculate F(N).
 */

/**
 * Using Recurssion
 */
public class Fibonacci {
    public int fib(int N) {
        if (N <= 1) {
            return N;
        } else {
            return fib(N - 1) + fib(N - 2);
        }
    }


/**
 * Using Dynamic Programming
 */
    public int fibDP(int N) {
        if (N<=1>) {
            return N;
        }

        int[] fib_cache = new int[N+1];
        fib_cache[1] = 1;

        for(int i=2; i<=N; i++) {
            fib_cache[i] = fib_cache[i-1] + fib_cache[i-2];
        }
        return fib_cache[N];
    }
}