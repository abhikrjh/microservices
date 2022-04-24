1- Customer service

   Table Name - customer
   Field Name - id, name, address

2- Product Service 

   Table Name - product
   Field Name - id, name, custId

3- Order Service
   
   Table Name - order
   Field Name - id, product
   
4- My Orders
   
   We will treat this MyOrder Class as common entity among all the service 
   
      for which we will add groupId , artificatId and version of this MyOrder to all other services pom.xml file
   
   We will create a simple POJO object which will return us product details along with the cutomer who has ordered that product

   
   
   
   


   
   
