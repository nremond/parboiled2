name := "parboiled"

version := "2.0.0-SNAPSHOT"

homepage := Some(new URL("http://parboiled.org"))

organization := "org.parboiled2"

organizationHomepage := Some(new URL("http://parboiled.org"))

description := "A Scala 2.10+ library for elegant construction of efficient PEG parsers"

startYear := Some(2009)

resolvers += Resolver.sonatypeRepo("snapshots")

addCompilerPlugin("org.scala-lang.plugins" % "macro-paradise" % "2.0.0-SNAPSHOT" cross CrossVersion.full)

licenses := Seq("Apache 2" -> new URL("http://www.apache.org/licenses/LICENSE-2.0.txt"))

scalacOptions ++= Seq(
  "-unchecked",
  "-deprecation",
  "-Xlint",
  "-language:_", 
  "-encoding", "UTF-8"
)

libraryDependencies ++= Seq(
  "org.scala-lang"  %  "scala-reflect"  % "2.10.3"  % "compile",
  "com.chuusai"     %% "shapeless"      % "1.2.4"   % "compile",
  "org.specs2"      %% "specs2"         % "1.14"    % "test"
)