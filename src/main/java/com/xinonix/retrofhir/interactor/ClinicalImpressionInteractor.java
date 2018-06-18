package com.xinonix.retrofhir.interactor;

import java.util.Date;
import com.xinonix.hl7.fhir.stu3.ClinicalImpression.Status;
import com.xinonix.hl7.fhir.stu3.CodeableConcept;
import com.xinonix.hl7.fhir.stu3.Identifier;

import com.xinonix.retrofhir.Parameters;
import com.xinonix.retrofhir.Prefix;
import com.xinonix.retrofhir.Modifier;
import com.xinonix.retrofhir.service.ClinicalImpressionService;

import com.xinonix.hl7.fhir.stu3.ClinicalImpression;

public class ClinicalImpressionInteractor extends ResourceInteractor<ClinicalImpressionService, ClinicalImpression> {

    public static class ClinicalImpressionComposer extends Composer<ClinicalImpressionService, ClinicalImpression, ClinicalImpressionComposer> {

        public ClinicalImpressionComposer()
        {
            super((Class) ClinicalImpressionService.class, (Class) ClinicalImpression.class);
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

		public ResourceInteractor.Composer setFindingCode(Modifier modifier, Prefix prefix, CodeableConcept FindingCode)
		{
			return setParameter(Parameters.FINDING_CODE, modifier, prefix, FindingCode);
		}

		public ResourceInteractor.Composer setFindingCode(Modifier modifier, CodeableConcept FindingCode)
		{
			return setParameter(Parameters.FINDING_CODE, modifier, FindingCode);
		}

		public ResourceInteractor.Composer setFindingCode(Prefix prefix, CodeableConcept FindingCode)
		{
			return setParameter(Parameters.FINDING_CODE, prefix, FindingCode);
		}
        			
		public ResourceInteractor.Composer setFindingCode(CodeableConcept FindingCode)
		{
			return setParameter(Parameters.FINDING_CODE, FindingCode);
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

		public ResourceInteractor.Composer setStatus(Modifier modifier, Prefix prefix, ClinicalImpression.Status Status)
		{
			return setParameter(Parameters.STATUS, modifier, prefix, Status);
		}

		public ResourceInteractor.Composer setStatus(Modifier modifier, ClinicalImpression.Status Status)
		{
			return setParameter(Parameters.STATUS, modifier, Status);
		}

		public ResourceInteractor.Composer setStatus(Prefix prefix, ClinicalImpression.Status Status)
		{
			return setParameter(Parameters.STATUS, prefix, Status);
		}
        			
		public ResourceInteractor.Composer setStatus(ClinicalImpression.Status Status)
		{
			return setParameter(Parameters.STATUS, Status);
		}

    }

    public static <T> ClinicalImpressionInteractor.ClinicalImpressionComposer Composer()
    {
        return new ClinicalImpressionComposer();
    }

}