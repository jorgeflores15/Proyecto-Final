/*global $, document*/
$(document).ready(function () {

    'use strict';

   
    // ------------------------------------------------------- //
    // Polar Chart
    // ------------------------------------------------------ //
    var POLARCHARTEXMPLE  = $('#polarChartExample');
    var polarChartExample = new Chart(POLARCHARTEXMPLE, {
        type: 'polarArea',
        options: {
            elements: {
                arc: {
                    borderWidth: 0,
                    borderColor: '#aaa'
                }
            }
        },
        data: {
            datasets: [{
                data: [
                    10,
                    7,
                    6,
                    5
                    
                ],
                backgroundColor: [
                    "#e05f5f",
                    "#e96a6a",
                    "#ff7676",
                    "#ff8b8b",
                    "#fc9d9d"
                ],
                label: 'My dataset' // for legend
            }],
            labels: [
                "Productos disponibles",
                "Productos vendidos",
                "Ofertas Disponibles",
                "Usuarios Registrados"
            ]
        }
    });

    var polarChartExample = {
        responsive: true
    };

});
