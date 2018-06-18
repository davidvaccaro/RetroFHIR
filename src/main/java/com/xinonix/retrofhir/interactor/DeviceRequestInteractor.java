package com.xinonix.retrofhir.interactor;

import java.util.Date;
import com.xinonix.hl7.fhir.stu3.CodeableConcept;
import com.xinonix.hl7.fhir.stu3.Identifier;

import com.xinonix.retrofhir.Parameters;
import com.xinonix.retrofhir.Prefix;
import com.xinonix.retrofhir.Modifier;
import com.xinonix.retrofhir.service.DeviceRequestService;

import com.xinonix.hl7.fhir.stu3.DeviceRequest;

public class DeviceRequestInteractor extends ResourceInteractor<DeviceRequestService, DeviceRequest> {

    public static class DeviceRequestComposer extends Composer<DeviceRequestService, DeviceRequest, DeviceRequestComposer> {

        public DeviceRequestComposer()
        {
            super((Class) DeviceRequestService.class, (Class) DeviceRequest.class);
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

		public ResourceInteractor.Composer setEventDate(Modifier modifier, Prefix prefix, Date EventDate)
		{
			return setParameter(Parameters.EVENT_DATE, modifier, prefix, EventDate);
		}

		public ResourceInteractor.Composer setEventDate(Modifier modifier, Date EventDate)
		{
			return setParameter(Parameters.EVENT_DATE, modifier, EventDate);
		}

		public ResourceInteractor.Composer setEventDate(Prefix prefix, Date EventDate)
		{
			return setParameter(Parameters.EVENT_DATE, prefix, EventDate);
		}
        			
		public ResourceInteractor.Composer setEventDate(Date EventDate)
		{
			return setParameter(Parameters.EVENT_DATE, EventDate);
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

		public ResourceInteractor.Composer setIntent(Modifier modifier, Prefix prefix, CodeableConcept Intent)
		{
			return setParameter(Parameters.INTENT, modifier, prefix, Intent);
		}

		public ResourceInteractor.Composer setIntent(Modifier modifier, CodeableConcept Intent)
		{
			return setParameter(Parameters.INTENT, modifier, Intent);
		}

		public ResourceInteractor.Composer setIntent(Prefix prefix, CodeableConcept Intent)
		{
			return setParameter(Parameters.INTENT, prefix, Intent);
		}
        			
		public ResourceInteractor.Composer setIntent(CodeableConcept Intent)
		{
			return setParameter(Parameters.INTENT, Intent);
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

    public static <T> DeviceRequestInteractor.DeviceRequestComposer Composer()
    {
        return new DeviceRequestComposer();
    }

}