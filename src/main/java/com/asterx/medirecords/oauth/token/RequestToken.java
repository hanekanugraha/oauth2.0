package com.asterx.medirecords.oauth.token;

import java.util.ResourceBundle;

import net.smartam.leeloo.client.OAuthClient;
import net.smartam.leeloo.client.URLConnectionClient;
import net.smartam.leeloo.client.request.OAuthClientRequest;
import net.smartam.leeloo.client.response.OAuthAccessTokenResponse;
import net.smartam.leeloo.common.message.types.GrantType;

import org.mule.api.MuleEventContext;
import org.mule.api.lifecycle.Callable;

public class RequestToken implements Callable {
	private ResourceBundle label = ResourceBundle.getBundle("configuration");

	@Override
	public Object onCall(MuleEventContext context) throws Exception {
		String code = context.getMessage().getInboundProperty("code");
		if (code == null || code.isEmpty()) {
			OAuthClientRequest oAuthTokenRequest = OAuthClientRequest
					.tokenLocation(
							"http://172.19.14.234:8084/tweetbook/api/token")
					.setGrantType(GrantType.AUTHORIZATION_CODE)
					.setCode(
							(String) context.getMessage().getInboundProperty(
									"code"))
					.setClientId(label.getString("mrintegration.apikey"))
					.setClientSecret(label.getString("mrintegration.apisecret"))
					.buildBodyMessage();
			OAuthClient oAuthClient = new OAuthClient(new URLConnectionClient());

			OAuthAccessTokenResponse oAuthTokenResponse = oAuthClient
					.accessToken(oAuthTokenRequest);

			String accessToken = oAuthTokenResponse.getAccessToken();
			context.getMessage().setSessionProperty("access_token", accessToken);
		}
		return context.getMessage();
	}

}
