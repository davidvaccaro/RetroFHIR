package com.xinonix.retrofhir.interactor;

import com.xinonix.hl7.fhir.stu3.Identifier;

import com.xinonix.retrofhir.Parameters;
import com.xinonix.retrofhir.Prefix;
import com.xinonix.retrofhir.Modifier;
import com.xinonix.retrofhir.service.EnrollmentRequestService;

import com.xinonix.hl7.fhir.stu3.EnrollmentRequest;

public class EnrollmentRequestInteractor extends ResourceInteractor<EnrollmentRequestService, EnrollmentRequest> {

    public static class EnrollmentRequestComposer extends Composer<EnrollmentRequestService, EnrollmentRequest, EnrollmentRequestComposer> {

        public EnrollmentRequestComposer()
        {
            super((Class) EnrollmentRequestService.class, (Class) EnrollmentRequest.class);
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

    public static <T> EnrollmentRequestInteractor.EnrollmentRequestComposer Composer()
    {
        return new EnrollmentRequestComposer();
    }

}