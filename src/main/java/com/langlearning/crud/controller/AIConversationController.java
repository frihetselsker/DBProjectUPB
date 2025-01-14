package com.langlearning.crud.controller;

import com.langlearning.crud.entity.ai.AIConversation;
import com.langlearning.crud.service.AIConversationService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/ai-conversation")
public class AIConversationController {
    @Autowired
    private AIConversationService aiConversationService;

    @GetMapping("/all")
    public ResponseEntity<List<AIConversation>> getAllAIConversations() {
        return aiConversationService.getAllAIConversations();
    }

    @GetMapping("/create")
    public ResponseEntity<AIConversation> createEntity(@RequestBody AIConversation entity) {
        return aiConversationService.createEntity(entity);
    }

    @GetMapping("/update")
    public ResponseEntity<AIConversation> updateEntity(@RequestBody AIConversation entity) {
        return aiConversationService.updateEntity(entity);
    }

    @GetMapping("/delete/{id}")
    public ResponseEntity<Void> deleteEntity(@PathVariable int id) {
        return aiConversationService.deleteEntity(id);
    }
}
