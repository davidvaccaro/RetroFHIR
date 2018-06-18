package com.xinonix.retrofhir.interactor;

import com.xinonix.hl7.fhir.stu3.CodeableConcept;
import com.xinonix.hl7.fhir.stu3.Identifier;

import com.xinonix.retrofhir.Parameters;
import com.xinonix.retrofhir.Prefix;
import com.xinonix.retrofhir.Modifier;
import com.xinonix.retrofhir.service.HealthcareServiceService;

import com.xinonix.hl7.fhir.stu3.HealthcareService;

public class HealthcareServiceInteractor extends ResourceInteractor<HealthcareServiceService, HealthcareService> {

    public static class HealthcareServiceComposer extends Composer<HealthcareServiceService, HealthcareService, HealthcareServiceComposer> {

        public HealthcareServiceComposer()
        {
            super((Class) HealthcareServiceService.class, (Class) HealthcareService.class);
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

		public ResourceInteractor.Composer setCategory(Modifier modifier, Prefix prefix, CodeableConcept Category)
		{
			return setParameter(Parameters.CATEGORY, modifier, prefix, Category);
		}

		public ResourceInteractor.Composer setCategory(Modifier modifier, CodeableConcept Category)
		{
			return setParameter(Parameters.CATEGORY, modifier, Category);
		}

		public ResourceInteractor.Composer setCategory(Prefix prefix, CodeableConcept Category)
		{
			return setParameter(Parameters.CATEGORY, prefix, Category);
		}
        			
		public ResourceInteractor.Composer setCategory(CodeableConcept Category)
		{
			return setParameter(Parameters.CATEGORY, Category);
		}

		public ResourceInteractor.Composer setCharacteristic(Modifier modifier, Prefix prefix, CodeableConcept Characteristic)
		{
			return setParameter(Parameters.CHARACTERISTIC, modifier, prefix, Characteristic);
		}

		public ResourceInteractor.Composer setCharacteristic(Modifier modifier, CodeableConcept Characteristic)
		{
			return setParameter(Parameters.CHARACTERISTIC, modifier, Characteristic);
		}

		public ResourceInteractor.Composer setCharacteristic(Prefix prefix, CodeableConcept Characteristic)
		{
			return setParameter(Parameters.CHARACTERISTIC, prefix, Characteristic);
		}
        			
		public ResourceInteractor.Composer setCharacteristic(CodeableConcept Characteristic)
		{
			return setParameter(Parameters.CHARACTERISTIC, Characteristic);
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

		public ResourceInteractor.Composer setName(Modifier modifier, Prefix prefix, String Name)
		{
			return setParameter(Parameters.NAME, modifier, prefix, Name);
		}

		public ResourceInteractor.Composer setName(Modifier modifier, String Name)
		{
			return setParameter(Parameters.NAME, modifier, Name);
		}

		public ResourceInteractor.Composer setName(Prefix prefix, String Name)
		{
			return setParameter(Parameters.NAME, prefix, Name);
		}
        			
		public ResourceInteractor.Composer setName(String Name)
		{
			return setParameter(Parameters.NAME, Name);
		}

		public ResourceInteractor.Composer setProgramname(Modifier modifier, Prefix prefix, String Programname)
		{
			return setParameter(Parameters.PROGRAMNAME, modifier, prefix, Programname);
		}

		public ResourceInteractor.Composer setProgramname(Modifier modifier, String Programname)
		{
			return setParameter(Parameters.PROGRAMNAME, modifier, Programname);
		}

		public ResourceInteractor.Composer setProgramname(Prefix prefix, String Programname)
		{
			return setParameter(Parameters.PROGRAMNAME, prefix, Programname);
		}
        			
		public ResourceInteractor.Composer setProgramname(String Programname)
		{
			return setParameter(Parameters.PROGRAMNAME, Programname);
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

    }

    public static <T> HealthcareServiceInteractor.HealthcareServiceComposer Composer()
    {
        return new HealthcareServiceComposer();
    }

}