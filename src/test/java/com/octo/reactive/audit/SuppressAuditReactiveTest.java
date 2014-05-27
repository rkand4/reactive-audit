package com.octo.reactive.audit;

import com.octo.reactive.audit.annotation.SuppressAuditReactive;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

/**
 * Created by pprados on 09/05/2014.
 */
public class SuppressAuditReactiveTest
{
	@Test
	@SuppressAuditReactive("Direct call")
	public void directCall()
	{
		 assertTrue(ConfigAuditReactive.config.isSuppressAudit());
	}
	@Test
	@SuppressAuditReactive("Indirect call")
	public void indirectCall()
	{
		Runnable r=new Runnable()
		{
			@Override
			public void run()
			{
				assertTrue(ConfigAuditReactive.config.isSuppressAudit());
				assertEquals(1,ConfigAuditReactive.config.getSuppress());
			}
		};
		r.run();
		assertTrue(ConfigAuditReactive.config.isSuppressAudit());
		assertEquals(1,ConfigAuditReactive.config.getSuppress());
	}
	@Test
	@SuppressAuditReactive("Double call")
	public void doubleCall()
	{
		Runnable r=new Runnable()
		{
			@SuppressAuditReactive
			@Override
			public void run()
			{
				assertTrue(ConfigAuditReactive.config.isSuppressAudit());
				assertEquals(2,ConfigAuditReactive.config.getSuppress());
			}
		};
		r.run();
		assertEquals(1,ConfigAuditReactive.config.getSuppress());
	}
}