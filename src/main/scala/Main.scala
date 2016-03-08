import akka.actor._

object HelloWorld extends App {
  val system = ActorSystem("system")
  val ref = system.actorOf(Props[MyActor])
  ref ! "HelloWorld"
}

class MyActor extends Actor {
  def receive: Receive = {
    case msg => println(msg)
  }
}
