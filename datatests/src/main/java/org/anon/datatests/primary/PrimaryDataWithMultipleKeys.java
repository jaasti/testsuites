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
 * File:                org.anon.datatests.primary.PrimaryDataWithMultipleKeys
 * Author:              vjaasti
 * Revision:            1.0
 * Date:                Jul 23, 2013
 *
 * ************************************************************
 * REVISIONS
 * ************************************************************
 * <Purpose>
 *
 * ************************************************************
 * */

package org.anon.datatests.primary;

import java.io.Serializable;

public class PrimaryDataWithMultipleKeys implements Serializable
{
    String key1;
    String key2;
    public String getKey1()
    {
        return key1;
    }
    public void setKey1(String key1)
    {
        this.key1 = key1;
    }
    public String getKey2()
    {
        return key2;
    }
    public void setKey2(String key2)
    {
        this.key2 = key2;
    }
    
    
    
}
