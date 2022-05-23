ThisBuild / scalaVersion := "2.13.8"

ThisBuild / version := "1.0-SNAPSHOT"

lazy val root = (project in file("."))
  .enablePlugins(PlayScala)
  .settings(
    name := """ScalaCrud""",
    libraryDependencies ++= Seq(
      guice, javaJpa,
      "org.hibernate" % "hibernate-core" % "5.5.6" ,
      "org.scalatestplus.play" %% "scalatestplus-play" % "5.1.0" % Test
    )
  )