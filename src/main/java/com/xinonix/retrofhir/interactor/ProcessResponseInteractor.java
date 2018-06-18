package com.xinonix.retrofhir.interactor;

import com.xinonix.hl7.fhir.stu3.Identifier;

import com.xinonix.retrofhir.Parameters;
import com.xinonix.retrofhir.Prefix;
import com.xinonix.retrofhir.Modifier;
import com.xinonix.retrofhir.service.ProcessResponseService;

import com.xinonix.hl7.fhir.stu3.ProcessResponse;

public class ProcessResponseInteractor extends ResourceInteractor<ProcessResponseService, ProcessResponse> {

    public static class ProcessResponseComposer extends Composer<ProcessResponseService, ProcessResponse, ProcessResponseComposer> {

        public ProcessResponseComposer()
        {
            super((Class) ProcessResponseService.class, (Class) ProcessResponse.class);
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

    public static <T> ProcessResponseInteractor.ProcessResponseComposer Composer()
    {
        return new ProcessResponseComposer();
    }

}