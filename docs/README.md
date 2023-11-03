<div align="center">

# 로또 미션 🎰
<img src="https://img.shields.io/badge/java-007396?style=for-the-badge&logo=java&logoColor=white"/>
<img src="https://img.shields.io/badge/junit5-25A162?style=for-the-badge&logo=junit5&logoColor=white"/><br>

</div>

## 👩🏻‍💻 구현할 기능 목록
1. 로또 구입 금액을 입력 받는다. (View) <br><br>
2. 구입 금액에 해당하는 만큼 로또를 발행한다. (Service) <br>
   ✦ 로또 1장의 가격은 1,000원이다. <br>
   ✦ 로또 번호의 숫자 범위는 1~45까지이다. <br>
   ✦ 1개의 로또를 발행할 때 중복되지 않는 6개의 숫자를 뽑는다.<br><br>
3. 발행한 로또 수량 및 번호를 출력한다. (View) <br>
   ✦ 로또 번호는 오름차순으로 정렬한다. <br><br>
4. 당첨 번호를 입력 받는다. (View) <br>
   ✦ 번호는 쉼표(,)를 기준으로 구분한다. <br><br>
5. 보너스 번호를 입력 받는다. (View) <br><br>
6. 당첨 내역을 계산한다. (Service) <br>
   ✦ `1등`: 6개 번호 일치 / 2,000,000,000원 <br>
   ✦ `2등`: 5개 번호 + 보너스 번호 일치 / 30,000,000원 <br>
   ✦ `3등`: 5개 번호 일치 / 1,500,000원 <br>
   ✦ `4등`: 4개 번호 일치 / 50,000원 <br>
   ✦ `5등`: 3개 번호 일치 / 5,000원 <br><br>
7. 당첨 내역을 출력한다. (View) <br><br>
8. 수익률을 계산한다. (Service) <br><br>
9. 수익률을 출력한다. (View) <br><br>

## 🚨 예외 처리
사용자가 잘못된 값을 입력할 경우 `Exception`를 발생시키고, `[ERROR]`로 시작하는 에러 메시지를 출력 후 그 부분부터 입력을 다시 받는다.
1. 로또 구입 금액은 1,000원으로 나누어 떨어져야 한다.<br><br>
2. 당첨 번호와 보너스 번호는 1부터 45까지의 중복되지 않는 수이다.<br><br>

## 🍞 객체 중심 설계


## 🏛️ 프로젝트 패키지 구조


## 📑 로그