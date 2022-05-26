interface NumberPrinter {
    fun printNumber()
    fun printDouble()
}

class BaseImplementation(val x:Int) : NumberPrinter{
    override fun printNumber() {
       print("Number is $x")
    }

    override fun printDouble() {
        print("Number is doubled in BaseImple ${ x * 2 }")
    }
}


class Derived(numberPrinter:NumberPrinter): NumberPrinter by numberPrinter{

}