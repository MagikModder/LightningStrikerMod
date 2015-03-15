package com.lms.proxy;

import com.lms.item.LmsItems;
import com.lms.main.LSMRegistry;


public class CommonProxy {

	public void registerRenderers(LSMRegistry ins) {
	}
	
	public void preInit()
	{
		LmsItems.register();
	}
	
	public void PreLoad()
	{
		LmsItems.register();
	}
	
	
	
}


