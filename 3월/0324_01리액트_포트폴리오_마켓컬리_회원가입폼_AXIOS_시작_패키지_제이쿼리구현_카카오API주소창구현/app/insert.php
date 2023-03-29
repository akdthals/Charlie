<?

    //1. 데이터 베이스 접근권한 
    // cshong123.dothome.co.kr/signup_db/insert.php
    // http://cshong123.dothome.co.kr/signup_db/insert.php

    $db_server    = 'localhost';
    $db_user_name = 'cshong123';
    $db_password  = 'carfly88^^';
    $db_name      = 'cshong123';

    $conn = mysqli_connect( $db_server, $db_user_name, $db_password, $db_name);
    mysqli_set_charset($conn, 'utf8');

    // if( !$conn ){
    //     die('데이버베이스 접근실패!');
    // }
    // else{
    //     echo ('데이버베이스 접근성공!');
    // }

    // vlfemaud(Field == item == Attribute = column)
    // id, pw, name, emaile, hp, zpp, gender, birth, chooga, service, gaib_date

    // 데이터 베이스에 회원정보 저장하기
    // $변수 = "INSERT INTO 테이블 이름(필드1. 필드2, 필드.....) VALUES('필드1값', '필드값2', '필드값'.....)"
    
    $sql = "INSERT INTO signup_table(id, pw, irum, email, hp, addr, gender, birth, chooga, service, gaib_date) 
            VALUES
            ('cshong123', 'carfly88^^', '홍성민', 'cshong123@naver.com', '010-2764-6281', '마포구 ', '남성', '1997-02-02', '마켓컬리 일일세일', '이용약관동의필수,개인정보 수집∙이용 동의필수, 본인은 만 14세 이상입니다.본인은 만 14세 이상입니다.', '2023-03-16'),
            ('casasd', 'bgwd^^', '이순신', 'cshong@naver.com', '010-5648-2584', '역삼동', '여성', '1997-12-19', '마켓컬리 일일세일', '이용약관동의필수,개인정보 수집∙이용 동의필수, 본인은 만 14세 이상입니다.본인은 만 14세 이상입니다.', '2023-03-16'),
            ('dcsfvs', 'bgdcww^^', '유관순', 'cshon@naver.com', '0104528-6215', '공덕', '여성', '2010-05-05', '마켓컬리 일일세일', '이용약관동의필수,개인정보 수집∙이용 동의필수, 본인은 만 14세 이상입니다.본인은 만 14세 이상입니다.', '2023-03-16'),
            ('gbbg', 'bgwqx^^', '몰라', 'cs@naver.com', '010-2586-4758', '영등포', '남성', '2019-05-11', '마켓컬리 일일세일', '이용약관동의필수,개인정보 수집∙이용 동의필수, 본인은 만 14세 이상입니다.본인은 만 14세 이상입니다.', '2023-03-16'),
            ('nhnyhd', 'cwfgs^^', '찰리', 'cshong1234234234@naver.com', '010-5469-5213', '홍대', '여성', '2000-02-02', '마켓컬리 일일세일', '이용약관동의필수,개인정보 수집∙이용 동의필수, 본인은 만 14세 이상입니다.본인은 만 14세 이상입니다.', '2023-03-16')";

        $result = mysqli_query( $conn,  $sql); // 쿼리 실행

        if( !$result ){
            echo("데이터베이스 테이블에 회원정보 저장 실패!");
        }
        else{
            echo("데이터베이스 테이블에 회원정보 저장 성공!");
        }

?>

