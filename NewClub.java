public abstract class NewClub {
  private String name;

  public NewClub(String name) {
    this.name = name;
  }
  public void display() {
    System.out.println("部活動" + name);
  }
  public abstract void practice();
}