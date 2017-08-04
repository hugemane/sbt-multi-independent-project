import Common._
import Dependencies._

name := "sbt-multi-independent-project-submodule"
version := "0.0.1-SNAPSHOT"

libraryDependencies ++= Seq(
  "joda-time" % "joda-time" % "2.9.9"
) ++ testDependencies

//independent project
lazy val submodule: Project =
  if (sys.props.get("independent").isDefined) (project in file(".")).settings(buildSettings) else null

//independent 'project' specific dependencies (pre-released)
libraryDependencies ++= {
  if (sys.props.get("independent").isDefined) Seq(
    "name.hugemane" %% "sbt-multi-independent-project-core" % "0.0.1"
  ) else Seq()
}
