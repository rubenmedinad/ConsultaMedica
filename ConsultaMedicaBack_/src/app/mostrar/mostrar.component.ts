import { Component } from '@angular/core';
import { Medico } from '../models/interfaces/Medico.model';
import { DataService } from '../services/data.service';

@Component({
    selector: 'app-mostrar',
    templateUrl: './mostrar.component.html',
    styleUrls: ['./mostrar.component.css']
})
export class MostrarComponent {
    medicos: Medico[] = [];
    constructor(private data:DataService) { }

    ngOnInit(): void {
        this.data.getMedicos().subscribe(
            (data:Medico[]) => this.medicos = data
        );
    }

}
