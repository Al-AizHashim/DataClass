data class Person(val name: String) {
    var age: Int = 0
}
class People(val name:String){
    var age: Int = 0
}
fun main() {
//sampleStart
    val person1 = Person("John")
    val person2 = Person("John")
    person1.age = 10
    person2.age = 20
    val people1 = People("John")
    val people2 = People("John")
    people1.age = 10
    people2.age = 20
//sampleEnd
    println(message = "person1 == person2: ${person1 == person2}")
    //println("person1 with age ${person1.age}: ${person1}")
   // println("person2 with age ${person2.age}: ${person2}")
    println("person1 == person2: ${person1}")

    println(message = "people1 == people2: ${people1 == people2}")
    //println("person1 with age ${person1.age}: ${person1}")
    // println("person2 with age ${person2.age}: ${person2}")
    println("people1 == people2: ${people1}")
}