name := "sbt15-sample"

version := "0.1"

scalaVersion := "3.1.3"
//scalaVersion := "2.13.5"

libraryDependencies ++= Seq(
  "org.scalatest" %% "scalatest"    % scalaTestVersion % Test,
  // mockito
  "org.mockito"    % "mockito-core" % mockitoVersion   % Test
  // "org.mockito" %% "mockito-scala" % mockitoScalaVersion % Test
)

lazy val scalaTestVersion = "3.2.12"
lazy val mockitoVersion   = "4.6.1"
// scala3 の mockito-scala はまだなかった（2021/05）
//val mockitoScalaVersion = "1.16.37"

lazy val main = project
  .in(file("main"))
  .settings(
    name              := "main",
    scalaVersion      := "3.1.3",
    semanticdbEnabled := true,
    scalacOptions ++= Seq("-explaintypes", "-Wunused"),
    // 以下の scala3 はなさそう
    libraryDependencies ++= Seq(
      "org.typelevel" %% "cats-core"           % "2.8.0",
      "ch.epfl.scala"  % "scalafix-interfaces" % "0.10.1"
    )
  )

run / fork := true
