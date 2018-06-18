package com.xinonix.retrofhir.interactor;

import java.util.Date;
import com.xinonix.hl7.fhir.stu3.CodeableConcept;
import com.xinonix.hl7.fhir.stu3.Identifier;
import com.xinonix.hl7.fhir.stu3.MedicationDispense.Status;

import com.xinonix.retrofhir.Parameters;
import com.xinonix.retrofhir.Prefix;
import com.xinonix.retrofhir.Modifier;
import com.xinonix.retrofhir.service.MedicationDispenseService;

import com.xinonix.hl7.fhir.stu3.MedicationDispense;

public class MedicationDispenseInteractor extends ResourceInteractor<MedicationDispenseService, MedicationDispense> {

    public static class MedicationDispenseComposer extends Composer<MedicationDispenseService, MedicationDispense, MedicationDispenseComposer> {

        public MedicationDispenseComposer()
        {
            super((Class) MedicationDispenseService.class, (Class) MedicationDispense.class);
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

		public ResourceInteractor.Composer setStatus(Modifier modifier, Prefix prefix, MedicationDispense.Status Status)
		{
			return setParameter(Parameters.STATUS, modifier, prefix, Status);
		}

		public ResourceInteractor.Composer setStatus(Modifier modifier, MedicationDispense.Status Status)
		{
			return setParameter(Parameters.STATUS, modifier, Status);
		}

		public ResourceInteractor.Composer setStatus(Prefix prefix, MedicationDispense.Status Status)
		{
			return setParameter(Parameters.STATUS, prefix, Status);
		}
        			
		public ResourceInteractor.Composer setStatus(MedicationDispense.Status Status)
		{
			return setParameter(Parameters.STATUS, Status);
		}

		public ResourceInteractor.Composer setType(Modifier modifier, Prefix prefix, CodeableConcept Type)
		{
			return setParameter(Parameters.TYPE, modifier, prefix, Type);
		}

		public ResourceInteractor.Composer setType(Modifier modifier, CodeableConcept Type)
		{
			return setParameter(Parameters.TYPE, modifier, Type);
		}

		public ResourceInteractor.Composer setType(Prefix prefix, CodeableConcept Type)
		{
			return setParameter(Parameters.TYPE, prefix, Type);
		}
        			
		public ResourceInteractor.Composer setType(CodeableConcept Type)
		{
			return setParameter(Parameters.TYPE, Type);
		}

		public ResourceInteractor.Composer setWhenhandedover(Modifier modifier, Prefix prefix, Date Whenhandedover)
		{
			return setParameter(Parameters.WHENHANDEDOVER, modifier, prefix, Whenhandedover);
		}

		public ResourceInteractor.Composer setWhenhandedover(Modifier modifier, Date Whenhandedover)
		{
			return setParameter(Parameters.WHENHANDEDOVER, modifier, Whenhandedover);
		}

		public ResourceInteractor.Composer setWhenhandedover(Prefix prefix, Date Whenhandedover)
		{
			return setParameter(Parameters.WHENHANDEDOVER, prefix, Whenhandedover);
		}
        			
		public ResourceInteractor.Composer setWhenhandedover(Date Whenhandedover)
		{
			return setParameter(Parameters.WHENHANDEDOVER, Whenhandedover);
		}

		public ResourceInteractor.Composer setWhenprepared(Modifier modifier, Prefix prefix, Date Whenprepared)
		{
			return setParameter(Parameters.WHENPREPARED, modifier, prefix, Whenprepared);
		}

		public ResourceInteractor.Composer setWhenprepared(Modifier modifier, Date Whenprepared)
		{
			return setParameter(Parameters.WHENPREPARED, modifier, Whenprepared);
		}

		public ResourceInteractor.Composer setWhenprepared(Prefix prefix, Date Whenprepared)
		{
			return setParameter(Parameters.WHENPREPARED, prefix, Whenprepared);
		}
        			
		public ResourceInteractor.Composer setWhenprepared(Date Whenprepared)
		{
			return setParameter(Parameters.WHENPREPARED, Whenprepared);
		}

    }

    public static <T> MedicationDispenseInteractor.MedicationDispenseComposer Composer()
    {
        return new MedicationDispenseComposer();
    }

}