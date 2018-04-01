<!DOCTYPE html>
<html>
<head>
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
<!-- 합쳐지고 최소화된 최신 CSS -->
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.2/css/bootstrap.min.css">
<!-- 부가적인 테마 -->
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.2/css/bootstrap-theme.min.css">
<!-- 합쳐지고 최소화된 최신 자바스크립트 -->

<!--  chart.css -->
<link rel="stylesheet" href="https://cdn.rawgit.com/theus/chart.css/v1.0.0/dist/chart.css" />

<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.2/js/bootstrap.min.js"></script>
<meta charset="UTF-8">
<title>GUIDE</title>

<style>
.classname {
	resize: none
}

textarea {
	width: 460px;
	height: 450px;
}

</style>
</head>
<body>

<div style="position: fixed; top:3%; left:15%;vertical-align:middle;">
<center>
	<!-- buttons -->
	<table width="1200px">
		<tr align=center>
			<td>
		
			<H2>XML <=> JSON CONVERT</H2>
				<br>
			</td>
		</tr>
	</table>



	<table width="1200px" style="position: fixed; left:15%;">
		<tr align=center>
			<td>
				<button id="id-xml-to-json" type="button" style="width:485px;"
					class="btn btn-info btn-block">XML TO JSON</button>
			</td>
						
			<td>
				<button id="id-json-to-xml" type="button" style="width:485px;"
					class="btn btn-danger btn-block">JSON TO XML</button>
			</td>
		</tr>
	</table>

	<br><br>
</center>
	<table width="1200px" >
	<tr>

	<td>
				<!-- output -->

				<div id="xml-to-json" style="">
			
					<center>
					<label>
					<textarea id="input-xml" class="classname"></textarea><BR>
					<button type="button" class="btn btn-success btn-lg btn-block">XML FORM</button>

					</label>
			
			
					<button type="button" id="convert-xml-to-json" class="btn btn-default"><b>▶ CONVERT ▶</b></button>
		
				

					<label>
					<textarea id="output-xml-to-json" class="classname"></textarea><BR>
					<button type="button" class="btn btn-success btn-lg btn-block">JSON FORM</button>
					</label>
				
					</center>
					
				</div>

				<div id="json-to-xml" style="display: none;">
				<center>
					<label>
					<textarea id="input-json" class="classname"></textarea>
					<button type="button" class="btn btn-danger btn-lg btn-block">JSON FORM</button>
					</label>
					<button type="button" id="convert-json-to-xml" class="btn btn-default"><b>▶ CONVERT ▶</b></button>
					<label>
					<textarea id="output-json-to-xml" class="classname"></textarea>
					<button type="button" class="btn btn-danger btn-lg btn-block" >XML FORM</button>
					</label>
				</center>
				</div>

	
	</td>

	</tr>

	</table>
	
	<div id="show_st" style="display:block;">
	<table width="1065px" height="120px" border=0 align=center>
	<tr height="50px"><td>
	
	<button type="button" id="resetbtn" class="btn btn-default">통계 리셋</button>	
	<p class="result" style="display:none;"></p>
	
	</td></tr>
	<tr height="70px">
	<td style="vertical-align:top;">
	
	<button type="button" id="statics" class="btn btn-default">통계 확인</button>
	<p class="r_stat" style="display:none;">
		</p>
	<div class="charts" style="display:none;">
  	 <span><font size="5">성공</font></span><div id="xtoj_ss" class="charts__chart chart--blue hart--hover chart--xl" data-percent="100%" style="width: 90%"></div><!-- /.charts__chart -->
  	 <span><font size="5">실패</font></span><div id="xtoj_ee" class="charts__chart chart--red hart--hover chart--xl" data-percent="100%" style="width: 90%"></div><!-- /.charts__chart -->
	</div>
	</td>
	</tr>
	</table>
	</div>


	
	<div id="show2_st" style="display:none;">
	<table width="1065px" height="120px" border=0 align=center>
	<tr height="50px"><td>
	
	<button type="button" id="resetbtn2" class="btn btn-default">통계 리셋</button>	
	<p class="result2" style="display:none;"></p>
	
	</td></tr>
	<tr height="70px">
	<td style="vertical-align:top;">
	
	<button type="button" id="statics2" class="btn btn-default">통계 확인</button>
	<p class="r_stat2" style="display:none;"></p>
	
	<div class="charts2" style="display:none;">
  	 <span><font size="5">성공</font></span><div id="jtox_ss" class="charts__chart chart--blue hart--hover chart--xl" data-percent="100%" style="width: 90%"></div>
  	 <span><font size="5">실패</font></span><div id="jtox_ee" class="charts__chart chart--red hart--hover chart--xl" data-percent="100%" style="width: 90%"></div>
	</div>

	</td>
	</tr>	
	</table>
	</div>

</body>


<script>
var s_cnt = Number(localStorage.getItem('s_cnt'));// xml => json
var e_cnt = Number(localStorage.getItem('e_cnt'));

var j_to_x_scnt = Number(localStorage.getItem('j_to_x_scnt'));// json=> xml
var j_to_x_ecnt = Number(localStorage.getItem('j_to_x_ecnt'));

var total,spercent,ss,epercent, ee;
var total2,spercent2,ss2,epercent2, ee2;

//XML TO JSON 성공시 막대그래프 값 변경
function success_xtoj_p(){
	total = s_cnt+ e_cnt;
	spercent = s_cnt / total * 100;
	ss= spercent.toFixed(2)+"%";//소수점 2자리수 이하 반올림
	if(ss == 'NaN%'){
		ss= "0%";
	}
	epercent = e_cnt / total * 100;
	ee= epercent.toFixed(2)+"%";
	if(ee == 'NaN%'){
		ee= "0%";
	}
	
	$("#xtoj_ss").css('width',ss);	
	$("#xtoj_ss").attr('data-percent', ss);
	
	$("#xtoj_ee").css('width',ee);	
	$("#xtoj_ee").attr('data-percent', ee);
}
$("#resetbtn").click(function() {
	localStorage.setItem('s_cnt', 0);
	localStorage.setItem('e_cnt', 0);
	s_cnt=0;
	e_cnt=0;
	//localStorage.clear();
	$("#xtoj_ss").css('width',"0%");	
	$("#xtoj_ss").attr('data-percent', "0%");
	
	$("#xtoj_ee").css('width',"0%");	
	$("#xtoj_ee").attr('data-percent', "0%");
	$(".r_stat").text("XML => JSON 성공 : "+ s_cnt+" 실패 : "+e_cnt);

});
$("#statics").click(function() {


	if($(".r_stat").css("display") == "none"){
		success_xtoj_p();
		$(".r_stat").text("XML => JSON 성공 : "+ s_cnt+" 실패 : "+ e_cnt);
		$(".charts").show();
		$(".r_stat").show(); 
	}else{
		$(".r_stat").css("display", "none");
		$(".charts").css("display", "none");
	}
	
});


//JSON TO XML 성공시 막대그래프 값 변경----------------------------------------------------------------

function success_jtox_p(){
	j_to_x_total = j_to_x_scnt+ j_to_x_ecnt;
	spercent2 = j_to_x_scnt / j_to_x_total * 100;
	ss2= spercent2.toFixed(2)+"%";//소수점 2자리수 이하 반올림
	if(ss2 == 'NaN%'){
		ss2= "0%";
	}
	epercent2 = j_to_x_ecnt / j_to_x_total * 100;
	ee2= epercent2.toFixed(2)+"%";
	if(ee2 == 'NaN%'){
		ee2= "0%";
	}
	
	$("#jtox_ss").css('width',ss2);	
	$("#jtox_ss").attr('data-percent', ss2);
	
	$("#jtox_ee").css('width',ee2);	
	$("#jtox_ee").attr('data-percent', ee2);
}
$("#resetbtn2").click(function() {
	localStorage.setItem('j_to_x_scnt', 0);
	localStorage.setItem('j_to_x_ecnt', 0);
	j_to_x_scnt=0;
	j_to_x_ecnt=0;
	//localStorage.clear();
	$("#jtox_ss").css('width',"0%");	
	$("#jtox_ss").attr('data-percent', "0%");
	
	$("#jtox_ee").css('width',"0%");	
	$("#jtox_ee").attr('data-percent', "0%");
	$(".r_stat2").text("JSON => XML 성공 : "+ j_to_x_scnt+" 실패 : "+ j_to_x_ecnt);

});
$("#statics2").click(function() {


	if($(".r_stat2").css("display") == "none"){
		success_jtox_p()
		$(".r_stat2").text("JSON => XML 성공 : "+ j_to_x_scnt+" 실패 : "+ j_to_x_ecnt);
		$(".charts2").show();
		$(".r_stat2").show(); 
	}else{
		$(".r_stat2").css("display", "none");
		$(".charts2").css("display", "none");
	}
	
});



	$("#id-xml-to-json").on("click", function() {
		$("#output-xml-to-json").empty();
		$("#xml-to-json").show();
		$("#json-to-xml").hide();
		$("#x_to_j_count").show();
		$("#show_st").show();//x_to_j통계
		$("#show2_st").hide();//j_to_x통계
	});

	$("#id-json-to-xml").on("click", function() {
		$("#xml-to-json").hide();
		$("#output-json-to-xml").empty();
		$("#json-to-xml").show();
		
		$("#show2_st").css("display", "block");//j_to_x통계
		$("#show_st").hide();//x_to_j통계 숨김
		
	
	});

	var url = "http://192.168.23.122:8080/";
	

	var xml2json = function(_data) {

		$.ajax({
			type : "POST",
			url : url + "xml2json",
			data : _data,
			contentType : "application/xml",
			cache : false,
			success : function(data) {
				s_cnt++;
				localStorage.setItem('s_cnt', s_cnt);
				$(".r_stat").text("XML => JSON 성공 : "+ s_cnt+" 실패 : "+ e_cnt);
				success_xtoj_p();
				
				var tempjson = JSON.stringify(data, null).substring(8, JSON.stringify(data, null).length-1);
				//alert(tempjson);
				var aaa=JSON.parse(tempjson);
				//alert(JSON.stringify(aaa, null, 4));

				//var test = tempjson.substring(13,tempjson.length-1);
				//var result = test+"}";
				
				$("#output-xml-to-json").val(JSON.stringify(aaa, null, 4)).css("color","blue");
				
	
			},
			error : function() {
				e_cnt++;
				localStorage.setItem('e_cnt', e_cnt);
				success_xtoj_p();
				$(".r_stat").text("XML => JSON 성공 : "+ s_cnt+" 실패 : "+ e_cnt);
				//$("#output-xml-to-json").css("color","red");
				$("#output-xml-to-json").val("XML 형식에 맞지 않습니다.").css("color","red");


			}
		});
	}

	var json2xml = function(_data) {
		//var xmlform = "<? xml version=\"1.0\" encoding=\"utf-8\" ?>\n";
		$.ajax({
			type : "POST",
			url : url + "json2xml",
			data : _data,
			contentType : "application/json",
			cache : false,
			success : function(data) {
				j_to_x_scnt++;
				localStorage.setItem('j_to_x_scnt', j_to_x_scnt);
				var xmlText = new XMLSerializer().serializeToString(data);

				var xmlPrint = xmlText.substring(6, xmlText.lastIndexOf("</root>"));
				xmlPrint = "<?xml version='1.0' encoding='utf-8'?>\n"+ xmlPrint;			
				//var print = xmlform + xmlText
				success_jtox_p();
				$("#output-json-to-xml").val(xmlPrint).css("color","blue");				
				$(".r_stat2").text("JSON => XML 성공 : "+ j_to_x_scnt+" 실패 : "+ j_to_x_ecnt);
				
			},
			error : function() {
				j_to_x_ecnt++;
				localStorage.setItem('j_to_x_ecnt', j_to_x_ecnt);
				success_jtox_p();
				$("#output-json-to-xml").val("JSON 형식에 맞지 않습니다.").css("color","red");
				$(".r_stat2").text("JSON => XML 성공 : "+ j_to_x_scnt+" 실패 : "+ j_to_x_ecnt);
				
			}
		});
	}

	$("#convert-xml-to-json").on("click", function() {
		var data = $("#input-xml").val();
		 $('.result').text('');
//		if (!data) {
//			data = "<data></data>"
//		}
		xml2json(data);
	});

	$("#convert-json-to-xml").on("click", function() {
		var data = $("#input-json").val();
		
		json2xml(data);
	});
</script>

</html>