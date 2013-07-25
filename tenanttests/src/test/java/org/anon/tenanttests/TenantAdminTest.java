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
 * File:                org.anon.tenanttests.TenantAdminTest
 * Author:              vjaasti
 * Revision:            1.0
 * Date:                Jul 19, 2013
 *
 * ************************************************************
 * REVISIONS
 * ************************************************************
 * <Purpose>
 *
 * ************************************************************
 * */

package org.anon.tenanttests;

import java.util.List;

import org.anon.smarttest.fw.BaseTest;

import org.junit.Test;
import static org.junit.Assert.*;

public class TenantAdminTest extends BaseTest
{

    public TenantAdminTest()
    {
        super("TenantAdminTestSuite");
    }
    
    @Test
    public void testTenantCreation() throws Exception {

       try {
                 List<String> resp = runTest();
                 System.out.println("Resp:"+resp);
                 logger.info("Resp:"+resp);
                 assertSuccess(resp.get(0));
                 assertSuccess(resp.get(1));
                 assertTrue(resp.get(2).contains("Missing value"));
                 assertSuccess(resp.get(3));
                 assertSuccess(resp.get(4));
                 assertTrue(resp.get(5).contains("FlowDescriptor cannot be NULL"));
                 assertTrue(resp.get(6).contains("Tenant Smartowner does not exist"));
                 assertTrue(resp.get(7).contains("No deployment found for flow: Adminsmartflow"));
                 assertTrue(resp.get(8).contains("No event class found for event"));
                 
                 
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


}
