package org.europol.eu.emas.emasbackend.security.jwt;

import jakarta.servlet.http.HttpServletRequest;
import org.europol.eu.emas.emasbackend.security.service.UserDetailsImpl;
import org.springframework.security.core.Authentication;


public interface JwtProvider {

    String generateToken(UserDetailsImpl auth);

    boolean isTokenValid(HttpServletRequest request);

    Authentication getAuthentication(HttpServletRequest request);


}
