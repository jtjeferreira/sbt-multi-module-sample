import Dependencies._

ThisBuild / scalaVersion     := "2.12.10"
ThisBuild / version          := "0.1.0-SNAPSHOT"
ThisBuild / organization     := "com.example"
ThisBuild / organizationName := "example"

lazy val root = (project in file("."))
  .settings(
    name := "Scala Seed Project",
    libraryDependencies += spark,
    libraryDependencies += scalaTest % Test
  )
  .dependsOn(core, util, x1, x2, x3, x4, x5)
  .aggregate(core, util, x1, x2, x3, x4, x5)

lazy val core = (project in file("modules/core"))
  .settings(
    name := "core",
    libraryDependencies += spark,
    libraryDependencies += scalaTest % Test
  )

lazy val util = (project in file("modules/util"))
  .settings(
    name := "core",
    libraryDependencies += spark,
    libraryDependencies += scalaTest % Test
  )

val x: Seq[Project] = for {
  i <- 1 to 5
} yield
  Project(s"x$i", file(s"modules/module$i"))
    .settings(
      name := s"x$i",
      libraryDependencies += spark,
      libraryDependencies += scalaTest % Test
    )
    .dependsOn(core, util)


//override lazy val projects = root +: x

lazy val x1 = x(0)
lazy val x2 = x(1)
lazy val x3 = x(2)
lazy val x4 = x(3)
lazy val x5 = x(4)

// See https://www.scala-sbt.org/1.x/docs/Using-Sonatype.html for instructions on how to publish to Sonatype.
