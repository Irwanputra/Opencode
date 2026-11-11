.class public final Lcom/google/android/gms/internal/zzka;
.super Lcom/google/android/gms/internal/zzjr$zza;
.source ""


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/google/android/gms/internal/zzjr$zza<",
        "Lcom/google/android/gms/internal/zzxe;",
        ">;"
    }
.end annotation


# instance fields
.field private synthetic val$activity:Landroid/app/Activity;

.field private synthetic zzbfc:Lcom/google/android/gms/internal/zzjr;


# direct methods
.method public constructor <init>(Lcom/google/android/gms/internal/zzjr;Landroid/app/Activity;)V
    .registers 3

    iput-object p1, p0, Lcom/google/android/gms/internal/zzka;->zzbfc:Lcom/google/android/gms/internal/zzjr;

    iput-object p2, p0, Lcom/google/android/gms/internal/zzka;->val$activity:Landroid/app/Activity;

    invoke-direct {p0, p1}, Lcom/google/android/gms/internal/zzjr$zza;-><init>(Lcom/google/android/gms/internal/zzjr;)V

    return-void
.end method


# virtual methods
.method public final zza(Lcom/google/android/gms/internal/zzla;)Ljava/lang/Object;
    .registers 4

    iget-object v0, p0, Lcom/google/android/gms/internal/zzka;->val$activity:Landroid/app/Activity;

    .line 1
    new-instance v1, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/げつ〴ぬぐ/づざかべべ/くし〴〺ぅ;

    invoke-direct {v1, v0}, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/げつ〴ぬぐ/づざかべべ/くし〴〺ぅ;-><init>(Ljava/lang/Object;)V

    .line 2
    invoke-interface {p1, v1}, Lcom/google/android/gms/internal/zzla;->createAdOverlay(Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/げつ〴ぬぐ/づざかべべ/げつ〴ぬぐ;)Lcom/google/android/gms/internal/zzxe;

    move-result-object p1

    return-object p1
.end method

.method public final synthetic zzhw()Ljava/lang/Object;
    .registers 4

    iget-object v0, p0, Lcom/google/android/gms/internal/zzka;->zzbfc:Lcom/google/android/gms/internal/zzjr;

    invoke-static {v0}, Lcom/google/android/gms/internal/zzjr;->zzh(Lcom/google/android/gms/internal/zzjr;)Lcom/google/android/gms/internal/zzxd;

    move-result-object v0

    iget-object v1, p0, Lcom/google/android/gms/internal/zzka;->val$activity:Landroid/app/Activity;

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/zzxd;->zze(Landroid/app/Activity;)Lcom/google/android/gms/internal/zzxe;

    move-result-object v0

    if-eqz v0, :cond_f

    return-object v0

    :cond_f
    iget-object v0, p0, Lcom/google/android/gms/internal/zzka;->zzbfc:Lcom/google/android/gms/internal/zzjr;

    iget-object v1, p0, Lcom/google/android/gms/internal/zzka;->val$activity:Landroid/app/Activity;

    const-string v2, "ad_overlay"

    invoke-static {v0, v1, v2}, Lcom/google/android/gms/internal/zzjr;->zza(Lcom/google/android/gms/internal/zzjr;Landroid/content/Context;Ljava/lang/String;)V

    const/4 v0, 0x0

    return-object v0
.end method
