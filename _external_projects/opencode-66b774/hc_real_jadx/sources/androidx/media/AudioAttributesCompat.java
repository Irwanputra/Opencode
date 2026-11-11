package androidx.media;

import android.util.SparseIntArray;
import p034.p068.InterfaceC1429;
import p034.p077.InterfaceC1483;

/* loaded from: /tmp/opencode/hc_real.dex */
public class AudioAttributesCompat implements InterfaceC1483 {

    /* renamed from: 〺つふすそ, reason: contains not printable characters */
    public static final SparseIntArray f1290;

    /* renamed from: げつ〴ぬぐ, reason: contains not printable characters */
    public InterfaceC1429 f1291;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f1290 = sparseIntArray;
        sparseIntArray.put(5, 1);
        sparseIntArray.put(6, 2);
        sparseIntArray.put(7, 2);
        sparseIntArray.put(8, 1);
        sparseIntArray.put(9, 1);
        sparseIntArray.put(10, 1);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof AudioAttributesCompat)) {
            return false;
        }
        InterfaceC1429 interfaceC1429 = this.f1291;
        InterfaceC1429 interfaceC14292 = ((AudioAttributesCompat) obj).f1291;
        return interfaceC1429 == null ? interfaceC14292 == null : interfaceC1429.equals(interfaceC14292);
    }

    public int hashCode() {
        return this.f1291.hashCode();
    }

    public String toString() {
        return this.f1291.toString();
    }
}
