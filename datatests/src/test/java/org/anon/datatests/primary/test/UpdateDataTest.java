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
 * File:                org.anon.datatests.primary.test.UpdateDataTest
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

import org.anon.smarttest.data.DataCleaner;
import org.anon.smarttest.fw.BaseTest;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class UpdateDataTest extends BaseTest
{
    public UpdateDataTest()
    {
        super("PrimaryDataTestSuite");
        
    }
    
    //@Before
    public void setup()
        throws Exception
    {
        
        deployStandardJar();
        createTenantForTestCase();
        System.out.println("Deployed jar and created tenant:"+tenantName);

    }
    
    @Test
    public void testUpdatePrimaryData()
        throws Exception
    {
        accessor.cleanAllDataFor(tenantName);
        setup();
        List<String> responses = runTest();
        System.out.println("responses:"+responses);
        
        assertSuccess(responses.get(0));
        String grp = "NestedDataClassForUpdate";
        
        assertSuccess(responses.get(1));
        
        List<String> resp = lookupFor(grp, "key1");
        String obj = resp.get(0);
        System.out.println("Obj accessed:"+obj);
        assertTrue(obj.contains("100"));
    }
}
