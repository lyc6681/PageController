<%--
  Created by IntelliJ IDEA.
  User: dllo
  Date: 2017/8/15
  Time: 下午3:53
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>JQTest</title>
    <script src="js/jquery-3.2.1.js" type="text/javascript"></script>
    <script>

//        $(document).ready(function () {

            // 文档加载完毕要执行的内容,相当于windw.onload
//    })
//            $(function () {
//                //和上述两种方式等价
//
//
//            })





    </script>
</head>
<body>

    <div id="div1"></div>
    <div>a</div>
    <div>b</div>
    <div>c</div>
    <div>d</div>
    <div>as</div>
    <div>qe</div>
    <div>89</div>

</body>
<script>

    //html方法.相当于innerHTML
    //当有参数的时候,就是赋值方法
    //没有参数的时候就是取值方法
    //val() text() attr()
    $("#div1").html("aaaa")
    console.log($("#div1").html())

    $("#div1").attr("class","divclass")
    console.log($("#div1").attr("class"))

    // 如果获取一堆标签对象
    $("div").html("啊将收到啦开始就 ")
    $("div").first().html("揍你")
    $("div").last().html("fuck off")
    $("div").eq(1).html("这是几")


</script>
</html>
