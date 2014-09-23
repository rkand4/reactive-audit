/*
 * Copyright 2014 OCTO Technology
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.octo.reactive.audit.java.sql;

import com.octo.reactive.audit.TestTools;
import com.octo.reactive.audit.lib.NetworkAuditReactiveException;
import org.junit.Test;

import java.sql.ResultSet;
import java.sql.SQLException;

public class ResultSetTest
{
	private final ResultSet rs = (ResultSet) TestTools.createProxy(ResultSet.class);

	@Test(expected = NetworkAuditReactiveException.class)
	public void absolute() throws InterruptedException, ClassNotFoundException, SQLException
	{
		rs.absolute(1);
	}

	@Test(expected = NetworkAuditReactiveException.class)
	public void afterLast() throws InterruptedException, ClassNotFoundException, SQLException
	{
		rs.afterLast();
	}

	@Test(expected = NetworkAuditReactiveException.class)
	public void beforeFirst() throws InterruptedException, ClassNotFoundException, SQLException
	{
		rs.beforeFirst();
	}

	@Test(expected = NetworkAuditReactiveException.class)
	public void deleteRow() throws InterruptedException, ClassNotFoundException, SQLException
	{
		rs.deleteRow();
	}

	@Test(expected = NetworkAuditReactiveException.class)
	public void first() throws InterruptedException, ClassNotFoundException, SQLException
	{
		rs.first();
	}

	@Test(expected = NetworkAuditReactiveException.class)
	public void last() throws InterruptedException, ClassNotFoundException, SQLException
	{
		rs.last();
	}

	@Test(expected = NetworkAuditReactiveException.class)
	public void next() throws InterruptedException, ClassNotFoundException, SQLException
	{
		rs.next();
	}

	@Test(expected = NetworkAuditReactiveException.class)
	public void previous() throws InterruptedException, ClassNotFoundException, SQLException
	{
		rs.previous();
	}

	@Test(expected = NetworkAuditReactiveException.class)
	public void refreshRow() throws InterruptedException, ClassNotFoundException, SQLException
	{
		rs.refreshRow();
	}

	@Test(expected = NetworkAuditReactiveException.class)
	public void relative() throws InterruptedException, ClassNotFoundException, SQLException
	{
		rs.relative(1);
	}
}