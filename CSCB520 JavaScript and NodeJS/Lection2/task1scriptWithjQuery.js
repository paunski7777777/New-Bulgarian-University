getHeader();
getLinks();
setBackgroundColor();
setTitleElementsToDarkRed();

function getHeader() {
    console.log($("#header"));
}

function getLinks() {
    console.log($(".link"));
}

function setBackgroundColor(){
    $("#header").css("background-color", "red");
}

function setTitleElementsToDarkRed() {
    $(".title").css("color", "darkred");
}