# 스프링부트와 AWS로 혼자 구현하는 웹서비스

## Intellij Tools
- General ShortCut

| ShortCut | 설명 | 
|:-------|:------|
| ctrl + alt + s | 설정창(settings) 열기 |
| ctrl + alt + shift + s | Project Structure 창 열기 |
| ctrl + e | 최근 사용한 파일 목록 조회 |
| ctrl + shift + a | 액션을 검색하여 실행 (설정 변경 및 단축키 확인) |
| double shift | 파일, 클래스, 설정 등 키워드 관련 검색 |

- Editor ShortCut

| ShortCut | 설명 |
|:-------|:------|
|ctrl + f4 | 탭 닫기 | 
|ctrl + space | 코드 완성 | 
|alt + insert | 코드 생성 (constructor, getter, setter, override method) |
|ctrl + o | override 메서드 확인 |
|ctrl + i | implements method 확인 |
|ctrl + q | document 확인 |
|ctrl + d | copy line |
|ctrl + y | delete line |
|alt + shift + ↑ ↓ | 라인 단위로 옮기기 |
|ctrl + shift + ↑ ↓ | 구문 안에서 라인 옮기기 |

- Code View

| ShortCut | 설명 |
|:-------|:------|
|ctrl + p | 인자 값 보기 (Parameter Info) | 
|ctrl + shift + i | 코드 구현부 보기 (Quick Definition) | 
|ctrl + ←→ | 단어별 이동 | 
|ctrl + shift + ←→ | 단어별 선택 |

- Focus

| ShortCut | 설명 |
|:-------|:------|  
|ctrl + w | 포커스 범위 한 단계씩 늘리기 |
|ctrl + shift + w | 포커스 범위 한 단계씩 줄이기 |
|ctrl + alt + ←→ | 포커스 앞 / 뒤로 이동 |
|double ctrl + ↑ ↓ | 멀티 포커스 |
|F2 | 오류 라인 포커스 |

## Project Spec
|Module|Version|Etc|
:-------|:------:|:------:|
| SpringBoot | 2.1.9.RELEASE |
| JDK | 1.8 |
| Gradle | 4.8 |

## Project Start

```shell script
$ git clone https://github.com/SeokRae/springboot.git
```

## Project Actions

- Settings
    - [x] Convert gradle -> **spring-boot**
    - [x] Settings **git, github** in Intellij
    - [x] Convert Dto: Getter, Setter, Constructor, toString -> **lombok**
    - [x] Settings **Spring data jpa**
    - [x] Automate create time and update time with **JPA Auditing**
    - [x] Settings **mustache** plugin (template engine)  
    - [x] Settings **OAuth2**
    - [x] Settings Dev DB **H2**
    - [x] Settings Prod DB Plugin **Database Navigator**
    - [x] Settings Maria DB Driver

- API
    - [x] posts CRUD API

- View
    - [x] template posts CRUD view
    - [x] view function

- Test
    - [x] Config Test
    - [x] Domain Test
    - [x] Service Test
    - [x] Controller Test
    - [x] Login Test

- Server
    - [x] Dev & Prod properties 구분
    - [x] Create AWS **EC2** instance (Amazon Linux AMI)
    - [x] Assign **EIP**(Elastic IP)
    - Required setting for EC2
        - [x] Install **JDK 8**
        - [x] update **Timezone**
        - [x] update **hostname**
    - [x] Create AWS **RDS** instance (Maria DB)
    - Required setting for RDS
        - [x] Settings Parameter for operating environment
        
- Deploy
    - [x] Clone Project at EC2
    - [x] Build Test
    - [x] make deploy script
        - deploy script process
            1. git clone or git pull new version project 
            2. test and build project with gradle or maven
            3. start project in EC2
    - Access RDS in EC2
        - [x] make table
        - [x] project settings
        - [x] EC2 settings
    - Automate Deploy Travis CI
        - [x] To link Travis CI with AWS S3
        - [x] To link Travis CI with AWS S3, CodeDeploy
        - [x] update deploy script
    - Implement Nondisruptive Deployment of Service 
        - [x] install Nginx
        - [x] To link Nginx with EC2
        - [x] Add profile API
        - [x] make profile (real1, real2)
        - [x] make deploy script for Nondisruptive Deployment 