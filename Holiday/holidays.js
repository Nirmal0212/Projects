
let btn = document.getElementById("btn");
btn.addEventListener("click", function() {
  let ourRequest = new XMLHttpRequest();
ourRequest.open('GET','https://www.jasonbase.com/things/A40j.json');
ourRequest.onload = function() {

  let ourData= JSON.parse(ourRequest.responseText);

   var output = '';
  Object.keys(ourData[0]).forEach(function(key) {
  output+=key+ "  <br>";
  var data = ourData[0][key];
  Object.keys(data).forEach(function(key) {
   output+=key+ " : "+data[key]+" <br>";
  });
});
   document.getElementById("result").innerHTML =output;

  console.log(ourData[0]);

  };
ourRequest.send();
});


let btn1 = document.getElementById("btn1");
btn1.addEventListener("click", function() {
  let ourRequest = new XMLHttpRequest();
ourRequest.open('GET','https://www.jasonbase.com/things/A40j.json');
ourRequest.onload = function() {

  let ourData= JSON.parse(ourRequest.responseText);
  var output = '';
 Object.keys(ourData[1]).forEach(function(key) {
 output+=key+ "  <br>";
 var data = ourData[1][key];
 Object.keys(data).forEach(function(key) {
  output+=key+ " : "+data[key]+" <br>";
 });
});

   document.getElementById("result").innerHTML =output;

  console.log(ourData[1]);

  };
ourRequest.send();
});


let btn2 = document.getElementById("btn2");
btn2.addEventListener("click", function() {
  let ourRequest = new XMLHttpRequest();
ourRequest.open('GET','https://www.jasonbase.com/things/A40j.json');
ourRequest.onload = function() {

  let ourData= JSON.parse(ourRequest.responseText);

  var output = '';
 Object.keys(ourData[2]).forEach(function(key) {
 output+=key+ "  <br>";
 var data = ourData[2][key];
 Object.keys(data).forEach(function(key) {
  output+=key+ " : "+data[key]+" <br>";
 });
 });
   document.getElementById("result").innerHTML =output;


  console.log(ourData[2]);

  };
ourRequest.send();
});


let btn3 = document.getElementById("btn3");
btn3.addEventListener("click", function() {
  let ourRequest = new XMLHttpRequest();
ourRequest.open('GET','https://www.jasonbase.com/things/A40j.json');
ourRequest.onload = function() {

  let ourData= JSON.parse(ourRequest.responseText);

  var output = '';
 Object.keys(ourData[3]).forEach(function(key) {
 output+=key+ "  <br>";
 var data = ourData[3][key];
 Object.keys(data).forEach(function(key) {
  output+=key+ " : "+data[key]+" <br>";
 });
 });
   document.getElementById("result").innerHTML =output;


  console.log(ourData[3]);

  };
ourRequest.send();
});


let btn4 = document.getElementById("btn4");
btn4.addEventListener("click", function() {
  let ourRequest = new XMLHttpRequest();
ourRequest.open('GET','https://www.jasonbase.com/things/A40j.json');
ourRequest.onload = function() {

  let ourData= JSON.parse(ourRequest.responseText);

  var output = '';
 Object.keys(ourData[4]).forEach(function(key) {
 output+=key+ "  <br>";
 var data = ourData[4][key];
 Object.keys(data).forEach(function(key) {
  output+=key+ " : "+data[key]+" <br>";
 });
 });
   document.getElementById("result").innerHTML =output;

  console.log(ourData[4]);

  };
ourRequest.send();
});


let btn5 = document.getElementById("btn5");
btn5.addEventListener("click", function() {
  let ourRequest = new XMLHttpRequest();
ourRequest.open('GET','https://www.jasonbase.com/things/A40j.json');
ourRequest.onload = function() {

  let ourData= JSON.parse(ourRequest.responseText);

  var output = '';
 Object.keys(ourData[5]).forEach(function(key) {
 output+=key+ "  <br>";
 var data = ourData[5][key];
 Object.keys(data).forEach(function(key) {
  output+=key+ " : "+data[key]+" <br>";
 });
 });
   document.getElementById("result").innerHTML =output;

  console.log(ourData[5]);

  };
ourRequest.send();
});


let btn6 = document.getElementById("btn6");
btn6.addEventListener("click", function() {
  let ourRequest = new XMLHttpRequest();
ourRequest.open('GET','https://www.jasonbase.com/things/A40j.json');
ourRequest.onload = function() {

  let ourData= JSON.parse(ourRequest.responseText);

  var output = '';
 Object.keys(ourData[6]).forEach(function(key) {
 output+=key+ "  <br>";
 var data = ourData[6][key];
 Object.keys(data).forEach(function(key) {
  output+=key+ " : "+data[key]+" <br>";
 });
 });
   document.getElementById("result").innerHTML =output;

  console.log(ourData[6]);

  };
ourRequest.send();
});
