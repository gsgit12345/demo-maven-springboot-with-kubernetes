package com.demo.project.service;

import com.demo.project.domain.Bookmark;
import com.demo.project.repository.BookmarkRepository;
import lombok.RequiredArgsConstructor;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;


@Service
@Transactional
@RequiredArgsConstructor
public class BookmarkService {
    private final BookmarkRepository repository;
    @Transactional(readOnly = true)
    public List<Bookmark>  getBookMark()
    {
        return repository.findAll();
    }
}
