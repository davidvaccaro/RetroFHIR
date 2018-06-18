package com.xinonix.retrofhir.interactor;

import java.util.Date;

import com.xinonix.retrofhir.Parameters;
import com.xinonix.retrofhir.Prefix;
import com.xinonix.retrofhir.Modifier;
import com.xinonix.retrofhir.service.AppointmentResponseService;

import com.xinonix.hl7.fhir.stu3.AppointmentResponse;
import com.xinonix.hl7.fhir.stu3.Identifier;

public class AppointmentResponseInteractor extends ResourceInteractor<AppointmentResponseService, AppointmentResponse> {

    public static class AppointmentResponseComposer extends Composer<AppointmentResponseService, AppointmentResponse, AppointmentResponseComposer> {

        public AppointmentResponseComposer()
        {
            super((Class) AppointmentResponseService.class, (Class) AppointmentResponse.class);
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

		public ResourceInteractor.Composer setPartStatus(Modifier modifier, Prefix prefix, String PartStatus)
		{
			return setParameter(Parameters.PART_STATUS, modifier, prefix, PartStatus);
		}

		public ResourceInteractor.Composer setPartStatus(Modifier modifier, String PartStatus)
		{
			return setParameter(Parameters.PART_STATUS, modifier, PartStatus);
		}

		public ResourceInteractor.Composer setPartStatus(Prefix prefix, String PartStatus)
		{
			return setParameter(Parameters.PART_STATUS, prefix, PartStatus);
		}
        			
		public ResourceInteractor.Composer setPartStatus(String PartStatus)
		{
			return setParameter(Parameters.PART_STATUS, PartStatus);
		}

    }

    public static <T> AppointmentResponseInteractor.AppointmentResponseComposer Composer()
    {
        return new AppointmentResponseComposer();
    }

}