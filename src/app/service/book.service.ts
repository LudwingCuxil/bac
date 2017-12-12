import {Injectable} from '@angular/core';
import {Headers, Http, RequestOptions} from '@angular/http';

@Injectable()
export class BookService {
    constructor(private http: Http) {
    }

    getLibros(): Promise<any> {
      return this.http.get('/api/').toPromise();
    }
}
