'use strict';

var comment = document.getElementById("comment");

var player = videojs('demo', {'playbackRates': [0.5, 1.0, 1.5, 2.0]});

player.markers({

    onMarkerClick: function (marker) {
        player.currentTime(marker.time - 5);
        comment.innerHTML = marker.text;
    },

    markers: [
        {time: 9.5, text: "this"},
        {time: 16, text: "is"},
        {time: 23.6, text: "so"},
        {time: 28, text: "cool"}
    ]

})
;

function nextButton() {
    player.markers.next();
}

function prevButton() {
    player.markers.prev();
}
