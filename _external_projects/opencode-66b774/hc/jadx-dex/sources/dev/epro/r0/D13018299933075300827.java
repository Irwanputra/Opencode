package dev.epro.r0;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
final class D13018299933075300827 extends dev.epro.r0.A8269341136279542501 {
    public final dev.epro.r0.B9345618057833789735 a;

    public D13018299933075300827(dev.epro.r0.B9345618057833789735 b9345618057833789735) {
        this.a = b9345618057833789735;
    }

    @Override // dev.epro.r0.A8269341136279542501
    public final dev.epro.r0.R15896830329318850690 a() {
        return new dev.epro.r0.S3817735695007400440(this.a);
    }

    @Override // dev.epro.r0.A8269341136279542501
    public final void c(dev.epro.r0.R15896830329318850690 r15896830329318850690) {
        dev.epro.r0.S3817735695007400440 s3817735695007400440 = (dev.epro.r0.S3817735695007400440) r15896830329318850690;
        dev.epro.r0.B9345618057833789735 b9345618057833789735 = s3817735695007400440.q;
        dev.epro.r0.B9345618057833789735 b93456180578337897352 = this.a;
        if (dev.epro.r0.S10823041268949770285.t(b93456180578337897352, b9345618057833789735)) {
            return;
        }
        s3817735695007400440.q = b93456180578337897352;
        s3817735695007400440.i1();
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof dev.epro.r0.D13018299933075300827) {
            return dev.epro.r0.S10823041268949770285.t(((dev.epro.r0.D13018299933075300827) obj).a, this.a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
