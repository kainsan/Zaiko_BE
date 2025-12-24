package com.project.Zaiko.service;

import com.project.Zaiko.jpa.RepositoryEntity;
import com.project.Zaiko.repository.RepoRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
@Transactional
public class IRepoRepositoryService implements RepoRepositoryService{

    @Autowired
    private RepoRepository repoRepository;
    @Override
    public List<RepositoryEntity> findAll() {
        return repoRepository.findAll();
    }
}
