class Circle {
  public static void main(String[] args) {
    int radius = Integer.parseInt(args[0]);
    double pi = 3.141592;
    double area2;

    // 小数点第三位以降を切り捨て
    double area = (Math.floor(radius * radius * pi * 100) / 100);

    System.out.println("半径:" + radius);
    System.out.println("面積:" + area);
  }
}