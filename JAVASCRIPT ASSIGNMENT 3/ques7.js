<!DOCTYPE html>
<html>
<body>


<p id="demo"></p>

<script>
const txt = '{"firstname":"novita",  "lastname":"sharma"}'
const obj = JSON.parse(txt);
document.getElementById("demo").innerHTML = obj.firstname + " " + obj.lastname;
</script>

</body>
</html>
