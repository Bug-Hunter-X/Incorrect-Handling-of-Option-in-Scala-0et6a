```scala
import scala.util.Try

case class User(id: Int, name: String)

object Main extends App {
  val users = List(User(1, "John"), User(2, "Jane"))

  val maybeUser = users.find(_.id == 3)

  // Incorrect handling of Option
  val userId = maybeUser.getOrElse(User(0, "Unknown")).id

  println(s"User ID: $userId")
}
```