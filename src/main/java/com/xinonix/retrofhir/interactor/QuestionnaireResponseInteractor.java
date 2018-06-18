package com.xinonix.retrofhir.interactor;

import java.util.Date;
import com.xinonix.hl7.fhir.stu3.Identifier;
import com.xinonix.hl7.fhir.stu3.QuestionnaireResponse.Status;

import com.xinonix.retrofhir.Parameters;
import com.xinonix.retrofhir.Prefix;
import com.xinonix.retrofhir.Modifier;
import com.xinonix.retrofhir.service.QuestionnaireResponseService;

import com.xinonix.hl7.fhir.stu3.QuestionnaireResponse;

public class QuestionnaireResponseInteractor extends ResourceInteractor<QuestionnaireResponseService, QuestionnaireResponse> {

    public static class QuestionnaireResponseComposer extends Composer<QuestionnaireResponseService, QuestionnaireResponse, QuestionnaireResponseComposer> {

        public QuestionnaireResponseComposer()
        {
            super((Class) QuestionnaireResponseService.class, (Class) QuestionnaireResponse.class);
        }

		public ResourceInteractor.Composer setAuthored(Modifier modifier, Prefix prefix, Date Authored)
		{
			return setParameter(Parameters.AUTHORED, modifier, prefix, Authored);
		}

		public ResourceInteractor.Composer setAuthored(Modifier modifier, Date Authored)
		{
			return setParameter(Parameters.AUTHORED, modifier, Authored);
		}

		public ResourceInteractor.Composer setAuthored(Prefix prefix, Date Authored)
		{
			return setParameter(Parameters.AUTHORED, prefix, Authored);
		}
        			
		public ResourceInteractor.Composer setAuthored(Date Authored)
		{
			return setParameter(Parameters.AUTHORED, Authored);
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

		public ResourceInteractor.Composer setStatus(Modifier modifier, Prefix prefix, QuestionnaireResponse.Status Status)
		{
			return setParameter(Parameters.STATUS, modifier, prefix, Status);
		}

		public ResourceInteractor.Composer setStatus(Modifier modifier, QuestionnaireResponse.Status Status)
		{
			return setParameter(Parameters.STATUS, modifier, Status);
		}

		public ResourceInteractor.Composer setStatus(Prefix prefix, QuestionnaireResponse.Status Status)
		{
			return setParameter(Parameters.STATUS, prefix, Status);
		}
        			
		public ResourceInteractor.Composer setStatus(QuestionnaireResponse.Status Status)
		{
			return setParameter(Parameters.STATUS, Status);
		}

    }

    public static <T> QuestionnaireResponseInteractor.QuestionnaireResponseComposer Composer()
    {
        return new QuestionnaireResponseComposer();
    }

}