
window.onload = function(){

    let eltSelCategorie = document.getElementById("selCategorie");
    
    eltSelCategorie.addEventListener("change",function (evt){
         //let categorieChoisie = ....... .value
        console.log("categorie choisie:" +categorieChoisie );
        let url = "./data/products_" + categorieChoisie +".json";
        makeAjaxGetRequest(url,callbackProduitsSucces,callbackError);
    });

}

function callbackProduitsSucces(responseData){
    //console.log("Succes:"+responseData + " " + typeof responseData);
    let tabProduits = JSON.parse(responseData);
    let eltTBody = document.getElementById("tBodyProd");
    tBodyProd.innerHTML="" ; //vider eventuel ancien contenu de <tbody id="tBodyProd">
    for(let i in tabProduits){
        let  newRow = eltTBody.insertRow(-1) ; //new <tr> and .appendChild()
        let newCellCode = newRow.insertCell(0);  //colonne 1 (code)
            //newCellCode.innerText = .......; //sous partie .code de l'objet javascript
                                               //en position [i] du tableau invisible tabProduits (en mémoire)
        /* code à compléter pour autres colonnes */
    }
}

function callbackError(responseData){
    console.log("ERROR:"+responseData);
    let tBodyProd = document.getElementById("tBodyProd");
    tBodyProd.innerHTML="" ; //vider eventuel ancien contenu de <tbody id="tBodyProd">
}