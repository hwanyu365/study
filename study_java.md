# OOP (Object Oriented Programming) 개념
OOP는 클래스, 객체, 추상화, 캡슐화, 상속성, 다형성을 사용한 프로그램 설계 방법론

## 클래스와 객체
- 클래스 : 객체를 만들기 위한, field와 method가 정의되어 있는 청사진
- 객체 : 구현해야할 대상
- 인스턴스 : 구현된 대상 (객체가 좀 더 큰의미로 인스턴스를 객체라고 하는 것은 틀린말은 아니다)

## 추상화 (Abstraction)
공통의 속성이나 기능을 묶어 이름을 붙이는 것

## 캡슐화 (Encapsulation)
객체가 필요한 속성(Field)과 행위(Method) 를 하나로 묶고, 그 중 일부를 외부에서 사용하지 못하도록 은닉화하는 것

**은닉화**
접근지정자(Access modifier) 를 사용하여 객체의 filed 와 method 들을 외부에서 사용하지 못하도록 하는 것을 말한다.
(Java's access modifier : public, protected, default, private)

## 상속성 (Inheritance)
자식 (하위, 파생) 클래스가 부모(상위) 클래스의 멤버를 물려받을 수 있는 성질

**상속의 효과**
- 부모 클래스를 재사용해서 자식 클래스를 빨리 개발할 수 있다.
- 반복된 코드의 중복을 줄여준다.
- 유지 보수의 편리성을 제공해 준다. (부모 클래스를 한 번만 수정함으로써 자식클래스를 수정할 필요가 없음)
- 객체의 다형성을 구현할 수 있다.

## 다형성 (Polymorphism)
같은 자료형에 여러 가지 객체를 대입하여 다양한 결과를 얻어내는 성질

**다형성 구현 방법**
- 클래스의 상속이나 인터페이스를 구현하는 자식 클래스에서 메서드를 재정의(*오버라이딩*) 하고 자식 클래스를 부모 타입으로 업캐스팅한다. 그리고 부모 타입의 객체에서 자식 멤버를 참조하여 다형성을 구현한다.

**Overloading (중복정의)**
- 매개변수의 유형 및 개수가 다른 같은 이름의 method를 여러개 정의할 수 있는 기법

**Overriding (재정의)**
- 상위 클래스가 가지고 있는 method를 하위 클래스에서 내용을 재정의하는 기법

# Collections
## list, map, set

## [What is the difference between Enumeration and Iterator in java?](https://happystory.tistory.com/33)

# [GC, Reference 종류 설명](https://d2.naver.com/helloworld/329631)
# Memory leak 원인 및 해결방법

# Thread
## 동기화 설명

# Design Pattern
## Singleton 패턴 구현 방법
