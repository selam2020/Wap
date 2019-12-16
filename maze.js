$('document').ready(
    function(){
        $('div.boundary').mouseover(function(){
            $( "div.boundary" ).addClass( "youlose" );
            $("h2").text("looser!")
        });
        $('')
        
    }
)