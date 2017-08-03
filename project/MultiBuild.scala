package multi

import sbt.Keys._

object MultiBuild {

  lazy val buildSettings = Seq(
    organization := "name.hugemane",
    scalaVersion := "2.12.2"
  )

}