package com.project.Zaiko.service;

import com.project.Zaiko.jpa.RepositoryEntity;

import java.util.List;

public interface RepoRepositoryService {
    List<RepositoryEntity> findAll();
}
