class DriveCar {
  public static void main(String[] args) {
    Car c1 = new Car();

    c1.setValue("no", 2525);
    c1.setValue("speed", 30);
    c1.display();

    c1.stop();
    c1.display();
  }
}