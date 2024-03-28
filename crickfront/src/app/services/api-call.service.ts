import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { environment } from '../../environments/environment.development';

@Injectable({
  providedIn: 'root'
})
export class ApiCallService {

  constructor(private _httpClint: HttpClient) { }

  getAllMatches() {
    return this._httpClint.get(`${environment.apiUrl}/match`)
  }

  getLiveMatches() {
    return this._httpClint.get(`${environment.apiUrl}/match/live`)
  }

  getPointTable() {
    return this._httpClint.get(`${environment.apiUrl}/match/point-table`)
  }
}
