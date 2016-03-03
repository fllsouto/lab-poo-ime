public class NthPrimePoo {

  int[] primes;
  int max;
  int contPrime;

  //Construtor publico da classe
  public NthPrimePoo(int maxPrime) {
    primes = new int[maxPrime];
    max = maxPrime;
    primes[0] = 2;
    contPrime = 1;
  }

  public int cont() { return contPrime; }
  public int max() { return max; }
  public int lastPrime() { return primes[contPrime-1]; }

  private boolean isPrime(int k) {
    for(int i = 0; i < contPrime; i++) {
      if(2*this.primes[i] > k)
        return true;
      else if((k % this.primes[i]) == 0)
        return false;
    }
    return true;
  } 

  private void advancePrimes() {
    int k = 0;
    for(k = this.lastPrime() + 1; !this.isPrime(k); ++k)
      ;
    this.primes[this.contPrime] = k;
    this.contPrime++;
  }

  private void calculateLastPrime() {
    while(this.cont() < this.max())
      this.advancePrimes();
  }

  private void showLastPrime() {
    System.out.println("The " + this.cont() + " is " + this.lastPrime());
  } 

  //Tratamento dos dados
  public static void main(String[] args) {
    if(args.length < 0) {
      System.err.println("Usage : java NthPrimePoo n");
      System.exit(1);
    }
    int n = Integer.parseInt(args[0]);
    if(n < 0) {
      System.err.println("n must be greather than zero!");
      System.exit(1);
    }

    NthPrimePoo p = new NthPrimePoo(n);
    p.calculateLastPrime();
    p.showLastPrime();
  }
}