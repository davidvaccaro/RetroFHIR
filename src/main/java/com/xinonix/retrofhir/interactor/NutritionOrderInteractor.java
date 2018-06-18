package com.xinonix.retrofhir.interactor;

import java.util.Date;
import com.xinonix.hl7.fhir.stu3.CodeableConcept;
import com.xinonix.hl7.fhir.stu3.Identifier;
import com.xinonix.hl7.fhir.stu3.NutritionOrder.Status;

import com.xinonix.retrofhir.Parameters;
import com.xinonix.retrofhir.Prefix;
import com.xinonix.retrofhir.Modifier;
import com.xinonix.retrofhir.service.NutritionOrderService;

import com.xinonix.hl7.fhir.stu3.NutritionOrder;

public class NutritionOrderInteractor extends ResourceInteractor<NutritionOrderService, NutritionOrder> {

    public static class NutritionOrderComposer extends Composer<NutritionOrderService, NutritionOrder, NutritionOrderComposer> {

        public NutritionOrderComposer()
        {
            super((Class) NutritionOrderService.class, (Class) NutritionOrder.class);
        }

		public ResourceInteractor.Composer setAdditive(Modifier modifier, Prefix prefix, CodeableConcept Additive)
		{
			return setParameter(Parameters.ADDITIVE, modifier, prefix, Additive);
		}

		public ResourceInteractor.Composer setAdditive(Modifier modifier, CodeableConcept Additive)
		{
			return setParameter(Parameters.ADDITIVE, modifier, Additive);
		}

		public ResourceInteractor.Composer setAdditive(Prefix prefix, CodeableConcept Additive)
		{
			return setParameter(Parameters.ADDITIVE, prefix, Additive);
		}
        			
		public ResourceInteractor.Composer setAdditive(CodeableConcept Additive)
		{
			return setParameter(Parameters.ADDITIVE, Additive);
		}

		public ResourceInteractor.Composer setDatetime(Modifier modifier, Prefix prefix, Date Datetime)
		{
			return setParameter(Parameters.DATETIME, modifier, prefix, Datetime);
		}

		public ResourceInteractor.Composer setDatetime(Modifier modifier, Date Datetime)
		{
			return setParameter(Parameters.DATETIME, modifier, Datetime);
		}

		public ResourceInteractor.Composer setDatetime(Prefix prefix, Date Datetime)
		{
			return setParameter(Parameters.DATETIME, prefix, Datetime);
		}
        			
		public ResourceInteractor.Composer setDatetime(Date Datetime)
		{
			return setParameter(Parameters.DATETIME, Datetime);
		}

		public ResourceInteractor.Composer setFormula(Modifier modifier, Prefix prefix, CodeableConcept Formula)
		{
			return setParameter(Parameters.FORMULA, modifier, prefix, Formula);
		}

		public ResourceInteractor.Composer setFormula(Modifier modifier, CodeableConcept Formula)
		{
			return setParameter(Parameters.FORMULA, modifier, Formula);
		}

		public ResourceInteractor.Composer setFormula(Prefix prefix, CodeableConcept Formula)
		{
			return setParameter(Parameters.FORMULA, prefix, Formula);
		}
        			
		public ResourceInteractor.Composer setFormula(CodeableConcept Formula)
		{
			return setParameter(Parameters.FORMULA, Formula);
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

		public ResourceInteractor.Composer setOraldiet(Modifier modifier, Prefix prefix, CodeableConcept Oraldiet)
		{
			return setParameter(Parameters.ORALDIET, modifier, prefix, Oraldiet);
		}

		public ResourceInteractor.Composer setOraldiet(Modifier modifier, CodeableConcept Oraldiet)
		{
			return setParameter(Parameters.ORALDIET, modifier, Oraldiet);
		}

		public ResourceInteractor.Composer setOraldiet(Prefix prefix, CodeableConcept Oraldiet)
		{
			return setParameter(Parameters.ORALDIET, prefix, Oraldiet);
		}
        			
		public ResourceInteractor.Composer setOraldiet(CodeableConcept Oraldiet)
		{
			return setParameter(Parameters.ORALDIET, Oraldiet);
		}

		public ResourceInteractor.Composer setStatus(Modifier modifier, Prefix prefix, NutritionOrder.Status Status)
		{
			return setParameter(Parameters.STATUS, modifier, prefix, Status);
		}

		public ResourceInteractor.Composer setStatus(Modifier modifier, NutritionOrder.Status Status)
		{
			return setParameter(Parameters.STATUS, modifier, Status);
		}

		public ResourceInteractor.Composer setStatus(Prefix prefix, NutritionOrder.Status Status)
		{
			return setParameter(Parameters.STATUS, prefix, Status);
		}
        			
		public ResourceInteractor.Composer setStatus(NutritionOrder.Status Status)
		{
			return setParameter(Parameters.STATUS, Status);
		}

		public ResourceInteractor.Composer setSupplement(Modifier modifier, Prefix prefix, CodeableConcept Supplement)
		{
			return setParameter(Parameters.SUPPLEMENT, modifier, prefix, Supplement);
		}

		public ResourceInteractor.Composer setSupplement(Modifier modifier, CodeableConcept Supplement)
		{
			return setParameter(Parameters.SUPPLEMENT, modifier, Supplement);
		}

		public ResourceInteractor.Composer setSupplement(Prefix prefix, CodeableConcept Supplement)
		{
			return setParameter(Parameters.SUPPLEMENT, prefix, Supplement);
		}
        			
		public ResourceInteractor.Composer setSupplement(CodeableConcept Supplement)
		{
			return setParameter(Parameters.SUPPLEMENT, Supplement);
		}

    }

    public static <T> NutritionOrderInteractor.NutritionOrderComposer Composer()
    {
        return new NutritionOrderComposer();
    }

}