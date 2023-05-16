(($)=>{
    $('.tour-csv-btn').on({
        click(e){
            e.preventDefault();

            $.ajax({
                url:'./data/member.csv',
                type:'GET',
                dataType:'TEXT',
                success(res){
                    let arr =[];
                    const result = res.split('\n');
                    $.each(result, function(idx, item){
                        arr[idx] =[];
                        arr[idx][0]= item.split(',')[0];
                        arr[idx][1]= item.split(',')[1];
                        arr[idx][2]= item.split(',')[5];
                        arr[idx][3]= item.split(',')[8];
                        arr[idx][4]= item.split(',')[10];
                        arr[idx][5]= item.split(',')[18];
                        arr[idx][6]= item.split(',')[20];
                        arr[idx][7]= item.split(',')[49];
                    })
                    $('.tbody-tour-csv').empty();
                    for(let i=0; i<arr.length; i++){
                        $('.tbody-tour-csv').append(`<tr data-key="${arr[i][0]}">`);
                        for(let j=0;j<arr[i].length;j++){
                            $('.tbody-tour-csv').append(`<td>${arr[i][j]}</td>`);
                        }   
                        $('.tbody-tour-csv').append(`</tr>`);
                    }
                    let cnt=[0, 0, 0, 0];


                    for(let i=0; i<arr.length; i++){
                        if(arr[i][3]=="휴업"){
                            cnt[0]++;
                        }
                        else if(arr[i][3]=="폐업"){
                            cnt[1]++;
                        }
                        else if(arr[i][3]=="영업/정상"){
                            cnt[2]++;
                        }  
                        else if(arr[i][3]=="취소/말소/만료/정지/중지"){
                            cnt[3]++;
                        }
                    }
                 
                        $('.tbody-tour-csv2').append(`<tr>`);
                        for(let j=0; j<cnt.length; j++){
                            $('.tbody-tour-csv2').append(`<td>${cnt[j]}</td>`);
                        }
                        $('.tbody-tour-csv2').append(`</tr>`);
                },
                error(err){
                    console.log(`AJAX 실패! ${err}`);
                }
            })
        }
    })
})(jQuery);