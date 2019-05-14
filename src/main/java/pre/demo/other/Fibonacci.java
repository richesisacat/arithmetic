package pre.demo.other;

/**
 * 斐波那契非递归实现
 */
public class Fibonacci {

  public static void main(String[] args) {
    System.out.println(fib(5));
  }

  public static long fib(int n) {
    long first = 1;
    long second = 1;
    long fn;

    for (int i = 3; i <= n; i++) {
      fn = first + second;
      first = second;
      second = fn;
    }
    return second;
  }

}
