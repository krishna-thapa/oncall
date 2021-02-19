package models

case class UserOnCall(
  user: User,
  date: Date
)

object UserOnCall {
  val userOnCallToday: UserOnCall = UserOnCall(User.sunni, Date.today)
  val userOnCallTomorrow: UserOnCall = UserOnCall(User.Chris, Date.tomorrow)
}
