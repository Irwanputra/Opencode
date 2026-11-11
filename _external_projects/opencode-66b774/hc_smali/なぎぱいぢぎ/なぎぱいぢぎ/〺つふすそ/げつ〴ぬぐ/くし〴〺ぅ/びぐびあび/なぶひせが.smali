.class public final Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/げつ〴ぬぐ/くし〴〺ぅ/びぐびあび/なぶひせが;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Landroid/view/View$OnTouchListener;


# instance fields
.field public synthetic 〺つふすそ:Lcom/google/android/gms/ads/internal/zzbm;


# direct methods
.method public constructor <init>(Lcom/google/android/gms/ads/internal/zzbm;)V
    .registers 2

    iput-object p1, p0, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/げつ〴ぬぐ/くし〴〺ぅ/びぐびあび/なぶひせが;->〺つふすそ:Lcom/google/android/gms/ads/internal/zzbm;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onTouch(Landroid/view/View;Landroid/view/MotionEvent;)Z
    .registers 3

    iget-object p1, p0, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/げつ〴ぬぐ/くし〴〺ぅ/びぐびあび/なぶひせが;->〺つふすそ:Lcom/google/android/gms/ads/internal/zzbm;

    .line 1
    iget-object p1, p1, Lcom/google/android/gms/ads/internal/zzbm;->ぺぁあねじ:Lcom/google/android/gms/internal/zzcv;

    if-eqz p1, :cond_9

    .line 2
    invoke-virtual {p1, p2}, Lcom/google/android/gms/internal/zzcv;->zza(Landroid/view/MotionEvent;)V

    :cond_9
    const/4 p1, 0x0

    return p1
.end method
