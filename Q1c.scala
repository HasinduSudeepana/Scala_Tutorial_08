import scala.math._

case class Point(x:Int,y:Int)
{
    def power(a:Int,b:Int):Int=(((this.x-a)*(this.x-a))+((this.y-b)*(this.y-b)))
}

object Q1c extends App
{
    var p1=Point(5,6)
    var p2=p1.power(2,3)
    println(sqrt(p2))

}