<!DOCTYPE html>
<html>
<body>

<script>
var array1 = ["a", "b", "c"],
    array2 = [1, 2, 3],
    result = [],
    i, l = array1.length+array2.length;
    
for (i = 0; i < l; i++) {
    result.push(array1[i], array2[i]);
}

document.write(result);
</script>

</body>
</html>
