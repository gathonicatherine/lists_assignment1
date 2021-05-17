fun evenIndices(names:List<String>): List<String> {
    var  nameList= mutableListOf<String>()

    names.forEach { name-> if (names.indexOf(name) % 2== 0) {
        nameList.add(name)
    } }

    return nameList
}

fun heights(heights:List<Double>):String{
var heightsAverage = heights.average()
    var total = heights.sum()
    return "$heightsAverage is the average heights and $total is the total height"
}

data class Person(var name:String, var age:Int, var height:Double, var weight:Double)
fun sorted(person:MutableList<Person>){
    var sortedPerson=person.sortedByDescending { person->person.age }
    println(sortedPerson)
}
data class Car(var registration:String,var mileage:Int)
fun gariList(cars:List<Car>):Int{
    var total=0
    for (gari in cars){
       total+gari.mileage
    }
    val average=total/cars.size
    return average
}


fun main() {
    println(evenIndices(mutableListOf("Mercy","Talia","Cayt","Cate","Shanice","Chelly","Shikoh","Shekeh")))
    println(heights(mutableListOf(64.3,41.5,58.6,78.8,55.0,67.1,98.0)))
var person = mutableListOf<Person>(
    Person("Quinter",12,56.9,78.0),
    Person("Alpha",23,3.5,90.0),
    Person("Shanice",45,67.0,65.9)
)
    sorted(person)
    
    var cars =(mutableListOf<Car>(
        Car("KCT",121400)
        ))
println(gariList(cars))
}
