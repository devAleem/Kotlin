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
    println(asList(1,2,3,4,4,5,4,3,23,2,2))

}





