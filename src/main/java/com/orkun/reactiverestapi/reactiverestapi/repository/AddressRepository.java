package com.orkun.reactiverestapi.reactiverestapi.repository;

import com.orkun.reactiverestapi.reactiverestapi.model.Address;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AddressRepository extends ReactiveCrudRepository<Address, Long> {
}
