package com.fullstackdevelopment.userregistration.services;

import com.fullstackdevelopment.userregistration.dto.UserDTO;
import com.fullstackdevelopment.userregistration.entities.User;
import com.fullstackdevelopment.userregistration.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;

public class UserService {

    @Autowired
    private UserRepository repository;

    @Transactional(readOnly = true)
    public List<UserDTO> findAll() {
        List<User> list = repository.findAll();
        return list.stream().map(x -> new UserDTO(x)).collect(Collectors.toList());
    }
}
