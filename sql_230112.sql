--���̺� ���� ���� �Ʒ��� ����.���� ���̺� �������� �ݿ�.


-- ����1
SELECT * FROM TB_POINT;

-- 2
SELECT CUSTOMER_CD,POINT_MEMO, POINT FROM TB_POINT;

--3
SELECT CUSTOMER_CD ���ڵ�,POINT_MEMO ����Ʈ����, POINT ����Ʈ FROM TB_POINT;

--4 
SELECT * FROM TB_CUSTOMER;
SELECT CUSTOMER_CD, CUSTOMER_NM, EMAIL, TOTAL_POINT FROM TB_CUSTOMER WHERE TOTAL_POINT<10000;

--5 
SELECT CUSTOMER_CD,SEQ_NO, POINT FROM TB_POINT WHERE CUSTOMER_CD=2017053 AND SEQ_NO=2;

--6
SELECT * FROM TB_GRADE;
SELECT * FROM TB_GRADE WHERE CLASS_CD='A' OR CLASS_CD='B' OR KOR>=80 AND ENG>=80 AND MAT>=80;

--7
SELECT * FROM TB_POINT WHERE CUSTOMER_CD<'2019%' AND POINT BETWEEN 10000 AND 50000;

--8
SELECT * FROM TB_CUSTOMER WHERE BIRTH_DAY LIKE '198%' AND MW_FLG='M' AND TOTAL_POINT>20000;

--9
SELECT CUSTOMER_CD, CUSTOMER_NM, MW_FLG, BIRTH_DAY, TOTAL_POINT FROM TB_CUSTOMER 
    WHERE MW_FLG='M' AND BIRTH_DAY LIKE '____05__%' OR BIRTH_DAY LIKE '____06__' OR BIRTH_DAY LIKE '____07__';
    
--10
SELECT CUSTOMER_CD, CUSTOMER_NM, MW_FLG, BIRTH_DAY, TOTAL_POINT FROM TB_CUSTOMER 
    WHERE BIRTH_DAY LIKE '_____4__';
    
--11
SELECT * FROM TB_ITEM_INFO WHERE ITEM_CD='S01' OR ITEM_CD='S04' OR ITEM_CD='S06' OR ITEM_CD='S04' OR ITEM_CD='S10';

--12 
SELECT * FROM TB_POINT WHERE CUSTOMER_CD='2017042' OR CUSTOMER_CD='2018087' OR CUSTOMER_CD='2019095' AND POINT_MEMO = '%����%';

--13
SELECT * FROM TB_POINT WHERE REG_DTTM LIKE '2019%' AND POINT_MEMO LIKE '%����%' ORDER BY POINT DESC;

--14
SELECT * FROM TB_GRADE WHERE CLASS_CD='B' ORDER BY TOT DESC;

--15
SELECT * FROM TB_SALES;
SELECT SALES_DT, PRODUCT_NM, SUM(SALES_COUNT) ���Ǹż� FROM TB_SALES GROUP BY SALES_DT, PRODUCT_NM 
    HAVING SALES_DT='20190802' OR SALES_DT='20190803' ORDER BY SALES_DT, PRODUCT_NM;
    
--16
SELECT PRODUCT_NM FROM TB_SALES GROUP BY SALES_DT, PRODUCT_NM HAVING SALES_DT BETWEEN 20190801 AND 20190802 ORDER BY PRODUCT_NM;
 
--17
SELECT C.CUSTOMER_CD, C.CUSTOMER_NM, C.MW_FLG, P.SEQ_NO, P.POINT_MEMO, P.POINT 
    FROM TB_CUSTOMER C, TB_POINT P WHERE C.CUSTOMER_CD=2019069;
    
--18
SELECT CUSTOMER_CD, CUSTOMER_NM, TOTAL_POINT, CASE WHEN TOTAL_POINT BETWEEN 1000 AND 20000 THEN '�ǹ�' 
                                                    WHEN TOTAL_POINT BETWEEN 20000 AND 50000 THEN '���' 
                                                    WHEN TOTAL_POINT>49999 THEN 'VIP'
                                                    else '�Ϲ�' end ����� from TB_CUSTOMER;
                                                    
--19
SELECT ROWNUM, CLASS_CD, STUDENT_NO, STUDENT_NM,KOR, ENG, MAT, TOT, AVG FROM TB_GRADE WHERE CLASS_CD='A' OR CLASS_CD='C';

--20

SELECT * FROM TB_CUSTOMER WHERE (CUSTOMER_CD LIKE '2019%' OR CUSTOMER_CD LIKE '2018%') AND 
    (BIRTH_DAY LIKE '20%' OR BIRTH_DAY LIKE '199%') AND PHONE_NUMBER IS NOT NULL;
    
--21


--22
SELECT C.CUSTOMER_CD, C.CUSTOMER_NM, C.MW_FLG, C.BIRTH_DAY, C.PHONE_NUMBER,C.EMAIL, C.TOTAL_POINT, C.REG_DTTM
    FROM TB_POINT P, TB_CUSTOMER C 
    WHERE  P.POINT_MEMO LIKE '�̺�Ʈ%' AND P.CUSTOMER_CD=C.CUSTOMER_CD;
    
--23
SELECT ROW_NUMBER() OVER (ORDER BY TOT DESC) ���, CLASS_CD, STUDENT_NO, STUDENT_NM,KOR, ENG, MAT, TOT, AVG FROM TB_GRADE 
    WHERE CLASS_CD='A' OR CLASS_CD='C';
    
    
    
    
----------------------------------------------------------------------------------------------------
-- ���� ���̺� ����
----------------------------------------------------------------------------------------------------

--------------------------------------------------
-- �� ���̺�
--------------------------------------------------

CREATE TABLE TB_CUSTOMER
(
  CUSTOMER_CD      CHAR(7 BYTE)                 NOT NULL,   -- ���ڵ�
  CUSTOMER_NM      VARCHAR2(10 BYTE)            NOT NULL,   -- ����
  MW_FLG           CHAR(1 BYTE)                 NOT NULL,   -- ��������
  BIRTH_DAY        CHAR(8 BYTE)                 NOT NULL,   -- ����
  PHONE_NUMBER     VARCHAR2(16 BYTE),                       -- ��ȭ��ȣ
  EMAIL            VARCHAR2(30 BYTE),                       -- EMAIL
  TOTAL_POINT      NUMBER(10),                              -- ��������Ʈ
  REG_DTTM         CHAR(14 BYTE)                            -- �����
);
CREATE UNIQUE INDEX PK_TB_CUSTOMER ON TB_CUSTOMER (CUSTOMER_CD);
ALTER TABLE TB_CUSTOMER ADD (CONSTRAINT PK_TB_CUSTOMER PRIMARY KEY (CUSTOMER_CD));

--------------------------------------------------
-- �߰� �� ���̺�
--------------------------------------------------

CREATE TABLE TB_ADD_CUSTOMER
(
  CUSTOMER_CD      CHAR(7 BYTE)                 NOT NULL,   -- ���ڵ�
  CUSTOMER_NM      VARCHAR2(10 BYTE)            NOT NULL,   -- ����
  MW_FLG           CHAR(1 BYTE)                 NOT NULL,   -- ��������
  BIRTH_DAY        CHAR(8 BYTE)                 NOT NULL,   -- ����
  PHONE_NUMBER     VARCHAR2(16 BYTE)                        -- ��ȭ��ȣ
);
CREATE UNIQUE INDEX PK_TB_ADD_CUSTOMER ON TB_ADD_CUSTOMER (CUSTOMER_CD);
ALTER TABLE TB_ADD_CUSTOMER ADD (CONSTRAINT PK_TB_ADD_CUSTOMER PRIMARY KEY (CUSTOMER_CD));

--------------------------------------------------
-- ����Ʈ ���̺�
--------------------------------------------------

CREATE TABLE TB_POINT
(
  CUSTOMER_CD      CHAR(7 BYTE)                 NOT NULL,   -- ���ڵ�
  SEQ_NO           NUMBER(10)                   NOT NULL,   -- �Ϸù�ȣ
  POINT_MEMO       VARCHAR2(50),                            -- ����Ʈ ����
  POINT            NUMBER(10),                              -- ����Ʈ
  REG_DTTM         CHAR(14 BYTE)                            -- �����
);
CREATE UNIQUE INDEX PK_TB_POINT ON TB_POINT (CUSTOMER_CD, SEQ_NO);
ALTER TABLE TB_POINT ADD (CONSTRAINT PK_TB_POINT PRIMARY KEY (CUSTOMER_CD, SEQ_NO));

--------------------------------------------------
-- 2017�� ����Ʈ ���̺�
--------------------------------------------------

CREATE TABLE TB_POINT_2017
(
  CUSTOMER_CD      CHAR(7 BYTE)                 NOT NULL,   -- ���ڵ�
  SEQ_NO           NUMBER(10)                   NOT NULL,   -- �Ϸù�ȣ
  POINT_MEMO       VARCHAR2(50),                            -- ����Ʈ ����
  POINT            NUMBER(10),                              -- ����Ʈ
  REG_DTTM         CHAR(14 BYTE)                            -- �����
);
CREATE UNIQUE INDEX PK_TB_POINT_2017 ON TB_POINT_2017 (CUSTOMER_CD, SEQ_NO);
ALTER TABLE TB_POINT_2017 ADD (CONSTRAINT PK_TB_POINT_2017 PRIMARY KEY (CUSTOMER_CD, SEQ_NO));

--------------------------------------------------
-- 2018�� ����Ʈ ���̺�
--------------------------------------------------

CREATE TABLE TB_POINT_2018
(
  CUSTOMER_CD      CHAR(7 BYTE)                 NOT NULL,   -- ���ڵ�
  SEQ_NO           NUMBER(10)                   NOT NULL,   -- �Ϸù�ȣ
  POINT_MEMO       VARCHAR2(50),                            -- ����Ʈ ����
  POINT            NUMBER(10),                              -- ����Ʈ
  REG_DTTM         CHAR(14 BYTE)                            -- �����
);
CREATE UNIQUE INDEX PK_TB_POINT_2018 ON TB_POINT_2018 (CUSTOMER_CD, SEQ_NO);
ALTER TABLE TB_POINT_2018 ADD (CONSTRAINT PK_TB_POINT_2018 PRIMARY KEY (CUSTOMER_CD, SEQ_NO));

--------------------------------------------------
-- 2019�� ����Ʈ ���̺�
--------------------------------------------------

CREATE TABLE TB_POINT_2019
(
  CUSTOMER_CD      CHAR(7 BYTE)                 NOT NULL,   -- ���ڵ�
  SEQ_NO           NUMBER(10)                   NOT NULL,   -- �Ϸù�ȣ
  POINT_MEMO       VARCHAR2(50),                            -- ����Ʈ ����
  POINT            NUMBER(10),                              -- ����Ʈ
  REG_DTTM         CHAR(14 BYTE)                            -- �����
);
CREATE UNIQUE INDEX PK_TB_POINT_2019 ON TB_POINT_2019 (CUSTOMER_CD, SEQ_NO);
ALTER TABLE TB_POINT_2019 ADD (CONSTRAINT PK_TB_POINT_2019 PRIMARY KEY (CUSTOMER_CD, SEQ_NO));

--------------------------------------------------
-- ��Ÿ���� ���̺�
--------------------------------------------------

CREATE TABLE TB_ETC_INFO
(
  CUSTOMER_CD        CHAR(7 BYTE)                 NOT NULL,   -- ���ڵ�
  CUSTOMER_ENG_NM    VARCHAR2(20 BYTE),                       -- ���� ����
  ITEM_LIST          VARCHAR2(40 BYTE)                        -- ���� ǰ��
);
CREATE UNIQUE INDEX PK_TB_ETC_INFO ON TB_ETC_INFO (CUSTOMER_CD);
ALTER TABLE TB_ETC_INFO ADD (CONSTRAINT PK_TB_ETC_INFO PRIMARY KEY (CUSTOMER_CD));

--------------------------------------------------
-- ǰ������ ���̺�
--------------------------------------------------

CREATE TABLE TB_ITEM_INFO
(
  ITEM_CD          CHAR(7 BYTE)                 NOT NULL,   -- ���� ǰ�� �ڵ�
  ITEM_NM          VARCHAR2(20 BYTE)                        -- ���� ǰ���

);
CREATE UNIQUE INDEX PK_TB_ITEM_INFO ON TB_ITEM_INFO (ITEM_CD);
ALTER TABLE TB_ITEM_INFO ADD (CONSTRAINT PK_TB_ITEM_INFO PRIMARY KEY (ITEM_CD));

--------------------------------------------------
-- ���� ���̺�
--------------------------------------------------

CREATE TABLE TB_GRADE
(
  CLASS_CD         CHAR(1 BYTE)                 NOT NULL,   -- ���ڵ�
  STUDENT_NO       NUMBER(2)                    NOT NULL,   -- �л���ȣ
  STUDENT_NM       VARCHAR2(10 BYTE)            NOT NULL,   -- �л���
  KOR              NUMBER(3),                               -- ����
  ENG              NUMBER(3),                               -- ����
  MAT              NUMBER(3),                               -- ����
  TOT              NUMBER(3),                               -- �հ�
  AVG              NUMBER(5,1)                              -- ���
);
CREATE UNIQUE INDEX PK_TB_GRADE ON TB_GRADE (CLASS_CD, STUDENT_NO);
ALTER TABLE TB_GRADE ADD (CONSTRAINT PK_TB_GRADE PRIMARY KEY (CLASS_CD, STUDENT_NO));

--------------------------------------------------
-- 7�� ���� ���̺�
--------------------------------------------------

CREATE TABLE TB_GRADE_07
(
  TEST_CD          CHAR(3 BYTE)                 NOT NULL,   -- �����ڵ�
  KOR              NUMBER(3),                               -- ����
  ENG              NUMBER(3),                               -- ����
  MAT              NUMBER(3)                                -- ����
);
CREATE UNIQUE INDEX PK_TB_GRADE_07 ON TB_GRADE_07 (TEST_CD);
ALTER TABLE TB_GRADE_07 ADD (CONSTRAINT PK_TB_GRADE_07 PRIMARY KEY (TEST_CD));

--------------------------------------------------
-- 8�� ���� ���̺�
--------------------------------------------------

CREATE TABLE TB_GRADE_08
(
  TEST_CD          CHAR(3 BYTE)                 NOT NULL,   -- �����ڵ�
  KOR              NUMBER(3),                               -- ����
  ENG              NUMBER(3),                               -- ����
  MAT              NUMBER(3)                                -- ����
);
CREATE UNIQUE INDEX PK_TB_GRADE_08 ON TB_GRADE_08 (TEST_CD);
ALTER TABLE TB_GRADE_08 ADD (CONSTRAINT PK_TB_GRADE_08 PRIMARY KEY (TEST_CD));

--------------------------------------------------
-- 9�� ���� ���̺�
--------------------------------------------------

CREATE TABLE TB_GRADE_09
(
  TEST_CD          CHAR(3 BYTE)                 NOT NULL,   -- �����ڵ�
  KOR              NUMBER(3),                               -- ����
  ENG              NUMBER(3),                               -- ����
  MAT              NUMBER(3)                                -- ����
);
CREATE UNIQUE INDEX PK_TB_GRADE_09 ON TB_GRADE_09 (TEST_CD);
ALTER TABLE TB_GRADE_09 ADD (CONSTRAINT PK_TB_GRADE_09 PRIMARY KEY (TEST_CD));

--------------------------------------------------
-- 2020�� ���� ���̺�
--------------------------------------------------

CREATE TABLE TB_GRADE_2020
(
  TEST_MONTH       CHAR(2 BYTE)                 NOT NULL,   -- ��
  TEST_CD          CHAR(3 BYTE)                 NOT NULL,   -- �����ڵ�
  KOR              NUMBER(3),                               -- ����
  ENG              NUMBER(3),                               -- ����
  MAT              NUMBER(3)                                -- ����
);

CREATE UNIQUE INDEX PK_TB_GRADE_2020 ON TB_GRADE_2020 (TEST_MONTH);
ALTER TABLE TB_GRADE_2020 ADD (CONSTRAINT PK_TB_GRADE_2020 PRIMARY KEY (TEST_MONTH));

--------------------------------------------------
-- �� ���� ���̺�
--------------------------------------------------

CREATE TABLE TB_CLASS_INFO
(
  CLASS_CD         CHAR(1 BYTE)                 NOT NULL,   -- ���ڵ�
  CLASS_NM         VARCHAR2(20 BYTE)            NOT NULL    -- �ݸ�
);
CREATE UNIQUE INDEX PK_TB_CLASS_INFO ON TB_CLASS_INFO (CLASS_CD, CLASS_NM);
ALTER TABLE TB_CLASS_INFO ADD (CONSTRAINT PK_TB_CLASS_INFO PRIMARY KEY (CLASS_CD, CLASS_NM));

--------------------------------------------------
-- �Ǹ� ���̺�
--------------------------------------------------

CREATE TABLE TB_SALES
(
  SALES_DT         CHAR(8 BYTE)                 NOT NULL,   -- �����
  SEQ_NO           NUMBER(5)                    NOT NULL,   -- �Ϸù�ȣ
  PRODUCT_NM       VARCHAR2(20 BYTE),                       -- ��ǰ��
  PRICE            NUMBER(10),                              -- �ܰ�(��)
  SALES_COUNT      NUMBER(3)                                -- �ǸŰ���
);
CREATE UNIQUE INDEX PK_TB_SALES ON TB_SALES (SALES_DT, SEQ_NO);
ALTER TABLE TB_SALES ADD (CONSTRAINT PK_TB_SALES PRIMARY KEY (SALES_DT, SEQ_NO));

--------------------------------------------------
-- 9�� �Ǹ� ���̺�
--------------------------------------------------

CREATE TABLE TB_SALES_09
(
  SEQ_NO           NUMBER(10)                   NOT NULL,   -- �Ϸù�ȣ
  PRODUCT_NM       VARCHAR2(20 BYTE),                       -- ��ǰ��
  CUSTOMER_CD      CHAR(7 BYTE),                            -- ���ڵ�
  SALES_COUNT      NUMBER(3)                                -- �ǸŰ���
);
CREATE UNIQUE INDEX PK_TB_SALES_09 ON TB_SALES_09 (SEQ_NO);
ALTER TABLE TB_SALES_09 ADD (CONSTRAINT PK_TB_SALES_09 PRIMARY KEY (SEQ_NO));

--------------------------------------------------
-- �����ð�ǥ ���̺�
--------------------------------------------------

CREATE TABLE TB_TRAIN_TM
(
  TRAIN_NO         CHAR(5 BYTE)                 NOT NULL,   -- ������ȣ
  RUN_ORDR         NUMBER(5)                    NOT NULL,   -- �������
  STATION_NM       VARCHAR2(20 BYTE),                       -- ����
  ARV_TM           CHAR(6 BYTE),                            -- �����ð�
  DPT_TM           CHAR(6 BYTE)                             -- ��߽ð�
);
CREATE UNIQUE INDEX PK_TB_TRAIN_TM ON TB_TRAIN_TM (TRAIN_NO, RUN_ORDR);
ALTER TABLE TB_TRAIN_TM ADD (CONSTRAINT PK_TB_TRAIN_TM PRIMARY KEY (TRAIN_NO, RUN_ORDR));


--------------------------------------------------
-- ����Ʈ ���� ���̺� (��������, ���ν����� ���/����)
--------------------------------------------------

CREATE TABLE TB_POINT_INFO
(
  YEAR             CHAR(4 BYTE)                 NOT NULL,   -- ����
  RANK             NUMBER(10)                   NOT NULL,   -- ����
  CUSTOMER_CD      CHAR(7 BYTE)                 NOT NULL,   -- ���ڵ�
  POINT            NUMBER(10),                              -- ����Ʈ
  LAST_POINT_DT    CHAR(8 BYTE)                             -- ���� ����Ʈ ������
);
CREATE UNIQUE INDEX PK_TB_POINT_INFO ON TB_POINT_INFO (YEAR, RANK);
ALTER TABLE TB_POINT_INFO ADD (CONSTRAINT PK_TB_POINT_INFO PRIMARY KEY (YEAR, RANK));

----------------------------------------------------------------------------------------------------
-- ���� ���̺� ���� �Է�
----------------------------------------------------------------------------------------------------

--------------------------------------------------
-- �� ���̺�
--------------------------------------------------

DELETE FROM TB_CUSTOMER;
INSERT INTO TB_CUSTOMER VALUES ('2017042','������','M','19810603','002-8202-8790','wjgang@navi.com',280300, '20170123132432');
INSERT INTO TB_CUSTOMER VALUES ('2017053','�����','W','19891225','002-4509-0043','ksna#boram.co.kr',4500,  '20170210180930');
INSERT INTO TB_CUSTOMER VALUES ('2017108','�ڽ´�','M','19711430','','sdpark@haso.com',23450,  '20170508203450');
INSERT INTO TB_CUSTOMER VALUES ('2018087','������','W','19810925','003-1265-8372','urseo@epnt.co.kr',18700, '20180204160903');
INSERT INTO TB_CUSTOMER VALUES ('2018254','������','W','19839012','003_1287_9734','hylee@hansoft.com',570,  '20180619230805');
INSERT INTO TB_CUSTOMER VALUES ('2019001','������','W','20010426','002-9842-0074','jskim$dreami,org',12820, '20190101080518');
INSERT INTO TB_CUSTOMER VALUES ('2019069','���ѱ�','M','1992 315','','hkkim@ssoya.com',15320,  '20190217110704');
INSERT INTO TB_CUSTOMER VALUES ('2019095','���üҸ�','M','19620728','003-6273-8539','',890,'20190312124558');
INSERT INTO TB_CUSTOMER VALUES ('2019167','������','M','19711106','002=1202=5563','chhan@ecom.co.kr',6800,  '20190508155600');
INSERT INTO TB_CUSTOMER VALUES ('2019281','�̾Ƹ�','W','19940513','003-2620-0723','aulee@hoki.com',35600,   '20190709201308');

--------------------------------------------------
-- �߰� �� ���̺�
--------------------------------------------------

DELETE FROM TB_ADD_CUSTOMER;
INSERT INTO TB_ADD_CUSTOMER VALUES ('2017108','�ڽ´�','M','19711430','002-2580-9919');
INSERT INTO TB_ADD_CUSTOMER VALUES ('2019302','���̷�','W','19740812','002-8864-0232');

--------------------------------------------------
-- ����Ʈ ���̺�
--------------------------------------------------

DELETE FROM TB_POINT;
INSERT INTO TB_POINT VALUES ('2017042',1,'û�ұ� ���� ����Ʈ ����',120700,'20181221160803');
INSERT INTO TB_POINT VALUES ('2017042',2,'�̺�Ʈ ����Ʈ ����',9500, '20190405121520');
INSERT INTO TB_POINT VALUES ('2017042',3,'����� ���� ����Ʈ ����',78560,'20190612220810');
INSERT INTO TB_POINT VALUES ('2017042',4,'������ ���� ����Ʈ ����',71540,'20190703140913');
INSERT INTO TB_POINT VALUES ('2017053',1,'��Ź�� ���� ����Ʈ ����',3500,'20170410201432');
INSERT INTO TB_POINT VALUES ('2017053',2,'����̱� ���� ����Ʈ ����',2000,'20181216171040');
INSERT INTO TB_POINT VALUES ('2017108',1,'û�ұ� ���� ����Ʈ ����',14065,'20180412205434');
INSERT INTO TB_POINT VALUES ('2017108',2,'�̺�Ʈ ����Ʈ ����',9385,'20180702232143');
INSERT INTO TB_POINT VALUES ('2018087',1,'�̺�Ʈ ����Ʈ ����',7800,'20180421161903');
INSERT INTO TB_POINT VALUES ('2018087',2,'����� ���� ����Ʈ ����',10900, '20181112161956');
INSERT INTO TB_POINT VALUES ('2018254',1,'��� ����Ʈ ����',500,'20180619230805');
INSERT INTO TB_POINT VALUES ('2018254',2,'�̺�Ʈ ����Ʈ ����',70,'20180623170212');
INSERT INTO TB_POINT VALUES ('2019001',1,'��� ����Ʈ ����',500,'20190102120720');
INSERT INTO TB_POINT VALUES ('2019001',2,'�ͼ��� ���� ����Ʈ ����',4600,'20190405134554');
INSERT INTO TB_POINT VALUES ('2019001',3,'����̱� ���� ����Ʈ ����',7820,'20190829071234');
INSERT INTO TB_POINT VALUES ('2019069',1,'�̺�Ʈ ����Ʈ ����',8900,'20190219120712');
INSERT INTO TB_POINT VALUES ('2019069',2,'�鵵�� ���� ����Ʈ ����',3200,'20190420090820');
INSERT INTO TB_POINT VALUES ('2019069',3,'������ ���� ����Ʈ ����',3220,'20190620071230');
INSERT INTO TB_POINT VALUES ('2019095',1,'��� ����Ʈ ����',500,'2019031212456');
INSERT INTO TB_POINT VALUES ('2019095',2,'�̺�Ʈ ����Ʈ ����',390,'20190510072345');
INSERT INTO TB_POINT VALUES ('2019167',1,'����̱� ���� ����Ʈ ����',3200,'20190612042450');
INSERT INTO TB_POINT VALUES ('2019167',2,'������ ���� ����Ʈ ����',3600,'20190714133422');
INSERT INTO TB_POINT VALUES ('2019281',1,'��� ����Ʈ ����',500,'20190709201308');
INSERT INTO TB_POINT VALUES ('2019281',2,'û�ұ� ���� ����Ʈ ����',8950,'20190710200921');
INSERT INTO TB_POINT VALUES ('2019281',3,'����� ���� ����Ʈ ����',12200,'20190712082334');
INSERT INTO TB_POINT VALUES ('2019281',4,'����̱� ���� ����Ʈ ����',7600,'20190721134421');
INSERT INTO TB_POINT VALUES ('2019281',5,'�ͼ��� ���� ����Ʈ ����',6250,'20190724022430');

--------------------------------------------------
-- ��Ÿ���� ���̺�
--------------------------------------------------

DELETE FROM TB_ETC_INFO;
INSERT INTO TB_ETC_INFO VALUES ('2017042','Gang won jin','S01,S05,S06,S09');
INSERT INTO TB_ETC_INFO VALUES ('2017053','Na kyoung suk','S02,S03,S07');
INSERT INTO TB_ETC_INFO VALUES ('2017108','park seung dea','S05,S06,S08');
INSERT INTO TB_ETC_INFO VALUES ('2018087','seo you ri','S03,S06');
INSERT INTO TB_ETC_INFO VALUES ('2018254','lee hye ok','S08');
INSERT INTO TB_ETC_INFO VALUES ('2019001','kim jin suk','S01,S05,S07');
INSERT INTO TB_ETC_INFO VALUES ('2019069','KIM HAN KIL','S03,S06,S07');
INSERT INTO TB_ETC_INFO VALUES ('2019095','NAMKUNG SOMANG','S02,S07,S09');
INSERT INTO TB_ETC_INFO VALUES ('2019167','han chan hee','S01,S07');
INSERT INTO TB_ETC_INFO VALUES ('2019281','lee a rum','S06');


--------------------------------------------------
-- ��ǰ���� ���̺�
--------------------------------------------------

DELETE FROM TB_ITEM_INFO;
INSERT INTO TB_ITEM_INFO VALUES ('S01','�Ƿ�/��ȭ');
INSERT INTO TB_ITEM_INFO VALUES ('S02','��Ƽ');
INSERT INTO TB_ITEM_INFO VALUES ('S03','����/�ڵ���');
INSERT INTO TB_ITEM_INFO VALUES ('S04','��ǰ');
INSERT INTO TB_ITEM_INFO VALUES ('S05','��Ȱ/�ǰ�');
INSERT INTO TB_ITEM_INFO VALUES ('S06','����/���׸���');
INSERT INTO TB_ITEM_INFO VALUES ('S07','����');
INSERT INTO TB_ITEM_INFO VALUES ('S08','����/���');
INSERT INTO TB_ITEM_INFO VALUES ('S09','��ǻ��');
INSERT INTO TB_ITEM_INFO VALUES ('S10','�귣��');

--------------------------------------------------
-- ���� ���̺�
--------------------------------------------------

DELETE FROM TB_GRADE;
INSERT INTO TB_GRADE VALUES ('A',1,'������', 87, 94, 98, 0, 0);
INSERT INTO TB_GRADE VALUES ('A',2,'�����', 68, 86, 78, 0, 0);
INSERT INTO TB_GRADE VALUES ('B',1,'�ڽ´�', 90, 92, 86, 0, 0);
INSERT INTO TB_GRADE VALUES ('B',2,'������', 96, 100, 92, 0, 0);
INSERT INTO TB_GRADE VALUES ('B',3,'������', 98, 86, 78, 0, 0);
INSERT INTO TB_GRADE VALUES ('C',1,'������', 95, 77, 95, 0, 0);
INSERT INTO TB_GRADE VALUES ('C',2,'���ѱ�', 73, 84, 100, 0, 0);
INSERT INTO TB_GRADE VALUES ('D',1,'���üҸ�', 56, 68, 78, 0, 0);
INSERT INTO TB_GRADE VALUES ('D',2,'������', 94, 90, 68, 0, 0);
INSERT INTO TB_GRADE VALUES ('D',3,'�̾Ƹ�', 100, 87, 95, 0, 0);

--------------------------------------------------
-- 7�� ���� ���̺�
--------------------------------------------------

DELETE FROM TB_GRADE_07;
INSERT INTO TB_GRADE_07 VALUES ('T01', 87, 94, 98);
INSERT INTO TB_GRADE_07 VALUES ('T02', 68, 86, 78);
INSERT INTO TB_GRADE_07 VALUES ('T03', 86, 94, 92);
INSERT INTO TB_GRADE_07 VALUES ('T04', 96, 90, 86);
INSERT INTO TB_GRADE_07 VALUES ('T05', 92, 92, 96);
INSERT INTO TB_GRADE_07 VALUES ('T06', 86, 94, 86);
INSERT INTO TB_GRADE_07 VALUES ('T07', 96, 100, 92);
INSERT INTO TB_GRADE_07 VALUES ('T08', 92, 98, 86);
INSERT INTO TB_GRADE_07 VALUES ('T09', 98, 86, 78);
INSERT INTO TB_GRADE_07 VALUES ('T10', 94, 84, 86);

--------------------------------------------------
-- 8�� ���� ���̺�
--------------------------------------------------

DELETE FROM TB_GRADE_08;
INSERT INTO TB_GRADE_08 VALUES ('T01', 87, 94, 98);
INSERT INTO TB_GRADE_08 VALUES ('T02', 68, 86, 78);
INSERT INTO TB_GRADE_08 VALUES ('T04', 90, 92, 86);
INSERT INTO TB_GRADE_08 VALUES ('T07', 96, 100, 92);
INSERT INTO TB_GRADE_08 VALUES ('T09', 98, 86, 78);

--------------------------------------------------
-- 9�� ���� ���̺�
--------------------------------------------------

DELETE FROM TB_GRADE_09;
INSERT INTO TB_GRADE_09 VALUES ('T01', 95, 77, 95);
INSERT INTO TB_GRADE_09 VALUES ('T04', 73, 84, 100);
INSERT INTO TB_GRADE_09 VALUES ('T05', 56, 68, 78);
INSERT INTO TB_GRADE_09 VALUES ('T07', 94, 90, 68);
INSERT INTO TB_GRADE_09 VALUES ('T08', 100, 87, 95);

--------------------------------------------------
-- �� ���� ���̺�
--------------------------------------------------

DELETE FROM TB_CLASS_INFO;
INSERT INTO TB_CLASS_INFO VALUES ('A','�����Խù�');
INSERT INTO TB_CLASS_INFO VALUES ('B','�ܰ���');
INSERT INTO TB_CLASS_INFO VALUES ('C','�������Թ�');
INSERT INTO TB_CLASS_INFO VALUES ('D','�Ϲ��ι�');

--------------------------------------------------
-- �Ǹ� ���̺�
--------------------------------------------------

DELETE FROM TB_SALES;
INSERT INTO TB_SALES VALUES ('20190801',1,'��Ʈ��',1045000, 4);
INSERT INTO TB_SALES VALUES ('20190801',2,'û�ұ�',545000, 2);
INSERT INTO TB_SALES VALUES ('20190801',3,'��Ʈ��',1021000, 6);
INSERT INTO TB_SALES VALUES ('20190802',1,'��ǳ��',70000, 21);
INSERT INTO TB_SALES VALUES ('20190802',2,'�����',1870000, 7);
INSERT INTO TB_SALES VALUES ('20190803',1,'��ǳ��',92000, 32);
INSERT INTO TB_SALES VALUES ('20190803',2,'�����',2012000, 3);
INSERT INTO TB_SALES VALUES ('20190803',3,'��ǳ��',70000, 15);
INSERT INTO TB_SALES VALUES ('20190803',4,'��ǳ��',92000, 24);
INSERT INTO TB_SALES VALUES ('20190804',1,'û�ұ�',980000, 5);

--------------------------------------------------
-- �����ð�ǥ ���̺�
--------------------------------------------------

DELETE FROM TB_TRAIN_TM;
INSERT INTO TB_TRAIN_TM VALUES ('101',1,'����','092000', '092000');
INSERT INTO TB_TRAIN_TM VALUES ('101',2,'����','095400', '095600');
INSERT INTO TB_TRAIN_TM VALUES ('101',3,'����','103800', '104100');
INSERT INTO TB_TRAIN_TM VALUES ('101',4,'�뱸','112500', '112730');
INSERT INTO TB_TRAIN_TM VALUES ('101',5,'�λ�','130500', '130500');
INSERT INTO TB_TRAIN_TM VALUES ('103',1,'����','130800', '130800');
INSERT INTO TB_TRAIN_TM VALUES ('103',2,'����','142100', '142300');
INSERT INTO TB_TRAIN_TM VALUES ('103',3,'�뱸','151200', '151430');
INSERT INTO TB_TRAIN_TM VALUES ('103',4,'�λ�','160400', '160400');
INSERT INTO TB_TRAIN_TM VALUES ('106',1,'�λ�','083500', '083500');
INSERT INTO TB_TRAIN_TM VALUES ('106',2,'����','100200', '100530');
INSERT INTO TB_TRAIN_TM VALUES ('106',3,'����','112800', '112800');

UPDATE TB_GRADE
SET    TOT = KOR + ENG + MAT,
       AVG = ROUND((KOR + ENG + MAT) / 3,1);
SELECT * FROM TB_GRADE;

----------------------------------------------------------------------------------------------------
-- �����ͺ��̽��� �ݿ�
----------------------------------------------------------------------------------------------------

COMMIT;


----------------------------------------------------------------------------------------------------
-- ���� ���̺� ����
----------------------------------------------------------------------------------------------------

-- �� ���� ���̺�

DROP TABLE TB_CUSTOMER CASCADE CONSTRAINTS;
DROP TABLE TB_ADD_CUSTOMER CASCADE CONSTRAINTS;
DROP TABLE TB_POINT CASCADE CONSTRAINTS;
DROP TABLE TB_POINT_2017 CASCADE CONSTRAINTS;
DROP TABLE TB_POINT_2018 CASCADE CONSTRAINTS;
DROP TABLE TB_POINT_2019 CASCADE CONSTRAINTS;
DROP TABLE TB_ETC_INFO CASCADE CONSTRAINTS;
DROP TABLE TB_ITEM_INFO CASCADE CONSTRAINTS;

-- ���� ���� ���̺�

DROP TABLE TB_GRADE CASCADE CONSTRAINTS;
DROP TABLE TB_GRADE_07 CASCADE CONSTRAINTS;
DROP TABLE TB_GRADE_08 CASCADE CONSTRAINTS;
DROP TABLE TB_GRADE_09 CASCADE CONSTRAINTS;
DROP TABLE TB_GRADE_2020 CASCADE CONSTRAINTS;
DROP TABLE TB_CLASS_INFO CASCADE CONSTRAINTS;

-- �Ǹ� ���� ���̺�

DROP TABLE TB_SALES CASCADE CONSTRAINTS;
DROP TABLE TB_SALES_09 CASCADE CONSTRAINTS;

-- ���� ���� ���̺�

DROP TABLE TB_TRAIN_TM CASCADE CONSTRAINTS;

-- ����� ��� ���� ���� ���̺�

DROP TABLE TB_POINT_INFO CASCADE CONSTRAINTS;


    
    
    


