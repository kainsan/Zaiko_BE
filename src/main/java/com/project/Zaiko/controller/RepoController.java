package com.project.Zaiko.controller;

import com.project.Zaiko.jpa.LocationEntity;
import com.project.Zaiko.jpa.RepositoryEntity;
import com.project.Zaiko.service.LocationService;
import com.project.Zaiko.service.RepoRepositoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/")
public class RepoController {

    @Autowired
    private RepoRepositoryService repoRepositoryService;

    @Autowired
    private LocationService locationService;

    @GetMapping("/repositories")
    public ResponseEntity<List<RepositoryEntity>> getRepositories(){
        List<RepositoryEntity> repositories = repoRepositoryService.findAll();
        return new ResponseEntity<>(repositories, HttpStatus.OK);
    }
    @GetMapping("/locations/{repositoryId}")
    public ResponseEntity<List<LocationEntity>> getLocationsByRepositoryId(@PathVariable Long repositoryId){
        List<LocationEntity> locations = locationService.findByRepositoryId(repositoryId);
        return new ResponseEntity<>(locations, HttpStatus.OK);
    }
}
