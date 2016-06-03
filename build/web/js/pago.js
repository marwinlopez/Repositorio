/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/* Card.js plugin by Jesse Pollak. https://github.com/jessepollak/card */

$('form').card({
    container: '.card-wrapper',
    width: 280,

    formSelectors: {
        nameInput: 'input[name="first-name"], input[name="last-name"]'
    }
});

function pagoOnChange(sel) {
      if (sel.value=="DEPOSITO"){
           divC = document.getElementById("nCuenta");
           divC.style.display = "";

           divT = document.getElementById("nTargeta");
           divT.style.display = "none";

      }else{

           divC = document.getElementById("nCuenta");
           divC.style.display="none";

           divT = document.getElementById("nTargeta");
           divT.style.display = "";
      }
}
