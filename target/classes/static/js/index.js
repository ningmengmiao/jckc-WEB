var navTop;
window.onload=function(){

     navTop=   $('#nav')[0].offsetTop;


    $('#nav').on('click',function(e){
        console.log(e.target.id)
        var news1 = $("#news1")
        var target = e.target;
        var id = $(target).data("to");
        $('html,body').animate({scrollTop:$('#'+id).offsetTop}, 1);
    });
}
window.addEventListener('scroll', function () {


    let t = $('body, html').scrollTop();   // 目前监听的是整个body的滚动条距离
    let n = $('#nav').outerHeight();
    if (t > navTop) {
        $('#nav').addClass('nav-main-ad');
        $('#news1').css({"margin-top":n+24})

    } else {
        $('#nav').removeClass('nav-main-ad')
        $('#news1').css({"margin-top":8})
    }
});


