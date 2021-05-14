package com.waa.ecommerce.repository;

import com.waa.ecommerce.model.security.Role;
import org.springframework.data.repository.CrudRepository;



public interface RoleRepository extends CrudRepository<Role, Long>{
	Role findByName(String name);
}
