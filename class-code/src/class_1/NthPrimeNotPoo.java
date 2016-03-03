package class_1;

public class NthPrimeNotPoo {
  
  private static int[] primes;
  private static int len;

  private static boolean isPrime(int k){
    for(int i = 0; i < len; i++) {
      if(2*primes[i] > k)
        return true;
      else if((k % primes[i]) == 0)
        return false;
    }
    return true;
  }

  public static void main(String[] args) {
    if(args.length != 1) {
      System.err.println("Usage: java NthPrimeNotPoo n");
      System.exit(1);
    }
    int n = Integer.parseInt(args[0]);
    if(n <= 0) {
      System.err.println("n must be greather than zero!");
      System.exit(1);
    }

    System.out.println("Everything Ok!");

    primes = new int[n];
    len = 0;
    for(int i = 2; len < n; i++) {
      if(isPrime(i)) {
        primes[len++] = i;
      }
    }
    for(int i = 0; i < len; i++)
      System.out.println("[" + i + "] : " + primes[i]);
  }
}