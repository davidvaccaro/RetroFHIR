package com.xinonix.retrofhir.interactor;

import java.util.Date;

import com.xinonix.hl7.fhir.stu3.Address;
import com.xinonix.hl7.fhir.stu3.Address.Use;
import com.xinonix.hl7.fhir.stu3.CodeableConcept;
import com.xinonix.hl7.fhir.stu3.ContactPoint;
import com.xinonix.hl7.fhir.stu3.Identifier;
import com.xinonix.hl7.fhir.stu3.Patient.Gender;

import com.xinonix.retrofhir.Parameters;
import com.xinonix.retrofhir.Prefix;
import com.xinonix.retrofhir.Modifier;
import com.xinonix.retrofhir.service.PatientService;

import com.xinonix.hl7.fhir.stu3.Patient;

public class PatientInteractor extends ResourceInteractor<PatientService, Patient> {

    public static class PatientComposer extends Composer<PatientService, Patient, PatientComposer> {

        public PatientComposer()
        {
            super((Class) PatientService.class, (Class) Patient.class);
        }

		public ResourceInteractor.Composer setActive(Modifier modifier, Prefix prefix, Boolean Active)
		{
			return setParameter(Parameters.ACTIVE, modifier, prefix, Active);
		}

		public ResourceInteractor.Composer setActive(Modifier modifier, Boolean Active)
		{
			return setParameter(Parameters.ACTIVE, modifier, Active);
		}

		public ResourceInteractor.Composer setActive(Prefix prefix, Boolean Active)
		{
			return setParameter(Parameters.ACTIVE, prefix, Active);
		}
        			
		public ResourceInteractor.Composer setActive(Boolean Active)
		{
			return setParameter(Parameters.ACTIVE, Active);
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

		public ResourceInteractor.Composer setAnimalBreed(Modifier modifier, Prefix prefix, CodeableConcept AnimalBreed)
		{
			return setParameter(Parameters.ANIMAL_BREED, modifier, prefix, AnimalBreed);
		}

		public ResourceInteractor.Composer setAnimalBreed(Modifier modifier, CodeableConcept AnimalBreed)
		{
			return setParameter(Parameters.ANIMAL_BREED, modifier, AnimalBreed);
		}

		public ResourceInteractor.Composer setAnimalBreed(Prefix prefix, CodeableConcept AnimalBreed)
		{
			return setParameter(Parameters.ANIMAL_BREED, prefix, AnimalBreed);
		}
        			
		public ResourceInteractor.Composer setAnimalBreed(CodeableConcept AnimalBreed)
		{
			return setParameter(Parameters.ANIMAL_BREED, AnimalBreed);
		}

		public ResourceInteractor.Composer setAnimalSpecies(Modifier modifier, Prefix prefix, CodeableConcept AnimalSpecies)
		{
			return setParameter(Parameters.ANIMAL_SPECIES, modifier, prefix, AnimalSpecies);
		}

		public ResourceInteractor.Composer setAnimalSpecies(Modifier modifier, CodeableConcept AnimalSpecies)
		{
			return setParameter(Parameters.ANIMAL_SPECIES, modifier, AnimalSpecies);
		}

		public ResourceInteractor.Composer setAnimalSpecies(Prefix prefix, CodeableConcept AnimalSpecies)
		{
			return setParameter(Parameters.ANIMAL_SPECIES, prefix, AnimalSpecies);
		}
        			
		public ResourceInteractor.Composer setAnimalSpecies(CodeableConcept AnimalSpecies)
		{
			return setParameter(Parameters.ANIMAL_SPECIES, AnimalSpecies);
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

		public ResourceInteractor.Composer setDeathDate(Modifier modifier, Prefix prefix, Date DeathDate)
		{
			return setParameter(Parameters.DEATH_DATE, modifier, prefix, DeathDate);
		}

		public ResourceInteractor.Composer setDeathDate(Modifier modifier, Date DeathDate)
		{
			return setParameter(Parameters.DEATH_DATE, modifier, DeathDate);
		}

		public ResourceInteractor.Composer setDeathDate(Prefix prefix, Date DeathDate)
		{
			return setParameter(Parameters.DEATH_DATE, prefix, DeathDate);
		}
        			
		public ResourceInteractor.Composer setDeathDate(Date DeathDate)
		{
			return setParameter(Parameters.DEATH_DATE, DeathDate);
		}

		public ResourceInteractor.Composer setDeceased(Modifier modifier, Prefix prefix, Boolean Deceased)
		{
			return setParameter(Parameters.DECEASED, modifier, prefix, Deceased);
		}

		public ResourceInteractor.Composer setDeceased(Modifier modifier, Boolean Deceased)
		{
			return setParameter(Parameters.DECEASED, modifier, Deceased);
		}

		public ResourceInteractor.Composer setDeceased(Prefix prefix, Boolean Deceased)
		{
			return setParameter(Parameters.DECEASED, prefix, Deceased);
		}
        			
		public ResourceInteractor.Composer setDeceased(Boolean Deceased)
		{
			return setParameter(Parameters.DECEASED, Deceased);
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

		public ResourceInteractor.Composer setFamily(Modifier modifier, Prefix prefix, String Family)
		{
			return setParameter(Parameters.FAMILY, modifier, prefix, Family);
		}

		public ResourceInteractor.Composer setFamily(Modifier modifier, String Family)
		{
			return setParameter(Parameters.FAMILY, modifier, Family);
		}

		public ResourceInteractor.Composer setFamily(Prefix prefix, String Family)
		{
			return setParameter(Parameters.FAMILY, prefix, Family);
		}
        			
		public ResourceInteractor.Composer setFamily(String Family)
		{
			return setParameter(Parameters.FAMILY, Family);
		}

		public ResourceInteractor.Composer setGender(Modifier modifier, Prefix prefix, Patient.Gender Gender)
		{
			return setParameter(Parameters.GENDER, modifier, prefix, Gender);
		}

		public ResourceInteractor.Composer setGender(Modifier modifier, Patient.Gender Gender)
		{
			return setParameter(Parameters.GENDER, modifier, Gender);
		}

		public ResourceInteractor.Composer setGender(Prefix prefix, Patient.Gender Gender)
		{
			return setParameter(Parameters.GENDER, prefix, Gender);
		}
        			
		public ResourceInteractor.Composer setGender(Patient.Gender Gender)
		{
			return setParameter(Parameters.GENDER, Gender);
		}

		public ResourceInteractor.Composer setGiven(Modifier modifier, Prefix prefix, String Given)
		{
			return setParameter(Parameters.GIVEN, modifier, prefix, Given);
		}

		public ResourceInteractor.Composer setGiven(Modifier modifier, String Given)
		{
			return setParameter(Parameters.GIVEN, modifier, Given);
		}

		public ResourceInteractor.Composer setGiven(Prefix prefix, String Given)
		{
			return setParameter(Parameters.GIVEN, prefix, Given);
		}
        			
		public ResourceInteractor.Composer setGiven(String Given)
		{
			return setParameter(Parameters.GIVEN, Given);
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

		public ResourceInteractor.Composer setLanguage(Modifier modifier, Prefix prefix, CodeableConcept Language)
		{
			return setParameter(Parameters.LANGUAGE, modifier, prefix, Language);
		}

		public ResourceInteractor.Composer setLanguage(Modifier modifier, CodeableConcept Language)
		{
			return setParameter(Parameters.LANGUAGE, modifier, Language);
		}

		public ResourceInteractor.Composer setLanguage(Prefix prefix, CodeableConcept Language)
		{
			return setParameter(Parameters.LANGUAGE, prefix, Language);
		}
        			
		public ResourceInteractor.Composer setLanguage(CodeableConcept Language)
		{
			return setParameter(Parameters.LANGUAGE, Language);
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

    public static <T> PatientInteractor.PatientComposer Composer()
    {
        return new PatientComposer();
    }

}