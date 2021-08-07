<html>
<head>

</head>
<body>
<table>
<tr>
<td> <input type="text" name="a" id="first" placeholder="Enter a number"/> </td>
</tr>
<tr>
<td> <button onclick="sum ()">Submit</button></td>
</tr>
</table>
<div id="num"></div>
</body>

<script type="text/javascript">
function sum()
{
var n;
n = parseInt(document.getElementById ("first").value);
if(n%2==0)
{
document.getElementById ("num").innerHTML="Number is even";
}
else
{
document.getElementById ("num").innerHTML="Number is odd";

}

}
</script>
</html>