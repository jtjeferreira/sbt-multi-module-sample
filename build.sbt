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
  .dependsOn(core, util)
  .aggregate(core, util)

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

// See https://www.scala-sbt.org/1.x/docs/Using-Sonatype.html for instructions on how to publish to Sonatype.
