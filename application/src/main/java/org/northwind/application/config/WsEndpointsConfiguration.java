package org.northwind.application.config;
import org.northwind.application.ws.endpoint.CategoryWebServiceEndpoint;
import org.springframework.roo.addon.ws.annotations.RooWsEndpoints;

/**
 * = WsEndpointsConfiguration
 TODO Auto-generated class documentation
 *
 */
@RooWsEndpoints(endpoints = { CategoryWebServiceEndpoint.class })
public class WsEndpointsConfiguration {
}
