package com.xinonix.retrofhir.interactor;

import java.util.Date;
import com.xinonix.hl7.fhir.stu3.CodeableConcept;
import com.xinonix.hl7.fhir.stu3.ContactPoint;
import com.xinonix.hl7.fhir.stu3.NamingSystem.Kind;
import com.xinonix.hl7.fhir.stu3.NamingSystem.Status;
import com.xinonix.hl7.fhir.stu3.NamingSystemUniqueId;
import com.xinonix.hl7.fhir.stu3.NamingSystemUniqueId.Type;

import com.xinonix.retrofhir.Parameters;
import com.xinonix.retrofhir.Prefix;
import com.xinonix.retrofhir.Modifier;
import com.xinonix.retrofhir.service.NamingSystemService;

import com.xinonix.hl7.fhir.stu3.NamingSystem;

public class NamingSystemInteractor extends ResourceInteractor<NamingSystemService, NamingSystem> {

    public static class NamingSystemComposer extends Composer<NamingSystemService, NamingSystem, NamingSystemComposer> {

        public NamingSystemComposer()
        {
            super((Class) NamingSystemService.class, (Class) NamingSystem.class);
        }

		public ResourceInteractor.Composer setContact(Modifier modifier, Prefix prefix, String Contact)
		{
			return setParameter(Parameters.CONTACT, modifier, prefix, Contact);
		}

		public ResourceInteractor.Composer setContact(Modifier modifier, String Contact)
		{
			return setParameter(Parameters.CONTACT, modifier, Contact);
		}

		public ResourceInteractor.Composer setContact(Prefix prefix, String Contact)
		{
			return setParameter(Parameters.CONTACT, prefix, Contact);
		}
        			
		public ResourceInteractor.Composer setContact(String Contact)
		{
			return setParameter(Parameters.CONTACT, Contact);
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

		public ResourceInteractor.Composer setDescription(Modifier modifier, Prefix prefix, String Description)
		{
			return setParameter(Parameters.DESCRIPTION, modifier, prefix, Description);
		}

		public ResourceInteractor.Composer setDescription(Modifier modifier, String Description)
		{
			return setParameter(Parameters.DESCRIPTION, modifier, Description);
		}

		public ResourceInteractor.Composer setDescription(Prefix prefix, String Description)
		{
			return setParameter(Parameters.DESCRIPTION, prefix, Description);
		}
        			
		public ResourceInteractor.Composer setDescription(String Description)
		{
			return setParameter(Parameters.DESCRIPTION, Description);
		}

		public ResourceInteractor.Composer setIdType(Modifier modifier, Prefix prefix, NamingSystemUniqueId.Type IdType)
		{
			return setParameter(Parameters.ID_TYPE, modifier, prefix, IdType);
		}

		public ResourceInteractor.Composer setIdType(Modifier modifier, NamingSystemUniqueId.Type IdType)
		{
			return setParameter(Parameters.ID_TYPE, modifier, IdType);
		}

		public ResourceInteractor.Composer setIdType(Prefix prefix, NamingSystemUniqueId.Type IdType)
		{
			return setParameter(Parameters.ID_TYPE, prefix, IdType);
		}
        			
		public ResourceInteractor.Composer setIdType(NamingSystemUniqueId.Type IdType)
		{
			return setParameter(Parameters.ID_TYPE, IdType);
		}

		public ResourceInteractor.Composer setJurisdiction(Modifier modifier, Prefix prefix, CodeableConcept Jurisdiction)
		{
			return setParameter(Parameters.JURISDICTION, modifier, prefix, Jurisdiction);
		}

		public ResourceInteractor.Composer setJurisdiction(Modifier modifier, CodeableConcept Jurisdiction)
		{
			return setParameter(Parameters.JURISDICTION, modifier, Jurisdiction);
		}

		public ResourceInteractor.Composer setJurisdiction(Prefix prefix, CodeableConcept Jurisdiction)
		{
			return setParameter(Parameters.JURISDICTION, prefix, Jurisdiction);
		}
        			
		public ResourceInteractor.Composer setJurisdiction(CodeableConcept Jurisdiction)
		{
			return setParameter(Parameters.JURISDICTION, Jurisdiction);
		}

		public ResourceInteractor.Composer setKind(Modifier modifier, Prefix prefix, NamingSystem.Kind Kind)
		{
			return setParameter(Parameters.KIND, modifier, prefix, Kind);
		}

		public ResourceInteractor.Composer setKind(Modifier modifier, NamingSystem.Kind Kind)
		{
			return setParameter(Parameters.KIND, modifier, Kind);
		}

		public ResourceInteractor.Composer setKind(Prefix prefix, NamingSystem.Kind Kind)
		{
			return setParameter(Parameters.KIND, prefix, Kind);
		}
        			
		public ResourceInteractor.Composer setKind(NamingSystem.Kind Kind)
		{
			return setParameter(Parameters.KIND, Kind);
		}

		public ResourceInteractor.Composer setName(Modifier modifier, Prefix prefix, String Name)
		{
			return setParameter(Parameters.NAME, modifier, prefix, Name);
		}

		public ResourceInteractor.Composer setName(Modifier modifier, String Name)
		{
			return setParameter(Parameters.NAME, modifier, Name);
		}

		public ResourceInteractor.Composer setName(Prefix prefix, String Name)
		{
			return setParameter(Parameters.NAME, prefix, Name);
		}
        			
		public ResourceInteractor.Composer setName(String Name)
		{
			return setParameter(Parameters.NAME, Name);
		}

		public ResourceInteractor.Composer setPeriod(Modifier modifier, Prefix prefix, Date Period)
		{
			return setParameter(Parameters.PERIOD, modifier, prefix, Period);
		}

		public ResourceInteractor.Composer setPeriod(Modifier modifier, Date Period)
		{
			return setParameter(Parameters.PERIOD, modifier, Period);
		}

		public ResourceInteractor.Composer setPeriod(Prefix prefix, Date Period)
		{
			return setParameter(Parameters.PERIOD, prefix, Period);
		}
        			
		public ResourceInteractor.Composer setPeriod(Date Period)
		{
			return setParameter(Parameters.PERIOD, Period);
		}

		public ResourceInteractor.Composer setPublisher(Modifier modifier, Prefix prefix, String Publisher)
		{
			return setParameter(Parameters.PUBLISHER, modifier, prefix, Publisher);
		}

		public ResourceInteractor.Composer setPublisher(Modifier modifier, String Publisher)
		{
			return setParameter(Parameters.PUBLISHER, modifier, Publisher);
		}

		public ResourceInteractor.Composer setPublisher(Prefix prefix, String Publisher)
		{
			return setParameter(Parameters.PUBLISHER, prefix, Publisher);
		}
        			
		public ResourceInteractor.Composer setPublisher(String Publisher)
		{
			return setParameter(Parameters.PUBLISHER, Publisher);
		}

		public ResourceInteractor.Composer setResponsible(Modifier modifier, Prefix prefix, String Responsible)
		{
			return setParameter(Parameters.RESPONSIBLE, modifier, prefix, Responsible);
		}

		public ResourceInteractor.Composer setResponsible(Modifier modifier, String Responsible)
		{
			return setParameter(Parameters.RESPONSIBLE, modifier, Responsible);
		}

		public ResourceInteractor.Composer setResponsible(Prefix prefix, String Responsible)
		{
			return setParameter(Parameters.RESPONSIBLE, prefix, Responsible);
		}
        			
		public ResourceInteractor.Composer setResponsible(String Responsible)
		{
			return setParameter(Parameters.RESPONSIBLE, Responsible);
		}

		public ResourceInteractor.Composer setStatus(Modifier modifier, Prefix prefix, NamingSystem.Status Status)
		{
			return setParameter(Parameters.STATUS, modifier, prefix, Status);
		}

		public ResourceInteractor.Composer setStatus(Modifier modifier, NamingSystem.Status Status)
		{
			return setParameter(Parameters.STATUS, modifier, Status);
		}

		public ResourceInteractor.Composer setStatus(Prefix prefix, NamingSystem.Status Status)
		{
			return setParameter(Parameters.STATUS, prefix, Status);
		}
        			
		public ResourceInteractor.Composer setStatus(NamingSystem.Status Status)
		{
			return setParameter(Parameters.STATUS, Status);
		}

		public ResourceInteractor.Composer setTelecom(Modifier modifier, Prefix prefix, ContactPoint Telecom)
		{
			return setParameter(Parameters.TELECOM, modifier, prefix, Telecom);
		}

		public ResourceInteractor.Composer setTelecom(Modifier modifier, ContactPoint Telecom)
		{
			return setParameter(Parameters.TELECOM, modifier, Telecom);
		}

		public ResourceInteractor.Composer setTelecom(Prefix prefix, ContactPoint Telecom)
		{
			return setParameter(Parameters.TELECOM, prefix, Telecom);
		}
        			
		public ResourceInteractor.Composer setTelecom(ContactPoint Telecom)
		{
			return setParameter(Parameters.TELECOM, Telecom);
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

		public ResourceInteractor.Composer setValue(Modifier modifier, Prefix prefix, String Value)
		{
			return setParameter(Parameters.VALUE, modifier, prefix, Value);
		}

		public ResourceInteractor.Composer setValue(Modifier modifier, String Value)
		{
			return setParameter(Parameters.VALUE, modifier, Value);
		}

		public ResourceInteractor.Composer setValue(Prefix prefix, String Value)
		{
			return setParameter(Parameters.VALUE, prefix, Value);
		}
        			
		public ResourceInteractor.Composer setValue(String Value)
		{
			return setParameter(Parameters.VALUE, Value);
		}

    }

    public static <T> NamingSystemInteractor.NamingSystemComposer Composer()
    {
        return new NamingSystemComposer();
    }

}