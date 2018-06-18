package com.xinonix.retrofhir.interactor;

import com.xinonix.retrofhir.Parameters;
import com.xinonix.retrofhir.service.DocumentReferenceService;

import com.xinonix.hl7.fhir.stu3.DocumentReference;

public class DocumentReferenceInteractor extends ResourceInteractor<DocumentReferenceService, DocumentReference> {

    public static class DocumentReferenceComposer extends Composer<DocumentReferenceService, DocumentReference, DocumentReferenceComposer> {

        public DocumentReferenceComposer()
        {
            super((Class) DocumentReferenceService.class, (Class) DocumentReference.class);
        }

        public ResourceInteractor.Composer setStatus(DocumentReference.Status value)
        {
            return setParameter(Parameters.STATUS, value);
        }

    }

    public static <T> DocumentReferenceInteractor.DocumentReferenceComposer Composer()
    {
        return new DocumentReferenceComposer();
    }

}
