window.onload = function () {
    var biigertext = this.document.getElementById("biggertext");
    var bling = this.document.getElementById("bling");
    var mytextarea = document.getElementById("mytextarea");
    var piglatin = this.document.getElementById("piglatin");
    var malkovith=this.document.getElementById("malkovith")



    biigertext.onclick = function () {
        setInterval(biggersize, 500);
        mytextarea.style.textAlign = "right";
    }
    function biggersize() {
        alert("Hello world");

        var m = window.getComputedStyle(mytextarea).fontSize;
        if (m == "16px")
            m = Number.parseInt(window.getComputedStyle(mytextarea).fontSize) * (3 / 4) + 2 + "pt";
        else
            m = Number.parseInt(window.getComputedStyle(mytextarea).fontSize) + 2 + "pt";

        mytextarea.style.fontSize = m;
    }

    bling.onchange = function () {
         alert("Hello world");
        if (bling.checked) {
            mytextarea.style.fontWeight = "bold";
            mytextarea.style.color = "green";
            mytextarea.style.textDecoration = "underline";
            document.body.style.backgroundImage="url(\"myimages/hundred-dollar-bill.jpg\")";
            document.body.style.size="cover";
            
        }
        else {
            mytextarea.style.fontWeight = "normal";
            mytextarea.style.color = "black";
            mytextarea.style.textDecoration = "none";
            document.body.style.backgroundImage="url(\"\")";
            document.body.style.size="";
        }

    }

    piglatin.onclick=function () {
        var val = mytextarea.value.toLowerCase();
        if(val[0]=="a"||val[0]=="e"||val[0]=="i"||val[0]=="o"||val[0]=="u"){
            mytextarea.value=val+"-ay";
        }
        else{
            mytextarea.value=val.substring(1,val.length)+val[0]+"-ay";
        }
    }

    malkovith.onclick=function(){
        var val=mytextarea.value;
        if( val.length>=5){
            mytextarea.value= "malkovith";
        }

    }
}


