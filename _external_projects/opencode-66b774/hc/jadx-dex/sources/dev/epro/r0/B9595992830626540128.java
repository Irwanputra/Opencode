package dev.epro.r0;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public final class B9595992830626540128 implements dev.epro.r0.V12908042545285672970 {
    public final android.view.View a;
    public final dev.epro.r0.W8455343525638953052 b;
    public dev.epro.r0.I2076339260272013590 e;
    public dev.epro.r0.L9852841107405549527 f;
    public dev.epro.r0.K1865709164992808030 g;
    public android.graphics.Rect l;
    public final dev.epro.r0.Y11675591421631573075 m;
    public dev.epro.r0.F4096073349764486348 c = new dev.epro.r0.X2899556981606350920((byte) 8);
    public dev.epro.r0.F4096073349764486348 d = new dev.epro.r0.X2899556981606350920((byte) 9);
    public dev.epro.r0.F13241018602672925865 h = new dev.epro.r0.F13241018602672925865("", 4, dev.epro.r0.F12478849263529740365.b);
    public dev.epro.r0.T8337309744439716006 i = dev.epro.r0.T8337309744439716006.g;
    public final java.util.ArrayList j = new java.util.ArrayList();
    public final dev.epro.r0.K7493131619793429513 k = dev.epro.r0.M9216324016624295870.L(dev.epro.r0.G14718160286012243331.c, new dev.epro.r0.W2269277550458425547(this, (byte) 10));

    public B9595992830626540128(android.view.View view, dev.epro.r0.H16627033410010803438 h16627033410010803438, dev.epro.r0.W8455343525638953052 w8455343525638953052) {
        this.a = view;
        this.b = w8455343525638953052;
        this.m = new dev.epro.r0.Y11675591421631573075(h16627033410010803438, w8455343525638953052);
    }

    public final android.view.inputmethod.InputConnection a(android.view.inputmethod.EditorInfo editorInfo) {
        dev.epro.r0.F13241018602672925865 f13241018602672925865 = this.h;
        dev.epro.r0.U15853425786981391261.i0(editorInfo, f13241018602672925865.a.b, f13241018602672925865.b, this.i);
        dev.epro.r0.I5214415084912034722 i5214415084912034722 = dev.epro.r0.V4535048251125050810.a;
        if (dev.epro.r0.D3638978315442423989.d()) {
            dev.epro.r0.D3638978315442423989.a().i(editorInfo);
        }
        dev.epro.r0.B6632305590049854808 b6632305590049854808 = new dev.epro.r0.B6632305590049854808(this.h, new dev.epro.r0.F6942723054099263096(this, (byte) 17), this.i.c, this.e, this.f, this.g);
        this.j.add(new java.lang.ref.WeakReference(b6632305590049854808));
        return b6632305590049854808;
    }
}
