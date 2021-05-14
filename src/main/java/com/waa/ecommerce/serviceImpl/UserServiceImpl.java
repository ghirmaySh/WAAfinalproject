package com.waa.ecommerce.serviceImpl;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import com.waa.ecommerce.model.Payment;
import com.waa.ecommerce.model.ShippingAddress;
import com.waa.ecommerce.model.ShoppingCart;
import com.waa.ecommerce.model.User;
import com.waa.ecommerce.model.security.UserRole;
import com.waa.ecommerce.repository.RoleRepository;
import com.waa.ecommerce.repository.UserRepository;
import com.waa.ecommerce.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


@Service
public class UserServiceImpl implements UserService {

	private static final Logger LOG=LoggerFactory.getLogger(UserService.class);

	@Autowired
	private UserRepository userRepository;
	
	@Autowired
	private RoleRepository roleRepository;
	

	


	@Override
	public User findByUsername(String username) {
		// TODO Auto-generated method stub
		return userRepository.findByUsername(username);
	}

	@Override
	public User findByEmail(String email) {
		// TODO Auto-generated method stub
		return userRepository.findByEmail(email);
	}

	@Override
	@Transactional
	public User createUser(User user, Set<UserRole> userRoles) throws Exception {
		User localUser=userRepository.findByUsername(user.getUsername());
		if(localUser != null) {
			//throw new Exception("user already exists. Nothing will be done");
			LOG.info("user {} already exists. Nothing will be done",user.getUsername());
		}else {
			for(UserRole userRole:userRoles) {
				roleRepository.save(userRole.getRole());
			}
			user.getUserRoles().addAll(userRoles);
//			ShoppingCart shoppingCart=new ShoppingCart();
////			shoppingCart.setUser(user);
//			user.setShoppingCart(shoppingCart);
//
//			user.setUserShippingList(new ArrayList<ShippingAddress>());
//			user.setUserPaymentList(new ArrayList<Payment>() );
			
			localUser=userRepository.save(user);
		}
		
		return localUser;
	}

	@Override
	public void save(User user) {
		userRepository.save(user);
		
	}

	@Override
	public User findById(Long id) {
		// TODO Auto-generated method stub
		return userRepository.findById(id).get();
	}

}
