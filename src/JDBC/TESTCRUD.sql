SELECT * FROM JAVASQL

-- [ALT] + [X]
CREATE TABLE JAVASQL1(
	TEST3 NVARCHAR2(10),
	TEST4 NVARCHAR2(10)
);

SELECT * FROM JAVASQL1
-- 회워정보 INWERT 하기
-- N_INSERT() 메소드 생성 후 JDBCCLASS에 실행하기
-- TESCUDE OF SQLDEVEEPRER                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                
-- NAVER테이블
-- 아이디, 비밀번호, 이름, 나이, 성별, 이메일, 연락처
-- 아이디를 PK로 지정하기

DROP TABLE NAVER;
CREATE TABLE NAVER(
	NID	NVARCHAR2(20)	,
	NPASSWORD	NVARCHAR2(20),
	NNAME	NVARCHAR2(10),
	NAGE	NUMBER,
	NGEN NVARCHAR2(2),
	NEMAIL	NVARCHAR2(20),
	NPHONE	NVARCHAR2(13),
	CONSTRAINT NA_ID_PK PRIMARY KEY(NID)
);

SELECT NID AS 아이디, NPASSWORD AS 비밀번호, NNAME AS 이름, NAGE AS 나이, NGEN AS 성별
, NEMAIL AS 이메일, NPHONE AS 연락처
FROM NAVER
;

