import Common._

lazy val core = projectModule("core")

lazy val submodule = projectModule("submodule")
  .dependsOn(core)

