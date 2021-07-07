create database INVENTORY_MANAGEMENT_SYS
create table LOGIN(
    "user" varchar(30) not null DEFAULT 'admin',
    pass varchar(30) not null DEFAULT 'admin12345'
)--select * from LOGIN
create table CUSTOMER(
    CustID int not null identity(1,1) primary key,
    CFName varchar(50) not null,
    CMName varchar(50),
    CLName varchar(50) not null,
    Address varchar(255) not null,
    ContactNo varchar(11) not null
)--select * from CUSTOMER
create table EMPLOYEE(
    EmpID int not null identity(1,1) primary key,
    EmpFName varchar(50) not null,
    EmpMName varchar(50),
    EmpLName varchar(50) not null,
    EmpBDate date not null,
    EmpAge varchar(3) not null,
    EmpSex varchar(1) not null 
        check(EmpSex = 'M'or EmpSex = 'F'),
    EmpContactNo varchar(11) not null,
    EmpAddress varchar(255) not null,
    RatePHour float not null,
)--select * from EMPLOYEE
create table SUPPLIER(
    SupName varchar(100) not null primary key,
    SupContactNo varchar(11) not null,
    SupAddress varchar(255) not null
)--select * from SUPPLIER
create table ITEM(
    ItmName varchar(125) not null primary key,
    ItmCategory varchar(125) not null,
    ItmDescription varchar(255) not null,
    ItmSRP float not null,
    ItmUnitPrice float not null,
    ItmSupplier varchar(100) not null
        foreign key references SUPPLIER(SupName)
)--select * from ITEM
create table INVENTORY(
    InvID int not null identity(1,1) primary key,
    InvItemName varchar(125) not null
        foreign key references ITEM(ItmName),
    InvQuantity int not null
        check(InvQuantity > 0),
    InvCondition varchar(255) not null
)--select * from INVENTORY
create table INVOICE(
    InvcID int not null identity(1,1) primary key,
    CustomerID int not null 
    foreign key references CUSTOMER(CustID),
    EmployeeID int not null 
    foreign key references EMPLOYEE(EmpID),
    InvcTotal float not null,
    InvcOrderDate varchar(100) not null default
        datename(month,getdate())+'-'+
        datename(day,getdate())+'-'+
        datename(year,getdate()),
    InvcPaymentOption varchar(50) not null
)--select * from INVOICE
create table "ORDER"(
    OrdID int not null
        foreign key references INVOICE(InvcID),
    CustID int not null 
        foreign key references CUSTOMER(CustID),
    ItmName varchar(125) not null 
        foreign key references ITEM(ItmName),
    OrdQuantity int not null,
    OrdPrice float not null,
    OrdSubtotal float not null
)--select * from "ORDER"
SELECT
  *
FROM
  INVENTORY_MANAGEMENT_SYS.INFORMATION_SCHEMA.TABLES;
GO
select * from employee
