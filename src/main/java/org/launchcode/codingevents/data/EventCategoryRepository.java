package org.launchcode.codingevents.data;

import org.launchcode.codingevents.models.Event;
import org.springframework.data.repository.CrudRepository;

public interface EventCategoryRepository extends CrudRepository<Event,Integer> {

}
