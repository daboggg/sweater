package ru.zinin.sweater.repos;

import org.springframework.data.repository.CrudRepository;
import ru.zinin.sweater.domain.Message;

import java.util.List;

public interface MessageRepo extends CrudRepository<Message, Long> {
    List<Message>findByTag(String tag);
}
