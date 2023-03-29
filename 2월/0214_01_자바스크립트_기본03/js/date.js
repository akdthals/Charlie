let arr = [];
arr = ['일', '월', '화', '수', '목', '금', '토']; //7개의 방에 요일 지정

//날짜
// const newDate = new Date();
let newDate = new Date(); //날짜 객체 가변 변수

console.log(`표준시 ${newDate}`); //날짜 확인
console.log(`년 newDate.getFullYear()  ${newDate.getFullYear()}년`);  //년
console.log(`월 newDate.getMonth()     ${newDate.getMonth()+1}월`);  //월
console.log(`일 newDate.getDate()      ${newDate.getDate()}일`);  //일
console.log(`요일 newDate.getDay()     ${arr[newDate.getDay()]}요일`);  //요일

//0000-00-00
console.log(`${newDate.getFullYear()}-${newDate.getMonth()+1 < 10 ? `0${newDate.getMonth()+1}` : newDate.getMonth()+1}-${newDate.getDate()}`)
//조건문
//if(){}
//삼항연산자
//조건식(1항) ? 참(2항) : 거짓(2항);
newDate.getMonth()+1 < 10 ? `0${newDate.getMonth()+1}` : newDate.getMonth()+1

//시간
console.log(newDate.getHours()); //시
console.log(newDate.getMinutes()); //분
console.log(newDate.getSeconds()); //초


// 00:00:00
console.log(`${newDate.getHours()} : ${newDate.getMinutes()} : ${newDate.getSeconds()}`);

// 게터 getter() : 날짜와 시간 가져오기
// 세터 setter() : 날짜와 시간 변경하기

// 현재 년도에 1년을 더한다. setfullYear( 현재년도 + 1 );
// 현재 월에 한달을 더한다. setMonth( 현재월 + 1 );
// 현재 일에 1일을 더한다. setDay( 현재일 + 1 );
// 현재 시에 1시간을 더한다. setHoure( 현재시 + 1 );
// 현재 분에 1분을 더한다. setMinute( 현재분 + 1 );
// 현재 초에 1초를 더한다. setSecond( 현재초 + 1 );

//newDate.setFullYear( 오늘현재년도 가져오기 + 1 );
newDate.setFullYear( newDate.getFullYear() + 1 ); //2024 = 20023+1
//설정된 년도 확인하기
console.log( newDate.getFullYear(), '1년 후', newDate.getFullYear()  );

//날짜를 표준시로 반환하기
console.log(newDate.toUTCString());
console.log(newDate.toUTCString());

//newDate = 지정
//console = 화면 띄우기

// 3개월 더하기
newDate = new Date();
//newDate.setMonth( 현재 월을 가져오기 +3 );
console.log( '셋팅 이전 상태 월', newDate.getMonth() +1);
newDate.setMonth( newDate.getMonth() +3 );

console.log( '셋팅 이후 상태 월',newDate.getMonth() +1);
console.log(newDate.toUTCString());


// 7일 더하기
newDate = new Date();
//newDate.setMonth( 현재 월을 가져오기 +3 );
console.log( '셋팅 이전 상태 일', newDate.getDate() +1);
newDate.setDate( newDate.getDate() +7 );

console.log( '셋팅 이후 상태 일',newDate.getDate() +1);
console.log(newDate.toUTCString());


// 10시간 더하기
newDate = new Date();
//newDate.setMonth( 현재 시간을 가져오기 +10);
console.log( '셋팅 이전 상태 시간', newDate.getHours() +1);
newDate.setHours( newDate.getHours() +10 ); 

console.log( '셋팅 이후 상태 시간',newDate.getHours() +1);
console.log(newDate.toUTCString());


//현재 시 분 초 띄우기
// 1초 단위로 현재 날짜객체를 가져오기 
//자동타이머
setInterval(function(){
    newDate = new Date();

    console.log( `${newDate.getFullYear()}-${newDate.getMonth()+1}-${newDate.getDate()} ${newDate.getHours()}:${newDate.getMinutes()}:${newDate.getSeconds()}`)
}, 1000); // 1초 간격으로 계속 실행

