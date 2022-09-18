
case class Point (x:Int,y:Int)
{
    def +(that:Point)=(this.x+that.x,this.y+that.y)
}

object Q1a extends App
{
    val p1=Point(3,4)
    val p2=Point(5,2)
    val p3=p1+p2
    println(p3)
}
 