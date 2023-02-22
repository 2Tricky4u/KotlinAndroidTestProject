package com.github.Tricky4u.bootcamp

import android.content.Context
import android.content.Intent
import androidx.test.core.app.ApplicationProvider
import androidx.test.ext.junit.runners.AndroidJUnit4
import androidx.test.filters.MediumTest
import androidx.test.rule.ServiceTestRule
import org.hamcrest.MatcherAssert.*
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4::class)
@MediumTest
class MainActivityTest {
    @get:Rule
    val serviceRule = ServiceTestRule()

    //@Test
    //fun testWithStartedService() {
    //    serviceRule.startService(
    //        Intent(ApplicationProvider.getApplicationContext<Context>(),
    //            MyService::class.java))
    //    // Add your test code here.
    //}

    //@Test fun testWithBoundService() {
    //    val binder = serviceRule.bindService(
    //        Intent(
    //            ApplicationProvider.getApplicationContext(),
    //            MyService::class.java)
    //    )
    //    val service = (binder as MyService.LocalBinder).service
    //    assertThat(service.doSomethingToReturnTrue()).isTrue()
    //}
}