import { Component } from '@angular/core';
import {BookService} from './service/book.service';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css'],
  providers: [BookService]
})
export class AppComponent {
  title = 'app';

    constructor() {
    }
    getLibros() {
      
    }
}
