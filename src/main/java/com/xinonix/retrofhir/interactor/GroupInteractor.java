package com.xinonix.retrofhir.interactor;

import com.xinonix.hl7.fhir.stu3.CodeableConcept;
import com.xinonix.hl7.fhir.stu3.Group.Type;
import com.xinonix.hl7.fhir.stu3.GroupCharacteristic;
import com.xinonix.hl7.fhir.stu3.Identifier;

import com.xinonix.retrofhir.Parameters;
import com.xinonix.retrofhir.Prefix;
import com.xinonix.retrofhir.Modifier;
import com.xinonix.retrofhir.service.GroupService;

import com.xinonix.hl7.fhir.stu3.Group;

public class GroupInteractor extends ResourceInteractor<GroupService, Group> {

    public static class GroupComposer extends Composer<GroupService, Group, GroupComposer> {

        public GroupComposer()
        {
            super((Class) GroupService.class, (Class) Group.class);
        }

		public ResourceInteractor.Composer setActual(Modifier modifier, Prefix prefix, Boolean Actual)
		{
			return setParameter(Parameters.ACTUAL, modifier, prefix, Actual);
		}

		public ResourceInteractor.Composer setActual(Modifier modifier, Boolean Actual)
		{
			return setParameter(Parameters.ACTUAL, modifier, Actual);
		}

		public ResourceInteractor.Composer setActual(Prefix prefix, Boolean Actual)
		{
			return setParameter(Parameters.ACTUAL, prefix, Actual);
		}
        			
		public ResourceInteractor.Composer setActual(Boolean Actual)
		{
			return setParameter(Parameters.ACTUAL, Actual);
		}

		public ResourceInteractor.Composer setCharacteristic(Modifier modifier, Prefix prefix, CodeableConcept Characteristic)
		{
			return setParameter(Parameters.CHARACTERISTIC, modifier, prefix, Characteristic);
		}

		public ResourceInteractor.Composer setCharacteristic(Modifier modifier, CodeableConcept Characteristic)
		{
			return setParameter(Parameters.CHARACTERISTIC, modifier, Characteristic);
		}

		public ResourceInteractor.Composer setCharacteristic(Prefix prefix, CodeableConcept Characteristic)
		{
			return setParameter(Parameters.CHARACTERISTIC, prefix, Characteristic);
		}
        			
		public ResourceInteractor.Composer setCharacteristic(CodeableConcept Characteristic)
		{
			return setParameter(Parameters.CHARACTERISTIC, Characteristic);
		}

		public ResourceInteractor.Composer setCharacteristicValue(Modifier modifier, Prefix prefix, String CharacteristicValue)
		{
			return setParameter(Parameters.CHARACTERISTIC_VALUE, modifier, prefix, CharacteristicValue);
		}

		public ResourceInteractor.Composer setCharacteristicValue(Modifier modifier, String CharacteristicValue)
		{
			return setParameter(Parameters.CHARACTERISTIC_VALUE, modifier, CharacteristicValue);
		}

		public ResourceInteractor.Composer setCharacteristicValue(Prefix prefix, String CharacteristicValue)
		{
			return setParameter(Parameters.CHARACTERISTIC_VALUE, prefix, CharacteristicValue);
		}
        			
		public ResourceInteractor.Composer setCharacteristicValue(String CharacteristicValue)
		{
			return setParameter(Parameters.CHARACTERISTIC_VALUE, CharacteristicValue);
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

		public ResourceInteractor.Composer setExclude(Modifier modifier, Prefix prefix, Boolean Exclude)
		{
			return setParameter(Parameters.EXCLUDE, modifier, prefix, Exclude);
		}

		public ResourceInteractor.Composer setExclude(Modifier modifier, Boolean Exclude)
		{
			return setParameter(Parameters.EXCLUDE, modifier, Exclude);
		}

		public ResourceInteractor.Composer setExclude(Prefix prefix, Boolean Exclude)
		{
			return setParameter(Parameters.EXCLUDE, prefix, Exclude);
		}
        			
		public ResourceInteractor.Composer setExclude(Boolean Exclude)
		{
			return setParameter(Parameters.EXCLUDE, Exclude);
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

		public ResourceInteractor.Composer setType(Modifier modifier, Prefix prefix, Group.Type Type)
		{
			return setParameter(Parameters.TYPE, modifier, prefix, Type);
		}

		public ResourceInteractor.Composer setType(Modifier modifier, Group.Type Type)
		{
			return setParameter(Parameters.TYPE, modifier, Type);
		}

		public ResourceInteractor.Composer setType(Prefix prefix, Group.Type Type)
		{
			return setParameter(Parameters.TYPE, prefix, Type);
		}
        			
		public ResourceInteractor.Composer setType(Group.Type Type)
		{
			return setParameter(Parameters.TYPE, Type);
		}

		public ResourceInteractor.Composer setValue(Modifier modifier, Prefix prefix, GroupCharacteristic Value)
		{
			return setParameter(Parameters.VALUE, modifier, prefix, Value);
		}

		public ResourceInteractor.Composer setValue(Modifier modifier, GroupCharacteristic Value)
		{
			return setParameter(Parameters.VALUE, modifier, Value);
		}

		public ResourceInteractor.Composer setValue(Prefix prefix, GroupCharacteristic Value)
		{
			return setParameter(Parameters.VALUE, prefix, Value);
		}
        			
		public ResourceInteractor.Composer setValue(GroupCharacteristic Value)
		{
			return setParameter(Parameters.VALUE, Value);
		}

    }

    public static <T> GroupInteractor.GroupComposer Composer()
    {
        return new GroupComposer();
    }

}