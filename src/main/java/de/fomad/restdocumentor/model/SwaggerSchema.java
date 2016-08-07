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
public class SwaggerSchema {
    
    private final String swagger = "2.0";
    
    private SwaggerInfoObject info;
    
    private String host;
    
    private String basePath;
    
    private Set<SwaggerTransportProtocol> schemes;
    
    private Set<MimeType> produces;
    
    private Set<MimeType> consumes;
    
    private SwaggerExternalDocumentationObject externalDocs;
    
    private Set<SwaggerTagObject> tags;
        
    private SwaggerPathsObject paths;
    
    
    
}
