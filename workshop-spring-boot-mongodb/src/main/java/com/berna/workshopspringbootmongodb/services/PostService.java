package com.berna.workshopspringbootmongodb.services;

import com.berna.workshopspringbootmongodb.domain.Post;
import com.berna.workshopspringbootmongodb.domain.User;
import com.berna.workshopspringbootmongodb.dto.UserDTO;
import com.berna.workshopspringbootmongodb.repository.PostRepository;
import com.berna.workshopspringbootmongodb.repository.UserRepository;
import com.berna.workshopspringbootmongodb.services.exceptions.ObjectNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service

public class PostService {
    @Autowired
    private PostRepository repo;

    public List<Post> findAll(){
        return repo.findAll();
    }

    public Post findById(String id) {
        Optional<Post> obj = repo.findById(id);
        return obj.orElseThrow(() -> new ObjectNotFoundException("Objeto não encontrado"));
    }

}
