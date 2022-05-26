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
}





