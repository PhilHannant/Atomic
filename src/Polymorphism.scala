class Polymorphism {

}


trait Mobile {
  def moves = "moving"
}

class Vechile() extends Mobile {
  override def moves: String = "vrooom " + super.moves
}

class Animals() extends Mobile {
  override def moves: String = "breathing " + super.moves
}


object runner extends App {
  val v = new Vechile
  val a = new Animals
  println(v.moves)
  println(a.moves)


}