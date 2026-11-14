package dev.epro.r0;

import android.app.Notification;
import android.app.job.JobParameters;
import android.content.Context;
import android.graphics.Path;
import android.util.LongSparseArray;
import android.view.DisplayCutout;
import android.view.translation.TranslationRequestValue;
import android.view.translation.TranslationResponseValue;
import android.view.translation.ViewTranslationRequest;
import android.view.translation.ViewTranslationResponse;
import android.widget.EdgeEffect;
import androidx.work.impl.background.systemjob.SystemJobService;
import java.util.List;
import java.util.function.Consumer;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes2.dex */
public abstract class M6916561348591858303 {
    public static EdgeEffect a(Context context) {
        try {
            return new EdgeEffect(context, null);
        } catch (Throwable unused) {
            return new EdgeEffect(context);
        }
    }

    public static void b(Y9618897734314500490 y9618897734314500490, LongSparseArray longSparseArray) {
        TranslationResponseValue value;
        CharSequence text;
        D16246464706717523548 d16246464706717523548;
        R6653624393204003746 r6653624393204003746;
        F4096073349764486348 f4096073349764486348;
        int size = longSparseArray.size();
        for (int i = 0; i < size; i++) {
            long jKeyAt = longSparseArray.keyAt(i);
            ViewTranslationResponse viewTranslationResponseL = Y8324723668087979953.l(longSparseArray.get(jKeyAt));
            if (viewTranslationResponseL != null && (value = viewTranslationResponseL.getValue("android:text")) != null && (text = value.getText()) != null && (d16246464706717523548 = (D16246464706717523548) y9618897734314500490.g().b((int) jKeyAt)) != null && (r6653624393204003746 = d16246464706717523548.a) != null) {
                Object objG = r6653624393204003746.d.a.g(E5458822993765169982.l);
                if (objG == null) {
                    objG = null;
                }
                R17587901753867651123 r17587901753867651123 = (R17587901753867651123) objG;
                if (r17587901753867651123 != null && (f4096073349764486348 = (F4096073349764486348) r17587901753867651123.b) != null) {
                }
            }
        }
    }

    public static Path c(DisplayCutout displayCutout) {
        return displayCutout.getCutoutPath();
    }

    public static float d(EdgeEffect edgeEffect) {
        try {
            return edgeEffect.getDistance();
        } catch (Throwable unused) {
            return 0.0f;
        }
    }

    public static int e(JobParameters jobParameters) {
        int stopReason = jobParameters.getStopReason();
        int i = SystemJobService.e;
        switch (stopReason) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
                return stopReason;
            default:
                return -512;
        }
    }

    public static void f(Y9618897734314500490 y9618897734314500490, long[] jArr, Consumer consumer) {
        R6653624393204003746 r6653624393204003746;
        for (long j : jArr) {
            D16246464706717523548 d16246464706717523548 = (D16246464706717523548) y9618897734314500490.g().b((int) j);
            if (d16246464706717523548 != null && (r6653624393204003746 = d16246464706717523548.a) != null) {
                ViewTranslationRequest.Builder builder = new ViewTranslationRequest.Builder(y9618897734314500490.a.getAutofillId(), r6653624393204003746.f);
                Object objG = r6653624393204003746.d.a.g(D10671166500636893138.C);
                if (objG == null) {
                    objG = null;
                }
                List list = (List) objG;
                if (list != null) {
                    builder.setValue("android:text", TranslationRequestValue.forText(new M11181104712105445833(P3521844374884164894.a(list, "\n", null, 62))));
                    consumer.accept(builder.build());
                }
            }
        }
    }

    public static float g(EdgeEffect edgeEffect, float f, float f2) {
        try {
            return edgeEffect.onPullDistance(f, f2);
        } catch (Throwable unused) {
            edgeEffect.onPull(f, f2);
            return 0.0f;
        }
    }

    public static void h(Notification.Action.Builder builder) {
        builder.setAuthenticationRequired(false);
    }
}
