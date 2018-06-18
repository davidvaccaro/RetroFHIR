package com.xinonix.retrofhir.interactor;

import java.util.Date;
import com.xinonix.hl7.fhir.stu3.CodeableConcept;
import com.xinonix.hl7.fhir.stu3.ContactPoint;
import com.xinonix.hl7.fhir.stu3.Identifier;

import com.xinonix.retrofhir.Parameters;
import com.xinonix.retrofhir.Prefix;
import com.xinonix.retrofhir.Modifier;
import com.xinonix.retrofhir.service.PractitionerRoleService;

import com.xinonix.hl7.fhir.stu3.PractitionerRole;

public class PractitionerRoleInteractor extends ResourceInteractor<PractitionerRoleService, PractitionerRole> {

    public static class PractitionerRoleComposer extends Composer<PractitionerRoleService, PractitionerRole, PractitionerRoleComposer> {

        public PractitionerRoleComposer()
        {
            super((Class) PractitionerRoleService.class, (Class) PractitionerRole.class);
        }

		public ResourceInteractor.Composer setActive(Modifier modifier, Prefix prefix, Boolean Active)
		{
			return setParameter(Parameters.ACTIVE, modifier, prefix, Active);
		}

		public ResourceInteractor.Composer setActive(Modifier modifier, Boolean Active)
		{
			return setParameter(Parameters.ACTIVE, modifier, Active);
		}

		public ResourceInteractor.Composer setActive(Prefix prefix, Boolean Active)
		{
			return setParameter(Parameters.ACTIVE, prefix, Active);
		}
        			
		public ResourceInteractor.Composer setActive(Boolean Active)
		{
			return setParameter(Parameters.ACTIVE, Active);
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

		public ResourceInteractor.Composer setEmail(Modifier modifier, Prefix prefix, ContactPoint Email)
		{
			return setParameter(Parameters.EMAIL, modifier, prefix, Email);
		}

		public ResourceInteractor.Composer setEmail(Modifier modifier, ContactPoint Email)
		{
			return setParameter(Parameters.EMAIL, modifier, Email);
		}

		public ResourceInteractor.Composer setEmail(Prefix prefix, ContactPoint Email)
		{
			return setParameter(Parameters.EMAIL, prefix, Email);
		}
        			
		public ResourceInteractor.Composer setEmail(ContactPoint Email)
		{
			return setParameter(Parameters.EMAIL, Email);
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

		public ResourceInteractor.Composer setPhone(Modifier modifier, Prefix prefix, ContactPoint Phone)
		{
			return setParameter(Parameters.PHONE, modifier, prefix, Phone);
		}

		public ResourceInteractor.Composer setPhone(Modifier modifier, ContactPoint Phone)
		{
			return setParameter(Parameters.PHONE, modifier, Phone);
		}

		public ResourceInteractor.Composer setPhone(Prefix prefix, ContactPoint Phone)
		{
			return setParameter(Parameters.PHONE, prefix, Phone);
		}
        			
		public ResourceInteractor.Composer setPhone(ContactPoint Phone)
		{
			return setParameter(Parameters.PHONE, Phone);
		}

		public ResourceInteractor.Composer setRole(Modifier modifier, Prefix prefix, CodeableConcept Role)
		{
			return setParameter(Parameters.ROLE, modifier, prefix, Role);
		}

		public ResourceInteractor.Composer setRole(Modifier modifier, CodeableConcept Role)
		{
			return setParameter(Parameters.ROLE, modifier, Role);
		}

		public ResourceInteractor.Composer setRole(Prefix prefix, CodeableConcept Role)
		{
			return setParameter(Parameters.ROLE, prefix, Role);
		}
        			
		public ResourceInteractor.Composer setRole(CodeableConcept Role)
		{
			return setParameter(Parameters.ROLE, Role);
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

		public ResourceInteractor.Composer setTelecom(Modifier modifier, Prefix prefix, ContactPoint Telecom)
		{
			return setParameter(Parameters.TELECOM, modifier, prefix, Telecom);
		}

		public ResourceInteractor.Composer setTelecom(Modifier modifier, ContactPoint Telecom)
		{
			return setParameter(Parameters.TELECOM, modifier, Telecom);
		}

		public ResourceInteractor.Composer setTelecom(Prefix prefix, ContactPoint Telecom)
		{
			return setParameter(Parameters.TELECOM, prefix, Telecom);
		}
        			
		public ResourceInteractor.Composer setTelecom(ContactPoint Telecom)
		{
			return setParameter(Parameters.TELECOM, Telecom);
		}

    }

    public static <T> PractitionerRoleInteractor.PractitionerRoleComposer Composer()
    {
        return new PractitionerRoleComposer();
    }

}