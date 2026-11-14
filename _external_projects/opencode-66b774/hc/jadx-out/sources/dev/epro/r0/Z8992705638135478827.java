package dev.epro.r0;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes4.dex */
public final class Z8992705638135478827 extends R4239627874707364917 {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static Z8992705638135478827 f609o;

    @Override // dev.epro.r0.R4239627874707364917
    public final int[] i(int i) {
        int length = m().length();
        if (length <= 0 || i >= length) {
            return null;
        }
        if (i < 0) {
            i = 0;
        }
        while (i < length && m().charAt(i) == '\n' && (m().charAt(i) == '\n' || (i != 0 && m().charAt(i - 1) != '\n'))) {
            i++;
        }
        if (i >= length) {
            return null;
        }
        int i2 = i + 1;
        while (i2 < length && !q(i2)) {
            i2++;
        }
        return l(i, i2);
    }

    @Override // dev.epro.r0.R4239627874707364917
    public final int[] o(int i) {
        int length = m().length();
        if (length <= 0 || i <= 0) {
            return null;
        }
        if (i > length) {
            i = length;
        }
        while (i > 0 && m().charAt(i - 1) == '\n' && !q(i)) {
            i--;
        }
        if (i <= 0) {
            return null;
        }
        int i2 = i - 1;
        while (i2 > 0 && (m().charAt(i2) == '\n' || (i2 != 0 && m().charAt(i2 - 1) != '\n'))) {
            i2--;
        }
        return l(i2, i);
    }

    public final boolean q(int i) {
        if (i <= 0 || m().charAt(i - 1) == '\n') {
            return false;
        }
        return i == m().length() || m().charAt(i) == '\n';
    }
}
