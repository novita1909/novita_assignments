<html>
<head>
/head>
<body>
    <script>
         const a = parseInt(prompt('Enter a positive integer: '));

         function headRatio(a){
             var c=0;
             for(let i=0;i<a;i++){
                var s=(Math.floor(Math.random()*2) === 0) ? 'Heads' : 'Tails';
                if(s==='Heads') c++;
             }
             return c/a;
         }
         document.write(headRatio(a));
    </script>
</body>
</html>