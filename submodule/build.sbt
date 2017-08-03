import multi.Dependencies._

name := "sbt-multi-independent-project-submodule"
version := "0.0.2-SNAPSHOT"

libraryDependencies ++= Seq(
  "joda-time" % "joda-time" % "2.9.9"
) ++ testDependencies

