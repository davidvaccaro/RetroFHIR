package com.xinonix.retrofhir.interactor;

import com.xinonix.hl7.fhir.stu3.Identifier;
import com.xinonix.hl7.fhir.stu3.ProcessRequest.Action;

import com.xinonix.retrofhir.Parameters;
import com.xinonix.retrofhir.Prefix;
import com.xinonix.retrofhir.Modifier;
import com.xinonix.retrofhir.service.ProcessRequestService;

import com.xinonix.hl7.fhir.stu3.ProcessRequest;

public class ProcessRequestInteractor extends ResourceInteractor<ProcessRequestService, ProcessRequest> {

    public static class ProcessRequestComposer extends Composer<ProcessRequestService, ProcessRequest, ProcessRequestComposer> {

        public ProcessRequestComposer()
        {
            super((Class) ProcessRequestService.class, (Class) ProcessRequest.class);
        }

		public ResourceInteractor.Composer setAction(Modifier modifier, Prefix prefix, ProcessRequest.Action Action)
		{
			return setParameter(Parameters.ACTION, modifier, prefix, Action);
		}

		public ResourceInteractor.Composer setAction(Modifier modifier, ProcessRequest.Action Action)
		{
			return setParameter(Parameters.ACTION, modifier, Action);
		}

		public ResourceInteractor.Composer setAction(Prefix prefix, ProcessRequest.Action Action)
		{
			return setParameter(Parameters.ACTION, prefix, Action);
		}
        			
		public ResourceInteractor.Composer setAction(ProcessRequest.Action Action)
		{
			return setParameter(Parameters.ACTION, Action);
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

    }

    public static <T> ProcessRequestInteractor.ProcessRequestComposer Composer()
    {
        return new ProcessRequestComposer();
    }

}