package com.example.demo.service;

import com.example.demo.domain.User;
import org.springframework.stereotype.Service;


public interface UserService {
    User introduce(String user_id);
}
