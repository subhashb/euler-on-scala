object Launch {
  def main(args: Array[String]) {
    if(args.length < 2) {
      println("Please choose a problem and its input value!")
      System.exit(0)
    }

    try {
      args(0).toInt match {
        case 5 => Euler5.execute(args(1).toInt)
        case _ => println("Invalid Problem No.")
      }
    } catch {
      case e:Exception => println("Invalid Problem No.")
    }
  }
}
