const $ = require('jquery');


function sayHello(){
    console.log("hello")
}
sayHello()

$('h1').click(function (e) {
    $('h1').css('background-color', 'blue');
});


