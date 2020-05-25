package jc.repository;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import jc.entity.Message;

@Repository
public class MessageRepository implements JdbcMessageRepository {

	@Autowired
    private JdbcTemplate jdbcTemplate;
	
	@Override
	public int count() {
		return jdbcTemplate.queryForObject("select count(*) from message", Integer.class);
	}

	@Override
	public int save(Message msg) {
		return jdbcTemplate.update(
                "insert into books (id, header, body) values(?,?,?)",
                msg.getId().toString(), msg.getHeader(), msg.getBody());
	}

	@Override
	public int update(Message msg) {
		// return jdbcTemplate.update
		return 0;
	}

	@Override
	public int deleteById(UUID id) {
		// TODO return jdbcTemplate.update
		return 0;
	}

	@Override
	public List<Message> findAll() {
		return jdbcTemplate.query(
                "select * from books",
                (rs, rowNum) ->
                        new Message(
                                UUID.fromString(rs.getString("id")),
                                rs.getString("header"),
                                rs.getString("body")
                        ));
	}

	@Override
	public Optional<Message> findById(UUID id) {
		// return jdbcTemplate.query
		return null;
	}

}
