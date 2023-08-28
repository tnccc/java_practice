package mypack;

public class NewTrain extends Vehicle {

  public NewTrain(int crewNum) {
    this.crewNum = crewNum;
  }
  public void showCrewNum() {
    System.out.println("電車の乗客:" + crewNum + "名");
  }
}
