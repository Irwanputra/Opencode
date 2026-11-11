.class public abstract Lcom/google/android/gms/internal/zzvn;
.super Lcom/google/android/gms/internal/zzev;
.source ""

# interfaces
.implements Lcom/google/android/gms/internal/zzvm;


# direct methods
.method public constructor <init>()V
    .registers 2

    invoke-direct {p0}, Lcom/google/android/gms/internal/zzev;-><init>()V

    const-string v0, "com.google.android.gms.ads.internal.mediation.client.INativeContentAdMapper"

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
    packed-switch p1, :pswitch_data_9e

    :pswitch_b
    const/4 p1, 0x0

    return p1

    :pswitch_d
    invoke-interface {p0}, Lcom/google/android/gms/internal/zzvm;->zzjx()Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/げつ〴ぬぐ/づざかべべ/げつ〴ぬぐ;

    move-result-object p1

    goto/16 :goto_7b

    :pswitch_13
    invoke-interface {p0}, Lcom/google/android/gms/internal/zzvm;->zzml()Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/げつ〴ぬぐ/づざかべべ/げつ〴ぬぐ;

    move-result-object p1

    goto :goto_7b

    :pswitch_18
    invoke-interface {p0}, Lcom/google/android/gms/internal/zzvm;->zzjy()Lcom/google/android/gms/internal/zzpm;

    move-result-object p1

    goto :goto_7b

    :pswitch_1d
    invoke-interface {p0}, Lcom/google/android/gms/internal/zzvm;->getVideoController()Lcom/google/android/gms/internal/zzll;

    move-result-object p1

    goto :goto_7b

    :pswitch_22
    invoke-interface {p0}, Lcom/google/android/gms/internal/zzvm;->zzmk()Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/げつ〴ぬぐ/づざかべべ/げつ〴ぬぐ;

    move-result-object p1

    goto :goto_7b

    :pswitch_27
    invoke-virtual {p2}, Landroid/os/Parcel;->readStrongBinder()Landroid/os/IBinder;

    move-result-object p1

    invoke-static {p1}, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/げつ〴ぬぐ/づざかべべ/げつ〴ぬぐ$げつ〴ぬぐ;->〺つふすそ(Landroid/os/IBinder;)Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/げつ〴ぬぐ/づざかべべ/げつ〴ぬぐ;

    move-result-object p1

    invoke-interface {p0, p1}, Lcom/google/android/gms/internal/zzvm;->zzj(Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/げつ〴ぬぐ/づざかべべ/げつ〴ぬぐ;)V

    goto :goto_69

    :pswitch_33
    invoke-interface {p0}, Lcom/google/android/gms/internal/zzvm;->getExtras()Landroid/os/Bundle;

    move-result-object p1

    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    invoke-static {p3, p1}, Lcom/google/android/gms/internal/zzew;->zzb(Landroid/os/Parcel;Landroid/os/Parcelable;)V

    goto :goto_9c

    :pswitch_3e
    invoke-interface {p0}, Lcom/google/android/gms/internal/zzvm;->getOverrideClickHandling()Z

    move-result p1

    goto :goto_47

    :pswitch_43
    invoke-interface {p0}, Lcom/google/android/gms/internal/zzvm;->getOverrideImpressionRecording()Z

    move-result p1

    :goto_47
    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    invoke-static {p3, p1}, Lcom/google/android/gms/internal/zzew;->zza(Landroid/os/Parcel;Z)V

    goto :goto_9c

    :pswitch_4e
    invoke-virtual {p2}, Landroid/os/Parcel;->readStrongBinder()Landroid/os/IBinder;

    move-result-object p1

    invoke-static {p1}, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/げつ〴ぬぐ/づざかべべ/げつ〴ぬぐ$げつ〴ぬぐ;->〺つふすそ(Landroid/os/IBinder;)Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/げつ〴ぬぐ/づざかべべ/げつ〴ぬぐ;

    move-result-object p1

    invoke-interface {p0, p1}, Lcom/google/android/gms/internal/zzvm;->zzi(Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/げつ〴ぬぐ/づざかべべ/げつ〴ぬぐ;)V

    goto :goto_69

    :pswitch_5a
    invoke-virtual {p2}, Landroid/os/Parcel;->readStrongBinder()Landroid/os/IBinder;

    move-result-object p1

    invoke-static {p1}, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/げつ〴ぬぐ/づざかべべ/げつ〴ぬぐ$げつ〴ぬぐ;->〺つふすそ(Landroid/os/IBinder;)Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/げつ〴ぬぐ/づざかべべ/げつ〴ぬぐ;

    move-result-object p1

    invoke-interface {p0, p1}, Lcom/google/android/gms/internal/zzvm;->zzh(Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/げつ〴ぬぐ/づざかべべ/げつ〴ぬぐ;)V

    goto :goto_69

    :pswitch_66
    invoke-interface {p0}, Lcom/google/android/gms/internal/zzvm;->recordImpression()V

    :goto_69
    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    goto :goto_9c

    :pswitch_6d
    invoke-interface {p0}, Lcom/google/android/gms/internal/zzvm;->getAdvertiser()Ljava/lang/String;

    move-result-object p1

    goto :goto_96

    :pswitch_72
    invoke-interface {p0}, Lcom/google/android/gms/internal/zzvm;->getCallToAction()Ljava/lang/String;

    move-result-object p1

    goto :goto_96

    :pswitch_77
    invoke-interface {p0}, Lcom/google/android/gms/internal/zzvm;->zzjz()Lcom/google/android/gms/internal/zzpq;

    move-result-object p1

    :goto_7b
    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    invoke-static {p3, p1}, Lcom/google/android/gms/internal/zzew;->zza(Landroid/os/Parcel;Landroid/os/IInterface;)V

    goto :goto_9c

    :pswitch_82
    invoke-interface {p0}, Lcom/google/android/gms/internal/zzvm;->getBody()Ljava/lang/String;

    move-result-object p1

    goto :goto_96

    :pswitch_87
    invoke-interface {p0}, Lcom/google/android/gms/internal/zzvm;->getImages()Ljava/util/List;

    move-result-object p1

    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    invoke-virtual {p3, p1}, Landroid/os/Parcel;->writeList(Ljava/util/List;)V

    goto :goto_9c

    :pswitch_92
    invoke-interface {p0}, Lcom/google/android/gms/internal/zzvm;->getHeadline()Ljava/lang/String;

    move-result-object p1

    :goto_96
    invoke-virtual {p3}, Landroid/os/Parcel;->writeNoException()V

    invoke-virtual {p3, p1}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    :goto_9c
    return v0

    nop

    :pswitch_data_9e
    .packed-switch 0x2
        :pswitch_92
        :pswitch_87
        :pswitch_82
        :pswitch_77
        :pswitch_72
        :pswitch_6d
        :pswitch_66
        :pswitch_5a
        :pswitch_4e
        :pswitch_43
        :pswitch_3e
        :pswitch_33
        :pswitch_27
        :pswitch_22
        :pswitch_1d
        :pswitch_b
        :pswitch_b
        :pswitch_18
        :pswitch_13
        :pswitch_d
    .end packed-switch
.end method
