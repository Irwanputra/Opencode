package com.google.android.play.core.common;

/* JADX INFO: compiled from: r8-map-id-6bf0880be0990946ef6071c139e5f128082c1a163aa6cd250c50c9e3ae8e7eca */
/* JADX INFO: loaded from: /tmp/opencode/hc/dex/classes.dex */
public class PlayCoreDialogWrapperActivity extends android.app.Activity {
    public android.os.ResultReceiver a;

    @Override // android.app.Activity
    public final void onActivityResult(int i, int i2, android.content.Intent intent) {
        android.os.ResultReceiver resultReceiver;
        super.onActivityResult(i, i2, intent);
        if (i == 0 && (resultReceiver = this.a) != null) {
            if (i2 == -1) {
                resultReceiver.send(1, new android.os.Bundle());
            } else if (i2 == 0) {
                resultReceiver.send(2, new android.os.Bundle());
            }
        }
        finish();
    }

    @Override // android.app.Activity
    public final void onCreate(android.os.Bundle bundle) {
        android.content.Intent intent;
        com.google.android.play.core.common.PlayCoreDialogWrapperActivity playCoreDialogWrapperActivity;
        int intExtra = getIntent().getIntExtra("window_flags", 0);
        if (intExtra != 0) {
            getWindow().getDecorView().setSystemUiVisibility(intExtra);
            android.content.Intent intent2 = new android.content.Intent();
            intent2.putExtra("window_flags", intExtra);
            intent = intent2;
        } else {
            intent = null;
        }
        super.onCreate(bundle);
        if (bundle != null) {
            this.a = (android.os.ResultReceiver) bundle.getParcelable("result_receiver");
            return;
        }
        this.a = (android.os.ResultReceiver) getIntent().getParcelableExtra("result_receiver");
        android.os.Bundle extras = getIntent().getExtras();
        android.app.PendingIntent pendingIntent = extras != null ? (android.app.PendingIntent) extras.get("confirmation_intent") : null;
        if (extras == null || pendingIntent == null) {
            android.os.ResultReceiver resultReceiver = this.a;
            if (resultReceiver != null) {
                resultReceiver.send(3, new android.os.Bundle());
            }
            finish();
            return;
        }
        try {
            playCoreDialogWrapperActivity = this;
            try {
                playCoreDialogWrapperActivity.startIntentSenderForResult(pendingIntent.getIntentSender(), 0, intent, 0, 0, 0);
            } catch (android.content.IntentSender.SendIntentException unused) {
                android.os.ResultReceiver resultReceiver2 = playCoreDialogWrapperActivity.a;
                if (resultReceiver2 != null) {
                    resultReceiver2.send(3, new android.os.Bundle());
                }
                playCoreDialogWrapperActivity.finish();
            }
        } catch (android.content.IntentSender.SendIntentException unused2) {
            playCoreDialogWrapperActivity = this;
        }
    }

    @Override // android.app.Activity
    public final void onSaveInstanceState(android.os.Bundle bundle) {
        bundle.putParcelable("result_receiver", this.a);
    }
}
