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

var rect1=new Rectangle(10,20);
var rect2=new Rectangle(308, 500);
document.writeln(rect1.getArea()+"<br>");
document.writeln(rect2.getArea());
</script>

</body>
</html>