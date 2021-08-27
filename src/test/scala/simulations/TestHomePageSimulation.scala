package simulations

import io.gatling.core.scenario.Simulation
import io.gatling.core.Predef._
import io.gatling.http.Predef._

class TestHomePageSimulation extends Simulation{

  //http conf
  val httpConf = http.baseUrl("http://54.194.182.114:5000/")
    .header("Accept", value="application/json")
    .header("content-type", value="application/json")

  //scenario
  val scn = scenario("home page")
    .exec(http("home page test")
      .get("/")
      .check(status is 200))

  //setup
  setUp(scn.inject(atOnceUsers(1500))).protocols(httpConf)


}