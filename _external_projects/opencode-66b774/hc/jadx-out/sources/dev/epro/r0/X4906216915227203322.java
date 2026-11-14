package dev.epro.r0;

import com.google.android.gms.common.api.Status;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes3.dex */
public class X4906216915227203322 extends Exception {
    public final Status a;

    public X4906216915227203322(Status status) {
        int i = status.d;
        String str = status.e;
        str = str == null ? "" : str;
        StringBuilder sb = new StringBuilder(String.valueOf(i).length() + 2 + String.valueOf(str).length());
        sb.append(i);
        sb.append(": ");
        sb.append(str);
        super(sb.toString());
        this.a = status;
    }
}
