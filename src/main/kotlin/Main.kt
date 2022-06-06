import java.awt.event.MouseAdapter
import java.awt.event.MouseEvent
import kotlin.random.Random

fun Person.printName(){

    println("This is an extension function ${this.name}")
    print(this)
}

object DefaultListener:MouseAdapter(){
    override fun mouseClicked(e: MouseEvent?) {
        super.mouseClicked(e)
        print(e)
    }
}
fun main() {
    val person = Person("Aleem", "Awan")
    person.printName()

    val user = User("james", "jelly", age = 32)
    val (firstName, lastName) = user

    print("$firstName $lastName")

    Politics().printPartyLeader(Parties.PTI.also(::println))

    val singleton = University.create()
    singleton.printUniversity()

    Methods.double(3)

    val baseImple = BaseImplementation(3)
    Derived(baseImple).printNumber()
    Derived(baseImple).printDouble()

    fun <T> asList(vararg ts: T): List<T> {
        val result = ArrayList<T>()
        for (t in ts) {
            result.add(t)
        }
        return result
    }

    println(asList("raheem", "aleem", "saleem"))
    println(asList(1, 2, 3, 4, 4, 5, 4, 3, 23, 2, 2, "eres", 0.5, false))

    val sum: (Int, Int) -> Int = { x, y ->
        x + y
    }
    println(sum(2, 3))

    val listWithNulls: List<Int?> = listOf(0, null, 1, 2, 3, 4, null, 5, 6, 2)
    var result: Int = 0


    for (item in listWithNulls) {
        item?.let {
            result += it
        }
    }

    println(result)

    println("Greater Number is : ${getMaxNumber(3, 5)}")

    printGrade(-112)

    for (i in 6 downTo 0 step 2) {
        printTable(i)
    }

    val strArray = arrayOf("January", "February", "March", "April", "May", "June", "July")
    for ((index, value) in strArray.withIndex()) {
        println("At Position $index, $value")
    }
    var i = 0
    while (i < 10) {
        print(i)
        i++
    }

    /**
     * Working with Collection library
     * Lists, Maps and Sets
     */

    val fruits = listOf("Apple", "banana", "apricot")
    println(fruits[2])

    val newFruits = fruits.map {
        it.uppercase()
    }
    println(newFruits)

    fruits.mapIndexed { index, s ->
        println("$index at position $s")
    }

    val newFilterItems = fruits.filter {
        it.length > 5
    }
    print(newFilterItems)

    val randomNumbers = listOf(1, 2, 3, 4, 4, 5, 6, 45, 4, 3, 3, 3, 4, 43, 3)
    println(randomNumbers.sum())
    println(randomNumbers.average())
    println(randomNumbers.size)
    println(randomNumbers.maxOrNull())
    println(randomNumbers.minOrNull())
    println(randomNumbers.count())
    println(randomNumbers.count {
        it <= 5
    })
    println(randomNumbers.joinToString(","))


    /**
     * Advanced kotlin collection functions any() , none(),all()
     */

    val userGroup = listOf(
        User("Aleem", "Awan", 25),
        User("Fardeen", "bizmatic", 22),
        User("Mureed", "Abbas", 28),
        User("Saad", "Habib", 32)
    )

    var res = userGroup.any { it.age > 30 }
    println(res)

    res = userGroup.none { it.age > 30 }
    println(res)

    res = userGroup.all { it.age > 20 }
    println(res)


    val numbers = listOf(1, 2, 3, 4, 5)
    var resultarr = numbers.reduce { acc, value ->  acc + value }
    println(resultarr)

    resultarr = numbers.fold(2){
        acc, i ->
        acc + i
    }

    print(resultarr)

    /**
     * More on Kotlin Collection Lists
     */

    println("My name is aleem".replace("\\s".toRegex(),"").toList())

    var sequence = generateSequence {
        Random.nextInt(50).takeIf { it > 25 }
    }

   var read:MutableList<Int> = (5..50 step 5).toMutableList()
   println(read)
    println(read.slice(read.lastIndex downTo 0 step 2))

    read.add(2)

    /**
     * [evenList] filters even numbers from list
     */

    println(evenList)
    printKeyValue("id" to 5)

    /**
     * [processLanguages] is higher oreder function that takes lambda as argument
     */

    val languages =  listOf("Kotlin","php","python","java","c++","javascript")
    processLanguages(languages) {
        println(it )
    }


    val persons = listOf("Saad","Fardeen","Mureed Abbas")

    greetPersons(persons,object : Greeter {
        override fun greet(item: String) {
            println("Hello $item")
        }
    })

}




