package controllers

import javax.inject.{Inject, Singleton}
import play.api.mvc.{AbstractController, Action, AnyContent, ControllerComponents}
import views.html.loginPage

import scala.concurrent.Future

@Singleton
class LoginController @Inject()(cc: ControllerComponents)(implicit assetsFinder: AssetsFinder)
  extends AbstractController(cc) {

  def login: Action[AnyContent] =
  {
    Action.async {
      Future.successful(Ok(loginPage.render()))
    }
  }
}
