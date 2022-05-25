import java.util.StringJoiner
import javax.swing.UIManager.get

fun Person.printName(){

    println("This is an extension function ${this.name}")
    print(this)
}

fun main(args: Array<String>) {
    val person:Person = Person("Aleem","Awan")
    person.printName()
}



