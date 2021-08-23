var next = (number,nextFibonacciNumbe)=>{
    nextfibonacciNumber(number);
}
var nextfibonacciNumber = (number)=>{
    let n1 = 0;
    let n2 = 1;
    var n3;
    for(let i=0;i<=number;i++){
      n3 = n1+n2;
      n1=n2;
      n2=n3;
   }
    console.log(n1);


}
next(8);