package com.xinonix.retrofhir.interactor;

import java.util.Date;
import com.xinonix.hl7.fhir.stu3.CarePlan.Intent;
import com.xinonix.hl7.fhir.stu3.CarePlan.Status;
import com.xinonix.hl7.fhir.stu3.CodeableConcept;
import com.xinonix.hl7.fhir.stu3.Identifier;

import com.xinonix.retrofhir.Parameters;
import com.xinonix.retrofhir.Prefix;
import com.xinonix.retrofhir.Modifier;
import com.xinonix.retrofhir.service.CarePlanService;

import com.xinonix.hl7.fhir.stu3.CarePlan;

public class CarePlanInteractor extends ResourceInteractor<CarePlanService, CarePlan> {

    public static class CarePlanComposer extends Composer<CarePlanService, CarePlan, CarePlanComposer> {

        public CarePlanComposer()
        {
            super((Class) CarePlanService.class, (Class) CarePlan.class);
        }

		public ResourceInteractor.Composer setActivityCode(Modifier modifier, Prefix prefix, CodeableConcept ActivityCode)
		{
			return setParameter(Parameters.ACTIVITY_CODE, modifier, prefix, ActivityCode);
		}

		public ResourceInteractor.Composer setActivityCode(Modifier modifier, CodeableConcept ActivityCode)
		{
			return setParameter(Parameters.ACTIVITY_CODE, modifier, ActivityCode);
		}

		public ResourceInteractor.Composer setActivityCode(Prefix prefix, CodeableConcept ActivityCode)
		{
			return setParameter(Parameters.ACTIVITY_CODE, prefix, ActivityCode);
		}
        			
		public ResourceInteractor.Composer setActivityCode(CodeableConcept ActivityCode)
		{
			return setParameter(Parameters.ACTIVITY_CODE, ActivityCode);
		}

		public ResourceInteractor.Composer setActivityDate(Modifier modifier, Prefix prefix, Date ActivityDate)
		{
			return setParameter(Parameters.ACTIVITY_DATE, modifier, prefix, ActivityDate);
		}

		public ResourceInteractor.Composer setActivityDate(Modifier modifier, Date ActivityDate)
		{
			return setParameter(Parameters.ACTIVITY_DATE, modifier, ActivityDate);
		}

		public ResourceInteractor.Composer setActivityDate(Prefix prefix, Date ActivityDate)
		{
			return setParameter(Parameters.ACTIVITY_DATE, prefix, ActivityDate);
		}
        			
		public ResourceInteractor.Composer setActivityDate(Date ActivityDate)
		{
			return setParameter(Parameters.ACTIVITY_DATE, ActivityDate);
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

		public ResourceInteractor.Composer setIntent(Modifier modifier, Prefix prefix, CarePlan.Intent Intent)
		{
			return setParameter(Parameters.INTENT, modifier, prefix, Intent);
		}

		public ResourceInteractor.Composer setIntent(Modifier modifier, CarePlan.Intent Intent)
		{
			return setParameter(Parameters.INTENT, modifier, Intent);
		}

		public ResourceInteractor.Composer setIntent(Prefix prefix, CarePlan.Intent Intent)
		{
			return setParameter(Parameters.INTENT, prefix, Intent);
		}
        			
		public ResourceInteractor.Composer setIntent(CarePlan.Intent Intent)
		{
			return setParameter(Parameters.INTENT, Intent);
		}

		public ResourceInteractor.Composer setStatus(Modifier modifier, Prefix prefix, CarePlan.Status Status)
		{
			return setParameter(Parameters.STATUS, modifier, prefix, Status);
		}

		public ResourceInteractor.Composer setStatus(Modifier modifier, CarePlan.Status Status)
		{
			return setParameter(Parameters.STATUS, modifier, Status);
		}

		public ResourceInteractor.Composer setStatus(Prefix prefix, CarePlan.Status Status)
		{
			return setParameter(Parameters.STATUS, prefix, Status);
		}
        			
		public ResourceInteractor.Composer setStatus(CarePlan.Status Status)
		{
			return setParameter(Parameters.STATUS, Status);
		}

    }

    public static <T> CarePlanInteractor.CarePlanComposer Composer()
    {
        return new CarePlanComposer();
    }

}