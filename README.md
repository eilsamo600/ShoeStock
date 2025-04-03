# ShoeStock
Shoe Inventory Management System Using JDBC  
<br>
<br>

## 프로젝트 목적
데이터베이스를 활용하여 **효율적이고 체계적인 데이터 관리** 구현  
**중복 데이터를 최소화**하며, 데이터의 상태를 **정확하게 추적**할 수 있는 데이터 베이스설계
<br>
<br>
<br>

## 주제 선정 - 신발
<img width="882" alt="스크린샷 2025-04-03 오후 5 38 59" src="https://github.com/user-attachments/assets/32636f48-e15f-492a-b10d-365889cb1a2e" />

- **재고 관리의 복잡성** : 동일한 신발 모델이라도 **색상**과 **사이즈**에 따라 재고가 다르기 때문에 별도의 관리 필요
- **중복 데이터 문제** : 마구잡이로 데이터를 저장할 경우 같은 신발 모델에 대한 정보가 중복되어 저장
- **효율적인 재고 관리 필요성** : 데이터를 효율적으로 관리하여 중복 최소화, 빠르게 데이터를 조회하고 수정할 수 있는 시스템 필요
<br>
<br>

## 기능 요약


> - 신발 모델 관련
>   
>    - 등록되어 있는 전체 신발 모델 조회
>    - 등록되어 있는 신발 모델 검색 (브랜드명, 모델명)
>    - 신발 모델 등록 / 수정
>      
> - 신발 재고 관련
>    
>    - 전체 재고 조회
>    - 항목별 재고 검색 (브랜드명, 모델명)
>    - 재고 등록
<br>
<br>


## 💾 데이터베이스 설계

---

1. `model` 테이블:
    - 신발 모델에 대한 정보를 저장합니다.
    - 컬럼: `모델ID`, `모델명`, `브랜드명`, `가격`, `간단한 설명`
2. `color` 테이블:
    - 신발의 색상 정보를 저장합니다.
    - 컬럼: `색상ID`, `색상명`
3. `stock` 테이블:
    - 각 신발 모델, 색상, 사이즈의 조합에 대한 재고 정보를 저장합니다.
    - 컬럼: `재고ID`, `모델ID`, `색상ID`, `사이즈`, `재고`

<img width="1147" alt="스크린샷 2025-04-03 오후 11 32 49" src="https://github.com/user-attachments/assets/bb8bf12d-44c7-41bb-8922-75bad139b3eb" />


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

## 사용 기술

- **언어**: Java
- **데이터베이스**: MySQL
- **주요 라이브러리**: JDBC (Java DataBase Connectivity)
- **프레임워크**: 없음 (JDBC를 직접 사용하여 데이터베이스와 연동)
