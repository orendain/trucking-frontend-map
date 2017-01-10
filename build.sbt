name := "trucking-frontend-map"

version := "0.3"

scalaVersion := "2.11.8"

enablePlugins(ScalaJSPlugin)
enablePlugins(Angulate2Plugin)

ngBootstrap := Some("com.hortonworks.orendainx.trucking.frontend.map.MapModule")


//libraryDependencies ++= Seq(
jsDependencies ++= Seq(
  "org.webjars.npm" % "leaflet" % "1.0.2" / "leaflet.js" commonJSName "Leaflet"
)
