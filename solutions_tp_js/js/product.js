//variables globales:

var eltSelProduct;
//var eltSpanIdProd;
var eltTxtCode;
var eltTxtNom;
var eltTxtPrix;
var eltTxtDescription;
var eltTxtCategorie;

var selectedProd = null; //produit selectionné (existant ou nouveau)
var estNouveau = false; //nouveau produit ou pas (pas encore ajouté ni sélectionné)

var tabProduits = []; //tableau des produits en mémoire

//fonction préparant un tableau de produits en mémoire (jeu de données)
function initDataSet(){
   tabProduits = [
      { code:1 , nom : "cahier" , prix: 3.5 , 
        description : "grand cahier" , categorie : "papeterie" } ,
     { code:2 , nom : "stylo" , prix: 1.5 , 
        description : "stylo bille bleu" , categorie : "papeterie" } ,
     { code:3 , nom : "pc" , prix: 567.5 , 
        description : "pc portable 15 pouces" , categorie : "ordinateur" } 
   ];
}


//fonction qui retrouve un produit dans le tableau en mémoire depuis son id:
function findProductById(idProd){
   let prod=null;
   for(let i in tabProduits){
      if(idProd==tabProduits[i].code){
         prod=tabProduits[i]; break;
      }
   }
   return prod;
}

//fonction qui affiche les valeurs d'un produit
//dans les différents champs de saisie du formulaire:
function displayProductInFormFields(prod){
   //eltSpanIdProd.innerHTML=prod.code;
   eltTxtCode.value = prod.code;
   eltTxtNom.value = prod.nom;
   eltTxtPrix.value = prod.prix;
   eltTxtDescription.value = prod.description;
   eltTxtCategorie.value = prod.categorie;
}

//fonction inverse qui réactualise les valeurs d'un produit
//en fonction des valeurs saisies dans les champs du formulaire:
function updateProductFromValuesOfFormFields(prod){
   prod.code = eltTxtCode.value ;
   prod.nom = eltTxtNom.value;
   prod.prix = eltTxtPrix.value;
   prod.description = eltTxtDescription.value;
   prod.categorie = eltTxtCategorie.value;
}

//fonction actualisant les états des boutons et ...
function manageStates(){
   if(estNouveau){
      document.querySelector("#btnAdd").disabled = false;
      document.querySelector("#btnUpdate").disabled = true;
      //...
   }else{
      document.querySelector("#btnAdd").disabled = true;
      document.querySelector("#btnUpdate").disabled = false;
      //...
   }
}

//Nouvelle sélection dans liste
function onSelectProduct(evt){
   //eltSpanIdProd.innerHTML=evt.target.value;
   let idOfSelectedProd = evt.target.value;
   selectedProd = findProductById(idOfSelectedProd);        
   if(selectedProd!=null){
       estNouveau=false;
       displayProductInFormFields(selectedProd);
       manageStates();
   }
}

//Nouveau produit à saisir
function onNewProduct(evt){
  console.log("onNewProduct()")
  selectedProd={
     code : 0,
     nom : "",
     prix : 0,
     description : "",
     categorie : ""
  };
  estNouveau=true;
  eltSelProduct.value=undefined;//plus d'existant sélectionné dans liste <select>
  displayProductInFormFields(selectedProd);
  manageStates();
}



//produit à ajouter (nouveau)
function onAddProduct(evt){
   updateProductFromValuesOfFormFields(selectedProd);
   console.log("onAddProduct() , selectedProd="+JSON.stringify(selectedProd));
   
}

//produit existant (sélectionné) à mettre à jour
function onUpdateProduct(evt){
   updateProductFromValuesOfFormFields(selectedProd);
   console.log("onUpdateProduct() , selectedProd="+JSON.stringify(selectedProd));
   addOrUpdateOptionInSelect(selectedProd);
}

//produit existant (sélectionné) à supprimer
function onDeleteProduct(evt){
   console.log("onDeleteProduct(), selectedProd="+JSON.stringify(selectedProd))
}

//fonction qui ajoute ou met à jour une option dans la balise <select>
function addOrUpdateOptionInSelect(prod){
      let eltOption = null;
      //recherche option éventuellement déjà existante:
      eltOption = eltSelProduct.querySelector("option[value='"+prod.code+"']");
      if(eltOption == null){
         //création d'une nouvelle option:
         eltOption = document.createElement("option");
         eltSelProduct.appendChild(eltOption);
         eltOption.setAttribute("value",prod.code);
      }
      
      //eltOption.innerHTML=prod.nom;
      eltOption.innerHTML="[" + prod.code + "] " + prod.nom;
      
}

function initialisations(){
     eltSelProduct = document.querySelector("#selProduct");
     //eltSpanIdProd = document.querySelector("#spanIdProd");
     eltTxtCode = document.querySelector("#txtCode");
     eltTxtNom = document.querySelector("#txtNom");
     eltTxtPrix = document.querySelector("#txtPrix");
     eltTxtCategorie = document.querySelector("#txtCategorie");
     eltTxtDescription = document.querySelector("#txtDescription");

     initDataSet();

    for(let i in tabProduits){
      addOrUpdateOptionInSelect(tabProduits[i]);
    }

    eltSelProduct.addEventListener("change",onSelectProduct);

    document.querySelector("#btnNew").addEventListener("click",onNewProduct);
    document.querySelector("#btnAdd").addEventListener("click",onAddProduct);
    document.querySelector("#btnUpdate").addEventListener("click",onUpdateProduct);
    document.querySelector("#btnDelete").addEventListener("click",onDeleteProduct);

    manageStates();
}
window.onload= initialisations;