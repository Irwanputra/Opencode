package dev.epro.r0;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public final class D9187821639891984020 implements android.view.View.OnApplyWindowInsetsListener {
    public dev.epro.r0.N3121440022506799205 a = null;
    public final /* synthetic */ android.view.View b;
    public final /* synthetic */ dev.epro.r0.S15634377979812012213 c;

    public D9187821639891984020(android.view.View view, dev.epro.r0.S15634377979812012213 s15634377979812012213) {
        this.b = view;
        this.c = s15634377979812012213;
    }

    @Override // android.view.View.OnApplyWindowInsetsListener
    public android.view.WindowInsets onApplyWindowInsets(android.view.View view, android.view.WindowInsets windowInsets) {
        dev.epro.r0.N3121440022506799205 n3121440022506799205C = dev.epro.r0.N3121440022506799205.c(windowInsets, view);
        int i = android.os.Build.VERSION.SDK_INT;
        dev.epro.r0.S15634377979812012213 s15634377979812012213 = this.c;
        if (i < 30) {
            dev.epro.r0.Q5747078841744593420.a(windowInsets, this.b);
            if (n3121440022506799205C.equals(this.a)) {
                return s15634377979812012213.h(view, n3121440022506799205C).b();
            }
        }
        this.a = n3121440022506799205C;
        dev.epro.r0.N3121440022506799205 n3121440022506799205H = s15634377979812012213.h(view, n3121440022506799205C);
        if (i >= 30) {
            return n3121440022506799205H.b();
        }
        java.util.WeakHashMap weakHashMap = dev.epro.r0.W10240872260424387225.a;
        view.requestApplyInsets();
        return n3121440022506799205H.b();
    }
}
