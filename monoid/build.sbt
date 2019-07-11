
lazy val monoid =
  project
    .in(file("."))
    .enablePlugins()
    .settings(settings)
    .settings(libraryDependencies ++= Seq())

lazy val settings = commonSettings

lazy val commonSettings =
    Seq(
    name := "monoid",
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
      "-Ywarn-unused-import"
    )
  )
