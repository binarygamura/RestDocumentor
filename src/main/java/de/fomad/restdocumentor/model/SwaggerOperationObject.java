/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package de.fomad.restdocumentor.model;

import java.util.List;
import java.util.Set;
import javax.activation.MimeType;

/**
 *
 * @author binary gamura
 */
public class SwaggerOperationObject 
{
    private List<SwaggerTagObject> tags;
    
    private String summary;
    
    private String description;
    
    private SwaggerExternalDocumentationObject externalDocs;
    
    private String operationId;
    
    private Set<MimeType> consumes;
    
    private Set<MimeType> produces;
    
    private Set<SwaggerTransportProtocol> schemes;
    
    private boolean deprecated;
    
    private List<SwaggerParameterObject> parameters;
    
    
    
    
}
