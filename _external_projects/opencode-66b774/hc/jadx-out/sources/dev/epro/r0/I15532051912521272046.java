package dev.epro.r0;

import android.content.Context;
import android.content.res.Configuration;
import android.view.View;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes2.dex */
public final class I15532051912521272046 extends View {
    public final /* synthetic */ G4662932872380687406 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public I15532051912521272046(G4662932872380687406 g4662932872380687406, Context context) {
        super(context);
        this.a = g4662932872380687406;
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        configuration.getClass();
        this.a.run();
    }
}
