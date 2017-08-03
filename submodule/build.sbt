name := "sbt-multi-independent-project-submodule"
organization := "name.hugemane"
version := "0.0.2-SNAPSHOT"
scalaVersion := "2.12.2"

libraryDependencies ++= Seq(
  "joda-time" % "joda-time" % "2.9.9",
  "org.scalatest" %% "scalatest" % "3.0.1" % Test
)

