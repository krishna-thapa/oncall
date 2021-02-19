package models

case class Date(
  date: String  // //Primary key
)

object Date {
  val today: Date = Date("19-02-21")
  val tomorrow: Date = Date("20-02-21")
}
