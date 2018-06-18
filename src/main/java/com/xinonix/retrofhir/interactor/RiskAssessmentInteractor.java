package com.xinonix.retrofhir.interactor;

import java.util.Date;
import com.xinonix.hl7.fhir.stu3.CodeableConcept;
import com.xinonix.hl7.fhir.stu3.Identifier;

import com.xinonix.retrofhir.Parameters;
import com.xinonix.retrofhir.Prefix;
import com.xinonix.retrofhir.Modifier;
import com.xinonix.retrofhir.service.RiskAssessmentService;

import com.xinonix.hl7.fhir.stu3.RiskAssessment;

public class RiskAssessmentInteractor extends ResourceInteractor<RiskAssessmentService, RiskAssessment> {

    public static class RiskAssessmentComposer extends Composer<RiskAssessmentService, RiskAssessment, RiskAssessmentComposer> {

        public RiskAssessmentComposer()
        {
            super((Class) RiskAssessmentService.class, (Class) RiskAssessment.class);
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

		public ResourceInteractor.Composer setMethod(Modifier modifier, Prefix prefix, CodeableConcept Method)
		{
			return setParameter(Parameters.METHOD, modifier, prefix, Method);
		}

		public ResourceInteractor.Composer setMethod(Modifier modifier, CodeableConcept Method)
		{
			return setParameter(Parameters.METHOD, modifier, Method);
		}

		public ResourceInteractor.Composer setMethod(Prefix prefix, CodeableConcept Method)
		{
			return setParameter(Parameters.METHOD, prefix, Method);
		}
        			
		public ResourceInteractor.Composer setMethod(CodeableConcept Method)
		{
			return setParameter(Parameters.METHOD, Method);
		}

		public ResourceInteractor.Composer setProbability(Modifier modifier, Prefix prefix, Double Probability)
		{
			return setParameter(Parameters.PROBABILITY, modifier, prefix, Probability);
		}

		public ResourceInteractor.Composer setProbability(Modifier modifier, Double Probability)
		{
			return setParameter(Parameters.PROBABILITY, modifier, Probability);
		}

		public ResourceInteractor.Composer setProbability(Prefix prefix, Double Probability)
		{
			return setParameter(Parameters.PROBABILITY, prefix, Probability);
		}
        			
		public ResourceInteractor.Composer setProbability(Double Probability)
		{
			return setParameter(Parameters.PROBABILITY, Probability);
		}

		public ResourceInteractor.Composer setRisk(Modifier modifier, Prefix prefix, CodeableConcept Risk)
		{
			return setParameter(Parameters.RISK, modifier, prefix, Risk);
		}

		public ResourceInteractor.Composer setRisk(Modifier modifier, CodeableConcept Risk)
		{
			return setParameter(Parameters.RISK, modifier, Risk);
		}

		public ResourceInteractor.Composer setRisk(Prefix prefix, CodeableConcept Risk)
		{
			return setParameter(Parameters.RISK, prefix, Risk);
		}
        			
		public ResourceInteractor.Composer setRisk(CodeableConcept Risk)
		{
			return setParameter(Parameters.RISK, Risk);
		}

    }

    public static <T> RiskAssessmentInteractor.RiskAssessmentComposer Composer()
    {
        return new RiskAssessmentComposer();
    }

}