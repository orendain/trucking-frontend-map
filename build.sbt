name := "trucking-frontend-map"

version := "0.3"

scalaVersion := "2.11.8"

enablePlugins(ScalaJSPlugin)
enablePlugins(Angulate2Plugin)

ngBootstrap := Some("com.hortonworks.orendainx.trucking.frontend.map.AppModule")

resolvers += "jitpack" at "https://jitpack.io"

libraryDependencies ++= Seq(
  "com.hortonworks.orendainx" %% "trucking-shared" % "0.3",
  "com.github.fancellu.scalajs-leaflet" % "scalajs-leaflet_sjs0.6_2.11" % "v0.1",
  "io.github.cquiroz" %%% "scala-java-time" % "2.0.0-M6"
)
jsDependencies ++= Seq(
  "org.webjars.npm" % "leaflet" % "1.0.2" / "leaflet.js" commonJSName "Leaflet"
)
