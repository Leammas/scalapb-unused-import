scalaVersion := "2.11.8"

scalacOptions ++= Seq(
  "-Xfatal-warnings",
  "-Ywarn-unused-import"
)

libraryDependencies += "com.trueaccord.scalapb" %% "scalapb-runtime" % com.trueaccord.scalapb.compiler.Version.scalapbVersion % "protobuf"

PB.targets in Compile := Seq(scalapb.gen(flatPackage = true) -> (sourceManaged in Compile).value)