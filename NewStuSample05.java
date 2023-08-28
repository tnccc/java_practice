public class NewStuSample05 {
  public static void main(String[] args) {
    TandF taf = new TandF("陸上競技部");
    FootBall fb = new FootBall("サッカー部");

    NewStudent5 stu1 = new NewStudent5("菅原", taf);
    stu1.display();
    stu1.practice();
  
    NewStudent5 stu2 = new NewStudent5("田中", fb); 
    stu2.display();
    stu2.practice();
  }
}
