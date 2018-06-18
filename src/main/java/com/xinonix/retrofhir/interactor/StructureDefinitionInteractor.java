package com.xinonix.retrofhir.interactor;

import java.util.Date;
import com.xinonix.hl7.fhir.stu3.CodeableConcept;
import com.xinonix.hl7.fhir.stu3.Coding;
import com.xinonix.hl7.fhir.stu3.Identifier;
import com.xinonix.hl7.fhir.stu3.StructureDefinition.ContextType;
import com.xinonix.hl7.fhir.stu3.StructureDefinition.Derivation;
import com.xinonix.hl7.fhir.stu3.StructureDefinition.Kind;
import com.xinonix.hl7.fhir.stu3.StructureDefinition.Status;

import com.xinonix.retrofhir.Parameters;
import com.xinonix.retrofhir.Prefix;
import com.xinonix.retrofhir.Modifier;
import com.xinonix.retrofhir.service.StructureDefinitionService;

import com.xinonix.hl7.fhir.stu3.StructureDefinition;

public class StructureDefinitionInteractor extends ResourceInteractor<StructureDefinitionService, StructureDefinition> {

    public static class StructureDefinitionComposer extends Composer<StructureDefinitionService, StructureDefinition, StructureDefinitionComposer> {

        public StructureDefinitionComposer()
        {
            super((Class) StructureDefinitionService.class, (Class) StructureDefinition.class);
        }

		public ResourceInteractor.Composer setAbstract(Modifier modifier, Prefix prefix, Boolean Abstract)
		{
			return setParameter(Parameters.ABSTRACT, modifier, prefix, Abstract);
		}

		public ResourceInteractor.Composer setAbstract(Modifier modifier, Boolean Abstract)
		{
			return setParameter(Parameters.ABSTRACT, modifier, Abstract);
		}

		public ResourceInteractor.Composer setAbstract(Prefix prefix, Boolean Abstract)
		{
			return setParameter(Parameters.ABSTRACT, prefix, Abstract);
		}
        			
		public ResourceInteractor.Composer setAbstract(Boolean Abstract)
		{
			return setParameter(Parameters.ABSTRACT, Abstract);
		}

		public ResourceInteractor.Composer setBase(Modifier modifier, Prefix prefix, String Base)
		{
			return setParameter(Parameters.BASE, modifier, prefix, Base);
		}

		public ResourceInteractor.Composer setBase(Modifier modifier, String Base)
		{
			return setParameter(Parameters.BASE, modifier, Base);
		}

		public ResourceInteractor.Composer setBase(Prefix prefix, String Base)
		{
			return setParameter(Parameters.BASE, prefix, Base);
		}
        			
		public ResourceInteractor.Composer setBase(String Base)
		{
			return setParameter(Parameters.BASE, Base);
		}

		public ResourceInteractor.Composer setBasePath(Modifier modifier, Prefix prefix, String BasePath)
		{
			return setParameter(Parameters.BASE_PATH, modifier, prefix, BasePath);
		}

		public ResourceInteractor.Composer setBasePath(Modifier modifier, String BasePath)
		{
			return setParameter(Parameters.BASE_PATH, modifier, BasePath);
		}

		public ResourceInteractor.Composer setBasePath(Prefix prefix, String BasePath)
		{
			return setParameter(Parameters.BASE_PATH, prefix, BasePath);
		}
        			
		public ResourceInteractor.Composer setBasePath(String BasePath)
		{
			return setParameter(Parameters.BASE_PATH, BasePath);
		}

		public ResourceInteractor.Composer setContextType(Modifier modifier, Prefix prefix, StructureDefinition.ContextType ContextType)
		{
			return setParameter(Parameters.CONTEXT_TYPE, modifier, prefix, ContextType);
		}

		public ResourceInteractor.Composer setContextType(Modifier modifier, StructureDefinition.ContextType ContextType)
		{
			return setParameter(Parameters.CONTEXT_TYPE, modifier, ContextType);
		}

		public ResourceInteractor.Composer setContextType(Prefix prefix, StructureDefinition.ContextType ContextType)
		{
			return setParameter(Parameters.CONTEXT_TYPE, prefix, ContextType);
		}
        			
		public ResourceInteractor.Composer setContextType(StructureDefinition.ContextType ContextType)
		{
			return setParameter(Parameters.CONTEXT_TYPE, ContextType);
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

		public ResourceInteractor.Composer setDerivation(Modifier modifier, Prefix prefix, StructureDefinition.Derivation Derivation)
		{
			return setParameter(Parameters.DERIVATION, modifier, prefix, Derivation);
		}

		public ResourceInteractor.Composer setDerivation(Modifier modifier, StructureDefinition.Derivation Derivation)
		{
			return setParameter(Parameters.DERIVATION, modifier, Derivation);
		}

		public ResourceInteractor.Composer setDerivation(Prefix prefix, StructureDefinition.Derivation Derivation)
		{
			return setParameter(Parameters.DERIVATION, prefix, Derivation);
		}
        			
		public ResourceInteractor.Composer setDerivation(StructureDefinition.Derivation Derivation)
		{
			return setParameter(Parameters.DERIVATION, Derivation);
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

		public ResourceInteractor.Composer setExperimental(Modifier modifier, Prefix prefix, Boolean Experimental)
		{
			return setParameter(Parameters.EXPERIMENTAL, modifier, prefix, Experimental);
		}

		public ResourceInteractor.Composer setExperimental(Modifier modifier, Boolean Experimental)
		{
			return setParameter(Parameters.EXPERIMENTAL, modifier, Experimental);
		}

		public ResourceInteractor.Composer setExperimental(Prefix prefix, Boolean Experimental)
		{
			return setParameter(Parameters.EXPERIMENTAL, prefix, Experimental);
		}
        			
		public ResourceInteractor.Composer setExperimental(Boolean Experimental)
		{
			return setParameter(Parameters.EXPERIMENTAL, Experimental);
		}

		public ResourceInteractor.Composer setExtContext(Modifier modifier, Prefix prefix, String ExtContext)
		{
			return setParameter(Parameters.EXT_CONTEXT, modifier, prefix, ExtContext);
		}

		public ResourceInteractor.Composer setExtContext(Modifier modifier, String ExtContext)
		{
			return setParameter(Parameters.EXT_CONTEXT, modifier, ExtContext);
		}

		public ResourceInteractor.Composer setExtContext(Prefix prefix, String ExtContext)
		{
			return setParameter(Parameters.EXT_CONTEXT, prefix, ExtContext);
		}
        			
		public ResourceInteractor.Composer setExtContext(String ExtContext)
		{
			return setParameter(Parameters.EXT_CONTEXT, ExtContext);
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

		public ResourceInteractor.Composer setKeyword(Modifier modifier, Prefix prefix, Coding Keyword)
		{
			return setParameter(Parameters.KEYWORD, modifier, prefix, Keyword);
		}

		public ResourceInteractor.Composer setKeyword(Modifier modifier, Coding Keyword)
		{
			return setParameter(Parameters.KEYWORD, modifier, Keyword);
		}

		public ResourceInteractor.Composer setKeyword(Prefix prefix, Coding Keyword)
		{
			return setParameter(Parameters.KEYWORD, prefix, Keyword);
		}
        			
		public ResourceInteractor.Composer setKeyword(Coding Keyword)
		{
			return setParameter(Parameters.KEYWORD, Keyword);
		}

		public ResourceInteractor.Composer setKind(Modifier modifier, Prefix prefix, StructureDefinition.Kind Kind)
		{
			return setParameter(Parameters.KIND, modifier, prefix, Kind);
		}

		public ResourceInteractor.Composer setKind(Modifier modifier, StructureDefinition.Kind Kind)
		{
			return setParameter(Parameters.KIND, modifier, Kind);
		}

		public ResourceInteractor.Composer setKind(Prefix prefix, StructureDefinition.Kind Kind)
		{
			return setParameter(Parameters.KIND, prefix, Kind);
		}
        			
		public ResourceInteractor.Composer setKind(StructureDefinition.Kind Kind)
		{
			return setParameter(Parameters.KIND, Kind);
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

		public ResourceInteractor.Composer setPath(Modifier modifier, Prefix prefix, String Path)
		{
			return setParameter(Parameters.PATH, modifier, prefix, Path);
		}

		public ResourceInteractor.Composer setPath(Modifier modifier, String Path)
		{
			return setParameter(Parameters.PATH, modifier, Path);
		}

		public ResourceInteractor.Composer setPath(Prefix prefix, String Path)
		{
			return setParameter(Parameters.PATH, prefix, Path);
		}
        			
		public ResourceInteractor.Composer setPath(String Path)
		{
			return setParameter(Parameters.PATH, Path);
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

		public ResourceInteractor.Composer setStatus(Modifier modifier, Prefix prefix, StructureDefinition.Status Status)
		{
			return setParameter(Parameters.STATUS, modifier, prefix, Status);
		}

		public ResourceInteractor.Composer setStatus(Modifier modifier, StructureDefinition.Status Status)
		{
			return setParameter(Parameters.STATUS, modifier, Status);
		}

		public ResourceInteractor.Composer setStatus(Prefix prefix, StructureDefinition.Status Status)
		{
			return setParameter(Parameters.STATUS, prefix, Status);
		}
        			
		public ResourceInteractor.Composer setStatus(StructureDefinition.Status Status)
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

		public ResourceInteractor.Composer setType(Modifier modifier, Prefix prefix, String Type)
		{
			return setParameter(Parameters.TYPE, modifier, prefix, Type);
		}

		public ResourceInteractor.Composer setType(Modifier modifier, String Type)
		{
			return setParameter(Parameters.TYPE, modifier, Type);
		}

		public ResourceInteractor.Composer setType(Prefix prefix, String Type)
		{
			return setParameter(Parameters.TYPE, prefix, Type);
		}
        			
		public ResourceInteractor.Composer setType(String Type)
		{
			return setParameter(Parameters.TYPE, Type);
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

    public static <T> StructureDefinitionInteractor.StructureDefinitionComposer Composer()
    {
        return new StructureDefinitionComposer();
    }

}