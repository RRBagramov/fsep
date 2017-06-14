<!DOCTYPE html>

<html lang="en">
<head>
    <meta charset="UTF-8">
    <link href="http://vjs.zencdn.net/4.6.1/video-js.css" rel="stylesheet">
    <script src="http://code.jquery.com/jquery-2.0.3.min.js"></script>
    <script src="http://vjs.zencdn.net/4.6.1/video.js"></script>
    <link href="/css/videojs.markers.min.css" rel="stylesheet">
    <script src='/js/videojs.markers.js?v=2'></script>
</head>

<body>

<video id="demo" class="video-js vjs-default-skin" controls preload="auto" width="640" height="268"
       data-setup='{ "playbackRates": [0.5, 1, 1.5, 2] }'>
    <source src="${model["videoLink"]}" type="video/mp4">
<#--<source src="http://vjs.zencdn.net/v/oceans.webm" type="video/webm">-->
</video>

<div id="comment"></div>

<input type="button" onclick="nextButton()" value="next"/>
<input type="button" onclick="prevButton()" value="prev"/>
<script>
    var comment = document.getElementById("comment");

    var player = videojs('demo', {'playbackRates': [0.5, 1.0, 1.5, 2.0]});

    player.markers({

        onMarkerClick: function (marker) {
            player.currentTime(marker.time - 5);
            comment.innerHTML = marker.text;
        },

        markers: [
        <#list model["markers"]>
            <#items as marker>
                {time: ${marker.timeInSec}, text: "${marker.comment}"}<#sep>,
            </#items>
        </#list>

            // {time: 9.5, text: "this"},
            // {time: 16, text: "is"},
            // {time: 23.6, text: "so"},
            // {time: 28, text: "cool"}
        ]

    })
    ;

    function nextButton() {
        comment.innerHTML = player.markers.next().text;
    }

    function prevButton() {
        comment.innerHTML = player.markers.prev().text;
    }
</script>
<#--<script type="text/javascript" src='/js/script.js'></script>-->

</body>
</html>