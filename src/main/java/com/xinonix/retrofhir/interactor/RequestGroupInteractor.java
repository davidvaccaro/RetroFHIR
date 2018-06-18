package com.xinonix.retrofhir.interactor;

import java.util.Date;
import com.xinonix.hl7.fhir.stu3.Identifier;

import com.xinonix.retrofhir.Parameters;
import com.xinonix.retrofhir.Prefix;
import com.xinonix.retrofhir.Modifier;
import com.xinonix.retrofhir.service.RequestGroupService;

import com.xinonix.hl7.fhir.stu3.RequestGroup;

public class RequestGroupInteractor extends ResourceInteractor<RequestGroupService, RequestGroup> {

    public static class RequestGroupComposer extends Composer<RequestGroupService, RequestGroup, RequestGroupComposer> {

        public RequestGroupComposer()
        {
            super((Class) RequestGroupService.class, (Class) RequestGroup.class);
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

    public static <T> RequestGroupInteractor.RequestGroupComposer Composer()
    {
        return new RequestGroupComposer();
    }

}