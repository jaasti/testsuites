/**
 * SMART - State Machine ARchiTecture
 *
 * Copyright (C) 2012 Individual contributors as indicated by
 * the @authors tag
 *
 * This file is a part of SMART.
 *
 * SMART is a free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * SMART is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program. If not, see <http://www.gnu.org/licenses/>.
 *
 *
 * */
 
/**
 * ************************************************************
 * HEADERS
 * ************************************************************
 * File:                org.anon.basictest.test.BasicTests
 * Author:              vjaasti
 * Revision:            1.0
 * Date:                Jul 18, 2013
 *
 * ************************************************************
 * REVISIONS
 * ************************************************************
 * <Purpose>
 *
 * ************************************************************
 * */

package org.anon.basictest.test;

import java.util.List;

import javax.ws.rs.core.Context;

import org.anon.smarttest.fw.BaseTest;
import org.junit.Assert;
import org.junit.Test;

public class BasicTests extends BaseTest
{
    public BasicTests()
    {
        super("BasicSmartTestSuite");
    }
    
    @Test
    public void testBasics()
        throws Exception
    {
        testDeployment();
        testTenantCreation();
        testCreatePrimeData();
    }
    
    public void testDeployment() 
        throws Exception
    {
       List<String> resp = deployStandardJar();
       System.out.println("Resp for deploy:"+resp);
       assertSuccess(resp.get(0));
        
    }
    
    
    //@Test
    public void testCreatePrimeData() 
        throws Exception
    {
        List<String> resp =  postTo(host, tenantName, flowName, "CreatePrime",  "{'FlowAdmin':{'___smart_action___':'lookup', '___smart_value___':'"+flowName+"'}, 'create':'SimplePrimeData', 'data':{'name':'addedsome'}}");
        System.out.println("resp for create prime:"+resp);
        assertSuccess(resp.get(0));
    }
    
    //@Test
    public void testTenantCreation()
        throws Exception
    {
        List<String> resp = createTenantForTestCase();
        System.out.println("resp for tenant creation:"+resp);
        assertSuccess(resp.get(0));
    }
}
