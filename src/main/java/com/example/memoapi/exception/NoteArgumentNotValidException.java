package com.example.memoapi.exception;

import java.io.*;

import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;


@WebServlet("/NoteArgumentNotValidException")
public class NoteArgumentNotValidException extends RuntimeException {
    public NoteArgumentNotValidException(String message) {
        super(message);
    }
}




