import { Component, OnInit, Injectable } from '@angular/core';
import {HttpClient} from '@angular/common/http';
import { ComponentSearchService } from "../services/componentSearchService";
import { Data } from '../services/data';
@Component({
  selector: 'app-api',
  templateUrl: './api.component.html',
  styleUrls: ['./api.component.css']
  
})
export class ApiComponent implements OnInit {
  weatherR:any;
  constructor(private http:HttpClient) { }

  ngOnInit() 
  {
  let resp =  this.http.get('http://localhost:8080/getdata');
  
   resp.subscribe((data)=>this.weatherR=data);
  }
    
  }

