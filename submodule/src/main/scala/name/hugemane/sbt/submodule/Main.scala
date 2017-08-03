package name.hugemane.sbt.submodule

import name.hugemane.sbt.submodule.logic.KnowledgeProcessor

object Main extends App {

  val result = KnowledgeProcessor().processKnowledgeInTime()

  println("Attained knowledge from:" + result)
}
