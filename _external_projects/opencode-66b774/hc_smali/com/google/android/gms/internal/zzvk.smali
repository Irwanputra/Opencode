.class public abstract Lcom/google/android/gms/internal/zzvk;
.super Lcom/google/android/gms/internal/zzev;
.source ""

# interfaces
.implements Lcom/google/android/gms/internal/zzvj;


# direct methods
.method public constructor <init>()V
    .registers 2

    invoke-direct {p0}, Lcom/google/android/gms/internal/zzev;-><init>()V

    const-string v0, "com.google.android.gms.ads.internal.mediation.client.INativeAppInstallAdMapper"

    invoke-virtual {p0, p0, v0}, Landroid/os/Binder;->attachInterface(Landroid/os/IInterface;Ljava/lang/String;)V

    return-void
.end method


# virtual methods
.method public onTransact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z
    .registers 6

    invoke-virtual {p0, p1, p2, p3, p4}, Lcom/google/android/gms/internal/zzev;->zza(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z

    move-result p4

    const/4 v0, 0x1

    if-eqz p4, :cond_8

    return v0

    :cond_8
    packed-switch p1, :pswitch_data_b2

    const/4 p1, 0x0

    return p1

    :pswitch_d
    invoke-interface {p0}, Lcom/google/android/gms/internal/zzvj;->zzjx()Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/げつ〴ぬぐ/づざかべべ/げつ〴ぬぐ;

    move-result-object p1

    goto/16 :goto_8f

    :pswitch_13
    invoke-interface {p0}, Lcom/google/android/gms/internal/zzvj;->zzml()Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/げつ〴ぬぐ/づざかべべ/げつ〴ぬぐ;

    move-result-object p1

    goto/16 :goto_8f

    :pswitch_19
    invoke-interface {p0}, Lcom/google/android/gms/internal/zzvj;->zzjy()Lcom/google/android/gms/internal/zzpm;

    move-result-object p1

    goto/16 :goto_8f

    :pswitch_1f
    invoke-interface {p0}, Lcom/google/android/gms/internal/zzvj;->zzmk()Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/げつ〴ぬぐ/づざかべべ/げつ〴ぬぐ;

    move-result-object p1

    goto/16 :goto_8f

    :pswitch_25
    invoke-interface {p0}, Lcom/google/android/gms/internal/zzvj;->getVideoController()Lcom/google/android/gms/internal/zzll;

    move-result-object p1

    goto :goto_8f

    :pswitch_2a
    invoke-virtual {p2}, Landroid/os/Parcel;->readStrongBinder()Landroid/os/IBinder;

    move-result-object p1

    invoke-static {p1}, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/げつ〴ぬぐ/づざかべべ/げつ〴ぬぐ$げつ〴ぬぐ;->〺つふすそ(Landroid/os/IBinder;)Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/げつ〴ぬぐ/づざかべべ/げつ〴ぬぐ;

    move-result-object p1

    invoke-interface {p0, p1}, Lcom/google/android/gms/internal/zzvj;->zzj(Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/げつ〴ぬぐ/づざかべべ/げつ〴ぬぐ;)V

    goto :goto_6d

    :pswitch_36
    invoke-interface {p0}, Lcom/google/android/gms/internal/zzvj;->getExtras()Landroid/os/Bundle;

    move-result-object p1

    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    invoke-static {p3, p1}, Lcom/google/android/gms/internal/zzew;->zzb(Landroid/os/Parcel;Landroid/os/Parcelable;)V

    goto/16 :goto_b0

    :pswitch_42
    invoke-interface {p0}, Lcom/google/android/gms/internal/zzvj;->getOverrideClickHandling()Z

    move-result p1

    goto :goto_4b

    :pswitch_47
    invoke-interface {p0}, Lcom/google/android/gms/internal/zzvj;->getOverrideImpressionRecording()Z

    move-result p1

    :goto_4b
    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    invoke-static {p3, p1}, Lcom/google/android/gms/internal/zzew;->zza(Landroid/os/Parcel;Z)V

    goto :goto_b0

    :pswitch_52
    invoke-virtual {p2}, Landroid/os/Parcel;->readStrongBinder()Landroid/os/IBinder;

    move-result-object p1

    invoke-static {p1}, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/げつ〴ぬぐ/づざかべべ/げつ〴ぬぐ$げつ〴ぬぐ;->〺つふすそ(Landroid/os/IBinder;)Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/げつ〴ぬぐ/づざかべべ/げつ〴ぬぐ;

    move-result-object p1

    invoke-interface {p0, p1}, Lcom/google/android/gms/internal/zzvj;->zzi(Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/げつ〴ぬぐ/づざかべべ/げつ〴ぬぐ;)V

    goto :goto_6d

    :pswitch_5e
    invoke-virtual {p2}, Landroid/os/Parcel;->readStrongBinder()Landroid/os/IBinder;

    move-result-object p1

    invoke-static {p1}, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/げつ〴ぬぐ/づざかべべ/げつ〴ぬぐ$げつ〴ぬぐ;->〺つふすそ(Landroid/os/IBinder;)Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/げつ〴ぬぐ/づざかべべ/げつ〴ぬぐ;

    move-result-object p1

    invoke-interface {p0, p1}, Lcom/google/android/gms/internal/zzvj;->zzh(Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/げつ〴ぬぐ/づざかべべ/げつ〴ぬぐ;)V

    goto :goto_6d

    :pswitch_6a
    invoke-interface {p0}, Lcom/google/android/gms/internal/zzvj;->recordImpression()V

    :goto_6d
    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    goto :goto_b0

    :pswitch_71
    invoke-interface {p0}, Lcom/google/android/gms/internal/zzvj;->getPrice()Ljava/lang/String;

    move-result-object p1

    goto :goto_aa

    :pswitch_76
    invoke-interface {p0}, Lcom/google/android/gms/internal/zzvj;->getStore()Ljava/lang/String;

    move-result-object p1

    goto :goto_aa

    :pswitch_7b
    invoke-interface {p0}, Lcom/google/android/gms/internal/zzvj;->getStarRating()D

    move-result-wide p1

    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    invoke-virtual {p3, p1, p2}, Landroid/os/Parcel;->writeDouble(D)V

    goto :goto_b0

    :pswitch_86
    invoke-interface {p0}, Lcom/google/android/gms/internal/zzvj;->getCallToAction()Ljava/lang/String;

    move-result-object p1

    goto :goto_aa

    :pswitch_8b
    invoke-interface {p0}, Lcom/google/android/gms/internal/zzvj;->zzjs()Lcom/google/android/gms/internal/zzpq;

    move-result-object p1

    :goto_8f
    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    invoke-static {p3, p1}, Lcom/google/android/gms/internal/zzew;->zza(Landroid/os/Parcel;Landroid/os/IInterface;)V

    goto :goto_b0

    :pswitch_96
    invoke-interface {p0}, Lcom/google/android/gms/internal/zzvj;->getBody()Ljava/lang/String;

    move-result-object p1

    goto :goto_aa

    :pswitch_9b
    invoke-interface {p0}, Lcom/google/android/gms/internal/zzvj;->getImages()Ljava/util/List;

    move-result-object p1

    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    invoke-virtual {p3, p1}, Landroid/os/Parcel;->writeList(Ljava/util/List;)V

    goto :goto_b0

    :pswitch_a6
    invoke-interface {p0}, Lcom/google/android/gms/internal/zzvj;->getHeadline()Ljava/lang/String;

    move-result-object p1

    :goto_aa
    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    invoke-virtual {p3, p1}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    :goto_b0
    return v0

    nop

    :pswitch_data_b2
    .packed-switch 0x2
        :pswitch_a6
        :pswitch_9b
        :pswitch_96
        :pswitch_8b
        :pswitch_86
        :pswitch_7b
        :pswitch_76
        :pswitch_71
        :pswitch_6a
        :pswitch_5e
        :pswitch_52
        :pswitch_47
        :pswitch_42
        :pswitch_36
        :pswitch_2a
        :pswitch_25
        :pswitch_1f
        :pswitch_19
        :pswitch_13
        :pswitch_d
    .end packed-switch
.end method
