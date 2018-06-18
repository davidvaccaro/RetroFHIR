package com.xinonix.retrofhir.interactor;


import com.xinonix.retrofhir.Parameters;
import com.xinonix.retrofhir.Prefix;
import com.xinonix.retrofhir.Modifier;
import com.xinonix.retrofhir.service.LinkageService;

import com.xinonix.hl7.fhir.stu3.Linkage;

public class LinkageInteractor extends ResourceInteractor<LinkageService, Linkage> {

    public static class LinkageComposer extends Composer<LinkageService, Linkage, LinkageComposer> {

        public LinkageComposer()
        {
            super((Class) LinkageService.class, (Class) Linkage.class);
        }

    }

    public static <T> LinkageInteractor.LinkageComposer Composer()
    {
        return new LinkageComposer();
    }

}