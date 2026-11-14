package dev.epro.r0;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes2.dex */
public abstract class K5292665450222291626 {
    public static final ArrayList a;

    static {
        Object[] objArr = {"hmac-sha2-512-etm@openssh.com", "hmac-sha2-256-etm@openssh.com"};
        ArrayList arrayList = new ArrayList(2);
        for (int i = 0; i < 2; i++) {
            Object obj = objArr[i];
            Objects.requireNonNull(obj);
            arrayList.add(obj);
        }
        a = new ArrayList(Collections.unmodifiableList(arrayList));
    }
}
