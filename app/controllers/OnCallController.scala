package controllers

import javax.inject._
import play.api.mvc._

@Singleton
class OnCallController @Inject()(val controllerComponents: ControllerComponents) extends BaseController {

  def getDateInfo(dates: List[String]): Action[AnyContent] = Action { implicit request: Request[AnyContent] =>
      println(s"Dates: $dates")
      Ok
  }
}
