import java.util.StringJoiner

val productValues : (x:Int, y:Int) -> Unit = {
        x,y -> println(x*y)
}

val sumValues = {
        x:Int,y:Int,z:Int -> println(x+y+z)
}

val evenList = listOf(1,2,34,4,3).filter {
    it.mod(2) == 0
}

val printKeyValue:(Pair<String,Int>) -> Unit = {
    (key,value) -> println("Key:$key, value:$value")
}

fun processLanguages(languages:List<String>,action:(String)-> Unit){
    languages.forEach(action)
}

/**
 * SAM(Single Access Method) conversion
 * If you need to provide an instance of an interface with a single abstract method,
 * SAM conversion lets us use a lambda to represent that interface rather than having
 * to instantiate a new class instance to implement the interface.
 *
 * Example os SAM conversion is below
 */

interface Greeter{
    fun greet(item:String)
}

fun greetPersons(persons:List<String>,greeter: Greeter){
    persons.forEach { greeter.greet(it) }
}
