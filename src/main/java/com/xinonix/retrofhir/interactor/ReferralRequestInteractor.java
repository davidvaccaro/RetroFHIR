package com.xinonix.retrofhir.interactor;

import java.util.Date;
import com.xinonix.hl7.fhir.stu3.CodeableConcept;
import com.xinonix.hl7.fhir.stu3.Identifier;

import com.xinonix.retrofhir.Parameters;
import com.xinonix.retrofhir.Prefix;
import com.xinonix.retrofhir.Modifier;
import com.xinonix.retrofhir.service.ReferralRequestService;

import com.xinonix.hl7.fhir.stu3.ReferralRequest;

public class ReferralRequestInteractor extends ResourceInteractor<ReferralRequestService, ReferralRequest> {

    public static class ReferralRequestComposer extends Composer<ReferralRequestService, ReferralRequest, ReferralRequestComposer> {

        public ReferralRequestComposer()
        {
            super((Class) ReferralRequestService.class, (Class) ReferralRequest.class);
        }

		public ResourceInteractor.Composer setAuthoredOn(Modifier modifier, Prefix prefix, Date AuthoredOn)
		{
			return setParameter(Parameters.AUTHORED_ON, modifier, prefix, AuthoredOn);
		}

		public ResourceInteractor.Composer setAuthoredOn(Modifier modifier, Date AuthoredOn)
		{
			return setParameter(Parameters.AUTHORED_ON, modifier, AuthoredOn);
		}

		public ResourceInteractor.Composer setAuthoredOn(Prefix prefix, Date AuthoredOn)
		{
			return setParameter(Parameters.AUTHORED_ON, prefix, AuthoredOn);
		}
        			
		public ResourceInteractor.Composer setAuthoredOn(Date AuthoredOn)
		{
			return setParameter(Parameters.AUTHORED_ON, AuthoredOn);
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

		public ResourceInteractor.Composer setIntent(Modifier modifier, Prefix prefix, String Intent)
		{
			return setParameter(Parameters.INTENT, modifier, prefix, Intent);
		}

		public ResourceInteractor.Composer setIntent(Modifier modifier, String Intent)
		{
			return setParameter(Parameters.INTENT, modifier, Intent);
		}

		public ResourceInteractor.Composer setIntent(Prefix prefix, String Intent)
		{
			return setParameter(Parameters.INTENT, prefix, Intent);
		}
        			
		public ResourceInteractor.Composer setIntent(String Intent)
		{
			return setParameter(Parameters.INTENT, Intent);
		}

		public ResourceInteractor.Composer setOccurrenceDate(Modifier modifier, Prefix prefix, Date OccurrenceDate)
		{
			return setParameter(Parameters.OCCURRENCE_DATE, modifier, prefix, OccurrenceDate);
		}

		public ResourceInteractor.Composer setOccurrenceDate(Modifier modifier, Date OccurrenceDate)
		{
			return setParameter(Parameters.OCCURRENCE_DATE, modifier, OccurrenceDate);
		}

		public ResourceInteractor.Composer setOccurrenceDate(Prefix prefix, Date OccurrenceDate)
		{
			return setParameter(Parameters.OCCURRENCE_DATE, prefix, OccurrenceDate);
		}
        			
		public ResourceInteractor.Composer setOccurrenceDate(Date OccurrenceDate)
		{
			return setParameter(Parameters.OCCURRENCE_DATE, OccurrenceDate);
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

		public ResourceInteractor.Composer setService(Modifier modifier, Prefix prefix, CodeableConcept Service)
		{
			return setParameter(Parameters.SERVICE, modifier, prefix, Service);
		}

		public ResourceInteractor.Composer setService(Modifier modifier, CodeableConcept Service)
		{
			return setParameter(Parameters.SERVICE, modifier, Service);
		}

		public ResourceInteractor.Composer setService(Prefix prefix, CodeableConcept Service)
		{
			return setParameter(Parameters.SERVICE, prefix, Service);
		}
        			
		public ResourceInteractor.Composer setService(CodeableConcept Service)
		{
			return setParameter(Parameters.SERVICE, Service);
		}

		public ResourceInteractor.Composer setSpecialty(Modifier modifier, Prefix prefix, CodeableConcept Specialty)
		{
			return setParameter(Parameters.SPECIALTY, modifier, prefix, Specialty);
		}

		public ResourceInteractor.Composer setSpecialty(Modifier modifier, CodeableConcept Specialty)
		{
			return setParameter(Parameters.SPECIALTY, modifier, Specialty);
		}

		public ResourceInteractor.Composer setSpecialty(Prefix prefix, CodeableConcept Specialty)
		{
			return setParameter(Parameters.SPECIALTY, prefix, Specialty);
		}
        			
		public ResourceInteractor.Composer setSpecialty(CodeableConcept Specialty)
		{
			return setParameter(Parameters.SPECIALTY, Specialty);
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

    public static <T> ReferralRequestInteractor.ReferralRequestComposer Composer()
    {
        return new ReferralRequestComposer();
    }

}