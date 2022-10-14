--Select
Select ContactName Adi, CompanyName Sirketadi, City Sehir from Customers

Select * from Customers where City = 'Berlin'

--case insensitive
sElEcT * from Products where categoryId=1 or categoryId=3

sElEcT * from Products where categoryId=1 and UnitPrice>=10

select * from Products where categoryId=1 order by UnitPrice desc  --ascending --descending

select count (*) from Products

select CategoryID, count(*) from products where UnitPrice>20
group by CategoryID having count(*)<10

select Products .ProductID, Products.ProductName, Products.UnitPrice, Categories.CategoryName
from Products inner join Categories
on Products.CategoryID = Categories.CategoryID
where Products.UnitPrice>10

--DTO Data Transformation object

select * from Products p left join [Order Details] od
on p.ProductID = od.ProductID
inner join orders o
on o.OrderID = od.OrderID

select * from Customers c left join Orders o
on c.CustomerID = o.CustomerID
where o.CustomerID is null

/*ikiden fazla tabloyu join etmek */
select * from Products p inner join OrderDetails od
on p.ProductId = od.ProductId
inner join Orders o
on o.OrderId = od.OrderId