```scala
import scala.util.Try

case class User(id: Int, name: String)

object Main extends App {
  val users = List(User(1, "John"), User(2, "Jane"))

  val maybeUser = users.find(_.id == 3)

  // Correct handling of Option using pattern matching
  maybeUser match {
    case Some(user) => println(s"User ID: ${user.id}")
    case None => println("User not found")
  }
}
```