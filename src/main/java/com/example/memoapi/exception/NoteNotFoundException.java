package com.example.memoapi.exception;

import java.io.*;

import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;


@WebServlet("/NoteNotFoundException")
public class NoteNotFoundException extends RuntimeException {
    public NoteNotFoundException(long id) {
        super("指定されたIDのノートが見つかりません: " + id);
    }
}




