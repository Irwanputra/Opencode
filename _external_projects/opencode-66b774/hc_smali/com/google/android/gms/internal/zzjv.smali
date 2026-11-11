.class public final Lcom/google/android/gms/internal/zzjv;
.super Lcom/google/android/gms/internal/zzjr$zza;
.source ""


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/google/android/gms/internal/zzjr$zza<",
        "Lcom/google/android/gms/internal/zzkn;",
        ">;"
    }
.end annotation


# instance fields
.field private synthetic val$context:Landroid/content/Context;

.field private synthetic zzbfa:Ljava/lang/String;

.field private synthetic zzbfb:Lcom/google/android/gms/internal/zzux;

.field private synthetic zzbfc:Lcom/google/android/gms/internal/zzjr;


# direct methods
.method public constructor <init>(Lcom/google/android/gms/internal/zzjr;Landroid/content/Context;Ljava/lang/String;Lcom/google/android/gms/internal/zzux;)V
    .registers 5

    iput-object p1, p0, Lcom/google/android/gms/internal/zzjv;->zzbfc:Lcom/google/android/gms/internal/zzjr;

    iput-object p2, p0, Lcom/google/android/gms/internal/zzjv;->val$context:Landroid/content/Context;

    iput-object p3, p0, Lcom/google/android/gms/internal/zzjv;->zzbfa:Ljava/lang/String;

    iput-object p4, p0, Lcom/google/android/gms/internal/zzjv;->zzbfb:Lcom/google/android/gms/internal/zzux;

    invoke-direct {p0, p1}, Lcom/google/android/gms/internal/zzjr$zza;-><init>(Lcom/google/android/gms/internal/zzjr;)V

    return-void
.end method


# virtual methods
.method public final zza(Lcom/google/android/gms/internal/zzla;)Ljava/lang/Object;
    .registers 6

    iget-object v0, p0, Lcom/google/android/gms/internal/zzjv;->val$context:Landroid/content/Context;

    .line 1
    new-instance v1, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/げつ〴ぬぐ/づざかべべ/くし〴〺ぅ;

    invoke-direct {v1, v0}, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/げつ〴ぬぐ/づざかべべ/くし〴〺ぅ;-><init>(Ljava/lang/Object;)V

    .line 2
    iget-object v0, p0, Lcom/google/android/gms/internal/zzjv;->zzbfa:Ljava/lang/String;

    iget-object v2, p0, Lcom/google/android/gms/internal/zzjv;->zzbfb:Lcom/google/android/gms/internal/zzux;

    const v3, 0xb5bb70

    invoke-interface {p1, v1, v0, v2, v3}, Lcom/google/android/gms/internal/zzla;->createAdLoaderBuilder(Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/げつ〴ぬぐ/づざかべべ/げつ〴ぬぐ;Ljava/lang/String;Lcom/google/android/gms/internal/zzux;I)Lcom/google/android/gms/internal/zzkn;

    move-result-object p1

    return-object p1
.end method

.method public final synthetic zzhw()Ljava/lang/Object;
    .registers 5

    iget-object v0, p0, Lcom/google/android/gms/internal/zzjv;->zzbfc:Lcom/google/android/gms/internal/zzjr;

    invoke-static {v0}, Lcom/google/android/gms/internal/zzjr;->zzc(Lcom/google/android/gms/internal/zzjr;)Lcom/google/android/gms/internal/zzjh;

    move-result-object v0

    iget-object v1, p0, Lcom/google/android/gms/internal/zzjv;->val$context:Landroid/content/Context;

    iget-object v2, p0, Lcom/google/android/gms/internal/zzjv;->zzbfa:Ljava/lang/String;

    iget-object v3, p0, Lcom/google/android/gms/internal/zzjv;->zzbfb:Lcom/google/android/gms/internal/zzux;

    invoke-virtual {v0, v1, v2, v3}, Lcom/google/android/gms/internal/zzjh;->zza(Landroid/content/Context;Ljava/lang/String;Lcom/google/android/gms/internal/zzux;)Lcom/google/android/gms/internal/zzkn;

    move-result-object v0

    if-eqz v0, :cond_13

    return-object v0

    :cond_13
    iget-object v0, p0, Lcom/google/android/gms/internal/zzjv;->zzbfc:Lcom/google/android/gms/internal/zzjr;

    iget-object v1, p0, Lcom/google/android/gms/internal/zzjv;->val$context:Landroid/content/Context;

    const-string v2, "native_ad"

    invoke-static {v0, v1, v2}, Lcom/google/android/gms/internal/zzjr;->zza(Lcom/google/android/gms/internal/zzjr;Landroid/content/Context;Ljava/lang/String;)V

    new-instance v0, Lcom/google/android/gms/internal/zzmc;

    invoke-direct {v0}, Lcom/google/android/gms/internal/zzmc;-><init>()V

    return-object v0
.end method
