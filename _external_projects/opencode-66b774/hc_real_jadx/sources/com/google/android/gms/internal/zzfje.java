package com.google.android.gms.internal;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'zzpmv' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByField(EnumVisitor.java:372)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByWrappedInsn(EnumVisitor.java:337)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:322)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* loaded from: /tmp/opencode/hc_real.dex */
public abstract class zzfje {
    private static zzfje zzpmv;
    public static final zzfje zzpmw;
    private static zzfje zzpmx;
    private static final /* synthetic */ zzfje[] zzpmy;

    static {
        final String str = "LOOSE";
        final int i = 0;
        zzpmv = new zzfje(str, i) { // from class: com.google.android.gms.internal.zzfjf
            {
                int i2 = 0;
                zzfix zzfixVar = null;
            }

            @Override // com.google.android.gms.internal.zzfje
            public final Object zza(zzffb zzffbVar) {
                return zzffbVar.readString();
            }
        };
        final String str2 = "STRICT";
        final int i2 = 1;
        zzfje zzfjeVar = new zzfje(str2, i2) { // from class: com.google.android.gms.internal.zzfjg
            {
                int i3 = 1;
                zzfix zzfixVar = null;
            }

            @Override // com.google.android.gms.internal.zzfje
            public final Object zza(zzffb zzffbVar) {
                return zzffbVar.zzcwa();
            }
        };
        zzpmw = zzfjeVar;
        final String str3 = "LAZY";
        final int i3 = 2;
        zzfje zzfjeVar2 = new zzfje(str3, i3) { // from class: com.google.android.gms.internal.zzfjh
            {
                int i4 = 2;
                zzfix zzfixVar = null;
            }

            @Override // com.google.android.gms.internal.zzfje
            public final Object zza(zzffb zzffbVar) {
                return zzffbVar.zzcwb();
            }
        };
        zzpmx = zzfjeVar2;
        zzpmy = new zzfje[]{zzpmv, zzfjeVar, zzfjeVar2};
    }

    private zzfje(String str, int i) {
    }

    public /* synthetic */ zzfje(String str, int i, zzfix zzfixVar) {
        this(str, i);
    }

    public static zzfje[] values() {
        return (zzfje[]) zzpmy.clone();
    }

    public abstract Object zza(zzffb zzffbVar);
}
