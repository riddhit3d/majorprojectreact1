package com.cybage.airline.service;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import com.cybage.airline.entity.User;
import com.cybage.airline.repository.UserRepository;

@SpringBootTest
class UserServiceImplTest {
	@MockBean
    private UserRepository repository;
    
    @Autowired
    private UserService service;
    
    @Test
    void contextLoads() {
    }

	@Test
	void testFindAll() {
		User user1 = new User();
        user1.setEmail("riddhit@cybage.com");
        user1.setFirstName("riddhi");
        user1.setLastName("tripathi");
        user1.setContact("528653555");
        user1.setPassword("xyz");
        user1.setRole("patient");
        user1.setUserId(1);

        
        User user2 = new User();
        user2.setEmail("richabh@cybage.com");
        user2.setFirstName("Richa");
        user2.setLastName("bhabhda");
        user2.setContact("528653555");
        user2.setPassword("abc");
        user2.setRole("patient");
        user2.setUserId(1);
        
        
        List<User> userList = new ArrayList<User>();
        userList.add(user1);
        userList.add(user2);
        
        Mockito.when(repository.findAll()).thenReturn(userList);
        assertThat(service.findAll()).isEqualTo(userList);

	}

	@Test
	void testUpdate() {
		fail("Not yet implemented");
	}

	@Test
	void testFindByEmail() {
		fail("Not yet implemented");
	}

}
