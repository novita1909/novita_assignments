<html>
<head>
<script>
function bblSort(arr)
{
 for(var i = 0; i < arr.length; i++)
{
   for(var j = 0; j < ( arr.length -1 ); j++)
  {
     if(arr[j] > arr[j+1])
     {
       var temp = arr[j]
       arr[j] = arr[j + 1]
       arr[j+1] = temp
     }
   }
 }
 document.write(arr);
}
var arr = [2,34, 43, 55, 63,  5, 6, 23,15, 56,47];
bblSort(arr);

</script>
<body>  

</body>
</html>