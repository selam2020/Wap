$('document').ready(
    function(){
        $('div.boundary').mouseover(function(){
            $('div.boundary').each(function(){
            $('div.boundary').addClass("youlose");
            message("losser!")            
        });
    });
        $('#start').click(function(){
            start = true;
            message("You are playing right now!")
            $( "div.boundary" ).removeClass("youlose");
        })
        $('#end').click(function(){
            if(start==true){
            message("winner!!")
            $( "div.boundary" ).removeClass("youlose");
            }
            else
            message("please start the game first!")
        })
        
        function message(message){
            $("h2").text(message)
        }
        
    }
)