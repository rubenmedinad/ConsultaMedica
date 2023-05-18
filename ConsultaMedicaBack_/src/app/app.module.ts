import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import {HttpClientModule} from '@angular/common/http';

import { AppRoutingModule } from './app-routing.module';



import { AppComponent } from './app.component';
import { MostrarComponent } from './mostrar/mostrar.component';
import { DataService } from './services/data.service';

@NgModule({
  declarations: [
    AppComponent,
    MostrarComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    HttpClientModule
  ],
  providers: [DataService],
  bootstrap: [AppComponent]
})
export class AppModule { }
