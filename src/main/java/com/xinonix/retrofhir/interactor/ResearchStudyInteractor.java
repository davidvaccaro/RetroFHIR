package com.xinonix.retrofhir.interactor;

import java.util.Date;
import com.xinonix.hl7.fhir.stu3.CodeableConcept;
import com.xinonix.hl7.fhir.stu3.Identifier;
import com.xinonix.hl7.fhir.stu3.ResearchStudy.Status;

import com.xinonix.retrofhir.Parameters;
import com.xinonix.retrofhir.Prefix;
import com.xinonix.retrofhir.Modifier;
import com.xinonix.retrofhir.service.ResearchStudyService;

import com.xinonix.hl7.fhir.stu3.ResearchStudy;

public class ResearchStudyInteractor extends ResourceInteractor<ResearchStudyService, ResearchStudy> {

    public static class ResearchStudyComposer extends Composer<ResearchStudyService, ResearchStudy, ResearchStudyComposer> {

        public ResearchStudyComposer()
        {
            super((Class) ResearchStudyService.class, (Class) ResearchStudy.class);
        }

		public ResourceInteractor.Composer setCategory(Modifier modifier, Prefix prefix, CodeableConcept Category)
		{
			return setParameter(Parameters.CATEGORY, modifier, prefix, Category);
		}

		public ResourceInteractor.Composer setCategory(Modifier modifier, CodeableConcept Category)
		{
			return setParameter(Parameters.CATEGORY, modifier, Category);
		}

		public ResourceInteractor.Composer setCategory(Prefix prefix, CodeableConcept Category)
		{
			return setParameter(Parameters.CATEGORY, prefix, Category);
		}
        			
		public ResourceInteractor.Composer setCategory(CodeableConcept Category)
		{
			return setParameter(Parameters.CATEGORY, Category);
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

		public ResourceInteractor.Composer setFocus(Modifier modifier, Prefix prefix, CodeableConcept Focus)
		{
			return setParameter(Parameters.FOCUS, modifier, prefix, Focus);
		}

		public ResourceInteractor.Composer setFocus(Modifier modifier, CodeableConcept Focus)
		{
			return setParameter(Parameters.FOCUS, modifier, Focus);
		}

		public ResourceInteractor.Composer setFocus(Prefix prefix, CodeableConcept Focus)
		{
			return setParameter(Parameters.FOCUS, prefix, Focus);
		}
        			
		public ResourceInteractor.Composer setFocus(CodeableConcept Focus)
		{
			return setParameter(Parameters.FOCUS, Focus);
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

		public ResourceInteractor.Composer setKeyword(Modifier modifier, Prefix prefix, CodeableConcept Keyword)
		{
			return setParameter(Parameters.KEYWORD, modifier, prefix, Keyword);
		}

		public ResourceInteractor.Composer setKeyword(Modifier modifier, CodeableConcept Keyword)
		{
			return setParameter(Parameters.KEYWORD, modifier, Keyword);
		}

		public ResourceInteractor.Composer setKeyword(Prefix prefix, CodeableConcept Keyword)
		{
			return setParameter(Parameters.KEYWORD, prefix, Keyword);
		}
        			
		public ResourceInteractor.Composer setKeyword(CodeableConcept Keyword)
		{
			return setParameter(Parameters.KEYWORD, Keyword);
		}

		public ResourceInteractor.Composer setStatus(Modifier modifier, Prefix prefix, ResearchStudy.Status Status)
		{
			return setParameter(Parameters.STATUS, modifier, prefix, Status);
		}

		public ResourceInteractor.Composer setStatus(Modifier modifier, ResearchStudy.Status Status)
		{
			return setParameter(Parameters.STATUS, modifier, Status);
		}

		public ResourceInteractor.Composer setStatus(Prefix prefix, ResearchStudy.Status Status)
		{
			return setParameter(Parameters.STATUS, prefix, Status);
		}
        			
		public ResourceInteractor.Composer setStatus(ResearchStudy.Status Status)
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

    }

    public static <T> ResearchStudyInteractor.ResearchStudyComposer Composer()
    {
        return new ResearchStudyComposer();
    }

}