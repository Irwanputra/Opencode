package dev.epro.r0;

import android.view.ActionProvider;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes2.dex */
public final class M12354959812914331817 implements ActionProvider.VisibilityListener {
    public F6942723054099263096 a;
    public final ActionProvider b;

    public M12354959812914331817(H2233650693096395599 h2233650693096395599, ActionProvider actionProvider) {
        this.b = actionProvider;
    }

    @Override // android.view.ActionProvider.VisibilityListener
    public final void onActionProviderVisibilityChanged(boolean z) {
        F6942723054099263096 f6942723054099263096 = this.a;
        if (f6942723054099263096 != null) {
            T8605657386197958581 t8605657386197958581 = ((I4217019646703278835) f6942723054099263096.b).n;
            t8605657386197958581.h = true;
            t8605657386197958581.p(true);
        }
    }
}
