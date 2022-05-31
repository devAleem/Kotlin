import kotlin.math.abs


object Methods {

   fun double(x:Int):Int = x * 2

}

fun getMaxNumber(a:Int,b:Int):Int{
   val max = if (a > b) {
      a
   } else{
      b
   }
   return max
}

fun printGrade(x:Int) {
   when(abs(x)){
      in 90..100 -> print("grade a+")
      in 80..90-> print("grade a")
      in 65..80 -> print(" grade b")
      in 50..65 -> print("You have grade c")
      in 0..49 -> print("Sorry You have failed")
      else -> print("Percentage can be between 0 to 100")
   }

}
fun printTable(table:Int){
   for (i in 0..10){
      println("$table * $i = ${table * i}")
   }
}

