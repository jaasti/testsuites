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
 * File:                org.anon.datatests.primary.test.DataAccessTest
 * Author:              vjaasti
 * Revision:            1.0
 * Date:                Jul 24, 2013
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

import org.anon.smarttest.fw.BaseTest;
import org.junit.BeforeClass;
import org.junit.Test;

public class DataAccessTest extends BaseTest
{
    public DataAccessTest()
    {
        super("DataAccessSuite");
        
    }
    
    @BeforeClass
    public static void setupTest() throws Exception
    {
            setup("DataAccessTest");
            deployStandardJar();
            createTenantForTestCase();
            System.out.println("Deployed jar and created tenant:"+tenantName);

    }
    
   /* test data access by listall, lookup */ 
    @Test
    public void testDataAccess()
        throws Exception
    {
        accessor.cleanAllDataFor(tenantName);
        List<String> responses = runTest();
        System.out.println("responses:"+responses);
        
    }
    /* test data access by search event */
    @Test
    public void testDataSearch()
        throws Exception
   {
        accessor.cleanAllDataFor(tenantName);
        List<String> responses = runTest();
        System.out.println("responses:"+responses);
        
   }
}
