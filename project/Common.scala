import sbt.Keys._
import sbt.{Project, file}

object Common {

  lazy val buildSettings = Seq(
    organization := "name.hugemane",
    scalaVersion := "2.12.2"
  )

  def projectModule(name: String): Project =
    Project(id = name, base = file(name))
      .settings(buildSettings)
}