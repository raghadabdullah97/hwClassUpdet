fun main(args: Array<String>) {
val Courses = courss("CS" , 2 , "Dr.mohamed", mutableListOf("masha", "latefah"))
    val Prof = Professor("Dr.mohamed","alzamel" ,4666 , mutableListOf("OOP" , "OOP2"))
    val St =Student("ragha" , "Abdullah" , "OOP3")

   println(Courses.coursName)
println(Courses.numberOfleactures)
   println( Courses.professor)
println(Courses.students)
    println(Prof.firstName)
   println( Prof.lastName)

    println(St.firstName)
  println(  St.lastName)


}



class courss ( var coursName : String ,var  numberOfleactures :Int ,var  professor : String ,var  students: List<String>) {

   fun numberOfleactures() {
       return
   }
}



class Professor (var firstName : String , var lastName : String ,var telephone : Int ,var  courses : List<String> ) {

    fun fullName () : String = "$firstName $lastName  "
}


class Student (var firstName : String , var lastName : String ,var  courses1 : String ) {

    fun fullName () : String = "$firstName $lastName  "

}
