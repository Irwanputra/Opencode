package dev.epro.r0;

import android.app.Notification;
import android.app.job.JobParameters;
import android.content.Context;
import android.graphics.Path;
import android.view.DisplayCutout;
import android.view.translation.TranslationRequestValue;
import android.view.translation.ViewTranslationRequest;
import android.widget.EdgeEffect;
import androidx.work.impl.background.systemjob.SystemJobService;
import java.util.List;
import java.util.function.Consumer;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes2.dex */
public abstract class M6916561348591858303 {
    public static EdgeEffect a(Context context) {
        try {
            return new EdgeEffect(context, null);
        } catch (Throwable unused) {
            return new EdgeEffect(context);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:5:0x0015, code lost:
    
        r4 = r4.getValue("android:text");
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x001b, code lost:
    
        r4 = r4.getText();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void b(dev.epro.r0.Y9618897734314500490 r6, android.util.LongSparseArray r7) {
        /*
            int r0 = r7.size()
            r1 = 0
        L5:
            if (r1 >= r0) goto L5b
            long r2 = r7.keyAt(r1)
            java.lang.Object r4 = r7.get(r2)
            android.view.translation.ViewTranslationResponse r4 = dev.epro.r0.Y8324723668087979953.l(r4)
            if (r4 == 0) goto L58
            android.view.translation.TranslationResponseValue r4 = dev.epro.r0.Y8324723668087979953.k(r4)
            if (r4 == 0) goto L58
            java.lang.CharSequence r4 = dev.epro.r0.Y8324723668087979953.m(r4)
            if (r4 == 0) goto L58
            dev.epro.r0.W13131470296662841006 r5 = r6.g()
            int r2 = (int) r2
            java.lang.Object r2 = r5.b(r2)
            dev.epro.r0.D16246464706717523548 r2 = (dev.epro.r0.D16246464706717523548) r2
            if (r2 == 0) goto L58
            dev.epro.r0.R6653624393204003746 r2 = r2.a
            if (r2 == 0) goto L58
            dev.epro.r0.E10198359844879945462 r2 = r2.d
            dev.epro.r0.P14992748401341948828 r3 = dev.epro.r0.E5458822993765169982.l
            dev.epro.r0.A4559761392562572984 r2 = r2.a
            java.lang.Object r2 = r2.g(r3)
            if (r2 != 0) goto L3f
            r2 = 0
        L3f:
            dev.epro.r0.R17587901753867651123 r2 = (dev.epro.r0.R17587901753867651123) r2
            if (r2 == 0) goto L58
            dev.epro.r0.S8977162183056139880 r2 = r2.b
            dev.epro.r0.F4096073349764486348 r2 = (dev.epro.r0.F4096073349764486348) r2
            if (r2 == 0) goto L58
            dev.epro.r0.M11181104712105445833 r3 = new dev.epro.r0.M11181104712105445833
            java.lang.String r4 = r4.toString()
            r3.<init>(r4)
            java.lang.Object r2 = r2.invoke(r3)
            java.lang.Boolean r2 = (java.lang.Boolean) r2
        L58:
            int r1 = r1 + 1
            goto L5
        L5b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: dev.epro.r0.M6916561348591858303.b(dev.epro.r0.Y9618897734314500490, android.util.LongSparseArray):void");
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
                Object g = r6653624393204003746.d.a.g(D10671166500636893138.C);
                if (g == null) {
                    g = null;
                }
                List list = (List) g;
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
