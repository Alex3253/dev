
/*
Dado el importe de consumo de un restaurante, diseñe un programa que determine los calculos 
de facturacion que se efectuan de la siguiente manera:
importe de descuento:
         
         importe de consumo            desscuento
         ----------------------------------------
         hasta 200                        10%
         mas de 200                       20%

importe de pago:
-----------------
El imorte de pago se obtendra del decuento aplicado al importe de consumo

Importe de IGV:
-----------------

         importe de pago                IGV
         ------------------------------------
         Hasta 100                       8%
         entre 101 a 200                 12%
         mas de 200                      15%

Importe total:
----------------
El importe total se obtendra de la suma del importe de pago + igv

*/
function calcularFacturacion() {
    
    let consumo = parseFloat(document.getElementById('consumo').value);

    let descuento;
    if (consumo <= 200) {
        descuento = 0.10;
    } else {
        descuento = 0.20; 
    }
    let importeDescuento = consumo * descuento;
    let importePago = consumo - importeDescuento;

   
    let igvRate;
    if (importePago <= 100) {
        igvRate = 0.08; 
    } else if (importePago <= 200) {
        igvRate = 0.12; 
    } else {
        igvRate = 0.15; 
    }
    let importeIGV = importePago * igv;

    
    let importeTotal = importePago + importeIGV;

    
    document.getElementById('descuento').value = `${importeDescuento}`;
    document.getElementById('importePago').value = `${importePago}`;
    document.getElementById('igv').value = `${importeIGV}`;
    document.getElementById('importeTotal').value = `${importeTotal}`;
}












