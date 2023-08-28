package mypack;

public class NewTaxi03 extends Vehicle implements Stopable {

  public NewTaxi03 (int crewNum) {
    this.crewNum = crewNum;
  }
  public void showCrewNum() {
    System.out.println("タクシーの乗客:" + crewNum + "客");
  }
  public void stop() {
    System.out.println("ここ降ります");
  }
}
