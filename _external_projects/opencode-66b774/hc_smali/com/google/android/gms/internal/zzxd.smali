.class public final Lcom/google/android/gms/internal/zzxd;
.super Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/げつ〴ぬぐ/づざかべべ/びぐびあび;
.source ""


# annotations
.annotation runtime Lcom/google/android/gms/internal/zzzv;
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "L\u306a\u304e\u3071\u3044\u3062\u304e/\u306a\u304e\u3071\u3044\u3062\u304e/\u303a\u3064\u3075\u3059\u305d/\u3052\u3064\u3034\u306c\u3050/\u3065\u3056\u304b\u3079\u3079/\u3073\u3050\u3073\u3042\u3073<",
        "Lcom/google/android/gms/internal/zzxh;",
        ">;"
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .registers 2

    const-string v0, "com.google.android.gms.ads.AdOverlayCreatorImpl"

    invoke-direct {p0, v0}, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/げつ〴ぬぐ/づざかべべ/びぐびあび;-><init>(Ljava/lang/String;)V

    return-void
.end method


# virtual methods
.method public final zze(Landroid/app/Activity;)Lcom/google/android/gms/internal/zzxe;
    .registers 6

    const-string v0, "Could not create remote AdOverlay."

    const/4 v1, 0x0

    .line 1
    :try_start_3
    new-instance v2, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/げつ〴ぬぐ/づざかべべ/くし〴〺ぅ;

    invoke-direct {v2, p1}, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/げつ〴ぬぐ/づざかべべ/くし〴〺ぅ;-><init>(Ljava/lang/Object;)V

    .line 2
    invoke-virtual {p0, p1}, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/げつ〴ぬぐ/づざかべべ/びぐびあび;->zzde(Landroid/content/Context;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/google/android/gms/internal/zzxh;

    invoke-interface {p1, v2}, Lcom/google/android/gms/internal/zzxh;->zzl(Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/げつ〴ぬぐ/づざかべべ/げつ〴ぬぐ;)Landroid/os/IBinder;

    move-result-object p1

    if-nez p1, :cond_15

    return-object v1

    :cond_15
    const-string v2, "com.google.android.gms.ads.internal.overlay.client.IAdOverlay"

    invoke-interface {p1, v2}, Landroid/os/IBinder;->queryLocalInterface(Ljava/lang/String;)Landroid/os/IInterface;

    move-result-object v2

    instance-of v3, v2, Lcom/google/android/gms/internal/zzxe;

    if-eqz v3, :cond_22

    check-cast v2, Lcom/google/android/gms/internal/zzxe;

    return-object v2

    :cond_22
    new-instance v2, Lcom/google/android/gms/internal/zzxg;

    invoke-direct {v2, p1}, Lcom/google/android/gms/internal/zzxg;-><init>(Landroid/os/IBinder;)V
    :try_end_27
    .catch Landroid/os/RemoteException; {:try_start_3 .. :try_end_27} :catch_2a
    .catch Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/げつ〴ぬぐ/づざかべべ/づざかべべ; {:try_start_3 .. :try_end_27} :catch_28

    return-object v2

    :catch_28
    move-exception p1

    goto :goto_2c

    :catch_2a
    move-exception p1

    goto :goto_30

    :goto_2c
    invoke-static {v0, p1}, Lcom/google/android/gms/internal/zzakb;->zzc(Ljava/lang/String;Ljava/lang/Throwable;)V

    return-object v1

    :goto_30
    invoke-static {v0, p1}, Lcom/google/android/gms/internal/zzakb;->zzc(Ljava/lang/String;Ljava/lang/Throwable;)V

    return-object v1
.end method

.method public final synthetic zze(Landroid/os/IBinder;)Ljava/lang/Object;
    .registers 4

    if-nez p1, :cond_4

    const/4 p1, 0x0

    return-object p1

    :cond_4
    const-string v0, "com.google.android.gms.ads.internal.overlay.client.IAdOverlayCreator"

    invoke-interface {p1, v0}, Landroid/os/IBinder;->queryLocalInterface(Ljava/lang/String;)Landroid/os/IInterface;

    move-result-object v0

    instance-of v1, v0, Lcom/google/android/gms/internal/zzxh;

    if-eqz v1, :cond_11

    check-cast v0, Lcom/google/android/gms/internal/zzxh;

    return-object v0

    :cond_11
    new-instance v0, Lcom/google/android/gms/internal/zzxi;

    invoke-direct {v0, p1}, Lcom/google/android/gms/internal/zzxi;-><init>(Landroid/os/IBinder;)V

    return-object v0
.end method
