<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<script src="https://code.jquery.com/jquery-3.3.1.js"></script>
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css" />
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap-theme.min.css" />
 
<link rel="stylesheet" type="text/css" href="resources/hosting.css">

<style>
#datepickle{
	width: 595px;
	height: 525px;
	font-size: 3.2em;
}
.datepick{
	width: 595px;
	height: 525px;
}
.datepick-nav{
	width: 600px;
}

.datepick-month{
	width: 600px;
}
</style>
<title>Insert title here</title>
</head>
<body>
	<div data-hypernova-key="list_your_spacebundlejs"
		data-hypernova-id="c0c21335-cc24-414e-a2eb-10aa2ce89777">
		<div dir="ltr" data-reactroot="">
			<div>
				<div>
					<div class="bg-white list-your-space__progress">
						<div class="list-your-space__header">
							<div class="airbnb-header new">
								<div class="regular-header clearfix">
									<div class="comp pull-left">
										<button type="button" class="_1fyyfke9" aria-busy="false">
											<div class="_1u7z0lk">
												<i class="hide-sm icon icon-airbnb"></i>
											</div>
										</button>
									</div>
									<div
										class="comp comp__step-bar-wrapper no-hover pull-left hide-sm">
										<span class="hdr-btn"><span
											class="hide-sm h5 text-normal" tabindex="-1"><span>3단계:</span>
										</span><span class="h5 text-normal">게스트를 맞이할 준비를 하세요</span></span>
									</div>
									<div
										class="lys-navbar__save-and-exit comp pull-right h5 text-normal bg-white">
										<span><span class="hide-md hide-lg"><a href="#"
												class="lys-navbar__save-and-exit-link hdr-btn"
												data-prevent-default="true"><span>닫기</span></a></span><span
											class="hide-sm"><a href="#"
												class="lys-navbar__save-and-exit-link hdr-btn"
												data-prevent-default="true"><span>저장 후 나가기</span></a></span></span>
									</div>
								</div>
							</div>
							<div>
								<div class="progress-bar__container">
									<div>
										<span><div
												class="progress-section progress__bar-section progress-section--first progress-section--completed"
												style="width: 9.090909090909092%; left: 0%; max-width: 100%"></div>
											<div
												class="progress-section progress__bar-section progress-section--completed"
												style="width: 9.090909090909092%; left: 9.090909090909092%; max-width: 90.9090909090909%"></div>
											<div
												class="progress-section progress__bar-section progress-section--completed"
												style="width: 9.090909090909092%; left: 18.181818181818183%; max-width: 81.81818181818181%"></div>
											<div
												class="progress-section progress__bar-section progress-section--completed"
												style="width: 9.090909090909092%; left: 27.272727272727273%; max-width: 72.72727272727272%"></div>
											<div
												class="progress-section progress__bar-section progress-section--completed"
												style="width: 9.090909090909092%; left: 36.36363636363637%; max-width: 63.63636363636363%"></div>
											<div
												class="progress-section progress__bar-section progress-section--completed"
												style="width: 9.090909090909092%; left: 45.45454545454546%; max-width: 54.54545454545454%"></div>
											<div
												class="progress-section progress__bar-section progress-section--completed"
												style="width: 9.090909090909092%; left: 54.54545454545455%; max-width: 45.45454545454545%"></div>
											<div
												class="progress-section progress__bar-section progress-section--completed"
												style="width: 9.090909090909092%; left: 63.63636363636364%; max-width: 36.36363636363636%"></div>
											<div
												class="progress-section progress__bar-section progress-section--completed"
												style="width: 9.090909090909092%; left: 72.72727272727273%; max-width: 27.272727272727266%"></div>
											<div
												class="progress-section progress__bar-section progress-section--completed"
												style="width: 9.090909090909092%; left: 81.81818181818183%; max-width: 18.181818181818173%"></div>
											<div
												class="progress-section progress__bar-section progress-section--completed"
												style="width: 9.090909090909092%; left: 90.90909090909092%; max-width: 9.09090909090908%"></div></span>
									</div>
								</div>
							</div>
						</div>
						<div class="full-backdrop"></div>
						<div class="list-your-space__content">
							<div class="centered-content clearfix">
								<div
									class="main-panel-container no-padding-h bg-white col-sm-12 no-padding-h">
									<form action="gostep3five.host" id="homeblcok" method="post">
									<!-- 달력 -->
									<div id="datepicker"></div>
									<input type="text" name="home_blocked_date" value="" id="pickdate" style="width: 500px">
									</form>
									<div cl	ass="main-panel__actions-wrapper">
										<div class="centered-content clearfix">
											<div class="bg-white col-sm-12 no-padding-h shadowed">
												<div
													class="no-margin-padding__sm main-panel-padding main-panel-progress col-sm-12 main-panel-inner-full space-sm-8">
													<div class="divider hide-sm"></div>
													<div class="row no-margin-padding__sm">
														<div
															class="main-panel__actions col-sm-12 no-margin-padding__sm">
															<div class="_1dcqn1vg"
																style="margin-top: 16px; margin-bottom: 16px; margin-left: 16px; margin-right: 16px">
																<a href="/become-a-host/27770089/availability-settings"
																	class="_5rte3y6" aria-busy="false"><span
																	class="_cgr7tc7"><span>뒤로</span></span></a>
																<div class="_107ja4p">
																	<button type="button" class="_5rte3y6" aria-busy="false" id="nextpg"
																				data-veloute="lys-next-button">
																				<span class="_cgr7tc7"><span>다음</span></span>
																	</button>
																</div>
															</div>
														</div>
													</div>
												</div>
											</div>
										</div>
									</div>
									<div class="waypoint-container">
										<span style="font-size: 0"></span>
									</div>
								</div>
							</div>
						</div>
						<div></div>
					</div>
				</div>
			</div>
		</div>
	</div>
	<script>
	var today = new Date();
	$('#mdp-demo').multiDatesPicker({
		
	});
	
		$("#nextpg").click(function() {
			//$(location).attr("href","step2third.host");
			$("#homeblcok").submit();
		});
	 
	</script>
	
</body>
</html>