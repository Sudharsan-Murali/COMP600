CREATE TABLE Student (
	ID int PRIMARY KEY NOT NULL, --primary key 
	FirstName NVARCHAR(40) NOT NULL,
	LastName NVARCHAR(40) NOT NULL,
	Address NVARCHAR(255),
	-- , PRIMARY KEY(ID)
	City varchar(10),
	Province varchar(20)
	);

-- ALTER TABLE dbo.Student alter column Province varchar(20);
DELETE ID FROM dbo.Student where ID 001;
INSERT INTO dbo.Student 
	VALUES (002, 'Sudharsan', 'Murali', '514 Saskatchewan Street W', 'Moose Jaw', 'Saskatchewan');
	
CREATE TABLE Course(
	CourseCode INT PRIMARY KEY NOT NULL,
	Course_Name VARCHAR(50) NOT NULL,
	Instructor VARCHAR(50)
	);

CREATE TABLE Student_Course(
	StudentID int NOT NULL,
	CourseCode int NOT NULL
	);

ALTER TABLE dbo.Student_Course ADD PRIMARY KEY (StudentID, CourseCode)

ALTER TABLE dbo.Student_Course ADD CONSTRAINT fk_student FOREIGN KEY (StudentID) references Student(ID);
ALTER TABLE dbo.Student_Course ADD CONSTRAINT fk_course FOREIGN KEY (CourseCode) references Course(CourseCode);

DROP TABLE Student_Course;
DROP TABLE Course;

