package com.xinonix.retrofhir.interactor;

import com.xinonix.hl7.fhir.stu3.CodeableConcept;
import com.xinonix.hl7.fhir.stu3.Medication.Status;

import com.xinonix.retrofhir.Parameters;
import com.xinonix.retrofhir.Prefix;
import com.xinonix.retrofhir.Modifier;
import com.xinonix.retrofhir.service.MedicationService;

import com.xinonix.hl7.fhir.stu3.Medication;

public class MedicationInteractor extends ResourceInteractor<MedicationService, Medication> {

    public static class MedicationComposer extends Composer<MedicationService, Medication, MedicationComposer> {

        public MedicationComposer()
        {
            super((Class) MedicationService.class, (Class) Medication.class);
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

		public ResourceInteractor.Composer setContainer(Modifier modifier, Prefix prefix, CodeableConcept Container)
		{
			return setParameter(Parameters.CONTAINER, modifier, prefix, Container);
		}

		public ResourceInteractor.Composer setContainer(Modifier modifier, CodeableConcept Container)
		{
			return setParameter(Parameters.CONTAINER, modifier, Container);
		}

		public ResourceInteractor.Composer setContainer(Prefix prefix, CodeableConcept Container)
		{
			return setParameter(Parameters.CONTAINER, prefix, Container);
		}
        			
		public ResourceInteractor.Composer setContainer(CodeableConcept Container)
		{
			return setParameter(Parameters.CONTAINER, Container);
		}

		public ResourceInteractor.Composer setForm(Modifier modifier, Prefix prefix, CodeableConcept Form)
		{
			return setParameter(Parameters.FORM, modifier, prefix, Form);
		}

		public ResourceInteractor.Composer setForm(Modifier modifier, CodeableConcept Form)
		{
			return setParameter(Parameters.FORM, modifier, Form);
		}

		public ResourceInteractor.Composer setForm(Prefix prefix, CodeableConcept Form)
		{
			return setParameter(Parameters.FORM, prefix, Form);
		}
        			
		public ResourceInteractor.Composer setForm(CodeableConcept Form)
		{
			return setParameter(Parameters.FORM, Form);
		}

		public ResourceInteractor.Composer setIngredientCode(Modifier modifier, Prefix prefix, CodeableConcept IngredientCode)
		{
			return setParameter(Parameters.INGREDIENT_CODE, modifier, prefix, IngredientCode);
		}

		public ResourceInteractor.Composer setIngredientCode(Modifier modifier, CodeableConcept IngredientCode)
		{
			return setParameter(Parameters.INGREDIENT_CODE, modifier, IngredientCode);
		}

		public ResourceInteractor.Composer setIngredientCode(Prefix prefix, CodeableConcept IngredientCode)
		{
			return setParameter(Parameters.INGREDIENT_CODE, prefix, IngredientCode);
		}
        			
		public ResourceInteractor.Composer setIngredientCode(CodeableConcept IngredientCode)
		{
			return setParameter(Parameters.INGREDIENT_CODE, IngredientCode);
		}

		public ResourceInteractor.Composer setOverTheCounter(Modifier modifier, Prefix prefix, Boolean OverTheCounter)
		{
			return setParameter(Parameters.OVER_THE_COUNTER, modifier, prefix, OverTheCounter);
		}

		public ResourceInteractor.Composer setOverTheCounter(Modifier modifier, Boolean OverTheCounter)
		{
			return setParameter(Parameters.OVER_THE_COUNTER, modifier, OverTheCounter);
		}

		public ResourceInteractor.Composer setOverTheCounter(Prefix prefix, Boolean OverTheCounter)
		{
			return setParameter(Parameters.OVER_THE_COUNTER, prefix, OverTheCounter);
		}
        			
		public ResourceInteractor.Composer setOverTheCounter(Boolean OverTheCounter)
		{
			return setParameter(Parameters.OVER_THE_COUNTER, OverTheCounter);
		}

		public ResourceInteractor.Composer setPackageItemCode(Modifier modifier, Prefix prefix, CodeableConcept PackageItemCode)
		{
			return setParameter(Parameters.PACKAGE_ITEM_CODE, modifier, prefix, PackageItemCode);
		}

		public ResourceInteractor.Composer setPackageItemCode(Modifier modifier, CodeableConcept PackageItemCode)
		{
			return setParameter(Parameters.PACKAGE_ITEM_CODE, modifier, PackageItemCode);
		}

		public ResourceInteractor.Composer setPackageItemCode(Prefix prefix, CodeableConcept PackageItemCode)
		{
			return setParameter(Parameters.PACKAGE_ITEM_CODE, prefix, PackageItemCode);
		}
        			
		public ResourceInteractor.Composer setPackageItemCode(CodeableConcept PackageItemCode)
		{
			return setParameter(Parameters.PACKAGE_ITEM_CODE, PackageItemCode);
		}

		public ResourceInteractor.Composer setStatus(Modifier modifier, Prefix prefix, Medication.Status Status)
		{
			return setParameter(Parameters.STATUS, modifier, prefix, Status);
		}

		public ResourceInteractor.Composer setStatus(Modifier modifier, Medication.Status Status)
		{
			return setParameter(Parameters.STATUS, modifier, Status);
		}

		public ResourceInteractor.Composer setStatus(Prefix prefix, Medication.Status Status)
		{
			return setParameter(Parameters.STATUS, prefix, Status);
		}
        			
		public ResourceInteractor.Composer setStatus(Medication.Status Status)
		{
			return setParameter(Parameters.STATUS, Status);
		}

    }

    public static <T> MedicationInteractor.MedicationComposer Composer()
    {
        return new MedicationComposer();
    }

}