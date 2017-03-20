package de.mschneid;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.oauth2.provider.token.store.JwtAccessTokenConverter;

@Configuration
public class OAuth2ServerConfiguration {

	private static final String RESOURCE_ID = "restservice";
	
	public JwtAccessTokenConverter getTokenConverter() {
		JwtAccessTokenConverter tokenConverter = new JwtAccessTokenConverter();
		tokenConverter.setSigningKey("aTokenSigningKey");
		tokenConverter.setVerifierKey("aTokenSigningKey");
		return tokenConverter;
	}

}
