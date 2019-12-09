
window.onload = function () {
setTimeout(boyyah1,2000);
setTimeout(boyyah2(),2000);

};

function boyyah1() {
    alert("BOOYAH!");
}
function boyyah2() {
    setTimeout(alert,2000,"BOOYAH!");
}







