package com.xinonix.retrofhir.interactor;

import com.xinonix.hl7.fhir.stu3.Identifier;

import com.xinonix.retrofhir.Parameters;
import com.xinonix.retrofhir.Prefix;
import com.xinonix.retrofhir.Modifier;
import com.xinonix.retrofhir.service.GuidanceResponseService;

import com.xinonix.hl7.fhir.stu3.GuidanceResponse;

public class GuidanceResponseInteractor extends ResourceInteractor<GuidanceResponseService, GuidanceResponse> {

    public static class GuidanceResponseComposer extends Composer<GuidanceResponseService, GuidanceResponse, GuidanceResponseComposer> {

        public GuidanceResponseComposer()
        {
            super((Class) GuidanceResponseService.class, (Class) GuidanceResponse.class);
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

		public ResourceInteractor.Composer setRequest(Modifier modifier, Prefix prefix, String Request)
		{
			return setParameter(Parameters.REQUEST, modifier, prefix, Request);
		}

		public ResourceInteractor.Composer setRequest(Modifier modifier, String Request)
		{
			return setParameter(Parameters.REQUEST, modifier, Request);
		}

		public ResourceInteractor.Composer setRequest(Prefix prefix, String Request)
		{
			return setParameter(Parameters.REQUEST, prefix, Request);
		}
        			
		public ResourceInteractor.Composer setRequest(String Request)
		{
			return setParameter(Parameters.REQUEST, Request);
		}

    }

    public static <T> GuidanceResponseInteractor.GuidanceResponseComposer Composer()
    {
        return new GuidanceResponseComposer();
    }

}