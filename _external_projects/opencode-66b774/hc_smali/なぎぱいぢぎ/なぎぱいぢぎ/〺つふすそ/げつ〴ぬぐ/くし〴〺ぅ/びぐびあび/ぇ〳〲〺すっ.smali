.class public final Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/げつ〴ぬぐ/くし〴〺ぅ/びぐびあび/ぇ〳〲〺すっ;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public synthetic 〺つふすそ:Ljava/lang/ref/WeakReference;

.field public synthetic くし〴〺ぅ:Lcom/google/android/gms/ads/internal/zzbi;


# direct methods
.method public constructor <init>(Lcom/google/android/gms/ads/internal/zzbi;Ljava/lang/ref/WeakReference;)V
    .registers 3

    iput-object p1, p0, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/げつ〴ぬぐ/くし〴〺ぅ/びぐびあび/ぇ〳〲〺すっ;->くし〴〺ぅ:Lcom/google/android/gms/ads/internal/zzbi;

    iput-object p2, p0, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/げつ〴ぬぐ/くし〴〺ぅ/びぐびあび/ぇ〳〲〺すっ;->〺つふすそ:Ljava/lang/ref/WeakReference;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .registers 4

    iget-object v0, p0, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/げつ〴ぬぐ/くし〴〺ぅ/びぐびあび/ぇ〳〲〺すっ;->くし〴〺ぅ:Lcom/google/android/gms/ads/internal/zzbi;

    const/4 v1, 0x0

    .line 1
    iput-boolean v1, v0, Lcom/google/android/gms/ads/internal/zzbi;->びぐびあび:Z

    .line 2
    iget-object v0, p0, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/げつ〴ぬぐ/くし〴〺ぅ/びぐびあび/ぇ〳〲〺すっ;->〺つふすそ:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/ads/internal/zza;

    if-eqz v0, :cond_27

    iget-object v1, p0, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/げつ〴ぬぐ/くし〴〺ぅ/びぐびあび/ぇ〳〲〺すっ;->くし〴〺ぅ:Lcom/google/android/gms/ads/internal/zzbi;

    .line 3
    iget-object v1, v1, Lcom/google/android/gms/ads/internal/zzbi;->くし〴〺ぅ:Lcom/google/android/gms/internal/zzjj;

    .line 4
    invoke-virtual {v0, v1}, Lcom/google/android/gms/ads/internal/zza;->zzc(Lcom/google/android/gms/internal/zzjj;)Z

    move-result v2

    if-eqz v2, :cond_1d

    invoke-virtual {v0, v1}, Lcom/google/android/gms/ads/internal/zza;->zzb(Lcom/google/android/gms/internal/zzjj;)Z

    return-void

    :cond_1d
    const-string v2, "Ad is not visible. Not refreshing ad."

    invoke-static {v2}, Lcom/google/android/gms/internal/zzakb;->zzct(Ljava/lang/String;)V

    iget-object v0, v0, Lcom/google/android/gms/ads/internal/zza;->zzann:Lcom/google/android/gms/ads/internal/zzbi;

    invoke-virtual {v0, v1}, Lcom/google/android/gms/ads/internal/zzbi;->zzg(Lcom/google/android/gms/internal/zzjj;)V

    :cond_27
    return-void
.end method
