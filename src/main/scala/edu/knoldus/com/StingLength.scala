package edu.knoldus.com
import scala.annotation.tailrec

class StingLength(list:List[Int]) {
  @tailrec
   final def length(list:List[Int],accumulator:Int):Int=
     if(list.isEmpty) accumulator
     else length(list.tail,accumulator + 1)

  val requiredLength: Int =length(list,0)
}
object main extends App{
  val obj= new StingLength(List())
  println(obj.length(List(1,2,3,4,5,6,7,8,10,111),0))
  println(obj.length(List(),0))

}