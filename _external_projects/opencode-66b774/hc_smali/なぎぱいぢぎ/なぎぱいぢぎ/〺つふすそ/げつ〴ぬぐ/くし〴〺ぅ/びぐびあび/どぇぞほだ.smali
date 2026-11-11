.class public final Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/げつ〴ぬぐ/くし〴〺ぅ/びぐびあび/どぇぞほだ;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/util/concurrent/Callable;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ljava/util/concurrent/Callable<",
        "Lcom/google/android/gms/internal/zzcv;",
        ">;"
    }
.end annotation


# instance fields
.field public synthetic げつ〴ぬぐ:Lcom/google/android/gms/ads/internal/zzbm;


# direct methods
.method public constructor <init>(Lcom/google/android/gms/ads/internal/zzbm;)V
    .registers 2

    iput-object p1, p0, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/げつ〴ぬぐ/くし〴〺ぅ/びぐびあび/どぇぞほだ;->げつ〴ぬぐ:Lcom/google/android/gms/ads/internal/zzbm;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final synthetic call()Ljava/lang/Object;
    .registers 4

    iget-object v0, p0, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/げつ〴ぬぐ/くし〴〺ぅ/びぐびあび/どぇぞほだ;->げつ〴ぬぐ:Lcom/google/android/gms/ads/internal/zzbm;

    .line 1
    iget-object v1, v0, Lcom/google/android/gms/ads/internal/zzbm;->〺つふすそ:Lcom/google/android/gms/internal/zzakd;

    .line 2
    iget-object v1, v1, Lcom/google/android/gms/internal/zzakd;->zzcv:Ljava/lang/String;

    .line 3
    iget-object v0, v0, Lcom/google/android/gms/ads/internal/zzbm;->づざかべべ:Landroid/content/Context;

    const/4 v2, 0x0

    .line 4
    invoke-static {v1, v0, v2}, Lcom/google/android/gms/internal/zzcu;->zza(Ljava/lang/String;Landroid/content/Context;Z)Lcom/google/android/gms/internal/zzcu;

    move-result-object v0

    new-instance v1, Lcom/google/android/gms/internal/zzcv;

    invoke-direct {v1, v0}, Lcom/google/android/gms/internal/zzcv;-><init>(Lcom/google/android/gms/internal/zzcr;)V

    return-object v1
.end method
