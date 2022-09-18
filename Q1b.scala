
case class Point(x:Int,y:Int)
{
    def move(dx:Int,dy:Int)=(this.x+dx,this.y+dy)
}
object Q1b extends App
{
    val p1=Point(3,5)
    println(p1.move(4,3))
}