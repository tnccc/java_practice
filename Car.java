class Car {
  int no;
  int speed;

  void setValue(String type ,int n) {
    if(type == "no") {
      no = n;
    } else if (type == "speed") {
      speed = n;
    } else {
      return;
    }
  }

  void stop() {
    speed = 0;
  }

  void display() {
    System.out.println("ナンバー" + no + "の速度は" + speed + "です");
  }
}