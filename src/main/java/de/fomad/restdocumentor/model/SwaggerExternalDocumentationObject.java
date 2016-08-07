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
public class SwaggerExternalDocumentationObject {
    
    private String description;
    
    private String url;

    public String getDescription()
    {
	return description;
    }

    public void setDescription(String description)
    {
	this.description = description;
    }

    public String getUrl()
    {
	return url;
    }

    public void setUrl(String url)
    {
	this.url = url;
    }
    
    
}
