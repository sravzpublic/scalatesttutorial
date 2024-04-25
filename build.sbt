lazy val root = (project in file(".")).settings(
  inThisBuild(
    List(
      organization := "com.example",
      scalaVersion := "2.13.12"
    )
  ),
  name := "scalatesttutorial"
)

libraryDependencies ++= Seq(
  "com.softwaremill.sttp.client3" %% "core" % "3.5.2",
  "com.softwaremill.sttp.client3" %% "async-http-client-backend-future" % "3.5.2"
)

libraryDependencies ++= Seq(
  "org.scalatest" %% "scalatest" % "3.2.10" % Test,
  "com.softwaremill.sttp.client3" %% "async-http-client-backend-future" % "3.5.2",
  "com.softwaremill.sttp.client3" %% "circe" % "3.5.2"
)

libraryDependencies += "org.scalatest" %% "scalatest" % "3.2.17" % Test
libraryDependencies += "com.typesafe.play" %% "play-json" % "2.9.2"

// Enable the assembly plugin
enablePlugins(AssemblyPlugin)

// Define assembly settings
assemblyJarName in assembly := "your-project-name-assembly.jar"

assemblyMergeStrategy in assembly := {
  case "META-INF/io.netty.versions.properties" => MergeStrategy.first
  case PathList("META-INF", xs @ _*)           => MergeStrategy.discard
  case x                                       => MergeStrategy.first
}
