package com.elo.eloconvcredenciadora;

import org.springframework.integration.annotation.MessagingGateway;
import org.springframework.stereotype.Component;

@Component
@MessagingGateway(defaultRequestChannel = TCPClientConfiguration.TCP_DEFAULT_CHANNEL)
public interface TCPClientGateway {

    byte[] send(byte[] message);

}