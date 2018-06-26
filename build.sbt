name := """play25"""

version := "1.0-SNAPSHOT"

lazy val root = (project in file(".")).enablePlugins(PlayScala)

scalaVersion := "2.11.7"

libraryDependencies ++= Seq(
  jdbc,
  cache,
  ws,
  guice,
  "org.scalatestplus.play" %% "scalatestplus-play" % "1.5.0-RC1" % Test
)
libraryDependencies ++= Seq(
  "com.h2database"  %  "h2"                           % "1.4.197", // your jdbc driver here
  "org.scalikejdbc" %% "scalikejdbc"                  % "3.0.+",
  "org.scalikejdbc" %% "scalikejdbc-config"           % "3.0.+",
  "org.scalikejdbc" %% "scalikejdbc-play-dbapi-adapter" % "2.6.0-scalikejdbc-3.0"
)

resolvers += "scalaz-bintray" at "http://dl.bintray.com/scalaz/releases"
