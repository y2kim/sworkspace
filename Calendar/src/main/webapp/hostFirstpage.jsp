<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<script src="https://code.jquery.com/jquery-3.3.1.js"></script>
	<style data-aphrodite="data-aphrodite">
._tleczom {
	cursor: pointer !important;
	display: inline-block !important;
	margin: 0px !important;
	position: relative !important;
	text-align: center !important;
	text-decoration: none !important;
	-webkit-transition-property: background, border-color, color !important;
	-moz-transition-property: background, border-color, color !important;
	transition-property: background, border-color, color !important;
	-webkit-transition-duration: 0.2s !important;
	transition-duration: 0.2s !important;
	-webkit-transition-timing-function: ease-out !important;
	transition-timing-function: ease-out !important;
	width: auto !important;
	border-radius: 4px !important;
	font-size: 14px !important;
	line-height: 18px !important;
	letter-spacing: normal !important;
	font-family: Circular, -apple-system, BlinkMacSystemFont, Roboto,
		Helvetica Neue, sans-serif !important;
	text-transform: undefined !important;
	padding-top: 8px !important;
	padding-bottom: 8px !important;
	font-weight: 600 !important;
	border-width: 1px !important;
	border-style: solid !important;
	padding-left: 16px !important;
	padding-right: 16px !important;
	min-width: 51.77708763999664px !important;
	box-shadow: none !important;
	background: #008489 !important;
	border-color: transparent !important;
	color: #ffffff !important;
}

._tleczom:hover {
	background: #008489 !important;
	border-color: transparent !important;
	color: #ffffff !important;
}

._tleczom:active {
	background: #006a70 !important;
	border-color: transparent !important;
	color: #ffffff !important;
}

._tleczom:disabled {
	background: rgba(0, 132, 137, 0.3) !important;
	border-color: transparent !important;
	color: #ffffff !important;
	cursor: default !important;
}

._tleczom::-moz-focus-inner {
	border: 0px !important;
	padding: 0px !important;
	margin: 0px !important;
}

._tleczom:focus::-moz-focus-inner {
	border: 1px dotted #ffffff !important;
}

._iiprhvv {
	font-size: 14px !important;
	line-height: 18px !important;
	letter-spacing: normal !important;
	font-family: Circular, -apple-system, BlinkMacSystemFont, Roboto,
		Helvetica Neue, sans-serif !important;
	text-transform: undefined !important;
	color: inherit !important;
	padding-top: undefined !important;
	padding-bottom: undefined !important;
}
</style>
<title>Insert title here</title>
</head>
<body>
	<div id="lys-redesign-div">
		<div data-hypernova-key="list_your_spacebundlejs"
			data-hypernova-id="5a448c3f-0c91-45dc-8ea2-aeed82b9889b">
			<div data-reactroot="">
				<div>
					<div class="bg-white">
						<div class="container">
							<div class="container">
								<div
									class="airbnb-header new list-your-space__header list-your-space__header-sm bg-medium show-sm">
									<a href="/" class="link-reset belo-container pull-left"
										aria-label="爱彼迎"><i
										class="icon-pos--lower icon icon-rausch icon-airbnb-alt h2"></i></a>
								</div>
								<div
									class="h5 text-normal lys-navbar__preview-link-container show-sm">
									<div class="lys-navbar__preview-link hide">
										<a class="" href="/rooms/undefined?preview_for_lys"
											target="_blank"><span>미리보기</span></a>
									</div>
								</div>
							</div>
							<div
								class="landing-width bg-white row row-condensed list-your-space__landing-content">
								<span><div
										class="col-md-7 landing__left-col fast-animation">
										<div class="landing__left-col-content">
											<div class="space-5">
												<h2 class="landing__title-title">
													<span>숙소 등록을 시작해볼까요?</span>
												</h2>
											</div>
											<div class="landing__step-content landing__wmpw-controls">
												<strong
													class="landing__step-number space-1 text-base text-branding text-light-gray"><span>1단계</span></strong>
												<div class="h3 landing__step-content-title space-3">
													<span>등록하시려는 숙소 유형은 무엇인가요?</span>
												</div>
												<form data-prevent-default="true">
													<div>
														<div>
															<div class="row row-condensed">
																<div class="col-md-6 col-sm-12 space-1">
																	<div class="select select-block">
																		<select name="room_type"><option selected=""
																				value="entire_home">집 전체</option>
																			<option value="private_room">개인실</option>
																			<option value="shared_room">다인실</option></select>
																	</div>
																</div>
																<div class="col-md-6 col-sm-12 space-1">
																	<div class="select select-block">
																		<select name="person_capacity"><option
																				value="1">최대 1명 숙박 가능</option>
																			<option value="2">최대 2명 숙박 가능</option>
																			<option value="3">최대 3명 숙박 가능</option>
																			<option selected="" value="4">최대 4명 숙박 가능</option>
																			<option value="5">최대 5명 숙박 가능</option>
																			<option value="6">최대 6명 숙박 가능</option>
																			<option value="7">최대 7명 숙박 가능</option>
																			<option value="8">최대 8명 숙박 가능</option>
																			<option value="9">최대 9명 숙박 가능</option>
																			<option value="10">최대 10명 숙박 가능</option>
																			<option value="11">최대 11명 숙박 가능</option>
																			<option value="12">최대 12명 숙박 가능</option>
																			<option value="13">최대 13명 숙박 가능</option>
																			<option value="14">최대 14명 숙박 가능</option>
																			<option value="15">최대 15명 숙박 가능</option>
																			<option value="16">최대 16명 숙박 가능</option></select>
																	</div>
																</div>
															</div>
															<div class="row row-condensed space-1">
																<div class="col-sm-12">
																	<input type="text"
																		class="list-space-location-input pull-left"
																		placeholder="예) 강남구" name="full_address" value="서울" />
																		<!-- placeAPI -->
																</div>
															</div>
														</div>
													</div>
												</form>
												<div style="margin-top: 12px; margin-bottom: 28px">
													<a href="/become-a-host/room" class="_tleczom"
														aria-busy="false"><span class="_iiprhvv"><span>계속</span></span></a>
												</div>
											</div>
											<span></span>
										</div>
									</div></span>
								<div class="col-md-5 landing__right-col">
									<div>
										<div
											class="landing__animation hide-sm lys-vertical-align-middle-container">
											<span><div style="transition-duration: 250ms"
													class="landing__svg-container lys-vertical-align-middle"></div></span>
										</div>
										<div class="landing__more-info-card">
											<div class="hide-sm">
												<span></span>
											</div>
										</div>
									</div>
								</div>
							</div>
						</div>
					</div>
				</div>
			</div>
		</div>
	</div>
</body>
</html>