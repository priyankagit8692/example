create table person
(
id integer not null,
name varchar(255),
location varchar(255),
birth_date timestamp,
primary key(id)
);

INSERT INTO PERSON
     (ID,NAME,LOCATION,BIRTH_DATE)
VALUES(10001,'Priyanka','Pune',sysdate());
INSERT INTO PERSON
     (ID,NAME,LOCATION,BIRTH_DATE)
VALUES(10002,'Sandeep','New York',sysdate());
INSERT INTO PERSON
     (ID,NAME,LOCATION,BIRTH_DATE)
VALUES(10003,'Piyush','London',sysdate());