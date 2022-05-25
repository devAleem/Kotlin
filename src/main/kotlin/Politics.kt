class Politics() {

}

fun Politics.printPartyLeader(partyName:Any) {
    when(partyName){
       is Parties -> print("Imran khan is chairman of Pti ")
        else -> print("Belongs to other")
    }
}