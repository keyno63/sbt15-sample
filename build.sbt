name := "sbt15-sample"

version := "0.1"

scalaVersion := "3.0.0"

libraryDependencies ++= Seq(
  "org.scalatest" %% "scalatest" % scalaTestVersion % Test,

  // mockito
  "org.mockito" % "mockito-core" % mockitoVersion % Test,
  //"org.mockito" %% "mockito-scala" % mockitoScalaVersion % Test
)

val scalaTestVersion = "3.2.9"
val mockitoVersion = "3.9.0"
// scala3 の mockito-scala はまだなかった（2021/05）
//val mockitoScalaVersion = "1.16.37"
