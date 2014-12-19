create table UM_USERS (
    ID int not null AUTO_INCREMENT,
    USERNAME varchar(100) not null,
    PASSWORD varchar(100) not null,
    EMAIL varchar(100) not null,

    PRIMARY KEY(ID)
) ENGINE=InnoDB DEFAULT CHARSET=UTF8  ;