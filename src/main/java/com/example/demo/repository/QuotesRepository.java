package com.example.demo.repository;

import com.example.demo.model.Quotes;
import org.springframework.data.repository.CrudRepository;

public interface QuotesRepository extends CrudRepository<Quotes, Long> {
}
