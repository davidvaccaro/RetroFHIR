package com.xinonix.retrofhir.interactor;

import java.util.Date;
import com.xinonix.hl7.fhir.stu3.CodeableConcept;
import com.xinonix.hl7.fhir.stu3.Identifier;
import com.xinonix.hl7.fhir.stu3.StructureMap.Status;

import com.xinonix.retrofhir.Parameters;
import com.xinonix.retrofhir.Prefix;
import com.xinonix.retrofhir.Modifier;
import com.xinonix.retrofhir.service.StructureMapService;

import com.xinonix.hl7.fhir.stu3.StructureMap;

public class StructureMapInteractor extends ResourceInteractor<StructureMapService, StructureMap> {

    public static class StructureMapComposer extends Composer<StructureMapService, StructureMap, StructureMapComposer> {

        public StructureMapComposer()
        {
            super((Class) StructureMapService.class, (Class) StructureMap.class);
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

		public ResourceInteractor.Composer setIdentifier(Modifier modifier, Prefix prefix, Identifier Identifier)
		{
			return setParameter(Parameters.IDENTIFIER, modifier, prefix, Identifier);
		}

		public ResourceInteractor.Composer setIdentifier(Modifier modifier, Identifier Identifier)
		{
			return setParameter(Parameters.IDENTIFIER, modifier, Identifier);
		}

		public ResourceInteractor.Composer setIdentifier(Prefix prefix, Identifier Identifier)
		{
			return setParameter(Parameters.IDENTIFIER, prefix, Identifier);
		}
        			
		public ResourceInteractor.Composer setIdentifier(Identifier Identifier)
		{
			return setParameter(Parameters.IDENTIFIER, Identifier);
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

		public ResourceInteractor.Composer setStatus(Modifier modifier, Prefix prefix, StructureMap.Status Status)
		{
			return setParameter(Parameters.STATUS, modifier, prefix, Status);
		}

		public ResourceInteractor.Composer setStatus(Modifier modifier, StructureMap.Status Status)
		{
			return setParameter(Parameters.STATUS, modifier, Status);
		}

		public ResourceInteractor.Composer setStatus(Prefix prefix, StructureMap.Status Status)
		{
			return setParameter(Parameters.STATUS, prefix, Status);
		}
        			
		public ResourceInteractor.Composer setStatus(StructureMap.Status Status)
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

    public static <T> StructureMapInteractor.StructureMapComposer Composer()
    {
        return new StructureMapComposer();
    }

}