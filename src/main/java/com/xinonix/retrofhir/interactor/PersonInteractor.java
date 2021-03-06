package com.xinonix.retrofhir.interactor;

import java.util.Date;

import com.xinonix.hl7.fhir.stu3.Address;
import com.xinonix.hl7.fhir.stu3.Address.Use;
import com.xinonix.hl7.fhir.stu3.ContactPoint;
import com.xinonix.hl7.fhir.stu3.Identifier;
import com.xinonix.hl7.fhir.stu3.Person.Gender;

import com.xinonix.retrofhir.Parameters;
import com.xinonix.retrofhir.Prefix;
import com.xinonix.retrofhir.Modifier;
import com.xinonix.retrofhir.service.PersonService;

import com.xinonix.hl7.fhir.stu3.Person;

public class PersonInteractor extends ResourceInteractor<PersonService, Person> {

    public static class PersonComposer extends Composer<PersonService, Person, PersonComposer> {

        public PersonComposer()
        {
            super((Class) PersonService.class, (Class) Person.class);
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

		public ResourceInteractor.Composer setBirthdate(Modifier modifier, Prefix prefix, Date Birthdate)
		{
			return setParameter(Parameters.BIRTHDATE, modifier, prefix, Birthdate);
		}

		public ResourceInteractor.Composer setBirthdate(Modifier modifier, Date Birthdate)
		{
			return setParameter(Parameters.BIRTHDATE, modifier, Birthdate);
		}

		public ResourceInteractor.Composer setBirthdate(Prefix prefix, Date Birthdate)
		{
			return setParameter(Parameters.BIRTHDATE, prefix, Birthdate);
		}
        			
		public ResourceInteractor.Composer setBirthdate(Date Birthdate)
		{
			return setParameter(Parameters.BIRTHDATE, Birthdate);
		}

		public ResourceInteractor.Composer setEmail(Modifier modifier, Prefix prefix, ContactPoint Email)
		{
			return setParameter(Parameters.EMAIL, modifier, prefix, Email);
		}

		public ResourceInteractor.Composer setEmail(Modifier modifier, ContactPoint Email)
		{
			return setParameter(Parameters.EMAIL, modifier, Email);
		}

		public ResourceInteractor.Composer setEmail(Prefix prefix, ContactPoint Email)
		{
			return setParameter(Parameters.EMAIL, prefix, Email);
		}
        			
		public ResourceInteractor.Composer setEmail(ContactPoint Email)
		{
			return setParameter(Parameters.EMAIL, Email);
		}

		public ResourceInteractor.Composer setGender(Modifier modifier, Prefix prefix, Person.Gender Gender)
		{
			return setParameter(Parameters.GENDER, modifier, prefix, Gender);
		}

		public ResourceInteractor.Composer setGender(Modifier modifier, Person.Gender Gender)
		{
			return setParameter(Parameters.GENDER, modifier, Gender);
		}

		public ResourceInteractor.Composer setGender(Prefix prefix, Person.Gender Gender)
		{
			return setParameter(Parameters.GENDER, prefix, Gender);
		}
        			
		public ResourceInteractor.Composer setGender(Person.Gender Gender)
		{
			return setParameter(Parameters.GENDER, Gender);
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

		public ResourceInteractor.Composer setPhone(Modifier modifier, Prefix prefix, ContactPoint Phone)
		{
			return setParameter(Parameters.PHONE, modifier, prefix, Phone);
		}

		public ResourceInteractor.Composer setPhone(Modifier modifier, ContactPoint Phone)
		{
			return setParameter(Parameters.PHONE, modifier, Phone);
		}

		public ResourceInteractor.Composer setPhone(Prefix prefix, ContactPoint Phone)
		{
			return setParameter(Parameters.PHONE, prefix, Phone);
		}
        			
		public ResourceInteractor.Composer setPhone(ContactPoint Phone)
		{
			return setParameter(Parameters.PHONE, Phone);
		}

		public ResourceInteractor.Composer setPhonetic(Modifier modifier, Prefix prefix, String Phonetic)
		{
			return setParameter(Parameters.PHONETIC, modifier, prefix, Phonetic);
		}

		public ResourceInteractor.Composer setPhonetic(Modifier modifier, String Phonetic)
		{
			return setParameter(Parameters.PHONETIC, modifier, Phonetic);
		}

		public ResourceInteractor.Composer setPhonetic(Prefix prefix, String Phonetic)
		{
			return setParameter(Parameters.PHONETIC, prefix, Phonetic);
		}
        			
		public ResourceInteractor.Composer setPhonetic(String Phonetic)
		{
			return setParameter(Parameters.PHONETIC, Phonetic);
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

    }

    public static <T> PersonInteractor.PersonComposer Composer()
    {
        return new PersonComposer();
    }

}