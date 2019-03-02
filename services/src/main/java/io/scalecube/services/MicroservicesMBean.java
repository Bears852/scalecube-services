package io.scalecube.services;

import java.util.Collection;

public interface MicroservicesMBean {

  Collection<String> getId();

  Collection<String> getDiscoveryAddress();

  Collection<String> getGatewayAddresses();

  Collection<String> getServiceEndpoint();

  Collection<String> getRecentServiceDiscoveryEvents();

  Collection<String> getServiceReferences();

  Collection<String> getServiceTransport();

  Collection<String> getServiceDiscovery();
}
