package com.justcodeit.cruddatabase.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.justcodeit.cruddatabase.pojo.Address;

public interface AddressRepository extends JpaRepository<Address, Integer> {

}
