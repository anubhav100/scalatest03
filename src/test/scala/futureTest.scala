import org.scalatest.FunSuite

import scala.concurrent.{Future, Await}

import scala.concurrent.duration._

class futureTest extends FunSuite {
  val li = List(1,2,3)
 val listoffutureofInt =FirstFuture.getList(li)
  val l1 = Await.result(listoffutureofInt,10 seconds)
  println(l1)
assert(l1 === Future.firstCompletedOf(li))


}
