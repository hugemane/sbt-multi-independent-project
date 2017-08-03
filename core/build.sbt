import multi.Dependencies._

name := "sbt-multi-independent-project-core"
version := "0.0.1-SNAPSHOT"

libraryDependencies ++= Seq(
  "com.typesafe" % "config" % "1.3.1"
) ++ testDependencies


