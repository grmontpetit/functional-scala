
lazy val root = project in file(".")

lazy val commonSettings =
  Seq(
    name := "functional-scala",
    version := "0.0.1",
    scalaVersion := "2.12.6",
    organization := "grmontpetit",
    organizationName := "Gabriel Robitaille-Montpetit",
    startYear := Some(2018),
    scalacOptions ++= Seq(
      "-unchecked",
      "-deprecation",
      "-language:_",
      "-target:jvm-1.8",
      "-encoding", "UTF-8",
      "-Ypartial-unification",
      "-Ywarn-unused-import",
      "-Ypartial-unification"
    )
  )

libraryDependencies += "org.typelevel" %% "cats-core" % "2.0.0-M4"
