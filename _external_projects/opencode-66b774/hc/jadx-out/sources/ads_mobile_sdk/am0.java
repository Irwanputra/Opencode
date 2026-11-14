package ads_mobile_sdk;

import dev.epro.r0.T1335862270807194835;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'EF0' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:395)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:324)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes.dex */
public final class am0 {
    public static final am0 b;
    public static final am0 c;
    public static final am0[] d;
    public static final /* synthetic */ am0[] e;
    public final byte a;

    /* JADX INFO: Fake field, exist only in values array */
    am0 EF0;

    static {
        ej1 ej1Var = ej1.f;
        am0 am0Var = new am0("DOUBLE", 0, 0, 1, ej1Var);
        ej1 ej1Var2 = ej1.e;
        am0 am0Var2 = new am0("FLOAT", 1, 1, 1, ej1Var2);
        ej1 ej1Var3 = ej1.d;
        am0 am0Var3 = new am0("INT64", 2, 2, 1, ej1Var3);
        am0 am0Var4 = new am0("UINT64", 3, 3, 1, ej1Var3);
        ej1 ej1Var4 = ej1.c;
        am0 am0Var5 = new am0("INT32", 4, 4, 1, ej1Var4);
        am0 am0Var6 = new am0("FIXED64", 5, 5, 1, ej1Var3);
        am0 am0Var7 = new am0("FIXED32", 6, 6, 1, ej1Var4);
        ej1 ej1Var5 = ej1.g;
        am0 am0Var8 = new am0("BOOL", 7, 7, 1, ej1Var5);
        ej1 ej1Var6 = ej1.h;
        am0 am0Var9 = new am0("STRING", 8, 8, 1, ej1Var6);
        ej1 ej1Var7 = ej1.k;
        am0 am0Var10 = new am0("MESSAGE", 9, 9, 1, ej1Var7);
        ej1 ej1Var8 = ej1.i;
        am0 am0Var11 = new am0("BYTES", 10, 10, 1, ej1Var8);
        am0 am0Var12 = new am0("UINT32", 11, 11, 1, ej1Var4);
        ej1 ej1Var9 = ej1.j;
        am0 am0Var13 = new am0("ENUM", 12, 12, 1, ej1Var9);
        am0 am0Var14 = new am0("SFIXED32", 13, 13, 1, ej1Var4);
        am0 am0Var15 = new am0("SFIXED64", 14, 14, 1, ej1Var3);
        am0 am0Var16 = new am0("SINT32", 15, 15, 1, ej1Var4);
        am0 am0Var17 = new am0("SINT64", 16, 16, 1, ej1Var3);
        am0 am0Var18 = new am0("GROUP", 17, 17, 1, ej1Var7);
        am0 am0Var19 = new am0("DOUBLE_LIST", 18, 18, 2, ej1Var);
        am0 am0Var20 = new am0("FLOAT_LIST", 19, 19, 2, ej1Var2);
        am0 am0Var21 = new am0("INT64_LIST", 20, 20, 2, ej1Var3);
        am0 am0Var22 = new am0("UINT64_LIST", 21, 21, 2, ej1Var3);
        am0 am0Var23 = new am0("INT32_LIST", 22, 22, 2, ej1Var4);
        am0 am0Var24 = new am0("FIXED64_LIST", 23, 23, 2, ej1Var3);
        am0 am0Var25 = new am0("FIXED32_LIST", 24, 24, 2, ej1Var4);
        am0 am0Var26 = new am0("BOOL_LIST", 25, 25, 2, ej1Var5);
        am0 am0Var27 = new am0("STRING_LIST", 26, 26, 2, ej1Var6);
        am0 am0Var28 = new am0("MESSAGE_LIST", 27, 27, 2, ej1Var7);
        am0 am0Var29 = new am0("BYTES_LIST", 28, 28, 2, ej1Var8);
        am0 am0Var30 = new am0("UINT32_LIST", 29, 29, 2, ej1Var4);
        am0 am0Var31 = new am0("ENUM_LIST", 30, 30, 2, ej1Var9);
        am0 am0Var32 = new am0("SFIXED32_LIST", 31, 31, 2, ej1Var4);
        am0 am0Var33 = new am0("SFIXED64_LIST", 32, 32, 2, ej1Var3);
        am0 am0Var34 = new am0("SINT32_LIST", 33, 33, 2, ej1Var4);
        am0 am0Var35 = new am0("SINT64_LIST", 34, 34, 2, ej1Var3);
        am0 am0Var36 = new am0("DOUBLE_LIST_PACKED", 35, 35, 3, ej1Var);
        b = am0Var36;
        am0 am0Var37 = new am0("FLOAT_LIST_PACKED", 36, 36, 3, ej1Var2);
        am0 am0Var38 = new am0("INT64_LIST_PACKED", 37, 37, 3, ej1Var3);
        am0 am0Var39 = new am0("UINT64_LIST_PACKED", 38, 38, 3, ej1Var3);
        am0 am0Var40 = new am0("INT32_LIST_PACKED", 39, 39, 3, ej1Var4);
        am0 am0Var41 = new am0("FIXED64_LIST_PACKED", 40, 40, 3, ej1Var3);
        am0 am0Var42 = new am0("FIXED32_LIST_PACKED", 41, 41, 3, ej1Var4);
        am0 am0Var43 = new am0("BOOL_LIST_PACKED", 42, 42, 3, ej1Var5);
        am0 am0Var44 = new am0("UINT32_LIST_PACKED", 43, 43, 3, ej1Var4);
        am0 am0Var45 = new am0("ENUM_LIST_PACKED", 44, 44, 3, ej1Var9);
        am0 am0Var46 = new am0("SFIXED32_LIST_PACKED", 45, 45, 3, ej1Var4);
        am0 am0Var47 = new am0("SFIXED64_LIST_PACKED", 46, 46, 3, ej1Var3);
        am0 am0Var48 = new am0("SINT32_LIST_PACKED", 47, 47, 3, ej1Var4);
        am0 am0Var49 = new am0("SINT64_LIST_PACKED", 48, 48, 3, ej1Var3);
        c = am0Var49;
        e = new am0[]{am0Var, am0Var2, am0Var3, am0Var4, am0Var5, am0Var6, am0Var7, am0Var8, am0Var9, am0Var10, am0Var11, am0Var12, am0Var13, am0Var14, am0Var15, am0Var16, am0Var17, am0Var18, am0Var19, am0Var20, am0Var21, am0Var22, am0Var23, am0Var24, am0Var25, am0Var26, am0Var27, am0Var28, am0Var29, am0Var30, am0Var31, am0Var32, am0Var33, am0Var34, am0Var35, am0Var36, am0Var37, am0Var38, am0Var39, am0Var40, am0Var41, am0Var42, am0Var43, am0Var44, am0Var45, am0Var46, am0Var47, am0Var48, am0Var49, new am0("GROUP_LIST", 49, 49, 2, ej1Var7), new am0("MAP", 50, 50, 4, ej1.b)};
        am0[] am0VarArrValues = values();
        d = new am0[am0VarArrValues.length];
        for (am0 am0Var50 : am0VarArrValues) {
            d[am0Var50.a] = am0Var50;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public am0(String str, int i, int i2, int i3, ej1 ej1Var) {
        this.a = i2;
        int iE = T1335862270807194835.e(i3);
        if (iE == 1 || iE == 3) {
            ej1Var.getClass();
        }
        if (i3 == 1) {
            ej1Var.ordinal();
        }
    }

    public static am0[] values() {
        return (am0[]) e.clone();
    }
}
