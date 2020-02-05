package com.sample.droider.legacyrecipeapp.util

import android.content.Context
import androidx.test.platform.app.InstrumentationRegistry
import org.junit.Before
import org.junit.Test

import org.hamcrest.CoreMatchers.`is`
import org.junit.Assert.*

class DimensUtilTest {

    private var context: Context? = null
    private var dp: Int = 0
    private var px: Int = 0

    @Before
    @Throws(Exception::class)
    fun setUp() {
        context = InstrumentationRegistry.getInstrumentation().targetContext.applicationContext
        dp = 10
        px = 10
    }

    @Test
    fun dpToPxDpi420() {
        val actual = DimensUtil.dpToPx(dp, context!!)
        val expected = 26
        assertThat(actual, `is`(expected))

    }

    @Test
    fun pxToDpDpi420() {
        val actual = DimensUtil.pxToDp(px, context!!)
        val expected = 4
        assertThat(actual, `is`(expected))
    }

    @Test
    fun dpToPxDpi560() {
        val actual = DimensUtil.dpToPx(dp, context!!)
        val expected = 35
        assertThat(actual, `is`(expected))

    }

    @Test
    fun pxToDpDpi560() {
        val actual = DimensUtil.pxToDp(px, context!!)
        val expected = 3
        assertThat(actual, `is`(expected))
    }
}