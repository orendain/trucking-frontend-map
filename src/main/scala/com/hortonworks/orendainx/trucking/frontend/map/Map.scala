package com.hortonworks.orendainx.trucking.frontend.map

import angulate2.std._
import angulate2.platformBrowser.BrowserModule

@NgModule(
  imports = @@[BrowserModule],
  declarations = @@[MapComponent],
  bootstrap = @@[MapComponent]
)
class MapModule {

}

@Component(
  selector = "my-app",
  template = "<h1>Hello Angular!<h1>"
)
class MapComponent {

}

