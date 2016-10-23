scalaVersion := "2.11.8"
crossScalaVersions := Seq("2.10.6", "2.11.8", "2.12.0-RC2")

name := "acyclic"
organization := "com.lihaoyi"
version := "0.1.5"

scmInfo := Some(ScmInfo(
  browseUrl = url("https://github.com/lihaoyi/acyclic"),
  connection = "scm:git:git@github.com:lihaoyi/acyclic.git"
))
licenses := Seq("MIT" -> url("http://www.opensource.org/licenses/mit-license.html"))
developers += Developer(
  email = "haoyi.sg@gmail.com",
  id = "lihaoyi",
  name = "Li Haoyi",
  url = url("https://github.com/lihaoyi")
)

publishArtifact in Test := false
publishTo := Some("releases" at "https://oss.sonatype.org/service/local/staging/deploy/maven2")

libraryDependencies ++= Seq(
  "com.lihaoyi" %% "utest" % "0.4.4" % "test",
  "org.scala-lang" % "scala-compiler" % scalaVersion.value % "provided"
)

testFrameworks += new TestFramework("utest.runner.Framework")

unmanagedSourceDirectories in Test <+= baseDirectory(_ / "src" / "test" / "resources")