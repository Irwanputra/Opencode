.class public final Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/げつ〴ぬぐ/くし〴〺ぅ/びぐびあび/〺つふすそ/てぜきぽく;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public synthetic 〺つふすそ:Ljava/lang/String;

.field public synthetic くし〴〺ぅ:Lcom/google/android/gms/ads/internal/js/zze;


# direct methods
.method public constructor <init>(Lcom/google/android/gms/ads/internal/js/zze;Ljava/lang/String;)V
    .registers 3

    iput-object p1, p0, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/げつ〴ぬぐ/くし〴〺ぅ/びぐびあび/〺つふすそ/てぜきぽく;->くし〴〺ぅ:Lcom/google/android/gms/ads/internal/js/zze;

    iput-object p2, p0, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/げつ〴ぬぐ/くし〴〺ぅ/びぐびあび/〺つふすそ/てぜきぽく;->〺つふすそ:Ljava/lang/String;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .registers 3

    iget-object v0, p0, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/げつ〴ぬぐ/くし〴〺ぅ/びぐびあび/〺つふすそ/てぜきぽく;->くし〴〺ぅ:Lcom/google/android/gms/ads/internal/js/zze;

    .line 1
    iget-object v0, v0, Lcom/google/android/gms/ads/internal/js/zze;->〺つふすそ:Lcom/google/android/gms/internal/zzanh;

    .line 2
    iget-object v1, p0, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/げつ〴ぬぐ/くし〴〺ぅ/びぐびあび/〺つふすそ/てぜきぽく;->〺つふすそ:Ljava/lang/String;

    invoke-interface {v0, v1}, Lcom/google/android/gms/internal/zzanh;->loadUrl(Ljava/lang/String;)V

    return-void
.end method
