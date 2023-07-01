package com.example.demo.exception;

import com.example.demo.model.User;

public class UserNotFoundException extends RuntimeException
{
    public UserNotFoundException(Long id)
    {

        super("Could not found the user with id " + id);

    }
}
