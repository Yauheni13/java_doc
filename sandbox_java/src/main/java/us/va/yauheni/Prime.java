package us.va.yauheni;

public class Prime {

    public static boolean isPrime(int n){
        for(int i=2; i<n; i++){
            if (n % i == 0) return false;
        }
        return true;
    }
    public static boolean isPrime2(int n) {
        for (int i = 2; i < n / 2; i++) {
            if (n % i == 0) return false;
        }
        return true;
    }
    public static boolean isPrimeSqr(int n) {
        int m = (int) Math.sqrt(n);
        for (int i = 2; i < m; i++) {
            if (n % i == 0) return false;
        }
        return true;
    }

    public static boolean isPrimeW(int n){
        int i=2;
        while(i<n){
            if(n % i == 0) return false;
            i++;
        }
        return true;
    }

    public static boolean isPrimeW2(int n){
        int i=2;
        while(i < n && n % i != 0){
            i++;
        }
        return i == n;
    }

}
