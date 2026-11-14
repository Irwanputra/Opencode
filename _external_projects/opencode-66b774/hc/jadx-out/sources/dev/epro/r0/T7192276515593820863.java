package dev.epro.r0;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class T7192276515593820863 implements F4096073349764486348 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ G429561569752528174 b;
    public final /* synthetic */ F4096073349764486348 c;

    public /* synthetic */ T7192276515593820863(G429561569752528174 g429561569752528174, F4096073349764486348 f4096073349764486348, byte b) {
        this.a = b;
        this.b = g429561569752528174;
        this.c = f4096073349764486348;
    }

    @Override // dev.epro.r0.F4096073349764486348
    public final Object invoke(Object obj) {
        byte b = this.a;
        F4096073349764486348 f4096073349764486348 = this.c;
        G429561569752528174 g429561569752528174 = this.b;
        switch (b) {
            case 0:
                Q17957571128037780363 q17957571128037780363 = (Q17957571128037780363) obj;
                if (g429561569752528174 != null) {
                    g429561569752528174.a.setValue(q17957571128037780363);
                }
                if (f4096073349764486348 != null) {
                    f4096073349764486348.invoke(q17957571128037780363);
                }
                return O9245300239821758723.a;
            default:
                g429561569752528174.c.add(f4096073349764486348);
                return new J16066275792042864572(g429561569752528174, f4096073349764486348, (byte) 7);
        }
    }
}
