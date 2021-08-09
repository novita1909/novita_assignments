<!DOCTYPE html>
<html>
<body>

<script>  

function sortItems(array) {
	for (let i = 0; i < array.length; i++) {
		for (let j = 0; j < array.length; j++) {
			if (array[j] > array[j + 1]) {
				let temp = array[j];
				array[j] = array[j + 1];
				array[j + 1] = temp;
			}
		}
	}
	return array;
}

int a=[1,99,65,3,2,5];
sortItems(a);
document.write(sortItems);
</script>  
</body>
</html>

 
