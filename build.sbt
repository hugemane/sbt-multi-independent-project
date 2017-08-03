import multi.MultiBuild._

lazy val core = multiModule("core")

lazy val submodule = multiModule("submodule")
  .dependsOn(core)

def multiModule(name: String): Project =
  Project(id = name, base = file(name))
    .settings(buildSettings)
