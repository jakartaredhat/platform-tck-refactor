The branch of the code is a minimum set of modules to build the
servlet TCK tests that have been updated to use Junit 5 and Arquillian.

There are 1694 tests annotated with the Junit5 @Test annotation:
```shell
Targets
    Occurrences of '@Test' in Directory /Users/starksm/Dev/Jakarta/platform-tck-refactor with mask '*.java'
Found Occurrences in Directory /Users/starksm/Dev/Jakarta/platform-tck-refactor with mask '*.java'  (1,696 usages found)
    Unclassified  (1,695 usages found)
        project  (1 usage found)
            glassfish-runner/cdi-model-tck/src/test/java/org/jboss/weld/lang/model/tck  (1 usage found)
                LangModelTckTest.java  (1 usage found)
                    testLangModel()  (1 usage found)
                        66 @Test
        servlet  (1,694 usages found)
            com.sun.ts.tests.servlet.api.jakarta_servlet.asynccontext  (40 usages found)
                URLClient.java  (40 usages found)
                    dispatchZeroArgTest()  (1 usage found)
                        83 @Test
                    dispatchZeroArgTest1()  (1 usage found)
                        108 @Test
                    dispatchZeroArgTest2()  (1 usage found)
                        133 @Test
                    dispatchContextPathTest()  (1 usage found)
                        157 @Test
                    dispatchContextPathTest1()  (1 usage found)
                        181 @Test
                    dispatchContextPathTest2()  (1 usage found)
                        206 @Test
                    forwardTest1()  (1 usage found)
                        232 @Test
                    getRequestTest()  (1 usage found)
                        257 @Test
                    getRequestTest1()  (1 usage found)
                        274 @Test
                    getRequestTest2()  (1 usage found)
                        291 @Test
                    getRequestTest3()  (1 usage found)
                        308 @Test
                    getRequestTest4()  (1 usage found)
                        325 @Test
                    getRequestTest6()  (1 usage found)
                        342 @Test
                    getRequestTest7()  (1 usage found)
                        359 @Test
                    getRequestTest8()  (1 usage found)
                        376 @Test
                    getRequestTest9()  (1 usage found)
                        393 @Test
                    getRequestTest10()  (1 usage found)
                        410 @Test
                    getRequestTest12()  (1 usage found)
                        427 @Test
                    getRequestTest13()  (1 usage found)
                        444 @Test
                    getRequestTest14()  (1 usage found)
                        461 @Test
                    getRequestTest15()  (1 usage found)
                        478 @Test
                    getRequestTest16()  (1 usage found)
                        495 @Test
                    asyncListenerTest1()  (1 usage found)
                        512 @Test
                    asyncListenerTest6()  (1 usage found)
                        531 @Test
                    timeOutTest()  (1 usage found)
                        547 @Test
                    timeOutTest1()  (1 usage found)
                        564 @Test
                    timeOutTest2()  (1 usage found)
                        581 @Test
                    timeOutTest4()  (1 usage found)
                        599 @Test
                    originalRequestTest()  (1 usage found)
                        618 @Test
                    originalRequestTest1()  (1 usage found)
                        635 @Test
                    originalRequestTest2()  (1 usage found)
                        652 @Test
                    originalRequestTest3()  (1 usage found)
                        669 @Test
                    originalRequestTest4()  (1 usage found)
                        686 @Test
                    getResponseTest()  (1 usage found)
                        703 @Test
                    getResponseTest1()  (1 usage found)
                        720 @Test
                    getResponseTest2()  (1 usage found)
                        737 @Test
                    getResponseTest3()  (1 usage found)
                        754 @Test
                    getResponseTest4()  (1 usage found)
                        771 @Test
                    startAsyncAgainTest()  (1 usage found)
                        791 @Test
                    startAsyncAgainTest1()  (1 usage found)
                        819 @Test
            com.sun.ts.tests.servlet.api.jakarta_servlet.asyncevent  (9 usages found)
                URLClient.java  (9 usages found)
                    constructorTest1()  (1 usage found)
                        60 @Test
                    constructorTest2()  (1 usage found)
                        74 @Test
                    constructorTest3()  (1 usage found)
                        87 @Test
                    constructorTest4()  (1 usage found)
                        101 @Test
                    getSuppliedRequestTest1()  (1 usage found)
                        116 @Test
                    getSuppliedRequestTest2()  (1 usage found)
                        131 @Test
                    getSuppliedResponseTest1()  (1 usage found)
                        146 @Test
                    getSuppliedResponseTest2()  (1 usage found)
                        161 @Test
                    getThrowableTest()  (1 usage found)
                        176 @Test
            com.sun.ts.tests.servlet.api.jakarta_servlet.dispatchertype  (4 usages found)
                URLClient.java  (4 usages found)
                    valuesTest()  (1 usage found)
                        65 @Test
                    valueOfTest()  (1 usage found)
                        80 @Test
                    valueOfNullTest()  (1 usage found)
                        95 @Test
                    valueOfInvalidTest()  (1 usage found)
                        110 @Test
            com.sun.ts.tests.servlet.api.jakarta_servlet.dispatchtest  (38 usages found)
                URLClient.java  (38 usages found)
                    dispatchReturnTest()  (1 usage found)
                        95 @Test
                    dispatchReturnTest1()  (1 usage found)
                        123 @Test
                    dispatchReturnTest2()  (1 usage found)
                        150 @Test
                    dispatchReturnTest3()  (1 usage found)
                        177 @Test
                    dispatchReturnTest4()  (1 usage found)
                        205 @Test
                    dispatchReturnTest5()  (1 usage found)
                        233 @Test
                    startAsyncAgainTest()  (1 usage found)
                        261 @Test
                    startAsyncAgainTest1()  (1 usage found)
                        295 @Test
                    startAsyncAgainTest2()  (1 usage found)
                        329 @Test
                    startAsyncAgainTest3()  (1 usage found)
                        359 @Test
                    startAsyncAgainTest4()  (1 usage found)
                        389 @Test
                    startAsyncAgainTest5()  (1 usage found)
                        422 @Test
                    startAsyncAgainTest6()  (1 usage found)
                        456 @Test
                    startAsyncAgainTest7()  (1 usage found)
                        490 @Test
                    startAsyncAgainTest8()  (1 usage found)
                        524 @Test
                    startAsyncAgainTest9()  (1 usage found)
                        556 @Test
                    startAsyncAgainTest10()  (1 usage found)
                        588 @Test
                    startAsyncAgainTest11()  (1 usage found)
                        623 @Test
                    startAsyncAgainTest12()  (1 usage found)
                        656 @Test
                    startAsyncAgainTest13()  (1 usage found)
                        689 @Test
                    startAsyncAgainTest14()  (1 usage found)
                        723 @Test
                    startAsyncAgainTest15()  (1 usage found)
                        753 @Test
                    startAsyncAgainTest16()  (1 usage found)
                        783 @Test
                    startAsyncAgainTest17()  (1 usage found)
                        816 @Test
                    negativeDispatchTest()  (1 usage found)
                        848 @Test
                    negativeDispatchTest1()  (1 usage found)
                        878 @Test
                    negativeDispatchTest4()  (1 usage found)
                        907 @Test
                    negativeDispatchTest5()  (1 usage found)
                        936 @Test
                    negativeDispatchTest8()  (1 usage found)
                        967 @Test
                    negativeDispatchTest9()  (1 usage found)
                        998 @Test
                    negativeDispatchTest12()  (1 usage found)
                        1029 @Test
                    negativeDispatchTest13()  (1 usage found)
                        1060 @Test
                    dispatchAfterCommitTest()  (1 usage found)
                        1086 @Test
                    dispatchAfterCommitTest1()  (1 usage found)
                        1112 @Test
                    dispatchAfterCommitTest2()  (1 usage found)
                        1136 @Test
                    dispatchAfterCommitTest3()  (1 usage found)
                        1161 @Test
                    dispatchAfterCommitTest4()  (1 usage found)
                        1186 @Test
                    dispatchAfterCommitTest5()  (1 usage found)
                        1211 @Test
            com.sun.ts.tests.servlet.api.jakarta_servlet.dofilter  (1 usage found)
                URLClient.java  (1 usage found)
                    wrapResponseTest()  (1 usage found)
                        69 @Test
            com.sun.ts.tests.servlet.api.jakarta_servlet.filter  (2 usages found)
                URLClient.java  (2 usages found)
                    doFilterTest()  (1 usage found)
                        59 @Test
                    initFilterConfigTest()  (1 usage found)
                        73 @Test
            com.sun.ts.tests.servlet.api.jakarta_servlet.filterchain  (1 usage found)
                URLClient.java  (1 usage found)
                    filterChainTest()  (1 usage found)
                        58 @Test
            com.sun.ts.tests.servlet.api.jakarta_servlet.filterconfig  (6 usages found)
                URLClient.java  (6 usages found)
                    GetFilterNameTest()  (1 usage found)
                        60 @Test
                    GetInitParamNamesTest()  (1 usage found)
                        75 @Test
                    GetInitParamNamesNullTest()  (1 usage found)
                        90 @Test
                    GetInitParamTest()  (1 usage found)
                        105 @Test
                    GetInitParamNullTest()  (1 usage found)
                        120 @Test
                    GetServletContextTest()  (1 usage found)
                        135 @Test
            com.sun.ts.tests.servlet.api.jakarta_servlet.filterrequestdispatcher  (8 usages found)
                URLClient.java  (8 usages found)
                    RequestTest()  (1 usage found)
                        76 @Test
                    RequestTest1()  (1 usage found)
                        101 @Test
                    RequestTest2()  (1 usage found)
                        118 @Test
                    ForwardTest()  (1 usage found)
                        139 @Test
                    ForwardTest1()  (1 usage found)
                        157 @Test
                    IncludeTest()  (1 usage found)
                        180 @Test
                    IncludeTest1()  (1 usage found)
                        198 @Test
                    ErrorTest()  (1 usage found)
                        221 @Test
            com.sun.ts.tests.servlet.api.jakarta_servlet.genericfilter  (8 usages found)
                URLClient.java  (8 usages found)
                    initFilterTest()  (1 usage found)
                        62 @Test
                    initFilterConfigTest()  (1 usage found)
                        76 @Test
                    GetFilterNameTest()  (1 usage found)
                        90 @Test
                    GetInitParamTest()  (1 usage found)
                        105 @Test
                    GetInitParamNamesTest()  (1 usage found)
                        120 @Test
                    GetInitParamNamesNullTest()  (1 usage found)
                        135 @Test
                    GetInitParamNullTest()  (1 usage found)
                        150 @Test
                    GetServletContextTest()  (1 usage found)
                        165 @Test
            com.sun.ts.tests.servlet.api.jakarta_servlet.genericservlet  (12 usages found)
                URLClient.java  (12 usages found)
                    destroyTest()  (1 usage found)
                        67 @Test
                    getServletConfigTest()  (1 usage found)
                        90 @Test
                    getServletContextTest()  (1 usage found)
                        105 @Test
                    getServletInfoTest()  (1 usage found)
                        120 @Test
                    getInitParameterTest()  (1 usage found)
                        133 @Test
                    getInitParameterNamesTest()  (1 usage found)
                        146 @Test
                    getServletNameTest()  (1 usage found)
                        159 @Test
                    initServletExceptionTest()  (1 usage found)
                        172 @Test
                    initTest()  (1 usage found)
                        192 @Test
                    init_ServletConfigServletExceptionTest()  (1 usage found)
                        208 @Test
                    init_ServletConfigTest()  (1 usage found)
                        228 @Test
                    serviceTest()  (1 usage found)
                        244 @Test
            com.sun.ts.tests.servlet.api.jakarta_servlet.registration  (10 usages found)
                URLClient.java  (10 usages found)
                    servletURLMappingTest()  (1 usage found)
                        96 @Test
                    filterServletMappingTest()  (1 usage found)
                        124 @Test
                    servletRegistrationsTest()  (1 usage found)
                        151 @Test
                    getServletRegistrationTest()  (1 usage found)
                        177 @Test
                    getFilterRegistrationsTest()  (1 usage found)
                        204 @Test
                    getFilterRegistrationTest()  (1 usage found)
                        230 @Test
                    getRegistrationNameTest()  (1 usage found)
                        261 @Test
                    getRegistrationClassNameTest()  (1 usage found)
                        293 @Test
                    getRegistrationInitParameterTest()  (1 usage found)
                        331 @Test
                    getRegistrationInitParametersTest()  (1 usage found)
                        365 @Test
            com.sun.ts.tests.servlet.api.jakarta_servlet.requestdispatcher  (6 usages found)
                URLClient.java  (6 usages found)
                    forwardTest()  (1 usage found)
                        66 @Test
                    forward_1Test()  (1 usage found)
                        82 @Test
                    includeTest()  (1 usage found)
                        96 @Test
                    include_1Test()  (1 usage found)
                        113 @Test
                    include_2Test()  (1 usage found)
                        131 @Test
                    include_3Test()  (1 usage found)
                        148 @Test
            com.sun.ts.tests.servlet.api.jakarta_servlet.scattributeevent  (4 usages found)
                URLClient.java  (4 usages found)
                    constructorTest()  (1 usage found)
                        67 @Test
                    addedTest()  (1 usage found)
                        83 @Test
                    removedTest()  (1 usage found)
                        99 @Test
                    replacedTest()  (1 usage found)
                        115 @Test
            com.sun.ts.tests.servlet.api.jakarta_servlet.scattributelistener  (3 usages found)
                URLClient.java  (3 usages found)
                    addedTest()  (1 usage found)
                        66 @Test
                    removedTest()  (1 usage found)
                        81 @Test
                    replacedTest()  (1 usage found)
                        96 @Test
            com.sun.ts.tests.servlet.api.jakarta_servlet.scattributelistener40  (1 usage found)
                URLClient.java  (1 usage found)
                    defaultMethodsTest()  (1 usage found)
                        67 @Test
            com.sun.ts.tests.servlet.api.jakarta_servlet.scevent  (2 usages found)
                URLClient.java  (2 usages found)
                    constructorTest()  (1 usage found)
                        64 @Test
                    getServletContextTest()  (1 usage found)
                        79 @Test
            com.sun.ts.tests.servlet.api.jakarta_servlet.scinitializer.addfilter  (1 usage found)
                URLClient.java  (1 usage found)
                    addFilterTest()  (1 usage found)
                        65 @Test
            com.sun.ts.tests.servlet.api.jakarta_servlet.scinitializer.addfilter1  (1 usage found)
                URLClient.java  (1 usage found)
                    addFilterTest()  (1 usage found)
                        66 @Test
            com.sun.ts.tests.servlet.api.jakarta_servlet.scinitializer.addlistener  (1 usage found)
                URLClient.java  (1 usage found)
                    addListenerTest()  (1 usage found)
                        67 @Test
            com.sun.ts.tests.servlet.api.jakarta_servlet.scinitializer.addlistener1  (1 usage found)
                URLClient.java  (1 usage found)
                    addListenerTest()  (1 usage found)
                        64 @Test
            com.sun.ts.tests.servlet.api.jakarta_servlet.scinitializer.addservlet  (1 usage found)
                URLClient.java  (1 usage found)
                    addServletTest()  (1 usage found)
                        64 @Test
            com.sun.ts.tests.servlet.api.jakarta_servlet.scinitializer.addservlet1  (1 usage found)
                URLClient.java  (1 usage found)
                    addServletTest()  (1 usage found)
                        65 @Test
            com.sun.ts.tests.servlet.api.jakarta_servlet.scinitializer.createfilter  (1 usage found)
                URLClient.java  (1 usage found)
                    createFilterTest()  (1 usage found)
                        66 @Test
            com.sun.ts.tests.servlet.api.jakarta_servlet.scinitializer.createlistener  (1 usage found)
                URLClient.java  (1 usage found)
                    createListenerTest()  (1 usage found)
                        69 @Test
            com.sun.ts.tests.servlet.api.jakarta_servlet.scinitializer.createservlet  (1 usage found)
                URLClient.java  (1 usage found)
                    createServletTest()  (1 usage found)
                        66 @Test
            com.sun.ts.tests.servlet.api.jakarta_servlet.scinitializer.getclassloader  (1 usage found)
                URLClient.java  (1 usage found)
                    getClassloaderTest()  (1 usage found)
                        64 @Test
            com.sun.ts.tests.servlet.api.jakarta_servlet.scinitializer.getdefaultsessiontrackingmodes  (1 usage found)
                URLClient.java  (1 usage found)
                    getDefaultSessionTrackingModes()  (1 usage found)
                        64 @Test
            com.sun.ts.tests.servlet.api.jakarta_servlet.scinitializer.geteffectivemajorversion  (1 usage found)
                URLClient.java  (1 usage found)
                    getEffectiveMajorVersionTest()  (1 usage found)
                        65 @Test
            com.sun.ts.tests.servlet.api.jakarta_servlet.scinitializer.geteffectiveminorversion  (1 usage found)
                URLClient.java  (1 usage found)
                    getEffectiveMajorVersionTest()  (1 usage found)
                        64 @Test
            com.sun.ts.tests.servlet.api.jakarta_servlet.scinitializer.geteffectivesessiontrackingmodes  (1 usage found)
                URLClient.java  (1 usage found)
                    getEffectiveSessionTrackingModes()  (1 usage found)
                        66 @Test
            com.sun.ts.tests.servlet.api.jakarta_servlet.scinitializer.getfilterregistration  (1 usage found)
                URLClient.java  (1 usage found)
                    getFilterRegistrationTest()  (1 usage found)
                        64 @Test
            com.sun.ts.tests.servlet.api.jakarta_servlet.scinitializer.getfilterregistrations  (1 usage found)
                URLClient.java  (1 usage found)
                    getFilterRegistrationsTest()  (1 usage found)
                        65 @Test
            com.sun.ts.tests.servlet.api.jakarta_servlet.scinitializer.getservletregistration  (1 usage found)
                URLClient.java  (1 usage found)
                    getServletRegistrationTest()  (1 usage found)
                        64 @Test
            com.sun.ts.tests.servlet.api.jakarta_servlet.scinitializer.getservletregistrations  (1 usage found)
                URLClient.java  (1 usage found)
                    getServletRegistrationsTest()  (1 usage found)
                        65 @Test
            com.sun.ts.tests.servlet.api.jakarta_servlet.scinitializer.getsessioncookieconfig  (1 usage found)
                URLClient.java  (1 usage found)
                    getSessionCookieConfigTest()  (1 usage found)
                        65 @Test
            com.sun.ts.tests.servlet.api.jakarta_servlet.scinitializer.setinitparameter  (1 usage found)
                URLClient.java  (1 usage found)
                    setInitParameterTest()  (1 usage found)
                        64 @Test
            com.sun.ts.tests.servlet.api.jakarta_servlet.scinitializer.setsessiontrackingmodes  (1 usage found)
                URLClient.java  (1 usage found)
                    setSessionTrackingModesTest()  (1 usage found)
                        64 @Test
            com.sun.ts.tests.servlet.api.jakarta_servlet.sclistener  (1 usage found)
                URLClient.java  (1 usage found)
                    contextInitializedTest()  (1 usage found)
                        66 @Test
            com.sun.ts.tests.servlet.api.jakarta_servlet.sclistener40  (1 usage found)
                URLClient.java  (1 usage found)
                    defaultMethodsTest()  (1 usage found)
                        64 @Test
            com.sun.ts.tests.servlet.api.jakarta_servlet.servlet  (7 usages found)
                URLClient.java  (7 usages found)
                    DoDestroyedTest()  (1 usage found)
                        59 @Test
                    DoInit1Test()  (1 usage found)
                        74 @Test
                    DoInit2Test()  (1 usage found)
                        92 @Test
                    DoServletConfigTest()  (1 usage found)
                        106 @Test
                    DoServletInfoTest()  (1 usage found)
                        119 @Test
                    PUTest()  (1 usage found)
                        133 @Test
                    DoServiceTest()  (1 usage found)
                        149 @Test
            com.sun.ts.tests.servlet.api.jakarta_servlet.servletconfig  (5 usages found)
                URLClient.java  (5 usages found)
                    getServletConfigInitParameterNamesTest()  (1 usage found)
                        61 @Test
                    getServletConfigInitParameterTest()  (1 usage found)
                        75 @Test
                    getServletConfigInitParameterTestNull()  (1 usage found)
                        90 @Test
                    getServletContextTest()  (1 usage found)
                        104 @Test
                    getServletNameTest()  (1 usage found)
                        117 @Test
            com.sun.ts.tests.servlet.api.jakarta_servlet.servletcontext  (28 usages found)
                URLClient.java  (28 usages found)
                    GetServletTempDirTest()  (1 usage found)
                        63 @Test
                    GetMajorVersionTest()  (1 usage found)
                        78 @Test
                    GetMinorVersionTest()  (1 usage found)
                        93 @Test
                    GetMimeTypeTest()  (1 usage found)
                        108 @Test
                    GetMimeType_1Test()  (1 usage found)
                        123 @Test
                    GetRealPathTest()  (1 usage found)
                        138 @Test
                    GetResourcePathsTest()  (1 usage found)
                        152 @Test
                    GetResourceAsStreamTest()  (1 usage found)
                        177 @Test
                    GetResourceAsStream_1Test()  (1 usage found)
                        191 @Test
                    GetResourceTest()  (1 usage found)
                        205 @Test
                    GetResource_1Test()  (1 usage found)
                        220 @Test
                    GetResource_2Test()  (1 usage found)
                        235 @Test
                    GetServerInfoTest()  (1 usage found)
                        250 @Test
                    ServletContextGetAttributeTest()  (1 usage found)
                        264 @Test
                    ServletContextGetAttribute_1Test()  (1 usage found)
                        279 @Test
                    ServletContextGetContextTest()  (1 usage found)
                        293 @Test
                    ServletContextGetInitParameterNamesTest()  (1 usage found)
                        308 @Test
                    ServletContextGetInitParameterTest()  (1 usage found)
                        323 @Test
                    ServletContextGetInitParameterTestNull()  (1 usage found)
                        338 @Test
                    ServletContextRemoveAttributeTest()  (1 usage found)
                        352 @Test
                    ServletContextSetAttributeTest()  (1 usage found)
                        366 @Test
                    ServletContextSetAttribute_1Test()  (1 usage found)
                        382 @Test
                    ServletContextSetAttribute_2Test()  (1 usage found)
                        397 @Test
                    ServletContextGetAttributeNamesTest()  (1 usage found)
                        411 @Test
                    ServletContextGetRequestDispatcherTest()  (1 usage found)
                        426 @Test
                    GetNamedDispatcherTest()  (1 usage found)
                        442 @Test
                    GetNamedDispatcher_1Test()  (1 usage found)
                        457 @Test
                    GetServletNameTest()  (1 usage found)
                        473 @Test
            com.sun.ts.tests.servlet.api.jakarta_servlet.servletcontext30  (21 usages found)
                URLClient.java  (21 usages found)
                    getContextPathTest()  (1 usage found)
                        95 @Test
                    testAddServletString()  (1 usage found)
                        123 @Test
                    testAddFilterString()  (1 usage found)
                        155 @Test
                    testAddServletClass()  (1 usage found)
                        183 @Test
                    testAddFilterClass()  (1 usage found)
                        214 @Test
                    testAddServlet()  (1 usage found)
                        247 @Test
                    testAddFilterForward()  (1 usage found)
                        281 @Test
                    testAddFilterInclude()  (1 usage found)
                        314 @Test
                    testAddServletNotFound()  (1 usage found)
                        344 @Test
                    testCreateSRAListener()  (1 usage found)
                        378 @Test
                    negativeCreateTests()  (1 usage found)
                        417 @Test
                    duplicateServletTest1()  (1 usage found)
                        437 @Test
                    duplicateServletTest2()  (1 usage found)
                        455 @Test
                    duplicateServletTest3()  (1 usage found)
                        476 @Test
                    duplicateFilterTest()  (1 usage found)
                        496 @Test
                    duplicateFilterTest1()  (1 usage found)
                        516 @Test
                    getEffectiveMajorVersionTest()  (1 usage found)
                        532 @Test
                    getEffectiveMinorVersionTest()  (1 usage found)
                        547 @Test
                    getDefaultSessionTrackingModes()  (1 usage found)
                        562 @Test
                    sessionTrackingModesValueOfTest()  (1 usage found)
                        576 @Test
                    sessionTrackingModesValuesTest()  (1 usage found)
                        590 @Test
            com.sun.ts.tests.servlet.api.jakarta_servlet.servletcontext301  (1 usage found)
                URLClient.java  (1 usage found)
                    addListenerTest()  (1 usage found)
                        66 @Test
            com.sun.ts.tests.servlet.api.jakarta_servlet.servletcontext302  (1 usage found)
                URLClient.java  (1 usage found)
                    addListenerTest()  (1 usage found)
                        69 @Test
            com.sun.ts.tests.servlet.api.jakarta_servlet.servletcontext303  (8 usages found)
                URLClient.java  (8 usages found)
                    negativeaddSRAListenerClassTest()  (1 usage found)
                        67 @Test
                    negativeaddSRAListenerStringTest()  (1 usage found)
                        83 @Test
                    negativeaddSRListenerClassTest()  (1 usage found)
                        98 @Test
                    negativeaddSRListenerStringTest()  (1 usage found)
                        113 @Test
                    negativeaddSCAListenerClassTest()  (1 usage found)
                        129 @Test
                    negativeaddSCAListenerStringTest()  (1 usage found)
                        145 @Test
                    negativeaddSCListenerClassTest()  (1 usage found)
                        160 @Test
                    negativeaddSCListenerStringTest()  (1 usage found)
                        175 @Test
            com.sun.ts.tests.servlet.api.jakarta_servlet.servletcontext304  (1 usage found)
                URLClient.java  (1 usage found)
                    addListenerTest()  (1 usage found)
                        67 @Test
            com.sun.ts.tests.servlet.api.jakarta_servlet.servletcontext305  (10 usages found)
                URLClient.java  (10 usages found)
                    testAddServletString()  (1 usage found)
                        132 @Test
                    testAddFilterString()  (1 usage found)
                        172 @Test
                    testAddServletClass()  (1 usage found)
                        205 @Test
                    testAddFilterClass()  (1 usage found)
                        241 @Test
                    testAddServlet()  (1 usage found)
                        279 @Test
                    testAddFilterForward()  (1 usage found)
                        321 @Test
                    testAddFilterInclude()  (1 usage found)
                        361 @Test
                    testAddServletNotFound()  (1 usage found)
                        398 @Test
                    testCreateSRAListener()  (1 usage found)
                        439 @Test
                    negativeCreateTests()  (1 usage found)
                        482 @Test
            com.sun.ts.tests.servlet.api.jakarta_servlet.servletcontext306  (7 usages found)
                URLClient.java  (7 usages found)
                    addServletStringTest()  (1 usage found)
                        70 @Test
                    addServletClassTest()  (1 usage found)
                        85 @Test
                    addServletTest()  (1 usage found)
                        100 @Test
                    addFilterStringTest()  (1 usage found)
                        115 @Test
                    addFilterClassTest()  (1 usage found)
                        130 @Test
                    addFilterTest()  (1 usage found)
                        145 @Test
                    setInitParameterTest()  (1 usage found)
                        160 @Test
            com.sun.ts.tests.servlet.api.jakarta_servlet.servletcontext31  (1 usage found)
                URLClient.java  (1 usage found)
                    getVirtualServerNameTest()  (1 usage found)
                        61 @Test
            com.sun.ts.tests.servlet.api.jakarta_servlet.servletcontext40  (12 usages found)
                Client.java  (12 usages found)
                    addJspTest()  (1 usage found)
                        62 @Test
                    changeSessionTimeoutTest()  (1 usage found)
                        99 @Test
                    addJspContextInitialized()  (1 usage found)
                        136 @Test
                    setSessionTimeoutContextInitialized()  (1 usage found)
                        176 @Test
                    addJspContextListenerInTLD()  (1 usage found)
                        218 @Test
                    setSessionTimeoutContextListenerInTLD()  (1 usage found)
                        259 @Test
                    addJspEmptyAndNullName()  (1 usage found)
                        298 @Test
                    getAttributeWithNullName()  (1 usage found)
                        344 @Test
                    getInitParameterWithNullName()  (1 usage found)
                        383 @Test
                    setAttributeWithNullName()  (1 usage found)
                        422 @Test
                    setInitParameterWithNullName()  (1 usage found)
                        461 @Test
                    getEffectiveSessionTrackingModes()  (1 usage found)
                        501 @Test
            com.sun.ts.tests.servlet.api.jakarta_servlet.servletexception  (5 usages found)
                URLClient.java  (5 usages found)
                    getRootCauseTest()  (1 usage found)
                        65 @Test
                    servletExceptionConstructor1Test()  (1 usage found)
                        78 @Test
                    servletExceptionConstructor2Test()  (1 usage found)
                        91 @Test
                    servletExceptionConstructor3Test()  (1 usage found)
                        105 @Test
                    servletExceptionConstructor4Test()  (1 usage found)
                        121 @Test
            com.sun.ts.tests.servlet.api.jakarta_servlet.servletinputstream  (1 usage found)
                URLClient.java  (1 usage found)
                    readLineTest()  (1 usage found)
                        67 @Test
            com.sun.ts.tests.servlet.api.jakarta_servlet.servletoutputstream  (15 usages found)
                URLClient.java  (15 usages found)
                    print_StringTest()  (1 usage found)
                        67 @Test
                    print_booleanTest()  (1 usage found)
                        82 @Test
                    print_charTest()  (1 usage found)
                        101 @Test
                    print_doubleTest()  (1 usage found)
                        116 @Test
                    print_floatTest()  (1 usage found)
                        131 @Test
                    print_intTest()  (1 usage found)
                        146 @Test
                    print_longTest()  (1 usage found)
                        161 @Test
                    printlnTest()  (1 usage found)
                        177 @Test
                    println_StringTest()  (1 usage found)
                        193 @Test
                    println_booleanTest()  (1 usage found)
                        209 @Test
                    println_charTest()  (1 usage found)
                        230 @Test
                    println_doubleTest()  (1 usage found)
                        246 @Test
                    println_floatTest()  (1 usage found)
                        262 @Test
                    println_intTest()  (1 usage found)
                        278 @Test
                    println_longTest()  (1 usage found)
                        294 @Test
            com.sun.ts.tests.servlet.api.jakarta_servlet.servletrequest  (39 usages found)
                URLClient.java  (39 usages found)
                    getAttributeDoesNotExistTest()  (1 usage found)
                        345 @Test()
                    getAttributeNamesEmptyEnumTest()  (1 usage found)
                        350 @Test()
                    getAttributeNamesTest()  (1 usage found)
                        355 @Test()
                    getAttributeTest()  (1 usage found)
                        360 @Test()
                    getCharacterEncodingNullTest()  (1 usage found)
                        365 @Test()
                    getCharacterEncodingTest()  (1 usage found)
                        370 @Test()
                    getContentLengthTest()  (1 usage found)
                        375 @Test()
                    getContentTypeNullTest()  (1 usage found)
                        380 @Test()
                    getContentTypeTest()  (1 usage found)
                        385 @Test()
                    getInputStreamIllegalStateExceptionTest()  (1 usage found)
                        390 @Test()
                    getInputStreamTest()  (1 usage found)
                        395 @Test()
                    getLocalAddrTest()  (1 usage found)
                        400 @Test()
                    getLocaleDefaultTest()  (1 usage found)
                        405 @Test()
                    getLocaleTest()  (1 usage found)
                        410 @Test()
                    getLocalesDefaultTest()  (1 usage found)
                        415 @Test()
                    getLocalesTest()  (1 usage found)
                        420 @Test()
                    getParameterDoesNotExistTest()  (1 usage found)
                        425 @Test()
                    getParameterMapTest()  (1 usage found)
                        430 @Test()
                    getParameterNamesEmptyEnumTest()  (1 usage found)
                        435 @Test()
                    getParameterNamesTest()  (1 usage found)
                        440 @Test()
                    getParameterTest()  (1 usage found)
                        445 @Test()
                    getParameterValuesDoesNotExistTest()  (1 usage found)
                        450 @Test()
                    getParameterValuesTest()  (1 usage found)
                        455 @Test()
                    getProtocolTest()  (1 usage found)
                        460 @Test()
                    getReaderIllegalStateExceptionTest()  (1 usage found)
                        465 @Test()
                    getReaderTest()  (1 usage found)
                        470 @Test()
                    getReaderUnsupportedEncodingExceptionTest()  (1 usage found)
                        475 @Test()
                    getRemoteAddrTest()  (1 usage found)
                        480 @Test()
                    getRemoteHostTest()  (1 usage found)
                        485 @Test()
                    getRequestDispatcherTest()  (1 usage found)
                        490 @Test()
                    getSchemeTest()  (1 usage found)
                        495 @Test()
                    getServerNameTest()  (1 usage found)
                        500 @Test()
                    getServerPortTest()  (1 usage found)
                        505 @Test()
                    isSecureTest()  (1 usage found)
                        510 @Test()
                    removeAttributeTest()  (1 usage found)
                        515 @Test()
                    setAttributeTest()  (1 usage found)
                        520 @Test()
                    setCharacterEncodingTest()  (1 usage found)
                        525 @Test()
                    setCharacterEncodingTest1()  (1 usage found)
                        530 @Test()
                    setCharacterEncodingUnsupportedEncodingExceptionTest()  (1 usage found)
                        535 @Test()
            com.sun.ts.tests.servlet.api.jakarta_servlet.servletrequest1  (2 usages found)
                URLClient.java  (2 usages found)
                    getLocalNameTest()  (1 usage found)
                        62 @Test()
                    getLocalPortTest()  (1 usage found)
                        67 @Test()
            com.sun.ts.tests.servlet.api.jakarta_servlet.servletrequest30  (15 usages found)
                URLClient.java  (15 usages found)
                    getServletContextTest()  (1 usage found)
                        64 @Test
                    getDispatcherTypeTestRequest()  (1 usage found)
                        82 @Test
                    getDispatcherTypeTestForward()  (1 usage found)
                        99 @Test
                    getDispatcherTypeTestInclude()  (1 usage found)
                        116 @Test
                    getDispatcherTypeTestError()  (1 usage found)
                        133 @Test
                    getDispatcherTypeTestAsync()  (1 usage found)
                        154 @Test
                    asyncStartedTest1()  (1 usage found)
                        172 @Test
                    asyncStartedTest2()  (1 usage found)
                        190 @Test
                    asyncStartedTest3()  (1 usage found)
                        210 @Test
                    asyncStartedTest4()  (1 usage found)
                        228 @Test
                    isAsyncSupportedTest1()  (1 usage found)
                        245 @Test
                    isAsyncSupportedTest2()  (1 usage found)
                        262 @Test
                    startAsyncTest1()  (1 usage found)
                        279 @Test
                    startAsyncTest2()  (1 usage found)
                        297 @Test
                    getAsyncContextTest()  (1 usage found)
                        315 @Test
            com.sun.ts.tests.servlet.api.jakarta_servlet.servletrequestwrapper  (32 usages found)
                URLClient.java  (32 usages found)
                    requestWrapperConstructorTest()  (1 usage found)
                        56 @Test
                    requestWrapperGetRequestTest()  (1 usage found)
                        69 @Test
                    requestWrapperSetRequestTest()  (1 usage found)
                        82 @Test
                    requestWrapperSetRequestIllegalArgumentExceptionTest()  (1 usage found)
                        95 @Test
                    getAttributeNamesTest()  (1 usage found)
                        331 @Test()
                    getAttributeTest()  (1 usage found)
                        336 @Test()
                    getCharacterEncodingTest()  (1 usage found)
                        341 @Test()
                    getContentLengthTest()  (1 usage found)
                        346 @Test()
                    getContentTypeTest()  (1 usage found)
                        351 @Test()
                    getInputStreamTest()  (1 usage found)
                        356 @Test()
                    getLocalNameTest()  (1 usage found)
                        361 @Test()
                    getLocalPortTest()  (1 usage found)
                        366 @Test()
                    getLocaleTest()  (1 usage found)
                        371 @Test()
                    getLocalesTest()  (1 usage found)
                        376 @Test()
                    getParameterMapTest()  (1 usage found)
                        381 @Test()
                    getParameterNamesTest()  (1 usage found)
                        386 @Test()
                    getParameterTest()  (1 usage found)
                        391 @Test()
                    getParameterValuesTest()  (1 usage found)
                        396 @Test()
                    getProtocolTest()  (1 usage found)
                        401 @Test()
                    getReaderTest()  (1 usage found)
                        406 @Test()
                    getRemoteAddrTest()  (1 usage found)
                        411 @Test()
                    getRemoteHostTest()  (1 usage found)
                        416 @Test()
                    getRequestDispatcherTest()  (1 usage found)
                        421 @Test()
                    getSchemeTest()  (1 usage found)
                        426 @Test()
                    getServerNameTest()  (1 usage found)
                        431 @Test()
                    getServerPortTest()  (1 usage found)
                        436 @Test()
                    isSecureTest()  (1 usage found)
                        441 @Test()
                    removeAttributeTest()  (1 usage found)
                        446 @Test()
                    setAttributeTest()  (1 usage found)
                        451 @Test()
                    setCharacterEncodingTest()  (1 usage found)
                        456 @Test()
                    setCharacterEncodingTest1()  (1 usage found)
                        461 @Test()
                    setCharacterEncodingUnsupportedEncodingExceptionTest()  (1 usage found)
                        466 @Test()
            com.sun.ts.tests.servlet.api.jakarta_servlet.servletrequestwrapper30  (15 usages found)
                URLClient.java  (15 usages found)
                    getServletContextTest()  (1 usage found)
                        63 @Test
                    getDispatcherTypeTestRequest()  (1 usage found)
                        83 @Test
                    getDispatcherTypeTestForward()  (1 usage found)
                        101 @Test
                    getDispatcherTypeTestInclude()  (1 usage found)
                        119 @Test
                    getDispatcherTypeTestError()  (1 usage found)
                        138 @Test
                    getDispatcherTypeTestAsync()  (1 usage found)
                        161 @Test
                    asyncStartedTest1()  (1 usage found)
                        180 @Test
                    asyncStartedTest2()  (1 usage found)
                        199 @Test
                    asyncStartedTest3()  (1 usage found)
                        220 @Test
                    asyncStartedTest4()  (1 usage found)
                        241 @Test
                    isAsyncSupportedTest1()  (1 usage found)
                        259 @Test
                    isAsyncSupportedTest2()  (1 usage found)
                        277 @Test
                    startAsyncTest1()  (1 usage found)
                        295 @Test
                    startAsyncTest2()  (1 usage found)
                        315 @Test
                    getAsyncContextTest()  (1 usage found)
                        335 @Test
            com.sun.ts.tests.servlet.api.jakarta_servlet.servletrequestwrapper30x  (1 usage found)
                URLClient.java  (1 usage found)
                    isWrapperForTest()  (1 usage found)
                        58 @Test
            com.sun.ts.tests.servlet.api.jakarta_servlet.servletresponse  (32 usages found)
                URLClient.java  (32 usages found)
                    flushBufferTest()  (1 usage found)
                        303 @Test()
                    getBufferSizeTest()  (1 usage found)
                        308 @Test()
                    getCharacterEncodingDefaultTest()  (1 usage found)
                        313 @Test()
                    getCharacterEncodingTest()  (1 usage found)
                        318 @Test()
                    getContentType1Test()  (1 usage found)
                        323 @Test()
                    getContentTypeNull1Test()  (1 usage found)
                        328 @Test()
                    getContentTypeNull2Test()  (1 usage found)
                        333 @Test()
                    getContentTypeNullTest()  (1 usage found)
                        338 @Test()
                    getContentTypeTest()  (1 usage found)
                        343 @Test()
                    getLocaleDefaultTest()  (1 usage found)
                        348 @Test()
                    getLocaleTest()  (1 usage found)
                        353 @Test()
                    getOutputStreamFlushTest()  (1 usage found)
                        358 @Test()
                    getOutputStreamIllegalStateExceptionTest()  (1 usage found)
                        363 @Test()
                    getOutputStreamTest()  (1 usage found)
                        368 @Test()
                    getWriterAfterTest()  (1 usage found)
                        373 @Test()
                    getWriterFlushTest()  (1 usage found)
                        378 @Test()
                    getWriterIllegalStateExceptionTest()  (1 usage found)
                        383 @Test()
                    getWriterTest()  (1 usage found)
                        388 @Test()
                    isCommittedTest()  (1 usage found)
                        393 @Test()
                    resetBufferTest()  (1 usage found)
                        398 @Test()
                    resetIllegalStateExceptionTest()  (1 usage found)
                        403 @Test()
                    resetTest()  (1 usage found)
                        408 @Test()
                    resetTest1()  (1 usage found)
                        413 @Test()
                    setBufferSizeIllegalStateExceptionTest()  (1 usage found)
                        418 @Test()
                    setBufferSizeTest()  (1 usage found)
                        423 @Test()
                    setCharacterEncodingTest()  (1 usage found)
                        428 @Test()
                    setContentLengthTest()  (1 usage found)
                        433 @Test()
                    setContentType1Test()  (1 usage found)
                        438 @Test()
                    setContentType2Test()  (1 usage found)
                        443 @Test()
                    setContentTypeTest()  (1 usage found)
                        448 @Test()
                    setLocale1Test()  (1 usage found)
                        453 @Test()
                    setLocaleTest()  (1 usage found)
                        458 @Test()
            com.sun.ts.tests.servlet.api.jakarta_servlet.servletresponsewrapper  (20 usages found)
                URLClient.java  (20 usages found)
                    responseWrapperConstructorTest()  (1 usage found)
                        57 @Test
                    responseWrapperGetResponseTest()  (1 usage found)
                        70 @Test
                    responseWrapperSetResponseTest()  (1 usage found)
                        83 @Test
                    responseWrapperSetResponseIllegalArgumentExceptionTest()  (1 usage found)
                        96 @Test
                    flushBufferTest()  (1 usage found)
                        230 @Test()
                    getBufferSizeTest()  (1 usage found)
                        235 @Test()
                    getCharacterEncodingTest()  (1 usage found)
                        240 @Test()
                    getContentTypeTest()  (1 usage found)
                        245 @Test()
                    getLocaleTest()  (1 usage found)
                        250 @Test()
                    getOutputStreamTest()  (1 usage found)
                        255 @Test()
                    getWriterTest()  (1 usage found)
                        260 @Test()
                    isCommittedTest()  (1 usage found)
                        265 @Test()
                    resetBufferTest()  (1 usage found)
                        270 @Test()
                    resetTest()  (1 usage found)
                        275 @Test()
                    resetTest1()  (1 usage found)
                        280 @Test()
                    setBufferSizeTest()  (1 usage found)
                        285 @Test()
                    setCharacterEncodingTest()  (1 usage found)
                        290 @Test()
                    setContentLengthTest()  (1 usage found)
                        295 @Test()
                    setContentTypeTest()  (1 usage found)
                        300 @Test()
                    setLocaleTest()  (1 usage found)
                        305 @Test()
            com.sun.ts.tests.servlet.api.jakarta_servlet.servletresponsewrapper30  (1 usage found)
                URLClient.java  (1 usage found)
                    isWrapperForTest()  (1 usage found)
                        60 @Test
            com.sun.ts.tests.servlet.api.jakarta_servlet.sessiontrackingmode  (1 usage found)
                URLClient.java  (1 usage found)
                    setSessionTrackingModes()  (1 usage found)
                        62 @Test
            com.sun.ts.tests.servlet.api.jakarta_servlet.sessiontrackingmode1  (4 usages found)
                URLClient.java  (4 usages found)
                    setSessionTrackingModes1()  (1 usage found)
                        63 @Test
                    setSessionTrackingModes2()  (1 usage found)
                        79 @Test
                    setSessionTrackingModes3()  (1 usage found)
                        94 @Test
                    setSessionTrackingModes4()  (1 usage found)
                        110 @Test
            com.sun.ts.tests.servlet.api.jakarta_servlet.sessiontrackingmode2  (1 usage found)
                URLClient.java  (1 usage found)
                    setSessionTrackingModes5()  (1 usage found)
                        63 @Test
            com.sun.ts.tests.servlet.api.jakarta_servlet.sessiontrackingmode3  (1 usage found)
                URLClient.java  (1 usage found)
                    setSessionTrackingModes6()  (1 usage found)
                        63 @Test
            com.sun.ts.tests.servlet.api.jakarta_servlet.sessiontrackingmode4  (1 usage found)
                URLClient.java  (1 usage found)
                    setSessionTrackingModes7()  (1 usage found)
                        63 @Test
            com.sun.ts.tests.servlet.api.jakarta_servlet.srattributeevent  (4 usages found)
                URLClient.java  (4 usages found)
                    constructorTest()  (1 usage found)
                        68 @Test
                    addedTest()  (1 usage found)
                        85 @Test
                    removedTest()  (1 usage found)
                        102 @Test
                    replacedTest()  (1 usage found)
                        119 @Test
            com.sun.ts.tests.servlet.api.jakarta_servlet.srattributelistener  (3 usages found)
                URLClient.java  (3 usages found)
                    addedTest()  (1 usage found)
                        69 @Test
                    removedTest()  (1 usage found)
                        84 @Test
                    replacedTest()  (1 usage found)
                        99 @Test
            com.sun.ts.tests.servlet.api.jakarta_servlet.srattributelistener40  (1 usage found)
                URLClient.java  (1 usage found)
                    defaultMethodsTest()  (1 usage found)
                        65 @Test
            com.sun.ts.tests.servlet.api.jakarta_servlet.srevent  (3 usages found)
                URLClient.java  (3 usages found)
                    constructorTest()  (1 usage found)
                        62 @Test
                    getServletContextTest()  (1 usage found)
                        76 @Test
                    getServletRequestTest()  (1 usage found)
                        90 @Test
            com.sun.ts.tests.servlet.api.jakarta_servlet.srlistener  (1 usage found)
                URLClient.java  (1 usage found)
                    initializeDestroyTest()  (1 usage found)
                        69 @Test
            com.sun.ts.tests.servlet.api.jakarta_servlet.srlistener40  (1 usage found)
                URLClient.java  (1 usage found)
                    defaultMethodsTest()  (1 usage found)
                        66 @Test
            com.sun.ts.tests.servlet.api.jakarta_servlet.unavailableexception  (5 usages found)
                URLClient.java  (5 usages found)
                    getUnavailableSecondsTest()  (1 usage found)
                        64 @Test
                    isPermanentTest()  (1 usage found)
                        78 @Test
                    unavailableTest()  (1 usage found)
                        94 @Test
                    unavailableException_Constructor1Test()  (1 usage found)
                        113 @Test
                    unavailableException_Constructor2Test()  (1 usage found)
                        128 @Test
            com.sun.ts.tests.servlet.api.jakarta_servlet_http.asynccontext  (12 usages found)
                URLClient.java  (12 usages found)
                    dispatchZeroArgTest()  (1 usage found)
                        81 @Test
                    dispatchZeroArgTest1()  (1 usage found)
                        105 @Test
                    dispatchContextPathTest()  (1 usage found)
                        130 @Test
                    getRequestTest()  (1 usage found)
                        150 @Test
                    asyncListenerTest1()  (1 usage found)
                        167 @Test
                    timeOutTest()  (1 usage found)
                        183 @Test
                    timeOutTest1()  (1 usage found)
                        199 @Test
                    originalRequestTest()  (1 usage found)
                        218 @Test
                    originalRequestTest1()  (1 usage found)
                        234 @Test
                    originalRequestTest2()  (1 usage found)
                        251 @Test
                    originalRequestTest3()  (1 usage found)
                        268 @Test
                    originalRequestTest4()  (1 usage found)
                        285 @Test
            com.sun.ts.tests.servlet.api.jakarta_servlet_http.cookie  (22 usages found)
                URLClient.java  (22 usages found)
                    cloneTest()  (1 usage found)
                        98 @Test
                    constructorTest()  (1 usage found)
                        111 @Test
                    constructorIllegalArgumentExceptionTest()  (1 usage found)
                        124 @Test
                    getCommentTest()  (1 usage found)
                        139 @Test
                    getCommentNullTest()  (1 usage found)
                        152 @Test
                    getDomainTest()  (1 usage found)
                        166 @Test
                    getMaxAgeTest()  (1 usage found)
                        184 @Test
                    getNameTest()  (1 usage found)
                        197 @Test
                    getPathTest()  (1 usage found)
                        219 @Test
                    getSecureTest()  (1 usage found)
                        235 @Test
                    getValueTest()  (1 usage found)
                        248 @Test
                    getVersionTest()  (1 usage found)
                        270 @Test
                    setDomainTest()  (1 usage found)
                        292 @Test
                    setMaxAgePositiveTest()  (1 usage found)
                        305 @Test
                    setMaxAgeZeroTest()  (1 usage found)
                        377 @Test
                    setMaxAgeNegativeTest()  (1 usage found)
                        391 @Test
                    setPathTest()  (1 usage found)
                        406 @Test
                    setSecureTest()  (1 usage found)
                        421 @Test
                    setValueTest()  (1 usage found)
                        436 @Test
                    setVersionTest()  (1 usage found)
                        451 @Test
                    setAttributeTest()  (1 usage found)
                        466 @Test
                    getAttributesTest()  (1 usage found)
                        479 @Test
            com.sun.ts.tests.servlet.api.jakarta_servlet_http.httpfilter  (1 usage found)
                URLClient.java  (1 usage found)
                    dofilterTest()  (1 usage found)
                        57 @Test
            com.sun.ts.tests.servlet.api.jakarta_servlet_http.httpservlet  (11 usages found)
                URLClient.java  (11 usages found)
                    destroyTest()  (1 usage found)
                        66 @Test
                    getServletConfigTest()  (1 usage found)
                        89 @Test
                    getServletContextTest()  (1 usage found)
                        104 @Test
                    getServletInfoTest()  (1 usage found)
                        119 @Test
                    getInitParameterTest()  (1 usage found)
                        132 @Test
                    getInitParameterTestNull()  (1 usage found)
                        145 @Test
                    getInitParameterNamesTest()  (1 usage found)
                        158 @Test
                    getServletNameTest()  (1 usage found)
                        171 @Test
                    serviceTest()  (1 usage found)
                        184 @Test
                    initTest()  (1 usage found)
                        201 @Test
                    init_ServletConfigTest()  (1 usage found)
                        218 @Test
            com.sun.ts.tests.servlet.api.jakarta_servlet_http.httpservletrequest  (70 usages found)
                URLClient.java  (70 usages found)
                    getAttributeNamesTest()  (1 usage found)
                        68 @Test
                    getAttributeTest()  (1 usage found)
                        84 @Test
                    getCharacterEncodingTest()  (1 usage found)
                        99 @Test
                    getLocaleTest()  (1 usage found)
                        148 @Test
                    getLocalesTest()  (1 usage found)
                        164 @Test
                    getParameterNamesTest()  (1 usage found)
                        188 @Test
                    getParameterTest()  (1 usage found)
                        209 @Test
                    getParameterValuesTest()  (1 usage found)
                        227 @Test
                    getServletContextTest()  (1 usage found)
                        649 @Test
                    doHeadTest()  (1 usage found)
                        667 @Test
                    getAuthTypeWithoutProtectionTest()  (1 usage found)
                        715 @Test()
                    getContentLengthTest()  (1 usage found)
                        720 @Test()
                    getContentTypeTest()  (1 usage found)
                        725 @Test()
                    getContextPathTest()  (1 usage found)
                        730 @Test()
                    getCookiesNoCookiesTest()  (1 usage found)
                        735 @Test()
                    getCookiesTest()  (1 usage found)
                        740 @Test()
                    getDateHeaderIllegalArgumentExceptionTest()  (1 usage found)
                        745 @Test()
                    getDateHeaderNoHeaderTest()  (1 usage found)
                        750 @Test()
                    getDateHeaderTest()  (1 usage found)
                        755 @Test()
                    getHeaderNamesTest()  (1 usage found)
                        760 @Test()
                    getHeaderNoHeaderTest()  (1 usage found)
                        765 @Test()
                    getHeaderTest()  (1 usage found)
                        770 @Test()
                    getHeadersNoHeadersTest()  (1 usage found)
                        775 @Test()
                    getHeadersTest()  (1 usage found)
                        780 @Test()
                    getInputStreamIllegalStateExceptionTest()  (1 usage found)
                        785 @Test()
                    getInputStreamTest()  (1 usage found)
                        790 @Test()
                    getIntHeaderNoHeaderTest()  (1 usage found)
                        795 @Test()
                    getIntHeaderNumberFoundExceptionTest()  (1 usage found)
                        800 @Test()
                    getIntHeaderTest()  (1 usage found)
                        805 @Test()
                    getLocalAddrTest()  (1 usage found)
                        810 @Test()
                    getLocalPortTest()  (1 usage found)
                        815 @Test()
                    getMethodTest()  (1 usage found)
                        820 @Test()
                    getParameterMapTest()  (1 usage found)
                        825 @Test()
                    getPathInfoNullTest()  (1 usage found)
                        830 @Test()
                    getPathInfoTest()  (1 usage found)
                        835 @Test()
                    getPathTranslatedNullTest()  (1 usage found)
                        840 @Test()
                    getPathTranslatedTest()  (1 usage found)
                        845 @Test()
                    getProtocolTest()  (1 usage found)
                        850 @Test()
                    getQueryStringNullTest()  (1 usage found)
                        855 @Test()
                    getQueryStringTest()  (1 usage found)
                        860 @Test()
                    getReaderIllegalStateExceptionTest()  (1 usage found)
                        865 @Test()
                    getReaderTest()  (1 usage found)
                        870 @Test()
                    getReaderUnsupportedEncodingExceptionTest()  (1 usage found)
                        875 @Test()
                    getRemoteAddrTest()  (1 usage found)
                        880 @Test()
                    getRemoteHostTest()  (1 usage found)
                        885 @Test()
                    getRemoteUserTest()  (1 usage found)
                        890 @Test()
                    getRequestDispatcherTest()  (1 usage found)
                        895 @Test()
                    getRequestURITest()  (1 usage found)
                        900 @Test()
                    getRequestURLTest()  (1 usage found)
                        905 @Test()
                    getRequestedSessionIdNullTest()  (1 usage found)
                        910 @Test()
                    getRequestedSessionIdTest1()  (1 usage found)
                        915 @Test()
                    getRequestedSessionIdTest2()  (1 usage found)
                        920 @Test()
                    getSchemeTest()  (1 usage found)
                        925 @Test()
                    getServerNameTest()  (1 usage found)
                        930 @Test()
                    getServerPortTest()  (1 usage found)
                        935 @Test()
                    getServletPathEmptyStringTest()  (1 usage found)
                        940 @Test()
                    getServletPathTest()  (1 usage found)
                        945 @Test()
                    getSessionFalseTest()  (1 usage found)
                        950 @Test()
                    getSessionTest()  (1 usage found)
                        955 @Test()
                    getSessionTrueTest()  (1 usage found)
                        960 @Test()
                    isRequestedSessionIdFromCookieTest()  (1 usage found)
                        965 @Test()
                    isRequestedSessionIdFromURLTest()  (1 usage found)
                        970 @Test()
                    isRequestedSessionIdValidTest()  (1 usage found)
                        975 @Test()
                    isSecureTest()  (1 usage found)
                        980 @Test()
                    removeAttributeTest()  (1 usage found)
                        985 @Test()
                    sessionTimeoutTest()  (1 usage found)
                        990 @Test()
                    setAttributeTest()  (1 usage found)
                        995 @Test()
                    setCharacterEncodingTest()  (1 usage found)
                        1000 @Test()
                    setCharacterEncodingTest1()  (1 usage found)
                        1005 @Test()
                    setCharacterEncodingUnsupportedEncodingExceptionTest()  (1 usage found)
                        1010 @Test()
            com.sun.ts.tests.servlet.api.jakarta_servlet_http.httpservletrequest1  (1 usage found)
                URLClient.java  (1 usage found)
                    getLocalNameTest()  (1 usage found)
                        62 @Test()
            com.sun.ts.tests.servlet.api.jakarta_servlet_http.httpservletrequest30  (1 usage found)
                URLClient.java  (1 usage found)
                    loginTest()  (1 usage found)
                        66 @Test
            com.sun.ts.tests.servlet.api.jakarta_servlet_http.httpservletrequest31  (1 usage found)
                URLClient.java  (1 usage found)
                    changeSessionIDTest()  (1 usage found)
                        58 @Test()
            com.sun.ts.tests.servlet.api.jakarta_servlet_http.httpservletrequest40  (12 usages found)
                Client.java  (12 usages found)
                    httpServletMappingTest()  (1 usage found)
                        66 @Test
                    httpServletMappingTest2()  (1 usage found)
                        79 @Test
                    httpServletMappingTest3()  (1 usage found)
                        92 @Test
                    httpServletMappingForwardTest()  (1 usage found)
                        105 @Test
                    httpServletMappingNamedForwardTest()  (1 usage found)
                        119 @Test
                    httpServletMappingNamedIncludeTest()  (1 usage found)
                        133 @Test
                    httpServletMappingIncludeTest()  (1 usage found)
                        147 @Test
                    httpServletMappingFilterTest()  (1 usage found)
                        161 @Test
                    httpServletMappingDispatchTest()  (1 usage found)
                        175 @Test
                    simpleTest(String, String, String, String)  (1 usage found)
                        182 @Test
                    TrailerTest()  (1 usage found)
                        218 @Test
                    TrailerTest2()  (1 usage found)
                        287 @Test
            com.sun.ts.tests.servlet.api.jakarta_servlet_http.httpservletrequestwrapper  (60 usages found)
                URLClient.java  (60 usages found)
                    httpRequestWrapperConstructorTest()  (1 usage found)
                        275 @Test
                    httpRequestWrapperConstructorIllegalArgumentExceptionTest()  (1 usage found)
                        289 @Test
                    httpRequestWrapperGetRequestTest()  (1 usage found)
                        523 @Test
                    httpRequestWrapperSetRequestTest()  (1 usage found)
                        536 @Test
                    httpRequestWrapperSetRequestIllegalArgumentExceptionTest()  (1 usage found)
                        549 @Test
                    changeSessionIDTest()  (1 usage found)
                        557 @Test()
                    changeSessionIDTest1()  (1 usage found)
                        562 @Test()
                    getAttributeNamesTest()  (1 usage found)
                        567 @Test()
                    getAttributeTest()  (1 usage found)
                        572 @Test()
                    getAuthTypeWithoutProtectionTest()  (1 usage found)
                        577 @Test()
                    getCharacterEncodingTest()  (1 usage found)
                        582 @Test()
                    getContentLengthTest()  (1 usage found)
                        587 @Test()
                    getContentTypeTest()  (1 usage found)
                        592 @Test()
                    getContextPathTest()  (1 usage found)
                        597 @Test()
                    getCookiesTest()  (1 usage found)
                        602 @Test()
                    getDateHeaderTest()  (1 usage found)
                        607 @Test()
                    getHeaderNamesTest()  (1 usage found)
                        612 @Test()
                    getHeaderTest()  (1 usage found)
                        617 @Test()
                    getHeadersTest()  (1 usage found)
                        622 @Test()
                    getInputStreamTest()  (1 usage found)
                        627 @Test()
                    getIntHeaderTest()  (1 usage found)
                        632 @Test()
                    getLocalNameTest()  (1 usage found)
                        637 @Test()
                    getLocalPortTest()  (1 usage found)
                        642 @Test()
                    getLocaleTest()  (1 usage found)
                        647 @Test()
                    getLocalesTest()  (1 usage found)
                        652 @Test()
                    getMethodTest()  (1 usage found)
                        657 @Test()
                    getParameterMapTest()  (1 usage found)
                        662 @Test()
                    getParameterNamesTest()  (1 usage found)
                        667 @Test()
                    getParameterTest()  (1 usage found)
                        672 @Test()
                    getParameterValuesTest()  (1 usage found)
                        677 @Test()
                    getPathInfoTest()  (1 usage found)
                        682 @Test()
                    getPathTranslatedTest()  (1 usage found)
                        687 @Test()
                    getProtocolTest()  (1 usage found)
                        692 @Test()
                    getQueryStringTest()  (1 usage found)
                        697 @Test()
                    getReaderTest()  (1 usage found)
                        702 @Test()
                    getRemoteAddrTest()  (1 usage found)
                        707 @Test()
                    getRemoteHostTest()  (1 usage found)
                        712 @Test()
                    getRemoteUserTest()  (1 usage found)
                        717 @Test()
                    getRequestDispatcherTest()  (1 usage found)
                        722 @Test()
                    getRequestURITest()  (1 usage found)
                        727 @Test()
                    getRequestURLTest()  (1 usage found)
                        732 @Test()
                    getRequestedSessionIdNullTest()  (1 usage found)
                        737 @Test()
                    getRequestedSessionIdTest1()  (1 usage found)
                        742 @Test()
                    getRequestedSessionIdTest2()  (1 usage found)
                        747 @Test()
                    getSchemeTest()  (1 usage found)
                        752 @Test()
                    getServerNameTest()  (1 usage found)
                        757 @Test()
                    getServerPortTest()  (1 usage found)
                        762 @Test()
                    getServletPathTest()  (1 usage found)
                        767 @Test()
                    getSessionTest()  (1 usage found)
                        772 @Test()
                    getSessionTrueTest()  (1 usage found)
                        777 @Test()
                    isRequestedSessionIdFromCookieTest()  (1 usage found)
                        782 @Test()
                    isRequestedSessionIdFromCookieTest1()  (1 usage found)
                        787 @Test()
                    isRequestedSessionIdFromURLTest()  (1 usage found)
                        792 @Test()
                    isRequestedSessionIdValidTest()  (1 usage found)
                        797 @Test()
                    isSecureTest()  (1 usage found)
                        802 @Test()
                    removeAttributeTest()  (1 usage found)
                        807 @Test()
                    setAttributeTest()  (1 usage found)
                        812 @Test()
                    setCharacterEncodingTest()  (1 usage found)
                        817 @Test()
                    setCharacterEncodingTest1()  (1 usage found)
                        822 @Test()
                    setCharacterEncodingUnsupportedEncodingExceptionTest()  (1 usage found)
                        827 @Test()
            com.sun.ts.tests.servlet.api.jakarta_servlet_http.httpservletresponse  (44 usages found)
                URLClient.java  (44 usages found)
                    getContentTypeTest()  (1 usage found)
                        206 @Test
                    addCookieTest()  (1 usage found)
                        407 @Test()
                    addDateHeaderTest()  (1 usage found)
                        412 @Test()
                    addHeaderTest()  (1 usage found)
                        417 @Test()
                    addIntHeaderTest()  (1 usage found)
                        422 @Test()
                    containsHeaderTest()  (1 usage found)
                        427 @Test()
                    flushBufferTest()  (1 usage found)
                        432 @Test()
                    getBufferSizeTest()  (1 usage found)
                        437 @Test()
                    getCharacterEncodingDefaultTest()  (1 usage found)
                        442 @Test()
                    getCharacterEncodingTest()  (1 usage found)
                        447 @Test()
                    getLocaleDefaultTest()  (1 usage found)
                        452 @Test()
                    getLocaleTest()  (1 usage found)
                        457 @Test()
                    getOutputStreamIllegalStateExceptionTest()  (1 usage found)
                        462 @Test()
                    getOutputStreamTest()  (1 usage found)
                        467 @Test()
                    getWriterIllegalStateExceptionTest()  (1 usage found)
                        472 @Test()
                    getWriterTest()  (1 usage found)
                        477 @Test()
                    isCommittedTest()  (1 usage found)
                        482 @Test()
                    resetBufferTest()  (1 usage found)
                        487 @Test()
                    resetIllegalStateExceptionTest()  (1 usage found)
                        492 @Test()
                    resetTest()  (1 usage found)
                        497 @Test()
                    resetTest1()  (1 usage found)
                        502 @Test()
                    sendErrorClearBufferTest()  (1 usage found)
                        507 @Test()
                    sendErrorIllegalStateExceptionTest()  (1 usage found)
                        512 @Test()
                    sendError_StringErrorPageTest()  (1 usage found)
                        517 @Test()
                    sendError_StringIllegalStateExceptionTest()  (1 usage found)
                        522 @Test()
                    sendError_StringTest()  (1 usage found)
                        527 @Test()
                    sendRedirectIllegalStateExceptionTest()  (1 usage found)
                        532 @Test()
                    sendRedirectWithLeadingSlashTest()  (1 usage found)
                        537 @Test()
                    sendRedirectWithoutLeadingSlashTest()  (1 usage found)
                        542 @Test()
                    setBufferSizeIllegalStateExceptionTest()  (1 usage found)
                        547 @Test()
                    setBufferSizeTest()  (1 usage found)
                        552 @Test()
                    setCharacterEncodingTest()  (1 usage found)
                        557 @Test()
                    setContentLengthTest()  (1 usage found)
                        562 @Test()
                    setContentType1Test()  (1 usage found)
                        567 @Test()
                    setContentType2Test()  (1 usage found)
                        572 @Test()
                    setContentTypeTest()  (1 usage found)
                        577 @Test()
                    setDateHeaderOverrideTest()  (1 usage found)
                        582 @Test()
                    setDateHeaderTest()  (1 usage found)
                        587 @Test()
                    setHeaderOverrideTest()  (1 usage found)
                        592 @Test()
                    setHeaderTest()  (1 usage found)
                        597 @Test()
                    setIntHeaderTest()  (1 usage found)
                        602 @Test()
                    setLocaleTest()  (1 usage found)
                        607 @Test()
                    setMultiHeaderTest()  (1 usage found)
                        612 @Test()
                    setStatusTest()  (1 usage found)
                        617 @Test()
            com.sun.ts.tests.servlet.api.jakarta_servlet_http.httpservletresponse30  (4 usages found)
                URLClient.java  (4 usages found)
                    getHeaderNamesTest()  (1 usage found)
                        86 @Test()
                    getHeaderTest()  (1 usage found)
                        91 @Test()
                    getHeadersTest()  (1 usage found)
                        96 @Test()
                    getStatusTest()  (1 usage found)
                        101 @Test()
            com.sun.ts.tests.servlet.api.jakarta_servlet_http.httpservletresponse40  (3 usages found)
                Client.java  (3 usages found)
                    TrailerTestWithHTTP10()  (1 usage found)
                        64 @Test
                    TrailerTestResponseCommitted()  (1 usage found)
                        84 @Test
                    TrailerTest()  (1 usage found)
                        104 @Test
            com.sun.ts.tests.servlet.api.jakarta_servlet_http.httpservletresponsewrapper  (34 usages found)
                URLClient.java  (34 usages found)
                    httpResponseWrapperGetResponseTest()  (1 usage found)
                        190 @Test
                    httpResponseWrapperSetResponseTest()  (1 usage found)
                        203 @Test
                    httpResponseWrapperSetResponseIllegalArgumentExceptionTest()  (1 usage found)
                        216 @Test
                    httpResponseWrapperConstructorTest()  (1 usage found)
                        229 @Test
                    sendRedirectTest()  (1 usage found)
                        291 @Test
                    addCookieTest()  (1 usage found)
                        355 @Test()
                    addDateHeaderTest()  (1 usage found)
                        360 @Test()
                    addHeaderTest()  (1 usage found)
                        365 @Test()
                    addIntHeaderTest()  (1 usage found)
                        370 @Test()
                    containsHeaderTest()  (1 usage found)
                        375 @Test()
                    flushBufferTest()  (1 usage found)
                        380 @Test()
                    getBufferSizeTest()  (1 usage found)
                        385 @Test()
                    getCharacterEncodingTest()  (1 usage found)
                        390 @Test()
                    getContentTypeTest()  (1 usage found)
                        395 @Test()
                    getLocaleTest()  (1 usage found)
                        400 @Test()
                    getOutputStreamTest()  (1 usage found)
                        405 @Test()
                    getWriterTest()  (1 usage found)
                        410 @Test()
                    isCommittedTest()  (1 usage found)
                        415 @Test()
                    resetBufferTest()  (1 usage found)
                        420 @Test()
                    resetTest()  (1 usage found)
                        425 @Test()
                    resetTest1()  (1 usage found)
                        430 @Test()
                    sendErrorClearBufferTest()  (1 usage found)
                        435 @Test()
                    sendError_StringTest()  (1 usage found)
                        440 @Test()
                    setBufferSizeTest()  (1 usage found)
                        445 @Test()
                    setCharacterEncodingTest()  (1 usage found)
                        450 @Test()
                    setContentLengthTest()  (1 usage found)
                        455 @Test()
                    setContentTypeTest()  (1 usage found)
                        460 @Test()
                    setDateHeaderTest()  (1 usage found)
                        465 @Test()
                    setHeaderTest()  (1 usage found)
                        470 @Test()
                    setIntHeaderTest()  (1 usage found)
                        475 @Test()
                    setLocaleTest()  (1 usage found)
                        480 @Test()
                    setMultiHeaderTest()  (1 usage found)
                        485 @Test()
                    setStatusTest()  (1 usage found)
                        490 @Test()
                    setStatusTest1()  (1 usage found)
                        495 @Test()
            com.sun.ts.tests.servlet.api.jakarta_servlet_http.httpservletresponsewrapper30  (4 usages found)
                URLClient.java  (4 usages found)
                    getHeadersTest()  (1 usage found)
                        67 @Test
                    getHeaderTest()  (1 usage found)
                        83 @Test
                    getHeaderNamesTest()  (1 usage found)
                        101 @Test
                    getStatusTest()  (1 usage found)
                        115 @Test
            com.sun.ts.tests.servlet.api.jakarta_servlet_http.httpsession  (25 usages found)
                URLClient.java  (25 usages found)
                    getCreationTimeTest()  (1 usage found)
                        65 @Test
                    getCreationTimeIllegalStateExceptionTest()  (1 usage found)
                        78 @Test
                    getIdTestServlet()  (1 usage found)
                        91 @Test
                    getIdIllegalStateExceptionTest()  (1 usage found)
                        105 @Test
                    getLastAccessedTimeTest()  (1 usage found)
                        118 @Test
                    getLastAccessedTimeSetGetTest()  (1 usage found)
                        131 @Test
                    expireHttpSessionTest()  (1 usage found)
                        163 @Test
                    getLastAccessedTimeIllegalStateExceptionTest()  (1 usage found)
                        216 @Test
                    getMaxInactiveIntervalTest()  (1 usage found)
                        234 @Test
                    getAttributeNamesTest()  (1 usage found)
                        247 @Test
                    getAttributeNamesIllegalStateExceptionTest()  (1 usage found)
                        260 @Test
                    getAttributeTest()  (1 usage found)
                        274 @Test
                    getAttributeIllegalStateExceptionTest()  (1 usage found)
                        287 @Test
                    getServletContextTest()  (1 usage found)
                        300 @Test
                    invalidateTest()  (1 usage found)
                        313 @Test
                    invalidateIllegalStateExceptionTest()  (1 usage found)
                        326 @Test
                    isNewTest()  (1 usage found)
                        339 @Test
                    isNewIllegalStateExceptionTest()  (1 usage found)
                        352 @Test
                    removeAttributeTest()  (1 usage found)
                        365 @Test
                    removeAttributeDoNothingTest()  (1 usage found)
                        379 @Test
                    removeAttributeIllegalStateExceptionTest()  (1 usage found)
                        392 @Test
                    setAttributeTest()  (1 usage found)
                        405 @Test
                    setAttributeNullTest()  (1 usage found)
                        418 @Test
                    setAttributeIllegalStateExceptionTest()  (1 usage found)
                        431 @Test
                    setMaxInactiveIntervalTest()  (1 usage found)
                        444 @Test
            com.sun.ts.tests.servlet.api.jakarta_servlet_http.httpsessionactivationlistener40  (1 usage found)
                URLClient.java  (1 usage found)
                    defaultMethodsTest()  (1 usage found)
                        64 @Test
            com.sun.ts.tests.servlet.api.jakarta_servlet_http.httpsessionattributelistener  (3 usages found)
                URLClient.java  (3 usages found)
                    attributeAddedTest()  (1 usage found)
                        64 @Test
                    attributeRemovedTest()  (1 usage found)
                        79 @Test
                    attributeReplacedTest()  (1 usage found)
                        94 @Test
            com.sun.ts.tests.servlet.api.jakarta_servlet_http.httpsessionattributelistener40  (1 usage found)
                URLClient.java  (1 usage found)
                    defaultMethodsTest()  (1 usage found)
                        65 @Test
            com.sun.ts.tests.servlet.api.jakarta_servlet_http.httpsessionbindingevent  (5 usages found)
                URLClient.java  (5 usages found)
                    addedTest()  (1 usage found)
                        64 @Test
                    removedTest()  (1 usage found)
                        80 @Test
                    replacedTest()  (1 usage found)
                        96 @Test
                    constructor_StringTest()  (1 usage found)
                        109 @Test
                    constructor_String_ObjectTest()  (1 usage found)
                        122 @Test
            com.sun.ts.tests.servlet.api.jakarta_servlet_http.httpsessionbindinglistener  (2 usages found)
                URLClient.java  (2 usages found)
                    unBoundTest()  (1 usage found)
                        68 @Test
                    boundTest()  (1 usage found)
                        84 @Test
            com.sun.ts.tests.servlet.api.jakarta_servlet_http.httpsessionbindinglistener40  (1 usage found)
                URLClient.java  (1 usage found)
                    defaultMethodsTest()  (1 usage found)
                        65 @Test
            com.sun.ts.tests.servlet.api.jakarta_servlet_http.httpsessionevent  (2 usages found)
                URLClient.java  (2 usages found)
                    getSessionTest()  (1 usage found)
                        66 @Test
                    constructorTest()  (1 usage found)
                        79 @Test
            com.sun.ts.tests.servlet.api.jakarta_servlet_http.httpsessionidlistener  (1 usage found)
                URLClient.java  (1 usage found)
                    changeSessionIDTest1()  (1 usage found)
                        59 @Test()
            com.sun.ts.tests.servlet.api.jakarta_servlet_http.httpsessionlistener  (2 usages found)
                URLClient.java  (2 usages found)
                    createdTest()  (1 usage found)
                        67 @Test
                    destroyedTest()  (1 usage found)
                        84 @Test
            com.sun.ts.tests.servlet.api.jakarta_servlet_http.httpsessionlistener40  (1 usage found)
                URLClient.java  (1 usage found)
                    defaultMethodsTest()  (1 usage found)
                        65 @Test
            com.sun.ts.tests.servlet.api.jakarta_servlet_http.httpsessionx  (8 usages found)
                URLClient.java  (8 usages found)
                    getMaxInactiveIntervalTest()  (1 usage found)
                        77 @Test
                    expireHttpSessionTest()  (1 usage found)
                        109 @Test
                    expireHttpSessionxTest()  (1 usage found)
                        147 @Test
                    expireHttpSessionxriTest()  (1 usage found)
                        189 @Test
                    expireHttpSessionxri1Test()  (1 usage found)
                        231 @Test
                    expireHttpSessionxrfTest()  (1 usage found)
                        268 @Test
                    invalidateHttpSessionTest()  (1 usage found)
                        299 @Test
                    invalidateHttpSessionxTest()  (1 usage found)
                        326 @Test
            com.sun.ts.tests.servlet.api.jakarta_servlet_http.httpupgradehandler  (1 usage found)
                URLClient.java  (1 usage found)
                    upgradeTest()  (1 usage found)
                        72 @Test
            com.sun.ts.tests.servlet.api.jakarta_servlet_http.part  (7 usages found)
                URLClient.java  (7 usages found)
                    getPartTest()  (1 usage found)
                        76 @Test
                    getPartTest1()  (1 usage found)
                        164 @Test
                    getPartsTest()  (1 usage found)
                        251 @Test
                    getPartsTest1()  (1 usage found)
                        344 @Test
                    getHeaderTest()  (1 usage found)
                        440 @Test
                    getHeadersTest()  (1 usage found)
                        534 @Test
                    getInputStreamTest()  (1 usage found)
                        634 @Test
            com.sun.ts.tests.servlet.api.jakarta_servlet_http.part1  (7 usages found)
                URLClient.java  (7 usages found)
                    getPartTest()  (1 usage found)
                        80 @Test
                    getPartTest1()  (1 usage found)
                        169 @Test
                    getPartsTest()  (1 usage found)
                        256 @Test
                    getPartsTest1()  (1 usage found)
                        351 @Test
                    getHeaderTest()  (1 usage found)
                        450 @Test
                    getHeadersTest()  (1 usage found)
                        546 @Test
                    getInputStreamTest()  (1 usage found)
                        641 @Test
            com.sun.ts.tests.servlet.api.jakarta_servlet_http.readlistener  (1 usage found)
                URLClient.java  (1 usage found)
                    nioInputTest()  (1 usage found)
                        73 @Test
            com.sun.ts.tests.servlet.api.jakarta_servlet_http.readlistener1  (2 usages found)
                URLClient.java  (2 usages found)
                    nioInputTest1()  (1 usage found)
                        72 @Test
                    nioInputTest2()  (1 usage found)
                        143 @Test
            com.sun.ts.tests.servlet.api.jakarta_servlet_http.servletcontext303  (4 usages found)
                URLClient.java  (4 usages found)
                    negativeaddHListenerClassTest()  (1 usage found)
                        60 @Test
                    negativeaddHListenerStringTest()  (1 usage found)
                        75 @Test
                    negativeaddHAListenerClassTest()  (1 usage found)
                        90 @Test
                    negativeaddHAListenerStringTest()  (1 usage found)
                        105 @Test
            com.sun.ts.tests.servlet.api.jakarta_servlet_http.servletcontext304  (1 usage found)
                URLClient.java  (1 usage found)
                    addListenerTest()  (1 usage found)
                        66 @Test
            com.sun.ts.tests.servlet.api.jakarta_servlet_http.servletcontext305  (1 usage found)
                URLClient.java  (1 usage found)
                    addListenerTest()  (1 usage found)
                        67 @Test
            com.sun.ts.tests.servlet.api.jakarta_servlet_http.sessioncookieconfig  (9 usages found)
                URLClient.java  (9 usages found)
                    constructortest1()  (1 usage found)
                        68 @Test
                    setNameTest()  (1 usage found)
                        89 @Test
                    setCommentTest()  (1 usage found)
                        104 @Test
                    setPathTest()  (1 usage found)
                        119 @Test
                    setDomainTest()  (1 usage found)
                        134 @Test
                    setMaxAgeTest()  (1 usage found)
                        149 @Test
                    setHttpOnlyTest()  (1 usage found)
                        164 @Test
                    setSecureTest()  (1 usage found)
                        179 @Test
                    setAttributeTest()  (1 usage found)
                        194 @Test
            com.sun.ts.tests.servlet.api.jakarta_servlet_http.writelistener  (1 usage found)
                URLClient.java  (1 usage found)
                    nioOutputTest()  (1 usage found)
                        67 @Test
            com.sun.ts.tests.servlet.compat.LeadingSlash.WithLeadingSlash  (1 usage found)
                URLClient.java  (1 usage found)
                    WithLeadingSlashTest()  (1 usage found)
                        63 @Test
            com.sun.ts.tests.servlet.compat.LeadingSlash.WithoutLeadingSlash  (1 usage found)
                URLClient.java  (1 usage found)
                    WithoutLeadingSlashTest()  (1 usage found)
                        65 @Test
            com.sun.ts.tests.servlet.pluggability.aordering  (1 usage found)
                URLClient.java  (1 usage found)
                    absoluteOrderingTest()  (1 usage found)
                        69 @Test
            com.sun.ts.tests.servlet.pluggability.aordering1  (1 usage found)
                URLClient.java  (1 usage found)
                    absoluteOrderingTest()  (1 usage found)
                        65 @Test
            com.sun.ts.tests.servlet.pluggability.aordering2  (1 usage found)
                URLClient.java  (1 usage found)
                    absoluteOrderingTest()  (1 usage found)
                        72 @Test
            com.sun.ts.tests.servlet.pluggability.aordering3  (1 usage found)
                URLClient.java  (1 usage found)
                    absoluteOrderingTest()  (1 usage found)
                        72 @Test
            com.sun.ts.tests.servlet.pluggability.aordering4  (1 usage found)
                URLClient.java  (1 usage found)
                    absoluteOrderingTest()  (1 usage found)
                        81 @Test
            com.sun.ts.tests.servlet.pluggability.api.jakarta_servlet.asynccontext  (14 usages found)
                URLClient.java  (14 usages found)
                    dispatchZeroArgTest()  (1 usage found)
                        93 @Test
                    dispatchZeroArgTest1()  (1 usage found)
                        117 @Test
                    dispatchContextPathTest()  (1 usage found)
                        141 @Test
                    getRequestTest()  (1 usage found)
                        161 @Test
                    asyncListenerTest1()  (1 usage found)
                        178 @Test
                    timeOutTest()  (1 usage found)
                        194 @Test
                    timeOutTest1()  (1 usage found)
                        211 @Test
                    timeOutTest2()  (1 usage found)
                        228 @Test
                    timeOutTest4()  (1 usage found)
                        246 @Test
                    originalRequestTest()  (1 usage found)
                        265 @Test
                    originalRequestTest1()  (1 usage found)
                        282 @Test
                    originalRequestTest2()  (1 usage found)
                        299 @Test
                    originalRequestTest3()  (1 usage found)
                        316 @Test
                    originalRequestTest4()  (1 usage found)
                        333 @Test
            com.sun.ts.tests.servlet.pluggability.api.jakarta_servlet.asyncevent  (9 usages found)
                URLClient.java  (9 usages found)
                    constructorTest1()  (1 usage found)
                        65 @Test
                    constructorTest2()  (1 usage found)
                        79 @Test
                    constructorTest3()  (1 usage found)
                        92 @Test
                    constructorTest4()  (1 usage found)
                        106 @Test
                    getSuppliedRequestTest1()  (1 usage found)
                        121 @Test
                    getSuppliedRequestTest2()  (1 usage found)
                        136 @Test
                    getSuppliedResponseTest1()  (1 usage found)
                        151 @Test
                    getSuppliedResponseTest2()  (1 usage found)
                        166 @Test
                    getThrowableTest()  (1 usage found)
                        181 @Test
            com.sun.ts.tests.servlet.pluggability.api.jakarta_servlet.dispatchertype  (4 usages found)
                URLClient.java  (4 usages found)
                    valuesTest()  (1 usage found)
                        71 @Test
                    valueOfTest()  (1 usage found)
                        86 @Test
                    valueOfNullTest()  (1 usage found)
                        101 @Test
                    valueOfInvalidTest()  (1 usage found)
                        116 @Test
            com.sun.ts.tests.servlet.pluggability.api.jakarta_servlet.dofilter  (1 usage found)
                URLClient.java  (1 usage found)
                    wrapResponseTest()  (1 usage found)
                        79 @Test
            com.sun.ts.tests.servlet.pluggability.api.jakarta_servlet.filter  (2 usages found)
                URLClient.java  (2 usages found)
                    doFilterTest()  (1 usage found)
                        68 @Test
                    initFilterConfigTest()  (1 usage found)
                        82 @Test
            com.sun.ts.tests.servlet.pluggability.api.jakarta_servlet.filterchain  (1 usage found)
                URLClient.java  (1 usage found)
                    filterChainTest()  (1 usage found)
                        66 @Test
            com.sun.ts.tests.servlet.pluggability.api.jakarta_servlet.filterconfig  (6 usages found)
                URLClient.java  (6 usages found)
                    GetFilterNameTest()  (1 usage found)
                        78 @Test
                    GetInitParamNamesTest()  (1 usage found)
                        93 @Test
                    GetInitParamNamesNullTest()  (1 usage found)
                        108 @Test
                    GetInitParamTest()  (1 usage found)
                        123 @Test
                    GetInitParamNullTest()  (1 usage found)
                        138 @Test
                    GetServletContextTest()  (1 usage found)
                        153 @Test
            com.sun.ts.tests.servlet.pluggability.api.jakarta_servlet.filterrequestdispatcher  (8 usages found)
                URLClient.java  (8 usages found)
                    RequestTest()  (1 usage found)
                        87 @Test
                    RequestTest1()  (1 usage found)
                        112 @Test
                    RequestTest2()  (1 usage found)
                        129 @Test
                    ForwardTest()  (1 usage found)
                        150 @Test
                    ForwardTest1()  (1 usage found)
                        168 @Test
                    IncludeTest()  (1 usage found)
                        191 @Test
                    IncludeTest1()  (1 usage found)
                        209 @Test
                    ErrorTest()  (1 usage found)
                        232 @Test
            com.sun.ts.tests.servlet.pluggability.api.jakarta_servlet.genericservlet  (12 usages found)
                URLClient.java  (12 usages found)
                    destroyTest()  (1 usage found)
                        82 @Test
                    getServletConfigTest()  (1 usage found)
                        105 @Test
                    getServletContextTest()  (1 usage found)
                        120 @Test
                    getServletInfoTest()  (1 usage found)
                        135 @Test
                    getInitParameterTest()  (1 usage found)
                        148 @Test
                    getInitParameterNamesTest()  (1 usage found)
                        161 @Test
                    getServletNameTest()  (1 usage found)
                        174 @Test
                    initServletExceptionTest()  (1 usage found)
                        187 @Test
                    initTest()  (1 usage found)
                        207 @Test
                    init_ServletConfigServletExceptionTest()  (1 usage found)
                        223 @Test
                    init_ServletConfigTest()  (1 usage found)
                        243 @Test
                    serviceTest()  (1 usage found)
                        259 @Test
            com.sun.ts.tests.servlet.pluggability.api.jakarta_servlet.registration  (10 usages found)
                URLClient.java  (10 usages found)
                    servletURLMappingTest()  (1 usage found)
                        86 @Test
                    filterServletMappingTest()  (1 usage found)
                        112 @Test
                    servletRegistrationsTest()  (1 usage found)
                        138 @Test
                    getServletRegistrationTest()  (1 usage found)
                        163 @Test
                    getFilterRegistrationsTest()  (1 usage found)
                        189 @Test
                    getFilterRegistrationTest()  (1 usage found)
                        214 @Test
                    getRegistrationNameTest()  (1 usage found)
                        244 @Test
                    getRegistrationClassNameTest()  (1 usage found)
                        275 @Test
                    getRegistrationInitParameterTest()  (1 usage found)
                        313 @Test
                    getRegistrationInitParametersTest()  (1 usage found)
                        347 @Test
            com.sun.ts.tests.servlet.pluggability.api.jakarta_servlet.requestdispatcher  (6 usages found)
                URLClient.java  (6 usages found)
                    forwardTest()  (1 usage found)
                        76 @Test
                    forward_1Test()  (1 usage found)
                        92 @Test
                    includeTest()  (1 usage found)
                        106 @Test
                    include_1Test()  (1 usage found)
                        123 @Test
                    include_2Test()  (1 usage found)
                        141 @Test
                    include_3Test()  (1 usage found)
                        158 @Test
            com.sun.ts.tests.servlet.pluggability.api.jakarta_servlet.scattributeevent  (4 usages found)
                URLClient.java  (4 usages found)
                    constructorTest()  (1 usage found)
                        72 @Test
                    addedTest()  (1 usage found)
                        88 @Test
                    removedTest()  (1 usage found)
                        104 @Test
                    replacedTest()  (1 usage found)
                        120 @Test
            com.sun.ts.tests.servlet.pluggability.api.jakarta_servlet.scattributelistener  (3 usages found)
                URLClient.java  (3 usages found)
                    addedTest()  (1 usage found)
                        74 @Test
                    removedTest()  (1 usage found)
                        89 @Test
                    replacedTest()  (1 usage found)
                        104 @Test
            com.sun.ts.tests.servlet.pluggability.api.jakarta_servlet.scevent  (2 usages found)
                URLClient.java  (2 usages found)
                    constructorTest()  (1 usage found)
                        70 @Test
                    getServletContextTest()  (1 usage found)
                        85 @Test
            com.sun.ts.tests.servlet.pluggability.api.jakarta_servlet.sclistener  (1 usage found)
                URLClient.java  (1 usage found)
                    contextInitializedTest()  (1 usage found)
                        72 @Test
            com.sun.ts.tests.servlet.pluggability.api.jakarta_servlet.servlet  (7 usages found)
                URLClient.java  (7 usages found)
                    DoDestroyedTest()  (1 usage found)
                        73 @Test
                    DoInit1Test()  (1 usage found)
                        88 @Test
                    DoInit2Test()  (1 usage found)
                        106 @Test
                    DoServletConfigTest()  (1 usage found)
                        120 @Test
                    DoServletInfoTest()  (1 usage found)
                        133 @Test
                    PUTest()  (1 usage found)
                        147 @Test
                    DoServiceTest()  (1 usage found)
                        163 @Test
            com.sun.ts.tests.servlet.pluggability.api.jakarta_servlet.servletconfig  (5 usages found)
                URLClient.java  (5 usages found)
                    getServletConfigInitParameterNamesTest()  (1 usage found)
                        71 @Test
                    getServletConfigInitParameterTest()  (1 usage found)
                        85 @Test
                    getServletConfigInitParameterTestNull()  (1 usage found)
                        100 @Test
                    getServletContextTest()  (1 usage found)
                        114 @Test
                    getServletNameTest()  (1 usage found)
                        127 @Test
            com.sun.ts.tests.servlet.pluggability.api.jakarta_servlet.servletcontext  (24 usages found)
                URLClient.java  (24 usages found)
                    GetServletTempDirTest()  (1 usage found)
                        71 @Test
                    GetMajorVersionTest()  (1 usage found)
                        86 @Test
                    GetMinorVersionTest()  (1 usage found)
                        101 @Test
                    GetMimeTypeTest()  (1 usage found)
                        116 @Test
                    GetMimeType_1Test()  (1 usage found)
                        131 @Test
                    GetRealPathTest()  (1 usage found)
                        146 @Test
                    GetResourceAsStream_1Test()  (1 usage found)
                        160 @Test
                    GetResource_1Test()  (1 usage found)
                        175 @Test
                    GetResource_2Test()  (1 usage found)
                        190 @Test
                    GetServerInfoTest()  (1 usage found)
                        205 @Test
                    ServletContextGetAttributeTest()  (1 usage found)
                        219 @Test
                    ServletContextGetAttribute_1Test()  (1 usage found)
                        234 @Test
                    ServletContextGetContextTest()  (1 usage found)
                        248 @Test
                    ServletContextGetInitParameterNamesTest()  (1 usage found)
                        263 @Test
                    ServletContextGetInitParameterTest()  (1 usage found)
                        278 @Test
                    ServletContextGetInitParameterTestNull()  (1 usage found)
                        293 @Test
                    ServletContextRemoveAttributeTest()  (1 usage found)
                        307 @Test
                    ServletContextSetAttributeTest()  (1 usage found)
                        321 @Test
                    ServletContextSetAttribute_1Test()  (1 usage found)
                        337 @Test
                    ServletContextSetAttribute_2Test()  (1 usage found)
                        352 @Test
                    ServletContextGetAttributeNamesTest()  (1 usage found)
                        366 @Test
                    ServletContextGetRequestDispatcherTest()  (1 usage found)
                        381 @Test
                    GetNamedDispatcherTest()  (1 usage found)
                        397 @Test
                    GetNamedDispatcher_1Test()  (1 usage found)
                        412 @Test
            com.sun.ts.tests.servlet.pluggability.api.jakarta_servlet.servletcontext30  (16 usages found)
                URLClient.java  (16 usages found)
                    getContextPathTest()  (1 usage found)
                        132 @Test
                    testAddServletString()  (1 usage found)
                        160 @Test
                    testAddFilterString()  (1 usage found)
                        192 @Test
                    testAddServletClass()  (1 usage found)
                        221 @Test
                    testAddFilterClass()  (1 usage found)
                        253 @Test
                    testAddServlet()  (1 usage found)
                        286 @Test
                    testAddFilterForward()  (1 usage found)
                        320 @Test
                    testAddFilterInclude()  (1 usage found)
                        353 @Test
                    testAddServletNotFound()  (1 usage found)
                        383 @Test
                    testCreateSRAListener()  (1 usage found)
                        417 @Test
                    negativeCreateTests()  (1 usage found)
                        450 @Test
                    getEffectiveMajorVersionTest()  (1 usage found)
                        467 @Test
                    getEffectiveMinorVersionTest()  (1 usage found)
                        482 @Test
                    getDefaultSessionTrackingModes()  (1 usage found)
                        497 @Test
                    sessionTrackingModesValueOfTest()  (1 usage found)
                        511 @Test
                    sessionTrackingModesValuesTest()  (1 usage found)
                        525 @Test
            com.sun.ts.tests.servlet.pluggability.api.jakarta_servlet.servletexception  (5 usages found)
                URLClient.java  (5 usages found)
                    getRootCauseTest()  (1 usage found)
                        72 @Test
                    servletExceptionConstructor1Test()  (1 usage found)
                        85 @Test
                    servletExceptionConstructor2Test()  (1 usage found)
                        98 @Test
                    servletExceptionConstructor3Test()  (1 usage found)
                        112 @Test
                    servletExceptionConstructor4Test()  (1 usage found)
                        128 @Test
            com.sun.ts.tests.servlet.pluggability.api.jakarta_servlet.servletinputstream  (1 usage found)
                URLClient.java  (1 usage found)
                    readLineTest()  (1 usage found)
                        73 @Test
            com.sun.ts.tests.servlet.pluggability.api.jakarta_servlet.servletoutputstream  (15 usages found)
                URLClient.java  (15 usages found)
                    print_StringTest()  (1 usage found)
                        69 @Test
                    print_booleanTest()  (1 usage found)
                        84 @Test
                    print_charTest()  (1 usage found)
                        104 @Test
                    print_doubleTest()  (1 usage found)
                        119 @Test
                    print_floatTest()  (1 usage found)
                        134 @Test
                    print_intTest()  (1 usage found)
                        149 @Test
                    print_longTest()  (1 usage found)
                        164 @Test
                    printlnTest()  (1 usage found)
                        180 @Test
                    println_StringTest()  (1 usage found)
                        196 @Test
                    println_booleanTest()  (1 usage found)
                        212 @Test
                    println_charTest()  (1 usage found)
                        233 @Test
                    println_doubleTest()  (1 usage found)
                        249 @Test
                    println_floatTest()  (1 usage found)
                        265 @Test
                    println_intTest()  (1 usage found)
                        281 @Test
                    println_longTest()  (1 usage found)
                        297 @Test
            com.sun.ts.tests.servlet.pluggability.api.jakarta_servlet.servletrequest  (39 usages found)
                URLClient.java  (39 usages found)
                    getAttributeDoesNotExistTest()  (1 usage found)
                        353 @Test()
                    getAttributeNamesEmptyEnumTest()  (1 usage found)
                        358 @Test()
                    getAttributeNamesTest()  (1 usage found)
                        363 @Test()
                    getAttributeTest()  (1 usage found)
                        368 @Test()
                    getCharacterEncodingNullTest()  (1 usage found)
                        373 @Test()
                    getCharacterEncodingTest()  (1 usage found)
                        378 @Test()
                    getContentLengthTest()  (1 usage found)
                        383 @Test()
                    getContentTypeNullTest()  (1 usage found)
                        388 @Test()
                    getContentTypeTest()  (1 usage found)
                        393 @Test()
                    getInputStreamIllegalStateExceptionTest()  (1 usage found)
                        398 @Test()
                    getInputStreamTest()  (1 usage found)
                        403 @Test()
                    getLocalAddrTest()  (1 usage found)
                        408 @Test()
                    getLocaleDefaultTest()  (1 usage found)
                        413 @Test()
                    getLocaleTest()  (1 usage found)
                        418 @Test()
                    getLocalesDefaultTest()  (1 usage found)
                        423 @Test()
                    getLocalesTest()  (1 usage found)
                        428 @Test()
                    getParameterDoesNotExistTest()  (1 usage found)
                        433 @Test()
                    getParameterMapTest()  (1 usage found)
                        438 @Test()
                    getParameterNamesEmptyEnumTest()  (1 usage found)
                        443 @Test()
                    getParameterNamesTest()  (1 usage found)
                        448 @Test()
                    getParameterTest()  (1 usage found)
                        453 @Test()
                    getParameterValuesDoesNotExistTest()  (1 usage found)
                        458 @Test()
                    getParameterValuesTest()  (1 usage found)
                        463 @Test()
                    getProtocolTest()  (1 usage found)
                        468 @Test()
                    getReaderIllegalStateExceptionTest()  (1 usage found)
                        473 @Test()
                    getReaderTest()  (1 usage found)
                        478 @Test()
                    getReaderUnsupportedEncodingExceptionTest()  (1 usage found)
                        483 @Test()
                    getRemoteAddrTest()  (1 usage found)
                        488 @Test()
                    getRemoteHostTest()  (1 usage found)
                        493 @Test()
                    getRequestDispatcherTest()  (1 usage found)
                        498 @Test()
                    getSchemeTest()  (1 usage found)
                        503 @Test()
                    getServerNameTest()  (1 usage found)
                        508 @Test()
                    getServerPortTest()  (1 usage found)
                        513 @Test()
                    isSecureTest()  (1 usage found)
                        518 @Test()
                    removeAttributeTest()  (1 usage found)
                        523 @Test()
                    setAttributeTest()  (1 usage found)
                        528 @Test()
                    setCharacterEncodingTest()  (1 usage found)
                        533 @Test()
                    setCharacterEncodingTest1()  (1 usage found)
                        538 @Test()
                    setCharacterEncodingUnsupportedEncodingExceptionTest()  (1 usage found)
                        543 @Test()
            com.sun.ts.tests.servlet.pluggability.api.jakarta_servlet.servletrequest1  (2 usages found)
                URLClient.java  (2 usages found)
                    getLocalNameTest()  (1 usage found)
                        66 @Test()
                    getLocalPortTest()  (1 usage found)
                        71 @Test()
            com.sun.ts.tests.servlet.pluggability.api.jakarta_servlet.servletrequest30  (15 usages found)
                URLClient.java  (15 usages found)
                    getServletContextTest()  (1 usage found)
                        74 @Test
                    getDispatcherTypeTestRequest()  (1 usage found)
                        92 @Test
                    getDispatcherTypeTestForward()  (1 usage found)
                        109 @Test
                    getDispatcherTypeTestInclude()  (1 usage found)
                        126 @Test
                    getDispatcherTypeTestError()  (1 usage found)
                        143 @Test
                    getDispatcherTypeTestAsync()  (1 usage found)
                        164 @Test
                    asyncStartedTest1()  (1 usage found)
                        182 @Test
                    asyncStartedTest2()  (1 usage found)
                        200 @Test
                    asyncStartedTest3()  (1 usage found)
                        220 @Test
                    asyncStartedTest4()  (1 usage found)
                        238 @Test
                    isAsyncSupportedTest1()  (1 usage found)
                        255 @Test
                    isAsyncSupportedTest2()  (1 usage found)
                        272 @Test
                    startAsyncTest1()  (1 usage found)
                        289 @Test
                    startAsyncTest2()  (1 usage found)
                        307 @Test
                    getAsyncContextTest()  (1 usage found)
                        325 @Test
            com.sun.ts.tests.servlet.pluggability.api.jakarta_servlet.servletrequestwrapper  (32 usages found)
                URLClient.java  (32 usages found)
                    requestWrapperConstructorTest()  (1 usage found)
                        65 @Test
                    requestWrapperGetRequestTest()  (1 usage found)
                        78 @Test
                    requestWrapperSetRequestTest()  (1 usage found)
                        91 @Test
                    requestWrapperSetRequestIllegalArgumentExceptionTest()  (1 usage found)
                        104 @Test
                    getAttributeNamesTest()  (1 usage found)
                        340 @Test()
                    getAttributeTest()  (1 usage found)
                        345 @Test()
                    getCharacterEncodingTest()  (1 usage found)
                        350 @Test()
                    getContentLengthTest()  (1 usage found)
                        355 @Test()
                    getContentTypeTest()  (1 usage found)
                        360 @Test()
                    getInputStreamTest()  (1 usage found)
                        365 @Test()
                    getLocalNameTest()  (1 usage found)
                        370 @Test()
                    getLocalPortTest()  (1 usage found)
                        375 @Test()
                    getLocaleTest()  (1 usage found)
                        380 @Test()
                    getLocalesTest()  (1 usage found)
                        385 @Test()
                    getParameterMapTest()  (1 usage found)
                        390 @Test()
                    getParameterNamesTest()  (1 usage found)
                        395 @Test()
                    getParameterTest()  (1 usage found)
                        400 @Test()
                    getParameterValuesTest()  (1 usage found)
                        405 @Test()
                    getProtocolTest()  (1 usage found)
                        410 @Test()
                    getReaderTest()  (1 usage found)
                        415 @Test()
                    getRemoteAddrTest()  (1 usage found)
                        420 @Test()
                    getRemoteHostTest()  (1 usage found)
                        425 @Test()
                    getRequestDispatcherTest()  (1 usage found)
                        430 @Test()
                    getSchemeTest()  (1 usage found)
                        435 @Test()
                    getServerNameTest()  (1 usage found)
                        440 @Test()
                    getServerPortTest()  (1 usage found)
                        445 @Test()
                    isSecureTest()  (1 usage found)
                        450 @Test()
                    removeAttributeTest()  (1 usage found)
                        455 @Test()
                    setAttributeTest()  (1 usage found)
                        460 @Test()
                    setCharacterEncodingTest()  (1 usage found)
                        465 @Test()
                    setCharacterEncodingTest1()  (1 usage found)
                        470 @Test()
                    setCharacterEncodingUnsupportedEncodingExceptionTest()  (1 usage found)
                        475 @Test()
            com.sun.ts.tests.servlet.pluggability.api.jakarta_servlet.servletrequestwrapper30  (15 usages found)
                URLClient.java  (15 usages found)
                    getServletContextTest()  (1 usage found)
                        75 @Test
                    getDispatcherTypeTestRequest()  (1 usage found)
                        95 @Test
                    getDispatcherTypeTestForward()  (1 usage found)
                        113 @Test
                    getDispatcherTypeTestInclude()  (1 usage found)
                        131 @Test
                    getDispatcherTypeTestError()  (1 usage found)
                        150 @Test
                    getDispatcherTypeTestAsync()  (1 usage found)
                        173 @Test
                    asyncStartedTest1()  (1 usage found)
                        192 @Test
                    asyncStartedTest2()  (1 usage found)
                        211 @Test
                    asyncStartedTest3()  (1 usage found)
                        232 @Test
                    asyncStartedTest4()  (1 usage found)
                        253 @Test
                    isAsyncSupportedTest1()  (1 usage found)
                        271 @Test
                    isAsyncSupportedTest2()  (1 usage found)
                        289 @Test
                    startAsyncTest1()  (1 usage found)
                        307 @Test
                    startAsyncTest2()  (1 usage found)
                        327 @Test
                    getAsyncContextTest()  (1 usage found)
                        347 @Test
            com.sun.ts.tests.servlet.pluggability.api.jakarta_servlet.servletrequestwrapper30x  (1 usage found)
                URLClient.java  (1 usage found)
                    isWrapperForTest()  (1 usage found)
                        69 @Test
            com.sun.ts.tests.servlet.pluggability.api.jakarta_servlet.servletresponse  (32 usages found)
                URLClient.java  (32 usages found)
                    flushBufferTest()  (1 usage found)
                        308 @Test()
                    getBufferSizeTest()  (1 usage found)
                        313 @Test()
                    getCharacterEncodingDefaultTest()  (1 usage found)
                        318 @Test()
                    getCharacterEncodingTest()  (1 usage found)
                        323 @Test()
                    getContentType1Test()  (1 usage found)
                        328 @Test()
                    getContentTypeNull1Test()  (1 usage found)
                        333 @Test()
                    getContentTypeNull2Test()  (1 usage found)
                        338 @Test()
                    getContentTypeNullTest()  (1 usage found)
                        343 @Test()
                    getContentTypeTest()  (1 usage found)
                        348 @Test()
                    getLocaleDefaultTest()  (1 usage found)
                        353 @Test()
                    getLocaleTest()  (1 usage found)
                        358 @Test()
                    getOutputStreamFlushTest()  (1 usage found)
                        363 @Test()
                    getOutputStreamIllegalStateExceptionTest()  (1 usage found)
                        368 @Test()
                    getOutputStreamTest()  (1 usage found)
                        373 @Test()
                    getWriterAfterTest()  (1 usage found)
                        378 @Test()
                    getWriterFlushTest()  (1 usage found)
                        383 @Test()
                    getWriterIllegalStateExceptionTest()  (1 usage found)
                        388 @Test()
                    getWriterTest()  (1 usage found)
                        393 @Test()
                    isCommittedTest()  (1 usage found)
                        398 @Test()
                    resetBufferTest()  (1 usage found)
                        403 @Test()
                    resetIllegalStateExceptionTest()  (1 usage found)
                        408 @Test()
                    resetTest()  (1 usage found)
                        413 @Test()
                    resetTest1()  (1 usage found)
                        418 @Test()
                    setBufferSizeIllegalStateExceptionTest()  (1 usage found)
                        423 @Test()
                    setBufferSizeTest()  (1 usage found)
                        428 @Test()
                    setCharacterEncodingTest()  (1 usage found)
                        433 @Test()
                    setContentLengthTest()  (1 usage found)
                        438 @Test()
                    setContentType1Test()  (1 usage found)
                        443 @Test()
                    setContentType2Test()  (1 usage found)
                        448 @Test()
                    setContentTypeTest()  (1 usage found)
                        453 @Test()
                    setLocale1Test()  (1 usage found)
                        458 @Test()
                    setLocaleTest()  (1 usage found)
                        463 @Test()
            com.sun.ts.tests.servlet.pluggability.api.jakarta_servlet.servletresponsewrapper  (20 usages found)
                URLClient.java  (20 usages found)
                    responseWrapperConstructorTest()  (1 usage found)
                        62 @Test
                    responseWrapperGetResponseTest()  (1 usage found)
                        75 @Test
                    responseWrapperSetResponseTest()  (1 usage found)
                        88 @Test
                    responseWrapperSetResponseIllegalArgumentExceptionTest()  (1 usage found)
                        101 @Test
                    flushBufferTest()  (1 usage found)
                        235 @Test()
                    getBufferSizeTest()  (1 usage found)
                        240 @Test()
                    getCharacterEncodingTest()  (1 usage found)
                        245 @Test()
                    getContentTypeTest()  (1 usage found)
                        250 @Test()
                    getLocaleTest()  (1 usage found)
                        255 @Test()
                    getOutputStreamTest()  (1 usage found)
                        260 @Test()
                    getWriterTest()  (1 usage found)
                        265 @Test()
                    isCommittedTest()  (1 usage found)
                        270 @Test()
                    resetBufferTest()  (1 usage found)
                        275 @Test()
                    resetTest()  (1 usage found)
                        280 @Test()
                    resetTest1()  (1 usage found)
                        285 @Test()
                    setBufferSizeTest()  (1 usage found)
                        290 @Test()
                    setCharacterEncodingTest()  (1 usage found)
                        295 @Test()
                    setContentLengthTest()  (1 usage found)
                        300 @Test()
                    setContentTypeTest()  (1 usage found)
                        305 @Test()
                    setLocaleTest()  (1 usage found)
                        310 @Test()
            com.sun.ts.tests.servlet.pluggability.api.jakarta_servlet.servletresponsewrapper30  (1 usage found)
                URLClient.java  (1 usage found)
                    isWrapperForTest()  (1 usage found)
                        68 @Test
            com.sun.ts.tests.servlet.pluggability.api.jakarta_servlet.sessiontrackingmode  (1 usage found)
                URLClient.java  (1 usage found)
                    setSessionTrackingModes()  (1 usage found)
                        71 @Test
            com.sun.ts.tests.servlet.pluggability.api.jakarta_servlet.srattributeevent  (4 usages found)
                URLClient.java  (4 usages found)
                    constructorTest()  (1 usage found)
                        72 @Test
                    addedTest()  (1 usage found)
                        89 @Test
                    removedTest()  (1 usage found)
                        106 @Test
                    replacedTest()  (1 usage found)
                        123 @Test
            com.sun.ts.tests.servlet.pluggability.api.jakarta_servlet.srattributelistener  (3 usages found)
                URLClient.java  (3 usages found)
                    addedTest()  (1 usage found)
                        75 @Test
                    removedTest()  (1 usage found)
                        90 @Test
                    replacedTest()  (1 usage found)
                        105 @Test
            com.sun.ts.tests.servlet.pluggability.api.jakarta_servlet.srevent  (3 usages found)
                URLClient.java  (3 usages found)
                    constructorTest()  (1 usage found)
                        71 @Test
                    getServletContextTest()  (1 usage found)
                        85 @Test
                    getServletRequestTest()  (1 usage found)
                        99 @Test
            com.sun.ts.tests.servlet.pluggability.api.jakarta_servlet.srlistener  (1 usage found)
                URLClient.java  (1 usage found)
                    initializeDestroyTest()  (1 usage found)
                        73 @Test
            com.sun.ts.tests.servlet.pluggability.api.jakarta_servlet.unavailableexception  (5 usages found)
                URLClient.java  (5 usages found)
                    getUnavailableSecondsTest()  (1 usage found)
                        72 @Test
                    isPermanentTest()  (1 usage found)
                        86 @Test
                    unavailableTest()  (1 usage found)
                        102 @Test
                    unavailableException_Constructor1Test()  (1 usage found)
                        121 @Test
                    unavailableException_Constructor2Test()  (1 usage found)
                        136 @Test
            com.sun.ts.tests.servlet.pluggability.api.jakarta_servlet_http.cookie  (21 usages found)
                URLClient.java  (21 usages found)
                    cloneTest()  (1 usage found)
                        107 @Test
                    constructorTest()  (1 usage found)
                        122 @Test
                    constructorIllegalArgumentExceptionTest()  (1 usage found)
                        138 @Test
                    getCommentTest()  (1 usage found)
                        155 @Test
                    getCommentNullTest()  (1 usage found)
                        170 @Test
                    getDomainTest()  (1 usage found)
                        186 @Test
                    getMaxAgeTest()  (1 usage found)
                        206 @Test
                    getNameTest()  (1 usage found)
                        222 @Test
                    getPathTest()  (1 usage found)
                        248 @Test
                    getSecureTest()  (1 usage found)
                        266 @Test
                    getValueTest()  (1 usage found)
                        282 @Test
                    getVersionTest()  (1 usage found)
                        307 @Test
                    setDomainTest()  (1 usage found)
                        331 @Test
                    setMaxAgePositiveTest()  (1 usage found)
                        347 @Test
                    setMaxAgeZeroTest()  (1 usage found)
                        424 @Test
                    setMaxAgeNegativeTest()  (1 usage found)
                        441 @Test
                    setSecureTest()  (1 usage found)
                        459 @Test
                    setValueTest()  (1 usage found)
                        477 @Test
                    setVersionTest()  (1 usage found)
                        495 @Test
                    setAttributeTest()  (1 usage found)
                        512 @Test
                    getAttributesTest()  (1 usage found)
                        525 @Test
            com.sun.ts.tests.servlet.pluggability.api.jakarta_servlet_http.httpservlet  (11 usages found)
                URLClient.java  (11 usages found)
                    destroyTest()  (1 usage found)
                        78 @Test
                    getServletConfigTest()  (1 usage found)
                        101 @Test
                    getServletContextTest()  (1 usage found)
                        116 @Test
                    getServletInfoTest()  (1 usage found)
                        131 @Test
                    getInitParameterTest()  (1 usage found)
                        144 @Test
                    getInitParameterTestNull()  (1 usage found)
                        157 @Test
                    getInitParameterNamesTest()  (1 usage found)
                        170 @Test
                    getServletNameTest()  (1 usage found)
                        183 @Test
                    serviceTest()  (1 usage found)
                        196 @Test
                    initTest()  (1 usage found)
                        213 @Test
                    init_ServletConfigTest()  (1 usage found)
                        230 @Test
            com.sun.ts.tests.servlet.pluggability.api.jakarta_servlet_http.httpservletrequest  (70 usages found)
                URLClient.java  (70 usages found)
                    getAttributeNamesTest()  (1 usage found)
                        69 @Test
                    getAttributeTest()  (1 usage found)
                        85 @Test
                    getCharacterEncodingTest()  (1 usage found)
                        100 @Test
                    getLocaleTest()  (1 usage found)
                        149 @Test
                    getLocalesTest()  (1 usage found)
                        165 @Test
                    getParameterNamesTest()  (1 usage found)
                        189 @Test
                    getParameterTest()  (1 usage found)
                        210 @Test
                    getParameterValuesTest()  (1 usage found)
                        228 @Test
                    getServletContextTest()  (1 usage found)
                        658 @Test
                    getAuthTypeWithoutProtectionTest()  (1 usage found)
                        667 @Test()
                    getContentLengthTest()  (1 usage found)
                        672 @Test()
                    getContentTypeTest()  (1 usage found)
                        677 @Test()
                    getContextPathTest()  (1 usage found)
                        682 @Test()
                    getCookiesNoCookiesTest()  (1 usage found)
                        687 @Test()
                    getCookiesTest()  (1 usage found)
                        692 @Test()
                    getDateHeaderIllegalArgumentExceptionTest()  (1 usage found)
                        697 @Test()
                    getDateHeaderNoHeaderTest()  (1 usage found)
                        702 @Test()
                    getDateHeaderTest()  (1 usage found)
                        707 @Test()
                    getHeaderNamesTest()  (1 usage found)
                        712 @Test()
                    getHeaderNoHeaderTest()  (1 usage found)
                        717 @Test()
                    getHeaderTest()  (1 usage found)
                        722 @Test()
                    getHeadersNoHeadersTest()  (1 usage found)
                        727 @Test()
                    getHeadersTest()  (1 usage found)
                        732 @Test()
                    getInputStreamIllegalStateExceptionTest()  (1 usage found)
                        737 @Test()
                    getInputStreamTest()  (1 usage found)
                        742 @Test()
                    getIntHeaderNoHeaderTest()  (1 usage found)
                        747 @Test()
                    getIntHeaderNumberFoundExceptionTest()  (1 usage found)
                        752 @Test()
                    getIntHeaderTest()  (1 usage found)
                        757 @Test()
                    getLocalAddrTest()  (1 usage found)
                        762 @Test()
                    getLocalNameTest()  (1 usage found)
                        767 @Test()
                    getLocalPortTest()  (1 usage found)
                        772 @Test()
                    getMethodTest()  (1 usage found)
                        777 @Test()
                    getParameterMapTest()  (1 usage found)
                        782 @Test()
                    getPathInfoNullTest()  (1 usage found)
                        787 @Test()
                    getPathInfoTest()  (1 usage found)
                        792 @Test()
                    getPathTranslatedNullTest()  (1 usage found)
                        797 @Test()
                    getPathTranslatedTest()  (1 usage found)
                        802 @Test()
                    getProtocolTest()  (1 usage found)
                        807 @Test()
                    getQueryStringNullTest()  (1 usage found)
                        812 @Test()
                    getQueryStringTest()  (1 usage found)
                        817 @Test()
                    getReaderIllegalStateExceptionTest()  (1 usage found)
                        822 @Test()
                    getReaderTest()  (1 usage found)
                        827 @Test()
                    getReaderUnsupportedEncodingExceptionTest()  (1 usage found)
                        832 @Test()
                    getRemoteAddrTest()  (1 usage found)
                        837 @Test()
                    getRemoteHostTest()  (1 usage found)
                        842 @Test()
                    getRemoteUserTest()  (1 usage found)
                        847 @Test()
                    getRequestDispatcherTest()  (1 usage found)
                        852 @Test()
                    getRequestURITest()  (1 usage found)
                        857 @Test()
                    getRequestURLTest()  (1 usage found)
                        862 @Test()
                    getRequestedSessionIdNullTest()  (1 usage found)
                        867 @Test()
                    getRequestedSessionIdTest1()  (1 usage found)
                        872 @Test()
                    getRequestedSessionIdTest2()  (1 usage found)
                        877 @Test()
                    getSchemeTest()  (1 usage found)
                        882 @Test()
                    getServerNameTest()  (1 usage found)
                        887 @Test()
                    getServerPortTest()  (1 usage found)
                        892 @Test()
                    getServletPathEmptyStringTest()  (1 usage found)
                        897 @Test()
                    getServletPathTest()  (1 usage found)
                        902 @Test()
                    getSessionFalseTest()  (1 usage found)
                        907 @Test()
                    getSessionTest()  (1 usage found)
                        912 @Test()
                    getSessionTrueTest()  (1 usage found)
                        917 @Test()
                    isRequestedSessionIdFromCookieTest()  (1 usage found)
                        922 @Test()
                    isRequestedSessionIdFromURLTest()  (1 usage found)
                        927 @Test()
                    isRequestedSessionIdValidTest()  (1 usage found)
                        932 @Test()
                    isSecureTest()  (1 usage found)
                        937 @Test()
                    removeAttributeTest()  (1 usage found)
                        942 @Test()
                    sessionTimeoutTest()  (1 usage found)
                        947 @Test()
                    setAttributeTest()  (1 usage found)
                        952 @Test()
                    setCharacterEncodingTest()  (1 usage found)
                        957 @Test()
                    setCharacterEncodingTest1()  (1 usage found)
                        962 @Test()
                    setCharacterEncodingUnsupportedEncodingExceptionTest()  (1 usage found)
                        967 @Test()
            com.sun.ts.tests.servlet.pluggability.api.jakarta_servlet_http.httpservletrequest30  (1 usage found)
                URLClient.java  (1 usage found)
                    loginTest()  (1 usage found)
                        74 @Test
            com.sun.ts.tests.servlet.pluggability.api.jakarta_servlet_http.httpservletrequestwrapper  (58 usages found)
                URLClient.java  (58 usages found)
                    httpRequestWrapperConstructorTest()  (1 usage found)
                        285 @Test
                    httpRequestWrapperConstructorIllegalArgumentExceptionTest()  (1 usage found)
                        299 @Test
                    httpRequestWrapperGetRequestTest()  (1 usage found)
                        514 @Test
                    httpRequestWrapperSetRequestTest()  (1 usage found)
                        527 @Test
                    httpRequestWrapperSetRequestIllegalArgumentExceptionTest()  (1 usage found)
                        540 @Test
                    getAttributeNamesTest()  (1 usage found)
                        548 @Test()
                    getAttributeTest()  (1 usage found)
                        553 @Test()
                    getAuthTypeWithoutProtectionTest()  (1 usage found)
                        558 @Test()
                    getCharacterEncodingTest()  (1 usage found)
                        563 @Test()
                    getContentLengthTest()  (1 usage found)
                        568 @Test()
                    getContentTypeTest()  (1 usage found)
                        573 @Test()
                    getContextPathTest()  (1 usage found)
                        578 @Test()
                    getCookiesTest()  (1 usage found)
                        583 @Test()
                    getDateHeaderTest()  (1 usage found)
                        588 @Test()
                    getHeaderNamesTest()  (1 usage found)
                        593 @Test()
                    getHeaderTest()  (1 usage found)
                        598 @Test()
                    getHeadersTest()  (1 usage found)
                        603 @Test()
                    getInputStreamTest()  (1 usage found)
                        608 @Test()
                    getIntHeaderTest()  (1 usage found)
                        613 @Test()
                    getLocalNameTest()  (1 usage found)
                        618 @Test()
                    getLocalPortTest()  (1 usage found)
                        623 @Test()
                    getLocaleTest()  (1 usage found)
                        628 @Test()
                    getLocalesTest()  (1 usage found)
                        633 @Test()
                    getMethodTest()  (1 usage found)
                        638 @Test()
                    getParameterMapTest()  (1 usage found)
                        643 @Test()
                    getParameterNamesTest()  (1 usage found)
                        648 @Test()
                    getParameterTest()  (1 usage found)
                        653 @Test()
                    getParameterValuesTest()  (1 usage found)
                        658 @Test()
                    getPathInfoTest()  (1 usage found)
                        663 @Test()
                    getPathTranslatedTest()  (1 usage found)
                        668 @Test()
                    getProtocolTest()  (1 usage found)
                        673 @Test()
                    getQueryStringTest()  (1 usage found)
                        678 @Test()
                    getReaderTest()  (1 usage found)
                        683 @Test()
                    getRemoteAddrTest()  (1 usage found)
                        688 @Test()
                    getRemoteHostTest()  (1 usage found)
                        693 @Test()
                    getRemoteUserTest()  (1 usage found)
                        698 @Test()
                    getRequestDispatcherTest()  (1 usage found)
                        703 @Test()
                    getRequestURITest()  (1 usage found)
                        708 @Test()
                    getRequestURLTest()  (1 usage found)
                        713 @Test()
                    getRequestedSessionIdNullTest()  (1 usage found)
                        718 @Test()
                    getRequestedSessionIdTest1()  (1 usage found)
                        723 @Test()
                    getRequestedSessionIdTest2()  (1 usage found)
                        728 @Test()
                    getSchemeTest()  (1 usage found)
                        733 @Test()
                    getServerNameTest()  (1 usage found)
                        738 @Test()
                    getServerPortTest()  (1 usage found)
                        743 @Test()
                    getServletPathTest()  (1 usage found)
                        748 @Test()
                    getSessionTest()  (1 usage found)
                        753 @Test()
                    getSessionTrueTest()  (1 usage found)
                        758 @Test()
                    isRequestedSessionIdFromCookieTest()  (1 usage found)
                        763 @Test()
                    isRequestedSessionIdFromCookieTest1()  (1 usage found)
                        768 @Test()
                    isRequestedSessionIdFromURLTest()  (1 usage found)
                        773 @Test()
                    isRequestedSessionIdValidTest()  (1 usage found)
                        778 @Test()
                    isSecureTest()  (1 usage found)
                        783 @Test()
                    removeAttributeTest()  (1 usage found)
                        788 @Test()
                    setAttributeTest()  (1 usage found)
                        793 @Test()
                    setCharacterEncodingTest()  (1 usage found)
                        798 @Test()
                    setCharacterEncodingTest1()  (1 usage found)
                        803 @Test()
                    setCharacterEncodingUnsupportedEncodingExceptionTest()  (1 usage found)
                        808 @Test()
            com.sun.ts.tests.servlet.pluggability.api.jakarta_servlet_http.httpservletresponse  (44 usages found)
                URLClient.java  (44 usages found)
                    getContentTypeTest()  (1 usage found)
                        212 @Test
                    addCookieTest()  (1 usage found)
                        413 @Test()
                    addDateHeaderTest()  (1 usage found)
                        418 @Test()
                    addHeaderTest()  (1 usage found)
                        423 @Test()
                    addIntHeaderTest()  (1 usage found)
                        428 @Test()
                    containsHeaderTest()  (1 usage found)
                        433 @Test()
                    flushBufferTest()  (1 usage found)
                        438 @Test()
                    getBufferSizeTest()  (1 usage found)
                        443 @Test()
                    getCharacterEncodingDefaultTest()  (1 usage found)
                        448 @Test()
                    getCharacterEncodingTest()  (1 usage found)
                        453 @Test()
                    getLocaleDefaultTest()  (1 usage found)
                        458 @Test()
                    getLocaleTest()  (1 usage found)
                        463 @Test()
                    getOutputStreamIllegalStateExceptionTest()  (1 usage found)
                        468 @Test()
                    getOutputStreamTest()  (1 usage found)
                        473 @Test()
                    getWriterIllegalStateExceptionTest()  (1 usage found)
                        478 @Test()
                    getWriterTest()  (1 usage found)
                        483 @Test()
                    isCommittedTest()  (1 usage found)
                        488 @Test()
                    resetBufferTest()  (1 usage found)
                        493 @Test()
                    resetIllegalStateExceptionTest()  (1 usage found)
                        498 @Test()
                    resetTest()  (1 usage found)
                        503 @Test()
                    resetTest1()  (1 usage found)
                        508 @Test()
                    sendErrorClearBufferTest()  (1 usage found)
                        513 @Test()
                    sendErrorIllegalStateExceptionTest()  (1 usage found)
                        518 @Test()
                    sendError_StringErrorPageTest()  (1 usage found)
                        523 @Test()
                    sendError_StringIllegalStateExceptionTest()  (1 usage found)
                        528 @Test()
                    sendError_StringTest()  (1 usage found)
                        533 @Test()
                    sendRedirectIllegalStateExceptionTest()  (1 usage found)
                        538 @Test()
                    sendRedirectWithLeadingSlashTest()  (1 usage found)
                        543 @Test()
                    sendRedirectWithoutLeadingSlashTest()  (1 usage found)
                        548 @Test()
                    setBufferSizeIllegalStateExceptionTest()  (1 usage found)
                        553 @Test()
                    setBufferSizeTest()  (1 usage found)
                        558 @Test()
                    setCharacterEncodingTest()  (1 usage found)
                        563 @Test()
                    setContentLengthTest()  (1 usage found)
                        568 @Test()
                    setContentType1Test()  (1 usage found)
                        573 @Test()
                    setContentType2Test()  (1 usage found)
                        578 @Test()
                    setContentTypeTest()  (1 usage found)
                        583 @Test()
                    setDateHeaderOverrideTest()  (1 usage found)
                        588 @Test()
                    setDateHeaderTest()  (1 usage found)
                        593 @Test()
                    setHeaderOverrideTest()  (1 usage found)
                        598 @Test()
                    setHeaderTest()  (1 usage found)
                        603 @Test()
                    setIntHeaderTest()  (1 usage found)
                        608 @Test()
                    setLocaleTest()  (1 usage found)
                        613 @Test()
                    setMultiHeaderTest()  (1 usage found)
                        618 @Test()
                    setStatusTest()  (1 usage found)
                        623 @Test()
            com.sun.ts.tests.servlet.pluggability.api.jakarta_servlet_http.httpservletresponse30  (4 usages found)
                URLClient.java  (4 usages found)
                    getHeaderNamesTest()  (1 usage found)
                        90 @Test()
                    getHeaderTest()  (1 usage found)
                        95 @Test()
                    getHeadersTest()  (1 usage found)
                        100 @Test()
                    getStatusTest()  (1 usage found)
                        105 @Test()
            com.sun.ts.tests.servlet.pluggability.api.jakarta_servlet_http.httpservletresponsewrapper  (34 usages found)
                URLClient.java  (34 usages found)
                    httpResponseWrapperGetResponseTest()  (1 usage found)
                        197 @Test
                    httpResponseWrapperSetResponseTest()  (1 usage found)
                        210 @Test
                    httpResponseWrapperSetResponseIllegalArgumentExceptionTest()  (1 usage found)
                        223 @Test
                    httpResponseWrapperConstructorTest()  (1 usage found)
                        236 @Test
                    sendRedirectTest()  (1 usage found)
                        298 @Test
                    addCookieTest()  (1 usage found)
                        362 @Test()
                    addDateHeaderTest()  (1 usage found)
                        367 @Test()
                    addHeaderTest()  (1 usage found)
                        372 @Test()
                    addIntHeaderTest()  (1 usage found)
                        377 @Test()
                    containsHeaderTest()  (1 usage found)
                        382 @Test()
                    flushBufferTest()  (1 usage found)
                        387 @Test()
                    getBufferSizeTest()  (1 usage found)
                        392 @Test()
                    getCharacterEncodingTest()  (1 usage found)
                        397 @Test()
                    getContentTypeTest()  (1 usage found)
                        402 @Test()
                    getLocaleTest()  (1 usage found)
                        407 @Test()
                    getOutputStreamTest()  (1 usage found)
                        412 @Test()
                    getWriterTest()  (1 usage found)
                        417 @Test()
                    isCommittedTest()  (1 usage found)
                        422 @Test()
                    resetBufferTest()  (1 usage found)
                        427 @Test()
                    resetTest()  (1 usage found)
                        432 @Test()
                    resetTest1()  (1 usage found)
                        437 @Test()
                    sendErrorClearBufferTest()  (1 usage found)
                        442 @Test()
                    sendError_StringTest()  (1 usage found)
                        447 @Test()
                    setBufferSizeTest()  (1 usage found)
                        452 @Test()
                    setCharacterEncodingTest()  (1 usage found)
                        457 @Test()
                    setContentLengthTest()  (1 usage found)
                        462 @Test()
                    setContentTypeTest()  (1 usage found)
                        467 @Test()
                    setDateHeaderTest()  (1 usage found)
                        472 @Test()
                    setHeaderTest()  (1 usage found)
                        477 @Test()
                    setIntHeaderTest()  (1 usage found)
                        482 @Test()
                    setLocaleTest()  (1 usage found)
                        487 @Test()
                    setMultiHeaderTest()  (1 usage found)
                        492 @Test()
                    setStatusTest()  (1 usage found)
                        497 @Test()
                    setStatusTest1()  (1 usage found)
                        502 @Test()
            com.sun.ts.tests.servlet.pluggability.api.jakarta_servlet_http.httpservletresponsewrapper30  (4 usages found)
                URLClient.java  (4 usages found)
                    getHeadersTest()  (1 usage found)
                        76 @Test
                    getHeaderTest()  (1 usage found)
                        92 @Test
                    getHeaderNamesTest()  (1 usage found)
                        110 @Test
                    getStatusTest()  (1 usage found)
                        124 @Test
            com.sun.ts.tests.servlet.pluggability.api.jakarta_servlet_http.httpsession  (24 usages found)
                URLClient.java  (24 usages found)
                    getCreationTimeTest()  (1 usage found)
                        73 @Test
                    getCreationTimeIllegalStateExceptionTest()  (1 usage found)
                        86 @Test
                    getIdTestServlet()  (1 usage found)
                        99 @Test
                    getIdIllegalStateExceptionTest()  (1 usage found)
                        113 @Test
                    getLastAccessedTimeTest()  (1 usage found)
                        126 @Test
                    getLastAccessedTimeSetGetTest()  (1 usage found)
                        139 @Test
                    getLastAccessedTimeIllegalStateExceptionTest()  (1 usage found)
                        152 @Test
                    getMaxInactiveIntervalTest()  (1 usage found)
                        170 @Test
                    getAttributeNamesTest()  (1 usage found)
                        183 @Test
                    getAttributeNamesIllegalStateExceptionTest()  (1 usage found)
                        196 @Test
                    getAttributeTest()  (1 usage found)
                        210 @Test
                    getAttributeIllegalStateExceptionTest()  (1 usage found)
                        223 @Test
                    getServletContextTest()  (1 usage found)
                        236 @Test
                    invalidateTest()  (1 usage found)
                        249 @Test
                    invalidateIllegalStateExceptionTest()  (1 usage found)
                        262 @Test
                    isNewTest()  (1 usage found)
                        275 @Test
                    isNewIllegalStateExceptionTest()  (1 usage found)
                        288 @Test
                    removeAttributeTest()  (1 usage found)
                        301 @Test
                    removeAttributeDoNothingTest()  (1 usage found)
                        315 @Test
                    removeAttributeIllegalStateExceptionTest()  (1 usage found)
                        328 @Test
                    setAttributeTest()  (1 usage found)
                        341 @Test
                    setAttributeNullTest()  (1 usage found)
                        354 @Test
                    setAttributeIllegalStateExceptionTest()  (1 usage found)
                        367 @Test
                    setMaxInactiveIntervalTest()  (1 usage found)
                        380 @Test
            com.sun.ts.tests.servlet.pluggability.api.jakarta_servlet_http.httpsessionattributelistener  (3 usages found)
                URLClient.java  (3 usages found)
                    attributeAddedTest()  (1 usage found)
                        75 @Test
                    attributeRemovedTest()  (1 usage found)
                        90 @Test
                    attributeReplacedTest()  (1 usage found)
                        105 @Test
            com.sun.ts.tests.servlet.pluggability.api.jakarta_servlet_http.httpsessionbindingevent  (5 usages found)
                URLClient.java  (5 usages found)
                    addedTest()  (1 usage found)
                        75 @Test
                    removedTest()  (1 usage found)
                        91 @Test
                    replacedTest()  (1 usage found)
                        107 @Test
                    constructor_StringTest()  (1 usage found)
                        120 @Test
                    constructor_String_ObjectTest()  (1 usage found)
                        133 @Test
            com.sun.ts.tests.servlet.pluggability.api.jakarta_servlet_http.httpsessionbindinglistener  (2 usages found)
                URLClient.java  (2 usages found)
                    unBoundTest()  (1 usage found)
                        78 @Test
                    boundTest()  (1 usage found)
                        94 @Test
            com.sun.ts.tests.servlet.pluggability.api.jakarta_servlet_http.httpsessionevent  (2 usages found)
                URLClient.java  (2 usages found)
                    getSessionTest()  (1 usage found)
                        73 @Test
                    constructorTest()  (1 usage found)
                        86 @Test
            com.sun.ts.tests.servlet.pluggability.api.jakarta_servlet_http.httpsessionlistener  (2 usages found)
                URLClient.java  (2 usages found)
                    createdTest()  (1 usage found)
                        76 @Test
                    destroyedTest()  (1 usage found)
                        93 @Test
            com.sun.ts.tests.servlet.pluggability.api.jakarta_servlet_http.sessioncookieconfig  (9 usages found)
                URLClient.java  (9 usages found)
                    constructortest1()  (1 usage found)
                        78 @Test
                    setNameTest()  (1 usage found)
                        98 @Test
                    setCommentTest()  (1 usage found)
                        113 @Test
                    setPathTest()  (1 usage found)
                        128 @Test
                    setDomainTest()  (1 usage found)
                        143 @Test
                    setMaxAgeTest()  (1 usage found)
                        158 @Test
                    setHttpOnlyTest()  (1 usage found)
                        173 @Test
                    setSecureTest()  (1 usage found)
                        188 @Test
                    setAttributeTest()  (1 usage found)
                        203 @Test
            com.sun.ts.tests.servlet.pluggability.fragment  (5 usages found)
                URLClient.java  (5 usages found)
                    initParamTest()  (1 usage found)
                        81 @Test
                    addServletTest()  (1 usage found)
                        100 @Test
                    addServletURLTest()  (1 usage found)
                        121 @Test
                    welcomefileTest()  (1 usage found)
                        144 @Test
                    filterOrderingTest()  (1 usage found)
                        165 @Test
            com.sun.ts.tests.servlet.spec.annotationservlet.webfilter  (3 usages found)
                URLClient.java  (3 usages found)
                    test1()  (1 usage found)
                        66 @Test
                    test2()  (1 usage found)
                        92 @Test
                    test3()  (1 usage found)
                        117 @Test
            com.sun.ts.tests.servlet.spec.annotationservlet.weblistener  (7 usages found)
                URLClient.java  (7 usages found)
                    ContextListenerTest()  (1 usage found)
                        64 @Test
                    ContextAttributeListenerTest()  (1 usage found)
                        80 @Test
                    RequsetListenerTest()  (1 usage found)
                        99 @Test
                    RepeatRequsetListenerTest()  (1 usage found)
                        117 @Test
                    RequsetAttributeListenerTest()  (1 usage found)
                        141 @Test
                    HttpSessionListenerTest()  (1 usage found)
                        159 @Test
                    HttpSessionAttributeListenerTest()  (1 usage found)
                        182 @Test
            com.sun.ts.tests.servlet.spec.annotationservlet.webservlet  (5 usages found)
                URLClient.java  (5 usages found)
                    test1()  (1 usage found)
                        63 @Test
                    test2()  (1 usage found)
                        85 @Test
                    test3()  (1 usage found)
                        131 @Test
                    test4()  (1 usage found)
                        157 @Test
                    test5()  (1 usage found)
                        179 @Test
            com.sun.ts.tests.servlet.spec.annotationservlet.webservletapi  (3 usages found)
                URLClient.java  (3 usages found)
                    test1()  (1 usage found)
                        71 @Test
                    test2()  (1 usage found)
                        102 @Test
                    test3()  (1 usage found)
                        174 @Test
            com.sun.ts.tests.servlet.spec.annotationservlet.webservletdd  (5 usages found)
                URLClient.java  (5 usages found)
                    test1()  (1 usage found)
                        72 @Test
                    test2()  (1 usage found)
                        104 @Test
                    test3()  (1 usage found)
                        176 @Test
                    test4()  (1 usage found)
                        213 @Test
                    test5()  (1 usage found)
                        248 @Test
            com.sun.ts.tests.servlet.spec.async  (39 usages found)
                URLClient.java  (39 usages found)
                    AsyncSupportedTrueTest1()  (1 usage found)
                        58 @Test
                    AsyncSupportedTrueTest2()  (1 usage found)
                        77 @Test
                    AsyncSupportedTrueTest3()  (1 usage found)
                        98 @Test
                    AsyncSupportedTrueTest4()  (1 usage found)
                        120 @Test
                    AsyncSupportedFalseTest1()  (1 usage found)
                        139 @Test
                    AsyncSupportedFalseTest2()  (1 usage found)
                        156 @Test
                    AsyncSupportedFalseTest3()  (1 usage found)
                        175 @Test
                    AsyncSupportedFalseTest4()  (1 usage found)
                        195 @Test
                    AsyncSupportedFalseTest5()  (1 usage found)
                        215 @Test
                    AsyncSupportedFalseTest6()  (1 usage found)
                        235 @Test
                    AsyncSupportedFalseTest7()  (1 usage found)
                        255 @Test
                    AsyncSupportedFalseTest8()  (1 usage found)
                        276 @Test
                    AsyncSupportedFalseTest9()  (1 usage found)
                        296 @Test
                    AsyncSupportedFalseTest10()  (1 usage found)
                        317 @Test
                    StartAsyncTest1()  (1 usage found)
                        335 @Test
                    StartAsyncTest2()  (1 usage found)
                        353 @Test
                    StartAsyncTest3()  (1 usage found)
                        371 @Test
                    StartAsyncTest4()  (1 usage found)
                        390 @Test
                    StartAsyncTest5()  (1 usage found)
                        411 @Test
                    StartAsyncTest6()  (1 usage found)
                        432 @Test
                    StartAsyncTest7()  (1 usage found)
                        453 @Test
                    StartAsyncTest8()  (1 usage found)
                        475 @Test
                    StartAsyncTest9()  (1 usage found)
                        496 @Test
                    StartAsyncTest10()  (1 usage found)
                        517 @Test
                    StartAsyncTest11()  (1 usage found)
                        539 @Test
                    StartAsyncTest12()  (1 usage found)
                        561 @Test
                    StartAsyncTest13()  (1 usage found)
                        584 @Test
                    StartAsyncTest14()  (1 usage found)
                        607 @Test
                    StartAsyncTest15()  (1 usage found)
                        630 @Test
                    StartAsyncTest16()  (1 usage found)
                        653 @Test
                    StartAsyncTest17()  (1 usage found)
                        674 @Test
                    StartAsyncTest18()  (1 usage found)
                        695 @Test
                    StartAsyncTest19()  (1 usage found)
                        716 @Test
                    StartAsyncTest20()  (1 usage found)
                        738 @Test
                    StartAsyncTest21()  (1 usage found)
                        761 @Test
                    StartAsyncTest22()  (1 usage found)
                        784 @Test
                    StartAsyncTest23()  (1 usage found)
                        807 @Test
                    StartAsyncTest24()  (1 usage found)
                        830 @Test
                    StartAsyncTest25()  (1 usage found)
                        849 @Test
            com.sun.ts.tests.servlet.spec.defaultcontextpath  (1 usage found)
                URLClient.java  (1 usage found)
                    getDefaultContextPathTest()  (1 usage found)
                        58 @Test
            com.sun.ts.tests.servlet.spec.defaultmapping  (2 usages found)
                URLClient.java  (2 usages found)
                    defaultservletTest1()  (1 usage found)
                        57 @Test
                    defaultservletTest()  (1 usage found)
                        76 @Test
            com.sun.ts.tests.servlet.spec.dir_struct  (1 usage found)
                URLClient.java  (1 usage found)
                    loadClassesTest()  (1 usage found)
                        66 @Test
            com.sun.ts.tests.servlet.spec.errorpage  (4 usages found)
                URLClient.java  (4 usages found)
                    servletToDifferentErrorPagesTest()  (1 usage found)
                        68 @Test
                    statusCodeErrorPageTest()  (1 usage found)
                        94 @Test
                    heirarchyErrorMatchTest()  (1 usage found)
                        117 @Test
                    wrappedExceptionTest()  (1 usage found)
                        139 @Test
            com.sun.ts.tests.servlet.spec.errorpage1  (2 usages found)
                URLClient.java  (2 usages found)
                    nonServletExceptionTest()  (1 usage found)
                        72 @Test
                    servletExceptionTest()  (1 usage found)
                        99 @Test
            com.sun.ts.tests.servlet.spec.httpservletresponse  (5 usages found)
                URLClient.java  (5 usages found)
                    intHeaderTest()  (1 usage found)
                        63 @Test
                    flushBufferTest()  (1 usage found)
                        81 @Test
                    sendErrorCommitTest()  (1 usage found)
                        98 @Test
                    sendRedirectCommitTest()  (1 usage found)
                        118 @Test
                    sendRedirectClearBufferTest()  (1 usage found)
                        137 @Test
            com.sun.ts.tests.servlet.spec.i18n.encoding  (3 usages found)
                URLClient.java  (3 usages found)
                    spec1Test()  (1 usage found)
                        64 @Test
                    spec2Test()  (1 usage found)
                        78 @Test
                    spec3Test()  (1 usage found)
                        92 @Test
            com.sun.ts.tests.servlet.spec.listenerorder  (1 usage found)
                URLClient.java  (1 usage found)
                    requestListenerOrderTest()  (1 usage found)
                        56 @Test
            com.sun.ts.tests.servlet.spec.multifiltermapping  (4 usages found)
                URLClient.java  (4 usages found)
                    requestTest()  (1 usage found)
                        76 @Test
                    forwardTest()  (1 usage found)
                        140 @Test
                    includeTest()  (1 usage found)
                        215 @Test
                    errorTest()  (1 usage found)
                        297 @Test
            com.sun.ts.tests.servlet.spec.pluggability.ordering.test1  (1 usage found)
                URLClient.java  (1 usage found)
                    initParamTest()  (1 usage found)
                        81 @Test
            com.sun.ts.tests.servlet.spec.protocols.http  (1 usage found)
                URLClient.java  (1 usage found)
                    httpTest()  (1 usage found)
                        65 @Test
            com.sun.ts.tests.servlet.spec.rdspecialchar  (2 usages found)
                URLClient.java  (2 usages found)
                    querySemicolonInclude()  (1 usage found)
                        66 @Test
                    querySemicolonForward()  (1 usage found)
                        84 @Test
            com.sun.ts.tests.servlet.spec.requestdispatcher  (21 usages found)
                URLClient.java  (21 usages found)
                    getRequestAttributes()  (1 usage found)
                        67 @Test
                    getRequestAttributes1()  (1 usage found)
                        91 @Test
                    getRequestAttributes2()  (1 usage found)
                        115 @Test
                    requestDispatcherIncludeIOAndServletExceptionTest()  (1 usage found)
                        135 @Test
                    requestDispatcherIncludeRuntimeExceptionTest()  (1 usage found)
                        154 @Test
                    requestDispatcherIncludeCheckedExceptionTest()  (1 usage found)
                        173 @Test
                    requestDispatcherForwardIOAndServletExceptionTest()  (1 usage found)
                        193 @Test
                    requestDispatcherForwardRuntimeExceptionTest()  (1 usage found)
                        212 @Test
                    requestDispatcherForwardCheckedExceptionTest()  (1 usage found)
                        231 @Test
                    getRequestAttributes3()  (1 usage found)
                        255 @Test
                    getRequestAttributes4()  (1 usage found)
                        283 @Test
                    getRequestAttributes5()  (1 usage found)
                        311 @Test
                    getRequestAttributes6()  (1 usage found)
                        342 @Test
                    bufferContent()  (1 usage found)
                        366 @Test
                    requestDispatcherNoWrappingTest()  (1 usage found)
                        384 @Test
                    getRequestURIIncludeTest()  (1 usage found)
                        408 @Test
                    getRequestURLIncludeTest()  (1 usage found)
                        424 @Test
                    getRequestURIForwardTest()  (1 usage found)
                        440 @Test
                    getRequestURLForwardTest()  (1 usage found)
                        456 @Test
                    getQueryStringIncludeTest()  (1 usage found)
                        474 @Test
                    getQueryStringForwardTest()  (1 usage found)
                        492 @Test
            com.sun.ts.tests.servlet.spec.requestmap  (8 usages found)
                URLClient.java  (8 usages found)
                    longestPathMatchTest()  (1 usage found)
                        60 @Test
                    longestPathMatchTest1()  (1 usage found)
                        79 @Test
                    longestPathMatchTest2()  (1 usage found)
                        98 @Test
                    exactMatchTest()  (1 usage found)
                        116 @Test
                    exactMatchTest1()  (1 usage found)
                        135 @Test
                    extMatchTest()  (1 usage found)
                        154 @Test
                    extMatchTest1()  (1 usage found)
                        172 @Test
                    notFoundTest1()  (1 usage found)
                        190 @Test
            com.sun.ts.tests.servlet.spec.security.annotations  (7 usages found)
                Client.java  (7 usages found)
                    test1()  (1 usage found)
                        148 @Test
                    test2()  (1 usage found)
                        194 @Test
                    test3()  (1 usage found)
                        277 @Test
                    test4()  (1 usage found)
                        313 @Test
                    test5()  (1 usage found)
                        355 @Test
                    test6()  (1 usage found)
                        392 @Test
                    test7()  (1 usage found)
                        445 @Test
            com.sun.ts.tests.servlet.spec.security.clientcert  (1 usage found)
                Client.java  (1 usage found)
                    clientCertTest()  (1 usage found)
                        251 @Test
            com.sun.ts.tests.servlet.spec.security.clientcertanno  (1 usage found)
                Client.java  (1 usage found)
                    clientCertTest()  (1 usage found)
                        161 @Test
            com.sun.ts.tests.servlet.spec.security.denyUncovered  (5 usages found)
                Client.java  (5 usages found)
                    testAllMethodsAllowedAnno()  (1 usage found)
                        122 @Test
                    testAccessToMethodAllowed()  (1 usage found)
                        170 @Test
                    testDenySomeUncovered()  (1 usage found)
                        206 @Test
                    testExcludeAuthConstraint()  (1 usage found)
                        247 @Test
                    testPartialDDServlet()  (1 usage found)
                        289 @Test
            com.sun.ts.tests.servlet.spec.security.metadatacomplete  (6 usages found)
                Client.java  (6 usages found)
                    test1()  (1 usage found)
                        122 @Test
                    test2()  (1 usage found)
                        169 @Test
                    test3()  (1 usage found)
                        226 @Test
                    test4()  (1 usage found)
                        292 @Test
                    test5()  (1 usage found)
                        321 @Test
                    test6()  (1 usage found)
                        354 @Test
            com.sun.ts.tests.servlet.spec.security.secbasic  (14 usages found)
                Client.java  (14 usages found)
                    test1_anno()  (1 usage found)
                        101 @Test
                    test2_anno()  (1 usage found)
                        159 @Test
                    test3_anno()  (1 usage found)
                        205 @Test
                    test4_anno()  (1 usage found)
                        257 @Test
                    test5_anno()  (1 usage found)
                        312 @Test
                    test6_anno()  (1 usage found)
                        381 @Test
                    test7_anno()  (1 usage found)
                        426 @Test
                    test1()  (1 usage found)
                        441 @Test()
                    test2()  (1 usage found)
                        446 @Test()
                    test3()  (1 usage found)
                        451 @Test()
                    test4()  (1 usage found)
                        456 @Test()
                    test5()  (1 usage found)
                        461 @Test()
                    test6()  (1 usage found)
                        466 @Test()
                    test7()  (1 usage found)
                        471 @Test()
            com.sun.ts.tests.servlet.spec.security.secform  (25 usages found)
                Client.java  (25 usages found)
                    test1_anno()  (1 usage found)
                        107 @Test
                    test2_anno()  (1 usage found)
                        146 @Test
                    test3_anno()  (1 usage found)
                        198 @Test
                    test4_anno()  (1 usage found)
                        247 @Test
                    test5_anno()  (1 usage found)
                        298 @Test
                    test6_anno()  (1 usage found)
                        364 @Test
                    test14_anno()  (1 usage found)
                        535 @Test
                    test15_anno()  (1 usage found)
                        592 @Test
                    test1()  (1 usage found)
                        663 @Test()
                    test10()  (1 usage found)
                        668 @Test()
                    test11()  (1 usage found)
                        673 @Test()
                    test13()  (1 usage found)
                        678 @Test()
                    test14()  (1 usage found)
                        683 @Test()
                    test15()  (1 usage found)
                        688 @Test()
                    test16()  (1 usage found)
                        693 @Test()
                    test17()  (1 usage found)
                        698 @Test()
                    test18()  (1 usage found)
                        703 @Test()
                    test2()  (1 usage found)
                        708 @Test()
                    test3()  (1 usage found)
                        713 @Test()
                    test4()  (1 usage found)
                        718 @Test()
                    test5()  (1 usage found)
                        723 @Test()
                    test6()  (1 usage found)
                        728 @Test()
                    test7()  (1 usage found)
                        733 @Test()
                    test8()  (1 usage found)
                        738 @Test()
                    test9()  (1 usage found)
                        743 @Test()
            com.sun.ts.tests.servlet.spec.serverpush  (8 usages found)
                Client.java  (8 usages found)
                    serverPushTest()  (1 usage found)
                        109 @Test
                    getNullPushBuilderTest()  (1 usage found)
                        127 @Test
                    serverPushInitTest()  (1 usage found)
                        161 @Test
                    serverPushSessionTest()  (1 usage found)
                        264 @Test
                    serverPushCookieTest()  (1 usage found)
                        303 @Test
                    serverPushSessionTest2()  (1 usage found)
                        346 @Test
                    serverPushMiscTest()  (1 usage found)
                        392 @Test
                    serverPushNegtiveTest()  (1 usage found)
                        446 @Test
            com.sun.ts.tests.servlet.spec.servletcontext  (1 usage found)
                URLClient.java  (1 usage found)
                    getJspConfigDescriptorTest()  (1 usage found)
                        58 @Test
            com.sun.ts.tests.servlet.spec.servletmapping  (4 usages found)
                URLClient.java  (4 usages found)
                    multiURLmappingTest1()  (1 usage found)
                        55 @Test
                    multiURLmappingTest2()  (1 usage found)
                        81 @Test
                    multiURLmappingTest3()  (1 usage found)
                        106 @Test
                    multiURLmappingTest4()  (1 usage found)
                        131 @Test
            com.sun.ts.tests.servlet.spec.servletresponse  (2 usages found)
                URLClient.java  (2 usages found)
                    testFlushBufferHttp()  (1 usage found)
                        59 @Test
                    testFlushBuffer()  (1 usage found)
                        107 @Test
            com.sun.ts.tests.servlet.spec.srlistener  (13 usages found)
                URLClient.java  (13 usages found)
                    simpleinclude()  (1 usage found)
                        64 @Test
                    multipleincludes()  (1 usage found)
                        93 @Test
                    includeforward()  (1 usage found)
                        123 @Test
                    includeerror()  (1 usage found)
                        153 @Test
                    simpleforward()  (1 usage found)
                        183 @Test
                    multipleforwards()  (1 usage found)
                        213 @Test
                    forwardinclude()  (1 usage found)
                        243 @Test
                    forwarderror()  (1 usage found)
                        273 @Test
                    simpleasync()  (1 usage found)
                        303 @Test
                    simpleasyncinclude()  (1 usage found)
                        333 @Test
                    simpleasyncforward()  (1 usage found)
                        365 @Test
                    simpleasyncerror()  (1 usage found)
                        395 @Test
                    error()  (1 usage found)
                        425 @Test
            com.sun.ts.tests.servlet.spec.webapps.accesswebinf  (1 usage found)
                URLClient.java  (1 usage found)
                    accessWebInfTest()  (1 usage found)
                        55 @Test
            com.sun.ts.tests.servlet.spec.welcomefiles  (2 usages found)
                URLClient.java  (2 usages found)
                    partialfound1()  (1 usage found)
                        64 @Test
                    partialfound2()  (1 usage found)
                        84 @Test
```

```shell
Targets
    Occurrences of '@Deployment' in Directory /Users/starksm/Dev/Jakarta/platform-tck-refactor/servlet with mask '*.java'
Found Occurrences in Directory /Users/starksm/Dev/Jakarta/platform-tck-refactor/servlet with mask '*.java'  (210 usages found)
    Unclassified  (210 usages found)
        servlet  (210 usages found)
            com.sun.ts.tests.servlet.api.jakarta_servlet.asynccontext  (1 usage found)
                URLClient.java  (1 usage found)
                    getTestArchive()  (1 usage found)
                        40 @Deployment(testable = false)
            com.sun.ts.tests.servlet.api.jakarta_servlet.asyncevent  (1 usage found)
                URLClient.java  (1 usage found)
                    getTestArchive()  (1 usage found)
                        39 @Deployment(testable = false)
            com.sun.ts.tests.servlet.api.jakarta_servlet.dispatchertype  (1 usage found)
                URLClient.java  (1 usage found)
                    getTestArchive()  (1 usage found)
                        42 @Deployment(testable = false)
            com.sun.ts.tests.servlet.api.jakarta_servlet.dispatchtest  (2 usages found)
                URLClient.java  (2 usages found)
                    getTestArchive()  (1 usage found)
                        48 @Deployment(testable = false)
                    getTestArchive1()  (1 usage found)
                        59 @Deployment(testable = false, name = "servlet_js_dispatchtest_web1")
            com.sun.ts.tests.servlet.api.jakarta_servlet.dofilter  (1 usage found)
                URLClient.java  (1 usage found)
                    getTestArchive()  (1 usage found)
                        42 @Deployment(testable = false)
            com.sun.ts.tests.servlet.api.jakarta_servlet.filter  (1 usage found)
                URLClient.java  (1 usage found)
                    getTestArchive()  (1 usage found)
                        36 @Deployment(testable = false)
            com.sun.ts.tests.servlet.api.jakarta_servlet.filterchain  (1 usage found)
                URLClient.java  (1 usage found)
                    getTestArchive()  (1 usage found)
                        36 @Deployment(testable = false)
            com.sun.ts.tests.servlet.api.jakarta_servlet.filterconfig  (1 usage found)
                URLClient.java  (1 usage found)
                    getTestArchive()  (1 usage found)
                        35 @Deployment(testable = false)
            com.sun.ts.tests.servlet.api.jakarta_servlet.filterrequestdispatcher  (1 usage found)
                URLClient.java  (1 usage found)
                    getTestArchive()  (1 usage found)
                        44 @Deployment(testable = false)
            com.sun.ts.tests.servlet.api.jakarta_servlet.genericfilter  (1 usage found)
                URLClient.java  (1 usage found)
                    getTestArchive()  (1 usage found)
                        35 @Deployment(testable = false)
            com.sun.ts.tests.servlet.api.jakarta_servlet.genericservlet  (1 usage found)
                URLClient.java  (1 usage found)
                    getTestArchive()  (1 usage found)
                        41 @Deployment(testable = false)
            com.sun.ts.tests.servlet.api.jakarta_servlet.registration  (1 usage found)
                URLClient.java  (1 usage found)
                    getTestArchive()  (1 usage found)
                        52 @Deployment(testable = false)
            com.sun.ts.tests.servlet.api.jakarta_servlet.requestdispatcher  (1 usage found)
                URLClient.java  (1 usage found)
                    getTestArchive()  (1 usage found)
                        42 @Deployment(testable = false)
            com.sun.ts.tests.servlet.api.jakarta_servlet.scattributeevent  (1 usage found)
                URLClient.java  (1 usage found)
                    getTestArchive()  (1 usage found)
                        45 @Deployment(testable = false)
            com.sun.ts.tests.servlet.api.jakarta_servlet.scattributelistener  (1 usage found)
                URLClient.java  (1 usage found)
                    getTestArchive()  (1 usage found)
                        41 @Deployment(testable = false)
            com.sun.ts.tests.servlet.api.jakarta_servlet.scattributelistener40  (1 usage found)
                URLClient.java  (1 usage found)
                    getTestArchive()  (1 usage found)
                        42 @Deployment(testable = false)
            com.sun.ts.tests.servlet.api.jakarta_servlet.scevent  (1 usage found)
                URLClient.java  (1 usage found)
                    getTestArchive()  (1 usage found)
                        41 @Deployment(testable = false)
            com.sun.ts.tests.servlet.api.jakarta_servlet.scinitializer.addfilter  (1 usage found)
                URLClient.java  (1 usage found)
                    getTestArchive()  (1 usage found)
                        41 @Deployment(testable = false)
            com.sun.ts.tests.servlet.api.jakarta_servlet.scinitializer.addfilter1  (1 usage found)
                URLClient.java  (1 usage found)
                    getTestArchive()  (1 usage found)
                        41 @Deployment(testable = false)
            com.sun.ts.tests.servlet.api.jakarta_servlet.scinitializer.addlistener  (1 usage found)
                URLClient.java  (1 usage found)
                    getTestArchive()  (1 usage found)
                        41 @Deployment(testable = false)
            com.sun.ts.tests.servlet.api.jakarta_servlet.scinitializer.addlistener1  (1 usage found)
                URLClient.java  (1 usage found)
                    getTestArchive()  (1 usage found)
                        40 @Deployment(testable = false)
            com.sun.ts.tests.servlet.api.jakarta_servlet.scinitializer.addservlet  (1 usage found)
                URLClient.java  (1 usage found)
                    getTestArchive()  (1 usage found)
                        40 @Deployment(testable = false)
            com.sun.ts.tests.servlet.api.jakarta_servlet.scinitializer.addservlet1  (1 usage found)
                URLClient.java  (1 usage found)
                    getTestArchive()  (1 usage found)
                        40 @Deployment(testable = false)
            com.sun.ts.tests.servlet.api.jakarta_servlet.scinitializer.createfilter  (1 usage found)
                URLClient.java  (1 usage found)
                    getTestArchive()  (1 usage found)
                        40 @Deployment(testable = false)
            com.sun.ts.tests.servlet.api.jakarta_servlet.scinitializer.createlistener  (1 usage found)
                URLClient.java  (1 usage found)
                    getTestArchive()  (1 usage found)
                        44 @Deployment(testable = false)
            com.sun.ts.tests.servlet.api.jakarta_servlet.scinitializer.createservlet  (1 usage found)
                URLClient.java  (1 usage found)
                    getTestArchive()  (1 usage found)
                        40 @Deployment(testable = false)
            com.sun.ts.tests.servlet.api.jakarta_servlet.scinitializer.getclassloader  (1 usage found)
                URLClient.java  (1 usage found)
                    getTestArchive()  (1 usage found)
                        40 @Deployment(testable = false)
            com.sun.ts.tests.servlet.api.jakarta_servlet.scinitializer.getdefaultsessiontrackingmodes  (1 usage found)
                URLClient.java  (1 usage found)
                    getTestArchive()  (1 usage found)
                        40 @Deployment(testable = false)
            com.sun.ts.tests.servlet.api.jakarta_servlet.scinitializer.geteffectivemajorversion  (1 usage found)
                URLClient.java  (1 usage found)
                    getTestArchive()  (1 usage found)
                        40 @Deployment(testable = false)
            com.sun.ts.tests.servlet.api.jakarta_servlet.scinitializer.geteffectiveminorversion  (1 usage found)
                URLClient.java  (1 usage found)
                    getTestArchive()  (1 usage found)
                        40 @Deployment(testable = false)
            com.sun.ts.tests.servlet.api.jakarta_servlet.scinitializer.geteffectivesessiontrackingmodes  (1 usage found)
                URLClient.java  (1 usage found)
                    getTestArchive()  (1 usage found)
                        40 @Deployment(testable = false)
            com.sun.ts.tests.servlet.api.jakarta_servlet.scinitializer.getfilterregistration  (1 usage found)
                URLClient.java  (1 usage found)
                    getTestArchive()  (1 usage found)
                        40 @Deployment(testable = false)
            com.sun.ts.tests.servlet.api.jakarta_servlet.scinitializer.getfilterregistrations  (1 usage found)
                URLClient.java  (1 usage found)
                    getTestArchive()  (1 usage found)
                        40 @Deployment(testable = false)
            com.sun.ts.tests.servlet.api.jakarta_servlet.scinitializer.getservletregistration  (1 usage found)
                URLClient.java  (1 usage found)
                    getTestArchive()  (1 usage found)
                        40 @Deployment(testable = false)
            com.sun.ts.tests.servlet.api.jakarta_servlet.scinitializer.getservletregistrations  (1 usage found)
                URLClient.java  (1 usage found)
                    getTestArchive()  (1 usage found)
                        40 @Deployment(testable = false)
            com.sun.ts.tests.servlet.api.jakarta_servlet.scinitializer.getsessioncookieconfig  (1 usage found)
                URLClient.java  (1 usage found)
                    getTestArchive()  (1 usage found)
                        40 @Deployment(testable = false)
            com.sun.ts.tests.servlet.api.jakarta_servlet.scinitializer.setinitparameter  (1 usage found)
                URLClient.java  (1 usage found)
                    getTestArchive()  (1 usage found)
                        39 @Deployment(testable = false)
            com.sun.ts.tests.servlet.api.jakarta_servlet.scinitializer.setsessiontrackingmodes  (1 usage found)
                URLClient.java  (1 usage found)
                    getTestArchive()  (1 usage found)
                        40 @Deployment(testable = false)
            com.sun.ts.tests.servlet.api.jakarta_servlet.sclistener  (1 usage found)
                URLClient.java  (1 usage found)
                    getTestArchive()  (1 usage found)
                        41 @Deployment(testable = false)
            com.sun.ts.tests.servlet.api.jakarta_servlet.sclistener40  (1 usage found)
                URLClient.java  (1 usage found)
                    getTestArchive()  (1 usage found)
                        40 @Deployment(testable = false)
            com.sun.ts.tests.servlet.api.jakarta_servlet.servlet  (1 usage found)
                URLClient.java  (1 usage found)
                    getTestArchive()  (1 usage found)
                        35 @Deployment(testable = false)
            com.sun.ts.tests.servlet.api.jakarta_servlet.servletconfig  (1 usage found)
                URLClient.java  (1 usage found)
                    getTestArchive()  (1 usage found)
                        39 @Deployment(testable = false)
            com.sun.ts.tests.servlet.api.jakarta_servlet.servletcontext  (1 usage found)
                URLClient.java  (1 usage found)
                    getTestArchive()  (1 usage found)
                        40 @Deployment(testable = false)
            com.sun.ts.tests.servlet.api.jakarta_servlet.servletcontext30  (1 usage found)
                URLClient.java  (1 usage found)
                    getTestArchive()  (1 usage found)
                        40 @Deployment(testable = false)
            com.sun.ts.tests.servlet.api.jakarta_servlet.servletcontext301  (1 usage found)
                URLClient.java  (1 usage found)
                    getTestArchive()  (1 usage found)
                        40 @Deployment(testable = false)
            com.sun.ts.tests.servlet.api.jakarta_servlet.servletcontext302  (1 usage found)
                URLClient.java  (1 usage found)
                    getTestArchive()  (1 usage found)
                        42 @Deployment(testable = false)
            com.sun.ts.tests.servlet.api.jakarta_servlet.servletcontext303  (1 usage found)
                URLClient.java  (1 usage found)
                    getTestArchive()  (1 usage found)
                        44 @Deployment(testable = false)
            com.sun.ts.tests.servlet.api.jakarta_servlet.servletcontext304  (1 usage found)
                URLClient.java  (1 usage found)
                    getTestArchive()  (1 usage found)
                        41 @Deployment(testable = false)
            com.sun.ts.tests.servlet.api.jakarta_servlet.servletcontext305  (1 usage found)
                URLClient.java  (1 usage found)
                    getTestArchive()  (1 usage found)
                        62 @Deployment(testable = false)
            com.sun.ts.tests.servlet.api.jakarta_servlet.servletcontext306  (1 usage found)
                URLClient.java  (1 usage found)
                    getTestArchive()  (1 usage found)
                        46 @Deployment(testable = false)
            com.sun.ts.tests.servlet.api.jakarta_servlet.servletcontext31  (1 usage found)
                URLClient.java  (1 usage found)
                    getTestArchive()  (1 usage found)
                        40 @Deployment(testable = false)
            com.sun.ts.tests.servlet.api.jakarta_servlet.servletcontext40  (1 usage found)
                Client.java  (1 usage found)
                    getTestArchive()  (1 usage found)
                        43 @Deployment(testable = false)
            com.sun.ts.tests.servlet.api.jakarta_servlet.servletexception  (1 usage found)
                URLClient.java  (1 usage found)
                    getTestArchive()  (1 usage found)
                        41 @Deployment(testable = false)
            com.sun.ts.tests.servlet.api.jakarta_servlet.servletinputstream  (1 usage found)
                URLClient.java  (1 usage found)
                    getTestArchive()  (1 usage found)
                        42 @Deployment(testable = false)
            com.sun.ts.tests.servlet.api.jakarta_servlet.servletoutputstream  (1 usage found)
                URLClient.java  (1 usage found)
                    getTestArchive()  (1 usage found)
                        45 @Deployment(testable = false)
            com.sun.ts.tests.servlet.api.jakarta_servlet.servletrequest  (1 usage found)
                URLClient.java  (1 usage found)
                    getTestArchive()  (1 usage found)
                        39 @Deployment(testable = false)
            com.sun.ts.tests.servlet.api.jakarta_servlet.servletrequest1  (1 usage found)
                URLClient.java  (1 usage found)
                    getTestArchive()  (1 usage found)
                        39 @Deployment(testable = false)
            com.sun.ts.tests.servlet.api.jakarta_servlet.servletrequest30  (1 usage found)
                URLClient.java  (1 usage found)
                    getTestArchive()  (1 usage found)
                        40 @Deployment(testable = false)
            com.sun.ts.tests.servlet.api.jakarta_servlet.servletrequestwrapper  (1 usage found)
                URLClient.java  (1 usage found)
                    getTestArchive()  (1 usage found)
                        39 @Deployment(testable = false)
            com.sun.ts.tests.servlet.api.jakarta_servlet.servletrequestwrapper30  (1 usage found)
                URLClient.java  (1 usage found)
                    getTestArchive()  (1 usage found)
                        38 @Deployment(testable = false)
            com.sun.ts.tests.servlet.api.jakarta_servlet.servletrequestwrapper30x  (1 usage found)
                URLClient.java  (1 usage found)
                    getTestArchive()  (1 usage found)
                        34 @Deployment(testable = false)
            com.sun.ts.tests.servlet.api.jakarta_servlet.servletresponse  (1 usage found)
                URLClient.java  (1 usage found)
                    getTestArchive()  (1 usage found)
                        40 @Deployment(testable = false)
            com.sun.ts.tests.servlet.api.jakarta_servlet.servletresponsewrapper  (1 usage found)
                URLClient.java  (1 usage found)
                    getTestArchive()  (1 usage found)
                        40 @Deployment(testable = false)
            com.sun.ts.tests.servlet.api.jakarta_servlet.servletresponsewrapper30  (1 usage found)
                URLClient.java  (1 usage found)
                    getTestArchive()  (1 usage found)
                        35 @Deployment(testable = false)
            com.sun.ts.tests.servlet.api.jakarta_servlet.sessiontrackingmode  (1 usage found)
                URLClient.java  (1 usage found)
                    getTestArchive()  (1 usage found)
                        40 @Deployment(testable = false)
            com.sun.ts.tests.servlet.api.jakarta_servlet.sessiontrackingmode1  (1 usage found)
                URLClient.java  (1 usage found)
                    getTestArchive()  (1 usage found)
                        40 @Deployment(testable = false)
            com.sun.ts.tests.servlet.api.jakarta_servlet.sessiontrackingmode2  (1 usage found)
                URLClient.java  (1 usage found)
                    getTestArchive()  (1 usage found)
                        40 @Deployment(testable = false)
            com.sun.ts.tests.servlet.api.jakarta_servlet.sessiontrackingmode3  (1 usage found)
                URLClient.java  (1 usage found)
                    getTestArchive()  (1 usage found)
                        40 @Deployment(testable = false)
            com.sun.ts.tests.servlet.api.jakarta_servlet.sessiontrackingmode4  (1 usage found)
                URLClient.java  (1 usage found)
                    getTestArchive()  (1 usage found)
                        40 @Deployment(testable = false)
            com.sun.ts.tests.servlet.api.jakarta_servlet.srattributeevent  (1 usage found)
                URLClient.java  (1 usage found)
                    getTestArchive()  (1 usage found)
                        45 @Deployment(testable = false)
            com.sun.ts.tests.servlet.api.jakarta_servlet.srattributelistener  (1 usage found)
                URLClient.java  (1 usage found)
                    getTestArchive()  (1 usage found)
                        44 @Deployment(testable = false)
            com.sun.ts.tests.servlet.api.jakarta_servlet.srattributelistener40  (1 usage found)
                URLClient.java  (1 usage found)
                    getTestArchive()  (1 usage found)
                        41 @Deployment(testable = false)
            com.sun.ts.tests.servlet.api.jakarta_servlet.srevent  (1 usage found)
                URLClient.java  (1 usage found)
                    getTestArchive()  (1 usage found)
                        40 @Deployment(testable = false)
            com.sun.ts.tests.servlet.api.jakarta_servlet.srlistener  (1 usage found)
                URLClient.java  (1 usage found)
                    getTestArchive()  (1 usage found)
                        46 @Deployment(testable = false)
            com.sun.ts.tests.servlet.api.jakarta_servlet.srlistener40  (1 usage found)
                URLClient.java  (1 usage found)
                    getTestArchive()  (1 usage found)
                        41 @Deployment(testable = false)
            com.sun.ts.tests.servlet.api.jakarta_servlet.unavailableexception  (1 usage found)
                URLClient.java  (1 usage found)
                    getTestArchive()  (1 usage found)
                        41 @Deployment(testable = false)
            com.sun.ts.tests.servlet.api.jakarta_servlet_http.asynccontext  (1 usage found)
                URLClient.java  (1 usage found)
                    getTestArchive()  (1 usage found)
                        41 @Deployment(testable = false)
            com.sun.ts.tests.servlet.api.jakarta_servlet_http.cookie  (1 usage found)
                URLClient.java  (1 usage found)
                    getTestArchive()  (1 usage found)
                        55 @Deployment(testable = false)
            com.sun.ts.tests.servlet.api.jakarta_servlet_http.httpfilter  (1 usage found)
                URLClient.java  (1 usage found)
                    getTestArchive()  (1 usage found)
                        35 @Deployment(testable = false)
            com.sun.ts.tests.servlet.api.jakarta_servlet_http.httpservlet  (1 usage found)
                URLClient.java  (1 usage found)
                    getTestArchive()  (1 usage found)
                        41 @Deployment(testable = false)
            com.sun.ts.tests.servlet.api.jakarta_servlet_http.httpservletrequest  (1 usage found)
                URLClient.java  (1 usage found)
                    getTestArchive()  (1 usage found)
                        48 @Deployment(testable = false)
            com.sun.ts.tests.servlet.api.jakarta_servlet_http.httpservletrequest1  (1 usage found)
                URLClient.java  (1 usage found)
                    getTestArchive()  (1 usage found)
                        40 @Deployment(testable = false)
            com.sun.ts.tests.servlet.api.jakarta_servlet_http.httpservletrequest30  (1 usage found)
                URLClient.java  (1 usage found)
                    getTestArchive()  (1 usage found)
                        40 @Deployment(testable = false)
            com.sun.ts.tests.servlet.api.jakarta_servlet_http.httpservletrequest31  (1 usage found)
                URLClient.java  (1 usage found)
                    getTestArchive()  (1 usage found)
                        39 @Deployment(testable = false)
            com.sun.ts.tests.servlet.api.jakarta_servlet_http.httpservletrequest40  (1 usage found)
                Client.java  (1 usage found)
                    getTestArchive()  (1 usage found)
                        49 @Deployment(testable = false)
            com.sun.ts.tests.servlet.api.jakarta_servlet_http.httpservletrequestwrapper  (1 usage found)
                URLClient.java  (1 usage found)
                    getTestArchive()  (1 usage found)
                        39 @Deployment(testable = false)
            com.sun.ts.tests.servlet.api.jakarta_servlet_http.httpservletresponse  (1 usage found)
                URLClient.java  (1 usage found)
                    getTestArchive()  (1 usage found)
                        40 @Deployment(testable = false)
            com.sun.ts.tests.servlet.api.jakarta_servlet_http.httpservletresponse30  (1 usage found)
                URLClient.java  (1 usage found)
                    getTestArchive()  (1 usage found)
                        39 @Deployment(testable = false)
            com.sun.ts.tests.servlet.api.jakarta_servlet_http.httpservletresponse40  (1 usage found)
                Client.java  (1 usage found)
                    getTestArchive()  (1 usage found)
                        45 @Deployment(testable = false)
            com.sun.ts.tests.servlet.api.jakarta_servlet_http.httpservletresponsewrapper  (1 usage found)
                URLClient.java  (1 usage found)
                    getTestArchive()  (1 usage found)
                        39 @Deployment(testable = false)
            com.sun.ts.tests.servlet.api.jakarta_servlet_http.httpservletresponsewrapper30  (1 usage found)
                URLClient.java  (1 usage found)
                    getTestArchive()  (1 usage found)
                        40 @Deployment(testable = false)
            com.sun.ts.tests.servlet.api.jakarta_servlet_http.httpsession  (1 usage found)
                URLClient.java  (1 usage found)
                    getTestArchive()  (1 usage found)
                        41 @Deployment(testable = false)
            com.sun.ts.tests.servlet.api.jakarta_servlet_http.httpsessionactivationlistener40  (1 usage found)
                URLClient.java  (1 usage found)
                    getTestArchive()  (1 usage found)
                        40 @Deployment(testable = false)
            com.sun.ts.tests.servlet.api.jakarta_servlet_http.httpsessionattributelistener  (1 usage found)
                URLClient.java  (1 usage found)
                    getTestArchive()  (1 usage found)
                        40 @Deployment(testable = false)
            com.sun.ts.tests.servlet.api.jakarta_servlet_http.httpsessionattributelistener40  (1 usage found)
                URLClient.java  (1 usage found)
                    getTestArchive()  (1 usage found)
                        40 @Deployment(testable = false)
            com.sun.ts.tests.servlet.api.jakarta_servlet_http.httpsessionbindingevent  (1 usage found)
                URLClient.java  (1 usage found)
                    getTestArchive()  (1 usage found)
                        40 @Deployment(testable = false)
            com.sun.ts.tests.servlet.api.jakarta_servlet_http.httpsessionbindinglistener  (1 usage found)
                URLClient.java  (1 usage found)
                    getTestArchive()  (1 usage found)
                        40 @Deployment(testable = false)
            com.sun.ts.tests.servlet.api.jakarta_servlet_http.httpsessionbindinglistener40  (1 usage found)
                URLClient.java  (1 usage found)
                    getTestArchive()  (1 usage found)
                        41 @Deployment(testable = false)
            com.sun.ts.tests.servlet.api.jakarta_servlet_http.httpsessionevent  (1 usage found)
                URLClient.java  (1 usage found)
                    getTestArchive()  (1 usage found)
                        41 @Deployment(testable = false)
            com.sun.ts.tests.servlet.api.jakarta_servlet_http.httpsessionidlistener  (1 usage found)
                URLClient.java  (1 usage found)
                    getTestArchive()  (1 usage found)
                        39 @Deployment(testable = false)
            com.sun.ts.tests.servlet.api.jakarta_servlet_http.httpsessionlistener  (1 usage found)
                URLClient.java  (1 usage found)
                    getTestArchive()  (1 usage found)
                        40 @Deployment(testable = false)
            com.sun.ts.tests.servlet.api.jakarta_servlet_http.httpsessionlistener40  (1 usage found)
                URLClient.java  (1 usage found)
                    getTestArchive()  (1 usage found)
                        41 @Deployment(testable = false)
            com.sun.ts.tests.servlet.api.jakarta_servlet_http.httpsessionx  (2 usages found)
                URLClient.java  (2 usages found)
                    getTestArchive()  (1 usage found)
                        43 @Deployment(testable = false)
                    getTestArchive2()  (1 usage found)
                        51 @Deployment(testable = false, name = "servlet_jsh_httpsession2x_web")
            com.sun.ts.tests.servlet.api.jakarta_servlet_http.httpupgradehandler  (1 usage found)
                URLClient.java  (1 usage found)
                    getTestArchive()  (1 usage found)
                        47 @Deployment(testable = false)
            com.sun.ts.tests.servlet.api.jakarta_servlet_http.part  (1 usage found)
                URLClient.java  (1 usage found)
                    getTestArchive()  (1 usage found)
                        54 @Deployment(testable = false)
            com.sun.ts.tests.servlet.api.jakarta_servlet_http.part1  (1 usage found)
                URLClient.java  (1 usage found)
                    getTestArchive()  (1 usage found)
                        58 @Deployment(testable = false)
            com.sun.ts.tests.servlet.api.jakarta_servlet_http.readlistener  (1 usage found)
                URLClient.java  (1 usage found)
                    getTestArchive()  (1 usage found)
                        48 @Deployment(testable = false)
            com.sun.ts.tests.servlet.api.jakarta_servlet_http.readlistener1  (1 usage found)
                URLClient.java  (1 usage found)
                    getTestArchive()  (1 usage found)
                        52 @Deployment(testable = false)
            com.sun.ts.tests.servlet.api.jakarta_servlet_http.servletcontext303  (1 usage found)
                URLClient.java  (1 usage found)
                    getTestArchive()  (1 usage found)
                        40 @Deployment(testable = false)
            com.sun.ts.tests.servlet.api.jakarta_servlet_http.servletcontext304  (1 usage found)
                URLClient.java  (1 usage found)
                    getTestArchive()  (1 usage found)
                        40 @Deployment(testable = false)
            com.sun.ts.tests.servlet.api.jakarta_servlet_http.servletcontext305  (1 usage found)
                URLClient.java  (1 usage found)
                    getTestArchive()  (1 usage found)
                        40 @Deployment(testable = false)
            com.sun.ts.tests.servlet.api.jakarta_servlet_http.sessioncookieconfig  (1 usage found)
                URLClient.java  (1 usage found)
                    getTestArchive()  (1 usage found)
                        40 @Deployment(testable = false)
            com.sun.ts.tests.servlet.api.jakarta_servlet_http.writelistener  (1 usage found)
                URLClient.java  (1 usage found)
                    getTestArchive()  (1 usage found)
                        46 @Deployment(testable = false)
            com.sun.ts.tests.servlet.compat.LeadingSlash.WithLeadingSlash  (1 usage found)
                URLClient.java  (1 usage found)
                    getTestArchive()  (1 usage found)
                        36 @Deployment(testable = false)
            com.sun.ts.tests.servlet.compat.LeadingSlash.WithoutLeadingSlash  (1 usage found)
                URLClient.java  (1 usage found)
                    getTestArchive()  (1 usage found)
                        38 @Deployment(testable = false)
            com.sun.ts.tests.servlet.pluggability.aordering  (1 usage found)
                URLClient.java  (1 usage found)
                    getTestArchive()  (1 usage found)
                        36 @Deployment(testable = false)
            com.sun.ts.tests.servlet.pluggability.aordering1  (1 usage found)
                URLClient.java  (1 usage found)
                    getTestArchive()  (1 usage found)
                        36 @Deployment(testable = false)
            com.sun.ts.tests.servlet.pluggability.aordering2  (1 usage found)
                URLClient.java  (1 usage found)
                    getTestArchive()  (1 usage found)
                        39 @Deployment(testable = false)
            com.sun.ts.tests.servlet.pluggability.aordering3  (1 usage found)
                URLClient.java  (1 usage found)
                    getTestArchive()  (1 usage found)
                        38 @Deployment(testable = false)
            com.sun.ts.tests.servlet.pluggability.aordering4  (1 usage found)
                URLClient.java  (1 usage found)
                    getTestArchive()  (1 usage found)
                        41 @Deployment(testable = false)
            com.sun.ts.tests.servlet.pluggability.api.jakarta_servlet.asynccontext  (1 usage found)
                URLClient.java  (1 usage found)
                    getTestArchive()  (1 usage found)
                        49 @Deployment(testable = false)
            com.sun.ts.tests.servlet.pluggability.api.jakarta_servlet.asyncevent  (1 usage found)
                URLClient.java  (1 usage found)
                    getTestArchive()  (1 usage found)
                        41 @Deployment(testable = false)
            com.sun.ts.tests.servlet.pluggability.api.jakarta_servlet.dispatchertype  (1 usage found)
                URLClient.java  (1 usage found)
                    getTestArchive()  (1 usage found)
                        44 @Deployment(testable = false)
            com.sun.ts.tests.servlet.pluggability.api.jakarta_servlet.dofilter  (1 usage found)
                URLClient.java  (1 usage found)
                    getTestArchive()  (1 usage found)
                        49 @Deployment(testable = false)
            com.sun.ts.tests.servlet.pluggability.api.jakarta_servlet.filter  (1 usage found)
                URLClient.java  (1 usage found)
                    getTestArchive()  (1 usage found)
                        42 @Deployment(testable = false)
            com.sun.ts.tests.servlet.pluggability.api.jakarta_servlet.filterchain  (1 usage found)
                URLClient.java  (1 usage found)
                    getTestArchive()  (1 usage found)
                        41 @Deployment(testable = false)
            com.sun.ts.tests.servlet.pluggability.api.jakarta_servlet.filterconfig  (1 usage found)
                URLClient.java  (1 usage found)
                    getTestArchive()  (1 usage found)
                        50 @Deployment(testable = false)
            com.sun.ts.tests.servlet.pluggability.api.jakarta_servlet.filterrequestdispatcher  (1 usage found)
                URLClient.java  (1 usage found)
                    getTestArchive()  (1 usage found)
                        55 @Deployment(testable = false)
            com.sun.ts.tests.servlet.pluggability.api.jakarta_servlet.genericservlet  (1 usage found)
                URLClient.java  (1 usage found)
                    getTestArchive()  (1 usage found)
                        52 @Deployment(testable = false)
            com.sun.ts.tests.servlet.pluggability.api.jakarta_servlet.registration  (1 usage found)
                URLClient.java  (1 usage found)
                    getTestArchive()  (1 usage found)
                        55 @Deployment(testable = false)
            com.sun.ts.tests.servlet.pluggability.api.jakarta_servlet.requestdispatcher  (1 usage found)
                URLClient.java  (1 usage found)
                    getTestArchive()  (1 usage found)
                        48 @Deployment(testable = false)
            com.sun.ts.tests.servlet.pluggability.api.jakarta_servlet.scattributeevent  (1 usage found)
                URLClient.java  (1 usage found)
                    getTestArchive()  (1 usage found)
                        46 @Deployment(testable = false)
            com.sun.ts.tests.servlet.pluggability.api.jakarta_servlet.scattributelistener  (1 usage found)
                URLClient.java  (1 usage found)
                    getTestArchive()  (1 usage found)
                        45 @Deployment(testable = false)
            com.sun.ts.tests.servlet.pluggability.api.jakarta_servlet.scevent  (1 usage found)
                URLClient.java  (1 usage found)
                    getTestArchive()  (1 usage found)
                        45 @Deployment(testable = false)
            com.sun.ts.tests.servlet.pluggability.api.jakarta_servlet.sclistener  (1 usage found)
                URLClient.java  (1 usage found)
                    getTestArchive()  (1 usage found)
                        45 @Deployment(testable = false)
            com.sun.ts.tests.servlet.pluggability.api.jakarta_servlet.servlet  (1 usage found)
                URLClient.java  (1 usage found)
                    getTestArchive()  (1 usage found)
                        45 @Deployment(testable = false)
            com.sun.ts.tests.servlet.pluggability.api.jakarta_servlet.servletconfig  (1 usage found)
                URLClient.java  (1 usage found)
                    getTestArchive()  (1 usage found)
                        44 @Deployment(testable = false)
            com.sun.ts.tests.servlet.pluggability.api.jakarta_servlet.servletcontext  (1 usage found)
                URLClient.java  (1 usage found)
                    getTestArchive()  (1 usage found)
                        45 @Deployment(testable = false)
            com.sun.ts.tests.servlet.pluggability.api.jakarta_servlet.servletcontext30  (1 usage found)
                URLClient.java  (1 usage found)
                    getTestArchive()  (1 usage found)
                        73 @Deployment(testable = false)
            com.sun.ts.tests.servlet.pluggability.api.jakarta_servlet.servletexception  (1 usage found)
                URLClient.java  (1 usage found)
                    getTestArchive()  (1 usage found)
                        44 @Deployment(testable = false)
            com.sun.ts.tests.servlet.pluggability.api.jakarta_servlet.servletinputstream  (1 usage found)
                URLClient.java  (1 usage found)
                    getTestArchive()  (1 usage found)
                        45 @Deployment(testable = false)
            com.sun.ts.tests.servlet.pluggability.api.jakarta_servlet.servletoutputstream  (1 usage found)
                URLClient.java  (1 usage found)
                    getTestArchive()  (1 usage found)
                        44 @Deployment(testable = false)
            com.sun.ts.tests.servlet.pluggability.api.jakarta_servlet.servletrequest  (1 usage found)
                URLClient.java  (1 usage found)
                    getTestArchive()  (1 usage found)
                        46 @Deployment(testable = false)
            com.sun.ts.tests.servlet.pluggability.api.jakarta_servlet.servletrequest1  (1 usage found)
                URLClient.java  (1 usage found)
                    getTestArchive()  (1 usage found)
                        42 @Deployment(testable = false)
            com.sun.ts.tests.servlet.pluggability.api.jakarta_servlet.servletrequest30  (1 usage found)
                URLClient.java  (1 usage found)
                    getTestArchive()  (1 usage found)
                        47 @Deployment(testable = false)
            com.sun.ts.tests.servlet.pluggability.api.jakarta_servlet.servletrequestwrapper  (1 usage found)
                URLClient.java  (1 usage found)
                    getTestArchive()  (1 usage found)
                        47 @Deployment(testable = false)
            com.sun.ts.tests.servlet.pluggability.api.jakarta_servlet.servletrequestwrapper30  (1 usage found)
                URLClient.java  (1 usage found)
                    getTestArchive()  (1 usage found)
                        45 @Deployment(testable = false)
            com.sun.ts.tests.servlet.pluggability.api.jakarta_servlet.servletrequestwrapper30x  (1 usage found)
                URLClient.java  (1 usage found)
                    getTestArchive()  (1 usage found)
                        40 @Deployment(testable = false)
            com.sun.ts.tests.servlet.pluggability.api.jakarta_servlet.servletresponse  (1 usage found)
                URLClient.java  (1 usage found)
                    getTestArchive()  (1 usage found)
                        44 @Deployment(testable = false)
            com.sun.ts.tests.servlet.pluggability.api.jakarta_servlet.servletresponsewrapper  (1 usage found)
                URLClient.java  (1 usage found)
                    getTestArchive()  (1 usage found)
                        45 @Deployment(testable = false)
            com.sun.ts.tests.servlet.pluggability.api.jakarta_servlet.servletresponsewrapper30  (1 usage found)
                URLClient.java  (1 usage found)
                    getTestArchive()  (1 usage found)
                        40 @Deployment(testable = false)
            com.sun.ts.tests.servlet.pluggability.api.jakarta_servlet.sessiontrackingmode  (1 usage found)
                URLClient.java  (1 usage found)
                    getTestArchive()  (1 usage found)
                        45 @Deployment(testable = false)
            com.sun.ts.tests.servlet.pluggability.api.jakarta_servlet.srattributeevent  (1 usage found)
                URLClient.java  (1 usage found)
                    getTestArchive()  (1 usage found)
                        45 @Deployment(testable = false)
            com.sun.ts.tests.servlet.pluggability.api.jakarta_servlet.srattributelistener  (1 usage found)
                URLClient.java  (1 usage found)
                    getTestArchive()  (1 usage found)
                        45 @Deployment(testable = false)
            com.sun.ts.tests.servlet.pluggability.api.jakarta_servlet.srevent  (1 usage found)
                URLClient.java  (1 usage found)
                    getTestArchive()  (1 usage found)
                        44 @Deployment(testable = false)
            com.sun.ts.tests.servlet.pluggability.api.jakarta_servlet.srlistener  (1 usage found)
                URLClient.java  (1 usage found)
                    getTestArchive()  (1 usage found)
                        45 @Deployment(testable = false)
            com.sun.ts.tests.servlet.pluggability.api.jakarta_servlet.unavailableexception  (1 usage found)
                URLClient.java  (1 usage found)
                    getTestArchive()  (1 usage found)
                        45 @Deployment(testable = false)
            com.sun.ts.tests.servlet.pluggability.api.jakarta_servlet_http.cookie  (1 usage found)
                URLClient.java  (1 usage found)
                    getTestArchive()  (1 usage found)
                        58 @Deployment(testable = false)
            com.sun.ts.tests.servlet.pluggability.api.jakarta_servlet_http.httpservlet  (1 usage found)
                URLClient.java  (1 usage found)
                    getTestArchive()  (1 usage found)
                        48 @Deployment(testable = false)
            com.sun.ts.tests.servlet.pluggability.api.jakarta_servlet_http.httpservletrequest  (1 usage found)
                URLClient.java  (1 usage found)
                    getTestArchive()  (1 usage found)
                        50 @Deployment(testable = false)
            com.sun.ts.tests.servlet.pluggability.api.jakarta_servlet_http.httpservletrequest30  (1 usage found)
                URLClient.java  (1 usage found)
                    getTestArchive()  (1 usage found)
                        44 @Deployment(testable = false)
            com.sun.ts.tests.servlet.pluggability.api.jakarta_servlet_http.httpservletrequestwrapper  (1 usage found)
                URLClient.java  (1 usage found)
                    getTestArchive()  (1 usage found)
                        48 @Deployment(testable = false)
            com.sun.ts.tests.servlet.pluggability.api.jakarta_servlet_http.httpservletresponse  (1 usage found)
                URLClient.java  (1 usage found)
                    getTestArchive()  (1 usage found)
                        46 @Deployment(testable = false)
            com.sun.ts.tests.servlet.pluggability.api.jakarta_servlet_http.httpservletresponse30  (1 usage found)
                URLClient.java  (1 usage found)
                    getTestArchive()  (1 usage found)
                        42 @Deployment(testable = false)
            com.sun.ts.tests.servlet.pluggability.api.jakarta_servlet_http.httpservletresponsewrapper  (1 usage found)
                URLClient.java  (1 usage found)
                    getTestArchive()  (1 usage found)
                        45 @Deployment(testable = false)
            com.sun.ts.tests.servlet.pluggability.api.jakarta_servlet_http.httpservletresponsewrapper30  (1 usage found)
                URLClient.java  (1 usage found)
                    getTestArchive()  (1 usage found)
                        44 @Deployment(testable = false)
            com.sun.ts.tests.servlet.pluggability.api.jakarta_servlet_http.httpsession  (1 usage found)
                URLClient.java  (1 usage found)
                    getTestArchive()  (1 usage found)
                        46 @Deployment(testable = false)
            com.sun.ts.tests.servlet.pluggability.api.jakarta_servlet_http.httpsessionattributelistener  (1 usage found)
                URLClient.java  (1 usage found)
                    getTestArchive()  (1 usage found)
                        45 @Deployment(testable = false)
            com.sun.ts.tests.servlet.pluggability.api.jakarta_servlet_http.httpsessionbindingevent  (1 usage found)
                URLClient.java  (1 usage found)
                    getTestArchive()  (1 usage found)
                        45 @Deployment(testable = false)
            com.sun.ts.tests.servlet.pluggability.api.jakarta_servlet_http.httpsessionbindinglistener  (1 usage found)
                URLClient.java  (1 usage found)
                    getTestArchive()  (1 usage found)
                        45 @Deployment(testable = false)
            com.sun.ts.tests.servlet.pluggability.api.jakarta_servlet_http.httpsessionevent  (1 usage found)
                URLClient.java  (1 usage found)
                    getTestArchive()  (1 usage found)
                        45 @Deployment(testable = false)
            com.sun.ts.tests.servlet.pluggability.api.jakarta_servlet_http.httpsessionlistener  (1 usage found)
                URLClient.java  (1 usage found)
                    getTestArchive()  (1 usage found)
                        45 @Deployment(testable = false)
            com.sun.ts.tests.servlet.pluggability.api.jakarta_servlet_http.sessioncookieconfig  (1 usage found)
                URLClient.java  (1 usage found)
                    getTestArchive()  (1 usage found)
                        45 @Deployment(testable = false)
            com.sun.ts.tests.servlet.pluggability.fragment  (1 usage found)
                URLClient.java  (1 usage found)
                    getTestArchive()  (1 usage found)
                        41 @Deployment(testable = false)
            com.sun.ts.tests.servlet.spec.annotationservlet.webfilter  (1 usage found)
                URLClient.java  (1 usage found)
                    getTestArchive()  (1 usage found)
                        40 @Deployment(testable = false)
            com.sun.ts.tests.servlet.spec.annotationservlet.weblistener  (1 usage found)
                URLClient.java  (1 usage found)
                    getTestArchive()  (1 usage found)
                        40 @Deployment(testable = false)
            com.sun.ts.tests.servlet.spec.annotationservlet.webservlet  (1 usage found)
                URLClient.java  (1 usage found)
                    getTestArchive()  (1 usage found)
                        39 @Deployment(testable = false)
            com.sun.ts.tests.servlet.spec.annotationservlet.webservletapi  (1 usage found)
                URLClient.java  (1 usage found)
                    getTestArchive()  (1 usage found)
                        44 @Deployment(testable = false)
            com.sun.ts.tests.servlet.spec.annotationservlet.webservletdd  (1 usage found)
                URLClient.java  (1 usage found)
                    getTestArchive()  (1 usage found)
                        44 @Deployment(testable = false)
            com.sun.ts.tests.servlet.spec.async  (1 usage found)
                URLClient.java  (1 usage found)
                    getTestArchive()  (1 usage found)
                        34 @Deployment(testable = false)
            com.sun.ts.tests.servlet.spec.defaultcontextpath  (1 usage found)
                URLClient.java  (1 usage found)
                    getTestArchive()  (1 usage found)
                        37 @Deployment(testable = false)
            com.sun.ts.tests.servlet.spec.defaultmapping  (1 usage found)
                URLClient.java  (1 usage found)
                    getTestArchive()  (1 usage found)
                        35 @Deployment(testable = false)
            com.sun.ts.tests.servlet.spec.dir_struct  (1 usage found)
                URLClient.java  (1 usage found)
                    getTestArchive()  (1 usage found)
                        40 @Deployment(testable = false)
            com.sun.ts.tests.servlet.spec.errorpage  (1 usage found)
                URLClient.java  (1 usage found)
                    getTestArchive()  (1 usage found)
                        42 @Deployment(testable = false)
            com.sun.ts.tests.servlet.spec.errorpage1  (1 usage found)
                URLClient.java  (1 usage found)
                    getTestArchive()  (1 usage found)
                        45 @Deployment(testable = false)
            com.sun.ts.tests.servlet.spec.httpservletresponse  (1 usage found)
                URLClient.java  (1 usage found)
                    getTestArchive()  (1 usage found)
                        41 @Deployment(testable = false)
            com.sun.ts.tests.servlet.spec.i18n.encoding  (1 usage found)
                URLClient.java  (1 usage found)
                    getTestArchive()  (1 usage found)
                        41 @Deployment(testable = false)
            com.sun.ts.tests.servlet.spec.listenerorder  (1 usage found)
                URLClient.java  (1 usage found)
                    getTestArchive()  (1 usage found)
                        34 @Deployment(testable = false)
            com.sun.ts.tests.servlet.spec.multifiltermapping  (1 usage found)
                URLClient.java  (1 usage found)
                    getTestArchive()  (1 usage found)
                        46 @Deployment(testable = false)
            com.sun.ts.tests.servlet.spec.pluggability.ordering.test1  (1 usage found)
                URLClient.java  (1 usage found)
                    getTestArchive()  (1 usage found)
                        57 @Deployment(testable = false)
            com.sun.ts.tests.servlet.spec.protocols.http  (1 usage found)
                URLClient.java  (1 usage found)
                    getTestArchive()  (1 usage found)
                        42 @Deployment(testable = false)
            com.sun.ts.tests.servlet.spec.rdspecialchar  (1 usage found)
                URLClient.java  (1 usage found)
                    getTestArchive()  (1 usage found)
                        41 @Deployment(testable = false)
            com.sun.ts.tests.servlet.spec.requestdispatcher  (1 usage found)
                URLClient.java  (1 usage found)
                    getTestArchive()  (1 usage found)
                        40 @Deployment(testable = false)
            com.sun.ts.tests.servlet.spec.requestmap  (1 usage found)
                URLClient.java  (1 usage found)
                    getTestArchive()  (1 usage found)
                        34 @Deployment(testable = false)
            com.sun.ts.tests.servlet.spec.security.annotations  (1 usage found)
                Client.java  (1 usage found)
                    getTestArchive()  (1 usage found)
                        78 @Deployment(testable = false)
            com.sun.ts.tests.servlet.spec.security.clientcert  (1 usage found)
                Client.java  (1 usage found)
                    getTestArchive()  (1 usage found)
                        72 @Deployment(testable = false, name = "webapp-https")
            com.sun.ts.tests.servlet.spec.security.clientcertanno  (1 usage found)
                Client.java  (1 usage found)
                    getTestArchive()  (1 usage found)
                        55 @Deployment(testable = false, name = "webapp-https")
            com.sun.ts.tests.servlet.spec.security.denyUncovered  (1 usage found)
                Client.java  (1 usage found)
                    getTestArchive()  (1 usage found)
                        54 @Deployment(testable = false)
            com.sun.ts.tests.servlet.spec.security.metadatacomplete  (1 usage found)
                Client.java  (1 usage found)
                    getTestArchive()  (1 usage found)
                        42 @Deployment(testable = false)
            com.sun.ts.tests.servlet.spec.security.secbasic  (1 usage found)
                Client.java  (1 usage found)
                    getTestArchive()  (1 usage found)
                        48 @Deployment(testable = false)
            com.sun.ts.tests.servlet.spec.security.secform  (1 usage found)
                Client.java  (1 usage found)
                    getTestArchive()  (1 usage found)
                        46 @Deployment(testable = false)
            com.sun.ts.tests.servlet.spec.serverpush  (1 usage found)
                Client.java  (1 usage found)
                    getTestArchive()  (1 usage found)
                        64 @Deployment(testable = false)
            com.sun.ts.tests.servlet.spec.servletcontext  (1 usage found)
                URLClient.java  (1 usage found)
                    getTestArchive()  (1 usage found)
                        37 @Deployment(testable = false)
            com.sun.ts.tests.servlet.spec.servletmapping  (1 usage found)
                URLClient.java  (1 usage found)
                    getTestArchive()  (1 usage found)
                        34 @Deployment(testable = false)
            com.sun.ts.tests.servlet.spec.servletresponse  (1 usage found)
                URLClient.java  (1 usage found)
                    getTestArchive()  (1 usage found)
                        41 @Deployment(testable = false)
            com.sun.ts.tests.servlet.spec.srlistener  (1 usage found)
                URLClient.java  (1 usage found)
                    getTestArchive()  (1 usage found)
                        41 @Deployment(testable = false)
            com.sun.ts.tests.servlet.spec.webapps.accesswebinf  (1 usage found)
                URLClient.java  (1 usage found)
                    getTestArchive()  (1 usage found)
                        34 @Deployment(testable = false)
            com.sun.ts.tests.servlet.spec.welcomefiles  (1 usage found)
                URLClient.java  (1 usage found)
                    getTestArchive()  (1 usage found)
                        37 @Deployment(testable = false)
```