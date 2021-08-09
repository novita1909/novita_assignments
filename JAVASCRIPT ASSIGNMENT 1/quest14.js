<!DOCTYPE html>
<html>
    <body>
    <script>
      
      var randoms = new Array(100);

      for(i =0;i<=100; i++)
      {
          randoms[i]= parseInt( Math.random() * 100);
      }
      for(i=0;i<=100;i++)
      {
        document.write(randoms[i]);
        document.write("<br>");
      }

      document.write("******************************************************************");
      longest();
      smallest();
      oddORevenCount();
      sum_avg();

      function longest()
      {
          var longest= randoms[0];
          for(i=0;i<100 ;i++)
          {
              if(randoms[i]>longest)
              {
                  longest =randoms[i];
              }
          }
          document.write("<br>");
          document.write("Longest: "+ longest);
      }

      function smallest()
      {
        var smallest= randoms[0];
          for(i=0;i<100 ;i++)
          {
              if(randoms[i]<smallest)
              {
                smallest =randoms[i];
              }
          }
          document.write("<br>");
          document.write("Smallest: "+ smallest);
      }

      function oddORevenCount()
      {
          var evenCount=0;
          var oddCount=0;
          for(i=0;i<100 ;i++)
          {
              if(randoms[i]%2==0)
              {
                evenCount++;
              }
          }
          for(i=0;i<100 ;i++)
          {
              if(randoms[i]%2==1)
              {
                oddCount++;
              }
          }

          document.write("<br>");
          if(oddCount>evenCount)
          {
              document.write("OddCount is more: "+ oddCount);
          }
          else
          {
            document.write("EvenCount is more: "+ evenCount);   
          }

      }

      function sum_avg()
      {
        var sum=0;
          for(i=0;i<100 ;i++)
          {
              sum = sum+ randoms[i];
          }

          var avg= sum/100; 
          document.write("<br>");
          document.write("sum: "+ sum + "    Average: "+ avg );

      }
    </script>
    </body>
    </html>