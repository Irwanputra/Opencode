package dev.epro.r0;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes2.dex */
public final class I16737082536984153748 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    public /* synthetic */ I16737082536984153748(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    public final void a() {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                M3727281027331139839 m3727281027331139839 = (M3727281027331139839) obj;
                m3727281027331139839.A--;
                break;
            default:
                G12738412843435213993 g12738412843435213993 = (G12738412843435213993) obj;
                g12738412843435213993.k--;
                break;
        }
    }

    public final void b() {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                ((M3727281027331139839) obj).A++;
                break;
            default:
                ((G12738412843435213993) obj).k++;
                break;
        }
    }
}
