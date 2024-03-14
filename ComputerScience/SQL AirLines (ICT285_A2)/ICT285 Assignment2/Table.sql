
Create Table Flight 
(
    RouteNo Varchar(6) Not null,
    TADate Date Not null,
    SerialNo Varchar(6) Not null,
    ActualTD Number(4),
    ActualTA Number(4),
    
    Constraint FlightPK primary key (RouteNo, TADate),
    Constraint FlightFK foreign key (RouteNo) References Route(RouteNo),
    Constraint FlightFK foreign key (SerialNo) References Airplane(SerialNo)
);

Grant Select on Flight To MarkerTL;
Grant Update on Flight To MarkerTL;
Grant Delete on Flight To MarkerTL;


Create Table Route
(
    RouteNo Varchar(6) Not null,
    Origin Varchar(50) Not null,
    Destination Varchar(50) Not Null,
    EstimatedTimeDeparture Number(4) Not Null,
    EstimatedTimeArrival Number(4) Not Null,
    
    Constraint RoutePK primary key (RouteNo)
);

Grant Select on Route To MarkerTL;
Grant Update on Route To MarkerTL;
Grant Delete on Route To MarkerTL;


Create Table Reservation
(
    ReservationNo Number(8) Not null,
    RouteNo Varchar(6) Not Null,
    CustomerNo Number(8) Not Null,
    TADate Date Not null,
    Fare Number(30) Not null,
    PaymentMethod Varchar(10) Not null,
    CCNumber Number(6) Not null,
    CCExpiry Date Not null,
    
    Constraint ReservationPK primary key (ReservationNo),
    Constraint ReservationFK foreign key (RouteNo) References Route(RouteNo),
    Constraint ReservationFK foreign key (CustomerNo) References Customer(CustomerNo),
    Constraint ReservationFK foreign key (TADate) References Flight(TADate),
    Constraint FareCheck Check (Fare>=0),
    Constraint PayOption Check (PayOption In ('cash','card','paypal','etc'))
);

Grant Select on Reservation To MarkerTL;
Grant Update on Reservation To MarkerTL;
Grant Delete on Reservation To MarkerTL;


Create Table Customer
(
    CustomerNo Number(8) Not null,
    CustomerName Varchar(50) Not null,
    CustomerPhone Number(8) Not null,
    
    Constraint CustomerPK primary key (CustomerNo)
);

Grant Select on Customer To MarkerTL;
Grant Update on Customer To MarkerTL;
Grant Delete on Customer To MarkerTL;


Create Table Airplane
(
    SerialNo Varchar(6) Not null,
    SeatCapacity Number(3) Not null,
    PlaneModel Varchar(20) Not null,
    NextScheduledMaintenance Date,
    
    Constraint AirplanPK primary key (SerialNo)
);

Grant Select on Airplane To MarkerTL;
Grant Update on Airplane To MarkerTL;
Grant Delete on Airplane To MarkerTL;



Create Table Maintenance
(
    MaintenanceNo Number(10) Not Null,
    MDate Date Not Null,
    MDescription Varchar(50),
    SerialNo Varchar(6) Not null,
    EmployeeNo Number(5) Not null,

    Constraint MaintenancePK primary key (MaintenanceNo),
    Constraint MAintenanceFK foreign key (SerialNo) References Airplane(SerialNo),
    Constraint MAintenanceFK foreign key (EmployeeNo) References Employee(EmployeeNo)
);

Grant Select on Maintenance To MarkerTL;
Grant Update on Maintenance To MarkerTL;
Grant Delete on Maintenance To MarkerTL;



Create Table Employee
(
    EmployeeNo Number(5) Not null,
    EmpName Varchar(50) Not null,
    EmpPhone Number(8) Not null,
    JobTitle Varchar(25) Not null,
    
    Constraint EmployeePK primary key (EmployeeNo)
);

Grant Select on Employee To MarkerTL;
Grant Update on Employee To MarkerTL;
Grant Delete on Employee To MarkerTL;


Create Table CrewAssignment
(
    EmployeeNo Number(5) Not null,
    RouteNo Varchar(6) Not null,
    TADate Number(8) Not null,
    CARole Varchar(50),
    CAHours Number(2),
    
    Constraint CrewAssignmentPK primary key (EmployeeNo, RouteNo, TADate),
    Constraint CrewAssignmentFK foreign key (EmployeeNo) References Employee(EmployeeNo),
    Constraint CrewAssignmentFK foreign key (RouteNo) References Route(RouteNo),
    Constraint CrewAssignmentFK foreign key (TADate) References Flight(TADate)
);
 
Grant Select on CrewAssignment To MarkerTL;
Grant Update on CrewAssignment To MarkerTL;
Grant Delete on CrewAssignment To MarkerTL;