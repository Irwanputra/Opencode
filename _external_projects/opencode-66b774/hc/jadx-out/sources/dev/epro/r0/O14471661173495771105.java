package dev.epro.r0;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class O14471661173495771105 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ B7345999604461286783 b;

    public /* synthetic */ O14471661173495771105(B7345999604461286783 b7345999604461286783, byte b) {
        this.a = b;
        this.b = b7345999604461286783;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        B7345999604461286783 b7345999604461286783 = this.b;
        switch (b) {
            case 0:
                b7345999604461286783.a(new I10210771329789820200(1, "No consentInformation.").a());
                break;
            case 1:
                b7345999604461286783.a(new I10210771329789820200(3, "No valid response received yet.").a());
                break;
            case 2:
                b7345999604461286783.a(new I10210771329789820200(3, "Privacy options form is not required.").a());
                break;
            default:
                b7345999604461286783.a(new I10210771329789820200(3, "Privacy options form is being loading. Please try again later.").a());
                break;
        }
    }
}
