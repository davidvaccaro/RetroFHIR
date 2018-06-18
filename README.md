# RetroFHIR - Retrofit REST Client for FHIR
![alt text](https://github.com/davidvaccaro/RetroFHIR/blob/master/logo.png "RetroFHIR")

Download
--------

Maven:
```xml
<dependency>
  <groupId>com.xinonix.retrofhir</groupId>
  <artifactId>retrofhir</artifactId>
  <version>1.0.1</version>
  <type>pom</type>
</dependency>
```
Gradle:
```groovy
implementation 'com.xinonix.retrofhir:retrofhir:1.0.1'
```

Usage
--------

Select a Bundle of FHIR DocumentReferences by a specified patient-id and document status:

```code
DocumentReferenceInteractor 
    .Composer()       
    .baseUrl("http://..../fhir-server/")        	
    .setParameter("patient.identifier", "patientId") 
    .setStatus(DocumentReference.Status.CURRENT) 
    .compose() 
    .search(new retrofit2.Callback<Bundle>() {
        @Override            
        public void onResponse(Call<Bundle> call,  Response<Bundle> response) {
              // TODO – Process the Bundle of DocumentReferences
        }
      });
```

Select a Bundle of FHIR ImagingStudies by a specified patient-id:

```code
ImagingStudyInteractor
        .Composer()
        .baseUrl("http://..../fhir-server/")
        .setParameter("patient.identifier", "patientId")
        .compose()
        .search(new retrofit2.Callback<Bundle>() {
            @Override
            public void onResponse(Call<Bundle> call, Response<Bundle> response) {
              // TODO – Process the Bundle of ImagingStudies
            }
        });
```

License
=======

    Copyright 2018 Xinonix Interactive Development, Inc.

    Permission is hereby granted, free of charge, to any person obtaining a copy of this software 
    and associated documentation files (the "Software"), to deal in the Software without restriction, 
    including without limitation the rights to use, copy, modify, merge, publish, distribute, sublicense, 
    and/or sell copies of the Software, and to permit persons to whom the Software is furnished to do so, 
    subject to the following conditions:
    
    https://opensource.org/licenses/MIT

    The above copyright notice and this permission notice shall be included in all copies or substantial 
    portions of the Software.

    THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR IMPLIED, INCLUDING BUT NOT 
    LIMITED TO THE WARRANTIES OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO 
    EVENT SHALL THE AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER 
    IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE 
    USE OR OTHER DEALINGS IN THE SOFTWARE.
