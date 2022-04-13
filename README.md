# 숫자 야구 게임
## 진행 방법
* 숫자 야구 게임 요구사항을 파악한다.
* 기능 요구사항, 프로그래밍 요구사항, 과제 진행 요구사항 → 3가지 모두 만족하기 위해 노력할 것
* 기능 구현 전 <span style="color:Red">기능 목록 만들기</span>
* 기능 요구사항에 기재되지 않은 내용은 스스로 판단하여 구현하기

## 과제 제출 과정
* [과제 제출 방법](https://github.com/next-step/nextstep-docs/tree/master/precourse)
* 요구사항에 대한 구현을 완료한 후 자신의 github 아이디에 해당하는 브랜치에 Pull Request(이하 PR)를 통해 과제를 제출한다.
* Github에 제출한 후 프리코스 1차 구글폼을 이용해 최종 과제 제출
  - 미션 진행 시 느낀점, 배운점, 많은 시간을 투자한 부분 등 포함하기

## 주의 해야할 점
- [ ] 기능 단위로 커밋하기
- [ ] Pull Request와 구글폼 과제 제출
- [ ] else 예약어 금지
- [ ] indent depth는 1까지만 허용
- [ ] 자바 코드 컨벤션, 커밋 메시지 컨벤션 준수

## 진행순서
1. Junit5와 AssetJ 사용법 학습하기, Git 저장소 생성하기 - 22.04.12(화)
2. 자바 코드 컨벤션, 커밋 메시지 컨벤션 가이드 파악하기 - 22.04.13(수)
3. 게임 룰 파악하기 - 22.04.13(수)
4. 기능 목록 만들기 - 22.04.13(수)

### 1. Junit5와 AssetJ 사용법 학습하기, Git 저장소 생성하기
### 2. 자바 코드 컨벤션, 커밋 메시지 컨벤션 가이드 파악하기 
<details>
<summary>Java Code Convention</summary>
<div>

- **Class 이름**
  - UpperCamelCase 로 작성
  - 일반적으로 명사 또는 명사구
    - ex) Character 또는 ImmutableList.
  - 어노테이션 유형 이름 지정에 대한 특정 규칙이나 잘 확립 된 규칙은 X
  - 테스트 클래스의 이름은 테스트중인 클래스의 이름으로 시작하고 Test를 끝에 붙여줍니다.
    - ex) HashTest, HashIntegrationTest.

- **Variables(변수)**
  - 지역 변수 이름
    - lowerCamelCase 로 작성
    - final, 불변인 경우에도 지역 변수는 상수로 간주되지 않으며 상수로 스타일을 지정해서는 안됨
  - Type 변수 이름
    - 각 유형 변수는 다음 두 가지 스타일 중 하나로 이름이 지정됨
      - 단일 대문자, 혹은 단일 숫자가 따라올 수 있음 (예 : E, T, X, T2)
      - 클래스에 사용되는 형식의 이름 (섹션 5.2.2, 클래스 이름 참조 ) 뒤에 대문자 T(예 : RequestT, FooBarT).

- **메소드**
  - 메소드 이름은 lowerCamelCase 로 작성
  - 메서드 이름은 일반적으로 동사 또는 동사 구
    - ex) sendMessage, stop.
  - JUnit 테스트 메서드 이름에 밑줄이 표시되어 이름의 논리적 구성 요소를 구분할 수 있으며 각 구성 요소는 lowerCamelCase로 작성됨.  
    한 가지 전형적인 패턴은 예를 들면 다음과 같음.
  ```
  <methodUnderTest>_<state>pop_emptyStack
  ```
  - 테스트 방법의 이름을 정하는 올바른 방법은 없음.

- **Package**
  - 패키지 이름은 모두 소문자이며 연속 된 단어는 단순히 함께 연결됨 (밑줄 없음).
  - ex)
    - ⭕️ com.example.deepspacenot
    - ❌ com.example.deepSpace또는 com.example.deep_space.

- **인터페이스**
  - 명사/명사 구 (예 : List) 또는 형용사/형용사 구 (예 : Readable)
  - 대문자 카멜케이스 (ex: camel_case X, camelCase X, CamelCase O)

- **공통**
  - 한국어 발음대로 표기 금지  
    - ex: 사용자 -> Sayongja X, User O
  - 대문자로 표기할 약어는 목록에 별도로 명시
    - ex
      - 대문자로 표기할 약어의 목록을 정의하지 않는 경우 : HttpApiUrl
      - API만 대문자로 표기할 약어의 목록에 있을 경우 : HttpAPIUrl
      - HTTP, API, URL이 대문자로 표기할 약어의 목록에 있을 경우 : HTTPAPIURL
</div>
</details>

<details>
<summary>Commit Log 남기기</summary>
<div> 

- 참고: https://gist.github.com/stephenparish/9941e89d80e2bc58a153

commit 메시지는 기본적으로 아래 구조를 따른다.
```
type(scope(선택)) : Subject -- Header(필수)
body -- (선택)
footer -- (선택)
```

각 부분은 한 줄의 공백으로 구분한다.  
tip) git log 사용시 git log --oneline 입력하면 message의 header 부분만 깔끔하게 나온다!

- **type**  
Type은 항상 영문 소문자로 작성
  - `feat`(feature): 새로운 기능을 추가하거나, 기존 기능을 요구사항 변경으로 인해 변경한 경우
  - `fix`(bug fix) : 버그를 수정한 경우
  - `docs`(documentation): 문서(주석) 추가/수정의 경우, 직접적인 코드의 변화 없이 문서만 추가 수정 했을 때
  - `style`: UI를 추가/수정하거나, 스타일 관련 작업의 경우 ex) formatting, missing semi colons
  - `refactor`: 기능의 변경 없이, 코드를 리팩토링 한 경우
  - `test`: 테스트 코드를 추가/수정한 경우
  - `chore` : 기능/테스트, 문서, 스타일, 리팩토링 외에 배포, 빌드와 같이 프로젝트의 기타 작업들에 대해 추가/수정한 경우

- **scope**  
생략 가능
- 커밋의 해당하는 파일명과 확장자까지 적는것이 일반적이다  
  ex) feat(router or App.js): A~~~

- **subject**
  - 제목은 50글자 내로 제한
  - 제목 첫 글자는 대문자로 작성(영어)
  - 제목 끝에 마침표 넣지 않기
  - 영문작성시, 명령문을 사용하며 과거형 금지
  - 국문작성시, 구문으로 작성

- **Body**
  - Header로 표현가능하다면 생략가능한 부분
  - 제목에서 하지 못한 커밋의 상세 내역을 작성
  - 본문은 72글자 내로 제한
  - How 보다는, what과 why를 설명

- **Footer**  
  - 생략가능  
    어떤 이슈에서 왔는지에 대한 참조정보들을 추가하는 용도  
    (#issueNumber)   
  - cf)한개의 issue에 해당할 시 Header 부분에 작성
  ```
  ex) Type(scope): Subject(#issueNumber)
  ```
  - 그 외에는 `footer`에 이슈 번호와 라벨을 추가
  - 여기서 **라벨**의 종류에는  
    `Resolve`,`closes`,Fixes`,`see also`가 있는데,  
     github의 경우 라벨의 종류에 따라 이슈를 닫을 수 있음.
</div>
</details>

### 3. 게임 룰 파악하기
1. 컴퓨터는 1에서 9까지 서로 다른 임의의 수 3개를 선택
2. 플레이어는 컴퓨터가 생각하고 있는 3개의 숫자를 입력
3. 컴퓨터는 게임 플레이어가 입력한 숫자에 대한 결과를 출력
  - **스트라이크**: 같은 수가 같은 자리에 있는 경우  
  - **볼**: 같은 수가 다른 자리에 있는 경우  
  - **낫싱**: 같은 수가 전혀 없음
  - ex) 컴퓨터의 수가 425 일 때,
    - 123 제시: 1스트라이크
    - 456 제시: 1볼 1스트라이크
    - 789 제시: 낫싱
4. 위 과정을 반복해 컴퓨터가 선택한 3개의 숫자를 모두 맞히면 게임 종료
5. 게임을 종료한 후 게임을 다시 시작하거나 완전히 종료 가능
6. 사용자가 잘못된 값을 입력할 경우 illegalArgumentException을 발생시킨 후 어플리케이션은 종료되어야 함

### 4. 기능 목록 만들기
- [ ] 숫자 랜덤 생성하기
  - 3자리 자연수
  - 1부터 9까지의 숫자로 구성됨
  - 각 숫자는 unique함

- [ ] 사용자 입력 받기
  - "숫자를 입력해주세요: " 출력

- [ ] 사용자 입력 검증 로직
  - 1부터 9까지의 숫자로 구성되어야 함
  - 3자리 자연수여야 함
  - 음수가 올 수 없음
  - 각 숫자는 unique해야 함

- [ ] 정답 여부 확인
  - 스트라이크: 같은 수가 같은 자리에 있는 경우
  - 볼: 같은 수가 다른 자리에 있는 경우
  - 낫싱: 같은 수가 전혀 없음

- [ ] 검사결과 출력
  - 정답인 경우
    - "3개의 숫자를 모두 맞히셨습니다! 게임 종료  
       게임을 새로 시작하려면 1, 종료하려면 2를 입력하세요"
  - 오답인 경우
    - 출력 순서: 볼 → 스트라이크
    - 사용자 입력 받기 수행

- [ ] 종료 입력 값 검사
  - 1 입력: 사용자 입력 받기 수행
  - 2 입력: 종료