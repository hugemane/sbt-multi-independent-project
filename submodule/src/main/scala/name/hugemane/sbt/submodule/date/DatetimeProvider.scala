package name.hugemane.sbt.submodule.date

import org.joda.time.DateTime
import org.joda.time.format.DateTimeFormat

trait DatetimeProvider {
  val DEFAULT_DATE_TIME_FORMAT = "dd.MM.yyyy HH:mm:ss"

  def currentTimeAsString(dateTime: DateTime = DateTime.now): String = {
    DateTimeFormat.forPattern(DEFAULT_DATE_TIME_FORMAT).print(dateTime)
  }
}
