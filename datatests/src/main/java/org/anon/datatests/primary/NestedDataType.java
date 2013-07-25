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
 * File:                org.anon.datatests.primary.NestedDataType
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

public class NestedDataType implements Serializable
{
    private String _string;
    private int _int;
    private AnotherNestedType _anotherNested;
    public String get_string()
    {
        return _string;
    }
    public void set_string(String _string)
    {
        this._string = _string;
    }
    public int get_int()
    {
        return _int;
    }
    public void set_int(int _int)
    {
        this._int = _int;
    }
    public AnotherNestedType get_anotherNested()
    {
        return _anotherNested;
    }
    public void set_anotherNested(AnotherNestedType _anotherNested)
    {
        this._anotherNested = _anotherNested;
    }
}
