$(document).ready(function(){

    //replace
    // var slc = $("#position option:selected").val()-1;
    // $("#email1 option:eq('"+slc+"')").replaceWith("<option value='"+$("#position:selected").text()+"'>한효주</option>");

    // //append를 이용한 셀렉트 박스 옵션 추가
    // var sizee = $("#email1 option").length+1;
    // $("#email1").append("<option value='"+sizee+"'>성형인간</option>");
    
    $("#email1").bind("change",function(){
        var email1 = $.trim($(this).val());
        if(email1 != ""){
            $("#email2").val(email1);
        };
    });

    $("#next").bind("click",function(){
          //힘-수호출
        if(invalidItem()){
            $("#form").submit();
        }
        fn();
    });

    $(".reset").click(function(){
        $("userId").focus();
    });

    $("#userName").bind("blur",function(){
        blur();
    })

    // $("input[=all]").bind('click',function(){
    //     var chk = $(this).is(':checked');
    //     if(chk)$("input[name=gender]").attr('checked', true);
    //     else $("inputp[name=gender]").attr('checked', false);
    // });
//    $("#positionSelected").bind("click",function(){
//         if(this.val()!=uncheck){

//         }
//     });


    function blur(){
        var namePattern = /^[가-힣a-z]+$/;
        var userName =  $.trim($("#userName").val());
        if(!namePattern.test(userName)){
            $("#nameTd").show();
            $("#nameTd").html("잘못했어이녀석");
            $("#userName").css('outline-color', 'red');
        }else{
            $("#nameTd").html("");
            $("#nameTd").hide();
            $("#userName").css('outline-color', 'blue');
        }
    }

    //텍스트값가져오기
    // function fn(){
    //     alert($("#email1 option:selected").text());
    // }

    //인덱스값가져오기
    // function fn(){
    //      alert($("#email1 option").index($("#email1 option:selected")));
    //      }



    function invalidItem(){ 
        
        //입력 패턴 검사: ^는 시작하는 문자 $는 끝나는 문자
        var pattern = /^[a-z0-9_-]{3,16}$/; 
        //[가-힣]{2,4} 는 한글 검색 [a-zA-Z]{2,10}\s[a-zA-Z]{2,10} 는 영문 검색이다
        //이 중간에 들어가 있는  | (파이프기호)는 자바 스크립트의 || 와 같은 의미인가 보다
        //앞에 식 혹은(|) 뒤에 식 or 구문이다.
        var namePattern = /^[가-힣a-z]+$/;
        var numPattern = /^[0-9]+$/;
        var telPattern = /^[0-9-]+$/;//+한번이상반복?
        var emailPattern = /^[0-9a-zA-Z]([-_.]?[0-9a-zA-Z])*@[0-9a-zA-Z]([-_.]?[0-9a-zA-Z])*.[a-zA-Z]{2,3}$/i;
        var positionPattern = /^[가-힣]{2,5}$/;
       
        //(앞/뒤)공백제거
        var userName =  $.trim($("#userName").val());
        var pwd = $.trim($("#pwd").val());
        var pwdConfirm = $.trim($("#pwdConfirm").val());
        var brthy = $.trim($("#brthy").val());
        var moblphone = $.trim($("#moblphon").val());
        var email = $.trim($("#email").val())+"@"+$.trim($("#email2").val());
        var position = $.trim($("#position").val());

        if(userName==""){
        alert("입력");
        $("#userName").focus();
        return false;
        }else if(!namePattern.test(userName)){//test는 패턴에 맞으면 true, 맞지 않으면 false값 return
            alert("이름은 영문소문자로 시작하고~");
            $("#userName").val("").focus();
            return false;
            }
        
        if(pwd==""){
            alert("비밀번호를 입력하세요!");
            $("#pwd").focus();
            return false;
        }else if(!numPattern.test(pwd)){
                alert("비밀번호는 숫자만 가능");
                $("#pwd").val("");
                $("#pwd").focus();
                $("#pwd").select();
                return false;
        }
        if($("#pwd").val() != $("#pwdConfirm").val()) {
            alert("암호가 일치하지 않습니다.");
            $("#pwdConfirm").val("").focus();
            return false;
        }
        if($("input[name=gender]:radio:checked").length<1){
                alert("성별을 선택하세요");
                return false;
        }
      
        return true;
    }

});






