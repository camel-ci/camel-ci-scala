package example

import java.io._
import java.text.SimpleDateFormat
import java.util.Calendar
import java.lang.Thread
import java.util.Date

object Time {
  def main(args: Array[String]): Unit = {
    while(true) {
      val currentDate = Calendar.getInstance().getTime()
      val timeString = getTimeString(currentDate)
      val pw = new PrintWriter(new File("time.txt"))
      pw.write("Current time is : " + timeString)
      pw.close

      Thread.sleep(2500)
    }
  }

  def getTimeString(date: Date) : String = {
    val format = new SimpleDateFormat("HH:mm:ss z '///' dd.MM.yyyy")
    val timeString = format.format(date)
    return timeString
  }
}
