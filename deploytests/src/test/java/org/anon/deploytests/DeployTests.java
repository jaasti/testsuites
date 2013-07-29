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
 * File:                org.anon.deploytests.DeployTests
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

package org.anon.deploytests;

import java.util.List;

import org.anon.smarttest.fw.BaseTest;
import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;

public class DeployTests extends BaseTest
{

    public DeployTests()
    {
        super("DeployTestSuite");
        // TODO Auto-generated constructor stub
    }
    
    @BeforeClass
    public static void setupTests()
    {
        setup("DeployTests");
    }
    @Test
    public void testDeploy() 
        throws Exception 
    {
        
       
        try 
        {
            List<String> resp = runTest();
            System.out.println("Responses:"+resp);
            logger.info("Responses:"+resp);
            assertSuccess(resp.get(0));
            assertTrue(resp.get(1).contains("Cannot deploy a null jar"));
            assertTrue(resp.get(2).contains("Cannot deploy a null jar"));
            assertTrue(resp.get(3).contains("Tenant Smartowner does not exist"));
            assertTrue(resp.get(4).contains("No deployment found for flow: Adminsmartflow"));
            assertTrue(resp.get(5).contains("No event class found for event: Deploy"));
            
        } catch (Exception e)
        {
            e.printStackTrace();
        }
    }


}
