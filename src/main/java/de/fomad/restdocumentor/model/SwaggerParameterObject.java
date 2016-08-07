package de.fomad.restdocumentor.model;

/**
 *
 * @author binary gamura
 */
public class SwaggerParameterObject 
{
    private String name;
    
    private ParameterLocation in;
    
    private String description;
    
    private boolean required;
    
    private String type;
    
    private String format;
    
    private boolean allowEmptyValue;
    
    private CollectionFormat collectionFormat;
    
    private int maximum;
    
    private int exclusiveMaximum;
    
    private int minimum;
    
    private int exclusiveMinimum;
    
    private int maxLength;
    
    private int minLength;
    
    private String pattern;
    
    private int maxItems;
    
    private int minItems;
    
    private boolean uniqueItems;
    
    private int multipleOf;
    
    private String[] enumValues;
    
    public static enum CollectionFormat{
	csv,
	tsv,
	ssv,
	pipes,
	multi,
	
    }
	    
    public static enum ParameterLocation{
	query, header, path, formData, body
    }
    
    
    
}
