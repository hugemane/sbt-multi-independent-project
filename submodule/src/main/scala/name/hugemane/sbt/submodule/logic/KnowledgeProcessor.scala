package name.hugemane.sbt.submodule.logic

import name.hugemane.sbt.core.KnowledgeConfig
import name.hugemane.sbt.submodule.date.DatetimeProvider

class KnowledgeProcessor extends KnowledgeConfig with DatetimeProvider {

  def processKnowledgeInTime(): String = {
    val website = getKnowledgeWebsite
    val dateTime = currentTimeAsString()
    s"$website - $dateTime"
  }
}

object KnowledgeProcessor {
  def apply(): KnowledgeProcessor = {
    new KnowledgeProcessor
  }
}