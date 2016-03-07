package controllers

import javax.inject._
import play.api._
import play.api.mvc._

/**
 * This controller creates an `Action` to handle HTTP requests to the
 * application's home page.
 */
@Singleton
class HomeController @Inject() extends Controller {

  /**
   * Create an Action to render an HTML page with a welcome message.
   * The configuration in the `routes` file means that this method
   * will be called when the application receives a `GET` request with
   * a path of `/`.
   */
  def index = Action {
    import scalikejdbc._
    try {
      val rows = DB.readOnly { implicit s =>
        sql"select * from example".toMap.list.apply()
      }
      println(rows)
    } catch { case e: Exception =>
      DB.autoCommit { implicit s =>
        sql"create table example (id int not null, name varchar(255))".execute.apply()
      }
    }
    Ok(views.html.index("Your new application is ready."))
  }

}
