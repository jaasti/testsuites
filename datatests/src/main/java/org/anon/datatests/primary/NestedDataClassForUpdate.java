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
 * File:                org.anon.datatests.primary.NestedDataClassForUpdate
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

package org.anon.datatests.primary;

import java.io.Serializable;
import java.util.List;

public class NestedDataClassForUpdate implements Serializable
{
    private String key;
    private NestedDataTypeForUpdate nestedType;
    private int _int;
    private List<String> stirngList;
    
    public List<String> getStirngList()
    {
        return stirngList;
    }
    public void setStirngList(List<String> stirngList)
    {
        this.stirngList = stirngList;
    }
    public String getKey()
    {
        return key;
    }
    public void setKey(String key)
    {
        this.key = key;
    }
    public NestedDataTypeForUpdate getNestedType()
    {
        return nestedType;
    }
    public void setNestedType(NestedDataTypeForUpdate nestedType)
    {
        this.nestedType = nestedType;
    }
}
