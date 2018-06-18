package com.xinonix.retrofhir.interactor;

import java.util.Date;
import com.xinonix.hl7.fhir.stu3.CodeableConcept;
import com.xinonix.hl7.fhir.stu3.FamilyMemberHistory.Gender;
import com.xinonix.hl7.fhir.stu3.FamilyMemberHistory.Status;
import com.xinonix.hl7.fhir.stu3.Identifier;

import com.xinonix.retrofhir.Parameters;
import com.xinonix.retrofhir.Prefix;
import com.xinonix.retrofhir.Modifier;
import com.xinonix.retrofhir.service.FamilyMemberHistoryService;

import com.xinonix.hl7.fhir.stu3.FamilyMemberHistory;

public class FamilyMemberHistoryInteractor extends ResourceInteractor<FamilyMemberHistoryService, FamilyMemberHistory> {

    public static class FamilyMemberHistoryComposer extends Composer<FamilyMemberHistoryService, FamilyMemberHistory, FamilyMemberHistoryComposer> {

        public FamilyMemberHistoryComposer()
        {
            super((Class) FamilyMemberHistoryService.class, (Class) FamilyMemberHistory.class);
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

		public ResourceInteractor.Composer setGender(Modifier modifier, Prefix prefix, FamilyMemberHistory.Gender Gender)
		{
			return setParameter(Parameters.GENDER, modifier, prefix, Gender);
		}

		public ResourceInteractor.Composer setGender(Modifier modifier, FamilyMemberHistory.Gender Gender)
		{
			return setParameter(Parameters.GENDER, modifier, Gender);
		}

		public ResourceInteractor.Composer setGender(Prefix prefix, FamilyMemberHistory.Gender Gender)
		{
			return setParameter(Parameters.GENDER, prefix, Gender);
		}
        			
		public ResourceInteractor.Composer setGender(FamilyMemberHistory.Gender Gender)
		{
			return setParameter(Parameters.GENDER, Gender);
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

		public ResourceInteractor.Composer setRelationship(Modifier modifier, Prefix prefix, CodeableConcept Relationship)
		{
			return setParameter(Parameters.RELATIONSHIP, modifier, prefix, Relationship);
		}

		public ResourceInteractor.Composer setRelationship(Modifier modifier, CodeableConcept Relationship)
		{
			return setParameter(Parameters.RELATIONSHIP, modifier, Relationship);
		}

		public ResourceInteractor.Composer setRelationship(Prefix prefix, CodeableConcept Relationship)
		{
			return setParameter(Parameters.RELATIONSHIP, prefix, Relationship);
		}
        			
		public ResourceInteractor.Composer setRelationship(CodeableConcept Relationship)
		{
			return setParameter(Parameters.RELATIONSHIP, Relationship);
		}

		public ResourceInteractor.Composer setStatus(Modifier modifier, Prefix prefix, FamilyMemberHistory.Status Status)
		{
			return setParameter(Parameters.STATUS, modifier, prefix, Status);
		}

		public ResourceInteractor.Composer setStatus(Modifier modifier, FamilyMemberHistory.Status Status)
		{
			return setParameter(Parameters.STATUS, modifier, Status);
		}

		public ResourceInteractor.Composer setStatus(Prefix prefix, FamilyMemberHistory.Status Status)
		{
			return setParameter(Parameters.STATUS, prefix, Status);
		}
        			
		public ResourceInteractor.Composer setStatus(FamilyMemberHistory.Status Status)
		{
			return setParameter(Parameters.STATUS, Status);
		}

    }

    public static <T> FamilyMemberHistoryInteractor.FamilyMemberHistoryComposer Composer()
    {
        return new FamilyMemberHistoryComposer();
    }

}