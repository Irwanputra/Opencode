package dev.epro.r0;

import android.graphics.Rect;
import android.view.View;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes.dex */
public final class B9595992830626540128 implements V12908042545285672970 {
    public final View a;
    public final W8455343525638953052 b;
    public I2076339260272013590 e;
    public L9852841107405549527 f;
    public K1865709164992808030 g;
    public Rect l;
    public final Y11675591421631573075 m;
    public F4096073349764486348 c = new X2899556981606350920((byte) 8);
    public F4096073349764486348 d = new X2899556981606350920((byte) 9);
    public F13241018602672925865 h = new F13241018602672925865("", 4, F12478849263529740365.b);
    public T8337309744439716006 i = T8337309744439716006.g;
    public final ArrayList j = new ArrayList();
    public final K7493131619793429513 k = M9216324016624295870.L(G14718160286012243331.c, new W2269277550458425547(this, (byte) 10));

    public B9595992830626540128(View view, H16627033410010803438 h16627033410010803438, W8455343525638953052 w8455343525638953052) {
        this.a = view;
        this.b = w8455343525638953052;
        this.m = new Y11675591421631573075(h16627033410010803438, w8455343525638953052);
    }

    @Override // dev.epro.r0.V12908042545285672970
    public final InputConnection a(EditorInfo editorInfo) {
        F13241018602672925865 f13241018602672925865 = this.h;
        U15853425786981391261.i0(editorInfo, f13241018602672925865.a.b, f13241018602672925865.b, this.i);
        I5214415084912034722 i5214415084912034722 = V4535048251125050810.a;
        if (D3638978315442423989.d()) {
            D3638978315442423989.a().i(editorInfo);
        }
        B6632305590049854808 b6632305590049854808 = new B6632305590049854808(this.h, new F6942723054099263096(this, (byte) 17), this.i.c, this.e, this.f, this.g);
        this.j.add(new WeakReference(b6632305590049854808));
        return b6632305590049854808;
    }
}
