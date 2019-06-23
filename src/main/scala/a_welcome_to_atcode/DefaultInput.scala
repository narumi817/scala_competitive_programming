package a_welcome_to_atcode

import java.util.Scanner

import scala.io.StdIn.readLine

// 標準入力確認したい
object DefaultInput {

  def main(args: Array[String]): Unit = {
//    normal()
    scan()
  }

  /**
    * 普通に書いてみる
    */
  def normal(): Unit = {
    // readLine : 標準入力の行を読む String
    // split : Stringを引数の文字で分割する Array[Char]
    // map : Arrayのデータを新しいコレクションにする
    // map(_.toInt) => map(x => x.toInt) と一緒
    val in = readLine.split(" ").map(_.toInt)

    for (e <- in) {
      println(e)
    }
  }

  /**
    * Java.util.Scanner を使う
    */
  def scan(): Unit = {
    // https://docs.oracle.com/javase/jp/8/docs/api/java/util/Scanner.html
    // 必要な文字列だけ読み込める
    // 変数に入れるときに順番にパースしながら入れれる
    // デフォルトの区切り文字は空白文字(改行も)
    val sc = new Scanner(System.in)
    val a = sc.nextInt // 最初の整数を取得 数字じゃないとエラーになる
    val b = sc.nextInt
    val c = sc.nextInt
    println(a)
    println(b)
    println(c)
  }


}
