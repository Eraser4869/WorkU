/*Transaction1*/

Insert Into Route (RouteNo, Origin, Destination, EstimatedTimeDeparture, EstimatedTimeArrival)
Values ('FBN001','Perth','Singapore',1100,1600);
Insert Into Airplane (SerialNo, SeatCapacity, PlaneModel, NextScheduledMaintenance) 
VALUES ('FH-FBT', 350, 'Boeing 767', '20/6/2021');
Commit;

/*Transaction2*/

Insert Into Employee (EmployeeNo, EmpName, EmpPhone, JobTitle)
Values (00001, 'Martha McGee', 12345678, 'Pilot'),
(00002 'Dorothy McDonald', 91011121, 'Co-Pilot'),
(00003, 'Albert Tharp', 31415161, 'Engineer'),
(00004, 'Kathy Kelly', 71819202, 'Head Steward'),
(00005, 'Aubrey Ornellas', 12223242, 'Steward');

Insert Into CrewAssignment (EmployeeNo, RouteNo, TADate, CARole, CAHours)
VALUES (00001, 012345,'20-06-2021',Null,Null),
(00002,012345,'20-06-2021',Null,Null),
(00003,012345,'20-06-2021',Null,Null),
(00004,012345,'20-06-2021',Null,Null),
(00005,012345,'20-06-2021',Null,Null);

Commit;


/*Transaction3*/

Insert Into Customer (CustomerNo, CustomerName, CustomerPhone)
VALUES(98765432,'John Smith',59599234);

Insert Into Reservation (ReservationNo, RouteNo, CustomerNo, TADate, Fare, PatmentMethod, CCNumber, CCExpiry)
VALUES(74629203, 'FBN001', 98765432, '20/06/2021', 400, 'cash', 1234567891019762, '31/07/2021');

Commit;


/*Transaction4*/
Insert Into Flight (RouteNo, TADate, SerialNo, ActualTD, ActualTA)
Values ('FBN001','20/06/2021','FH-FBT',1105,1555);

Commit;


/*Transaction5*/
Insert Into Maintenance (MaintenanceNo, MDate, Mdescription, SerialNo, EmployeeNo)
Values (12345678910, '21/06/2021', Null, 'FH-FBT',00007);

Insert Into Employee (EmployeeNo, EmpName, EmpPhone, JobTitle)
Values (00007, 'urence Schreiner', 71727374, 'Maintenance Supervisor');

Commit;

