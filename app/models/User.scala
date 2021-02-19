package models

case class User(
  email: String,  //Primary key
  name: String,
)

object User {
  val sunni: User = User("sunni@com", "Sunni")
  val Chris: User = User("chris@com", "Chris")
}