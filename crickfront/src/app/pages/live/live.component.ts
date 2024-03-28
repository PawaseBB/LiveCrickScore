import { Component, OnInit } from '@angular/core';
import { ApiCallService } from '../../services/api-call.service';
import { CommonModule } from '@angular/common';
import { MatchCardComponent } from '../../componants/match-card/match-card.component';
import { error } from 'console';

@Component({
  selector: 'app-live',
  standalone: true,
  imports: [CommonModule,MatchCardComponent],
  templateUrl: './live.component.html',
  styleUrl: './live.component.css'
})
export class LiveComponent implements OnInit{

  liveMatches: any
  constructor(private _api: ApiCallService) {
    
  }

  ngOnInit(): void {
    this.loadLiveMaches();
  }

  private loadLiveMaches() {
    this._api.getLiveMatches().subscribe({
      next: data => {
        console.log(data);
        this.liveMatches = data;
      },
      error: error => {
        console.log(error)
      }
    });
  }
}
