package jc.repository;

import java.util.*;

import jc.entity.Message;

public interface JdbcMessageRepository {

	int count();
    int save(Message message);
    int update(Message message);
    int deleteById(UUID id);
    List<Message> findAll();
    Optional<Message> findById(UUID id);

}
