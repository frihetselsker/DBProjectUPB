package com.langlearning.crud.controller;

import com.langlearning.crud.service.SpeakingAssessmentService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/speaking-assessment")
public class SpeakingAssessmentController {
    @Autowired
    private SpeakingAssessmentService speakingAssessmentService;


     @GetMapping("/all")
     public Object getAllSpeakingAssessments() {
         return speakingAssessmentService.getAllSpeakingAssessments();
     }
}