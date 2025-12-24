package com.project.Zaiko.repository;

import com.project.Zaiko.jpa.RepositoryEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RepoRepository extends JpaRepository<RepositoryEntity,Long> {
}
