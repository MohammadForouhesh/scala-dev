ThisBuild / version := "0.1.0-SNAPSHOT"

ThisBuild / scalaVersion := "3.2.0"

lazy val root = (project in file("."))
  .settings(
    name := "scala-dev-mooc"
  )

scalacOptions ++= Seq("-language:implicitConversions", "-deprecation")
libraryDependencies += "org.scalameta" %% "munit" % "0.7.26" % Test

testFrameworks += new TestFramework("munit.Framework")
