package dev.epro.r0;

import android.graphics.LinearGradient;
import android.graphics.RadialGradient;
import android.graphics.Shader;
import android.graphics.SweepGradient;
import android.view.contentcapture.ContentCaptureSession;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class A13780509468012278052 {
    public static /* synthetic */ LinearGradient b(float f, float f2, float f3, float f4, long[] jArr, float[] fArr, Shader.TileMode tileMode) {
        return new LinearGradient(f, f2, f3, f4, jArr, fArr, tileMode);
    }

    public static /* synthetic */ RadialGradient c(float f, float f2, float f3, long[] jArr, float[] fArr, Shader.TileMode tileMode) {
        return new RadialGradient(f, f2, f3, jArr, fArr, tileMode);
    }

    public static /* synthetic */ SweepGradient e(float f, float f2, long[] jArr, float[] fArr) {
        return new SweepGradient(f, f2, jArr, fArr);
    }

    public static /* bridge */ /* synthetic */ ContentCaptureSession f(Object obj) {
        return (ContentCaptureSession) obj;
    }
}
