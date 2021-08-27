package simulations

import io.gatling.core.Predef.{atOnceUsers, scenario}
import io.gatling.core.Predef._
import io.gatling.http.Predef._

class TestRegisterPageSimulation extends Simulation {
  //http conf
  val httpConf = http.baseUrl("http://localhost:5000/")
    .header("Accept", value="application/json")
    .header("content-type", value="application/json")

  //scenario
  val scn = scenario("register page")
    .exec(http("register page test")
      .get("/register/")
      .check(status is 200))

  //setup
  setUp(scn.inject(atOnceUsers(100))).protocols(httpConf)


}
