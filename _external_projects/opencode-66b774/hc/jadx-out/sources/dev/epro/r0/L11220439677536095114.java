package dev.epro.r0;

import java.sql.Timestamp;
import java.util.Date;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes2.dex */
public final class L11220439677536095114 extends R5812832838199629250 {
    public final /* synthetic */ byte b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ L11220439677536095114(Class cls, byte b) {
        super(cls);
        this.b = b;
    }

    @Override // dev.epro.r0.R5812832838199629250
    public final Date a(Date date) {
        switch (this.b) {
            case 0:
                return new java.sql.Date(date.getTime());
            default:
                return new Timestamp(date.getTime());
        }
    }
}
