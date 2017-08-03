
lazy val core = project in file("core")

lazy val submodule = (project in file("submodule"))
  .dependsOn(core)
