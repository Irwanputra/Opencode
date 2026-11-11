package com.google.android.gms.internal;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'zzplr' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:395)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:324)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* loaded from: /tmp/opencode/hc_real.dex */
public class zzfiy {
    public static final zzfiy zzplp;
    public static final zzfiy zzplq;
    public static final zzfiy zzplr;
    public static final zzfiy zzpls;
    public static final zzfiy zzplt;
    public static final zzfiy zzplu;
    public static final zzfiy zzplv;
    public static final zzfiy zzplw;
    public static final zzfiy zzplx;
    public static final zzfiy zzply;
    public static final zzfiy zzplz;
    public static final zzfiy zzpma;
    public static final zzfiy zzpmb;
    public static final zzfiy zzpmc;
    public static final zzfiy zzpmd;
    public static final zzfiy zzpme;
    public static final zzfiy zzpmf;
    public static final zzfiy zzpmg;
    private static final /* synthetic */ zzfiy[] zzpmj;
    private final zzfjd zzpmh;
    private final int zzpmi;

    static {
        zzfiy zzfiyVar = new zzfiy("DOUBLE", 0, zzfjd.DOUBLE, 1);
        zzplp = zzfiyVar;
        zzfiy zzfiyVar2 = new zzfiy("FLOAT", 1, zzfjd.FLOAT, 5);
        zzplq = zzfiyVar2;
        zzfjd zzfjdVar = zzfjd.LONG;
        final int i = 2;
        zzfiy zzfiyVar3 = new zzfiy("INT64", 2, zzfjdVar, 0);
        zzplr = zzfiyVar3;
        final int i2 = 3;
        zzfiy zzfiyVar4 = new zzfiy("UINT64", 3, zzfjdVar, 0);
        zzpls = zzfiyVar4;
        zzfjd zzfjdVar2 = zzfjd.INT;
        zzfiy zzfiyVar5 = new zzfiy("INT32", 4, zzfjdVar2, 0);
        zzplt = zzfiyVar5;
        zzfiy zzfiyVar6 = new zzfiy("FIXED64", 5, zzfjdVar, 1);
        zzplu = zzfiyVar6;
        zzfiy zzfiyVar7 = new zzfiy("FIXED32", 6, zzfjdVar2, 5);
        zzplv = zzfiyVar7;
        zzfiy zzfiyVar8 = new zzfiy("BOOL", 7, zzfjd.BOOLEAN, 0);
        zzplw = zzfiyVar8;
        final zzfjd zzfjdVar3 = zzfjd.STRING;
        final String str = "STRING";
        final int i3 = 8;
        zzfiy zzfiyVar9 = new zzfiy(str, i3, zzfjdVar3, i) { // from class: com.google.android.gms.internal.zzfiz
            {
                int i4 = 8;
                int i5 = 2;
                zzfix zzfixVar = null;
            }
        };
        zzplx = zzfiyVar9;
        final zzfjd zzfjdVar4 = zzfjd.MESSAGE;
        final String str2 = "GROUP";
        final int i4 = 9;
        zzfiy zzfiyVar10 = new zzfiy(str2, i4, zzfjdVar4, i2) { // from class: com.google.android.gms.internal.zzfja
            {
                int i5 = 9;
                int i6 = 3;
                zzfix zzfixVar = null;
            }
        };
        zzply = zzfiyVar10;
        final String str3 = "MESSAGE";
        final int i5 = 10;
        final int i6 = 2;
        zzfiy zzfiyVar11 = new zzfiy(str3, i5, zzfjdVar4, i6) { // from class: com.google.android.gms.internal.zzfjb
            {
                int i7 = 10;
                int i8 = 2;
                zzfix zzfixVar = null;
            }
        };
        zzplz = zzfiyVar11;
        final zzfjd zzfjdVar5 = zzfjd.BYTE_STRING;
        final String str4 = "BYTES";
        final int i7 = 11;
        zzfiy zzfiyVar12 = new zzfiy(str4, i7, zzfjdVar5, i6) { // from class: com.google.android.gms.internal.zzfjc
            {
                int i8 = 11;
                int i9 = 2;
                zzfix zzfixVar = null;
            }
        };
        zzpma = zzfiyVar12;
        zzfiy zzfiyVar13 = new zzfiy("UINT32", 12, zzfjdVar2, 0);
        zzpmb = zzfiyVar13;
        zzfiy zzfiyVar14 = new zzfiy("ENUM", 13, zzfjd.ENUM, 0);
        zzpmc = zzfiyVar14;
        zzfiy zzfiyVar15 = new zzfiy("SFIXED32", 14, zzfjdVar2, 5);
        zzpmd = zzfiyVar15;
        zzfiy zzfiyVar16 = new zzfiy("SFIXED64", 15, zzfjdVar, 1);
        zzpme = zzfiyVar16;
        zzfiy zzfiyVar17 = new zzfiy("SINT32", 16, zzfjdVar2, 0);
        zzpmf = zzfiyVar17;
        zzfiy zzfiyVar18 = new zzfiy("SINT64", 17, zzfjdVar, 0);
        zzpmg = zzfiyVar18;
        zzpmj = new zzfiy[]{zzfiyVar, zzfiyVar2, zzfiyVar3, zzfiyVar4, zzfiyVar5, zzfiyVar6, zzfiyVar7, zzfiyVar8, zzfiyVar9, zzfiyVar10, zzfiyVar11, zzfiyVar12, zzfiyVar13, zzfiyVar14, zzfiyVar15, zzfiyVar16, zzfiyVar17, zzfiyVar18};
    }

    private zzfiy(String str, int i, zzfjd zzfjdVar, int i2) {
        this.zzpmh = zzfjdVar;
        this.zzpmi = i2;
    }

    public /* synthetic */ zzfiy(String str, int i, zzfjd zzfjdVar, int i2, zzfix zzfixVar) {
        this(str, i, zzfjdVar, i2);
    }

    public static zzfiy[] values() {
        return (zzfiy[]) zzpmj.clone();
    }

    public final zzfjd zzdad() {
        return this.zzpmh;
    }

    public final int zzdae() {
        return this.zzpmi;
    }
}
