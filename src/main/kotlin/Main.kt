import java.awt.event.MouseAdapter
import java.awt.event.MouseEvent

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
    val person = Person("Aleem","Awan")
    person.printName()

    val user = User("james","jelly")
    val (firstName,lastName) = user

    print("$firstName $lastName" )

    Politics().printPartyLeader(Parties.PTI.also(::println))

    val singleton = University.create()
    singleton.printUniversity()

    Methods.double(3)

    val baseImple = BaseImplementation(3)
    Derived(baseImple).printNumber()
    Derived(baseImple).printDouble()

    fun <T> asList(vararg ts:T):List<T> {
        val result = ArrayList<T>()
        for(t in ts){
            result.add(t)
        }
        return result
    }

    println(asList("raheem","aleem","saleem"))
    println(asList(1,2,3,4,4,5,4,3,23,2,2,"eres",0.5,false))

    val sum : (Int,Int) -> Int = {
        x,y -> x + y
    }
    println(sum(2,3))

    val listWithNulls :List<Int?> = listOf(0,null,1,2,3,4,null,5,6,2)
    var result : Int = 0


    for (item in listWithNulls){
        item?.let{
            result += it
        }
    }

    println(result)

    println("Greater Number is : ${getMaxNumber(3,5)}")

    printGrade(-112)

    for(i in 6 downTo  0 step 2){
        printTable(i)
    }

    val strArray = arrayOf("January","February","March","April","May","June","July")
    for ((index,value) in strArray.withIndex()){
        println("At Position $index, $value")
    }
    var i = 0
    while ( i < 10 ){
        print(i)
        i++
    }

    /**
     * Working with Collection library
     * Lists, Maps and Sets
     */

    val fruits = listOf("Apple","banana","apricot")
    println(fruits[2])

    val newFruits = fruits.map{
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

    val randomNumbers = listOf(1,2,3,4,4,5,6,45,4,3,3,3,4,43,3)
    println(randomNumbers.sum())
    println(randomNumbers.average())
    println(randomNumbers.size)
    println(randomNumbers.maxOrNull())
    println(randomNumbers.minOrNull())
    println(randomNumbers.count())
}





