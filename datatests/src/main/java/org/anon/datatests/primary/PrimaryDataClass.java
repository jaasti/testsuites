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
 * File:                org.anon.datatests.primary.PrimaryDataClass
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

package org.anon.datatests.primary;

import java.io.Serializable;
import java.util.Date;
import java.util.UUID;

public class PrimaryDataClass
    implements Serializable
{
    private int num;
    private Integer _Integer;
    private String name;
    private UUID _UUID;
    private double _double;
    private long _long;
    private Long _Long;
    private char _char;
    private float _float;
    private Float _Float;
    private Date _Date;
    public int getNum()
    {
        return num;
    }
    public void setNum(int num)
    {
        this.num = num;
    }
    public Integer get_Integer()
    {
        return _Integer;
    }
    public void set_Integer(Integer _Integer)
    {
        this._Integer = _Integer;
    }
    public String getName()
    {
        return name;
    }
    public void setName(String name)
    {
        this.name = name;
    }
    public UUID get_UUID()
    {
        return _UUID;
    }
    public void set_UUID(UUID _UUID)
    {
        this._UUID = _UUID;
    }
    public double get_double()
    {
        return _double;
    }
    public void set_double(double _double)
    {
        this._double = _double;
    }
    public long get_long()
    {
        return _long;
    }
    public void set_long(long _long)
    {
        this._long = _long;
    }
    public Long get_Long()
    {
        return _Long;
    }
    public void set_Long(Long _Long)
    {
        this._Long = _Long;
    }
    public char get_char()
    {
        return _char;
    }
    public void set_char(char _char)
    {
        this._char = _char;
    }
    public float get_float()
    {
        return _float;
    }
    public void set_float(float _float)
    {
        this._float = _float;
    }
    public Float get_Float()
    {
        return _Float;
    }
    public void set_Float(Float _Float)
    {
        this._Float = _Float;
    }
    public Date get_Date()
    {
        return _Date;
    }
    public void set_Date(Date _Date)
    {
        this._Date = _Date;
    }
}
