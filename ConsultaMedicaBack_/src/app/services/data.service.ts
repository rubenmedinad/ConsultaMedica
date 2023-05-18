import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';
import { Medico } from '../models/interfaces/Medico.model';

@Injectable({
  providedIn: 'root'
})
export class DataService {

  constructor(private http:HttpClient) { }

    BASE_URL = 'http://localhost:8080/medicos';

    getMedicos():Observable<Medico[]>{
        return this.http.get<Medico[]>(`${this.BASE_URL}/listar`);
        }
}
