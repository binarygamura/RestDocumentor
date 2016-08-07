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
public class SwaggerTagObject 
{
    private String name;
    
    private String description;
    
    private SwaggerExternalDocumentationObject externalDocs;

    public String getName()
    {
	return name;
    }

    public void setName(String name)
    {
	this.name = name;
    }

    public String getDescription()
    {
	return description;
    }

    public void setDescription(String description)
    {
	this.description = description;
    }

    public SwaggerExternalDocumentationObject getExternalDocs()
    {
	return externalDocs;
    }

    public void setExternalDocs(SwaggerExternalDocumentationObject externalDocs)
    {
	this.externalDocs = externalDocs;
    }
    
    
}
