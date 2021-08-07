<html>
<head>

</head>
<body>
<table>
<tr>
<td> <input type="text" name="a" id="first" placeholder="Enter a currency value"/> </td>
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

var value= parseInt(document.getElementById ("first").value);

var indianRuppe=value*74.28;
var yen=value=value*109.14;
var euro=value*0.84;
var pound=value*0.72;

document.getElementById ("num").innerHTML=
"INDIAN RUPPE-->"+indianRuppe+"<br>"+"JAPANESE YEN -->"+yen+"<br>"+" EURO -->"+euro+"<br>"+" POUND--> "+pound;


}
</script>