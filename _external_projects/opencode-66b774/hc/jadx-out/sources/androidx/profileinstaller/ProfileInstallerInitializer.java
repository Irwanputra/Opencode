package androidx.profileinstaller;

import android.content.Context;
import android.view.Choreographer;
import dev.epro.r0.M10846389789027735899;
import dev.epro.r0.R4576572296217797762;
import dev.epro.r0.X15258821238264337731;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: classes.dex */
public class ProfileInstallerInitializer implements R4576572296217797762 {
    @Override // dev.epro.r0.R4576572296217797762
    public final List a() {
        return Collections.EMPTY_LIST;
    }

    @Override // dev.epro.r0.R4576572296217797762
    public final Object b(Context context) {
        Choreographer.getInstance().postFrameCallback(new X15258821238264337731(this, context.getApplicationContext()));
        return new M10846389789027735899((byte) 22);
    }
}
