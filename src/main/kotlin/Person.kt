class Person constructor(firstName:String,lastName:String) {
    private lateinit var name:String

    val firstProperty = "Name : $firstName  $lastName".also(::println)

    init {
        this.name = "${firstName.uppercase()} ${lastName.uppercase()}"
        println("First block that initializes Name $firstName $lastName")
    }

    val secondProperty = "Second Property : ${firstName.length}".also(::println)

    init{
        println("Second block that initializes length ${firstName.length}}")
    }


}