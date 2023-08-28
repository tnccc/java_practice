public class NewStudent5 {
  private String name;
  private NewClub club;

  public NewStudent5 (String name, NewClub club) {
    this.name = name;
    this.club = club;
  }

  public void display() {
    System.out.println("名前:" + name);
    club.display();
  }
  public void practice() {
    club.practice();
  }
}
