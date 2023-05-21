package com.aus.Aus.repo;

import com.aus.Aus.httpentities.AddingRequest;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BusinessRepo extends JpaRepository<AddingRequest,Long> {

}
