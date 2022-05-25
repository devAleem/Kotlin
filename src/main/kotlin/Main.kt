fun Person.printName(){

    println("This is an extension function ${this.name}")
    print(this)
}

fun main(args: Array<String>) {
    val person:Person = Person("Aleem","Awan")
    person.printName()

    val user = User("james","jelly")
    val (firstName,lastName) = user

    print("$firstName $lastName" )

    Politics().printPartyLeader(2)

}



