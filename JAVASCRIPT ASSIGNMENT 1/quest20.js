<!DOCTYPE html>
<html lang="en">
<head>
    
    <style>
        input,textarea:focus{
            background-color: lightgray;
	       
        }
        .form{
            border: 4pm solid black;
            background-color: sandybrown;
            margin: 0 auto;
            padding: 10%;
        }
    </style>
   
</head>
<body>
    <Form class="form" id="newform">
        <label for="name">Name:</label>
        <input type="text" id="name" placeholder="Enter the name" required><br><br>
        <label for="email">Email:</label>
        <input type="email" id="email" placeholder="Enter the email" required><br><br>
        <h3>Toppings:</h3>
        <label for="t1">Extra cheese</label>
        <input type="checkbox" id="t1" name="pl" value="Extra cheese">
        <label for="t2">Pepproni</label>
        <input type="checkbox" id="t2" name="pl" value="pepprioni">
        <label for="t3">Olives</label>
        <input type="checkbox" id="t3"  name="pl" value="Olives">
        <label for="t4">Pepper</label>
        <input type="checkbox" id="t4"  name="pl" value="Pepper">
        <label for="t5">Bcon</label>
        <input type="checkbox" id="t5"  name="pl" value="Bcon">
        <label for="t6">Tomatoes</label>
        <input type="checkbox" id="t6"  name="pl" value="Tomatoes"> 
        <label for="t7">Mashrooms</label>
        <input type="checkbox" id="t7"  name="pl" value="Mashrooms">

        <h3>How do you want to get your pizza?</h3>
        <label for="s1">Delivary</label>
        <input type="radio" id="s1" name="transport" value="Deliavry">
        <label for="s2">pickup</label>
        <input type="radio" id="s2" name="transport" value="pickup">
        
        <h3>Tip?</h3>
        <select name="tip" id="tip">
            <option value="15">15%</option>
            <option value="20">20%</option>
            <option value="25">25%</option>
        </select>
        <hr>
        <h3>Address:</h3>
        <textarea name="address" id="add" cols="40" rows="8" required></textarea>
        <br><br>
       
        <input type="button" onclick="enableshowSummary()"" value="submit" >
        <input type="button" onclick="myFunction()" value="Reset form">
       <input id="button1" type="button" onclick="show()" value="show summary" disabled>
         <br>
         <br>
         <h3>Name:</h3>
         <div id="data"></div>
         <h3>email:</h3>
         <div id="d2">  </div>
         <h3>Toppings:</h3>
         <div id="d3"> </div>
         <h3>Type of transport:</h3>
         <div id="d4">
         </div>
         <h3>tip(%):</h3>
         <div id="d5"> </div>
         <h3>Address:</h3>
         <div id="d6">
           
         </div>
         <h4>Total prize</h4>
         <div id="d7">
           
        </div>
        <script src="function.js"></script>
        
    </Form>
</body>
<script>
myFunction(){
document.getElementById("newform").reset();
}
function enableshowSummary(){
    document.getElementById("button1").disabled = false;
}
function show(){
    var name=document.getElementById("name");
   
    var email=document.getElementById("email");
   
    var gender = document.getElementById("s1");
    var gender1 = document.getElementById("s2");
   
    var tip=document.getElementById("tip");
    var add=document.getElementById("add");

    document.getElementById("data").innerHTML=name.value;
    document.getElementById("d2").innerHTML=email.value;
    var markedCheckbox = document.getElementsByName('pl'); 
    var c=0; 
    for (var checkbox of markedCheckbox) {  
        if (checkbox.checked)  
          var txt=checkbox.value + ' ';  
          c++;
    
         }  
   document.getElementById("d3").innerHTML=txt;
   var op="";
    if(gender.checked)
   {    op=gender.value;
       document.getElementById("d4").innerHTML=gender.value;
    }
    else
    {document.getElementById("d4").innerHTML=gender1.value;}

    document.getElementById("d5").innerHTML=tip.value;
    document.getElementById("d6").innerHTML=add.value;
    var d=0;
    if(op==="pickup") d=0;
    else d=5;
    var total=(10+(1.5*c)+d)*1+tip.value;
    document.getElementById("d7").innerHTML=total;
}
</script>
</html>