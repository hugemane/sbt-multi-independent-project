import multi._

import Dependencies._

name := "sbt-multi-independent-project-core"
organization := "name.hugemane"
version := "0.0.1-SNAPSHOT"
scalaVersion := "2.12.2"

libraryDependencies ++= Seq(
  "com.typesafe" % "config" % "1.3.1"
) ++ testDependencies


