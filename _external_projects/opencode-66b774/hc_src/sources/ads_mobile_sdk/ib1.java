package ads_mobile_sdk;

import android.content.Context;
import android.hardware.display.DisplayManager;
import dev.epro.r0.K4548097313143615345;
import dev.epro.r0.R4833348786910499294;

/* compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* loaded from: classes.dex */
public final class ib1 implements K4548097313143615345 {
    public static final ib1 b = new ib1();
    public Context a;

    public ib1(Context context, byte b2) {
        switch (b2) {
            case 2:
                context.getClass();
                this.a = context;
                break;
            default:
                context.getClass();
                this.a = context;
                break;
        }
    }

    @Override // dev.epro.r0.K4548097313143615345
    /* renamed from: a */
    public cw0 mo19a() {
        return cw0.DISPLAY_COUNT;
    }

    @Override // dev.epro.r0.K4548097313143615345
    public Object d(R4833348786910499294 r4833348786910499294) {
        DisplayManager displayManager = (DisplayManager) this.a.getSystemService(DisplayManager.class);
        return displayManager != null ? new xu0(new zi0(displayManager.getDisplays().length)) : new tu0("Unable to get display service", 1);
    }
}
