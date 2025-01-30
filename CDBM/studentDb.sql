CREATE TABLE Student (
	ID int PRIMARY KEY NOT NULL, --primary key 
	FirstName NVARCHAR(40) NOT NULL,
	LastName NVARCHAR(40) NOT NULL,
	Address NVARCHAR(255)
	-- , PRIMARY KEY(ID)
	)

ALTER TABLE dbo.Student
ADD CONSTRAINT PK_Student PRIMARY KEY (ID);

ALTER TABLE dbo.Student
ADD phone int;

ALTER TABLE dbo.Student
ADD City NVARCHAR(50);

ALTER TABLE dbo.Student
ADD Province NVARCHAR(50);

ALTER TABLE dbo.Student 
ALTER COLUMN ID int NOT NULL;

DROP TABLE dbo.Student;