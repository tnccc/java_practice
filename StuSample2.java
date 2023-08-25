class StuSample2 {
  public static void main(String[] args) {
    Student2 student = new Student2();
    Student2 student2 = new Student2();

    student.setData("菅原");
    student.setScore(90, 80);
    student.display();

    student2.setData("村山", 75, 100);
    student2.display();
  }
}