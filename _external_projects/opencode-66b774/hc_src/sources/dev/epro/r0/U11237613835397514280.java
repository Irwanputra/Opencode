package dev.epro.r0;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.service.voice.VoiceInteractionSession;
import o.bwmna.gdrqkg.izmyclvb;

/* loaded from: classes3.dex */
public final class U11237613835397514280 extends VoiceInteractionSession {
    public final Context a;

    static {
        izmyclvb.qgayjvbiagej2(546);
    }

    private native void ydgfydkrsnvy(Context context);

    @Override // android.service.voice.VoiceInteractionSession
    public final native void onShow(Bundle bundle, int i);

    @Override // android.service.voice.VoiceInteractionSession
    public final native void onTaskFinished(Intent intent, int i);

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public U11237613835397514280(Context context) {
        super(context);
        context.getClass();
        ydgfydkrsnvy(context);
    }
}
