package com.xinonix.retrofhir.interactor;

import java.util.Date;
import com.xinonix.hl7.fhir.stu3.CodeableConcept;
import com.xinonix.hl7.fhir.stu3.ObservationRelated;
import com.xinonix.hl7.fhir.stu3.Identifier;
import com.xinonix.hl7.fhir.stu3.Observation.Status;
import com.xinonix.hl7.fhir.stu3.ObservationRelated.Type;
import com.xinonix.hl7.fhir.stu3.Quantity;

import com.xinonix.retrofhir.Parameters;
import com.xinonix.retrofhir.Prefix;
import com.xinonix.retrofhir.Modifier;
import com.xinonix.retrofhir.service.ObservationService;

import com.xinonix.hl7.fhir.stu3.Observation;

public class ObservationInteractor extends ResourceInteractor<ObservationService, Observation> {

    public static class ObservationComposer extends Composer<ObservationService, Observation, ObservationComposer> {

        public ObservationComposer()
        {
            super((Class) ObservationService.class, (Class) Observation.class);
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

		public ResourceInteractor.Composer setCodeValueConcept(Modifier modifier, Prefix prefix, String CodeValueConcept)
		{
			return setParameter(Parameters.CODE_VALUE_CONCEPT, modifier, prefix, CodeValueConcept);
		}

		public ResourceInteractor.Composer setCodeValueConcept(Modifier modifier, String CodeValueConcept)
		{
			return setParameter(Parameters.CODE_VALUE_CONCEPT, modifier, CodeValueConcept);
		}

		public ResourceInteractor.Composer setCodeValueConcept(Prefix prefix, String CodeValueConcept)
		{
			return setParameter(Parameters.CODE_VALUE_CONCEPT, prefix, CodeValueConcept);
		}
        			
		public ResourceInteractor.Composer setCodeValueConcept(String CodeValueConcept)
		{
			return setParameter(Parameters.CODE_VALUE_CONCEPT, CodeValueConcept);
		}

		public ResourceInteractor.Composer setCodeValueDate(Modifier modifier, Prefix prefix, String CodeValueDate)
		{
			return setParameter(Parameters.CODE_VALUE_DATE, modifier, prefix, CodeValueDate);
		}

		public ResourceInteractor.Composer setCodeValueDate(Modifier modifier, String CodeValueDate)
		{
			return setParameter(Parameters.CODE_VALUE_DATE, modifier, CodeValueDate);
		}

		public ResourceInteractor.Composer setCodeValueDate(Prefix prefix, String CodeValueDate)
		{
			return setParameter(Parameters.CODE_VALUE_DATE, prefix, CodeValueDate);
		}
        			
		public ResourceInteractor.Composer setCodeValueDate(String CodeValueDate)
		{
			return setParameter(Parameters.CODE_VALUE_DATE, CodeValueDate);
		}

		public ResourceInteractor.Composer setCodeValueQuantity(Modifier modifier, Prefix prefix, String CodeValueQuantity)
		{
			return setParameter(Parameters.CODE_VALUE_QUANTITY, modifier, prefix, CodeValueQuantity);
		}

		public ResourceInteractor.Composer setCodeValueQuantity(Modifier modifier, String CodeValueQuantity)
		{
			return setParameter(Parameters.CODE_VALUE_QUANTITY, modifier, CodeValueQuantity);
		}

		public ResourceInteractor.Composer setCodeValueQuantity(Prefix prefix, String CodeValueQuantity)
		{
			return setParameter(Parameters.CODE_VALUE_QUANTITY, prefix, CodeValueQuantity);
		}
        			
		public ResourceInteractor.Composer setCodeValueQuantity(String CodeValueQuantity)
		{
			return setParameter(Parameters.CODE_VALUE_QUANTITY, CodeValueQuantity);
		}

		public ResourceInteractor.Composer setCodeValueString(Modifier modifier, Prefix prefix, String CodeValueString)
		{
			return setParameter(Parameters.CODE_VALUE_STRING, modifier, prefix, CodeValueString);
		}

		public ResourceInteractor.Composer setCodeValueString(Modifier modifier, String CodeValueString)
		{
			return setParameter(Parameters.CODE_VALUE_STRING, modifier, CodeValueString);
		}

		public ResourceInteractor.Composer setCodeValueString(Prefix prefix, String CodeValueString)
		{
			return setParameter(Parameters.CODE_VALUE_STRING, prefix, CodeValueString);
		}
        			
		public ResourceInteractor.Composer setCodeValueString(String CodeValueString)
		{
			return setParameter(Parameters.CODE_VALUE_STRING, CodeValueString);
		}

		public ResourceInteractor.Composer setComboCode(Modifier modifier, Prefix prefix, CodeableConcept ComboCode)
		{
			return setParameter(Parameters.COMBO_CODE, modifier, prefix, ComboCode);
		}

		public ResourceInteractor.Composer setComboCode(Modifier modifier, CodeableConcept ComboCode)
		{
			return setParameter(Parameters.COMBO_CODE, modifier, ComboCode);
		}

		public ResourceInteractor.Composer setComboCode(Prefix prefix, CodeableConcept ComboCode)
		{
			return setParameter(Parameters.COMBO_CODE, prefix, ComboCode);
		}
        			
		public ResourceInteractor.Composer setComboCode(CodeableConcept ComboCode)
		{
			return setParameter(Parameters.COMBO_CODE, ComboCode);
		}

		public ResourceInteractor.Composer setComboCodeValueConcept(Modifier modifier, Prefix prefix, String ComboCodeValueConcept)
		{
			return setParameter(Parameters.COMBO_CODE_VALUE_CONCEPT, modifier, prefix, ComboCodeValueConcept);
		}

		public ResourceInteractor.Composer setComboCodeValueConcept(Modifier modifier, String ComboCodeValueConcept)
		{
			return setParameter(Parameters.COMBO_CODE_VALUE_CONCEPT, modifier, ComboCodeValueConcept);
		}

		public ResourceInteractor.Composer setComboCodeValueConcept(Prefix prefix, String ComboCodeValueConcept)
		{
			return setParameter(Parameters.COMBO_CODE_VALUE_CONCEPT, prefix, ComboCodeValueConcept);
		}
        			
		public ResourceInteractor.Composer setComboCodeValueConcept(String ComboCodeValueConcept)
		{
			return setParameter(Parameters.COMBO_CODE_VALUE_CONCEPT, ComboCodeValueConcept);
		}

		public ResourceInteractor.Composer setComboCodeValueQuantity(Modifier modifier, Prefix prefix, String ComboCodeValueQuantity)
		{
			return setParameter(Parameters.COMBO_CODE_VALUE_QUANTITY, modifier, prefix, ComboCodeValueQuantity);
		}

		public ResourceInteractor.Composer setComboCodeValueQuantity(Modifier modifier, String ComboCodeValueQuantity)
		{
			return setParameter(Parameters.COMBO_CODE_VALUE_QUANTITY, modifier, ComboCodeValueQuantity);
		}

		public ResourceInteractor.Composer setComboCodeValueQuantity(Prefix prefix, String ComboCodeValueQuantity)
		{
			return setParameter(Parameters.COMBO_CODE_VALUE_QUANTITY, prefix, ComboCodeValueQuantity);
		}
        			
		public ResourceInteractor.Composer setComboCodeValueQuantity(String ComboCodeValueQuantity)
		{
			return setParameter(Parameters.COMBO_CODE_VALUE_QUANTITY, ComboCodeValueQuantity);
		}

		public ResourceInteractor.Composer setComboDataAbsentReason(Modifier modifier, Prefix prefix, CodeableConcept ComboDataAbsentReason)
		{
			return setParameter(Parameters.COMBO_DATA_ABSENT_REASON, modifier, prefix, ComboDataAbsentReason);
		}

		public ResourceInteractor.Composer setComboDataAbsentReason(Modifier modifier, CodeableConcept ComboDataAbsentReason)
		{
			return setParameter(Parameters.COMBO_DATA_ABSENT_REASON, modifier, ComboDataAbsentReason);
		}

		public ResourceInteractor.Composer setComboDataAbsentReason(Prefix prefix, CodeableConcept ComboDataAbsentReason)
		{
			return setParameter(Parameters.COMBO_DATA_ABSENT_REASON, prefix, ComboDataAbsentReason);
		}
        			
		public ResourceInteractor.Composer setComboDataAbsentReason(CodeableConcept ComboDataAbsentReason)
		{
			return setParameter(Parameters.COMBO_DATA_ABSENT_REASON, ComboDataAbsentReason);
		}

		public ResourceInteractor.Composer setComboValueConcept(Modifier modifier, Prefix prefix, CodeableConcept ComboValueConcept)
		{
			return setParameter(Parameters.COMBO_VALUE_CONCEPT, modifier, prefix, ComboValueConcept);
		}

		public ResourceInteractor.Composer setComboValueConcept(Modifier modifier, CodeableConcept ComboValueConcept)
		{
			return setParameter(Parameters.COMBO_VALUE_CONCEPT, modifier, ComboValueConcept);
		}

		public ResourceInteractor.Composer setComboValueConcept(Prefix prefix, CodeableConcept ComboValueConcept)
		{
			return setParameter(Parameters.COMBO_VALUE_CONCEPT, prefix, ComboValueConcept);
		}
        			
		public ResourceInteractor.Composer setComboValueConcept(CodeableConcept ComboValueConcept)
		{
			return setParameter(Parameters.COMBO_VALUE_CONCEPT, ComboValueConcept);
		}

		public ResourceInteractor.Composer setComboValueQuantity(Modifier modifier, Prefix prefix, Quantity ComboValueQuantity)
		{
			return setParameter(Parameters.COMBO_VALUE_QUANTITY, modifier, prefix, ComboValueQuantity);
		}

		public ResourceInteractor.Composer setComboValueQuantity(Modifier modifier, Quantity ComboValueQuantity)
		{
			return setParameter(Parameters.COMBO_VALUE_QUANTITY, modifier, ComboValueQuantity);
		}

		public ResourceInteractor.Composer setComboValueQuantity(Prefix prefix, Quantity ComboValueQuantity)
		{
			return setParameter(Parameters.COMBO_VALUE_QUANTITY, prefix, ComboValueQuantity);
		}
        			
		public ResourceInteractor.Composer setComboValueQuantity(Quantity ComboValueQuantity)
		{
			return setParameter(Parameters.COMBO_VALUE_QUANTITY, ComboValueQuantity);
		}

		public ResourceInteractor.Composer setComponentCode(Modifier modifier, Prefix prefix, CodeableConcept ComponentCode)
		{
			return setParameter(Parameters.COMPONENT_CODE, modifier, prefix, ComponentCode);
		}

		public ResourceInteractor.Composer setComponentCode(Modifier modifier, CodeableConcept ComponentCode)
		{
			return setParameter(Parameters.COMPONENT_CODE, modifier, ComponentCode);
		}

		public ResourceInteractor.Composer setComponentCode(Prefix prefix, CodeableConcept ComponentCode)
		{
			return setParameter(Parameters.COMPONENT_CODE, prefix, ComponentCode);
		}
        			
		public ResourceInteractor.Composer setComponentCode(CodeableConcept ComponentCode)
		{
			return setParameter(Parameters.COMPONENT_CODE, ComponentCode);
		}

		public ResourceInteractor.Composer setComponentCodeValueConcept(Modifier modifier, Prefix prefix, String ComponentCodeValueConcept)
		{
			return setParameter(Parameters.COMPONENT_CODE_VALUE_CONCEPT, modifier, prefix, ComponentCodeValueConcept);
		}

		public ResourceInteractor.Composer setComponentCodeValueConcept(Modifier modifier, String ComponentCodeValueConcept)
		{
			return setParameter(Parameters.COMPONENT_CODE_VALUE_CONCEPT, modifier, ComponentCodeValueConcept);
		}

		public ResourceInteractor.Composer setComponentCodeValueConcept(Prefix prefix, String ComponentCodeValueConcept)
		{
			return setParameter(Parameters.COMPONENT_CODE_VALUE_CONCEPT, prefix, ComponentCodeValueConcept);
		}
        			
		public ResourceInteractor.Composer setComponentCodeValueConcept(String ComponentCodeValueConcept)
		{
			return setParameter(Parameters.COMPONENT_CODE_VALUE_CONCEPT, ComponentCodeValueConcept);
		}

		public ResourceInteractor.Composer setComponentCodeValueQuantity(Modifier modifier, Prefix prefix, String ComponentCodeValueQuantity)
		{
			return setParameter(Parameters.COMPONENT_CODE_VALUE_QUANTITY, modifier, prefix, ComponentCodeValueQuantity);
		}

		public ResourceInteractor.Composer setComponentCodeValueQuantity(Modifier modifier, String ComponentCodeValueQuantity)
		{
			return setParameter(Parameters.COMPONENT_CODE_VALUE_QUANTITY, modifier, ComponentCodeValueQuantity);
		}

		public ResourceInteractor.Composer setComponentCodeValueQuantity(Prefix prefix, String ComponentCodeValueQuantity)
		{
			return setParameter(Parameters.COMPONENT_CODE_VALUE_QUANTITY, prefix, ComponentCodeValueQuantity);
		}
        			
		public ResourceInteractor.Composer setComponentCodeValueQuantity(String ComponentCodeValueQuantity)
		{
			return setParameter(Parameters.COMPONENT_CODE_VALUE_QUANTITY, ComponentCodeValueQuantity);
		}

		public ResourceInteractor.Composer setComponentDataAbsentReason(Modifier modifier, Prefix prefix, CodeableConcept ComponentDataAbsentReason)
		{
			return setParameter(Parameters.COMPONENT_DATA_ABSENT_REASON, modifier, prefix, ComponentDataAbsentReason);
		}

		public ResourceInteractor.Composer setComponentDataAbsentReason(Modifier modifier, CodeableConcept ComponentDataAbsentReason)
		{
			return setParameter(Parameters.COMPONENT_DATA_ABSENT_REASON, modifier, ComponentDataAbsentReason);
		}

		public ResourceInteractor.Composer setComponentDataAbsentReason(Prefix prefix, CodeableConcept ComponentDataAbsentReason)
		{
			return setParameter(Parameters.COMPONENT_DATA_ABSENT_REASON, prefix, ComponentDataAbsentReason);
		}
        			
		public ResourceInteractor.Composer setComponentDataAbsentReason(CodeableConcept ComponentDataAbsentReason)
		{
			return setParameter(Parameters.COMPONENT_DATA_ABSENT_REASON, ComponentDataAbsentReason);
		}

		public ResourceInteractor.Composer setComponentValueConcept(Modifier modifier, Prefix prefix, CodeableConcept ComponentValueConcept)
		{
			return setParameter(Parameters.COMPONENT_VALUE_CONCEPT, modifier, prefix, ComponentValueConcept);
		}

		public ResourceInteractor.Composer setComponentValueConcept(Modifier modifier, CodeableConcept ComponentValueConcept)
		{
			return setParameter(Parameters.COMPONENT_VALUE_CONCEPT, modifier, ComponentValueConcept);
		}

		public ResourceInteractor.Composer setComponentValueConcept(Prefix prefix, CodeableConcept ComponentValueConcept)
		{
			return setParameter(Parameters.COMPONENT_VALUE_CONCEPT, prefix, ComponentValueConcept);
		}
        			
		public ResourceInteractor.Composer setComponentValueConcept(CodeableConcept ComponentValueConcept)
		{
			return setParameter(Parameters.COMPONENT_VALUE_CONCEPT, ComponentValueConcept);
		}

		public ResourceInteractor.Composer setComponentValueQuantity(Modifier modifier, Prefix prefix, Quantity ComponentValueQuantity)
		{
			return setParameter(Parameters.COMPONENT_VALUE_QUANTITY, modifier, prefix, ComponentValueQuantity);
		}

		public ResourceInteractor.Composer setComponentValueQuantity(Modifier modifier, Quantity ComponentValueQuantity)
		{
			return setParameter(Parameters.COMPONENT_VALUE_QUANTITY, modifier, ComponentValueQuantity);
		}

		public ResourceInteractor.Composer setComponentValueQuantity(Prefix prefix, Quantity ComponentValueQuantity)
		{
			return setParameter(Parameters.COMPONENT_VALUE_QUANTITY, prefix, ComponentValueQuantity);
		}
        			
		public ResourceInteractor.Composer setComponentValueQuantity(Quantity ComponentValueQuantity)
		{
			return setParameter(Parameters.COMPONENT_VALUE_QUANTITY, ComponentValueQuantity);
		}

		public ResourceInteractor.Composer setDataAbsentReason(Modifier modifier, Prefix prefix, CodeableConcept DataAbsentReason)
		{
			return setParameter(Parameters.DATA_ABSENT_REASON, modifier, prefix, DataAbsentReason);
		}

		public ResourceInteractor.Composer setDataAbsentReason(Modifier modifier, CodeableConcept DataAbsentReason)
		{
			return setParameter(Parameters.DATA_ABSENT_REASON, modifier, DataAbsentReason);
		}

		public ResourceInteractor.Composer setDataAbsentReason(Prefix prefix, CodeableConcept DataAbsentReason)
		{
			return setParameter(Parameters.DATA_ABSENT_REASON, prefix, DataAbsentReason);
		}
        			
		public ResourceInteractor.Composer setDataAbsentReason(CodeableConcept DataAbsentReason)
		{
			return setParameter(Parameters.DATA_ABSENT_REASON, DataAbsentReason);
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

		public ResourceInteractor.Composer setRelated(Modifier modifier, Prefix prefix, String Related)
		{
			return setParameter(Parameters.RELATED, modifier, prefix, Related);
		}

		public ResourceInteractor.Composer setRelated(Modifier modifier, String Related)
		{
			return setParameter(Parameters.RELATED, modifier, Related);
		}

		public ResourceInteractor.Composer setRelated(Prefix prefix, String Related)
		{
			return setParameter(Parameters.RELATED, prefix, Related);
		}
        			
		public ResourceInteractor.Composer setRelated(String Related)
		{
			return setParameter(Parameters.RELATED, Related);
		}

		public ResourceInteractor.Composer setRelatedType(Modifier modifier, Prefix prefix, ObservationRelated.Type RelatedType)
		{
			return setParameter(Parameters.RELATED_TYPE, modifier, prefix, RelatedType);
		}

		public ResourceInteractor.Composer setRelatedType(Modifier modifier, ObservationRelated.Type RelatedType)
		{
			return setParameter(Parameters.RELATED_TYPE, modifier, RelatedType);
		}

		public ResourceInteractor.Composer setRelatedType(Prefix prefix, ObservationRelated.Type RelatedType)
		{
			return setParameter(Parameters.RELATED_TYPE, prefix, RelatedType);
		}
        			
		public ResourceInteractor.Composer setRelatedType(ObservationRelated.Type RelatedType)
		{
			return setParameter(Parameters.RELATED_TYPE, RelatedType);
		}

		public ResourceInteractor.Composer setStatus(Modifier modifier, Prefix prefix, Observation.Status Status)
		{
			return setParameter(Parameters.STATUS, modifier, prefix, Status);
		}

		public ResourceInteractor.Composer setStatus(Modifier modifier, Observation.Status Status)
		{
			return setParameter(Parameters.STATUS, modifier, Status);
		}

		public ResourceInteractor.Composer setStatus(Prefix prefix, Observation.Status Status)
		{
			return setParameter(Parameters.STATUS, prefix, Status);
		}
        			
		public ResourceInteractor.Composer setStatus(Observation.Status Status)
		{
			return setParameter(Parameters.STATUS, Status);
		}

		public ResourceInteractor.Composer setValueConcept(Modifier modifier, Prefix prefix, CodeableConcept ValueConcept)
		{
			return setParameter(Parameters.VALUE_CONCEPT, modifier, prefix, ValueConcept);
		}

		public ResourceInteractor.Composer setValueConcept(Modifier modifier, CodeableConcept ValueConcept)
		{
			return setParameter(Parameters.VALUE_CONCEPT, modifier, ValueConcept);
		}

		public ResourceInteractor.Composer setValueConcept(Prefix prefix, CodeableConcept ValueConcept)
		{
			return setParameter(Parameters.VALUE_CONCEPT, prefix, ValueConcept);
		}
        			
		public ResourceInteractor.Composer setValueConcept(CodeableConcept ValueConcept)
		{
			return setParameter(Parameters.VALUE_CONCEPT, ValueConcept);
		}

		public ResourceInteractor.Composer setValueDate(Modifier modifier, Prefix prefix, Date ValueDate)
		{
			return setParameter(Parameters.VALUE_DATE, modifier, prefix, ValueDate);
		}

		public ResourceInteractor.Composer setValueDate(Modifier modifier, Date ValueDate)
		{
			return setParameter(Parameters.VALUE_DATE, modifier, ValueDate);
		}

		public ResourceInteractor.Composer setValueDate(Prefix prefix, Date ValueDate)
		{
			return setParameter(Parameters.VALUE_DATE, prefix, ValueDate);
		}
        			
		public ResourceInteractor.Composer setValueDate(Date ValueDate)
		{
			return setParameter(Parameters.VALUE_DATE, ValueDate);
		}

		public ResourceInteractor.Composer setValueQuantity(Modifier modifier, Prefix prefix, Quantity ValueQuantity)
		{
			return setParameter(Parameters.VALUE_QUANTITY, modifier, prefix, ValueQuantity);
		}

		public ResourceInteractor.Composer setValueQuantity(Modifier modifier, Quantity ValueQuantity)
		{
			return setParameter(Parameters.VALUE_QUANTITY, modifier, ValueQuantity);
		}

		public ResourceInteractor.Composer setValueQuantity(Prefix prefix, Quantity ValueQuantity)
		{
			return setParameter(Parameters.VALUE_QUANTITY, prefix, ValueQuantity);
		}
        			
		public ResourceInteractor.Composer setValueQuantity(Quantity ValueQuantity)
		{
			return setParameter(Parameters.VALUE_QUANTITY, ValueQuantity);
		}

		public ResourceInteractor.Composer setValueString(Modifier modifier, Prefix prefix, String ValueString)
		{
			return setParameter(Parameters.VALUE_STRING, modifier, prefix, ValueString);
		}

		public ResourceInteractor.Composer setValueString(Modifier modifier, String ValueString)
		{
			return setParameter(Parameters.VALUE_STRING, modifier, ValueString);
		}

		public ResourceInteractor.Composer setValueString(Prefix prefix, String ValueString)
		{
			return setParameter(Parameters.VALUE_STRING, prefix, ValueString);
		}
        			
		public ResourceInteractor.Composer setValueString(String ValueString)
		{
			return setParameter(Parameters.VALUE_STRING, ValueString);
		}

    }

    public static <T> ObservationInteractor.ObservationComposer Composer()
    {
        return new ObservationComposer();
    }

}