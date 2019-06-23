package a_welcome_to_atcode

import java.util.Scanner

/**
  * 【問題文】
  * 高橋君はデータの加工が行いたいです。
  *
  * 整数 a,b,c と、文字列 s が与えられます。
  *
  * a + b + c の計算結果と、文字列 s を並べて表示しなさい。
  *
  * 【制約】
  * 1 ≤ a, b, c ≤ 1,000
  * 1 ≤ |s| ≤ 100
  *
  * 【入力】
  * 入力は以下の形式で与えられる。
  * a
  * b c
  * s
  *
  * 【出力】
  * a + b + c と s を空白区切りで 1行に出力せよ。
  * また、出力の末尾には改行を入れること。
  */
object A {
  def main(args: Array[String]): Unit = {
    val sc = new Scanner(System.in)
    val a,b,c = sc.nextInt
    val s = sc.next

    println((a + b + c) + " " + s)
  }
}
