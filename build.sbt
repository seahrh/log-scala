lazy val root = (project in file(".")).
  settings(
    inThisBuild(List(
      organization := "com.sgcharts",
      scalaVersion := "2.12.4",
      version      := "1.0.0-SNAPSHOT"
    )),
    name := "log-scala",
    libraryDependencies ++= Seq(
      "org.scalatest" %% "scalatest" % versions.scalatest % Test
    )
  )

lazy val versions = new {
  val scalatest = "3.0.4"
}

wartremoverErrors ++= Warts.allBut(
  Wart.Equals,
  Wart.ToString,
  Wart.Throw,
  Wart.DefaultArguments,
  Wart.Return,
  Wart.TraversableOps,
  Wart.MutableDataStructures,
  Wart.Var
)