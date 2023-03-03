package org.europol.eu.emas.emasbackend.controller;

import org.europol.eu.emas.emasbackend.model.HistoryItem;
import org.europol.eu.emas.emasbackend.security.service.UserDetailsImpl;
import org.europol.eu.emas.emasbackend.service.HistoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/history")
public class HistoryController {

    @Autowired
    private HistoryService historyService;

    @PostMapping
    public ResponseEntity<?> save(@RequestBody HistoryItem submission) {
        return new ResponseEntity<>(historyService.saveHistoryItem(submission), HttpStatus.CREATED);
    }

    @GetMapping
    public ResponseEntity<?> findAll(@AuthenticationPrincipal UserDetailsImpl userDetails) {
        return new ResponseEntity<>(historyService.findHistoryItemsOfUser(userDetails.getId()), HttpStatus.OK);
    }


}
