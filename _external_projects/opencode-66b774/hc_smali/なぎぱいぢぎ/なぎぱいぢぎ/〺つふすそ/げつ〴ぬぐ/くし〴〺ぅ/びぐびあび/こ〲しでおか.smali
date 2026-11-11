.class public final Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/げつ〴ぬぐ/くし〴〺ぅ/びぐびあび/こ〲しでおか;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/google/android/gms/internal/zzanq;


# instance fields
.field public synthetic 〺つふすそ:Ljava/lang/Runnable;

.field public synthetic げつ〴ぬぐ:Lcom/google/android/gms/internal/zzafo;


# direct methods
.method public constructor <init>(Lcom/google/android/gms/internal/zzafo;Ljava/lang/Runnable;)V
    .registers 3

    iput-object p1, p0, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/げつ〴ぬぐ/くし〴〺ぅ/びぐびあび/こ〲しでおか;->げつ〴ぬぐ:Lcom/google/android/gms/internal/zzafo;

    iput-object p2, p0, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/げつ〴ぬぐ/くし〴〺ぅ/びぐびあび/こ〲しでおか;->〺つふすそ:Ljava/lang/Runnable;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final zzdb()V
    .registers 2

    iget-object v0, p0, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/げつ〴ぬぐ/くし〴〺ぅ/びぐびあび/こ〲しでおか;->げつ〴ぬぐ:Lcom/google/android/gms/internal/zzafo;

    iget-boolean v0, v0, Lcom/google/android/gms/internal/zzafo;->zzcxk:Z

    if-nez v0, :cond_e

    invoke-static {}, Lcom/google/android/gms/ads/internal/zzbs;->zzei()Lcom/google/android/gms/internal/zzahn;

    iget-object v0, p0, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/げつ〴ぬぐ/くし〴〺ぅ/びぐびあび/こ〲しでおか;->〺つふすそ:Ljava/lang/Runnable;

    invoke-static {v0}, Lcom/google/android/gms/internal/zzahn;->zzb(Ljava/lang/Runnable;)V

    :cond_e
    return-void
.end method
