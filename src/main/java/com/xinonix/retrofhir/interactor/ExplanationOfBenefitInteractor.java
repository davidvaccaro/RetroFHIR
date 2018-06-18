package com.xinonix.retrofhir.interactor;

import java.util.Date;
import com.xinonix.hl7.fhir.stu3.Identifier;

import com.xinonix.retrofhir.Parameters;
import com.xinonix.retrofhir.Prefix;
import com.xinonix.retrofhir.Modifier;
import com.xinonix.retrofhir.service.ExplanationOfBenefitService;

import com.xinonix.hl7.fhir.stu3.ExplanationOfBenefit;

public class ExplanationOfBenefitInteractor extends ResourceInteractor<ExplanationOfBenefitService, ExplanationOfBenefit> {

    public static class ExplanationOfBenefitComposer extends Composer<ExplanationOfBenefitService, ExplanationOfBenefit, ExplanationOfBenefitComposer> {

        public ExplanationOfBenefitComposer()
        {
            super((Class) ExplanationOfBenefitService.class, (Class) ExplanationOfBenefit.class);
        }

		public ResourceInteractor.Composer setCreated(Modifier modifier, Prefix prefix, Date Created)
		{
			return setParameter(Parameters.CREATED, modifier, prefix, Created);
		}

		public ResourceInteractor.Composer setCreated(Modifier modifier, Date Created)
		{
			return setParameter(Parameters.CREATED, modifier, Created);
		}

		public ResourceInteractor.Composer setCreated(Prefix prefix, Date Created)
		{
			return setParameter(Parameters.CREATED, prefix, Created);
		}
        			
		public ResourceInteractor.Composer setCreated(Date Created)
		{
			return setParameter(Parameters.CREATED, Created);
		}

		public ResourceInteractor.Composer setDisposition(Modifier modifier, Prefix prefix, String Disposition)
		{
			return setParameter(Parameters.DISPOSITION, modifier, prefix, Disposition);
		}

		public ResourceInteractor.Composer setDisposition(Modifier modifier, String Disposition)
		{
			return setParameter(Parameters.DISPOSITION, modifier, Disposition);
		}

		public ResourceInteractor.Composer setDisposition(Prefix prefix, String Disposition)
		{
			return setParameter(Parameters.DISPOSITION, prefix, Disposition);
		}
        			
		public ResourceInteractor.Composer setDisposition(String Disposition)
		{
			return setParameter(Parameters.DISPOSITION, Disposition);
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

    }

    public static <T> ExplanationOfBenefitInteractor.ExplanationOfBenefitComposer Composer()
    {
        return new ExplanationOfBenefitComposer();
    }

}