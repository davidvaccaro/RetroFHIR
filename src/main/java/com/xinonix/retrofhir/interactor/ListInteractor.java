package com.xinonix.retrofhir.interactor;

import java.util.Date;
import com.xinonix.hl7.fhir.stu3.CodeableConcept;
import com.xinonix.hl7.fhir.stu3.Identifier;
import com.xinonix.hl7.fhir.stu3.List.Status;

import com.xinonix.retrofhir.Parameters;
import com.xinonix.retrofhir.Prefix;
import com.xinonix.retrofhir.Modifier;
import com.xinonix.retrofhir.service.ListService;

import com.xinonix.hl7.fhir.stu3.List;

public class ListInteractor extends ResourceInteractor<ListService, List> {

    public static class ListComposer extends Composer<ListService, List, ListComposer> {

        public ListComposer()
        {
            super((Class) ListService.class, (Class) List.class);
        }

		public ResourceInteractor.Composer setCode(Modifier modifier, Prefix prefix, CodeableConcept Code)
		{
			return setParameter(Parameters.CODE, modifier, prefix, Code);
		}

		public ResourceInteractor.Composer setCode(Modifier modifier, CodeableConcept Code)
		{
			return setParameter(Parameters.CODE, modifier, Code);
		}

		public ResourceInteractor.Composer setCode(Prefix prefix, CodeableConcept Code)
		{
			return setParameter(Parameters.CODE, prefix, Code);
		}
        			
		public ResourceInteractor.Composer setCode(CodeableConcept Code)
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

		public ResourceInteractor.Composer setEmptyReason(Modifier modifier, Prefix prefix, CodeableConcept EmptyReason)
		{
			return setParameter(Parameters.EMPTY_REASON, modifier, prefix, EmptyReason);
		}

		public ResourceInteractor.Composer setEmptyReason(Modifier modifier, CodeableConcept EmptyReason)
		{
			return setParameter(Parameters.EMPTY_REASON, modifier, EmptyReason);
		}

		public ResourceInteractor.Composer setEmptyReason(Prefix prefix, CodeableConcept EmptyReason)
		{
			return setParameter(Parameters.EMPTY_REASON, prefix, EmptyReason);
		}
        			
		public ResourceInteractor.Composer setEmptyReason(CodeableConcept EmptyReason)
		{
			return setParameter(Parameters.EMPTY_REASON, EmptyReason);
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

		public ResourceInteractor.Composer setNotes(Modifier modifier, Prefix prefix, String Notes)
		{
			return setParameter(Parameters.NOTES, modifier, prefix, Notes);
		}

		public ResourceInteractor.Composer setNotes(Modifier modifier, String Notes)
		{
			return setParameter(Parameters.NOTES, modifier, Notes);
		}

		public ResourceInteractor.Composer setNotes(Prefix prefix, String Notes)
		{
			return setParameter(Parameters.NOTES, prefix, Notes);
		}
        			
		public ResourceInteractor.Composer setNotes(String Notes)
		{
			return setParameter(Parameters.NOTES, Notes);
		}

		public ResourceInteractor.Composer setStatus(Modifier modifier, Prefix prefix, List.Status Status)
		{
			return setParameter(Parameters.STATUS, modifier, prefix, Status);
		}

		public ResourceInteractor.Composer setStatus(Modifier modifier, List.Status Status)
		{
			return setParameter(Parameters.STATUS, modifier, Status);
		}

		public ResourceInteractor.Composer setStatus(Prefix prefix, List.Status Status)
		{
			return setParameter(Parameters.STATUS, prefix, Status);
		}
        			
		public ResourceInteractor.Composer setStatus(List.Status Status)
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

    public static <T> ListInteractor.ListComposer Composer()
    {
        return new ListComposer();
    }

}