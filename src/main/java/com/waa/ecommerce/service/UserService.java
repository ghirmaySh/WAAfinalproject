package com.waa.ecommerce.service;

import java.util.Set;


import com.waa.ecommerce.model.BillingAddress;
import com.waa.ecommerce.model.Payment;
import com.waa.ecommerce.model.ShippingAddress;
import com.waa.ecommerce.model.User;
import com.waa.ecommerce.model.security.PasswordResetToken;
import com.waa.ecommerce.model.security.UserRole;

public interface UserService {


	User findByUsername(String username);
	User findByEmail(String email);
	User createUser(User user, Set<UserRole> userRoles) throws Exception;
	void save(User user);
	User findById(Long id);

}
