class Comparison {
  public static void main(String[] args) {
    int a = Integer.parseInt(args[0]);
    int b = Integer.parseInt(args[1]); 

    // String result = a > b ? ("大きいのは" + a + "です") : ("大きいのは" + b + "です");
    // System.out.println(result);
    if(a > b) {
      System.out.println("大きいのは" + a + "です");
    } else if (a < b) {
      System.out.println("大きいのは" + b + "です");
    }
  }
}