package com.xinonix.retrofhir.serialization;

import com.google.gson.Gson;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonParseException;

import com.xinonix.hl7.fhir.stu3.*;

import java.lang.reflect.Type;

public class ResourceDeserializer implements JsonDeserializer<Resource> {

    @Override
    public Resource deserialize(JsonElement paramJsonElement, Type paramType,
                              JsonDeserializationContext paramJsonDeserializationContext) throws JsonParseException
    {

        // Parse the ResourceType
        ResourceType type = ResourceType.valueOf(paramJsonElement.getAsJsonObject().get("resourceType").getAsString().toUpperCase());

        switch (type)
        {
            case ACCOUNT: return new Gson().fromJson(paramJsonElement.getAsJsonObject(), Account.class);
            case ACTIVITYDEFINITION: return new Gson().fromJson(paramJsonElement.getAsJsonObject(), ActivityDefinition.class);
            case ADVERSEEVENT: return new Gson().fromJson(paramJsonElement.getAsJsonObject(), AdverseEvent.class);
            case ALLERGYINTOLERANCE: return new Gson().fromJson(paramJsonElement.getAsJsonObject(), AllergyIntolerance.class);
            case APPOINTMENT: return new Gson().fromJson(paramJsonElement.getAsJsonObject(), Appointment.class);
            case APPOINTMENTRESPONSE: return new Gson().fromJson(paramJsonElement.getAsJsonObject(), AppointmentResponse.class);
            case AUDITEVENT: return new Gson().fromJson(paramJsonElement.getAsJsonObject(), AuditEvent.class);
            case BASIC: return new Gson().fromJson(paramJsonElement.getAsJsonObject(), Basic.class);
            case BINARY: return new Gson().fromJson(paramJsonElement.getAsJsonObject(), Binary.class);
            case BODYSITE: return new Gson().fromJson(paramJsonElement.getAsJsonObject(), BodySite.class);
            case BUNDLE: return new Gson().fromJson(paramJsonElement.getAsJsonObject(), Bundle.class);
            case CAPABILITYSTATEMENT: return new Gson().fromJson(paramJsonElement.getAsJsonObject(), CapabilityStatement.class);
            case CAREPLAN: return new Gson().fromJson(paramJsonElement.getAsJsonObject(), CarePlan.class);
            case CARETEAM: return new Gson().fromJson(paramJsonElement.getAsJsonObject(), CareTeam.class);
            case CHARGEITEM: return new Gson().fromJson(paramJsonElement.getAsJsonObject(), ChargeItem.class);
            case CLAIM: return new Gson().fromJson(paramJsonElement.getAsJsonObject(), Claim.class);
            case CLAIMRESPONSE: return new Gson().fromJson(paramJsonElement.getAsJsonObject(), ClaimResponse.class);
            case CLINICALIMPRESSION: return new Gson().fromJson(paramJsonElement.getAsJsonObject(), ClinicalImpression.class);
            case CODESYSTEM: return new Gson().fromJson(paramJsonElement.getAsJsonObject(), CodeSystem.class);
            case COMMUNICATION: return new Gson().fromJson(paramJsonElement.getAsJsonObject(), Communication.class);
            case COMMUNICATIONREQUEST: return new Gson().fromJson(paramJsonElement.getAsJsonObject(), CommunicationRequest.class);
            case COMPARTMENTDEFINITION: return new Gson().fromJson(paramJsonElement.getAsJsonObject(), CompartmentDefinition.class);
            case COMPOSITION: return new Gson().fromJson(paramJsonElement.getAsJsonObject(), Composition.class);
            case CONCEPTMAP: return new Gson().fromJson(paramJsonElement.getAsJsonObject(), ConceptMap.class);
            case CONDITION: return new Gson().fromJson(paramJsonElement.getAsJsonObject(), Condition.class);
            case CONSENT: return new Gson().fromJson(paramJsonElement.getAsJsonObject(), Consent.class);
            case CONTRACT: return new Gson().fromJson(paramJsonElement.getAsJsonObject(), Contract.class);
            case COVERAGE: return new Gson().fromJson(paramJsonElement.getAsJsonObject(), Coverage.class);
            case DATAELEMENT: return new Gson().fromJson(paramJsonElement.getAsJsonObject(), DataElement.class);
            case DETECTEDISSUE: return new Gson().fromJson(paramJsonElement.getAsJsonObject(), DetectedIssue.class);
            case DEVICE: return new Gson().fromJson(paramJsonElement.getAsJsonObject(), Device.class);
            case DEVICECOMPONENT: return new Gson().fromJson(paramJsonElement.getAsJsonObject(), DeviceComponent.class);
            case DEVICEMETRIC: return new Gson().fromJson(paramJsonElement.getAsJsonObject(), DeviceMetric.class);
            case DEVICEREQUEST: return new Gson().fromJson(paramJsonElement.getAsJsonObject(), DeviceRequest.class);
            case DEVICEUSESTATEMENT: return new Gson().fromJson(paramJsonElement.getAsJsonObject(), DeviceUseStatement.class);
            case DIAGNOSTICREPORT: return new Gson().fromJson(paramJsonElement.getAsJsonObject(), DiagnosticReport.class);
            case DOCUMENTMANIFEST: return new Gson().fromJson(paramJsonElement.getAsJsonObject(), DocumentManifest.class);
            case DOCUMENTREFERENCE: return new Gson().fromJson(paramJsonElement.getAsJsonObject(), DocumentReference.class);
            case ELIGIBILITYREQUEST: return new Gson().fromJson(paramJsonElement.getAsJsonObject(), EligibilityRequest.class);
            case ELIGIBILITYRESPONSE: return new Gson().fromJson(paramJsonElement.getAsJsonObject(), EligibilityResponse.class);
            case ENCOUNTER: return new Gson().fromJson(paramJsonElement.getAsJsonObject(), Encounter.class);
            case ENDPOINT: return new Gson().fromJson(paramJsonElement.getAsJsonObject(), Endpoint.class);
            case ENROLLMENTREQUEST: return new Gson().fromJson(paramJsonElement.getAsJsonObject(), EnrollmentRequest.class);
            case ENROLLMENTRESPONSE: return new Gson().fromJson(paramJsonElement.getAsJsonObject(), EnrollmentResponse.class);
            case EPISODEOFCARE: return new Gson().fromJson(paramJsonElement.getAsJsonObject(), EpisodeOfCare.class);
            case EXPANSIONPROFILE: return new Gson().fromJson(paramJsonElement.getAsJsonObject(), ExpansionProfile.class);
            case EXPLANATIONOFBENEFIT: return new Gson().fromJson(paramJsonElement.getAsJsonObject(), ExplanationOfBenefit.class);
            case FAMILYMEMBERHISTORY: return new Gson().fromJson(paramJsonElement.getAsJsonObject(), FamilyMemberHistory.class);
            case FLAG: return new Gson().fromJson(paramJsonElement.getAsJsonObject(), Flag.class);
            case GOAL: return new Gson().fromJson(paramJsonElement.getAsJsonObject(), Goal.class);
            case GRAPHDEFINITION: return new Gson().fromJson(paramJsonElement.getAsJsonObject(), GraphDefinition.class);
            case GROUP: return new Gson().fromJson(paramJsonElement.getAsJsonObject(), Group.class);
            case GUIDANCERESPONSE: return new Gson().fromJson(paramJsonElement.getAsJsonObject(), GuidanceResponse.class);
            case HEALTHCARESERVICE: return new Gson().fromJson(paramJsonElement.getAsJsonObject(), HealthcareService.class);
            case IMAGINGMANIFEST: return new Gson().fromJson(paramJsonElement.getAsJsonObject(), ImagingManifest.class);
            case IMAGINGSTUDY: return new Gson().fromJson(paramJsonElement.getAsJsonObject(), ImagingStudy.class);
            case IMMUNIZATION: return new Gson().fromJson(paramJsonElement.getAsJsonObject(), Immunization.class);
            case IMMUNIZATIONRECOMMENDATION: return new Gson().fromJson(paramJsonElement.getAsJsonObject(), ImmunizationRecommendation.class);
            case IMPLEMENTATIONGUIDE: return new Gson().fromJson(paramJsonElement.getAsJsonObject(), ImplementationGuide.class);
            case LIBRARY: return new Gson().fromJson(paramJsonElement.getAsJsonObject(), Library.class);
            case LINKAGE: return new Gson().fromJson(paramJsonElement.getAsJsonObject(), Linkage.class);
            case LIST: return new Gson().fromJson(paramJsonElement.getAsJsonObject(), List.class);
            case LOCATION: return new Gson().fromJson(paramJsonElement.getAsJsonObject(), Location.class);
            case MEASURE: return new Gson().fromJson(paramJsonElement.getAsJsonObject(), Measure.class);
            case MEASUREREPORT: return new Gson().fromJson(paramJsonElement.getAsJsonObject(), MeasureReport.class);
            case MEDIA: return new Gson().fromJson(paramJsonElement.getAsJsonObject(), Media.class);
            case MEDICATION: return new Gson().fromJson(paramJsonElement.getAsJsonObject(), Medication.class);
            case MEDICATIONADMINISTRATION: return new Gson().fromJson(paramJsonElement.getAsJsonObject(), MedicationAdministration.class);
            case MEDICATIONDISPENSE: return new Gson().fromJson(paramJsonElement.getAsJsonObject(), MedicationDispense.class);
            case MEDICATIONREQUEST: return new Gson().fromJson(paramJsonElement.getAsJsonObject(), MedicationRequest.class);
            case MEDICATIONSTATEMENT: return new Gson().fromJson(paramJsonElement.getAsJsonObject(), MedicationStatement.class);
            case MESSAGEDEFINITION: return new Gson().fromJson(paramJsonElement.getAsJsonObject(), MessageDefinition.class);
            case MESSAGEHEADER: return new Gson().fromJson(paramJsonElement.getAsJsonObject(), MessageHeader.class);
            case NAMINGSYSTEM: return new Gson().fromJson(paramJsonElement.getAsJsonObject(), NamingSystem.class);
            case NUTRITIONORDER: return new Gson().fromJson(paramJsonElement.getAsJsonObject(), NutritionOrder.class);
            case OBSERVATION: return new Gson().fromJson(paramJsonElement.getAsJsonObject(), Observation.class);
            case OPERATIONDEFINITION: return new Gson().fromJson(paramJsonElement.getAsJsonObject(), OperationDefinition.class);
            case ORGANIZATION: return new Gson().fromJson(paramJsonElement.getAsJsonObject(), Organization.class);
            case PATIENT: return new Gson().fromJson(paramJsonElement.getAsJsonObject(), Patient.class);
            case PAYMENTNOTICE: return new Gson().fromJson(paramJsonElement.getAsJsonObject(), PaymentNotice.class);
            case PAYMENTRECONCILIATION: return new Gson().fromJson(paramJsonElement.getAsJsonObject(), PaymentReconciliation.class);
            case PERSON: return new Gson().fromJson(paramJsonElement.getAsJsonObject(), Person.class);
            case PLANDEFINITION: return new Gson().fromJson(paramJsonElement.getAsJsonObject(), PlanDefinition.class);
            case PRACTITIONER: return new Gson().fromJson(paramJsonElement.getAsJsonObject(), Practitioner.class);
            case PRACTITIONERROLE: return new Gson().fromJson(paramJsonElement.getAsJsonObject(), PractitionerRole.class);
            case PROCEDURE: return new Gson().fromJson(paramJsonElement.getAsJsonObject(), Procedure.class);
            case PROCEDUREREQUEST: return new Gson().fromJson(paramJsonElement.getAsJsonObject(), ProcedureRequest.class);
            case PROCESSREQUEST: return new Gson().fromJson(paramJsonElement.getAsJsonObject(), ProcessRequest.class);
            case PROCESSRESPONSE: return new Gson().fromJson(paramJsonElement.getAsJsonObject(), ProcessResponse.class);
            case PROVENANCE: return new Gson().fromJson(paramJsonElement.getAsJsonObject(), Provenance.class);
            case QUESTIONNAIRE: return new Gson().fromJson(paramJsonElement.getAsJsonObject(), Questionnaire.class);
            case QUESTIONNAIRERESPONSE: return new Gson().fromJson(paramJsonElement.getAsJsonObject(), QuestionnaireResponse.class);
            case REFERRALREQUEST: return new Gson().fromJson(paramJsonElement.getAsJsonObject(), ReferralRequest.class);
            case RELATEDPERSON: return new Gson().fromJson(paramJsonElement.getAsJsonObject(), RelatedPerson.class);
            case REQUESTGROUP: return new Gson().fromJson(paramJsonElement.getAsJsonObject(), RequestGroup.class);
            case RESEARCHSTUDY: return new Gson().fromJson(paramJsonElement.getAsJsonObject(), ResearchStudy.class);
            case RESEARCHSUBJECT: return new Gson().fromJson(paramJsonElement.getAsJsonObject(), ResearchSubject.class);
            case RISKASSESSMENT: return new Gson().fromJson(paramJsonElement.getAsJsonObject(), RiskAssessment.class);
            case SCHEDULE: return new Gson().fromJson(paramJsonElement.getAsJsonObject(), Schedule.class);
            case SEARCHPARAMETER: return new Gson().fromJson(paramJsonElement.getAsJsonObject(), SearchParameter.class);
            case SEQUENCE: return new Gson().fromJson(paramJsonElement.getAsJsonObject(), Sequence.class);
            case SERVICEDEFINITION: return new Gson().fromJson(paramJsonElement.getAsJsonObject(), ServiceDefinition.class);
            case SLOT: return new Gson().fromJson(paramJsonElement.getAsJsonObject(), Slot.class);
            case SPECIMEN: return new Gson().fromJson(paramJsonElement.getAsJsonObject(), Specimen.class);
            case STRUCTUREDEFINITION: return new Gson().fromJson(paramJsonElement.getAsJsonObject(), StructureDefinition.class);
            case STRUCTUREMAP: return new Gson().fromJson(paramJsonElement.getAsJsonObject(), StructureMap.class);
            case SUBSCRIPTION: return new Gson().fromJson(paramJsonElement.getAsJsonObject(), Subscription.class);
            case SUBSTANCE: return new Gson().fromJson(paramJsonElement.getAsJsonObject(), Substance.class);
            case SUPPLYDELIVERY: return new Gson().fromJson(paramJsonElement.getAsJsonObject(), SupplyDelivery.class);
            case SUPPLYREQUEST: return new Gson().fromJson(paramJsonElement.getAsJsonObject(), SupplyRequest.class);
            case TASK: return new Gson().fromJson(paramJsonElement.getAsJsonObject(), Task.class);
            case TESTREPORT: return new Gson().fromJson(paramJsonElement.getAsJsonObject(), TestReport.class);
            case TESTSCRIPT: return new Gson().fromJson(paramJsonElement.getAsJsonObject(), TestScript.class);
            case VALUESET: return new Gson().fromJson(paramJsonElement.getAsJsonObject(), ValueSet.class);
            case VISIONPRESCRIPTION: return new Gson().fromJson(paramJsonElement.getAsJsonObject(), VisionPrescription.class);
        }

        return null;

    }

}
