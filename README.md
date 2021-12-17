# java-chicken-2019 - 김범석

# 구현할 기능 목록

- [ ] 메인 화면 출력 기능
- [ ] 메인 화면에서 원하는 기능 번호를 입력받는 기능
```
[예외]
- 없는 기능이면 예외처리
```

- [ ] 테이블 목록 출력 기능
- [ ] 메인화면에서 주문 등록("1") 선택시, 대상 테이블과 등록할 메뉴와 수량을 입력 받고, 주문을 등록하는 기능
```
[예외]
- 없는 테이블을 입력하면 예외처리
- 등록할 메뉴가 없으면 예외처리
- 수량이 숫자가 아니거나 0과 같거나 0보다 작으면 예외처리
```
- [ ] 메인화면에서 결제하기("2") 선택시, 대상 테이블과 결제 유형을 입력 받고, 결제하는 기능 
```
[예외]
- 없는 테이블을 입력하면 예외처리
- 없는 결제 유형을 입력하면 예외처리
- 할인율을 적용한 최종 결제할 금액이 정수가 아니면 예외처리
```
- [ ] 최종 결제할 금액을 출력하는 기능
- [ ] 메인 화면에서 프로그램 종료("3") 선택시, 프로그램을 종료하는 기능
## ✔️ Requirement

- [Java 8](https://www.oracle.com/java/technologies/java8.html)
- [Gradle](https://gradle.org/) (5.4.1 + )

## ✔️ Initialize

```bash
$ git clone https://github.com/xfrnk2/java-chicken-2019.git
```

## ✔️ Test

[Mac](https://www.apple.com/za/macos/what-is/) or [Linux](https://www.linux.org/)

```bash
$ ./gradlew clean test
```

[Windows](https://www.microsoft.com/ko-kr/windows)

```bash
$ gradlew.bat clean test
```

# 치킨집 POS 미션 구현해보기

## 기능 요구 사항
- 치킨집 사장님이 사용하는 간단한 포스(POS) 프로그램을 구현한다.
  **주문 등록, 결제하기, 프로그램 종료 기능을 가진다.**

- 메뉴 기본 정보가 주어지며 **메뉴 번호, 종류, 이름, 가격**을 가진다.

- 테이블 기본 정보가 주어지며 **테이블 번호**를 가진다.

- 한 테이블에서 주문할 수 있는 **한 메뉴의 최대 수량은 99개**이다.

- 주문이 등록된 테이블은 **결제가 이루어지기 전까지 테이블 목록에 별도로 표시한다.**

- 주문 내역에 대한 계산을 할 때는 **결제 유형에 따라 할인율**이 달라진다.
    - 치킨 종류 메뉴의 수량 합이 **10개가 넘 경우, 10,000원씩 할인된다.**
        - e.g. 10개는 10,000원 할인, 20개는 20,000원 할인
    - **현금 결제는 5%가 할인**되며 **할인된 금액에서 한 번 더 할인**이 가능하다.

- 주문 혹은 결제가 불가능한 경우 그 이유를 보여 주고, 다시 주문 혹은 결제가 가능하도록 해야 한다.

- 최종 결제 금액을 보여준다.

## 프로그램 실행 결과
```
## 메인화면
1 - 주문등록
2 - 결제하기
3 - 프로그램 종료

## 원하는 기능을 선택하세요.
1

## 테이블 목록
┏ - ┓┏ - ┓┏ - ┓┏ - ┓┏ - ┓┏ - ┓
| 1 || 2 || 3 || 5 || 6 || 8 |
┗ - ┛┗ - ┛┗ - ┛┗ - ┛┗ - ┛┗ - ┛

## 테이블을 선택하세요.
1

[치킨] 1 - 후라이드 : 16000원
[치킨] 2 - 양념치킨 : 16000원
[치킨] 3 - 반반치킨 : 16000원
[치킨] 4 - 통구이 : 16000원
[치킨] 5 - 간장치킨 : 17000원
[치킨] 6 - 순살치킨 : 17000원
[음료] 21 - 콜라 : 1000원
[음료] 22 - 사이다 : 1000원

## 등록할 메뉴를 선택하세요.
1

## 메뉴의 수량을 입력하세요.
1

## 메인화면
1 - 주문등록
2 - 결제하기
3 - 프로그램 종료

## 원하는 기능을 선택하세요.
1

## 테이블 목록
┏ - ┓┏ - ┓┏ - ┓┏ - ┓┏ - ┓┏ - ┓
| 1 || 2 || 3 || 5 || 6 || 8 |
┗ - ┛┗ - ┛┗ - ┛┗ - ┛┗ - ┛┗ - ┛

## 테이블을 선택하세요.
1

[치킨] 1 - 후라이드 : 16000원
[치킨] 2 - 양념치킨 : 16000원
[치킨] 3 - 반반치킨 : 16000원
[치킨] 4 - 통구이 : 16000원
[치킨] 5 - 간장치킨 : 17000원
[치킨] 6 - 순살치킨 : 17000원
[음료] 21 - 콜라 : 1000원
[음료] 22 - 사이다 : 1000원

## 등록할 메뉴를 선택하세요.
21

## 메뉴의 수량을 입력하세요.
1

## 메인화면
1 - 주문등록
2 - 결제하기
3 - 프로그램 종료

## 원하는 기능을 선택하세요.
2

## 테이블 목록
┏ - ┓┏ - ┓┏ - ┓┏ - ┓┏ - ┓┏ - ┓
| 1 || 2 || 3 || 5 || 6 || 8 |
┗ - ┛┗ - ┛┗ - ┛┗ - ┛┗ - ┛┗ - ┛

## 테이블을 선택하세요.
1

## 주문 내역
메뉴 수량 금액
후라이드 1 16000
콜라 1 1000

## 1번 테이블의 결제를 진행합니다.
## 신용 카드는 1번, 현금은 2번
1

## 최종 결제할 금액
17000원

## 메인화면
1 - 주문등록
2 - 결제하기
3 - 프로그램 종료
...
```

### 출처
https://velog.io/@kouz/%EC%9A%B0%EC%95%84%ED%95%9C-%ED%85%8C%ED%81%AC%EC%BD%94%EC%8A%A4-2%EA%B8%B0-%EC%98%A4%ED%94%84%EB%9D%BC%EC%9D%B8-%EC%BD%94%EB%94%A9%ED%85%8C%EC%8A%A4%ED%8A%B8-%EB%A6%AC%EB%B7%B0-%EB%B0%98%EC%84%B1-3dk4pax3p7