addSbtPlugin("org.scala-js"  % "sbt-scalajs"         % "1.18.2")
addSbtPlugin("ch.epfl.scala" % "sbt-scalajs-bundler" % "0.21.1")

addSbtPlugin("org.scalameta" % "sbt-scalafmt" % "2.5.4")
addSbtPlugin("org.typelevel" % "sbt-tpolecat" % "0.5.2")

// for reading npmDependencies from package.json
libraryDependencies ++= Seq("com.lihaoyi" %% "upickle" % "4.1.0")
