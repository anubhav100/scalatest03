import scala.collection.mutable.ListBuffer
import scala.concurrent.Future
import scala.concurrent.ExecutionContext.Implicits.global

object FirstFuture  {

  val lst =  List[Int]()
  def getList(list:List[Int]):Future[Int]= {

    val listoffuture = list map {
      case x =>square(x) ::: lst(x)

    }


  }
    def square(number:Int):Future[Int] =Future{

     number * number

    }

  }


