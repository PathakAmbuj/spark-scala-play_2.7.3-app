package controllers

import javax.inject.{Inject, Singleton}
import play.api.mvc._
import views.html.{jobPage, loginError, welcome}

import scala.concurrent.Future

@Singleton
class HomeController @Inject()(cc: ControllerComponents)(implicit assetsFinder: AssetsFinder)
  extends AbstractController(cc) {


  def loginCheck(user: String, password: String): Action[AnyContent] = {
    Action.async {

      if (user.equals("admin") && password.equals("admin")) {
        Future.successful(Ok(welcome.render()))

      } else {
        Future.successful(Ok(loginError.render()))
      }
    }
  }


  def jobpage: Action[AnyContent] = {
    Action.async {
      Future.successful(Ok(jobPage.render()))
    }
  }

}
