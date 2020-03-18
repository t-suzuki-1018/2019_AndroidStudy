package com.sample.droider.legacyrecipeapp.util;

import com.sample.droider.legacyrecipeapp.activity.RecipeListActivity;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.robolectric.Robolectric;
import org.robolectric.RobolectricTestRunner;
import org.robolectric.annotation.Config;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

@RunWith(RobolectricTestRunner.class)
@Config(manifest = Config.NONE)
public class RobolectricDimensUtilTest {

    RecipeListActivity mRecipeListActivity;

    @Before
    public void setUp() {
        mRecipeListActivity = Robolectric.buildActivity(RecipeListActivity.class).setup().get();
    }

    @Test
    public void dpToPx() {
        int expected = 0;
        int actual = DimensUtil.dpToPx(0, mRecipeListActivity);
        assertThat(actual, is(expected));
    }

    @Test
    public void pxToDp() {
        int expected = 0;
        int actual = DimensUtil.pxToDp(0, mRecipeListActivity);
        assertThat(actual, is(expected));
    }
}