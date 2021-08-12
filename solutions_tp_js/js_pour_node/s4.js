function Ventes(secteur, chiffreAffaireHt){
    this.secteur=secteur;
    this.chiffreAffaireHt=chiffreAffaireHt;
    this.chiffreAffaireTtc = function(tauxTvaPct){
        return (1 + tauxTvaPct/100) * this.chiffreAffaireHt;
    }
}

var ventesPapeterie = new Ventes("papeterie",35892.45);
console.log(JSON.stringify(ventesPapeterie));//{"secteur":"papeterie","chiffreAffaireHt":35892.45}
console.log("chiffreAffaireTtc pour papeterie:" 
             +ventesPapeterie.chiffreAffaireTtc(20.0));
			 

var tabVentes = [ ventesPapeterie ];
tabVentes.push(new Ventes("vins" , 15688.6));
tabVentes.push(new Ventes("legumes" , 27897.3));
tabVentes.push(new Ventes("fruits" , 13789.1));
tabVentes.push(new Ventes("viandes" , 21789.96));

function chiffreAffaireHtTotal(tabVentes){
    if(tabVentes==undefined  || tabVentes.length == 0)
       return 0;
 
    var somme = 0;
    for(i in tabVentes)
       somme+=tabVentes[i].chiffreAffaireHt;
    return somme ;
}

var ca_total = chiffreAffaireHtTotal(tabVentes);
console.log("chiffreAffaireHtTotal="+ca_total); //exemple: 115057.41

//supprimer l'élément "vins" du tableau tabVentes
//d'indice 0+1 puis réafficher le tableau tabVentes(avec éléments restants)
//au format JSON


//delete tabVentes[1]; //avec trou "null"
tabVentes.splice(1,1);
console.log("tabVentes (après suppression des vins):" 
          + JSON.stringify(tabVentes));
