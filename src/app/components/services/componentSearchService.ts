import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';

const baseUrl='http://localhost:8080/getdata';
@Injectable({
  providedIn: 'root',
})
export class ComponentSearchService {

  constructor(private http: HttpClient) { }
getAll(): Observable<any>{
  return this.http.get(baseUrl);
}

}
