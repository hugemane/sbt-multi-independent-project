import Common._
import Dependencies._

name := "sbt-multi-independent-project-core"
version := "0.0.2-SNAPSHOT"

libraryDependencies ++= Seq(
  "com.typesafe" % "config" % "1.3.1"
) ++ testDependencies

//independent project
lazy val submodule: Project =
  if (sys.props.get("independent").isDefined) (project in file(".")).settings(buildSettings) else null
