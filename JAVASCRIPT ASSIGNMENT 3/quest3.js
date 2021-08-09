<!DOCTYPE html>
<html>
<body>

<script>
function Rectangle(width,height)
{
  this.width=width;
  this.height=height;
}

Rectangle.prototype.getArea=function()
  {
    return this.width*this.height;
  }

var rect1=new Rectangle(5,4);

rect1.hieght=50;
document.writeln(rect1.height);
document.writeln(rect1.hieght); //name difference


document.writeln(rect1.getArea()+"<br>");
</script>

</body>
</html>