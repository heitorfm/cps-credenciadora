package com.elo.eloconvcredenciadora;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "")
public class TcpClientController {

    private final MessageService messageService;

    public TcpClientController(MessageService messageService) {
        this.messageService = messageService;
    }

    @GetMapping(value = "/send")
    public MessageDTO send(@RequestParam("message") String message) {
        return messageService.send(message);
    }

}