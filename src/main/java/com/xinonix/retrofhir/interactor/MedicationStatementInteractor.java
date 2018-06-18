package com.xinonix.retrofhir.interactor;

import java.util.Date;
import com.xinonix.hl7.fhir.stu3.CodeableConcept;
import com.xinonix.hl7.fhir.stu3.Identifier;
import com.xinonix.hl7.fhir.stu3.MedicationStatement.Status;

import com.xinonix.retrofhir.Parameters;
import com.xinonix.retrofhir.Prefix;
import com.xinonix.retrofhir.Modifier;
import com.xinonix.retrofhir.service.MedicationStatementService;

import com.xinonix.hl7.fhir.stu3.MedicationStatement;

public class MedicationStatementInteractor extends ResourceInteractor<MedicationStatementService, MedicationStatement> {

    public static class MedicationStatementComposer extends Composer<MedicationStatementService, MedicationStatement, MedicationStatementComposer> {

        public MedicationStatementComposer()
        {
            super((Class) MedicationStatementService.class, (Class) MedicationStatement.class);
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

		public ResourceInteractor.Composer setEffective(Modifier modifier, Prefix prefix, Date Effective)
		{
			return setParameter(Parameters.EFFECTIVE, modifier, prefix, Effective);
		}

		public ResourceInteractor.Composer setEffective(Modifier modifier, Date Effective)
		{
			return setParameter(Parameters.EFFECTIVE, modifier, Effective);
		}

		public ResourceInteractor.Composer setEffective(Prefix prefix, Date Effective)
		{
			return setParameter(Parameters.EFFECTIVE, prefix, Effective);
		}
        			
		public ResourceInteractor.Composer setEffective(Date Effective)
		{
			return setParameter(Parameters.EFFECTIVE, Effective);
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

		public ResourceInteractor.Composer setStatus(Modifier modifier, Prefix prefix, MedicationStatement.Status Status)
		{
			return setParameter(Parameters.STATUS, modifier, prefix, Status);
		}

		public ResourceInteractor.Composer setStatus(Modifier modifier, MedicationStatement.Status Status)
		{
			return setParameter(Parameters.STATUS, modifier, Status);
		}

		public ResourceInteractor.Composer setStatus(Prefix prefix, MedicationStatement.Status Status)
		{
			return setParameter(Parameters.STATUS, prefix, Status);
		}
        			
		public ResourceInteractor.Composer setStatus(MedicationStatement.Status Status)
		{
			return setParameter(Parameters.STATUS, Status);
		}

    }

    public static <T> MedicationStatementInteractor.MedicationStatementComposer Composer()
    {
        return new MedicationStatementComposer();
    }

}