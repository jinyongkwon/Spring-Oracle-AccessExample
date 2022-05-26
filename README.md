# 주의사항
- 테이블 명으로 user 사용 불가.

- DB 생성후 모든 권한 주는 쿼리
- => system에서 해주어야함.
```
CREATE USER twitter IDENTIFIED BY "twitter";
GRANT CONNECT, DBA, RESUORCT TO twitter;
```

- Sequnce를 사용하기 때문에 @Entity로 테이블을 생성하려면 아래 코드를 클래스 위에 걸어주어 시퀀스를 만들어주고 
```
@SequenceGenerator(name = "Entity_ID_GENERATOR", sequenceName = "Entity_SEQUENCES", initialValue = 1, allocationSize = 1)
```
- PK로 지정할 변수 위에 아래 코드를 걸어주어 시퀀스를 사용.
```
@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "Post_ID_GENERATOR")
```
