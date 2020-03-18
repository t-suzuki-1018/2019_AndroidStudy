package com.sample.droider.legacyrecipeapp.util;

import android.os.Build;
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
@Config(sdk = Build.VERSION_CODES.P)
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

/* 以下のようなエラーの解決ができなかったので、テスト作成間に合いませんでした。申し訳ありません。

"/Applications/Android Studio 2.app/Contents/jre/jdk/Contents/Home/bin/java" -ea -Didea.test.cyclic.buffer.size=1048576 "-javaagent:/Applications/Android Studio 2.app/Contents/lib/idea_rt.jar=58439:/Applications/Android Studio 2.app/Contents/bin" -Dfile.encoding=UTF-8 -classpath "/Applications/Android Studio 2.app/Contents/lib/idea_rt.jar:/Applications/Android Studio 2.app/Contents/plugins/junit/lib/junit-rt.jar:/Applications/Android Studio 2.app/Contents/plugins/junit/lib/junit5-rt.jar:/Users/suzukitomoya/Library/Android/sdk/platforms/android-28/data/res:/Users/suzukitomoya/2019_AndroidStudy/LegacyRecipeApp/app/build/intermediates/javac/debugUnitTest/compileDebugUnitTestJavaWithJavac/classes:/Users/suzukitomoya/2019_AndroidStudy/LegacyRecipeApp/app/build/intermediates/javac/debug/compileDebugJavaWithJavac/classes:/Users/suzukitomoya/2019_AndroidStudy/LegacyRecipeApp/app/build/tmp/kotlin-classes/debugUnitTest:/Users/suzukitomoya/2019_AndroidStudy/LegacyRecipeApp/app/build/tmp/kotlin-classes/debug:/Users/suzukitomoya/2019_AndroidStudy/LegacyRecipeApp/app/build/generated/res/resValues/debug:/Users/suzukitomoya/.gradle/caches/modules-2/files-2.1/backport-util-concurrent/backport-util-concurrent/3.1/682f7ac17fed79e92f8e87d8455192b63376347b/backport-util-concurrent-3.1.jar:/Users/suzukitomoya/.gradle/caches/transforms-2/files-2.1/32d10174114a95720b33a2cfae1fc831/jars/classes.jar:/Users/suzukitomoya/.gradle/caches/transforms-2/files-2.1/81ab55d604136fbabc62ec8c1f83aba8/res:/Users/suzukitomoya/.gradle/caches/transforms-2/files-2.1/81ab55d604136fbabc62ec8c1f83aba8/jars/classes.jar:/Users/suzukitomoya/.gradle/caches/transforms-2/files-2.1/9ed592cf71a4470e05c0f5da59e6b34b/jars/classes.jar:/Users/suzukitomoya/.gradle/caches/modules-2/files-2.1/org.apache.maven/maven-project/2.2.1/8239e98c16f641d55a4ad0e0bab0aee3aff8933f/maven-project-2.2.1.jar:/Users/suzukitomoya/.gradle/caches/modules-2/files-2.1/org.apache.maven.wagon/wagon-file/1.0-beta-6/6c53633505460caf49d2660de1e24744d915afb9/wagon-file-1.0-beta-6.jar:/Users/suzukitomoya/.gradle/caches/modules-2/files-2.1/org.apache.maven.wagon/wagon-provider-api/1.0-beta-6/3f952e0282ae77ae59851d96bb18015e520b6208/wagon-provider-api-1.0-beta-6.jar:/Users/suzukitomoya/.gradle/caches/modules-2/files-2.1/androidx.collection/collection/1.1.0/1f27220b47669781457de0d600849a5de0e89909/collection-1.1.0.jar:/Users/suzukitomoya/.gradle/caches/transforms-2/files-2.1/52a4d69dc652a7a3bc84022fcc1d6c2e/jars/classes.jar:/Users/suzukitomoya/.gradle/caches/modules-2/files-2.1/org.ow2.asm/asm-commons/7.0/478006d07b7c561ae3a92ddc1829bca81ae0cdd1/asm-commons-7.0.jar:/Users/suzukitomoya/.gradle/caches/modules-2/files-2.1/com.google.errorprone/error_prone_annotations/2.2.0/88e3c593e9b3586e1c6177f89267da6fc6986f0c/error_prone_annotations-2.2.0.jar:/Users/suzukitomoya/.gradle/caches/modules-2/files-2.1/org.jetbrains/annotations/13.0/919f0dfe192fb4e063e7dacadee7f8bb9a2672a9/annotations-13.0.jar:/Users/suzukitomoya/.gradle/caches/modules-2/files-2.1/org.ow2.asm/asm-analysis/7.0/4b310d20d6f1c6b7197a75f1b5d69f169bc8ac1f/asm-analysis-7.0.jar:/Users/suzukitomoya/.gradle/caches/modules-2/files-2.1/javax.inject/javax.inject/1/6975da39a7040257bd51d21a231b76c915872d38/javax.inject-1.jar:/Users/suzukitomoya/.gradle/caches/modules-2/files-2.1/org.jetbrains.kotlin/kotlin-stdlib/1.3.50/b529d1738c7e98bbfa36a4134039528f2ce78ebf/kotlin-stdlib-1.3.50.jar:/Users/suzukitomoya/.gradle/caches/transforms-2/files-2.1/a7a0a5fd99bf3238b3934633747a8ffd/jars/classes.jar:/Users/suzukitomoya/.gradle/caches/modules-2/files-2.1/com.squareup.okhttp3/okhttp/4.2.1/95a4734e997bb01f20535ad58bc0a789d60626f2/okhttp-4.2.1.jar:/Users/suzukitomoya/.gradle/caches/modules-2/files-2.1/com.google.code.findbugs/jsr305/3.0.2/25ea2e8b0c338a877313bd4672d3fe056ea78f0d/jsr305-3.0.2.jar:/Users/suzukitomoya/.gradle/caches/transforms-2/files-2.1/0d9be87b53bc5122a5be2a0399673855/jars/classes.jar:/Users/suzukitomoya/.gradle/caches/modules-2/files-2.1/com.almworks.sqlite4java/sqlite4java/0.282/745a7e2f35fdbe6336922e0d492c979dbbfa74fb/sqlite4java-0.282.jar:/Users/suzukitomoya/.gradle/caches/modules-2/files-2.1/org.apache.maven/maven-settings/2.2.1/2236ffe71fa5f78ce42b0f5fc22c54ed45f14294/maven-settings-2.2.1.jar:/Users/suzukitomoya/.gradle/caches/transforms-2/files-2.1/5ae85ecc72a2ff3d4aef2243fdfaf569/jars/classes.jar:/Users/suzukitomoya/.gradle/caches/transforms-2/files-2.1/5ae85ecc72a2ff3d4aef2243fdfaf569/res:/Users/suzukitomoya/.gradle/caches/modules-2/files-2.1/org.jetbrains.kotlin/kotlin-android-extensions-runtime/1.3.31/721b62ccbafe51a284ca0d1c5dcfdce8cedd4255/kotlin-android-extensions-runtime-1.3.31.jar:/Users/suzukitomoya/.gradle/caches/modules-2/files-2.1/org.codehaus.plexus/plexus-container-default/1.0-alpha-9-stable-1/94aea3010e250a334d9dab7f591114cd6c767458/plexus-container-default-1.0-alpha-9-stable-1.jar:/Users/suzukitomoya/.gradle/caches/modules-2/files-2.1/org.bouncycastle/bcprov-jdk15on/1.52/88a941faf9819d371e3174b5ed56a3f3f7d73269/bcprov-jdk15on-1.52.jar:/Users/suzukitomoya/.gradle/caches/modules-2/files-2.1/androidx.arch.core/core-common/2.1.0/b3152fc64428c9354344bd89848ecddc09b6f07e/core-common-2.1.0.jar:/Users/suzukitomoya/.gradle/caches/transforms-2/files-2.1/3b69501c85d388b1c934794a5956d8a0/jars/classes.jar:/Users/suzukitomoya/.gradle/caches/modules-2/files-2.1/com.google.guava/failureaccess/1.0.1/1dcf1de382a0bf95a3d8b0849546c88bac1292c9/failureaccess-1.0.1.jar:/Users/suzukitomoya/.gradle/caches/modules-2/files-2.1/org.apache.maven/maven-plugin-registry/2.2.1/72a24b7775649af78f3986b5aa7eb354b9674cfd/maven-plugin-registry-2.2.1.jar:/Users/suzukitomoya/.gradle/caches/modules-2/files-2.1/org.robolectric/utils/4.3.1/ae572384d7fc49713ef3fc2061a81b45aefe9eb7/utils-4.3.1.jar:/Users/suzukitomoya/.gradle/caches/modules-2/files-2.1/com.ibm.icu/icu4j/53.1/786d9055d4ca8c1aab4a7d4ac8283f973fd7e41f/icu4j-53.1.jar:/Users/suzukitomoya/.gradle/caches/modules-2/files-2.1/org.robolectric/shadowapi/4.3.1/a93e55b36c418aa3afc17c26eac82590a3bfb63e/shadowapi-4.3.1.jar:/Users/suzukitomoya/.gradle/caches/transforms-2/files-2.1/2a70c1fd4352183b4824e24b8ba95aad/res:/Users/suzukitomoya/.gradle/caches/transforms-2/files-2.1/2a70c1fd4352183b4824e24b8ba95aad/jars/classes.jar:/Users/suzukitomoya/.gradle/caches/modules-2/files-2.1/org.apache.ant/ant-launcher/1.8.0/8b53ba16fa62fb1034da8f1de200ddc407c8381/ant-launcher-1.8.0.jar:/Users/suzukitomoya/.gradle/caches/modules-2/files-2.1/org.apache.maven/maven-profile/2.2.1/3950071587027e5086e9c395574a60650c432738/maven-profile-2.2.1.jar:/Users/suzukitomoya/.gradle/caches/modules-2/files-2.1/nekohtml/nekohtml/1.9.6.2/2d960be7b62ae6622dbbbe49ab4ffdc609f85c80/nekohtml-1.9.6.2.jar:/Users/suzukitomoya/.gradle/caches/modules-2/files-2.1/nekohtml/xercesMinimal/1.9.6.2/d1c5e063683a0e6f77cd5f051a9d4af48346fa6/xercesMinimal-1.9.6.2.jar:/Users/suzukitomoya/.gradle/caches/transforms-2/files-2.1/46421d6f116e511a54427c2ec8f1b98b/jars/classes.jar:/Users/suzukitomoya/.gradle/caches/modules-2/files-2.1/org.hamcrest/hamcrest-core/1.3/42a25dc3219429f0e5d060061f71acb49bf010a0/hamcrest-core-1.3.jar:/Users/suzukitomoya/.gradle/caches/modules-2/files-2.1/com.squareup.okio/okio/2.2.2/36f483536153f15339a8b48d508e22be7c9c531a/okio-2.2.2.jar:/Users/suzukitomoya/.gradle/caches/modules-2/files-2.1/com.google.android.apps.common.testing.accessibility.framework/accessibility-test-framework/2.1/c2d6267c3ad0435ddf9e27a94a0e0af4ca3fdfbb/accessibility-test-framework-2.1.jar:/Users/suzukitomoya/.gradle/caches/modules-2/files-2.1/org.ow2.asm/asm/7.0/d74d4ba0dee443f68fb2dcb7fcdb945a2cd89912/asm-7.0.jar:/Users/suzukitomoya/.gradle/caches/transforms-2/files-2.1/537710e37057193c71dc946ce5dcc97d/jars/classes.jar:/Users/suzukitomoya/.gradle/caches/modules-2/files-2.1/org.apache.maven/maven-artifact/2.2.1/23600f790d4dab2cb965419eaa982e3e84c428f8/maven-artifact-2.2.1.jar:/Users/suzukitomoya/.gradle/caches/modules-2/files-2.1/com.google.guava/listenablefuture/9999.0-empty-to-avoid-conflict-with-guava/b421526c5f297295adef1c886e5246c39d4ac629/listenablefuture-9999.0-empty-to-avoid-conflict-with-guava.jar:/Users/suzukitomoya/.gradle/caches/modules-2/files-2.1/javax.annotation/javax.annotation-api/1.3.2/934c04d3cfef185a8008e7bf34331b79730a9d43/javax.annotation-api-1.3.2.jar:/Users/suzukitomoya/.gradle/caches/modules-2/files-2.1/org.robolectric/junit/4.3.1/4f04c077a385c47801946ffa080a6beb19ba9ee/junit-4.3.1.jar:/Users/suzukitomoya/.gradle/caches/transforms-2/files-2.1/1f0ccaf93516f3205417fdb1da2ae757/jars/classes.jar:/Users/suzukitomoya/.gradle/caches/modules-2/files-2.1/org.apache.maven/maven-error-diagnostics/2.2.1/e81bb342d7d172f23d108dc8fa979a1facdcde8e/maven-error-diagnostics-2.2.1.jar:/Users/suzukitomoya/.gradle/caches/modules-2/files-2.1/com.google.auto/auto-common/0.8/c6f7af0e57b9d69d81b05434ef9f3c5610d498c4/auto-common-0.8.jar:/Users/suzukitomoya/.gradle/caches/transforms-2/files-2.1/e79e95e6b9712f6e5113cb1300d66a5f/res:/Users/suzukitomoya/.gradle/caches/transforms-2/files-2.1/e79e95e6b9712f6e5113cb1300d66a5f/jars/classes.jar:/Users/suzukitomoya/.gradle/caches/transforms-2/files-2.1/869ed90508d3e30387b4eeebad1225ac/jars/classes.jar:/Users/suzukitomoya/.gradle/caches/modules-2/files-2.1/org.ow2.asm/asm-tree/7.0/29bc62dcb85573af6e62e5b2d735ef65966c4180/asm-tree-7.0.jar:/Users/suzukitomoya/.gradle/caches/modules-2/files-2.1/org.apache.maven.wagon/wagon-http-lightweight/1.0-beta-6/b3815078570c3b1f0667e123d59717c6b726c6c2/wagon-http-lightweight-1.0-beta-6.jar:/Users/suzukitomoya/.gradle/caches/transforms-2/files-2.1/1210164c7b4713c17bee9a0d13f02d4f/jars/classes.jar:/Users/suzukitomoya/.gradle/caches/modules-2/files-2.1/org.apache.ant/ant/1.8.0/7b456ca6b93900f96e58cc8371f03d90a9c1c8d1/ant-1.8.0.jar:/Users/suzukitomoya/.gradle/caches/transforms-2/files-2.1/960141742b5af9a5c74ac3b442d5026b/jars/classes.jar:/Users/suzukitomoya/.gradle/caches/modules-2/files-2.1/org.ow2.asm/asm-util/7.0/18d4d07010c24405129a6dbb0e92057f8779fb9d/asm-util-7.0.jar:/Users/suzukitomoya/.gradle/caches/modules-2/files-2.1/org.robolectric/utils-reflector/4.3.1/2e8444b02656d03df82334c6f2b062a3da46f0bc/utils-reflector-4.3.1.jar:/Users/suzukitomoya/.gradle/caches/modules-2/files-2.1/com.google.j2objc/j2objc-annotations/1.1/ed28ded51a8b1c6b112568def5f4b455e6809019/j2objc-annotations-1.1.jar:/Users/suzukitomoya/.gradle/caches/modules-2/files-2.1/com.google.auto.service/auto-service/1.0-rc4/44954d465f3b9065388bbd2fc08a3eb8fd07917c/auto-service-1.0-rc4.jar:/Users/suzukitomoya/.gradle/caches/transforms-2/files-2.1/35ee1e807ad77b521d86719a4e50105c/jars/classes.jar:/Users/suzukitomoya/.gradle/caches/modules-2/files-2.1/org.apache.maven/maven-artifact-manager/2.2.1/ec355b913c34d37080810f98e3f51abecbe1572b/maven-artifact-manager-2.2.1.jar:/Users/suzukitomoya/.gradle/caches/modules-2/files-2.1/androidx.annotation/annotation/1.1.0/e3a6fb2f40e3a3842e6b7472628ba4ce416ea4c8/annotation-1.1.0.jar:/Users/suzukitomoya/.gradle/caches/transforms-2/files-2.1/ed251e1fbadbcab81d8a3928302c3462/jars/classes.jar:/Users/suzukitomoya/.gradle/caches/modules-2/files-2.1/com.google.code.gson/gson/2.8.6/9180733b7df8542621dc12e21e87557e8c99b8cb/gson-2.8.6.jar:/Users/suzukitomoya/.gradle/caches/transforms-2/files-2.1/db5e29bad92ebe049c2aa1fe0ef5463a/jars/classes.jar:/Users/suzukitomoya/.gradle/caches/modules-2/files-2.1/org.apache.maven/maven-ant-tasks/2.1.3/b09be554228d66d208e5fef5266844aacf443abc/maven-ant-tasks-2.1.3.jar:/Users/suzukitomoya/.gradle/caches/modules-2/files-2.1/org.robolectric/pluginapi/4.3.1/48807e74eba780ea0261de605c021195f511f990/pluginapi-4.3.1.jar:/Users/suzukitomoya/.gradle/caches/modules-2/files-2.1/com.google.protobuf/protobuf-java/2.6.1/d9521f2aecb909835746b7a5facf612af5e890e8/protobuf-java-2.6.1.jar:/Users/suzukitomoya/.gradle/caches/modules-2/files-2.1/org.checkerframework/checker-qual/2.5.2/cea74543d5904a30861a61b4643a5f2bb372efc4/checker-qual-2.5.2.jar:/Users/suzukitomoya/.gradle/caches/modules-2/files-2.1/org.robolectric/resources/4.3.1/ccc69608304ec4c36e8b26d7fe7f48d7bec1dd0b/resources-4.3.1.jar:/Users/suzukitomoya/.gradle/caches/transforms-2/files-2.1/2343fbb7d2f6d3982fa64b603c55640d/jars/classes.jar:/Users/suzukitomoya/.gradle/caches/transforms-2/files-2.1/2343fbb7d2f6d3982fa64b603c55640d/res:/Users/suzukitomoya/.gradle/caches/transforms-2/files-2.1/6fa8b559db8e479246d97ccc99f36b71/jars/classes.jar:/Users/suzukitomoya/.gradle/caches/modules-2/files-2.1/org.apache.maven.wagon/wagon-http-shared/1.0-beta-6/ccd70d7e0d8c085e648a83f072da06ca9a53be94/wagon-http-shared-1.0-beta-6.jar:/Users/suzukitomoya/.gradle/caches/modules-2/files-2.1/org.jetbrains.kotlin/kotlin-stdlib-common/1.3.50/3d9cd3e1bc7b92e95f43d45be3bfbcf38e36ab87/kotlin-stdlib-common-1.3.50.jar:/Users/suzukitomoya/.gradle/caches/modules-2/files-2.1/org.robolectric/annotations/4.3.1/5ba2cdb5be608a05ae01e27c8d3675a86b34b4f3/annotations-4.3.1.jar:/Users/suzukitomoya/.gradle/caches/transforms-2/files-2.1/fd065e03a72b999b6c8981617d04a71c/jars/classes.jar:/Users/suzukitomoya/.gradle/caches/modules-2/files-2.1/org.robolectric/sandbox/4.3.1/4b1b82b661ebc747a6e4ddcfdbfc939e9cd24886/sandbox-4.3.1.jar:/Users/suzukitomoya/.gradle/caches/modules-2/files-2.1/org.apache.maven/maven-model/2.2.1/c0a1c17436ec3ff5a56207c031d82277b4250a29/maven-model-2.2.1.jar:/Users/suzukitomoya/.gradle/caches/modules-2/files-2.1/org.apache.maven/maven-repository-metadata/2.2.1/98f0c07fcf1eeb213bef8d9316a9935184084b06/maven-repository-metadata-2.2.1.jar:/Users/suzukitomoya/.gradle/caches/modules-2/files-2.1/junit/junit/4.12/2973d150c0dc1fefe998f834810d68f278ea58ec/junit-4.12.jar:/Users/suzukitomoya/.gradle/caches/transforms-2/files-2.1/4acdf1e1505eb4d1ffc802b1c7146cff/jars/classes.jar:/Users/suzukitomoya/.gradle/caches/modules-2/files-2.1/org.robolectric/robolectric/4.3.1/b7374ec0a3695a741ca984b9eaaa80632fb4a7f0/robolectric-4.3.1.jar:/Users/suzukitomoya/.gradle/caches/modules-2/files-2.1/org.robolectric/shadows-framework/4.3.1/da048a93951f4d9e46519749c53b0f868dfdf425/shadows-framework-4.3.1.jar:/Users/suzukitomoya/.gradle/caches/modules-2/files-2.1/org.robolectric/plugins-maven-dependency-resolver/4.3.1/8b9d224707c0eff28ec39e9d7b33774c7b128d25/plugins-maven-dependency-resolver-4.3.1.jar:/Users/suzukitomoya/.gradle/caches/transforms-2/files-2.1/586941a3a02e35a74db1d35a784e624c/jars/classes.jar:/Users/suzukitomoya/.gradle/caches/modules-2/files-2.1/org.hamcrest/hamcrest-library/1.3/4785a3c21320980282f9f33d0d1264a69040538f/hamcrest-library-1.3.jar:/Users/suzukitomoya/.gradle/caches/transforms-2/files-2.1/3c2f6ade917b4ca045ca248b792d6b05/jars/classes.jar:/Users/suzukitomoya/.gradle/caches/modules-2/files-2.1/androidx.lifecycle/lifecycle-common/2.1.0/c67e7807d9cd6c329b9d0218b2ec4e505dd340b7/lifecycle-common-2.1.0.jar:/Users/suzukitomoya/.gradle/caches/modules-2/files-2.1/org.codehaus.plexus/plexus-interpolation/1.11/ad9dddff6043194904ad1d2c00ff1d003c3915f7/plexus-interpolation-1.11.jar:/Users/suzukitomoya/.gradle/caches/modules-2/files-2.1/org.codehaus.plexus/plexus-utils/1.5.15/c689598ce1eb94c304817877ed15911099972526/plexus-utils-1.5.15.jar:/Users/suzukitomoya/.gradle/caches/modules-2/files-2.1/com.google.guava/guava/27.0.1-jre/bd41a290787b5301e63929676d792c507bbc00ae/guava-27.0.1-jre.jar:/Users/suzukitomoya/.gradle/caches/modules-2/files-2.1/org.codehaus.mojo/animal-sniffer-annotations/1.17/f97ce6decaea32b36101e37979f8b647f00681fb/animal-sniffer-annotations-1.17.jar:/Users/suzukitomoya/.gradle/caches/modules-2/files-2.1/classworlds/classworlds/1.1-alpha-2/5adf2e681c57d7f48038b602f3ca2254ee82d47/classworlds-1.1-alpha-2.jar:/Users/suzukitomoya/2019_AndroidStudy/LegacyRecipeApp/app/build/intermediates/sourceFolderJavaResources/test/debug:/Users/suzukitomoya/2019_AndroidStudy/LegacyRecipeApp/app/build/intermediates/sourceFolderJavaResources/debug:/Users/suzukitomoya/.gradle/caches/transforms-2/files-2.1/1a752445a54675cbae131d8d867a201b/android.jar" com.intellij.rt.execution.junit.JUnitStarter -ideVersion5 -junit4 com.sample.droider.legacyrecipeapp.util.RobolectricDimensUtilTest
[Robolectric] WARN: Android SDK 29 requires Java 9 (have Java 8). Tests won't be run on SDK 29 unless explicitly requested.
WARNING: No manifest file found at ./AndroidManifest.xml.

No such manifest file: ./AndroidManifest.xml
Falling back to the Android OS resources only.
To remove this warning, annotate your test class with @Config(manifest=Config.NONE).[Robolectric] com.sample.droider.legacyrecipeapp.util.RobolectricDimensUtilTest.dpToPx: sdk=28; resources=LEGACY
[Robolectric] NOTICE: legacy resources mode is deprecated; see http://robolectric.org/migrating/#migrating-to-40

android.content.res.Resources$NotFoundException: Resource ID #0x7f060056

	at org.robolectric.shadows.ShadowLegacyAssetManager.getResName(ShadowLegacyAssetManager.java:1283)
	at org.robolectric.shadows.ShadowLegacyAssetManager.resolveResourceValue(ShadowLegacyAssetManager.java:1066)
	at org.robolectric.shadows.ShadowLegacyAssetManager.resolve(ShadowLegacyAssetManager.java:1026)
	at org.robolectric.shadows.ShadowLegacyAssetManager.getAndResolve(ShadowLegacyAssetManager.java:1020)
	at org.robolectric.shadows.ShadowLegacyAssetManager.getResourceValue(ShadowLegacyAssetManager.java:319)
	at android.content.res.AssetManager.getResourceValue(AssetManager.java)
	at android.content.res.ResourcesImpl.getValue(ResourcesImpl.java:212)
	at android.content.res.Resources.getValue(Resources.java:1331)
	at androidx.appcompat.widget.ResourceManagerInternal.createDrawableIfNeeded(ResourceManagerInternal.java:176)
	at androidx.appcompat.widget.ResourceManagerInternal.getDrawable(ResourceManagerInternal.java:141)
	at androidx.appcompat.widget.ResourceManagerInternal.getDrawable(ResourceManagerInternal.java:132)
	at androidx.appcompat.widget.ResourceManagerInternal.checkVectorDrawableSetup(ResourceManagerInternal.java:504)
	at androidx.appcompat.widget.ResourceManagerInternal.getDrawable(ResourceManagerInternal.java:137)
	at androidx.appcompat.widget.AppCompatDrawableManager.getDrawable(AppCompatDrawableManager.java:411)
	at androidx.appcompat.widget.TintTypedArray.getDrawableIfKnown(TintTypedArray.java:86)
	at androidx.appcompat.app.AppCompatDelegateImpl.attachToWindow(AppCompatDelegateImpl.java:647)
	at androidx.appcompat.app.AppCompatDelegateImpl.ensureWindow(AppCompatDelegateImpl.java:623)
	at androidx.appcompat.app.AppCompatDelegateImpl.onCreate(AppCompatDelegateImpl.java:350)
	at androidx.appcompat.app.AppCompatActivity.onCreate(AppCompatActivity.java:105)
	at com.sample.droider.legacyrecipeapp.activity.RecipeListActivity.onCreate(RecipeListActivity.java:30)
	at android.app.Activity.performCreate(Activity.java:7136)
	at android.app.Activity.performCreate(Activity.java:7127)
	at android.app.Instrumentation.callActivityOnCreate(Instrumentation.java:1271)
	at androidx.test.runner.MonitoringInstrumentation.callActivityOnCreate(MonitoringInstrumentation.java:702)
	at org.robolectric.android.controller.ActivityController.lambda$create$0(ActivityController.java:106)
	at org.robolectric.shadows.ShadowLegacyLooper.runPaused(ShadowLegacyLooper.java:322)
	at org.robolectric.android.controller.ActivityController.create(ActivityController.java:106)
	at org.robolectric.android.controller.ActivityController.create(ActivityController.java:111)
	at org.robolectric.android.controller.ActivityController.setup(ActivityController.java:251)
	at com.sample.droider.legacyrecipeapp.util.RobolectricDimensUtilTest.setUp(RobolectricDimensUtilTest.java:23)
	at org.junit.runners.model.FrameworkMethod$1.runReflectiveCall(FrameworkMethod.java:50)
	at org.junit.internal.runners.model.ReflectiveCallable.run(ReflectiveCallable.java:12)
	at org.junit.runners.model.FrameworkMethod.invokeExplosively(FrameworkMethod.java:47)
	at org.junit.internal.runners.statements.RunBefores.evaluate(RunBefores.java:24)
	at org.robolectric.RobolectricTestRunner$HelperTestRunner$1.evaluate(RobolectricTestRunner.java:546)
	at org.robolectric.internal.SandboxTestRunner$2.lambda$evaluate$0(SandboxTestRunner.java:252)
	at org.robolectric.internal.bytecode.Sandbox.lambda$runOnMainThread$0(Sandbox.java:89)
	at java.util.concurrent.FutureTask.run(FutureTask.java:266)
	at java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1142)
	at java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:617)
	at java.lang.Thread.run(Thread.java:745)

[Robolectric] com.sample.droider.legacyrecipeapp.util.RobolectricDimensUtilTest.pxToDp: sdk=28; resources=LEGACY
[Robolectric] NOTICE: legacy resources mode is deprecated; see http://robolectric.org/migrating/#migrating-to-40

java.lang.IllegalStateException: You need to use a Theme.AppCompat theme (or descendant) with this activity.

	at androidx.appcompat.app.AppCompatDelegateImpl.createSubDecor(AppCompatDelegateImpl.java:696)
	at androidx.appcompat.app.AppCompatDelegateImpl.ensureSubDecor(AppCompatDelegateImpl.java:659)
	at androidx.appcompat.app.AppCompatDelegateImpl.setContentView(AppCompatDelegateImpl.java:552)
	at androidx.appcompat.app.AppCompatActivity.setContentView(AppCompatActivity.java:161)
	at com.sample.droider.legacyrecipeapp.activity.RecipeListActivity.onCreate(RecipeListActivity.java:31)
	at android.app.Activity.performCreate(Activity.java:7136)
	at android.app.Activity.performCreate(Activity.java:7127)
	at android.app.Instrumentation.callActivityOnCreate(Instrumentation.java:1271)
	at androidx.test.runner.MonitoringInstrumentation.callActivityOnCreate(MonitoringInstrumentation.java:702)
	at org.robolectric.android.controller.ActivityController.lambda$create$0(ActivityController.java:106)
	at org.robolectric.shadows.ShadowLegacyLooper.runPaused(ShadowLegacyLooper.java:322)
	at org.robolectric.android.controller.ActivityController.create(ActivityController.java:106)
	at org.robolectric.android.controller.ActivityController.create(ActivityController.java:111)
	at org.robolectric.android.controller.ActivityController.setup(ActivityController.java:251)
	at com.sample.droider.legacyrecipeapp.util.RobolectricDimensUtilTest.setUp(RobolectricDimensUtilTest.java:23)
	at org.junit.runners.model.FrameworkMethod$1.runReflectiveCall(FrameworkMethod.java:50)
	at org.junit.internal.runners.model.ReflectiveCallable.run(ReflectiveCallable.java:12)
	at org.junit.runners.model.FrameworkMethod.invokeExplosively(FrameworkMethod.java:47)
	at org.junit.internal.runners.statements.RunBefores.evaluate(RunBefores.java:24)
	at org.robolectric.RobolectricTestRunner$HelperTestRunner$1.evaluate(RobolectricTestRunner.java:546)
	at org.robolectric.internal.SandboxTestRunner$2.lambda$evaluate$0(SandboxTestRunner.java:252)
	at org.robolectric.internal.bytecode.Sandbox.lambda$runOnMainThread$0(Sandbox.java:89)
	at java.util.concurrent.FutureTask.run(FutureTask.java:266)
	at java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1142)
	at java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:617)
	at java.lang.Thread.run(Thread.java:745)


Process finished with exit code 255*/