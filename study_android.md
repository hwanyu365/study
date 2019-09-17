# Fundamentals
## 4 types components
* Activity : 대부분 사용자와 상호작용하기 위해 UI를 표시하는 컴포넌트
* Service : 여러가지 이유로 백그라운드에서 작업을 수행하기 위한 컴포넌트
* BroadcastReceiver : 시스템 혹은 다른 앱에서 발생하는 브로드캐스트 알림을 응답하기 위한 컴포넌트
* ContentProvider : 파일 시스템, SQL 데이터베이스 등의 데이터를 다른 프로세스와 공유하기 위한 컴포넌트

## AndroidManifest.xml
안드로이드 시스템이 애플리케이션에 대해 수집할 수 있는 사전 정보를 정의한 목록

## Intent
4가지 컴포넌트 중 3가지 컴포넌트, Activity, Service, BroadcastReceiver 를 활성화시 사용되는 비동기식 메시지
![intents](https://developer.android.com/images/components/intent-filters_2x.png)
Figure 1. How an implicit intent is delivered through the system to start another activity: [1] Activity A creates an Intent with an action description and passes it to startActivity(). [2] The Android System searches all apps for an intent filter that matches the intent. When a match is found, [3] the system starts the matching activity (Activity B) by invoking its onCreate() method and passing it the Intent.
<br>인텐트는 크게 두가지 유형이 있다.
명시적 인텐트 (Explicit intents)|암묵적 인텐트 (Implicit intents)
-|-
대상 컴포넌트를 명시하는 방식|대상 패키지를 명시하지 않고 인텐트를 처리 가능한 모든 컴포넌트들을 대상으로 하는 방식
※ Android 5.0 (L OS) 부터 Service 를 bindService() 시 명시적 인텐트를 사용하지 않으면 exception 발생

<br>인텐트는 아래와 같은 정보를 갖는다.
* Component : 명시적 인텐트로 만들기 위한, 대상 컴포넌트에 대한 정보
* Action : 수행해야할 일반적인 역할에 대한 이름, 즉 인텐트의 목적
* Category : 인텐트를 수행할 컴포넌튼의 카테고리
* Data : 처리해야할 데이터의 정보나 유형
* Extras : 인텐트를 처리할 컴포넌트 내부에서 사용할 추가적인 데이터
* Flags : 인텐트를 위한 메타데이터로 주로 시스템에서 activity를 어떻게 실행할지, 그리고 종료 시 어떻게 처리할지에 대한 플래그들이 존재

<br>API
* ComponentName Intent.resolveActivity(pm:PackageManager) : 인텐트를 처리가능한 컴포넌트 정보를 미리 알 수 있다. (메서드 내부에서 <ResolveInfo> PackageManager.queryIntentActivities 를 사용)
* void Intent.createChooser(targe:Intent, title:CahrSequence) : 인텐트를 처리가능한 컴포넌트가 둘 이상인 경우 선택할 수 있는 다이얼로그를 팝업 시켜준다.
* Intent.FLAG_ACTIVITY_FORWARD_RESULT : 해당 Flag를 설정하여 실행 Activity가 종료되는 경우, ActivityTask 내의 New Activity 이전에 존재하는 Activity로 결과를 전달할 수 있다.

# Activity
## [Activity-lifecycle](https://developer.android.com/guide/components/activities/activity-lifecycle)
![activity-lifecycle](https://developer.android.com/guide/components/images/activity_lifecycle.png)

onRestoreInstanceState(Bundle savedInstanceState)|onSaveInstanceState(Bundle outState)
-|-
onSaveInstanceState() 호출되어 데이터가 저장된 경우에만 onStart() 후에 호출되며,Bundle 은 onCreate(Bundle savedInstanceState) 의 에서 사용된 것과 동일|Activity가 onStop() 되는 경우에 호출되며,<br>P-OS 이전 : onPause() 이후에 시스템 상황에 따라 호출<br>P-OS부터 : onStop() 뒤에 항상 호출

	※ 데이터 로딩 중 화면 회전 시, Activity 재생성되는데 효율적으로 처리하려면 어떻게 구현할 것인가?
	1. onSaveInstanceState/onRestoreInstanceState() 를 활용하여 로딩된 데이터를 저장/복원한다.
	2. onRetainNonConfigurationInstance() / getLastNonConfigurationInstance() 를 통해 Not Parcelable 객체를 복원하기
	3. AndroidManifest - android:configChanges="orientaion|screenSize" 를 선언하여 Activity.onCreate() 되지 않도록 하고, onConfigurationChanged() 에서 화면 회전 시 처리해야할 작업을 수행한다.
	4. Service를 통한 데이터 로딩 구조로 변경

## [Launch modes](https://developer.android.com/guide/topics/manifest/activity-element#lmode)

## [Fragment](https://developer.android.com/guide/components/fragments#Creating)
Framgent는 UI를 표시하기 위한 클래스로, 하나의 Activity에서 멀티 UI을 표시하거나, 여러 Activity에서 하나의 Fragment를 재사용하여 UI를 표시할 수 있다.

![Fragment-lifecycle](https://developer.android.com/images/fragment_lifecycle.png)

# Service
오래 걸리는 작업이나, 사용자 상호작용 없이 수행해야할 작업을 백그라운드에서 수행할 수 있도록 해주는 프로세스이다.

서비스 클래스는 크게 Service, IntentService, JobService 가 존재한다.
* **Service**는 Android O-OS 부터 백그라운드 서비스로 수행될 수 없으며, 만약 필요한 경우에는 Notification 또는 Activity와의 binding을 통해 foreground service 상태로 수행할 수만 있다.
* **IntentService**는 요청받은 Intent에 대해 onHandleIntent() 에서 순차적으로 처리하고 처리할 인텐트가 없으면 stop() 되는 서비스이다.
* **JobService**는 JobInfo를 통해 Job 실행 조건을 설정하고 JobScheduler를 통해 이를 시스템에 등록하여, 조건이 되었을 때 JobService가 백그라운드에서 실행되어 작업을 수행하는 서비스이다.

※ 서비스들은 모두 main thread 에서 수행되기 때문에 오래 걸리는 작업을 수행하는 경우 Thread나 AsyncTask를 고려해야 한다.

## [Binded Service와 IPC (InterProcessCommunication) 방법](https://developer.android.com/guide/components/bound-services#Creating)
* Extend Binder Class : 애플리케이션 내에서만 사용하는 서비스라면 Binder' 클래스를 extends 한 인스턴스를 onBind()에서 반환하고, Service와 Binding한 Activity 에서 Binder를 통해 서비스의 메서드 사용하는 방법
* Messenger : onBind() 에서 Messenger 의 Binder객체를 전달하여 Messenger를 통해 Message 교환방식으로 통신하는 방법
* AIDL (Android Interface Definition Language) : Messenger와 달리 여러 클라이언트로의 여러 요청을 동시에 처리해야할 때 AIDL을 사용하며, 이 경우 서비스는 Thread safe 해야하고 멀티 스레딩이 가능해야 한다.(Google에서는 권장하지 않는 방법)

## Types of services
|Foreground|Background|Bound|
|-|-|-|
|사용자에게 알 수 있는 작업을 수행하는 서비스<br>Notification과 연결된 서비스|사용자에게 알리지 않고 작업을 수행하는 서비스<br>API 26부터는 백그라운드 서비스 실행 제한됨|bindService() 를 통해 클라이언트 컴포넌트와 연결된 서비스<br>클라이언트와 binding된 상태이면 계속 실행 가능하다
* [Implement immortal service](https://forest71.tistory.com/185)

## Doze mode
* [Doze & App standby](https://m.blog.naver.com/PostView.nhn?blogId=nife0719&logNo=221029613969&proxyReferer=https%3A%2F%2Fwww.google.com%2F)

## 큰 파일을 다운로드 받을 때 어떻게 구현할 것인가?

# BroadcastReceiver
* [BroadcastReceiver vs WakefulBroadcastReceiver](https://stackoverflow.com/questions/26380534/broadcastreceiver-vs-wakefulbroadcastreceiver)

# [View](https://developer.android.com/reference/android/view/View#implementing-a-custom-view)
* [View lifecycle](https://codentrick.com/android-view-lifecycle/)

## [ViewGroup](https://developer.android.com/reference/android/view/ViewGroup)
* ViewGroup 은 View 클래스를 상속받은, View를 포함할 수 있는 특별한 View 클래스이다.
* 하위에 다른 View를 포함하기 때문에 LayoutParams 클래스를 정의하고 있다.
* FrameLayout, LinearLayout, RelativeLayout, GridLayout, ConstraintLayout, AdapterView<T extends Adapter> Toolbar 등이 있다.

## View 성능 개선 방법
문제점 도출
* Android Profiler 를 inflate 성능이 저하되는 구간의 레이아웃을 찾는다.
* 'Debug GPU Overdraw' 를 통해 overdraw 문제점 확인
- 레이아웃의 불필요한 백그라운드 제거
- View HieraryView를 단순화하기
- 투명 색상 리소스 사용 줄이기
* Profile GPU Rendering 을 통해 GPU Rendering 성능이 떨어지는 화면 및 경로를 확인한다.
* LayoutInspector / HierarcyViewer를 통해 ViewHierarcy를 시각적으로 확인하여 불필요하게 복잡한 레이아웃을 찾는다.

개선방법
* merge tag를 사용하여 불필요하게 중첩된 레이아웃을 제거하여, View 계층을 평탄화 시킨다.
* RelativeLayout 를 ConstraintLayout로 교체하여 더 성능을 향상시킬 수 있다.
* ViewStub 을 사용하여 자주 사용하지 않거나 바로 사용하지 않는 레이아웃은 inflate되지 않도록 하고, 필요한 시점에 layout 을 inflate 되도록 한다.
* 레이아웃 내에 inflate 해야하는 View가 많은 경우 AsyncLayoutInflater 를 사용하여 일부 레이아웃을 비동기적으로 inflate하고 onInflateFinished() 를 통해 전달 받은 View를 addView할 수도 있다.

# Thread
Process Thread 구조<br>
![process_thread](https://i.imgur.com/gOLOBYs.png)
* **HandlerTread** 는 별도의 Looper를 갖는 Thread로, 새로운 Handler와 연결하여 해당 다른 쓰레드에서 전달되는 메시지를 해당 쓰레드에서 차례대로 작업을 수행해야할 때 사용한다.

# Android Architecture Patterns
* [MVC (Model-View-Controller)](https://medium.com/upday-devs/android-architecture-patterns-part-1-model-view-controller-3baecef5f2b6)
![MVC](https://miro.medium.com/max/1400/0*HFP--PRKvRXsS7fd.png)
* [MVP (Model-View-Presenter)](https://medium.com/upday-devs/android-architecture-patterns-part-2-model-view-presenter-8a6faaae14a5)
![MVP](https://miro.medium.com/max/2000/0*VOr9hgXEmoTxyoyz.png)
* [MVVM (Model-View-ViewModel)](https://medium.com/upday-devs/android-architecture-patterns-part-3-model-view-viewmodel-e7eeee76b73b)
![MVVM](https://miro.medium.com/max/1400/0*5mD214cjNXU-V6lf.png)
* [MVI (Model-View-Intention)](https://medium.com/mindorks/mvi-a-reactive-architecture-pattern-45c6f5096ab7)
![MVI](https://miro.medium.com/max/1233/1*4QsnlSgpwK_-Y5s445_mAw.png)
* [MVC vs MVP vs MVVM vs MVI](https://academy.realm.io/posts/mvc-vs-mvp-vs-mvvm-vs-mvi-mobilization-moskala/)
* [MVC vs MVP vs MVVM vs MVI 2](https://brunch.co.kr/@oemilk/113)

# ANR (Application Not Responding)
* 애플리케이션이 응답이 없을 때 발생하는 Exception으로, 아래와 같은 상황에 발생한다.
	1. Application이 5초간 사용자 입력에 반응하지 않을 때
	2. BroacdastReceiver가 10초 내로 작업을 완료하지 않을 때

* ANR을 회피하기 위해서는,
	1. Activity의 경우 오래 걸리는 작업을 별도의 thread 에서 수행하도록 수정
	2. BroadcastReceiver의 경우 Service 를 foreground service로 실행하고, 작업을 별도의 thread에서 수행하도록 수정

# Memory leak 원인 및 해결방법
Memory leakage 는 아래와 같은 상황에 발생할 수 있으며,
* Context 를 참조하는 객체를 static 변수에 지정하고 초기화하지 않은 경우
* 별도의 Thread에서 Context나 Handler를 참조하는 경우 (Thread 종료 전까지 GC되지 않음)

누수 원인은,
* Android Profiler를 통해 Force GC/Heap dump 를 통해 누수로 의심되는 객체를 찾는다
* MAT를 활용하여 Heap dump를 좀더 자세히 그리고 전/후 heap dump를 비교하여 좀 더 쉽게 찾을 수 있다.

해결 방법은,
* 잘못된 static 필드 제거 또는 참조 제거
* register / unregister pair 처리
* Referece 객체를 사용하기

# Android App Bundle (*.aab)
![aab](https://developer.android.com/images/app-bundle/aab_format-2x.png)

# Google I/O 2019 트렌드
* [Android 10](https://developer.android.com/about/versions/10?hl=ko)
	1. Background 프로세스에서 위치 정보를 얻어오려면 'ACCESS_BACKGROUND_LOCATION ' 권한 필요
	2. multi-resume (android.allow_multiple_resumed_activities) 가능
	3. Android beam 삭제

* androidx
* kotlin