
lazy val root = (project in file("."))
  .aggregate(`type-classes`, monoid)

lazy val `type-classes` = (project in file("type-classes"))
  .settings(
    commonSettings
  )

lazy val monoid = (project in file("monoid"))
  .settings(
    commonSettings
  )

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
      "-Ywarn-unused-import"
    )
  )
