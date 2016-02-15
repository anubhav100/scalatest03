case class Employee(empid:Int,empname:String,empsalary:Int)
object Employee extends Ordering[Employee] {


  def compare(A: Employee, B: Employee): Int = {
    if (A.empsalary > B.empsalary)
      1
    if (A.empsalary < B.empsalary)
      -1
    else
      0

  }
}
object Empsort {
  def sort(list:List[Employee]):List[Employee] = list.sorted(Employee)

}
