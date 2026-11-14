package dev.epro.r0;

import android.view.LayoutInflater;
import dev.epro.httpcustom.MainActivity;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes3.dex */
public final class S14521867152726058058 implements J10468299281676710423 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ MainActivity b;

    public /* synthetic */ S14521867152726058058(MainActivity mainActivity, byte b) {
        this.a = b;
        this.b = mainActivity;
    }

    @Override // dev.epro.r0.J10468299281676710423
    public final void a(T17336508261397230716 t17336508261397230716) {
        byte b = this.a;
        MainActivity mainActivity = this.b;
        switch (b) {
            case 0:
                V16233589191250258052 v16233589191250258052N = mainActivity.n();
                L9687083612725928934 l9687083612725928934 = (L9687083612725928934) v16233589191250258052N;
                LayoutInflater layoutInflaterFrom = LayoutInflater.from(l9687083612725928934.k);
                if (layoutInflaterFrom.getFactory() == null) {
                    layoutInflaterFrom.setFactory2(l9687083612725928934);
                } else {
                    layoutInflaterFrom.getFactory2();
                }
                ((V10300877997588547986) mainActivity.d.c).g("androidx:appcompat");
                v16233589191250258052N.b();
                break;
            default:
                if (!mainActivity.C) {
                    mainActivity.C = true;
                    ((F1721213344303279917) mainActivity.d()).getClass();
                }
                break;
        }
    }
}
