package com.sample.droider.legacyrecipeapp.activity


import android.view.View
import android.view.ViewGroup
import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.action.ViewActions.click
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.matcher.ViewMatchers.*
import androidx.test.filters.LargeTest
import androidx.test.rule.ActivityTestRule
import androidx.test.runner.AndroidJUnit4
import com.sample.droider.legacyrecipeapp.R
import org.hamcrest.Description
import org.hamcrest.Matcher
import org.hamcrest.Matchers.`is`
import org.hamcrest.Matchers.allOf
import org.hamcrest.TypeSafeMatcher
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith

@LargeTest
@RunWith(AndroidJUnit4::class)
class RecipeListActivityTest2 {

    @Rule @JvmField
    var mActivityTestRule = ActivityTestRule(RecipeListActivity::class.java)

    @Test
    fun recipeListActivityTest2() {
        val cardView = onView(
                allOf(childAtPosition(
                        allOf(withId(R.id.recycler),
                                childAtPosition(
                                        withClassName(`is`("android.widget.FrameLayout")),
                                        0)),
                        0),
                        isDisplayed()))
        cardView.perform(click())

        val textView = onView(
                allOf(withId(R.id.text_introduction),
                        childAtPosition(
                                childAtPosition(
                                        withId(R.id.recycler),
                                        1),
                                0),
                        isDisplayed()))
        textView.check(matches(withText("味も見た目もよし！のハンバーグです。")))
    }

    private fun childAtPosition(
            parentMatcher: Matcher<View>, position: Int): Matcher<View> {

        return object : TypeSafeMatcher<View>() {
            override fun describeTo(description: Description) {
                description.appendText("Child at position $position in parent ")
                parentMatcher.describeTo(description)
            }

            public override fun matchesSafely(view: View): Boolean {
                val parent = view.parent
                return (parent is ViewGroup && parentMatcher.matches(parent)
                        && view == parent.getChildAt(position))
            }
        }
    }
}
