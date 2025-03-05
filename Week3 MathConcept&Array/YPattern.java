class Solution {
  static void yShapedPattern(int N) {
    
      for (int i = 0; i < N / 2; i++) {
          for (int j = 0; j < N; j++) {
              if (j == i || j == N - i - 1) {
                  System.out.print(" *");
              } else {
                  System.out.print(" ");
              }
          }
          System.out.println();
      }

      for (int i = N / 2; i < N; i++) {
          for (int j = 0; j < N; j++) {
              if (j == N / 2) {
                  System.out.print(" *");
              } else {
                  System.out.print(" ");
              }
          }
          System.out.println();
      }
  }

  public static void main(String[] args) {
      int N = 4; 
      yShapedPattern(N);
  }
}
