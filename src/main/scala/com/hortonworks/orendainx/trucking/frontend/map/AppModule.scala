package com.hortonworks.orendainx.trucking.frontend.map

import angulate2.std._
import angulate2.platformBrowser.BrowserModule

/**
  * @author Edgar Orendain <edgar@orendainx.com>
  */
@NgModule(
  imports = @@[BrowserModule],
  providers = @@[WebSocketService],
  declarations = @@[AppComponent, MapComponent, EventListComponent],
  bootstrap = @@[AppComponent]
)
class AppModule