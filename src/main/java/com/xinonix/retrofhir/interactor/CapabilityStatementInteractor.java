package com.xinonix.retrofhir.interactor;

import java.util.Date;
import com.xinonix.hl7.fhir.stu3.CapabilityStatement.Status;
import com.xinonix.hl7.fhir.stu3.CapabilityStatementRest;
import com.xinonix.hl7.fhir.stu3.CapabilityStatementRest.Mode;
import com.xinonix.hl7.fhir.stu3.CodeableConcept;
import com.xinonix.hl7.fhir.stu3.Coding;

import com.xinonix.retrofhir.Parameters;
import com.xinonix.retrofhir.Prefix;
import com.xinonix.retrofhir.Modifier;
import com.xinonix.retrofhir.service.CapabilityStatementService;

import com.xinonix.hl7.fhir.stu3.CapabilityStatement;

public class CapabilityStatementInteractor extends ResourceInteractor<CapabilityStatementService, CapabilityStatement> {

    public static class CapabilityStatementComposer extends Composer<CapabilityStatementService, CapabilityStatement, CapabilityStatementComposer> {

        public CapabilityStatementComposer()
        {
            super((Class) CapabilityStatementService.class, (Class) CapabilityStatement.class);
        }

		public ResourceInteractor.Composer setDate(Modifier modifier, Prefix prefix, Date Date)
		{
			return setParameter(Parameters.DATE, modifier, prefix, Date);
		}

		public ResourceInteractor.Composer setDate(Modifier modifier, Date Date)
		{
			return setParameter(Parameters.DATE, modifier, Date);
		}

		public ResourceInteractor.Composer setDate(Prefix prefix, Date Date)
		{
			return setParameter(Parameters.DATE, prefix, Date);
		}
        			
		public ResourceInteractor.Composer setDate(Date Date)
		{
			return setParameter(Parameters.DATE, Date);
		}

		public ResourceInteractor.Composer setDescription(Modifier modifier, Prefix prefix, String Description)
		{
			return setParameter(Parameters.DESCRIPTION, modifier, prefix, Description);
		}

		public ResourceInteractor.Composer setDescription(Modifier modifier, String Description)
		{
			return setParameter(Parameters.DESCRIPTION, modifier, Description);
		}

		public ResourceInteractor.Composer setDescription(Prefix prefix, String Description)
		{
			return setParameter(Parameters.DESCRIPTION, prefix, Description);
		}
        			
		public ResourceInteractor.Composer setDescription(String Description)
		{
			return setParameter(Parameters.DESCRIPTION, Description);
		}

		public ResourceInteractor.Composer setEvent(Modifier modifier, Prefix prefix, Coding Event)
		{
			return setParameter(Parameters.EVENT, modifier, prefix, Event);
		}

		public ResourceInteractor.Composer setEvent(Modifier modifier, Coding Event)
		{
			return setParameter(Parameters.EVENT, modifier, Event);
		}

		public ResourceInteractor.Composer setEvent(Prefix prefix, Coding Event)
		{
			return setParameter(Parameters.EVENT, prefix, Event);
		}
        			
		public ResourceInteractor.Composer setEvent(Coding Event)
		{
			return setParameter(Parameters.EVENT, Event);
		}

		public ResourceInteractor.Composer setFhirversion(Modifier modifier, Prefix prefix, String Fhirversion)
		{
			return setParameter(Parameters.FHIRVERSION, modifier, prefix, Fhirversion);
		}

		public ResourceInteractor.Composer setFhirversion(Modifier modifier, String Fhirversion)
		{
			return setParameter(Parameters.FHIRVERSION, modifier, Fhirversion);
		}

		public ResourceInteractor.Composer setFhirversion(Prefix prefix, String Fhirversion)
		{
			return setParameter(Parameters.FHIRVERSION, prefix, Fhirversion);
		}
        			
		public ResourceInteractor.Composer setFhirversion(String Fhirversion)
		{
			return setParameter(Parameters.FHIRVERSION, Fhirversion);
		}

		public ResourceInteractor.Composer setFormat(Modifier modifier, Prefix prefix, String Format)
		{
			return setParameter(Parameters.FORMAT, modifier, prefix, Format);
		}

		public ResourceInteractor.Composer setFormat(Modifier modifier, String Format)
		{
			return setParameter(Parameters.FORMAT, modifier, Format);
		}

		public ResourceInteractor.Composer setFormat(Prefix prefix, String Format)
		{
			return setParameter(Parameters.FORMAT, prefix, Format);
		}
        			
		public ResourceInteractor.Composer setFormat(String Format)
		{
			return setParameter(Parameters.FORMAT, Format);
		}

		public ResourceInteractor.Composer setGuide(Modifier modifier, Prefix prefix, String Guide)
		{
			return setParameter(Parameters.GUIDE, modifier, prefix, Guide);
		}

		public ResourceInteractor.Composer setGuide(Modifier modifier, String Guide)
		{
			return setParameter(Parameters.GUIDE, modifier, Guide);
		}

		public ResourceInteractor.Composer setGuide(Prefix prefix, String Guide)
		{
			return setParameter(Parameters.GUIDE, prefix, Guide);
		}
        			
		public ResourceInteractor.Composer setGuide(String Guide)
		{
			return setParameter(Parameters.GUIDE, Guide);
		}

		public ResourceInteractor.Composer setJurisdiction(Modifier modifier, Prefix prefix, CodeableConcept Jurisdiction)
		{
			return setParameter(Parameters.JURISDICTION, modifier, prefix, Jurisdiction);
		}

		public ResourceInteractor.Composer setJurisdiction(Modifier modifier, CodeableConcept Jurisdiction)
		{
			return setParameter(Parameters.JURISDICTION, modifier, Jurisdiction);
		}

		public ResourceInteractor.Composer setJurisdiction(Prefix prefix, CodeableConcept Jurisdiction)
		{
			return setParameter(Parameters.JURISDICTION, prefix, Jurisdiction);
		}
        			
		public ResourceInteractor.Composer setJurisdiction(CodeableConcept Jurisdiction)
		{
			return setParameter(Parameters.JURISDICTION, Jurisdiction);
		}

		public ResourceInteractor.Composer setMode(Modifier modifier, Prefix prefix, CapabilityStatementRest.Mode Mode)
		{
			return setParameter(Parameters.MODE, modifier, prefix, Mode);
		}

		public ResourceInteractor.Composer setMode(Modifier modifier, CapabilityStatementRest.Mode Mode)
		{
			return setParameter(Parameters.MODE, modifier, Mode);
		}

		public ResourceInteractor.Composer setMode(Prefix prefix, CapabilityStatementRest.Mode Mode)
		{
			return setParameter(Parameters.MODE, prefix, Mode);
		}
        			
		public ResourceInteractor.Composer setMode(CapabilityStatementRest.Mode Mode)
		{
			return setParameter(Parameters.MODE, Mode);
		}

		public ResourceInteractor.Composer setName(Modifier modifier, Prefix prefix, String Name)
		{
			return setParameter(Parameters.NAME, modifier, prefix, Name);
		}

		public ResourceInteractor.Composer setName(Modifier modifier, String Name)
		{
			return setParameter(Parameters.NAME, modifier, Name);
		}

		public ResourceInteractor.Composer setName(Prefix prefix, String Name)
		{
			return setParameter(Parameters.NAME, prefix, Name);
		}
        			
		public ResourceInteractor.Composer setName(String Name)
		{
			return setParameter(Parameters.NAME, Name);
		}

		public ResourceInteractor.Composer setPublisher(Modifier modifier, Prefix prefix, String Publisher)
		{
			return setParameter(Parameters.PUBLISHER, modifier, prefix, Publisher);
		}

		public ResourceInteractor.Composer setPublisher(Modifier modifier, String Publisher)
		{
			return setParameter(Parameters.PUBLISHER, modifier, Publisher);
		}

		public ResourceInteractor.Composer setPublisher(Prefix prefix, String Publisher)
		{
			return setParameter(Parameters.PUBLISHER, prefix, Publisher);
		}
        			
		public ResourceInteractor.Composer setPublisher(String Publisher)
		{
			return setParameter(Parameters.PUBLISHER, Publisher);
		}

		public ResourceInteractor.Composer setResource(Modifier modifier, Prefix prefix, String Resource)
		{
			return setParameter(Parameters.RESOURCE, modifier, prefix, Resource);
		}

		public ResourceInteractor.Composer setResource(Modifier modifier, String Resource)
		{
			return setParameter(Parameters.RESOURCE, modifier, Resource);
		}

		public ResourceInteractor.Composer setResource(Prefix prefix, String Resource)
		{
			return setParameter(Parameters.RESOURCE, prefix, Resource);
		}
        			
		public ResourceInteractor.Composer setResource(String Resource)
		{
			return setParameter(Parameters.RESOURCE, Resource);
		}

		public ResourceInteractor.Composer setSecurityService(Modifier modifier, Prefix prefix, CodeableConcept SecurityService)
		{
			return setParameter(Parameters.SECURITY_SERVICE, modifier, prefix, SecurityService);
		}

		public ResourceInteractor.Composer setSecurityService(Modifier modifier, CodeableConcept SecurityService)
		{
			return setParameter(Parameters.SECURITY_SERVICE, modifier, SecurityService);
		}

		public ResourceInteractor.Composer setSecurityService(Prefix prefix, CodeableConcept SecurityService)
		{
			return setParameter(Parameters.SECURITY_SERVICE, prefix, SecurityService);
		}
        			
		public ResourceInteractor.Composer setSecurityService(CodeableConcept SecurityService)
		{
			return setParameter(Parameters.SECURITY_SERVICE, SecurityService);
		}

		public ResourceInteractor.Composer setSoftware(Modifier modifier, Prefix prefix, String Software)
		{
			return setParameter(Parameters.SOFTWARE, modifier, prefix, Software);
		}

		public ResourceInteractor.Composer setSoftware(Modifier modifier, String Software)
		{
			return setParameter(Parameters.SOFTWARE, modifier, Software);
		}

		public ResourceInteractor.Composer setSoftware(Prefix prefix, String Software)
		{
			return setParameter(Parameters.SOFTWARE, prefix, Software);
		}
        			
		public ResourceInteractor.Composer setSoftware(String Software)
		{
			return setParameter(Parameters.SOFTWARE, Software);
		}

		public ResourceInteractor.Composer setStatus(Modifier modifier, Prefix prefix, CapabilityStatement.Status Status)
		{
			return setParameter(Parameters.STATUS, modifier, prefix, Status);
		}

		public ResourceInteractor.Composer setStatus(Modifier modifier, CapabilityStatement.Status Status)
		{
			return setParameter(Parameters.STATUS, modifier, Status);
		}

		public ResourceInteractor.Composer setStatus(Prefix prefix, CapabilityStatement.Status Status)
		{
			return setParameter(Parameters.STATUS, prefix, Status);
		}
        			
		public ResourceInteractor.Composer setStatus(CapabilityStatement.Status Status)
		{
			return setParameter(Parameters.STATUS, Status);
		}

		public ResourceInteractor.Composer setTitle(Modifier modifier, Prefix prefix, String Title)
		{
			return setParameter(Parameters.TITLE, modifier, prefix, Title);
		}

		public ResourceInteractor.Composer setTitle(Modifier modifier, String Title)
		{
			return setParameter(Parameters.TITLE, modifier, Title);
		}

		public ResourceInteractor.Composer setTitle(Prefix prefix, String Title)
		{
			return setParameter(Parameters.TITLE, prefix, Title);
		}
        			
		public ResourceInteractor.Composer setTitle(String Title)
		{
			return setParameter(Parameters.TITLE, Title);
		}

		public ResourceInteractor.Composer setUrl(Modifier modifier, Prefix prefix, String Url)
		{
			return setParameter(Parameters.URL, modifier, prefix, Url);
		}

		public ResourceInteractor.Composer setUrl(Modifier modifier, String Url)
		{
			return setParameter(Parameters.URL, modifier, Url);
		}

		public ResourceInteractor.Composer setUrl(Prefix prefix, String Url)
		{
			return setParameter(Parameters.URL, prefix, Url);
		}
        			
		public ResourceInteractor.Composer setUrl(String Url)
		{
			return setParameter(Parameters.URL, Url);
		}

		public ResourceInteractor.Composer setVersion(Modifier modifier, Prefix prefix, String Version)
		{
			return setParameter(Parameters.VERSION, modifier, prefix, Version);
		}

		public ResourceInteractor.Composer setVersion(Modifier modifier, String Version)
		{
			return setParameter(Parameters.VERSION, modifier, Version);
		}

		public ResourceInteractor.Composer setVersion(Prefix prefix, String Version)
		{
			return setParameter(Parameters.VERSION, prefix, Version);
		}
        			
		public ResourceInteractor.Composer setVersion(String Version)
		{
			return setParameter(Parameters.VERSION, Version);
		}

    }

    public static <T> CapabilityStatementInteractor.CapabilityStatementComposer Composer()
    {
        return new CapabilityStatementComposer();
    }

}