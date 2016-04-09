package traitsinheritance

/**
  * Created by geoff_000 on 09/04/2016.
  */
sealed trait DivisionResult

case class Finite(res:Int) extends DivisionResult
case object Infinite extends DivisionResult

object divide{
  def apply(x:Int,y:Int)= {
    if (y == 0) Infinite
    else Finite(x/y)
  }

}
