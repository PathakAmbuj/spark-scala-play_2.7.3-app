package controllers

import javax.inject.{Inject, Singleton}
import play.api.mvc.{AbstractController, Action, AnyContent, ControllerComponents}
import views.html.form

import scala.concurrent.Future

@Singleton
class FormController @Inject()(cc: ControllerComponents)(implicit assetsFinder: AssetsFinder)
  extends AbstractController(cc){

  def index: Action[AnyContent] = {
    Action.async {
      Future.successful(Ok(form.render()))
    }
  }
}
