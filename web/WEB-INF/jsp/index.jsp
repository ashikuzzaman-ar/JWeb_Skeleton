<script type="text/javascript">
    var timeInterval = 0;
    
    timeInterval = setInterval(ajaxTest, 2000);

    function ajaxTest() {

        $.ajax({
            url: "ajax_test",
            success: function (data) {
                var obj1 = $.parseJSON(data);
                
//                for(var key in obj1){
//                    
//                    if(obj1.hasOwnProperty(key)){
//                        
//                        document.write("<h1>Generated Number: "+obj1[key].number+"</h1>");
//                        document.write("<h1>Date: "+obj1[key].date+"</h1>");
//                    }
//                }
                
                $("#number").text(obj1.number);
                $("#date").text(obj1.date);
            }
        });
    }
</script>

<div class="container">
    <div class="jumbotron">

        <h1 id="number"></h1>
        <h1 id="date"></h1>

        <h1>Login Please</h1>
        <form action="home" method="POST">
            <input type="text" name="username" placeholder="Username" />
            <input type="password" name="password" placeholder="Password" />
            <input type="submit" value="Login" />
            <br />
            <a href="signup">Sign Up</a>
        </form>
    </div>
</div>