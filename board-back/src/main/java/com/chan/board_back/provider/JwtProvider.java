package com.chan.board_back.provider;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import java.time.Instant;
import java.time.temporal.ChronoUnit;
import java.util.Date;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class JwtProvider {

    @Value("${secret-key}")
    private String secretKey;

    // 이메일로 jwt 토큰 만들기
    public String create(String email){
        Date expiredDate = Date.from(Instant.now().plus(1, ChronoUnit.HOURS));

        return Jwts.builder()
            .signWith(SignatureAlgorithm.ES256, secretKey) // 알고리즘, 시크릿키
            .setSubject(email) // 주체자
            .setIssuedAt(new Date()) // 생성 시간
            .setExpiration(expiredDate) // 만료 시간
            .compact();
    }


    public String validate(String jwt){
        Claims claims = null;
        try {
            claims = Jwts.parser().setSigningKey(secretKey).parseClaimsJws(jwt).getBody();
        }catch (Exception ex){
            ex.printStackTrace();
            return null;
        }
        return claims.getSubject();
    }


}
