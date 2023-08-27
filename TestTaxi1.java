public class TestTaxi1 extends TestCar1 {
  private int price;

  public void start() {
    this.price = 420;
  }
  public void run() {
    price += 80;
  }
  public void display() {
    System.out.println("料金は" + price + "です");
  }
}
