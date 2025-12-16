public class Math {
    public static void main(String[] args) {
        int n = 12;
        // System.out.println("Is Prime: " + isPrime(n));
        // sieve(n);
        int p = 3;

        System.out.printf("%.3f", sqrt(n, p));
    }

    // tc - O(n*n^1/2)
    static boolean isPrime(int n) {
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    // Sieve way to find prime numbers until a number that is given
    static void sieve(int n) {
        boolean[] primes = new boolean[n + 1];
        for (int i = 2; i * i <= n; i++) {
            if (!primes[i]) {
                for (int j = i * 2; j < n; j += i) {
                    primes[j] = true;
                }
            }
        }

        for (int i = 1; i < n; i++) {
            if (!primes[i]) {
                System.out.println(i);
            }
        }

    }

    // Find root upto precision point p
    static double sqrt(int n, int p) {
        int s = 0;
        int e = n;

        double root = 0.0;

        while (s <= e) {
            int m = s + (e - s) / 2;

            if (m * m == n) {
                return m;
            }

            if (m * m > n) {
                e = m - 1;
            } else {
                s = m + 1;
                root = m;
            }
        }

        double incr = 0.1;
        for (int i = 0; i < p; i++) {
            while (root * root <= n) {
                root += incr;
            }
            root -= incr;
            incr /= 10;
        }
        return root;

    }

}
