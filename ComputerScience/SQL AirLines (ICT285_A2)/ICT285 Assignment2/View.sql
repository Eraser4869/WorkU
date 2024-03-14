Drop Table Flight;
Drop Table Route;
Drop Table Reservation;
Drop Table Customer;
Drop Table Airplane;
Drop Table maintenance;
Drop Table Employee;
Drop Table CrewAssignment;

CREATE VIEW ViewA AS
SELECT * FROM Reservation 
WHERE (SELECT  CustomerName FROM Customer WHERE CustomerName='John Smith');

Grant Select on ViewA To MarkerTL;
Grant Update on ViewA To MarkerTL;
Grant Delete on ViewA To MarkerTL;



CREATE VIEW ViewB AS
(SELECT SeatCapacity FROM Airplane Full OUTER JOIN Flight
WHERE RouteNo ='FBN001' AND TADate='20-06-2021');

Grant Select on ViewB To MarkerTL;
Grant Update on ViewB To MarkerTL;
Grant Delete on ViewB To MarkerTL;



CREATE VIEW ViewC AS
SELECT CAHours FROM CrewAssignment
WHERE (SELECT TADate FROM Flight WHERE TADate='20-06-2021');

Grant Select on ViewC To MarkerTL;
Grant Update on ViewC To MarkerTL;
Grant Delete on ViewC To MarkerTL;



CREATE VIEW ViewD AS
SELECT CAHours FROM CrewAssignment
WHERE JOBROLE = 'Pilot' AND RouteNo = 'FBN001';

Grant Select on ViewD To MarkerTL;
Grant Update on ViewD To MarkerTL;
Grant Delete on ViewD To MarkerTL;



CREATE VIEW ViewE AS
SELECT MDate, Mdescription, NextScheduledMaintenance FROM Maintenance FULL OUTER JOIN Airplane
WHERE(SELECT EmpName, EmpPhone FROM Employee WHERE JobTitle='Maintenance Supervisor' AND SerialNo='FH-FBT');

Grant Select on ViewE To MarkerTL;
Grant Update on ViewE To MarkerTL;
Grant Delete on ViewE To MarkerTL;
