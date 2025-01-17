package com.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.dao.UserRepo;
import com.model.User;
@Component
public class UserServices {
	@Autowired
	private UserRepo userRepo;

//	private static List<User> list = new ArrayList<>();
//
//    static{
//        list.add(new User(1, "c", "Ahmedabad"));
//        list.add(new User(2, "Java", "A"));
//        list.add(new User(3, "Python", "Ahmedabad"));
//        list.add(new User(4, "Ruby", "Ahmedabad"));
//        list.add(new User(5, "ReactJs", "Ahmedabad"));
//
//    }

	public List<User> getAllUsers() {
//        System.out.println("List ------->>>>>" + list);
//        return list;

		List<User> list = (List<User>) this.userRepo.findAll();
		return list;
	}

	public User getUsersById(int id) {
		// return list.stream().filter(u -> u.getId() == id).findFirst().get();

		User user = this.userRepo.findById(id);
		return user;
	}

	public User addUsers(User u) {
//        list.add(u);
//        return u;

		this.userRepo.save(u);

		return u;
	}

	public void deleteUsers(int id) {
		// list.stream().filter(u->u.getId() != id).collect(Collectors.toList());

		this.userRepo.deleteById(id);
	}

	public void updateUsers(User u, int id) {
//        list = list.stream().map(b -> {
//
//            if(b.getId() == id)
//            {
//                b.setName(u.getName());
//                b.setAddress(u.getAddress());
//            }
//
//            return b;
//
//        }).collect(Collectors.toList());

		u.setId(id);
		this.userRepo.save(u);
	}

}
