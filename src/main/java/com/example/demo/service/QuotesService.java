package com.example.demo.service;

import com.example.demo.model.Quotes;
import com.example.demo.repository.QuotesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class QuotesService {

    @Autowired
    QuotesRepository quotesRepository;

    public List<Quotes> getAllQuotes() {
        List<Quotes> quotes = new ArrayList<>();
        quotesRepository.findAll().forEach(quotes::add);
        return quotes;
    }

    public Quotes getQuotesById(Long id) {
        return quotesRepository.findById(id).get();
    }

    public void deleteQuotes(Long id) {
        quotesRepository.deleteById(id);
    }

    public void saveQuotes(Quotes quotes) {
        quotesRepository.save(quotes);
    }

    public void updateQuotes(Long id, Quotes model) {
        Quotes quotes = quotesRepository.findById(id).get();
        quotes.setAuthor(model.getAuthor());
        quotes.setContent(model.getContent());
        quotesRepository.save(quotes);
    }
}
