<!DOCTYPE html>
<html lang="en">
<head>
</head>
<body>
    <script>
        function square(arr){
        return arr*arr;
        }
        const arr=[1,2,3,4,5];
        const arr1=[1,4,9,16,25];
        const map=function(arr,logic){
            const ouput=[];
            for(let i=0;i<arr.length;i++){
                ouput.push(logic(arr[i]));
            }
            return ouput;
        }
       console.log(map([1,2,3,4,5],square)) ;
       console.log(map([1,4,9,16,25],Math.sqrt));
    </script>
</body>
</html>