organization  := "org.toktok"
name          := "macros"
version       := "0.1.1"
scalaVersion  := "2.11.12"

// Build dependencies.
libraryDependencies ++= Seq(
  "org.scala-lang" % "scala-compiler" % scalaVersion.value
)

// Test dependencies.
libraryDependencies ++= Seq(
  "org.scalatest" %% "scalatest" % "3.2.0-SNAP7"
) map (_ % Test)

import im.tox.sbt.Scalastyle
Scalastyle.projectSettings
