class Cast {
  public static void main(String[] args) {
    int price = Integer.parseInt(args[0]);
    double rate = 0.08;
    int amount;

    /* 
      データを大きい方から小さい方に変更しているので、
      キャストをする必要がある。
    */
    amount = (int) (price * (1 + rate));
    System.out.println("税込金額" + amount + "円");
  }
}