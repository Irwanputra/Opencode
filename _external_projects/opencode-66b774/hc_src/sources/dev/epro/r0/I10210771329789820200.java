package dev.epro.r0;

import java.io.IOException;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes2.dex */
public final class I10210771329789820200 extends Exception {
    public I10210771329789820200(int i, String str) {
        super(str);
    }

    public final D14731132657808549702 a() {
        if (getCause() == null) {
            super.getMessage();
        } else {
            super.getMessage();
            getCause();
        }
        return new D14731132657808549702(super.getMessage(), (byte) 24);
    }

    public I10210771329789820200(int i, String str, IOException iOException) {
        super(str, iOException);
    }
}
