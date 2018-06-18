package com.xinonix.retrofhir.interactor;

import com.xinonix.hl7.fhir.stu3.Identifier;

import com.xinonix.retrofhir.Parameters;
import com.xinonix.retrofhir.Prefix;
import com.xinonix.retrofhir.Modifier;
import com.xinonix.retrofhir.service.EnrollmentResponseService;

import com.xinonix.hl7.fhir.stu3.EnrollmentResponse;

public class EnrollmentResponseInteractor extends ResourceInteractor<EnrollmentResponseService, EnrollmentResponse> {

    public static class EnrollmentResponseComposer extends Composer<EnrollmentResponseService, EnrollmentResponse, EnrollmentResponseComposer> {

        public EnrollmentResponseComposer()
        {
            super((Class) EnrollmentResponseService.class, (Class) EnrollmentResponse.class);
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

    public static <T> EnrollmentResponseInteractor.EnrollmentResponseComposer Composer()
    {
        return new EnrollmentResponseComposer();
    }

}