trait Participant {
    def attitude: String => String
}

class RNowak extends Participant {
    def attitude = event => "will participate in " + event
    override def toString = "Rafał Nowak"
}

class GitKata2(val participant: Participant) {
    def whoIsGonnaParticipate = {
        println(participant + " " + participant.attitude("GitKata2!"))
    }
}
    
object App {    
    def main(args: Array[String]) = {
        val gitkata2 = new GitKata2(new RNowak)
        gitkata2.whoIsGonnaParticipate
    }
}

