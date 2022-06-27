package com.remotehiring.Admin;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AdminService {

	@Autowired
	private AdminRepository repo;
	
	public boolean checkadmin(Admin admin) {
		if (repo.existsById(admin.getAdminid())) {
			Admin currentadmin = repo.findById(admin.getAdminid()).get();
			//int a=currentadmin.getAdminid();
			//String a1=currentadmin.getPassword();
			if (currentadmin.getPassword().equals(admin.getPassword())) {
				return true;
			}
			else {
				return true;
			}
		}
		else {
			return true;
		}
		
		
	}
}
