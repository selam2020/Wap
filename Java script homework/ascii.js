window.onload = function () {
    var screen = this.document.getElementById("screen");
    var start = this.document.getElementById("start");
    var choise = this.document.getElementById("choise");
    var animation = this.ANIMATIONS["Blank"];
    var stop = document.getElementById("stop");
    var size = this.document.getElementById("size");
    var turbo = this.document.getElementById("turbo");
    var timeer ;
    var i = 0;
    var speed=250;
    var starting;
    var stoppping;
    
    stop.disabled=true;
    screen.style.fontSize= "12pt";

       var starting= start.onclick = function () {

        if (animation) {
            stop.disabled=false;
            start.disabled=true;
            var frames = [];
            frames = animation.split("=====\n");
            timeer= setInterval(animate, speed, frames);
        
        }
        else {

        }
        function animate(f) {
            timeer;
            if (i > Number.parseInt(f.length)-1)
                i = 0;
                console.log(i+ "  length:"+f.length + "  speed : " +speed);
                screen.value = f[i];  
            ++i;
            
        }

    }

    var stopping= stop.onclick= ()=>{
        stop.disabled=true;
        start.disabled=false;
        clearInterval(timeer);
    };

    size.onchange= ()=>{
        screen.style.fontSize= size.value+"pt";
    }
    choise.onchange = function selctor() {
        screen.value="";
        animation = ANIMATIONS[choise.value];
        screen.value = animation;

    }
    turbo.onchange=()=> {
        if(speed==250)
        speed = 50;
        else 
        speed = 250;
        stopping();
        starting();
        
    };
}

