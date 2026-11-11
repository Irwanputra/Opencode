.class public final Lcom/google/android/gms/internal/zzjs;
.super Lcom/google/android/gms/internal/zzjr$zza;
.source ""


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/google/android/gms/internal/zzjr$zza<",
        "Lcom/google/android/gms/internal/zzks;",
        ">;"
    }
.end annotation


# instance fields
.field private synthetic val$context:Landroid/content/Context;

.field private synthetic zzbez:Lcom/google/android/gms/internal/zzjn;

.field private synthetic zzbfa:Ljava/lang/String;

.field private synthetic zzbfb:Lcom/google/android/gms/internal/zzux;

.field private synthetic zzbfc:Lcom/google/android/gms/internal/zzjr;


# direct methods
.method public constructor <init>(Lcom/google/android/gms/internal/zzjr;Landroid/content/Context;Lcom/google/android/gms/internal/zzjn;Ljava/lang/String;Lcom/google/android/gms/internal/zzux;)V
    .registers 6

    iput-object p1, p0, Lcom/google/android/gms/internal/zzjs;->zzbfc:Lcom/google/android/gms/internal/zzjr;

    iput-object p2, p0, Lcom/google/android/gms/internal/zzjs;->val$context:Landroid/content/Context;

    iput-object p3, p0, Lcom/google/android/gms/internal/zzjs;->zzbez:Lcom/google/android/gms/internal/zzjn;

    iput-object p4, p0, Lcom/google/android/gms/internal/zzjs;->zzbfa:Ljava/lang/String;

    iput-object p5, p0, Lcom/google/android/gms/internal/zzjs;->zzbfb:Lcom/google/android/gms/internal/zzux;

    invoke-direct {p0, p1}, Lcom/google/android/gms/internal/zzjr$zza;-><init>(Lcom/google/android/gms/internal/zzjr;)V

    return-void
.end method


# virtual methods
.method public final zza(Lcom/google/android/gms/internal/zzla;)Ljava/lang/Object;
    .registers 9

    iget-object v0, p0, Lcom/google/android/gms/internal/zzjs;->val$context:Landroid/content/Context;

    .line 1
    new-instance v2, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/げつ〴ぬぐ/づざかべべ/くし〴〺ぅ;

    invoke-direct {v2, v0}, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/げつ〴ぬぐ/づざかべべ/くし〴〺ぅ;-><init>(Ljava/lang/Object;)V

    .line 2
    iget-object v3, p0, Lcom/google/android/gms/internal/zzjs;->zzbez:Lcom/google/android/gms/internal/zzjn;

    iget-object v4, p0, Lcom/google/android/gms/internal/zzjs;->zzbfa:Ljava/lang/String;

    iget-object v5, p0, Lcom/google/android/gms/internal/zzjs;->zzbfb:Lcom/google/android/gms/internal/zzux;

    const v6, 0xb5bb70

    move-object v1, p1

    invoke-interface/range {v1 .. v6}, Lcom/google/android/gms/internal/zzla;->createBannerAdManager(Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/げつ〴ぬぐ/づざかべべ/げつ〴ぬぐ;Lcom/google/android/gms/internal/zzjn;Ljava/lang/String;Lcom/google/android/gms/internal/zzux;I)Lcom/google/android/gms/internal/zzks;

    move-result-object p1

    return-object p1
.end method

.method public final synthetic zzhw()Ljava/lang/Object;
    .registers 8

    iget-object v0, p0, Lcom/google/android/gms/internal/zzjs;->zzbfc:Lcom/google/android/gms/internal/zzjr;

    invoke-static {v0}, Lcom/google/android/gms/internal/zzjr;->zzb(Lcom/google/android/gms/internal/zzjr;)Lcom/google/android/gms/internal/zzji;

    move-result-object v1

    iget-object v2, p0, Lcom/google/android/gms/internal/zzjs;->val$context:Landroid/content/Context;

    iget-object v3, p0, Lcom/google/android/gms/internal/zzjs;->zzbez:Lcom/google/android/gms/internal/zzjn;

    iget-object v4, p0, Lcom/google/android/gms/internal/zzjs;->zzbfa:Ljava/lang/String;

    iget-object v5, p0, Lcom/google/android/gms/internal/zzjs;->zzbfb:Lcom/google/android/gms/internal/zzux;

    const/4 v6, 0x1

    invoke-virtual/range {v1 .. v6}, Lcom/google/android/gms/internal/zzji;->zza(Landroid/content/Context;Lcom/google/android/gms/internal/zzjn;Ljava/lang/String;Lcom/google/android/gms/internal/zzux;I)Lcom/google/android/gms/internal/zzks;

    move-result-object v0

    if-eqz v0, :cond_16

    return-object v0

    :cond_16
    iget-object v0, p0, Lcom/google/android/gms/internal/zzjs;->zzbfc:Lcom/google/android/gms/internal/zzjr;

    iget-object v1, p0, Lcom/google/android/gms/internal/zzjs;->val$context:Landroid/content/Context;

    const-string v2, "banner"

    invoke-static {v0, v1, v2}, Lcom/google/android/gms/internal/zzjr;->zza(Lcom/google/android/gms/internal/zzjr;Landroid/content/Context;Ljava/lang/String;)V

    new-instance v0, Lcom/google/android/gms/internal/zzmg;

    invoke-direct {v0}, Lcom/google/android/gms/internal/zzmg;-><init>()V

    return-object v0
.end method
