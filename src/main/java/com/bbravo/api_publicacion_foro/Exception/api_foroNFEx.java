package com.bbravo.api_publicacion_foro.Exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class api_foroNFEx extends RuntimeException {
    
    public api_foroNFEx(String msg)
    {
        super(msg);
    }
}