case class Point(x:Int,y:Int)
{
    def swap()=new Point(this.y,this.x)
}

object Q1d extends App
{
    val p1=Point(4,9)
    println(p1.swap())

}