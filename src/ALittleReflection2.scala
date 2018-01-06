import reflect.runtime.currentMirror

object Name {
  def className(o:Any) =
    currentMirror.reflect(o).symbol.
      toString.replace('$', ' ').split(' ').last
}

trait Name {
  override def toString = Name.className(this)
}


case class caseClass(name:String) extends Name

object printer extends App {
  val cc = caseClass("tester")
  println(cc)
}


