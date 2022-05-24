class Person constructor(firstName:String,lastName:String) {
    private lateinit var firstName: String
    private lateinit var lastName: String

    init {
        this.firstName = firstName
        this.lastName = lastName
    }
    override fun toString(): String {
        return "Person(firstName='$firstName', lastName='$lastName')"
    }

}