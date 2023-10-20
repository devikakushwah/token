package com.jwtAuthenticate.token.requestPayload;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Data
//@Builder
@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
public class JwtRequest {

    public String email;

    public String password;
}
