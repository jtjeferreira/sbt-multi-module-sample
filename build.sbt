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
  .dependsOn(x.map(x => x: ClasspathDep[ProjectReference]):_*)
  .aggregate(core, util)
  .aggregate(x.map(x => x: ProjectReference):_*)

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
  i <- 1 to 20
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
lazy val x6 = x(5)
lazy val x7 = x(6)
lazy val x8 = x(7)
lazy val x9 = x(8)
lazy val x10 = x(9)
lazy val x11 = x(10)
lazy val x12 = x(11)
lazy val x13 = x(12)
lazy val x14 = x(13)
lazy val x15 = x(14)
lazy val x16 = x(15)
lazy val x17 = x(16)
lazy val x18 = x(17)
lazy val x19 = x(18)
lazy val x20 = x(19)

// See https://www.scala-sbt.org/1.x/docs/Using-Sonatype.html for instructions on how to publish to Sonatype.
