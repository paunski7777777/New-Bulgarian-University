getHeader();
getLinks();
setBackgroundColor();
setTitleElementsToDarkRed();


function getHeader() {
    console.log(document.getElementById('header'));
}

function getLinks() {
    console.log(document.getElementsByClassName('link'));
}

function setBackgroundColor(){
    document.getElementById('header').style.backgroundColor = 'red';
}

function setTitleElementsToDarkRed() {
    var titles = document.getElementsByClassName('title');

    for (var i = 0; i < titles.length; i++){
        titles[i].style.color = 'darkred';
    }
}