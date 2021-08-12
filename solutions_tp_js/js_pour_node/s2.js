//var tabVal = new Array(12, 23, 5, 45, 7, 8);
var tabVal = [12, 23, 5, 45, 7, 8];
console.log(tabVal);
//tabVal[(tabVal.length+1)-1]=2;
tabVal.push(2); //ajout à la fin, nouvelle taille =7 , nouvelle indice = 7-1=6
console.log(tabVal);
//tabVal.pop(); //retirer le dernier element
//delete tabVal[2]; //remplacer tabVal[2] par undefined
tabVal.splice(2,1); //supression de la case [2] , tableau plus petit
console.log(tabVal);
var s = 0;
/*
for(var i = 0 ; i < tabVal.length ; i++){
    s += tabVal[i];
}*/
for(let i in tabVal){
    s += tabVal[i]; // s=s+tabVal[i]
}
console.log("somme = " + s);

var saisonsCouleurs = []; // Tableau associatif
saisonsCouleurs["hiver"] = "blanc";
saisonsCouleurs["printemps"] = "vert";
saisonsCouleurs["ete"] = "jaune";
saisonsCouleurs["automne"] = "marron";

for(clef in saisonsCouleurs){
    console.log(clef + " : " + saisonsCouleurs[clef]);
}

function Devise(code, nom, change){
    this.code = code;
    this.nom = nom;
    this.change = change;
    this.display = function(){
        console.log('[' + this.code + "] " 
                   + this.nom + " : " + this.change)
    }
}

let devise1 = new Devise("EUR","Euro",0.9);

let deviseJson = JSON.stringify(devise1);
console.log('deviseJson='+deviseJson);

/*
let devise1= [];
devise1["code"]="EUR";
devise1["nom"]="Euro";
devise1["change"]=0.9;
devise1["display"]=function(){ console.log( this.code + ", " + this.nom + " : " + this.change);};
*/

devise1.display();
devise1.change=0.92;
devise1.display();
console.log("nom de devise1="+devise1.nom);
console.log("code de devise1="+devise1["code"]);

var tabDevises = [];
tabDevises.push(new Devise("USD","Dollar",1.0));
tabDevises.push(new Devise("EUR","Euro",0.9));
tabDevises.push(new Devise("GBP","Livre",0.8));
tabDevises.push(new Devise("JPY","Yen",123.0));
for(i in tabDevises){
   tabDevises[i].display();
}

let tabJson = JSON.stringify(tabDevises);
console.log('tabJson='+tabJson);

//objet javascript literal
let v1 = {
    marque : 'peugeot' ,
    modele : "208" ,
    couleur : "bleu",
    longueur : 4.32,
    estEnPanne : false
}

console.log("v1="+v1);
console.log("v1.marque="+v1.marque);
console.log("v1.longueur="+v1.longueur);

let v1Json = JSON.stringify(v1);
console.log("v1Json="+v1Json);
let v2EnTantQueCloneDeV1 = JSON.parse(v1Json);
console.log("v2EnTantQueCloneDeV1.marque="+v2EnTantQueCloneDeV1.marque);
console.log("v2EnTantQueCloneDeV1.longueur="+v2EnTantQueCloneDeV1.longueur);

var expression = "2*4+8";
var res = eval(expression); console.log(expression + " = " + res);

console.log("maintenant = " + (new Date()).toTimeString());
function actionDifferee() {
    console.log("plus tard = " + (new Date()).toTimeString());
}
var refAction = actionDifferee;
setTimeout(refAction,5000); // Déclenchement en différé de 5000ms
