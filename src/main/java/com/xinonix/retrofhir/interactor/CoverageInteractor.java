package com.xinonix.retrofhir.interactor;

import com.xinonix.hl7.fhir.stu3.CodeableConcept;
import com.xinonix.hl7.fhir.stu3.Identifier;

import com.xinonix.retrofhir.Parameters;
import com.xinonix.retrofhir.Prefix;
import com.xinonix.retrofhir.Modifier;
import com.xinonix.retrofhir.service.CoverageService;

import com.xinonix.hl7.fhir.stu3.Coverage;

public class CoverageInteractor extends ResourceInteractor<CoverageService, Coverage> {

    public static class CoverageComposer extends Composer<CoverageService, Coverage, CoverageComposer> {

        public CoverageComposer()
        {
            super((Class) CoverageService.class, (Class) Coverage.class);
        }

		public ResourceInteractor.Composer setClass(Modifier modifier, Prefix prefix, String Class)
		{
			return setParameter(Parameters.CLASS, modifier, prefix, Class);
		}

		public ResourceInteractor.Composer setClass(Modifier modifier, String Class)
		{
			return setParameter(Parameters.CLASS, modifier, Class);
		}

		public ResourceInteractor.Composer setClass(Prefix prefix, String Class)
		{
			return setParameter(Parameters.CLASS, prefix, Class);
		}
        			
		public ResourceInteractor.Composer setClass(String Class)
		{
			return setParameter(Parameters.CLASS, Class);
		}

		public ResourceInteractor.Composer setDependent(Modifier modifier, Prefix prefix, String Dependent)
		{
			return setParameter(Parameters.DEPENDENT, modifier, prefix, Dependent);
		}

		public ResourceInteractor.Composer setDependent(Modifier modifier, String Dependent)
		{
			return setParameter(Parameters.DEPENDENT, modifier, Dependent);
		}

		public ResourceInteractor.Composer setDependent(Prefix prefix, String Dependent)
		{
			return setParameter(Parameters.DEPENDENT, prefix, Dependent);
		}
        			
		public ResourceInteractor.Composer setDependent(String Dependent)
		{
			return setParameter(Parameters.DEPENDENT, Dependent);
		}

		public ResourceInteractor.Composer setGroup(Modifier modifier, Prefix prefix, String Group)
		{
			return setParameter(Parameters.GROUP, modifier, prefix, Group);
		}

		public ResourceInteractor.Composer setGroup(Modifier modifier, String Group)
		{
			return setParameter(Parameters.GROUP, modifier, Group);
		}

		public ResourceInteractor.Composer setGroup(Prefix prefix, String Group)
		{
			return setParameter(Parameters.GROUP, prefix, Group);
		}
        			
		public ResourceInteractor.Composer setGroup(String Group)
		{
			return setParameter(Parameters.GROUP, Group);
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

		public ResourceInteractor.Composer setPlan(Modifier modifier, Prefix prefix, String Plan)
		{
			return setParameter(Parameters.PLAN, modifier, prefix, Plan);
		}

		public ResourceInteractor.Composer setPlan(Modifier modifier, String Plan)
		{
			return setParameter(Parameters.PLAN, modifier, Plan);
		}

		public ResourceInteractor.Composer setPlan(Prefix prefix, String Plan)
		{
			return setParameter(Parameters.PLAN, prefix, Plan);
		}
        			
		public ResourceInteractor.Composer setPlan(String Plan)
		{
			return setParameter(Parameters.PLAN, Plan);
		}

		public ResourceInteractor.Composer setSequence(Modifier modifier, Prefix prefix, String Sequence)
		{
			return setParameter(Parameters.SEQUENCE, modifier, prefix, Sequence);
		}

		public ResourceInteractor.Composer setSequence(Modifier modifier, String Sequence)
		{
			return setParameter(Parameters.SEQUENCE, modifier, Sequence);
		}

		public ResourceInteractor.Composer setSequence(Prefix prefix, String Sequence)
		{
			return setParameter(Parameters.SEQUENCE, prefix, Sequence);
		}
        			
		public ResourceInteractor.Composer setSequence(String Sequence)
		{
			return setParameter(Parameters.SEQUENCE, Sequence);
		}

		public ResourceInteractor.Composer setSubclass(Modifier modifier, Prefix prefix, String Subclass)
		{
			return setParameter(Parameters.SUBCLASS, modifier, prefix, Subclass);
		}

		public ResourceInteractor.Composer setSubclass(Modifier modifier, String Subclass)
		{
			return setParameter(Parameters.SUBCLASS, modifier, Subclass);
		}

		public ResourceInteractor.Composer setSubclass(Prefix prefix, String Subclass)
		{
			return setParameter(Parameters.SUBCLASS, prefix, Subclass);
		}
        			
		public ResourceInteractor.Composer setSubclass(String Subclass)
		{
			return setParameter(Parameters.SUBCLASS, Subclass);
		}

		public ResourceInteractor.Composer setSubgroup(Modifier modifier, Prefix prefix, String Subgroup)
		{
			return setParameter(Parameters.SUBGROUP, modifier, prefix, Subgroup);
		}

		public ResourceInteractor.Composer setSubgroup(Modifier modifier, String Subgroup)
		{
			return setParameter(Parameters.SUBGROUP, modifier, Subgroup);
		}

		public ResourceInteractor.Composer setSubgroup(Prefix prefix, String Subgroup)
		{
			return setParameter(Parameters.SUBGROUP, prefix, Subgroup);
		}
        			
		public ResourceInteractor.Composer setSubgroup(String Subgroup)
		{
			return setParameter(Parameters.SUBGROUP, Subgroup);
		}

		public ResourceInteractor.Composer setSubplan(Modifier modifier, Prefix prefix, String Subplan)
		{
			return setParameter(Parameters.SUBPLAN, modifier, prefix, Subplan);
		}

		public ResourceInteractor.Composer setSubplan(Modifier modifier, String Subplan)
		{
			return setParameter(Parameters.SUBPLAN, modifier, Subplan);
		}

		public ResourceInteractor.Composer setSubplan(Prefix prefix, String Subplan)
		{
			return setParameter(Parameters.SUBPLAN, prefix, Subplan);
		}
        			
		public ResourceInteractor.Composer setSubplan(String Subplan)
		{
			return setParameter(Parameters.SUBPLAN, Subplan);
		}

		public ResourceInteractor.Composer setType(Modifier modifier, Prefix prefix, CodeableConcept Type)
		{
			return setParameter(Parameters.TYPE, modifier, prefix, Type);
		}

		public ResourceInteractor.Composer setType(Modifier modifier, CodeableConcept Type)
		{
			return setParameter(Parameters.TYPE, modifier, Type);
		}

		public ResourceInteractor.Composer setType(Prefix prefix, CodeableConcept Type)
		{
			return setParameter(Parameters.TYPE, prefix, Type);
		}
        			
		public ResourceInteractor.Composer setType(CodeableConcept Type)
		{
			return setParameter(Parameters.TYPE, Type);
		}

    }

    public static <T> CoverageInteractor.CoverageComposer Composer()
    {
        return new CoverageComposer();
    }

}