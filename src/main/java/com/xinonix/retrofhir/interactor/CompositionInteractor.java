package com.xinonix.retrofhir.interactor;

import java.util.Date;
import com.xinonix.hl7.fhir.stu3.CodeableConcept;
import com.xinonix.hl7.fhir.stu3.Composition.Status;
import com.xinonix.hl7.fhir.stu3.Identifier;

import com.xinonix.retrofhir.Parameters;
import com.xinonix.retrofhir.Prefix;
import com.xinonix.retrofhir.Modifier;
import com.xinonix.retrofhir.service.CompositionService;

import com.xinonix.hl7.fhir.stu3.Composition;

public class CompositionInteractor extends ResourceInteractor<CompositionService, Composition> {

    public static class CompositionComposer extends Composer<CompositionService, Composition, CompositionComposer> {

        public CompositionComposer()
        {
            super((Class) CompositionService.class, (Class) Composition.class);
        }

		public ResourceInteractor.Composer setClass(Modifier modifier, Prefix prefix, CodeableConcept Class)
		{
			return setParameter(Parameters.CLASS, modifier, prefix, Class);
		}

		public ResourceInteractor.Composer setClass(Modifier modifier, CodeableConcept Class)
		{
			return setParameter(Parameters.CLASS, modifier, Class);
		}

		public ResourceInteractor.Composer setClass(Prefix prefix, CodeableConcept Class)
		{
			return setParameter(Parameters.CLASS, prefix, Class);
		}
        			
		public ResourceInteractor.Composer setClass(CodeableConcept Class)
		{
			return setParameter(Parameters.CLASS, Class);
		}

		public ResourceInteractor.Composer setConfidentiality(Modifier modifier, Prefix prefix, String Confidentiality)
		{
			return setParameter(Parameters.CONFIDENTIALITY, modifier, prefix, Confidentiality);
		}

		public ResourceInteractor.Composer setConfidentiality(Modifier modifier, String Confidentiality)
		{
			return setParameter(Parameters.CONFIDENTIALITY, modifier, Confidentiality);
		}

		public ResourceInteractor.Composer setConfidentiality(Prefix prefix, String Confidentiality)
		{
			return setParameter(Parameters.CONFIDENTIALITY, prefix, Confidentiality);
		}
        			
		public ResourceInteractor.Composer setConfidentiality(String Confidentiality)
		{
			return setParameter(Parameters.CONFIDENTIALITY, Confidentiality);
		}

		public ResourceInteractor.Composer setContext(Modifier modifier, Prefix prefix, CodeableConcept Context)
		{
			return setParameter(Parameters.CONTEXT, modifier, prefix, Context);
		}

		public ResourceInteractor.Composer setContext(Modifier modifier, CodeableConcept Context)
		{
			return setParameter(Parameters.CONTEXT, modifier, Context);
		}

		public ResourceInteractor.Composer setContext(Prefix prefix, CodeableConcept Context)
		{
			return setParameter(Parameters.CONTEXT, prefix, Context);
		}
        			
		public ResourceInteractor.Composer setContext(CodeableConcept Context)
		{
			return setParameter(Parameters.CONTEXT, Context);
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

		public ResourceInteractor.Composer setPeriod(Modifier modifier, Prefix prefix, Date Period)
		{
			return setParameter(Parameters.PERIOD, modifier, prefix, Period);
		}

		public ResourceInteractor.Composer setPeriod(Modifier modifier, Date Period)
		{
			return setParameter(Parameters.PERIOD, modifier, Period);
		}

		public ResourceInteractor.Composer setPeriod(Prefix prefix, Date Period)
		{
			return setParameter(Parameters.PERIOD, prefix, Period);
		}
        			
		public ResourceInteractor.Composer setPeriod(Date Period)
		{
			return setParameter(Parameters.PERIOD, Period);
		}

		public ResourceInteractor.Composer setRelatedId(Modifier modifier, Prefix prefix, Identifier RelatedId)
		{
			return setParameter(Parameters.RELATED_ID, modifier, prefix, RelatedId);
		}

		public ResourceInteractor.Composer setRelatedId(Modifier modifier, Identifier RelatedId)
		{
			return setParameter(Parameters.RELATED_ID, modifier, RelatedId);
		}

		public ResourceInteractor.Composer setRelatedId(Prefix prefix, Identifier RelatedId)
		{
			return setParameter(Parameters.RELATED_ID, prefix, RelatedId);
		}
        			
		public ResourceInteractor.Composer setRelatedId(Identifier RelatedId)
		{
			return setParameter(Parameters.RELATED_ID, RelatedId);
		}

		public ResourceInteractor.Composer setSection(Modifier modifier, Prefix prefix, CodeableConcept Section)
		{
			return setParameter(Parameters.SECTION, modifier, prefix, Section);
		}

		public ResourceInteractor.Composer setSection(Modifier modifier, CodeableConcept Section)
		{
			return setParameter(Parameters.SECTION, modifier, Section);
		}

		public ResourceInteractor.Composer setSection(Prefix prefix, CodeableConcept Section)
		{
			return setParameter(Parameters.SECTION, prefix, Section);
		}
        			
		public ResourceInteractor.Composer setSection(CodeableConcept Section)
		{
			return setParameter(Parameters.SECTION, Section);
		}

		public ResourceInteractor.Composer setStatus(Modifier modifier, Prefix prefix, Composition.Status Status)
		{
			return setParameter(Parameters.STATUS, modifier, prefix, Status);
		}

		public ResourceInteractor.Composer setStatus(Modifier modifier, Composition.Status Status)
		{
			return setParameter(Parameters.STATUS, modifier, Status);
		}

		public ResourceInteractor.Composer setStatus(Prefix prefix, Composition.Status Status)
		{
			return setParameter(Parameters.STATUS, prefix, Status);
		}
        			
		public ResourceInteractor.Composer setStatus(Composition.Status Status)
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

		public ResourceInteractor.Composer setType(Modifier modifier, Prefix prefix, CodeableConcept Type)
		{
			return setParameter(Parameters.TYPE, modifier, prefix, Type);
		}

		public ResourceInteractor.Composer setType(Modifier modifier, CodeableConcept Type)
		{
			return setParameter(Parameters.TYPE, modifier, Type);
		}

		public ResourceInteractor.Composer setType(Prefix prefix, CodeableConcept Type)
		{
			return setParameter(Parameters.TYPE, prefix, Type);
		}
        			
		public ResourceInteractor.Composer setType(CodeableConcept Type)
		{
			return setParameter(Parameters.TYPE, Type);
		}

    }

    public static <T> CompositionInteractor.CompositionComposer Composer()
    {
        return new CompositionComposer();
    }

}