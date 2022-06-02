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