.class public final Lcom/google/android/gms/internal/zzmb;
.super Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/げつ〴ぬぐ/づざかべべ/びぐびあび;
.source ""


# annotations
.annotation runtime Lcom/google/android/gms/internal/zzzv;
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "L\u306a\u304e\u3071\u3044\u3062\u304e/\u306a\u304e\u3071\u3044\u3062\u304e/\u303a\u3064\u3075\u3059\u305d/\u3052\u3064\u3034\u306c\u3050/\u3065\u3056\u304b\u3079\u3079/\u3073\u3050\u3073\u3042\u3073<",
        "Lcom/google/android/gms/internal/zzlj;",
        ">;"
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .registers 2

    const-string v0, "com.google.android.gms.ads.MobileAdsSettingManagerCreatorImpl"

    invoke-direct {p0, v0}, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/げつ〴ぬぐ/づざかべべ/びぐびあび;-><init>(Ljava/lang/String;)V

    return-void
.end method


# virtual methods
.method public final synthetic zze(Landroid/os/IBinder;)Ljava/lang/Object;
    .registers 4

    if-nez p1, :cond_4

    const/4 p1, 0x0

    return-object p1

    :cond_4
    const-string v0, "com.google.android.gms.ads.internal.client.IMobileAdsSettingManagerCreator"

    invoke-interface {p1, v0}, Landroid/os/IBinder;->queryLocalInterface(Ljava/lang/String;)Landroid/os/IInterface;

    move-result-object v0

    instance-of v1, v0, Lcom/google/android/gms/internal/zzlj;

    if-eqz v1, :cond_11

    check-cast v0, Lcom/google/android/gms/internal/zzlj;

    return-object v0

    :cond_11
    new-instance v0, Lcom/google/android/gms/internal/zzlk;

    invoke-direct {v0, p1}, Lcom/google/android/gms/internal/zzlk;-><init>(Landroid/os/IBinder;)V

    return-object v0
.end method

.method public final zzg(Landroid/content/Context;)Lcom/google/android/gms/internal/zzlg;
    .registers 6

    const-string v0, "Could not get remote MobileAdsSettingManager."

    const/4 v1, 0x0

    .line 1
    :try_start_3
    new-instance v2, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/げつ〴ぬぐ/づざかべべ/くし〴〺ぅ;

    invoke-direct {v2, p1}, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/げつ〴ぬぐ/づざかべべ/くし〴〺ぅ;-><init>(Ljava/lang/Object;)V

    .line 2
    invoke-virtual {p0, p1}, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/げつ〴ぬぐ/づざかべべ/びぐびあび;->zzde(Landroid/content/Context;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/google/android/gms/internal/zzlj;

    const v3, 0xb5bb70

    invoke-interface {p1, v2, v3}, Lcom/google/android/gms/internal/zzlj;->zza(Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/げつ〴ぬぐ/づざかべべ/げつ〴ぬぐ;I)Landroid/os/IBinder;

    move-result-object p1

    if-nez p1, :cond_18

    return-object v1

    :cond_18
    const-string v2, "com.google.android.gms.ads.internal.client.IMobileAdsSettingManager"

    invoke-interface {p1, v2}, Landroid/os/IBinder;->queryLocalInterface(Ljava/lang/String;)Landroid/os/IInterface;

    move-result-object v2

    instance-of v3, v2, Lcom/google/android/gms/internal/zzlg;

    if-eqz v3, :cond_25

    check-cast v2, Lcom/google/android/gms/internal/zzlg;

    return-object v2

    :cond_25
    new-instance v2, Lcom/google/android/gms/internal/zzli;

    invoke-direct {v2, p1}, Lcom/google/android/gms/internal/zzli;-><init>(Landroid/os/IBinder;)V
    :try_end_2a
    .catch Landroid/os/RemoteException; {:try_start_3 .. :try_end_2a} :catch_2d
    .catch Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/げつ〴ぬぐ/づざかべべ/づざかべべ; {:try_start_3 .. :try_end_2a} :catch_2b

    return-object v2

    :catch_2b
    move-exception p1

    goto :goto_2f

    :catch_2d
    move-exception p1

    goto :goto_33

    :goto_2f
    invoke-static {v0, p1}, Lcom/google/android/gms/internal/zzakb;->zzc(Ljava/lang/String;Ljava/lang/Throwable;)V

    return-object v1

    :goto_33
    invoke-static {v0, p1}, Lcom/google/android/gms/internal/zzakb;->zzc(Ljava/lang/String;Ljava/lang/Throwable;)V

    return-object v1
.end method
