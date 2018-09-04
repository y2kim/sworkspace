<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<script type="text/javascript" src="http://ajax.googleapis.com/ajax/libs/jquery/1.4/jquery.min.js"></script>
<script src="https://code.jquery.com/jquery-3.3.1.js"></script>
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/fancybox/3.3.5/jquery.fancybox.min.css" />
<script src="https://cdnjs.cloudflare.com/ajax/libs/fancybox/3.3.5/jquery.fancybox.min.js"></script>
<link rel="stylesheet" type="text/css" href="resources/hosting.css">
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<style>
body {
	background: #eee;
	font: normal 11px arial;
}
 kbd{
 	background-color:#eee;
	border:1px solid gray;
	display: inline-block;
	font-size:1.2em;
	line-height: 1.4;
	box-shadow:1px 0 1px 0 #eee, 0 2px 0 2px #ccc, 0 2px 0 3px #444;
	border-radius:3px;
	margin:6px 3px;
	padding:1px 5px;
}

#errormessages {
	font: bold 13px Arial;
	color: #DD3030;
	min-height: 32px;
	padding: 0px 10px;
	text-align: center;
}
#dropzone-wrapper {
	background-color: #fff;
	margin: 10px;
	border: 6px dotted #ddd;
	border-radius: 10px;
	height: 200px;
	width: 200px;
	position: relative;
	cursor: pointer;
	transition: background-color .3s ease-in-out, border-color .3s ease-in-out;
	-webkit-touch-callout: none;
	-webkit-user-select: none;
	-khtml-user-select: none;
	-moz-user-select: none;
	-ms-user-select: none;
	user-select: none;
}

#dropzone-wrapper #dropzone {
	position: absolute;
	top:0;
	left: 0;
	width: 100%;
	height: 100%;

}
#dropzone-wrapper #textbox-wrapper {
	display: table;
	width: 100%;
	height: 100%;
}
#dropzone-wrapper  #textbox-wrapper #textbox {
	display: table-cell;
	text-align: center;
	vertical-align: middle;
}
#dropzone-wrapper  #textbox-wrapper #textbox p {
	transition: all .5s ease-in-out;
	margin: 0 0 10px 0;
	font: bold 20px Arial;
	text-shadow: 0 1px 1px rgba(255, 255, 255, 0.42);
}
#dropzone-wrapper  #textbox-wrapper #textbox p.small {
	color: #777;
	font: bold 12px Arial;
}
/* Replacement for :hover */
.dropzonehover #dropzone-wrapper {                  
	background-color: rgba(220, 109, 10,.2);
	border-color: rgb(220, 109, 10);
}
.dragover #dropzone-wrapper {
	background-color: rgb(155, 247, 155);
	border-color: rgb(0, 109, 10);
}
.dropzonehover #dropzone-wrapper #textbox-wrapper #textbox p.small {
	color: rgb(220, 109, 10);
	font-size: 21px;
}
.dropzonehover #dropzone-wrapper #textbox-wrapper #textbox p.large {
	font-size: 0px;
  transform: scale(0);
}
.dragging #dropzone-wrapper #textbox-wrapper #textbox p.small {
	font-size: 0px;
  transform: scale(0);
}
.dragging #dropzone-wrapper #textbox-wrapper #textbox p.large {
	color: green;
	font-size: 21px;
}
.dragover #dropzone-wrapper #textbox-wrapper #textbox p.small {
	color: red;
}
.dragging #dropzone-wrapper {
	z-index: 99999;
  animation: greenPulse 1.5s infinite;
}

#output canvas {
	margin:5px;
	border: 1px solid #ddd;
	box-shadow: 2px 2px 2px rgba(0,0,0,.5);
}
#overlay {
	background: rgba(0,0,0,0);
	position: fixed;
	left: 0;
	top: 0;
	z-index: -99998;
	width: 100%;
	height: 100%;
	display: none;
}
.dragging #overlay {
	z-index: 99998;
	display: block;
	background: rgba(0,0,0,.5);
}

@keyframes greenPulse {
  from { box-shadow: 0 0 4px #08FF00,0 0 6px #fff; 	border-color: #aaa;}
  50% { box-shadow: 0 0 22px #0FBC09,0 0 30px #fff; 	border-color: #0FBC09;}
  to { box-shadow: 0 0 9px #08FF00,0 0 6px #fff; 	border-color: #aaa;}
}

#helpbutton {
    background: #eee;
    background: linear-gradient(#eee, #e2e2e2);
    border: solid 1px #d0d0d0;
    border-bottom: solid 3px #b2b1b1;
    border-radius: 3px;
    box-shadow: inset 0 0 0 1px #f5f5f5;
    color: #555;
		cursor: pointer;
    display: inline-block;
    font: bold 12px Arial, Helvetica, Clean, sans-serif;
    margin: 0 0 0 25px;
    padding: 10px 20px;
    position: relative;
    text-align: center;
    text-decoration: none;
    text-shadow: 0 1px 0 #fafafa;
}

#helpbutton:hover {
    background: #e4e4e4;
    background: linear-gradient(#e4e4e4, #ededed);
    border: solid 1px #c2c2c2;
    border-bottom: solid 3px #b2b1b1;
    box-shadow: inset 0 0 0 1px #efefef;
}

#helpbutton #helpscreen {
	color: #111;
	text-align:left;
	position: absolute;
	top: -1px;
	left:-1px;
	width: 0px;
	height: 0px;
	padding: 0px;
 	border:1px solid #E8E8E8;
  background: rgb(255,255,136);
	transition: all .2s ease-in-out;
	font: normal 11px arial;
	overflow: hidden;
}
#helpbutton:active #helpscreen,#helpbutton #helpscreen:hover {
	width: 380px;
	height: 280px;
	padding: 10px 15px;
	z-index: 10;
}
.nopaste #helpbutton,.nofilereader #dropzone-wrapper {
	display: none;
}


#output ul {
	max-width: 500px;
	list-style: none;
	margin: 0;
	padding: 0;
}
#output ul li {
	list-style: none;
	margin: 0;
	padding: 0;
}
.list-content {
	display: table;
	table-layout: fixed;
	width: 100%;
	background: #fff;
	border: 1px solid #aaa;
	margin: 5px 0;
}
.list-content span {
	display: table-cell;
	vertical-align: middle;
	padding: 5px 10px;
}
.list-content span.preview {
	width: 55px;
}
.list-content span.type {
	text-align: center;
	width: 60px;
}
.list-content span.name {
 	white-space: nowrap;
	overflow: hidden;
	text-overflow: ellipsis;
}
.list-content span.options {
	width: 30px;
}
.list-content span.options .imagedelete {
	cursor: pointer;
	display: block;
	float: right;
	width: 16px;
	height: 16px;
	padding: 0;
	background-image: url('data:image/png;base64,iVBORw0KGgoAAAANSUhEUgAAACAAAAAQCAYAAAB3AH1ZAAAAGXRFWHRTb2Z0d2FyZQBBZG9iZSBJbWFnZVJlYWR5ccllPAAAAyNJREFUeNrEVGtIU2EYfs7Ojh6nc+Jt5WWmk7w3cKnlDamQLqJIvyv6UQT9CIkiNPwTiIYQQqaFRf2MCCmQCgwKzB+GJEYpXipNzUuunO54tp1L36YbZ8tVrKAX3vN9H9/7vN9z3hslyzL+p6g9m9aecerl4GQzraKyE2Ii0sNYJpahVVpBkiiOd1ptnGN53mKb5BzCu9w0fX3Hmb2C0lGweC+BZ/0jT29dqK5kGGCFByyrPJa+r2NxxQabzRHLO5yxpkxVRkq89nBn98AeAilXEggWr/I4yEuNM+k0wLodsNsF8EQ5uxPcuhM2sjoEERKxi4tiYUrX5/iHMli8NwITM8sjY8vQR6pF8qGRHBUOIVEDSYyGKFNYIw7nljlMza9geGJh2J9AsHgvgeI8Q8W8VUTn23WoJCcoyQ7JwcO6asWKdQ2zixbMflnAqSP52Je/o8KfQLB4ldJJaQoNcxKNjG0sEnU0QtQUzEY9puaWUFVmBs9ZUVNuCljRgfAz81+9+KMVpq27wCUiSZJAlKXJnqERFqJGlDYUrlZl2VBiQUEguQwk/vjjRbEoMYaj/mA1Xk/bkR99CMXJKuhkw9YEiH+3yG6V3Q975sQfzQsFvjJDg93JLCa7mgFJQsHpehQYMjHW1oCI+ATAcPYAMev1JfC3M0mBdz3+4fZVfLzTsvGn4VoItlVM37/hPnNTE+ezLl3zI/APxZUOSs14z+Ptjb7BomkpYAqCFgV+cIZH4Yk6MFodRlsvuihtlj2DgptPoMsx9/9MwJ3rDd3yr0Txt1ny4DXMBhu7ZdE3N+RS4Fa9dH3aMIxELEajQnwEBae4UdESWV0TzUmqPz01FbqwwFnz4BN1FHK3h5KCu7xZA5KCgIA352pdd1d8CAx9+ma83j2MmrxQlKaxyDeEo8gYiaSYEHTUVaGYtNODxlq8GHiP3qHPO/0fV+KLUljYBRmaZKP3vrDrOcztPZsnGvzCTJM7DMr2Otb2qjgnSfvqVyHuH10qe9ywv2+rOyW+JEuPsmw9Zh/dg0zaMKn2JPpGFhDysGWA5Sy9u5ruNrjsfggwANaIwN5Hg9AjAAAAAElFTkSuQmCC');
	background-position: 0px 0px;
}
.list-content span.options .imagedelete:hover {
	background-position: -16px 0px;
}

#output .removed-item {
    animation: removed-item-animation .6s cubic-bezier(.55,-0.04,.91,.94) forwards;
}

#output .new-item {
	opacity: 0;
    animation: openspace .6s ease forwards, new-item-animation .3s .3s cubic-bezier(0,.8,.32,1.07) forwards;
}

@keyframes openspace {
    to {height:auto;}
}
@keyframes removed-item-animation {
    from {opacity: 1;transform: scale(1);}
    to {opacity: 0;transform: scale(0);}
}
@keyframes new-item-animation {
    from {opacity: 0;transform: scale(0);}
    to {opacity: 1;transform: scale(1);}
}
</style>
</head>
<body>
<div style="float: left;width:240px;">
	<div id="dropzone-wrapper">
		<div id="textbox-wrapper"><div id=textbox></div></div>
		<div id="dropzone"></div>
	</div>
	<div id="errormessages"><span style="display: none;"></span></div>

	<div id="overlay"></div>

	<div id="helpbutton">
		<span>Paste Help</span>
		<div id="helpscreen">
			<p><strong>PC:</strong> Capture screen to clipboard: <kbd>PrtScr</kbd></p>
			<p><strong>PC:</strong> Insert screenshot: <kbd>Ctrl</kbd> + <kbd>V</kbd></p>
			<hr />
			<!--<p>Capture screen to clipboard <kbd>Command</kbd> + <kbd>Shift</kbd> + <kbd>Control</kbd> + <kbd>3</kbd></p>-->
			<p><strong>Mac:</strong> Capture screen to clipboard: <kbd>&#8984;</kbd> + <kbd>&#8679;</kbd> + <kbd>&#8963;</kbd> + <kbd>3</kbd></p>
			<p><strong>Mac:</strong> Insert screenshot: <kbd>&#8984;</kbd> + <kbd>V</kbd></p>
			<hr />
			<p><strong>iPhone/iPad:</strong> Capture screen to Camera Roll:  <em>Press/Hold <strong>Home + Power</strong></em></p>
			<hr />
			<p><strong>Android:</strong> Capture screen to Camera Gallery:  <em>Press/Hold <strong>Volume + Power</strong></em></p>
		</div>
	</div>

</div>
<div style="float: left;">
	<br /><br />
	<h3>Preview:</h3>
	<div id="output"><ul></ul></div>
</div>
<div style="clear:both;"></div>
<p style="font-size: 14px">I also wrote a similar plugin in Vanilla JavaScript (No extra libraries required) - <strong><a href="https://codepen.io/pmk/pen/ZXOMYJ" target="_top" title="Fullscreen Drag'n'Drop Image Upload">Fullscreen Drag'n'Drop Image Upload</a></strong></p>
<script type="text/javascript">
/*
jQuery Image upload
Images can be uploaded using:
* File requester (Double click on box)
* Drag&Drop (Drag and drop image on box)
* Pasting. (Copy an image or make a screenshot, then activate the page and paste in the image.)
Works in Mozilla, Webkit & IE.
*/

(function($) {
	$.fn.imageUpload = function(options) {
		var settings = $.extend(
			{
				outputHandler: function() {}, // Callback function for processing output. Parameter is image source in base64 format
				onBeforeUpload: function() {}, // Callback function called before upload processing
				onAfterUpload: function() {}, // Callback function called after upload processing
				errorMsg: "Error: The file you just uploaded is not an image!",
				trigger: "click", // possible values: "click", "dblclick" or null
				errorContainer: null, // Container for error message
				enableCliboardCapture: true, // Enable clipboard capturing
				enableDebug: true // enable debugging output in console
			},
			options
		);

		var $this = $(this),
			dragging = false,
			pasting = false;

		var $uploadField = $(
			'<input type="file" style="display:none" name="fileselect[]" multiple="multiple" accept="image/*, .gif, .png, .jpg" />'
		);

		// Create capture area for Mozilla & IE
		var $contentEditable = $(
			'<div contenteditable="true" style="position:absolute;overflow:hidden;top:-20px;width:0;height:0;" />'
		);

		// Get file type from image data uri.
		var getFileExtension = function(imgSrc) {
			return imgSrc.replace(/data:image\/([^;]*).*/gi, ".$1");
		};

		// Get mime type from data uri.
		var getFileType = function(imgSrc) {
			return imgSrc.replace(/data:([^;]*).*/gi, "$1");
		};

		// Error display
		var errorHandler = function(error) {
			if (error && settings.errorContainer !== null) {
				settings.errorContainer.html(settings.errorMsg).fadeIn(1000, function() {
					$(this)
						.delay(5000)
						.fadeOut(1000);
				});
			}
		};

		var readFile = function(file) {
			var reader = new FileReader();
			$(reader).on("load", file, function(e) {
				var returnValue = {
					name: e.data.name
						? e.data.name
						: "CB_Image_" + +new Date() + getFileExtension(e.target.result),
					type: e.data.type ? e.data.type : getFileType(e.target.result),
					size: e.data.size ? e.data.size : "n/a",
					imgSrc: e.target.result
				};
				// Execute outputHandler callback function if available
				$.isFunction(settings.outputHandler) &&
					settings.outputHandler.call(this, returnValue);
				// Execute onAfterUpload callback function if available
				$.isFunction(settings.onAfterUpload) && settings.onAfterUpload.call(this);
			});
			reader.readAsDataURL(file);
		};

		// Upload processing
		var processUpload = function(files, originalEvent) {
			var error = false,
				imageFound = false,
				count = 0;
			if (files !== null) {
				for (var i = 0; i < files.length; i++) {
					if (files[i].type.indexOf("image") == -1) {
						//not image
						error = true;
						continue;
					}
					if (count == settings.maxUpload) break; // Max reached
					count++;
					imageFound = true;

					// Webkit clipboard data needs data converted through getAsFile()
					var blob =
						typeof originalEvent !== "undefined" && !originalEvent.msConvertURL
							? files[i].getAsFile()
							: files[i];

					readFile(blob);
				}
				if (!imageFound) {
					// Execute onAfterUpload callback function if available
					$.isFunction(settings.onAfterUpload) && settings.onAfterUpload.call(this);
				}
				errorHandler(error);
			}
		};

		// Alternate clipboard capturing function for Mozilla
		var mozillaCaptureFunc = function() {
			pasting = false;
			var img = $contentEditable.find("img"),
				error = true;
			if (img.length) {
				error = false;
				var returnValue = {
					name: "CB_Image_" + +new Date() + getFileExtension(img[0].src),
					type: getFileType(img[0].src),
					size: "n/a",
					imgSrc: img[0].src
				};
				// Execute outputHandler callback function if available
				$.isFunction(settings.outputHandler) &&
					settings.outputHandler.call(this, returnValue);
			}
			// Remove "input" event handler and clear capture area
			$contentEditable.off("input", mozillaCaptureFunc).text("");
			errorHandler(error);
			// Execute onAfterUpload callback function if available
			$.isFunction(settings.onAfterUpload) && settings.onAfterUpload.call(this);
		};

		// Paste handler
		var pasteHandlerFunc = function(e) {
			// Remove existing Mozilla "input" event handler
			$contentEditable.off("input", mozillaCaptureFunc);

			// Execute onBeforeUpload callback function if available
			$.isFunction(settings.onBeforeUpload) && settings.onBeforeUpload.call(this);

			var clipboardData = e.originalEvent.clipboardData || window.clipboardData;
			if (clipboardData === false || clipboardData === undefined) {
				// empty
				// Execute onAfterUpload callback function if available
				$.isFunction(settings.onAfterUpload) && settings.onAfterUpload.call(this);
				pasting = false;
				return false;
			}

			var files = clipboardData.items || clipboardData.files;

			// No Items or files, so either nothing in clipboard or Mozilla browser
			if (files.length === 0) {
				// Enable "input" event handler for Mozilla, and set focus
				$contentEditable.on("input", mozillaCaptureFunc).focus();
			} else {
				pasting = false;
				processUpload(files, e.originalEvent);
				e.preventDefault();
			}
		};

		// Alternate triggering metod for clipboard capturing, required for IE & Mozilla
		var keydownHandlerFunc = function(e) {
			if (!pasting && (e.ctrlKey || e.metaKey) && e.which == 86) {
				pasting = true;
				$contentEditable.focus();
			}
		};

		// Alternative to css :hover, adding class "dropzonehover" to body tag.
		var mouseenterHandlerFunc = function(e) {
			e.preventDefault();
			if (!$("body").hasClass("dragging")) $("body").addClass("dropzonehover");
		};
		var mouseleaveHandlerFunc = function(e) {
			e.preventDefault();
			$("body").removeClass("dropzonehover");
		};

		// Submit handler to trigger hidden 'input type="file"' upload field
		var submitFunc = function(e) {
			e.preventDefault();
			$uploadField.trigger("click");
		};
		// File upload handler
		var uploadFunc = function(e) {
			e.preventDefault();
			processUpload(e.target.files);
		};
		// "drop" handler
		var dropHandlerFunc = function(e) {
			e.preventDefault();
			$("body").removeClass("dragging dragover");
			dragging = false;
			processUpload(e.originalEvent.dataTransfer.files);
		};
		// General handler for preventing propragation and default action
		var preventHandlerFunc = function(e) {
			e.preventDefault();
			e.stopPropagation();
		};
		// Dragover handler for preventing propragation and default action
		var preventDragoverHandlerFunc = function(e) {
			e.preventDefault();
			e.stopPropagation();
			e.originalEvent.dataTransfer.dropEffect = "none";
			try {
				// IE won't allow setting of effectAllowed
				e.originalEvent.dataTransfer.effectAllowed = "none";
			} catch (err) {}
		};
		// "dragover" handler
		var dragoverHandlerFunc = function(e) {
			e.preventDefault();
			e.stopPropagation();
			e.originalEvent.dataTransfer.dropEffect = "copy";
			try {
				// IE won't allow setting of effectAllowed
				e.originalEvent.dataTransfer.effectAllowed = "copyMove";
			} catch (err) {}
		};
		// "dragenter" handler, adding class "dragover" to body tag.
		var dragenterHandlerFunc = function(e) {
			e.preventDefault();
			$("body").addClass("dragover");
		};
		// "dragleave" handler, removing class "dragover" from body tag.
		var dragleaveHandlerFunc = function(e) {
			e.preventDefault();
			$("body").removeClass("dragover");
		};

		// Pseudo "dragstart" handler, adding class "dragging" to body tag.
		var dragstartHandlerFunc = function(e) {
			e.preventDefault();
			e.stopPropagation();
			if (!$("body").hasClass("dragging") && !dragging) {
				$("body").addClass("dragging");
				dragging = true;
			}
		};
		// Pseudo "dragend" handler, removing class "dragging" from body tag.
		var dragendHandlerFunc = function(e) {
			e.preventDefault();
			e.stopPropagation();
			if ($("body").hasClass("dragging") && dragging) {
				$("body").removeClass("dragging");
				dragging = false;
			}
		};

		// Enable clipboard capturing
		if (settings.enableCliboardCapture) {
			$contentEditable.appendTo("body").focus();
			$(window).on({
				keydown: keydownHandlerFunc, // IE & Mozilla
				paste: pasteHandlerFunc
			});
		}

		// Enable file requester upload
		if (settings.trigger !== null) {
			$uploadField
				.on("change", uploadFunc)
				.appendTo("body")
				.blur();
			$this.on(settings.trigger, submitFunc);
		}
		// Enable drag and drop upload
		$this.on({
			dragenter: dragenterHandlerFunc,
			dragleave: dragleaveHandlerFunc,
			dragover: dragoverHandlerFunc,
			drop: dropHandlerFunc,
			mouseenter: mouseenterHandlerFunc,
			mouseleave: mouseleaveHandlerFunc
		});
		// Prevent dropping outside droparea
		// Since dragstart and dragend is not triggered when dragging local files,
		// the "html" tag is used as fake "triggers" (Using "body" tag has problems)
		$("html").on({
			dragbetterenter: dragstartHandlerFunc,
			dragbetterleave: dragendHandlerFunc,
			dragover: preventDragoverHandlerFunc,
			drag: preventHandlerFunc,
			drop: preventHandlerFunc
		});
		// chainable
		return this;
	};
})(jQuery);

jQuery(document).ready(function($) {
	// Shared callback handler for processing output
	var outputHandlerFunc = function(imgObj) {
		var sizeInKB = function(bytes) {
			return typeof bytes == "number" ? (bytes / 1024).toFixed(2) + "Kb" : bytes;
		};

		var getThumbnail = function(original, maxWidth, maxHeight, upscale) {
			var canvas = document.createElement("canvas"),
				width,
				height;
			if (
				original.width < maxWidth &&
				original.height < maxHeight &&
				upscale == undefined
			) {
				width = original.width;
				height = original.height;
			} else {
				width = maxWidth;
				height = parseInt(original.height * (maxWidth / original.width));
				if (height > maxHeight) {
					height = maxHeight;
					width = parseInt(original.width * (maxHeight / original.height));
				}
			}
			canvas.width = width;
			canvas.height = height;
			canvas.getContext("2d").drawImage(original, 0, 0, width, height);
			$(canvas).attr(
				"title",
				"Original size: " + original.width + "x" + original.height
			);
			return canvas;
		};

		$(new Image())
			.on("load", function(e) {
				console.log("imgobj", e);
				var $wrapper = $(
					'<li class="new-item"><div class="list-content"><span class="preview"></span><span class="type">' +
						imgObj.type +
						"<br>" +
						(e.target.width + "&times;" + e.target.height) +
						"<br>" +
						sizeInKB(imgObj.size) +
						'</span><span class="name">' +
						imgObj.name +
						'</span><span class="options"><span class="imagedelete" title="Remove image"></span></span></div></li>'
				).appendTo("#output ul");
				$(".imagedelete", $wrapper).one("click", function(e) {
					$wrapper.toggleClass("new-item").addClass("removed-item");
					$wrapper.one(
						"animationend webkitAnimationEnd MSAnimationEnd oAnimationEnd",
						function(e) {
							$wrapper.remove();
						}
					);
				});

				var thumb = getThumbnail(e.target, 50, 50);
				var $link = $('<a rel="fancybox">')
					.attr({
						target: "_blank",
						href: imgObj.imgSrc
					})
					.append(thumb)
					.appendTo($(".preview", $wrapper));
			})
			.attr("src", imgObj.imgSrc);
	};

	$("a[rel=fancybox]").fancybox();

	var fileReaderAvailable = typeof FileReader !== "undefined";
	var clipBoardAvailable = window.clipboardData !== false;
	var pasteAvailable = Boolean(
		clipBoardAvailable & fileReaderAvailable & !eval("/*@cc_on !@*/false")
	);

	if (fileReaderAvailable) {
		// Enable drop area upload
		$("#dropzone").imageUpload({
			errorContainer: $("span", "#errormessages"),
			trigger: "click",
			enableCliboardCapture: pasteAvailable,
			onBeforeUpload: function() {
				$("body").css("background-color", "green");
				console.log("start", Date.now());
			},
			onAfterUpload: function() {
				$("body").css("background-color", "#eee");
				console.log("end", Date.now());
			},
			outputHandler: outputHandlerFunc
		});

		$("#dropzone")
			.prev("#textbox-wrapper")
			.find("#textbox")
			.append(
				'<p class="large">Drag and Drop<br>Image File here</p><p class="small">Doubleclick<br>for file requester</p>'
			);
	} else {
		$("body").addClass("nofilereader");
	}

	if (!pasteAvailable) {
		$("body").addClass("nopaste");
	}
});

</script>
</body>
</html>