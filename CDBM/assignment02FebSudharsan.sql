--@author Sudharsan_Murali

--Creating the employee table
create table Employees (
	Employee_ID char(5) primary key not null,
	Employee_Name nvarchar(40),
	Employee_Job nvarchar(20) not null,
	Employee_Address nvarchar(35) not null,
	Employee_Salary money not null,
	Employee_DOB date not null
);

--assigning Employee_ID as a primary key
-- alter table dbo.Employees add constraint PK_Employee_ID primary key (Employee_ID);

--Creating the customer table
create table Customers (
	Customer_ID char(10) primary key not null,
	Customer_Name nvarchar(35) not null,
	Customer_Points integer,
	Customer_Address nvarchar(35),
	Customer_Email nvarchar(35) not null
);

--assigning Customer_ID as a primary key
-- alter table dbo.Customers add constraint PK_Customer_ID primary key (Customer_ID);

-- Creating relational table between employee and customer
create table Employee_Customers (
	Employee_ID char(5) not null,
	Customer_ID char(10) not null,
	primary key (Employee_ID, Customer_ID)
);

--altering both columns in employee_customers table to be primary keys
-- alter table dbo.Employee_Customers add constraint PK_Employee_ID primary key (Employee_ID);
-- alter table dbo.Employee_Customers add constraint PK_Customer_ID primary key (Customer_ID);
-- alter table dbo.Employee_Customers add primary key(Employee_Id, Customer_ID);

--creating foreign keys
ALTER TABLE dbo.Employee_Customers 
	ADD CONSTRAINT FK_Employee_ID FOREIGN KEY (Employee_Id) references Employees(Employee_Id);
ALTER TABLE dbo.Employee_Customers 
	ADD CONSTRAINT FK_Customer_ID FOREIGN KEY (Customer_ID) references Customers(Customer_ID);