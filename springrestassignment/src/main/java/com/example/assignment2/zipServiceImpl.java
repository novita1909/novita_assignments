package com.example.assignment2;
import java.util.*;

import org.springframework.stereotype.Service;

@Service
public class zipServiceImpl implements zipInfoService{
	List<zipInfo> list;
	
	public zipServiceImpl()
	{
		list=new ArrayList<>();
		list.add(new zipInfo(101,"amritsar","punjab","india"));
		list.add(new zipInfo(1023,"jlr","pb","in"));
	}

	@Override
	public List<zipInfo> getZips() {
		// TODO Auto-generated method stub
		return list;
	}

	@Override
	public zipInfo getZips(long zip) {
		// TODO Auto-generated method stub
		zipInfo z=null;
		for(zipInfo zipinfo:list)
		{
			
			
				if(zipinfo.getZip()==zip)
				{
					z=zipinfo;
					break;
				}
			
		}
		return z;
	}

}
