CREATE TABLE IF NOT EXISTS ordertable (
  orderNo      VARCHAR(100) PRIMARY KEY NOT NULL,
  customer     VARCHAR(10)         NOT NULL,
  date         DATE,
  countOfCloth DOUBLE(5, 1),
  weight       VARCHAR(10),
  uncompleted  DOUBLE(5, 1),
  remarkOfType VARCHAR(100)
)
  CHARSET = utf8;

drop table if EXISTS tasktable;
CREATE TABLE `tasktable` (
             `taskNo` varchar(20) NOT NULL,
             `orderNo` varchar(100) NOT NULL,
             `workblankNo` varchar(10) DEFAULT NULL,
             `dateOfProduce` date DEFAULT NULL,
             `colorName` varchar(10) DEFAULT NULL,
             `colorNo` varchar(10) DEFAULT NULL,
             `deadLine` varchar(20) DEFAULT NULL,
             `type` varchar(10) DEFAULT NULL,
             `weightPerCloth` varchar(10) DEFAULT NULL,
             `mouse` varchar(10) DEFAULT NULL,
             `countOfClothOfTask` varchar(10) DEFAULT NULL,
             `weightOfTask` varchar(10) DEFAULT NULL,
             `weightPerDoor` varchar(10) DEFAULT NULL,
             `dyeType` varchar(10) DEFAULT NULL,
             `lightSource` varchar(10) DEFAULT NULL,
             `LightFace` varchar(10) DEFAULT NULL,
             `PH` double(2,1) DEFAULT NULL,
             `deoil` varchar(10) DEFAULT NULL,
             `fixation` varchar(10) DEFAULT NULL,
             `polish` varchar(10) DEFAULT NULL,
             `aberration` varchar(10) DEFAULT NULL,
             `detection` varchar(10) DEFAULT NULL,
             `fastness` varchar(10) DEFAULT NULL,
             `application` varchar(10) DEFAULT NULL,
             `slice` varchar(10) DEFAULT NULL,
             `function` varchar(10) DEFAULT NULL,
             `remark` varchar(1000) DEFAULT NULL,
             `process` varchar(50) DEFAULT NULL,
             `curState` varchar(10) DEFAULT '未工作',
             `nextState` varchar(10) DEFAULT NULL,
             PRIMARY KEY (`taskNo`)
           ) ENGINE=InnoDB DEFAULT CHARSET=utf8


use erp;
DROP table if EXISTS userinfo;

CREATE TABLE userinfo (
  user_id BIGINT(32)  NOT NULL AUTO_INCREMENT ,
  user_phoneNo  VARCHAR(11) NOT NULL,
  user_name     VARCHAR(9)  NOT NULL,
  user_password VARCHAR(10) NOT NULL,
  PRIMARY KEY (user_id)
)ENGINE=InnoDB AUTO_INCREMENT=9 DEFAULT CHARSET=utf8;

use erp;
DROP table if EXISTS producerinfo;
CREATE TABLE producerinfo (
  id BIGINT(32)  NOT NULL AUTO_INCREMENT ,
  phoneNo  VARCHAR(11) NOT NULL,
  name     VARCHAR(9)  NOT NULL,
  password VARCHAR(10) NOT NULL,
  PRIMARY KEY (id)
)ENGINE=InnoDB AUTO_INCREMENT=9 DEFAULT CHARSET=utf8;
