package simulations

import io.gatling.core.Predef._
import io.gatling.http.Predef._

class JobcentreSimulation extends Simulation {

  val httpProtocol = http
    .baseUrl("http://54.194.182.114:5000")
    .inferHtmlResources()

  val headers_0 = Map(
    "If-Modified-Since" -> "Mon, 26 Jul 2021 11:10:49 GMT",
    "User-Agent" -> "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/92.0.4515.159 Safari/537.36",
    "sec-ch-ua" -> """Chromium";v="92", " Not A;Brand";v="99", "Google Chrome";v="92""",
    "sec-ch-ua-mobile" -> "?0")

  val headers_1 = Map(
    "Accept" -> "text/html,application/xhtml+xml,application/xml;q=0.9,image/avif,image/webp,image/apng,*/*;q=0.8,application/signed-exchange;v=b3;q=0.9",
    "Accept-Encoding" -> "gzip, deflate, br",
    "Accept-Language" -> "en-US,en;q=0.9",
    "Cache-Control" -> "max-age=0",
    "Sec-Fetch-Dest" -> "document",
    "Sec-Fetch-Mode" -> "navigate",
    "Sec-Fetch-Site" -> "none",
    "Sec-Fetch-User" -> "?1",
    "Upgrade-Insecure-Requests" -> "1",
    "User-Agent" -> "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/92.0.4515.159 Safari/537.36",
    "dnt" -> "1",
    "sec-ch-ua" -> """Chromium";v="92", " Not A;Brand";v="99", "Google Chrome";v="92""",
    "sec-ch-ua-mobile" -> "?0")

  val headers_2 = Map(
    "User-Agent" -> "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/92.0.4515.159 Safari/537.36",
    "sec-ch-ua" -> """Chromium";v="92", " Not A;Brand";v="99", "Google Chrome";v="92""",
    "sec-ch-ua-mobile" -> "?0")

  val headers_3 = Map("User-Agent" -> "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/92.0.4515.159 Safari/537.36")

  val headers_9 = Map(
    "Accept" -> "image/avif,image/webp,image/apng,image/svg+xml,image/*,*/*;q=0.8",
    "Accept-Encoding" -> "gzip, deflate, br",
    "Accept-Language" -> "en-US,en;q=0.9",
    "If-Modified-Since" -> "Mon, 26 Jul 2021 11:10:49 GMT",
    "Sec-Fetch-Dest" -> "image",
    "Sec-Fetch-Mode" -> "no-cors",
    "Sec-Fetch-Site" -> "same-origin",
    "User-Agent" -> "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/92.0.4515.159 Safari/537.36",
    "dnt" -> "1",
    "sec-ch-ua" -> """Chromium";v="92", " Not A;Brand";v="99", "Google Chrome";v="92""",
    "sec-ch-ua-mobile" -> "?0")

  val headers_10 = Map(
    "Accept" -> "text/css,*/*;q=0.1",
    "Accept-Encoding" -> "gzip, deflate, br",
    "Accept-Language" -> "en-US,en;q=0.9",
    "If-Modified-Since" -> "Mon, 26 Jul 2021 11:10:49 GMT",
    "Sec-Fetch-Dest" -> "style",
    "Sec-Fetch-Mode" -> "no-cors",
    "Sec-Fetch-Site" -> "same-origin",
    "User-Agent" -> "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/92.0.4515.159 Safari/537.36",
    "dnt" -> "1",
    "sec-ch-ua" -> """Chromium";v="92", " Not A;Brand";v="99", "Google Chrome";v="92""",
    "sec-ch-ua-mobile" -> "?0")

  val headers_18 = Map(
    "Accept" -> "image/avif,image/webp,image/apng,image/svg+xml,image/*,*/*;q=0.8",
    "Accept-Encoding" -> "gzip, deflate, br",
    "Accept-Language" -> "en-US,en;q=0.9",
    "Cache-Control" -> "no-cache",
    "Pragma" -> "no-cache",
    "Sec-Fetch-Dest" -> "image",
    "Sec-Fetch-Mode" -> "no-cors",
    "Sec-Fetch-Site" -> "same-origin",
    "User-Agent" -> "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/92.0.4515.159 Safari/537.36",
    "dnt" -> "1",
    "sec-ch-ua" -> """Chromium";v="92", " Not A;Brand";v="99", "Google Chrome";v="92""",
    "sec-ch-ua-mobile" -> "?0")

  val headers_19 = Map(
    "Accept" -> "text/html,application/xhtml+xml,application/xml;q=0.9,image/avif,image/webp,image/apng,*/*;q=0.8,application/signed-exchange;v=b3;q=0.9",
    "Accept-Encoding" -> "gzip, deflate, br",
    "Accept-Language" -> "en-US,en;q=0.9",
    "Sec-Fetch-Dest" -> "document",
    "Sec-Fetch-Mode" -> "navigate",
    "Sec-Fetch-Site" -> "same-origin",
    "Sec-Fetch-User" -> "?1",
    "Upgrade-Insecure-Requests" -> "1",
    "User-Agent" -> "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/92.0.4515.159 Safari/537.36",
    "dnt" -> "1",
    "sec-ch-ua" -> """Chromium";v="92", " Not A;Brand";v="99", "Google Chrome";v="92""",
    "sec-ch-ua-mobile" -> "?0")

  val headers_35 = Map(
    "Accept" -> "image/avif,image/webp,image/apng,image/svg+xml,image/*,*/*;q=0.8",
    "Accept-Encoding" -> "gzip, deflate, br",
    "Accept-Language" -> "en-US,en;q=0.9",
    "Sec-Fetch-Dest" -> "image",
    "Sec-Fetch-Mode" -> "no-cors",
    "Sec-Fetch-Site" -> "same-origin",
    "User-Agent" -> "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/92.0.4515.159 Safari/537.36",
    "dnt" -> "1",
    "sec-ch-ua" -> """Chromium";v="92", " Not A;Brand";v="99", "Google Chrome";v="92""",
    "sec-ch-ua-mobile" -> "?0")

  val headers_36 = Map(
    "Accept" -> "text/html,application/xhtml+xml,application/xml;q=0.9,image/avif,image/webp,image/apng,*/*;q=0.8,application/signed-exchange;v=b3;q=0.9",
    "Accept-Encoding" -> "gzip, deflate, br",
    "Accept-Language" -> "en-US,en;q=0.9",
    "Cache-Control" -> "max-age=0",
    "Origin" -> "http://54.194.182.114:5000",
    "Sec-Fetch-Dest" -> "document",
    "Sec-Fetch-Mode" -> "navigate",
    "Sec-Fetch-Site" -> "same-origin",
    "Sec-Fetch-User" -> "?1",
    "Upgrade-Insecure-Requests" -> "1",
    "User-Agent" -> "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/92.0.4515.159 Safari/537.36",
    "dnt" -> "1",
    "sec-ch-ua" -> """Chromium";v="92", " Not A;Brand";v="99", "Google Chrome";v="92""",
    "sec-ch-ua-mobile" -> "?0")

  val uri1 = "https://ajax.googleapis.com/ajax/libs/jquery/3.1.0/jquery.min.js"
  val uri3 = "http://code.jquery.com/jquery-latest.min.js"
  val uri4 = "https://cdn.jsdelivr.net/npm/chart.js@3.4.1/dist/chart.min.js"
  val uri5 = "https://fonts.gstatic.com/s"
  val uri6 = "https://fonts.googleapis.com"

  val scn = scenario("JobcentreSimulation")
    .exec(http("request_0")
      .get("/static/stylesheets/style.css")
      .headers(headers_0))
    .pause(15)
    .exec(http("request_1")
      .get("/")
      .headers(headers_1)
      .resources(http("request_2")
        .get(uri1)
        .headers(headers_2),
        http("request_3")
          .get(uri3)
          .headers(headers_3),
        http("request_4")
          .get(uri6 + "/icon?family=Material+Icons")
          .headers(headers_2),
        http("request_5")
          .get(uri6 + "/css?family=Ubuntu")
          .headers(headers_2),
        http("request_6")
          .get(uri6 + "/css?family=Ubuntu:400,500,700")
          .headers(headers_2),
        http("request_7")
          .get(uri6 + "/css2?family=Kanit:ital,wght@1,900&display=swap")
          .headers(headers_2),
        http("request_8")
          .get(uri4)
          .headers(headers_2),
        http("request_9")
          .get("/static/img/logo.svg")
          .headers(headers_9),
        http("request_10")
          .get("/static/stylesheets/style.css")
          .headers(headers_10),
        http("request_11")
          .get("/static/img/streamline-icon-coding-3@400x400.png")
          .headers(headers_9),
        http("request_12")
          .get(uri5 + "/materialicons/v98/flUhRq6tzZclQEJ-Vdg-IuiaDsNc.woff2"),
        http("request_13")
          .get(uri5 + "/ubuntu/v15/4iCs6KVjbNBYlgoKfw72.woff2"),
        http("request_14")
          .get(uri5 + "/ubuntu/v15/4iCs6KVjbNBYlgoKfw72.woff2"),
        http("request_15")
          .get(uri5 + "/ubuntu/v15/4iCv6KVjbNBYlgoCjC3jsGyN.woff2"),
        http("request_16")
          .get(uri5 + "/ubuntu/v15/4iCv6KVjbNBYlgoCxCvjsGyN.woff2"),
        http("request_17")
          .get(uri5 + "/kanit/v7/nKKS-Go6G5tXcraQI4GnZaNhMQ.woff2"),
        http("request_18")
          .get("/")
          .headers(headers_18)))
    .pause(5)
    .exec(http("request_19")
      .get("/login")
      .headers(headers_19)
      .resources(http("request_20")
        .get(uri1)
        .headers(headers_2),
        http("request_21")
          .get(uri3)
          .headers(headers_3),
        http("request_22")
          .get(uri6 + "/icon?family=Material+Icons")
          .headers(headers_2),
        http("request_23")
          .get(uri6 + "/css?family=Ubuntu")
          .headers(headers_2),
        http("request_24")
          .get(uri6 + "/css?family=Ubuntu:400,500,700")
          .headers(headers_2),
        http("request_25")
          .get(uri6 + "/css2?family=Kanit:ital,wght@1,900&display=swap")
          .headers(headers_2),
        http("request_26")
          .get(uri4)
          .headers(headers_2),
        http("request_27")
          .get("/static/img/logo.svg")
          .headers(headers_9),
        http("request_28")
          .get("/static/stylesheets/style.css")
          .headers(headers_10),
        http("request_29")
          .get(uri5 + "/materialicons/v98/flUhRq6tzZclQEJ-Vdg-IuiaDsNc.woff2"),
        http("request_30")
          .get(uri5 + "/ubuntu/v15/4iCs6KVjbNBYlgoKfw72.woff2"),
        http("request_31")
          .get(uri5 + "/ubuntu/v15/4iCs6KVjbNBYlgoKfw72.woff2"),
        http("request_32")
          .get(uri5 + "/ubuntu/v15/4iCv6KVjbNBYlgoCjC3jsGyN.woff2"),
        http("request_33")
          .get(uri5 + "/ubuntu/v15/4iCv6KVjbNBYlgoCxCvjsGyN.woff2"),
        http("request_34")
          .get(uri5 + "/kanit/v7/nKKS-Go6G5tXcraQI4GnZaNhMQ.woff2"),
        http("request_35")
          .get("/login/")
          .headers(headers_35)))
    .pause(8)
    .exec(http("LOGIN_REQUEST")
      .post("/login/")
      .headers(headers_36)
      .formParam("csrf_token", "ImE5NGFhZTc3ZDFhMDhhN2VhZDVlODY2YzMyNzMyYjE1ODE1NGE5MmYi.YSjhWA.rY_Xu3vi2qLyfukF0JIihjm2R8U")
      .formParam("username", "jbond")
      .formParam("password", "test123")
      .formParam("submit", "Submit")
      .resources(http("request_37")
        .get(uri1)
        .headers(headers_2),
        http("request_38")
          .get(uri3)
          .headers(headers_3),
        http("request_39")
          .get(uri6 + "/icon?family=Material+Icons")
          .headers(headers_2),
        http("request_40")
          .get(uri6 + "/css?family=Ubuntu")
          .headers(headers_2),
        http("request_41")
          .get(uri6 + "/css?family=Ubuntu:400,500,700")
          .headers(headers_2),
        http("request_42")
          .get(uri6 + "/css2?family=Kanit:ital,wght@1,900&display=swap")
          .headers(headers_2),
        http("request_43")
          .get(uri4)
          .headers(headers_2),
        http("request_44")
          .get("/static/img/logo.svg")
          .headers(headers_9),
        http("request_45")
          .get("/static/stylesheets/style.css")
          .headers(headers_10),
        http("request_46")
          .get("/static/img/streamline-icon-coding-3@400x400.png")
          .headers(headers_9),
        http("request_47")
          .get(uri5 + "/materialicons/v98/flUhRq6tzZclQEJ-Vdg-IuiaDsNc.woff2"),
        http("request_48")
          .get(uri5 + "/ubuntu/v15/4iCs6KVjbNBYlgoKfw72.woff2"),
        http("request_49")
          .get(uri5 + "/ubuntu/v15/4iCs6KVjbNBYlgoKfw72.woff2"),
        http("request_50")
          .get(uri5 + "/ubuntu/v15/4iCv6KVjbNBYlgoCjC3jsGyN.woff2"),
        http("request_51")
          .get(uri5 + "/ubuntu/v15/4iCv6KVjbNBYlgoCxCvjsGyN.woff2"),
        http("request_52")
          .get(uri5 + "/kanit/v7/nKKS-Go6G5tXcraQI4GnZaNhMQ.woff2"),
        http("request_53")
          .get("/")
          .headers(headers_35)))
    .pause(5)
    .exec(http("View_Roles_Request_54")
      .get("/roles")
      .headers(headers_19)
      .resources(http("request_55")
        .get(uri1)
        .headers(headers_2),
        http("request_56")
          .get(uri3)
          .headers(headers_3),
        http("request_57")
          .get(uri6 + "/icon?family=Material+Icons")
          .headers(headers_2),
        http("request_58")
          .get(uri6 + "/css?family=Ubuntu")
          .headers(headers_2),
        http("request_59")
          .get(uri6 + "/css?family=Ubuntu:400,500,700")
          .headers(headers_2),
        http("request_60")
          .get(uri6 + "/css2?family=Kanit:ital,wght@1,900&display=swap")
          .headers(headers_2),
        http("request_61")
          .get(uri4)
          .headers(headers_2),
        http("request_62")
          .get("/static/stylesheets/style.css")
          .headers(headers_10),
        http("request_63")
          .get("/static/img/logo.svg")
          .headers(headers_9),
        http("request_64")
          .get(uri5 + "/materialicons/v98/flUhRq6tzZclQEJ-Vdg-IuiaDsNc.woff2"),
        http("request_65")
          .get(uri5 + "/ubuntu/v15/4iCs6KVjbNBYlgoKfw72.woff2"),
        http("request_66")
          .get(uri5 + "/ubuntu/v15/4iCs6KVjbNBYlgoKfw72.woff2"),
        http("request_67")
          .get(uri5 + "/ubuntu/v15/4iCv6KVjbNBYlgoCjC3jsGyN.woff2"),
        http("request_68")
          .get(uri5 + "/ubuntu/v15/4iCv6KVjbNBYlgoCxCvjsGyN.woff2"),
        http("request_69")
          .get(uri5 + "/kanit/v7/nKKS-Go6G5tXcraQI4GnZaNhMQ.woff2"),
        http("request_70")
          .get("/roles/")
          .headers(headers_35)))
    .pause(6)
    .exec(http("request_71")
      .post("/roles/")
      .headers(headers_36)
      .formParam("csrf_token", "ImE5NGFhZTc3ZDFhMDhhN2VhZDVlODY2YzMyNzMyYjE1ODE1NGE5MmYi.YSjhZw.NOcT0EDbykpH-s7d4ZklSZILAUo")
      .formParam("role_filter", "Median Salary")
      .formParam("sort", "Sort")
      .resources(http("request_72")
        .get(uri1)
        .headers(headers_2),
        http("request_73")
          .get(uri3)
          .headers(headers_3),
        http("request_74")
          .get(uri6 + "/icon?family=Material+Icons")
          .headers(headers_2),
        http("request_75")
          .get(uri6 + "/css?family=Ubuntu")
          .headers(headers_2),
        http("request_76")
          .get(uri6 + "/css?family=Ubuntu:400,500,700")
          .headers(headers_2),
        http("request_77")
          .get(uri6 + "/css2?family=Kanit:ital,wght@1,900&display=swap")
          .headers(headers_2),
        http("request_78")
          .get(uri4)
          .headers(headers_2),
        http("request_79")
          .get("/static/img/logo.svg")
          .headers(headers_9),
        http("request_80")
          .get("/static/stylesheets/style.css")
          .headers(headers_10),
        http("request_81")
          .get(uri5 + "/materialicons/v98/flUhRq6tzZclQEJ-Vdg-IuiaDsNc.woff2"),
        http("request_82")
          .get(uri5 + "/ubuntu/v15/4iCs6KVjbNBYlgoKfw72.woff2"),
        http("request_83")
          .get(uri5 + "/ubuntu/v15/4iCs6KVjbNBYlgoKfw72.woff2"),
        http("request_84")
          .get(uri5 + "/ubuntu/v15/4iCv6KVjbNBYlgoCjC3jsGyN.woff2"),
        http("request_85")
          .get(uri5 + "/ubuntu/v15/4iCv6KVjbNBYlgoCxCvjsGyN.woff2"),
        http("request_86")
          .get(uri5 + "/kanit/v7/nKKS-Go6G5tXcraQI4GnZaNhMQ.woff2"),
        http("request_87")
          .get("/roles/")
          .headers(headers_35)))
    .pause(4)
    .exec(http("request_88")
      .post("/roles/")
      .headers(headers_36)
      .formParam("csrf_token", "ImE5NGFhZTc3ZDFhMDhhN2VhZDVlODY2YzMyNzMyYjE1ODE1NGE5MmYi.YSjhbQ.xlwsOtYZi2cLUHKsHcqJ9D53aqg")
      .formParam("role_filter", "Rank")
      .formParam("sort", "Sort")
      .resources(http("request_89")
        .get(uri1)
        .headers(headers_2),
        http("request_90")
          .get(uri3)
          .headers(headers_3),
        http("request_91")
          .get(uri6 + "/icon?family=Material+Icons")
          .headers(headers_2),
        http("request_92")
          .get(uri6 + "/css?family=Ubuntu")
          .headers(headers_2),
        http("request_93")
          .get(uri6 + "/css?family=Ubuntu:400,500,700")
          .headers(headers_2),
        http("request_94")
          .get(uri6 + "/css2?family=Kanit:ital,wght@1,900&display=swap")
          .headers(headers_2),
        http("request_95")
          .get(uri4)
          .headers(headers_2),
        http("request_96")
          .get("/static/stylesheets/style.css")
          .headers(headers_10),
        http("request_97")
          .get("/static/img/logo.svg")
          .headers(headers_9),
        http("request_98")
          .get(uri5 + "/materialicons/v98/flUhRq6tzZclQEJ-Vdg-IuiaDsNc.woff2"),
        http("request_99")
          .get(uri5 + "/ubuntu/v15/4iCs6KVjbNBYlgoKfw72.woff2"),
        http("request_100")
          .get(uri5 + "/ubuntu/v15/4iCs6KVjbNBYlgoKfw72.woff2"),
        http("request_101")
          .get(uri5 + "/ubuntu/v15/4iCv6KVjbNBYlgoCjC3jsGyN.woff2"),
        http("request_102")
          .get(uri5 + "/ubuntu/v15/4iCv6KVjbNBYlgoCxCvjsGyN.woff2"),
        http("request_103")
          .get(uri5 + "/kanit/v7/nKKS-Go6G5tXcraQI4GnZaNhMQ.woff2"),
        http("request_104")
          .get("/roles/")
          .headers(headers_35)))
    .pause(12)
    .exec(http("request_105")
      .post("/roles/")
      .headers(headers_36)
      .formParam("csrf_token", "ImE5NGFhZTc3ZDFhMDhhN2VhZDVlODY2YzMyNzMyYjE1ODE1NGE5MmYi.YSjhcw.uktU82uyOViwH202OqUAM0hpV7M")
      .formParam("search_term", "devops")
      .formParam("search_button", "Search")
      .resources(http("request_106")
        .get(uri1)
        .headers(headers_2),
        http("request_107")
          .get(uri3)
          .headers(headers_3),
        http("request_108")
          .get(uri6 + "/icon?family=Material+Icons")
          .headers(headers_2),
        http("request_109")
          .get(uri6 + "/css?family=Ubuntu")
          .headers(headers_2),
        http("request_110")
          .get(uri6 + "/css?family=Ubuntu:400,500,700")
          .headers(headers_2),
        http("request_111")
          .get(uri6 + "/css2?family=Kanit:ital,wght@1,900&display=swap")
          .headers(headers_2),
        http("request_112")
          .get(uri4)
          .headers(headers_2),
        http("request_113")
          .get("/static/img/logo.svg")
          .headers(headers_9),
        http("request_114")
          .get("/static/stylesheets/style.css")
          .headers(headers_10),
        http("request_115")
          .get(uri5 + "/materialicons/v98/flUhRq6tzZclQEJ-Vdg-IuiaDsNc.woff2"),
        http("request_116")
          .get(uri5 + "/ubuntu/v15/4iCs6KVjbNBYlgoKfw72.woff2"),
        http("request_117")
          .get(uri5 + "/ubuntu/v15/4iCs6KVjbNBYlgoKfw72.woff2"),
        http("request_118")
          .get(uri5 + "/ubuntu/v15/4iCv6KVjbNBYlgoCjC3jsGyN.woff2"),
        http("request_119")
          .get(uri5 + "/ubuntu/v15/4iCv6KVjbNBYlgoCxCvjsGyN.woff2"),
        http("request_120")
          .get(uri5 + "/kanit/v7/nKKS-Go6G5tXcraQI4GnZaNhMQ.woff2"),
        http("request_121")
          .get("/roles/")
          .headers(headers_35)))
    .pause(4)
    .exec(http("request_122")
      .get("/logout")
      .headers(headers_19)
      .resources(http("request_123")
        .get(uri5 + "/materialicons/v98/flUhRq6tzZclQEJ-Vdg-IuiaDsNc.woff2"),
        http("request_124")
          .get(uri5 + "/ubuntu/v15/4iCs6KVjbNBYlgoKfw72.woff2"),
        http("request_125")
          .get(uri5 + "/ubuntu/v15/4iCs6KVjbNBYlgoKfw72.woff2"),
        http("request_126")
          .get(uri5 + "/ubuntu/v15/4iCv6KVjbNBYlgoCjC3jsGyN.woff2"),
        http("request_127")
          .get(uri5 + "/ubuntu/v15/4iCv6KVjbNBYlgoCxCvjsGyN.woff2"),
        http("request_128")
          .get(uri5 + "/kanit/v7/nKKS-Go6G5tXcraQI4GnZaNhMQ.woff2"),
        http("request_129")
          .get("/")
          .headers(headers_35)))

  setUp(scn.inject(atOnceUsers(1))).protocols(httpProtocol)
}