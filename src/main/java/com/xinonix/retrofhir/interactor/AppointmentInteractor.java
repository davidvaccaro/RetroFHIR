package com.xinonix.retrofhir.interactor;

import java.util.Date;

import com.xinonix.retrofhir.Parameters;
import com.xinonix.retrofhir.Prefix;
import com.xinonix.retrofhir.Modifier;
import com.xinonix.retrofhir.service.AppointmentService;

import com.xinonix.hl7.fhir.stu3.Appointment;
import com.xinonix.hl7.fhir.stu3.AppointmentParticipant;
import com.xinonix.hl7.fhir.stu3.CodeableConcept;
import com.xinonix.hl7.fhir.stu3.Identifier;

public class AppointmentInteractor extends ResourceInteractor<AppointmentService, Appointment> {

    public static class AppointmentComposer extends Composer<AppointmentService, Appointment, AppointmentComposer> {

        public AppointmentComposer()
        {
            super((Class) AppointmentService.class, (Class) Appointment.class);
        }

		public ResourceInteractor.Composer setAppointmentType(Modifier modifier, Prefix prefix, CodeableConcept AppointmentType)
		{
			return setParameter(Parameters.APPOINTMENT_TYPE, modifier, prefix, AppointmentType);
		}

		public ResourceInteractor.Composer setAppointmentType(Modifier modifier, CodeableConcept AppointmentType)
		{
			return setParameter(Parameters.APPOINTMENT_TYPE, modifier, AppointmentType);
		}

		public ResourceInteractor.Composer setAppointmentType(Prefix prefix, CodeableConcept AppointmentType)
		{
			return setParameter(Parameters.APPOINTMENT_TYPE, prefix, AppointmentType);
		}
        			
		public ResourceInteractor.Composer setAppointmentType(CodeableConcept AppointmentType)
		{
			return setParameter(Parameters.APPOINTMENT_TYPE, AppointmentType);
		}

		public ResourceInteractor.Composer setDate(Modifier modifier, Prefix prefix, Date Date)
		{
			return setParameter(Parameters.DATE, modifier, prefix, Date);
		}

		public ResourceInteractor.Composer setDate(Modifier modifier, Date Date)
		{
			return setParameter(Parameters.DATE, modifier, Date);
		}

		public ResourceInteractor.Composer setDate(Prefix prefix, Date Date)
		{
			return setParameter(Parameters.DATE, prefix, Date);
		}
        			
		public ResourceInteractor.Composer setDate(Date Date)
		{
			return setParameter(Parameters.DATE, Date);
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

		public ResourceInteractor.Composer setPartStatus(Modifier modifier, Prefix prefix, AppointmentParticipant.Status PartStatus)
		{
			return setParameter(Parameters.PART_STATUS, modifier, prefix, PartStatus);
		}

		public ResourceInteractor.Composer setPartStatus(Modifier modifier, AppointmentParticipant.Status PartStatus)
		{
			return setParameter(Parameters.PART_STATUS, modifier, PartStatus);
		}

		public ResourceInteractor.Composer setPartStatus(Prefix prefix, AppointmentParticipant.Status PartStatus)
		{
			return setParameter(Parameters.PART_STATUS, prefix, PartStatus);
		}
        			
		public ResourceInteractor.Composer setPartStatus(AppointmentParticipant.Status PartStatus)
		{
			return setParameter(Parameters.PART_STATUS, PartStatus);
		}

		public ResourceInteractor.Composer setServiceType(Modifier modifier, Prefix prefix, CodeableConcept ServiceType)
		{
			return setParameter(Parameters.SERVICE_TYPE, modifier, prefix, ServiceType);
		}

		public ResourceInteractor.Composer setServiceType(Modifier modifier, CodeableConcept ServiceType)
		{
			return setParameter(Parameters.SERVICE_TYPE, modifier, ServiceType);
		}

		public ResourceInteractor.Composer setServiceType(Prefix prefix, CodeableConcept ServiceType)
		{
			return setParameter(Parameters.SERVICE_TYPE, prefix, ServiceType);
		}
        			
		public ResourceInteractor.Composer setServiceType(CodeableConcept ServiceType)
		{
			return setParameter(Parameters.SERVICE_TYPE, ServiceType);
		}

		public ResourceInteractor.Composer setStatus(Modifier modifier, Prefix prefix, Appointment.Status Status)
		{
			return setParameter(Parameters.STATUS, modifier, prefix, Status);
		}

		public ResourceInteractor.Composer setStatus(Modifier modifier, Appointment.Status Status)
		{
			return setParameter(Parameters.STATUS, modifier, Status);
		}

		public ResourceInteractor.Composer setStatus(Prefix prefix, Appointment.Status Status)
		{
			return setParameter(Parameters.STATUS, prefix, Status);
		}
        			
		public ResourceInteractor.Composer setStatus(Appointment.Status Status)
		{
			return setParameter(Parameters.STATUS, Status);
		}

    }

    public static <T> AppointmentInteractor.AppointmentComposer Composer()
    {
        return new AppointmentComposer();
    }

}