public class TestTaxi2 extends TestCar2 {
  private int price;

  public TestTaxi2(int no) {
    super(no);
    this.price = 0;
  }

  public TestTaxi2(int no, int price) {
    super(no);
    this.price = price;
  }

  public void start() {
    this.price = 420;
  }
  public void run() {
    price += 80;
  }
  public void display() {
    super.display();
    System.out.println("料金は" + price + "です");
  }
}
