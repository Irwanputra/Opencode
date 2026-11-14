package dev.epro.r0;

import java.io.IOException;
import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes2.dex */
public final class I8626815837691735180 extends IOException {
    /* JADX WARN: Illegal instructions before constructor call */
    public I8626815837691735180(int i, int i2, int i3, IndexOutOfBoundsException indexOutOfBoundsException) {
        Locale locale = Locale.US;
        StringBuilder sbR = E12098517352909843120.r("Pos: ", ", limit: ", i);
        sbR.append(i2);
        sbR.append(", len: ");
        sbR.append(i3);
        super("CodedOutputStream was writing to a flat byte array and ran out of space.: ".concat(sbR.toString()), indexOutOfBoundsException);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public I8626815837691735180(long j, long j2, int i, IndexOutOfBoundsException indexOutOfBoundsException) {
        Locale locale = Locale.US;
        StringBuilder sbR = E12098517352909843120.r("Pos: ", ", limit: ", j);
        sbR.append(j2);
        sbR.append(", len: ");
        sbR.append(i);
        super("CodedOutputStream was writing to a flat byte array and ran out of space.: ".concat(sbR.toString()), indexOutOfBoundsException);
    }

    public /* synthetic */ I8626815837691735180(IndexOutOfBoundsException indexOutOfBoundsException) {
        super("CodedOutputStream was writing to a flat byte array and ran out of space.", indexOutOfBoundsException);
    }
}
