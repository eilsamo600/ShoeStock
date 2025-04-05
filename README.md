# ShoeStock
JDBC를 활용한 신발 재고 관리 시스템  
<br>
<br>


## 🎯 Project Purpose
데이터베이스를 활용하여 **효율적이고 체계적인 데이터 관리** 구현  
**중복 데이터를 최소화**하며, 데이터의 상태를 **정확하게 추적**할 수 있는 데이터베이스 설계
<br>
<br>
<br>


## 👟 Subject Selection - Shoes
<img width="882" alt="스크린샷 2025-04-03 오후 5 38 59" src="https://github.com/user-attachments/assets/32636f48-e15f-492a-b10d-365889cb1a2e" />

- **재고 관리의 복잡성** : 동일한 신발 모델이라도 **색상**과 **사이즈**에 따라 재고가 다르기 때문에 별도의 관리 필요
- **중복 데이터 문제** : 마구잡이로 데이터를 저장할 경우 같은 신발 모델에 대한 정보가 중복되어 저장
- **효율적인 재고 관리 필요성** : 데이터를 효율적으로 관리하여 중복 최소화, 빠르게 데이터를 조회하고 수정할 수 있는 시스템 필요
<br>
<br>


## 💾 Database Design

1. `model` 테이블:
    - 신발 모델에 대한 정보를 저장합니다.
    - 컬럼: 모델ID, 모델명, 브랜드명, 가격, 간단한 설명
2. `color` 테이블:
    - 신발의 색상 정보를 저장합니다.
    - 컬럼: 색상ID, 색상명
3. `stock` 테이블:
    - 각 신발 모델, 색상, 사이즈의 조합에 대한 재고 정보를 저장합니다.
    - 컬럼: `재고ID`, `모델ID`, `색상ID`, `사이즈`, `재고`

<img width="1147" alt="스크린샷 2025-04-03 오후 11 32 49" src="https://github.com/user-attachments/assets/bb8bf12d-44c7-41bb-8922-75bad139b3eb" />
<br>


## 📁 Project Structure
```
src/main/java/com/
  ├── model/             # Data models
  │   ├── Colors.java
  │   ├── Model.java
  │   ├── Stock.java
  │   └── StockInfo.java
  ├── dao/               # Database Access Object
  │   ├── ColorsDao.java
  │   ├── ModelDao.java
  │   └── StockDao.java
  ├── service/           # Business logic
  │   ├── ColorService.java
  │   ├── ModelService.java
  │   └── StockService.java
  ├── view/              # View
  │   ├── ColorsView.java
  │   ├── ModelView.java
  │   └── StockView.java
  └── Application.java
```
<br>
<br>


## 🧩 Function Introduction
- 신발 모델 관련
   
   > - 등록되어 있는 전체 신발 모델 조회
   >   
   >   <img width="793" alt="스크린샷 2025-04-04 오전 7 30 56" src="https://github.com/user-attachments/assets/b732c295-c755-4525-aed5-47bd9b0a894a" />
   >
   > - 등록되어 있는 신발 모델 검색 (모델명, 신발id)
   >   
   >   <img width="784" alt="스크린샷 2025-04-04 오전 7 31 53" src="https://github.com/user-attachments/assets/4ec416be-ec74-47c2-832b-a9c6edfaaa23" />
   >
   > - 신발 모델 등록 / 수정
   >   
   >   <img width="507" alt="스크린샷 2025-04-04 오전 7 32 43" src="https://github.com/user-attachments/assets/8a8db671-aa69-4f37-88f3-435746225851" />

<br>
<br>

- 신발 재고 관련
    
   > - 전체 재고 조회
   >   
   >   <img width="586" alt="스크린샷 2025-04-04 오전 7 36 37" src="https://github.com/user-attachments/assets/1ab85ef1-bdab-4c40-8ada-789e13bac20d" />
   >
   > - 항목별 재고 검색 (모델명, 색상, 사이즈)  
   >
   >    <img width="310" alt="스크린샷 2025-04-04 오전 7 39 32" src="https://github.com/user-attachments/assets/02bdf791-d234-4955-825d-3d9ffacef53f" />
   >
   > - 재고 등록  
   >
   >    <img width="242" alt="스크린샷 2025-04-04 오전 9 30 06" src="https://github.com/user-attachments/assets/c2f66568-82ed-4628-8d02-da7c1980cdb0" />

<br>
<br>

- 색상 관련
   > - 등록되어 있는 전체 신발 색상 조회
   >
   >     <img width="313" alt="스크린샷 2025-04-04 오전 9 28 57" src="https://github.com/user-attachments/assets/8f0baad6-39c8-41e7-b62b-2739e7635958" />
   >
   > - 색상 조회 (색상, 색상id)
   >
   >     <img width="266" alt="스크린샷 2025-04-04 오전 9 28 26" src="https://github.com/user-attachments/assets/e35fca85-10ae-4cf4-b564-15018db9eee6" />
   >
   > - 색상 등록
   >    
   >    <img width="266" alt="스크린샷 2025-04-04 오전 9 27 42" src="https://github.com/user-attachments/assets/47ffb851-906e-400c-bfcb-d9066d424129" />

 
<br>
<br>


## 📈 Sequence Diagram
```
View : 사용자와 직접 상호작용
Service : 비즈니스 로직을 수행
DAO : 데이터베이스와 직접 연결되어 필요한 쿼리를 호출
```
- 모델 등록
<img width="868" alt="스크린샷 2025-04-04 오전 5 55 01" src="https://github.com/user-attachments/assets/cf4df631-ce85-46a0-9e85-95510ac3f055" />
<br>

- 재고 등록(수정)
<img width="753" alt="스크린샷 2025-04-04 오전 6 03 16" src="https://github.com/user-attachments/assets/b15e097c-95c4-4062-befd-cda737440d20" />
<br>

## 🖥 Technology Used
- **언어** : Java
- **데이터베이스** : MySQL
- **주요 라이브러리** : JDBC (Java DataBase Connectivity)
- **프레임워크** : 없음 (JDBC를 직접 사용하여 데이터베이스와 연동)
