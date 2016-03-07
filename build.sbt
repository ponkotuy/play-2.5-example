name := """play25"""

version := "1.0-SNAPSHOT"

lazy val root = (project in file(".")).enablePlugins(PlayScala)

scalaVersion := "2.11.7"

libraryDependencies ++= Seq(
  jdbc,
  cache,
  ws,
  "org.scalatestplus.play" %% "scalatestplus-play" % "1.5.0-RC1" % Test
)
libraryDependencies ++= Seq(
  "com.h2database"  %  "h2"                           % "1.4.191", // your jdbc driver here
  "org.scalikejdbc" %% "scalikejdbc"                  % "2.3.5",
  "org.scalikejdbc" %% "scalikejdbc-config"           % "2.3.5",
  "org.scalikejdbc" %% "scalikejdbc-play-dbapi-adapter" % "2.5.0"
)

resolvers += "scalaz-bintray" at "http://dl.bintray.com/scalaz/releases"
