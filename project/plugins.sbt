libraryDependencies += "org.scala-sbt" % "scripted-plugin" % sbtVersion.value

addSbtPlugin("com.geirsson" % "sbt-idea-plugin" % "0.4.2-RC3")
addSbtPlugin("com.lihaoyi" % "scalatex-sbt-plugin" % "0.3.5")
addSbtPlugin("com.eed3si9n" % "sbt-assembly" % "0.14.3")
addSbtPlugin("org.xerial.sbt" % "sbt-pack" % "0.8.0")
addSbtPlugin("org.brianmckenna" % "sbt-wartremover" % "0.14")
addSbtPlugin("org.scoverage" % "sbt-scoverage" % "1.0.1")
