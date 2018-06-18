package com.xinonix.retrofhir.interactor;

import java.util.Date;
import com.xinonix.hl7.fhir.stu3.CodeableConcept;
import com.xinonix.hl7.fhir.stu3.SearchParameter.Status;
import com.xinonix.hl7.fhir.stu3.SearchParameter.Type;

import com.xinonix.retrofhir.Parameters;
import com.xinonix.retrofhir.Prefix;
import com.xinonix.retrofhir.Modifier;
import com.xinonix.retrofhir.service.SearchParameterService;

import com.xinonix.hl7.fhir.stu3.SearchParameter;

public class SearchParameterInteractor extends ResourceInteractor<SearchParameterService, SearchParameter> {

    public static class SearchParameterComposer extends Composer<SearchParameterService, SearchParameter, SearchParameterComposer> {

        public SearchParameterComposer()
        {
            super((Class) SearchParameterService.class, (Class) SearchParameter.class);
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

		public ResourceInteractor.Composer setCode(Modifier modifier, Prefix prefix, String Code)
		{
			return setParameter(Parameters.CODE, modifier, prefix, Code);
		}

		public ResourceInteractor.Composer setCode(Modifier modifier, String Code)
		{
			return setParameter(Parameters.CODE, modifier, Code);
		}

		public ResourceInteractor.Composer setCode(Prefix prefix, String Code)
		{
			return setParameter(Parameters.CODE, prefix, Code);
		}
        			
		public ResourceInteractor.Composer setCode(String Code)
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

		public ResourceInteractor.Composer setDerivedFrom(Modifier modifier, Prefix prefix, String DerivedFrom)
		{
			return setParameter(Parameters.DERIVED_FROM, modifier, prefix, DerivedFrom);
		}

		public ResourceInteractor.Composer setDerivedFrom(Modifier modifier, String DerivedFrom)
		{
			return setParameter(Parameters.DERIVED_FROM, modifier, DerivedFrom);
		}

		public ResourceInteractor.Composer setDerivedFrom(Prefix prefix, String DerivedFrom)
		{
			return setParameter(Parameters.DERIVED_FROM, prefix, DerivedFrom);
		}
        			
		public ResourceInteractor.Composer setDerivedFrom(String DerivedFrom)
		{
			return setParameter(Parameters.DERIVED_FROM, DerivedFrom);
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

		public ResourceInteractor.Composer setStatus(Modifier modifier, Prefix prefix, SearchParameter.Status Status)
		{
			return setParameter(Parameters.STATUS, modifier, prefix, Status);
		}

		public ResourceInteractor.Composer setStatus(Modifier modifier, SearchParameter.Status Status)
		{
			return setParameter(Parameters.STATUS, modifier, Status);
		}

		public ResourceInteractor.Composer setStatus(Prefix prefix, SearchParameter.Status Status)
		{
			return setParameter(Parameters.STATUS, prefix, Status);
		}
        			
		public ResourceInteractor.Composer setStatus(SearchParameter.Status Status)
		{
			return setParameter(Parameters.STATUS, Status);
		}

		public ResourceInteractor.Composer setTarget(Modifier modifier, Prefix prefix, String Target)
		{
			return setParameter(Parameters.TARGET, modifier, prefix, Target);
		}

		public ResourceInteractor.Composer setTarget(Modifier modifier, String Target)
		{
			return setParameter(Parameters.TARGET, modifier, Target);
		}

		public ResourceInteractor.Composer setTarget(Prefix prefix, String Target)
		{
			return setParameter(Parameters.TARGET, prefix, Target);
		}
        			
		public ResourceInteractor.Composer setTarget(String Target)
		{
			return setParameter(Parameters.TARGET, Target);
		}

		public ResourceInteractor.Composer setType(Modifier modifier, Prefix prefix, SearchParameter.Type Type)
		{
			return setParameter(Parameters.TYPE, modifier, prefix, Type);
		}

		public ResourceInteractor.Composer setType(Modifier modifier, SearchParameter.Type Type)
		{
			return setParameter(Parameters.TYPE, modifier, Type);
		}

		public ResourceInteractor.Composer setType(Prefix prefix, SearchParameter.Type Type)
		{
			return setParameter(Parameters.TYPE, prefix, Type);
		}
        			
		public ResourceInteractor.Composer setType(SearchParameter.Type Type)
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

    public static <T> SearchParameterInteractor.SearchParameterComposer Composer()
    {
        return new SearchParameterComposer();
    }

}