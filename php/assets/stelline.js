function addstar(star){
    if("fa fa-star checked"==star.className){
        for(var i=star.id;i<6;i++){
            console.log(i);
            document.getElementById(i).className = "fa fa-star";
        }
        document.getElementById(star)
    }else if("fa fa-star"==star.className){
        for(var i=0;i<star.id;i++){
            console.log(i+1);
            document.getElementById(i+1).className = "fa fa-star checked";
        }
    }
}

function checkstar(){
    var c=0;
    var inh = document.createElement("input");
    inh.setAttribute("type","hidden");
    inh.setAttribute("name","voto");
    for(var i=1;i<=5;i++){
        if(document.getElementById(i).className=="fa fa-star checked"){
            c++;
        }
    }
    inh.value=c;
    document.getElementById("form").append(inh);
}