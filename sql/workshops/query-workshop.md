1) 
  a) SELECT * FROM Shippers;
  b) SELECT * FROM Shippers ORDER BY CompanyName DESC;
2)
  a) SELECT FirstName, LastName,Title,BirthDate,City  FROM Employees;
  b) SELECT DISTINCT Title as "Designation List" FROM Employees;
3) SELECT * FROM Order_Details INNER JOIN Orders ON Orders.OrderID = Order_Details.OrderID;
4) SELECT * FROM Customers WHERE Customers.City = "London" OR Customers.City = "Madrid";
5) SELECT Customers.ContactName, Customers.Phone FROM Customers WHERE Customers.Country = "UK" ORDER BY Customers.ContactName ASC;
6) SELECT Orders.OrderID, Orders.OrderDate FROM Orders WHERE Orders.CustomerID = "HANAR";
7) SELECT OrderID, OrderDate
FROM Orders
WHERE CustomerID IN (SELECT CustomerID FROM Customers WHERE ContactName = "Janete Limeira");
8) SELECT * FROM Products WHERE ProductName LIKE "%Lager%";
9)
10)
11)
12)
13)
14)
15)
16)
17)
18)
  a)
  b)
  c)
19)
  a)
  b)
20)
  a)
  b)
21)
22)
23) 
24)
25)
  a)
  b)
26)
27)

