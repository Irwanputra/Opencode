package dev.epro.r0;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class H4075047774632263339 implements F4096073349764486348 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ A8284336046188466534 b;
    public final /* synthetic */ A8284336046188466534 c;

    public /* synthetic */ H4075047774632263339(A8284336046188466534 a8284336046188466534, A8284336046188466534 a82843360461884665342, byte b) {
        this.a = b;
        this.b = a8284336046188466534;
        this.c = a82843360461884665342;
    }

    @Override // dev.epro.r0.F4096073349764486348
    public final Object invoke(Object obj) {
        byte b = this.a;
        A8284336046188466534 a8284336046188466534 = this.c;
        A8284336046188466534 a82843360461884665342 = this.b;
        U12307647644992999381 u12307647644992999381 = (U12307647644992999381) obj;
        switch (b) {
            case 0:
                if (a82843360461884665342.a == -1) {
                    a82843360461884665342.a = u12307647644992999381.b().a;
                }
                a8284336046188466534.a = u12307647644992999381.b().b + 1;
                break;
            default:
                if (a82843360461884665342.a == -1) {
                    a82843360461884665342.a = u12307647644992999381.b().a;
                }
                a8284336046188466534.a = u12307647644992999381.b().b + 1;
                break;
        }
        return "";
    }
}
