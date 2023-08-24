class DataType {
  public static void main(String[] args) {
    int month = 12;
    int day = 29;
    float weight = 63.0f;
    double height = 168.5;
    char bloodType = 'A'; // 1文字のみ表示する場合はchar型を使用する
    String name = "菅原"; // 複数文字であれString

    System.out.println("こんにちは！" + name + "です。");
    System.out.println("身長は" + height + "cm, 体重は" + weight + "kg, ");
    System.out.println("誕生日は" + month + "月" + day + "日、");
    System.out.println("血液型は" + bloodType + "型です");
  }
}