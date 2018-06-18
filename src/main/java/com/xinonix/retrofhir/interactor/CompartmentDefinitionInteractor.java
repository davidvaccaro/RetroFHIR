package com.xinonix.retrofhir.interactor;

import java.util.Date;
import com.xinonix.hl7.fhir.stu3.CodeableConcept;
import com.xinonix.hl7.fhir.stu3.CompartmentDefinition.Code;
import com.xinonix.hl7.fhir.stu3.CompartmentDefinition.Status;

import com.xinonix.retrofhir.Parameters;
import com.xinonix.retrofhir.Prefix;
import com.xinonix.retrofhir.Modifier;
import com.xinonix.retrofhir.service.CompartmentDefinitionService;

import com.xinonix.hl7.fhir.stu3.CompartmentDefinition;

public class CompartmentDefinitionInteractor extends ResourceInteractor<CompartmentDefinitionService, CompartmentDefinition> {

    public static class CompartmentDefinitionComposer extends Composer<CompartmentDefinitionService, CompartmentDefinition, CompartmentDefinitionComposer> {

        public CompartmentDefinitionComposer()
        {
            super((Class) CompartmentDefinitionService.class, (Class) CompartmentDefinition.class);
        }

		public ResourceInteractor.Composer setCode(Modifier modifier, Prefix prefix, CompartmentDefinition.Code Code)
		{
			return setParameter(Parameters.CODE, modifier, prefix, Code);
		}

		public ResourceInteractor.Composer setCode(Modifier modifier, CompartmentDefinition.Code Code)
		{
			return setParameter(Parameters.CODE, modifier, Code);
		}

		public ResourceInteractor.Composer setCode(Prefix prefix, CompartmentDefinition.Code Code)
		{
			return setParameter(Parameters.CODE, prefix, Code);
		}
        			
		public ResourceInteractor.Composer setCode(CompartmentDefinition.Code Code)
		{
			return setParameter(Parameters.CODE, Code);
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

		public ResourceInteractor.Composer setStatus(Modifier modifier, Prefix prefix, CompartmentDefinition.Status Status)
		{
			return setParameter(Parameters.STATUS, modifier, prefix, Status);
		}

		public ResourceInteractor.Composer setStatus(Modifier modifier, CompartmentDefinition.Status Status)
		{
			return setParameter(Parameters.STATUS, modifier, Status);
		}

		public ResourceInteractor.Composer setStatus(Prefix prefix, CompartmentDefinition.Status Status)
		{
			return setParameter(Parameters.STATUS, prefix, Status);
		}
        			
		public ResourceInteractor.Composer setStatus(CompartmentDefinition.Status Status)
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

    }

    public static <T> CompartmentDefinitionInteractor.CompartmentDefinitionComposer Composer()
    {
        return new CompartmentDefinitionComposer();
    }

}