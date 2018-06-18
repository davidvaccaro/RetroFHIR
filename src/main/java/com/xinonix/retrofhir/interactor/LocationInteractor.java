package com.xinonix.retrofhir.interactor;

import com.xinonix.hl7.fhir.stu3.Address;
import com.xinonix.hl7.fhir.stu3.Address.Use;
import com.xinonix.hl7.fhir.stu3.CodeableConcept;
import com.xinonix.hl7.fhir.stu3.Coding;
import com.xinonix.hl7.fhir.stu3.Identifier;
import com.xinonix.hl7.fhir.stu3.Location.Status;
import com.xinonix.hl7.fhir.stu3.LocationPosition;
import com.xinonix.hl7.fhir.stu3.Quantity;

import com.xinonix.retrofhir.Parameters;
import com.xinonix.retrofhir.Prefix;
import com.xinonix.retrofhir.Modifier;
import com.xinonix.retrofhir.service.LocationService;

import com.xinonix.hl7.fhir.stu3.Location;

public class LocationInteractor extends ResourceInteractor<LocationService, Location> {

    public static class LocationComposer extends Composer<LocationService, Location, LocationComposer> {

        public LocationComposer()
        {
            super((Class) LocationService.class, (Class) Location.class);
        }

		public ResourceInteractor.Composer setAddress(Modifier modifier, Prefix prefix, String Address)
		{
			return setParameter(Parameters.ADDRESS, modifier, prefix, Address);
		}

		public ResourceInteractor.Composer setAddress(Modifier modifier, String Address)
		{
			return setParameter(Parameters.ADDRESS, modifier, Address);
		}

		public ResourceInteractor.Composer setAddress(Prefix prefix, String Address)
		{
			return setParameter(Parameters.ADDRESS, prefix, Address);
		}
        			
		public ResourceInteractor.Composer setAddress(String Address)
		{
			return setParameter(Parameters.ADDRESS, Address);
		}

		public ResourceInteractor.Composer setAddressCity(Modifier modifier, Prefix prefix, String AddressCity)
		{
			return setParameter(Parameters.ADDRESS_CITY, modifier, prefix, AddressCity);
		}

		public ResourceInteractor.Composer setAddressCity(Modifier modifier, String AddressCity)
		{
			return setParameter(Parameters.ADDRESS_CITY, modifier, AddressCity);
		}

		public ResourceInteractor.Composer setAddressCity(Prefix prefix, String AddressCity)
		{
			return setParameter(Parameters.ADDRESS_CITY, prefix, AddressCity);
		}
        			
		public ResourceInteractor.Composer setAddressCity(String AddressCity)
		{
			return setParameter(Parameters.ADDRESS_CITY, AddressCity);
		}

		public ResourceInteractor.Composer setAddressCountry(Modifier modifier, Prefix prefix, String AddressCountry)
		{
			return setParameter(Parameters.ADDRESS_COUNTRY, modifier, prefix, AddressCountry);
		}

		public ResourceInteractor.Composer setAddressCountry(Modifier modifier, String AddressCountry)
		{
			return setParameter(Parameters.ADDRESS_COUNTRY, modifier, AddressCountry);
		}

		public ResourceInteractor.Composer setAddressCountry(Prefix prefix, String AddressCountry)
		{
			return setParameter(Parameters.ADDRESS_COUNTRY, prefix, AddressCountry);
		}
        			
		public ResourceInteractor.Composer setAddressCountry(String AddressCountry)
		{
			return setParameter(Parameters.ADDRESS_COUNTRY, AddressCountry);
		}

		public ResourceInteractor.Composer setAddressPostalcode(Modifier modifier, Prefix prefix, String AddressPostalcode)
		{
			return setParameter(Parameters.ADDRESS_POSTALCODE, modifier, prefix, AddressPostalcode);
		}

		public ResourceInteractor.Composer setAddressPostalcode(Modifier modifier, String AddressPostalcode)
		{
			return setParameter(Parameters.ADDRESS_POSTALCODE, modifier, AddressPostalcode);
		}

		public ResourceInteractor.Composer setAddressPostalcode(Prefix prefix, String AddressPostalcode)
		{
			return setParameter(Parameters.ADDRESS_POSTALCODE, prefix, AddressPostalcode);
		}
        			
		public ResourceInteractor.Composer setAddressPostalcode(String AddressPostalcode)
		{
			return setParameter(Parameters.ADDRESS_POSTALCODE, AddressPostalcode);
		}

		public ResourceInteractor.Composer setAddressState(Modifier modifier, Prefix prefix, String AddressState)
		{
			return setParameter(Parameters.ADDRESS_STATE, modifier, prefix, AddressState);
		}

		public ResourceInteractor.Composer setAddressState(Modifier modifier, String AddressState)
		{
			return setParameter(Parameters.ADDRESS_STATE, modifier, AddressState);
		}

		public ResourceInteractor.Composer setAddressState(Prefix prefix, String AddressState)
		{
			return setParameter(Parameters.ADDRESS_STATE, prefix, AddressState);
		}
        			
		public ResourceInteractor.Composer setAddressState(String AddressState)
		{
			return setParameter(Parameters.ADDRESS_STATE, AddressState);
		}

		public ResourceInteractor.Composer setAddressUse(Modifier modifier, Prefix prefix, Address.Use AddressUse)
		{
			return setParameter(Parameters.ADDRESS_USE, modifier, prefix, AddressUse);
		}

		public ResourceInteractor.Composer setAddressUse(Modifier modifier, Address.Use AddressUse)
		{
			return setParameter(Parameters.ADDRESS_USE, modifier, AddressUse);
		}

		public ResourceInteractor.Composer setAddressUse(Prefix prefix, Address.Use AddressUse)
		{
			return setParameter(Parameters.ADDRESS_USE, prefix, AddressUse);
		}
        			
		public ResourceInteractor.Composer setAddressUse(Address.Use AddressUse)
		{
			return setParameter(Parameters.ADDRESS_USE, AddressUse);
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

		public ResourceInteractor.Composer setNear(Modifier modifier, Prefix prefix, LocationPosition Near)
		{
			return setParameter(Parameters.NEAR, modifier, prefix, Near);
		}

		public ResourceInteractor.Composer setNear(Modifier modifier, LocationPosition Near)
		{
			return setParameter(Parameters.NEAR, modifier, Near);
		}

		public ResourceInteractor.Composer setNear(Prefix prefix, LocationPosition Near)
		{
			return setParameter(Parameters.NEAR, prefix, Near);
		}
        			
		public ResourceInteractor.Composer setNear(LocationPosition Near)
		{
			return setParameter(Parameters.NEAR, Near);
		}

		public ResourceInteractor.Composer setNearDistance(Modifier modifier, Prefix prefix, Quantity NearDistance)
		{
			return setParameter(Parameters.NEAR_DISTANCE, modifier, prefix, NearDistance);
		}

		public ResourceInteractor.Composer setNearDistance(Modifier modifier, Quantity NearDistance)
		{
			return setParameter(Parameters.NEAR_DISTANCE, modifier, NearDistance);
		}

		public ResourceInteractor.Composer setNearDistance(Prefix prefix, Quantity NearDistance)
		{
			return setParameter(Parameters.NEAR_DISTANCE, prefix, NearDistance);
		}
        			
		public ResourceInteractor.Composer setNearDistance(Quantity NearDistance)
		{
			return setParameter(Parameters.NEAR_DISTANCE, NearDistance);
		}

		public ResourceInteractor.Composer setOperationalStatus(Modifier modifier, Prefix prefix, Coding OperationalStatus)
		{
			return setParameter(Parameters.OPERATIONAL_STATUS, modifier, prefix, OperationalStatus);
		}

		public ResourceInteractor.Composer setOperationalStatus(Modifier modifier, Coding OperationalStatus)
		{
			return setParameter(Parameters.OPERATIONAL_STATUS, modifier, OperationalStatus);
		}

		public ResourceInteractor.Composer setOperationalStatus(Prefix prefix, Coding OperationalStatus)
		{
			return setParameter(Parameters.OPERATIONAL_STATUS, prefix, OperationalStatus);
		}
        			
		public ResourceInteractor.Composer setOperationalStatus(Coding OperationalStatus)
		{
			return setParameter(Parameters.OPERATIONAL_STATUS, OperationalStatus);
		}

		public ResourceInteractor.Composer setStatus(Modifier modifier, Prefix prefix, Location.Status Status)
		{
			return setParameter(Parameters.STATUS, modifier, prefix, Status);
		}

		public ResourceInteractor.Composer setStatus(Modifier modifier, Location.Status Status)
		{
			return setParameter(Parameters.STATUS, modifier, Status);
		}

		public ResourceInteractor.Composer setStatus(Prefix prefix, Location.Status Status)
		{
			return setParameter(Parameters.STATUS, prefix, Status);
		}
        			
		public ResourceInteractor.Composer setStatus(Location.Status Status)
		{
			return setParameter(Parameters.STATUS, Status);
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

    public static <T> LocationInteractor.LocationComposer Composer()
    {
        return new LocationComposer();
    }

}