public final class NewStudent4 extends NewPerson4 {
  private int stuNo;

  public NewStudent4(String name, int stuNo) {
    super(name);
    this.stuNo = stuNo;
  }
  public void display() {
    super.display();
    System.out.println("学籍番号:" + stuNo);
  }
}
