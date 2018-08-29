$(document).ready(function(){
  console.log("hello");
  $('#cancellogin').click(function(){
    $('#login-model').css("right", "-25%");
  });
  if($('aside').data('isloggedin') === "yes"){
    console.log("user is logged in");
    console.log("isLoggedIn value is: " + $('aside').data('isloggedin'));
    $('aside').css("margin-left", "0");
    $('#login-button').text("logout");
  } else {
    console.log("user is not logged in");
    console.log("isLoggedIn value is: " + $('aside').data('isloggedin'));
    $('#login-button').text("login");
  }

  $('#login-button').on("click", function(){
    if($('aside').data('isloggedin') === "no"){
      showLogin();
    } else {
      window.location.replace("/home");
    }
  });
});

function showLogin(){
  $('#login-model').css("right", "0");
}
