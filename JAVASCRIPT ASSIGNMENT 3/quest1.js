<!DOCTYPE html>
<html>
<body>

<script>
class Rectangle {
  constructor(height, width) {
    this.height = height;
    this.width = width;
  }
  
  detail()
    {
  document.writeln(this.width+" "+this.height+"<br>")
    }
}
var myRect = new Rectangle(10,20);
var myRect1 = new Rectangle(190,290);
myRect.detail();
myRect1.detail();
</script>

</body>
</html>
