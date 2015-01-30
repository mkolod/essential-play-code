lazy val common = project.in(file("./common")).
  enablePlugins(PlayScala)

scalaVersion in common := "2.11.4"

libraryDependencies in common += ws



lazy val authApi = project.in(file("./auth-api")).
  dependsOn(common).
  enablePlugins(PlayScala)

scalaVersion in authApi := "2.11.4"



lazy val chatApi = project.in(file("./chat-api")).
  dependsOn(common).
  enablePlugins(PlayScala)

scalaVersion in chatApi := "2.11.4"



lazy val site = project.in(file("./site")).
  dependsOn(common).
  enablePlugins(PlayScala)

scalaVersion in site := "2.11.4"

libraryDependencies in site += "org.webjars" % "bootstrap" % "3.0.2"



lazy val root = project.in(file(".")).aggregate(
  authApi,
  chatApi,
  site,
  common
)
