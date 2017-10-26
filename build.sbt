name := "seth-solidity-seed"
organization := "eth.anyone"
scalaVersion := "2.12.4"
version := "0.1.0"
licenses := Seq("CC0" -> url("https://creativecommons.org/publicdomain/zero/1.0/legalcode"))

import com.scalapenos.sbt.prompt._
import SbtPrompt.autoImport._


// See https://github.com/agemooij/sbt-prompt
promptTheme :=
  PromptTheme(List(
    text("\neth", fg(green)),
//    userName(fg(26)),
//    text("@", fg(green)),
//    hostName(fg(26)),
    text(" on ", fg(magenta)),
    gitBranch(clean = fg(green), dirty = fg(yellow)),
    text(" in ", fg(magenta)),
    currentProject(fg(red)),
    text("> ", fg(magenta))
  ))

resolvers ++= Seq(
  "Typesafe releases"   at "http://repo.typesafe.com/typesafe/releases/",
  //"Sonatype releases"   at "https://oss.sonatype.org/service/local/staging/deploy/maven2",
  "Sonhatype snapshots" at "https://oss.sonatype.org/content/repositories/snapshots"
)

// The following settings are required only if you wish for sbt_ethereum to generate Scala stubs.

ethPackageScalaStubs := "eth.anyone.contract"

libraryDependencies ++= Seq(
  "com.mchange" %% "consuela" % "0.0.3-SNAPSHOT" // TODO is this required?
)
