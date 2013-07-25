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
 * File:                org.anon.datatests.primary.test.PrimaryDataTest
 * Author:              vjaasti
 * Revision:            1.0
 * Date:                Jul 22, 2013
 *
 * ************************************************************
 * REVISIONS
 * ************************************************************
 * <Purpose>
 *
 * ************************************************************
 * */

package org.anon.datatests.primary.test;

import java.util.List;

import java.util.Map;

import org.anon.smarttest.fw.BaseTest;
import org.anon.smarttest.fw.DataAccessor;
import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class PrimaryDataTest extends BaseTest
{

    public PrimaryDataTest() throws Exception
    {
        super("PrimaryDataTestSuite");
        
    }
    
    @Before
    public void setup()
        throws Exception
    {
        deployStandardJar();
        createTenantForTestCase();
        System.out.println("Deployed jar and created tenant:"+tenantName);

    }
    
   //@Test
    public void testPrimaryDataCreation()
        throws Exception
    {
       /* deployStandardJar();
        createTenantForTestCase();
        System.out.println("Deployed jar and created tenant:"+tenantName);*/

        List<String> resp = runTest();
        
        System.out.println("Responses:"+resp);
        assertSuccess(resp.get(0));
        Map<String, String> resultMap = accessor.getRecordFor(tenantName, flowName, "PrimaryDataClass", "10");
        assertTrue(resultMap.entrySet().size() > 0);
        
        resp = lookupFor("PrimaryDataClass", "10");
        String obj = resp.get(0);
        System.out.println("Obj created:"+obj);
        assertTrue(obj.contains("name10"));
        assertTrue(obj.contains("123.456"));
        //assertTrue(obj.contains("4.5"));
    }
    
    //@Test
    public void testPrimaryDataWithListsCreation()
        throws Exception
    {
        List<String> resp = runTest();
        
        System.out.println("Responses:"+resp);
        assertSuccess(resp.get(0));
        Map<String, String> resultMap = accessor.getRecordFor(tenantName, flowName, "PrimaryDataWithLists", "list1");
        assertTrue(resultMap.entrySet().size() > 0);
        
        resp = lookupFor("PrimaryDataWithLists", "list1");
        String obj = resp.get(0);
        System.out.println("Obj created:"+obj);
        assertTrue(obj.contains("Apple"));
        assertTrue(obj.contains("[1,2,3]"));
        assertTrue(obj.contains("[1.2,3.4]"));
    }
    
    //@Test
    public void testPrimaryDataWithMultipleKeys()
        throws Exception
    {
        List<String> resp = runTest();
        System.out.println("Responses:"+resp);
        assertSuccess(resp.get(0));
        String grp = "PrimaryDataWithMultipleKeys";
        
        resp = lookupFor(grp, "key1");
        String obj = resp.get(0);
        System.out.println("Obj accessed:"+obj);
        
        resp = lookupFor(grp, "key2");
        obj = resp.get(0);
        System.out.println("Obj accessed:"+obj);
        
    }
    
    @Test
    public void testNestedDataCreation()
        throws Exception
    {
        List<String> resp = runTest();
        System.out.println("Responses:"+resp);
        assertSuccess(resp.get(0));
        String grp = "NestedDataClass";
        
        resp = lookupFor(grp, "key1");
        System.out.println("Got Nested Obj:"+resp);
        assertTrue(resp.contains("dummy"));
        
    }
}
