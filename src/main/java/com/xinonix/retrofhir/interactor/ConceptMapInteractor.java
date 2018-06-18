package com.xinonix.retrofhir.interactor;

import java.util.Date;
import com.xinonix.hl7.fhir.stu3.CodeableConcept;
import com.xinonix.hl7.fhir.stu3.ConceptMap.Status;
import com.xinonix.hl7.fhir.stu3.Identifier;

import com.xinonix.retrofhir.Parameters;
import com.xinonix.retrofhir.Prefix;
import com.xinonix.retrofhir.Modifier;
import com.xinonix.retrofhir.service.ConceptMapService;

import com.xinonix.hl7.fhir.stu3.ConceptMap;

public class ConceptMapInteractor extends ResourceInteractor<ConceptMapService, ConceptMap> {

    public static class ConceptMapComposer extends Composer<ConceptMapService, ConceptMap, ConceptMapComposer> {

        public ConceptMapComposer()
        {
            super((Class) ConceptMapService.class, (Class) ConceptMap.class);
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

		public ResourceInteractor.Composer setDependson(Modifier modifier, Prefix prefix, String Dependson)
		{
			return setParameter(Parameters.DEPENDSON, modifier, prefix, Dependson);
		}

		public ResourceInteractor.Composer setDependson(Modifier modifier, String Dependson)
		{
			return setParameter(Parameters.DEPENDSON, modifier, Dependson);
		}

		public ResourceInteractor.Composer setDependson(Prefix prefix, String Dependson)
		{
			return setParameter(Parameters.DEPENDSON, prefix, Dependson);
		}
        			
		public ResourceInteractor.Composer setDependson(String Dependson)
		{
			return setParameter(Parameters.DEPENDSON, Dependson);
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

		public ResourceInteractor.Composer setOther(Modifier modifier, Prefix prefix, String Other)
		{
			return setParameter(Parameters.OTHER, modifier, prefix, Other);
		}

		public ResourceInteractor.Composer setOther(Modifier modifier, String Other)
		{
			return setParameter(Parameters.OTHER, modifier, Other);
		}

		public ResourceInteractor.Composer setOther(Prefix prefix, String Other)
		{
			return setParameter(Parameters.OTHER, prefix, Other);
		}
        			
		public ResourceInteractor.Composer setOther(String Other)
		{
			return setParameter(Parameters.OTHER, Other);
		}

		public ResourceInteractor.Composer setProduct(Modifier modifier, Prefix prefix, String Product)
		{
			return setParameter(Parameters.PRODUCT, modifier, prefix, Product);
		}

		public ResourceInteractor.Composer setProduct(Modifier modifier, String Product)
		{
			return setParameter(Parameters.PRODUCT, modifier, Product);
		}

		public ResourceInteractor.Composer setProduct(Prefix prefix, String Product)
		{
			return setParameter(Parameters.PRODUCT, prefix, Product);
		}
        			
		public ResourceInteractor.Composer setProduct(String Product)
		{
			return setParameter(Parameters.PRODUCT, Product);
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

		public ResourceInteractor.Composer setSourceCode(Modifier modifier, Prefix prefix, String SourceCode)
		{
			return setParameter(Parameters.SOURCE_CODE, modifier, prefix, SourceCode);
		}

		public ResourceInteractor.Composer setSourceCode(Modifier modifier, String SourceCode)
		{
			return setParameter(Parameters.SOURCE_CODE, modifier, SourceCode);
		}

		public ResourceInteractor.Composer setSourceCode(Prefix prefix, String SourceCode)
		{
			return setParameter(Parameters.SOURCE_CODE, prefix, SourceCode);
		}
        			
		public ResourceInteractor.Composer setSourceCode(String SourceCode)
		{
			return setParameter(Parameters.SOURCE_CODE, SourceCode);
		}

		public ResourceInteractor.Composer setSourceSystem(Modifier modifier, Prefix prefix, String SourceSystem)
		{
			return setParameter(Parameters.SOURCE_SYSTEM, modifier, prefix, SourceSystem);
		}

		public ResourceInteractor.Composer setSourceSystem(Modifier modifier, String SourceSystem)
		{
			return setParameter(Parameters.SOURCE_SYSTEM, modifier, SourceSystem);
		}

		public ResourceInteractor.Composer setSourceSystem(Prefix prefix, String SourceSystem)
		{
			return setParameter(Parameters.SOURCE_SYSTEM, prefix, SourceSystem);
		}
        			
		public ResourceInteractor.Composer setSourceSystem(String SourceSystem)
		{
			return setParameter(Parameters.SOURCE_SYSTEM, SourceSystem);
		}

		public ResourceInteractor.Composer setStatus(Modifier modifier, Prefix prefix, ConceptMap.Status Status)
		{
			return setParameter(Parameters.STATUS, modifier, prefix, Status);
		}

		public ResourceInteractor.Composer setStatus(Modifier modifier, ConceptMap.Status Status)
		{
			return setParameter(Parameters.STATUS, modifier, Status);
		}

		public ResourceInteractor.Composer setStatus(Prefix prefix, ConceptMap.Status Status)
		{
			return setParameter(Parameters.STATUS, prefix, Status);
		}
        			
		public ResourceInteractor.Composer setStatus(ConceptMap.Status Status)
		{
			return setParameter(Parameters.STATUS, Status);
		}

		public ResourceInteractor.Composer setTargetCode(Modifier modifier, Prefix prefix, String TargetCode)
		{
			return setParameter(Parameters.TARGET_CODE, modifier, prefix, TargetCode);
		}

		public ResourceInteractor.Composer setTargetCode(Modifier modifier, String TargetCode)
		{
			return setParameter(Parameters.TARGET_CODE, modifier, TargetCode);
		}

		public ResourceInteractor.Composer setTargetCode(Prefix prefix, String TargetCode)
		{
			return setParameter(Parameters.TARGET_CODE, prefix, TargetCode);
		}
        			
		public ResourceInteractor.Composer setTargetCode(String TargetCode)
		{
			return setParameter(Parameters.TARGET_CODE, TargetCode);
		}

		public ResourceInteractor.Composer setTargetSystem(Modifier modifier, Prefix prefix, String TargetSystem)
		{
			return setParameter(Parameters.TARGET_SYSTEM, modifier, prefix, TargetSystem);
		}

		public ResourceInteractor.Composer setTargetSystem(Modifier modifier, String TargetSystem)
		{
			return setParameter(Parameters.TARGET_SYSTEM, modifier, TargetSystem);
		}

		public ResourceInteractor.Composer setTargetSystem(Prefix prefix, String TargetSystem)
		{
			return setParameter(Parameters.TARGET_SYSTEM, prefix, TargetSystem);
		}
        			
		public ResourceInteractor.Composer setTargetSystem(String TargetSystem)
		{
			return setParameter(Parameters.TARGET_SYSTEM, TargetSystem);
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

    public static <T> ConceptMapInteractor.ConceptMapComposer Composer()
    {
        return new ConceptMapComposer();
    }

}