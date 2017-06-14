package ru.fsep.videorobot.controllers;

import ru.fsep.videorobot.models.Comment;
import ru.fsep.videorobot.models.Marker;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.LinkedList;
import java.util.List;

@Controller
public class AnnotatedVideoController {

    @RequestMapping("/play")
    public String annotatedVideo(@ModelAttribute("model") ModelMap modelMap) {
        List<Marker> markers = new LinkedList<Marker>();

        markers.add(new Marker(1, 6,
                new Comment(null, "1 comment", null, null)));
        markers.add(new Marker(2, 9,
                new Comment(null, "2 comment", null, null)));
        markers.add(new Marker(3, 14,
                new Comment(null, "3 comment", null, null)));

        modelMap.addAttribute("markers", markers);
        modelMap.addAttribute("videoLink", "http://vjs.zencdn.net/v/oceans.mp4");

        return "annotated.video";
    }
}