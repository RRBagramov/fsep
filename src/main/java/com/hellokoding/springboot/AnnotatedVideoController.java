package com.hellokoding.springboot;

import models.Marker;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito.*;
import org.mockito.runners.MockitoJUnitRunner;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import services.MarkerService;
import services.MarkerServiceImpl;

import java.util.LinkedList;
import java.util.List;

import static org.mockito.Mockito.when;

//@RunWith(MockitoJUnitRunner.class)
@Controller
public class AnnotatedVideoController {

  //  @Mock
 //   private MarkerServiceImpl markerServiceImpl;

  //  @InjectMocks
  //  private MarkerService service;

  //  List<Marker> injectList = new LinkedList<Marker>();

    @RequestMapping("/play")
    public String annotatedVideo(@ModelAttribute("model") ModelMap modelMap) {
     //   List<Marker> markers = when(service.getAll()).then(injectList);

        List<Marker> markers = new LinkedList<Marker>();

        markers.add(new Marker(6, "1 comment"));
        markers.add(new Marker(9, "2 comment"));
        markers.add(new Marker(14, "3 comment"));

        modelMap.addAttribute("markers", markers);
        modelMap.addAttribute("videoLink", "http://vjs.zencdn.net/v/oceans.mp4");

        return "annotated.video";
    }
}