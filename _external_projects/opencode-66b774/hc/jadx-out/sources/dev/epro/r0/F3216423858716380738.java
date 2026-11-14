package dev.epro.r0;

import androidx.webkit.StartUpLocation;
import java.io.PrintWriter;
import java.io.StringWriter;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes2.dex */
public final class F3216423858716380738 implements StartUpLocation {
    public final Throwable a;

    public F3216423858716380738(Throwable th) {
        this.a = th;
    }

    @Override // androidx.webkit.StartUpLocation
    public final String getStackInformation() {
        StringWriter stringWriter = new StringWriter();
        new PrintWriter(stringWriter);
        this.a.getClass();
        return stringWriter.toString();
    }
}
