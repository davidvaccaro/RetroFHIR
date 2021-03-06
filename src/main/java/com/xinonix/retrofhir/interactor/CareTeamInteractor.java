package com.xinonix.retrofhir.interactor;

import java.util.Date;
import com.xinonix.hl7.fhir.stu3.CareTeam.Status;
import com.xinonix.hl7.fhir.stu3.CodeableConcept;
import com.xinonix.hl7.fhir.stu3.Identifier;

import com.xinonix.retrofhir.Parameters;
import com.xinonix.retrofhir.Prefix;
import com.xinonix.retrofhir.Modifier;
import com.xinonix.retrofhir.service.CareTeamService;

import com.xinonix.hl7.fhir.stu3.CareTeam;

public class CareTeamInteractor extends ResourceInteractor<CareTeamService, CareTeam> {

    public static class CareTeamComposer extends Composer<CareTeamService, CareTeam, CareTeamComposer> {

        public CareTeamComposer()
        {
            super((Class) CareTeamService.class, (Class) CareTeam.class);
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

		public ResourceInteractor.Composer setStatus(Modifier modifier, Prefix prefix, CareTeam.Status Status)
		{
			return setParameter(Parameters.STATUS, modifier, prefix, Status);
		}

		public ResourceInteractor.Composer setStatus(Modifier modifier, CareTeam.Status Status)
		{
			return setParameter(Parameters.STATUS, modifier, Status);
		}

		public ResourceInteractor.Composer setStatus(Prefix prefix, CareTeam.Status Status)
		{
			return setParameter(Parameters.STATUS, prefix, Status);
		}
        			
		public ResourceInteractor.Composer setStatus(CareTeam.Status Status)
		{
			return setParameter(Parameters.STATUS, Status);
		}

    }

    public static <T> CareTeamInteractor.CareTeamComposer Composer()
    {
        return new CareTeamComposer();
    }

}