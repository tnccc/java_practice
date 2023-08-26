public class NewStudent3 extends NewPerson3 {
  private int stuNo;

  public NewStudent3(String name) {
    this(name, 999);
  }
  public NewStudent3(String name, int stuNo) {
    super(name);
    this.stuNo = stuNo;
  }
  public void display() {
    super.display();
    System.out.println("学籍番号:" + stuNo);
  }
}