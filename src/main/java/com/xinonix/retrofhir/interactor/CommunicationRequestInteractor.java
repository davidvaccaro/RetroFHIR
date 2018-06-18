package com.xinonix.retrofhir.interactor;

import java.util.Date;
import com.xinonix.hl7.fhir.stu3.CodeableConcept;
import com.xinonix.hl7.fhir.stu3.Identifier;

import com.xinonix.retrofhir.Parameters;
import com.xinonix.retrofhir.Prefix;
import com.xinonix.retrofhir.Modifier;
import com.xinonix.retrofhir.service.CommunicationRequestService;

import com.xinonix.hl7.fhir.stu3.CommunicationRequest;

public class CommunicationRequestInteractor extends ResourceInteractor<CommunicationRequestService, CommunicationRequest> {

    public static class CommunicationRequestComposer extends Composer<CommunicationRequestService, CommunicationRequest, CommunicationRequestComposer> {

        public CommunicationRequestComposer()
        {
            super((Class) CommunicationRequestService.class, (Class) CommunicationRequest.class);
        }

		public ResourceInteractor.Composer setAuthored(Modifier modifier, Prefix prefix, Date Authored)
		{
			return setParameter(Parameters.AUTHORED, modifier, prefix, Authored);
		}

		public ResourceInteractor.Composer setAuthored(Modifier modifier, Date Authored)
		{
			return setParameter(Parameters.AUTHORED, modifier, Authored);
		}

		public ResourceInteractor.Composer setAuthored(Prefix prefix, Date Authored)
		{
			return setParameter(Parameters.AUTHORED, prefix, Authored);
		}
        			
		public ResourceInteractor.Composer setAuthored(Date Authored)
		{
			return setParameter(Parameters.AUTHORED, Authored);
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

		public ResourceInteractor.Composer setGroupIdentifier(Modifier modifier, Prefix prefix, Identifier GroupIdentifier)
		{
			return setParameter(Parameters.GROUP_IDENTIFIER, modifier, prefix, GroupIdentifier);
		}

		public ResourceInteractor.Composer setGroupIdentifier(Modifier modifier, Identifier GroupIdentifier)
		{
			return setParameter(Parameters.GROUP_IDENTIFIER, modifier, GroupIdentifier);
		}

		public ResourceInteractor.Composer setGroupIdentifier(Prefix prefix, Identifier GroupIdentifier)
		{
			return setParameter(Parameters.GROUP_IDENTIFIER, prefix, GroupIdentifier);
		}
        			
		public ResourceInteractor.Composer setGroupIdentifier(Identifier GroupIdentifier)
		{
			return setParameter(Parameters.GROUP_IDENTIFIER, GroupIdentifier);
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

		public ResourceInteractor.Composer setMedium(Modifier modifier, Prefix prefix, CodeableConcept Medium)
		{
			return setParameter(Parameters.MEDIUM, modifier, prefix, Medium);
		}

		public ResourceInteractor.Composer setMedium(Modifier modifier, CodeableConcept Medium)
		{
			return setParameter(Parameters.MEDIUM, modifier, Medium);
		}

		public ResourceInteractor.Composer setMedium(Prefix prefix, CodeableConcept Medium)
		{
			return setParameter(Parameters.MEDIUM, prefix, Medium);
		}
        			
		public ResourceInteractor.Composer setMedium(CodeableConcept Medium)
		{
			return setParameter(Parameters.MEDIUM, Medium);
		}

		public ResourceInteractor.Composer setOccurrence(Modifier modifier, Prefix prefix, Date Occurrence)
		{
			return setParameter(Parameters.OCCURRENCE, modifier, prefix, Occurrence);
		}

		public ResourceInteractor.Composer setOccurrence(Modifier modifier, Date Occurrence)
		{
			return setParameter(Parameters.OCCURRENCE, modifier, Occurrence);
		}

		public ResourceInteractor.Composer setOccurrence(Prefix prefix, Date Occurrence)
		{
			return setParameter(Parameters.OCCURRENCE, prefix, Occurrence);
		}
        			
		public ResourceInteractor.Composer setOccurrence(Date Occurrence)
		{
			return setParameter(Parameters.OCCURRENCE, Occurrence);
		}

		public ResourceInteractor.Composer setPriority(Modifier modifier, Prefix prefix, String Priority)
		{
			return setParameter(Parameters.PRIORITY, modifier, prefix, Priority);
		}

		public ResourceInteractor.Composer setPriority(Modifier modifier, String Priority)
		{
			return setParameter(Parameters.PRIORITY, modifier, Priority);
		}

		public ResourceInteractor.Composer setPriority(Prefix prefix, String Priority)
		{
			return setParameter(Parameters.PRIORITY, prefix, Priority);
		}
        			
		public ResourceInteractor.Composer setPriority(String Priority)
		{
			return setParameter(Parameters.PRIORITY, Priority);
		}

		public ResourceInteractor.Composer setStatus(Modifier modifier, Prefix prefix, String Status)
		{
			return setParameter(Parameters.STATUS, modifier, prefix, Status);
		}

		public ResourceInteractor.Composer setStatus(Modifier modifier, String Status)
		{
			return setParameter(Parameters.STATUS, modifier, Status);
		}

		public ResourceInteractor.Composer setStatus(Prefix prefix, String Status)
		{
			return setParameter(Parameters.STATUS, prefix, Status);
		}
        			
		public ResourceInteractor.Composer setStatus(String Status)
		{
			return setParameter(Parameters.STATUS, Status);
		}

    }

    public static <T> CommunicationRequestInteractor.CommunicationRequestComposer Composer()
    {
        return new CommunicationRequestComposer();
    }

}