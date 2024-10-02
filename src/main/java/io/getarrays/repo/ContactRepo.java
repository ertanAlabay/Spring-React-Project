package io.getarrays.repo;

import org.apache.el.stream.Optional;
import org.springframework.data.jpa.repository.cdi.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ContactRepo extends JpaRepository<Contact, String>{
    Optional<Contact> findById(String id);
}
