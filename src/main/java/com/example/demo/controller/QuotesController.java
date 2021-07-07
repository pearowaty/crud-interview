package com.example.demo.controller;

import com.example.demo.model.Quotes;
import com.example.demo.service.QuotesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
public class QuotesController {

    @Autowired
    QuotesService quotesService;

    @GetMapping("/quotes")
    private List<Quotes> getAllQuotes() {
        return quotesService.getAllQuotes();
    }

    @GetMapping("/quotes/{id}")
    private Quotes getQuotesById(@PathVariable Long id) {
        return quotesService.getQuotesById(id);
    }

    @DeleteMapping("/quotes/{id}")
    private void deleteQuotes(@PathVariable Long id) {
        quotesService.deleteQuotes(id);
    }

    @PostMapping("/quotes")
    private void deleteQuotes(@RequestBody Quotes quotes) {
        quotesService.saveQuotes(quotes);
    }

    @PostMapping("/quotes/{id}")
    private void updateQuotes(@PathVariable Long id, @RequestBody Quotes quotes) {
        quotesService.updateQuotes(id, quotes);
    }
}
