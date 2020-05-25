package jc.service;

import org.springframework.stereotype.Service;

import jc.entity.Message;
import lombok.extern.log4j.Log4j2;

@Service
@Log4j2
public class MessageService {

	public void publish(Message m) {
		log.info("message published");
	}
}
