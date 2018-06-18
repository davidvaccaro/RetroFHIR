package com.xinonix.retrofhir.interactor;

import java.util.Date;
import com.xinonix.hl7.fhir.stu3.CodeableConcept;
import com.xinonix.hl7.fhir.stu3.Identifier;
import com.xinonix.hl7.fhir.stu3.Task.Status;

import com.xinonix.retrofhir.Parameters;
import com.xinonix.retrofhir.Prefix;
import com.xinonix.retrofhir.Modifier;
import com.xinonix.retrofhir.service.TaskService;

import com.xinonix.hl7.fhir.stu3.Task;

public class TaskInteractor extends ResourceInteractor<TaskService, Task> {

    public static class TaskComposer extends Composer<TaskService, Task, TaskComposer> {

        public TaskComposer()
        {
            super((Class) TaskService.class, (Class) Task.class);
        }

		public ResourceInteractor.Composer setAuthoredOn(Modifier modifier, Prefix prefix, Date AuthoredOn)
		{
			return setParameter(Parameters.AUTHORED_ON, modifier, prefix, AuthoredOn);
		}

		public ResourceInteractor.Composer setAuthoredOn(Modifier modifier, Date AuthoredOn)
		{
			return setParameter(Parameters.AUTHORED_ON, modifier, AuthoredOn);
		}

		public ResourceInteractor.Composer setAuthoredOn(Prefix prefix, Date AuthoredOn)
		{
			return setParameter(Parameters.AUTHORED_ON, prefix, AuthoredOn);
		}
        			
		public ResourceInteractor.Composer setAuthoredOn(Date AuthoredOn)
		{
			return setParameter(Parameters.AUTHORED_ON, AuthoredOn);
		}

		public ResourceInteractor.Composer setBusinessStatus(Modifier modifier, Prefix prefix, CodeableConcept BusinessStatus)
		{
			return setParameter(Parameters.BUSINESS_STATUS, modifier, prefix, BusinessStatus);
		}

		public ResourceInteractor.Composer setBusinessStatus(Modifier modifier, CodeableConcept BusinessStatus)
		{
			return setParameter(Parameters.BUSINESS_STATUS, modifier, BusinessStatus);
		}

		public ResourceInteractor.Composer setBusinessStatus(Prefix prefix, CodeableConcept BusinessStatus)
		{
			return setParameter(Parameters.BUSINESS_STATUS, prefix, BusinessStatus);
		}
        			
		public ResourceInteractor.Composer setBusinessStatus(CodeableConcept BusinessStatus)
		{
			return setParameter(Parameters.BUSINESS_STATUS, BusinessStatus);
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

		public ResourceInteractor.Composer setGroupIdentifier(Modifier modifier, Prefix prefix, Identifier GroupIdentifier)
		{
			return setParameter(Parameters.GROUP_IDENTIFIER, modifier, prefix, GroupIdentifier);
		}

		public ResourceInteractor.Composer setGroupIdentifier(Modifier modifier, Identifier GroupIdentifier)
		{
			return setParameter(Parameters.GROUP_IDENTIFIER, modifier, GroupIdentifier);
		}

		public ResourceInteractor.Composer setGroupIdentifier(Prefix prefix, Identifier GroupIdentifier)
		{
			return setParameter(Parameters.GROUP_IDENTIFIER, prefix, GroupIdentifier);
		}
        			
		public ResourceInteractor.Composer setGroupIdentifier(Identifier GroupIdentifier)
		{
			return setParameter(Parameters.GROUP_IDENTIFIER, GroupIdentifier);
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

		public ResourceInteractor.Composer setIntent(Modifier modifier, Prefix prefix, String Intent)
		{
			return setParameter(Parameters.INTENT, modifier, prefix, Intent);
		}

		public ResourceInteractor.Composer setIntent(Modifier modifier, String Intent)
		{
			return setParameter(Parameters.INTENT, modifier, Intent);
		}

		public ResourceInteractor.Composer setIntent(Prefix prefix, String Intent)
		{
			return setParameter(Parameters.INTENT, prefix, Intent);
		}
        			
		public ResourceInteractor.Composer setIntent(String Intent)
		{
			return setParameter(Parameters.INTENT, Intent);
		}

		public ResourceInteractor.Composer setModified(Modifier modifier, Prefix prefix, Date Modified)
		{
			return setParameter(Parameters.MODIFIED, modifier, prefix, Modified);
		}

		public ResourceInteractor.Composer setModified(Modifier modifier, Date Modified)
		{
			return setParameter(Parameters.MODIFIED, modifier, Modified);
		}

		public ResourceInteractor.Composer setModified(Prefix prefix, Date Modified)
		{
			return setParameter(Parameters.MODIFIED, prefix, Modified);
		}
        			
		public ResourceInteractor.Composer setModified(Date Modified)
		{
			return setParameter(Parameters.MODIFIED, Modified);
		}

		public ResourceInteractor.Composer setPerformer(Modifier modifier, Prefix prefix, CodeableConcept Performer)
		{
			return setParameter(Parameters.PERFORMER, modifier, prefix, Performer);
		}

		public ResourceInteractor.Composer setPerformer(Modifier modifier, CodeableConcept Performer)
		{
			return setParameter(Parameters.PERFORMER, modifier, Performer);
		}

		public ResourceInteractor.Composer setPerformer(Prefix prefix, CodeableConcept Performer)
		{
			return setParameter(Parameters.PERFORMER, prefix, Performer);
		}
        			
		public ResourceInteractor.Composer setPerformer(CodeableConcept Performer)
		{
			return setParameter(Parameters.PERFORMER, Performer);
		}

		public ResourceInteractor.Composer setPeriod(Modifier modifier, Prefix prefix, Date Period)
		{
			return setParameter(Parameters.PERIOD, modifier, prefix, Period);
		}

		public ResourceInteractor.Composer setPeriod(Modifier modifier, Date Period)
		{
			return setParameter(Parameters.PERIOD, modifier, Period);
		}

		public ResourceInteractor.Composer setPeriod(Prefix prefix, Date Period)
		{
			return setParameter(Parameters.PERIOD, prefix, Period);
		}
        			
		public ResourceInteractor.Composer setPeriod(Date Period)
		{
			return setParameter(Parameters.PERIOD, Period);
		}

		public ResourceInteractor.Composer setPriority(Modifier modifier, Prefix prefix, String Priority)
		{
			return setParameter(Parameters.PRIORITY, modifier, prefix, Priority);
		}

		public ResourceInteractor.Composer setPriority(Modifier modifier, String Priority)
		{
			return setParameter(Parameters.PRIORITY, modifier, Priority);
		}

		public ResourceInteractor.Composer setPriority(Prefix prefix, String Priority)
		{
			return setParameter(Parameters.PRIORITY, prefix, Priority);
		}
        			
		public ResourceInteractor.Composer setPriority(String Priority)
		{
			return setParameter(Parameters.PRIORITY, Priority);
		}

		public ResourceInteractor.Composer setStatus(Modifier modifier, Prefix prefix, Task.Status Status)
		{
			return setParameter(Parameters.STATUS, modifier, prefix, Status);
		}

		public ResourceInteractor.Composer setStatus(Modifier modifier, Task.Status Status)
		{
			return setParameter(Parameters.STATUS, modifier, Status);
		}

		public ResourceInteractor.Composer setStatus(Prefix prefix, Task.Status Status)
		{
			return setParameter(Parameters.STATUS, prefix, Status);
		}
        			
		public ResourceInteractor.Composer setStatus(Task.Status Status)
		{
			return setParameter(Parameters.STATUS, Status);
		}

    }

    public static <T> TaskInteractor.TaskComposer Composer()
    {
        return new TaskComposer();
    }

}