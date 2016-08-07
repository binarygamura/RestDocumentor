/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package de.fomad.restdocumentor.model;

/**
 *
 * @author binary gamura
 */
public class SimpleDataType 
{    
    private Type type;
    
    private String format;
    
    public SimpleDataType(Type type){
	this(type, null);
    }
    
    public SimpleDataType(Type type, String format){
	this.type = type;
	this.format = format;
    }

    public Type getType()
    {
	return type;
    }

    public String getFormat()
    {
	return format;
    }
    
    public static enum Type {
	INTEGER("integer"),
	NUMBER("number"),
	STRING("string"),
	BOOLEAN("boolean");
	
	private final String name;
	
	private Type(String name){
	    this.name = name;
	}

	public String getName()
	{
	    return name;
	}
    }
}
