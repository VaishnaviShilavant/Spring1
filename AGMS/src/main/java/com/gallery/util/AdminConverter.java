package com.gallery.util;

import org.springframework.beans.BeanUtils;

import com.gallery.entity.Admin;
import com.gallery.model.AdminDTO;

public class AdminConverter {
	
	private static final AdminDTO adminDto = null;

	//convert Admin entity into adminDTO
		public AdminDTO convertToAdminDTO(Admin admin)
		{
			AdminDTO adminDto = new AdminDTO();
			if(admin!=null)
			{
			  BeanUtils.copyProperties(admin, adminDto);
			}
			return adminDto;
		}
		
		//convert AdminDTO to Admin entity
		public Admin convertToAdminEntity(AdminDTO AdminDto)
		{
			Admin admin = new Admin();
			if(AdminDto!=null)
			{
				BeanUtils.copyProperties(AdminDto, admin);
			}
			return admin;
		}

		public static AdminDTO getAdmindto() {
			return adminDto;
		}


}
