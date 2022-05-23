package controllers

import model.request.ProductRequest
import play.api.mvc.{AnyContent, BaseController, ControllerComponents, Request}

import javax.inject.Inject

class ProductController @Inject()(val controllerComponents: ControllerComponents) extends BaseController {


  def create(product:ProductRequest) = Action { implicit request: Request[AnyContent] =>

    Ok(views.html.index())
  }
}
