package com.xinonix.retrofhir.interactor;

import java.util.Date;
import com.xinonix.hl7.fhir.stu3.CodeableConcept;
import com.xinonix.hl7.fhir.stu3.Goal.Status;
import com.xinonix.hl7.fhir.stu3.Identifier;

import com.xinonix.retrofhir.Parameters;
import com.xinonix.retrofhir.Prefix;
import com.xinonix.retrofhir.Modifier;
import com.xinonix.retrofhir.service.GoalService;

import com.xinonix.hl7.fhir.stu3.Goal;

public class GoalInteractor extends ResourceInteractor<GoalService, Goal> {

    public static class GoalComposer extends Composer<GoalService, Goal, GoalComposer> {

        public GoalComposer()
        {
            super((Class) GoalService.class, (Class) Goal.class);
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

		public ResourceInteractor.Composer setStartDate(Modifier modifier, Prefix prefix, Date StartDate)
		{
			return setParameter(Parameters.START_DATE, modifier, prefix, StartDate);
		}

		public ResourceInteractor.Composer setStartDate(Modifier modifier, Date StartDate)
		{
			return setParameter(Parameters.START_DATE, modifier, StartDate);
		}

		public ResourceInteractor.Composer setStartDate(Prefix prefix, Date StartDate)
		{
			return setParameter(Parameters.START_DATE, prefix, StartDate);
		}
        			
		public ResourceInteractor.Composer setStartDate(Date StartDate)
		{
			return setParameter(Parameters.START_DATE, StartDate);
		}

		public ResourceInteractor.Composer setStatus(Modifier modifier, Prefix prefix, Goal.Status Status)
		{
			return setParameter(Parameters.STATUS, modifier, prefix, Status);
		}

		public ResourceInteractor.Composer setStatus(Modifier modifier, Goal.Status Status)
		{
			return setParameter(Parameters.STATUS, modifier, Status);
		}

		public ResourceInteractor.Composer setStatus(Prefix prefix, Goal.Status Status)
		{
			return setParameter(Parameters.STATUS, prefix, Status);
		}
        			
		public ResourceInteractor.Composer setStatus(Goal.Status Status)
		{
			return setParameter(Parameters.STATUS, Status);
		}

		public ResourceInteractor.Composer setTargetDate(Modifier modifier, Prefix prefix, Date TargetDate)
		{
			return setParameter(Parameters.TARGET_DATE, modifier, prefix, TargetDate);
		}

		public ResourceInteractor.Composer setTargetDate(Modifier modifier, Date TargetDate)
		{
			return setParameter(Parameters.TARGET_DATE, modifier, TargetDate);
		}

		public ResourceInteractor.Composer setTargetDate(Prefix prefix, Date TargetDate)
		{
			return setParameter(Parameters.TARGET_DATE, prefix, TargetDate);
		}
        			
		public ResourceInteractor.Composer setTargetDate(Date TargetDate)
		{
			return setParameter(Parameters.TARGET_DATE, TargetDate);
		}

    }

    public static <T> GoalInteractor.GoalComposer Composer()
    {
        return new GoalComposer();
    }

}