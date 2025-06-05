$(window).on("load",function(){
	$(".header").sticky({ topSpacing: 0});
});

function goLink(url){
	window.location.href=url;
}
/*idleTimer = null;

idleState = false;

idleWait = 60000;




(function ($) {




    $(document).ready(function () {




        $('*').bind('mousemove keydown scroll', function () {




            clearTimeout(idleTimer);




            if (idleState == true) { 




                // Reactivated event

              // alert("<p>Welcome Back.</p>");            

            }




            idleState = false;




            idleTimer = setTimeout(function () { 




                // Idle Event

                alert("Your session is expired. Please login again.");

				document.location.href = "logout";

                idleState = true; }, idleWait);

        });




        $("body").trigger("mousemove");




    });

}) (jQuery);
*/
