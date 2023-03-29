let arr = []
arr = ['일','월','화','수','목','금','토','일']

let newDate = new Date();

console.log(`표준시 ${newDate}`);
console.log(`년 newDate.getFullYear() ${newDate.getFullYear}년`);
console.log(`월 newDate.getMonth ${newDate.getMonth}월`);
console.log(`일 newDate.getDate ${newDate.getDate}일`);
console.log(`요일 newDate.getDay ${newDate.getDay}요일`);

//0000-00-00
console.log(`${newDate.getFullYear()}-${newDate.getMonth()+1 < 10 ? `0${newDate.getMonth()+1}` : newDate.getMonth()+1}-${newDate.getDate()}`)

newDate.getMonth()+1 < 10 ? `0${newDate.getMonth()+1}` : newDate.getMonth() +1

//시간
console.log(newDate.getHours());
console.log(newDate.getMinutes());
console.log(newDate.getSeconds());

// 00:00:00
console.log(`${newDate.getHours()} : ${newDate.getMinutes()} : ${newDate.getSeconds()}`);

//newDate.setFullYear( 오늘현재년도 가져오기 + 1 );
newDate.setFullYear( newDate.getFullYear()+1);
//설정된 년도 확인하기
console.log( newDate.getFullYear(), '1년 후', newDate.getFullYear());

//날짜를 표준시로 반환하기
console.log(newDate.toUTCString());

// 3개월 더하기
newDate = new Date();

//newDate.setMonth( 현재 월을 가져오기 +3 );
console.log('셋팅 이전 상태 월', newDate.getMonth()+1);
newDate.setMonth( newDate.getMonth() +3);
console.log('셋팅 이후 상태 월', newDate.getMonth()+1);
console.log(newDate.toUTCString());

// 7일 더하기
newDate = new Date ();
console.log('셋팅 이전 상태 시간', newDate.getDate()+1);
newDate.setDate( newDate.getDate() +7 );
console.log('셋팅 이후 상태 일', newDate.getDate()+1);
console.log(newDate.toUTCString());


// 10시간 더하기
newDate = new Date();
console.log('셋팅 이전 상태 시간' , newDate.getHours()+1);
newDate.setHours(newDate.getHours()+10);
console.log ('셋팅 이후 상태 시간', newDate.getHours()+1);
console.log(newDate.toUTCString());

//현재 시 분 초 띄우기
// 1초 단위로 현재 날짜객체를 가져오기 
//자동타이머
setInterval(function(){
    newDate = new Date();

    console.log(`${newDate.getFullYear()}-${newDate.getMonth()+1}-${newDate.getDate()}-${newDate.getHours()}-${newDate.getMinutes()}-${newDate.getSeconds()}`)

},1000)
