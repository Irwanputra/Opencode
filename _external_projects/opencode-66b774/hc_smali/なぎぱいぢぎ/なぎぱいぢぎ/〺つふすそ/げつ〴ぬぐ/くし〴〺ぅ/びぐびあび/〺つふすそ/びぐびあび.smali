.class public final Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/げつ〴ぬぐ/くし〴〺ぅ/びぐびあび/〺つふすそ/びぐびあび;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/google/android/gms/internal/zzalk;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/google/android/gms/internal/zzalk<",
        "Lcom/google/android/gms/ads/internal/js/zzc;",
        ">;"
    }
.end annotation


# instance fields
.field public synthetic げつ〴ぬぐ:Lcom/google/android/gms/ads/internal/js/zzaa;


# direct methods
.method public constructor <init>(Lcom/google/android/gms/ads/internal/js/zzaa;)V
    .registers 2

    iput-object p1, p0, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/げつ〴ぬぐ/くし〴〺ぅ/びぐびあび/〺つふすそ/びぐびあび;->げつ〴ぬぐ:Lcom/google/android/gms/ads/internal/js/zzaa;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final synthetic zzf(Ljava/lang/Object;)V
    .registers 3

    check-cast p1, Lcom/google/android/gms/ads/internal/js/zzc;

    const-string v0, "Getting a new session for JS Engine."

    invoke-static {v0}, Lcom/google/android/gms/internal/zzagf;->v(Ljava/lang/String;)V

    iget-object v0, p0, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/げつ〴ぬぐ/くし〴〺ぅ/びぐびあび/〺つふすそ/びぐびあび;->げつ〴ぬぐ:Lcom/google/android/gms/ads/internal/js/zzaa;

    invoke-interface {p1}, Lcom/google/android/gms/ads/internal/js/zzc;->zzln()Lcom/google/android/gms/ads/internal/js/zzak;

    move-result-object p1

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/zzall;->zzk(Ljava/lang/Object;)V

    return-void
.end method
