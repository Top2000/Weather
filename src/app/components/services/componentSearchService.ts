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

//  public getData() {
//return this.http.get('http://localhost:5432/weather');
// http://api.openweathermap.org/data/2.5/forecast?q=Suwalki&units=metric&APPID=02dd1ffb98e6bd6168f3f60819abbc05 }
}
