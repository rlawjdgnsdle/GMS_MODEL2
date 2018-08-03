select * from member;

UPDATE MEMBER
SET
TEAM_ID = 'BTEAM',
ROLL = 'leader' ,
AGE = '26' ,
password = '1'
WHERE MEM_NAME like '지은';


,'지은','준','재경','단아'

select * from Project_TEAM;

UPDATE PROJECT_TEAM SET TEAM_ID = 'DTEAM'
WHERE TEAM_NAME LIKE '어벤저스';

UPDATE MEMBER SET TEAM_ID = 'ATEAM', ROLL = 'leader' 
WHERE MEM_ID LIKE '가오갤1' AND PASSWORD LIKE '1';

