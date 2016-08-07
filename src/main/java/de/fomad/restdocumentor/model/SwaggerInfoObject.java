package de.fomad.restdocumentor.model;

/**
 *
 * @author binary gamura
 */
public class SwaggerInfoObject 
{
    private String title;
    
    private String description;
    
    private String termsOfService;
    
    private String version;
    
    private SwaggerContactObject contact;
    
    private SwaggerLicenceObject license;

    public String getTitle()
    {
	return title;
    }

    public void setTitle(String title)
    {
	this.title = title;
    }

    public String getDescription()
    {
	return description;
    }

    public void setDescription(String description)
    {
	this.description = description;
    }

    public String getTermsOfService()
    {
	return termsOfService;
    }

    public void setTermsOfService(String termsOfService)
    {
	this.termsOfService = termsOfService;
    }

    public String getVersion()
    {
	return version;
    }

    public void setVersion(String version)
    {
	this.version = version;
    }

    public SwaggerContactObject getContact()
    {
	return contact;
    }

    public void setContact(SwaggerContactObject contact)
    {
	this.contact = contact;
    }

    public SwaggerLicenceObject getLicense()
    {
	return license;
    }

    public void setLicense(SwaggerLicenceObject license)
    {
	this.license = license;
    }
    
    
    
    
}
