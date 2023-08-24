class Array {
  public static void main(String[] args) {
    // 宣言 => 生成 => 代入
    // int[] score = new int[3];
    // score[0] = 80;
    // score[1] = 100;
    // score[2] = 75;

    // 配列の初期化
    String[] name = {"菅原", "村山", "寺島"};
    int[] score = {80, 100, 75};

    for(int i = 0; i < score.length; i++) {
      System.out.println(name[i] + "さん:" + score[i] + "点");
    }
  }
}