package multi

import sbt._

object Dependencies {

  val testDependencies = Seq(
    "org.scalatest" %% "scalatest" % "3.0.1" % Test
  )

}