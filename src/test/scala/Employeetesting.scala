import org.scalatest.FunSuite

/**
  * Created by knoldus on 15/2/16.
  */
class Employeetesting extends FunSuite{

  test("testing for sorting") {
    val l =Empsort.sort(List(Employee(4,"anubhav",20000), Employee(1,"anubhav",2000)))
    assert(l ===List(Employee(1,"anubhav",2000), Employee(4,"anubhav",20000)))
  }
}
