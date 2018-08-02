$(document).ready(function(){
  console.log("hello");
  $('#cancellogin').click(function(){
    $('#login-model').css("right", "-25%");
  });
});

function showLogin(){
  $('#login-model').css("right", "0");
}
