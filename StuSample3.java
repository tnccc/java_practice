class StuSample3 {
  public static void main(String[] args) {
    Student3 student = new Student3("菅原");
    Student3 student2 = new Student3("田中", 90, 80);

    student.setScore(80, 100);
    student.display();
    student2.display();
  }
}