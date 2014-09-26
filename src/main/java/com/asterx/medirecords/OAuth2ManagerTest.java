package com.asterx.medirecords;

import java.util.Map;

import net.smartam.leeloo.common.message.types.GrantType;

import org.apache.commons.pool.KeyedPoolableObjectFactory;
import org.mule.api.MuleContext;
import org.mule.api.MuleEvent;
import org.mule.api.devkit.ProcessTemplate;
import org.mule.api.store.ObjectDoesNotExistException;
import org.mule.api.store.ObjectStoreException;
import org.mule.api.transport.Connector;
import org.mule.common.security.oauth.exception.NotAuthorizedException;
import org.mule.common.security.oauth.exception.UnableToAcquireAccessTokenException;
import org.mule.security.oauth.OAuth2Adapter;
import org.mule.security.oauth.OAuth2Manager;
import org.mule.security.oauth.OnNoTokenPolicy;

public class OAuth2ManagerTest implements OAuth2Manager<OAuth2Adapter> {

	@Override
	public Integer getLocalPort() {
		return null;
	}

	@Override
	public Integer getRemotePort() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getDomain() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Connector getConnector() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Boolean getAsync() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getPath() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setLocalPort(Integer value) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setRemotePort(Integer value) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setDomain(String value) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setPath(String value) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setConnector(Connector value) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setAsync(Boolean value) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public OnNoTokenPolicy getOnNoTokenPolicy() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setOnNoTokenPolicy(OnNoTokenPolicy policy) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public OAuth2Adapter createAdapter(String verifier) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public OAuth2Adapter acquireAccessToken(String accessTokenId)
			throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void releaseAccessToken(String userId, OAuth2Adapter connector)
			throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void destroyAccessToken(String userId, OAuth2Adapter connector)
			throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public OAuth2Adapter getDefaultUnauthorizedConnector() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public KeyedPoolableObjectFactory<String, OAuth2Adapter> getAccessTokenPoolFactory() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String buildAuthorizeUrl(Map<String, String> extraParameters,
			String authorizationUrl, String redirectUri) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void refreshAccessToken(OAuth2Adapter adapter, String accessTokenId)
			throws UnableToAcquireAccessTokenException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void fetchAccessToken(OAuth2Adapter adapter, String redirectUri)
			throws UnableToAcquireAccessTokenException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public MuleContext getMuleContext() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void hasBeenAuthorized(OAuth2Adapter adapter)
			throws NotAuthorizedException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void storeAuthorizationEvent(MuleEvent event) throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public MuleEvent restoreAuthorizationEvent(String eventId)
			throws ObjectStoreException, ObjectDoesNotExistException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <T> ProcessTemplate<T, OAuth2Adapter> getProcessTemplate() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getDefaultAccessTokenId() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void postAuth(OAuth2Adapter adapter, String accessTokenId)
			throws Exception {
		// TODO Auto-generated method stub
		
	}


}
