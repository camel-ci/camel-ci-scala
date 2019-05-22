package example

import org.scalatest._
import java.util.Date

class TimeTest extends FlatSpec with Matchers {
  "The Time object" should "say the time" in {
    val date = new Date(0)
    Time.getTimeString(date) shouldEqual "01:00:00 CET /// 01.01.1970"
  }
}
