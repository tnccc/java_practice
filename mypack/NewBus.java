package mypack;

public class NewBus extends Vehicle implements Stopable {
  public NewBus(int crewNum) {
    this.crewNum = crewNum;
  }
  public void showCrewNum() {
    System.out.println("バスの乗客:" + crewNum);
  }
  public void stop() {
    System.out.println("次止まります");
  }
}
