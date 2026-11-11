.class public Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/は〲ぱなで/げつ〴ぬぐ;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Landroid/animation/ValueAnimator$AnimatorUpdateListener;


# instance fields
.field public final synthetic げつ〴ぬぐ:Lcom/google/android/material/bottomsheet/BottomSheetBehavior;


# direct methods
.method public constructor <init>(Lcom/google/android/material/bottomsheet/BottomSheetBehavior;)V
    .registers 2

    iput-object p1, p0, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/は〲ぱなで/げつ〴ぬぐ;->げつ〴ぬぐ:Lcom/google/android/material/bottomsheet/BottomSheetBehavior;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onAnimationUpdate(Landroid/animation/ValueAnimator;)V
    .registers 3

    invoke-virtual {p1}, Landroid/animation/ValueAnimator;->getAnimatedValue()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Float;

    invoke-virtual {p1}, Ljava/lang/Float;->floatValue()F

    move-result p1

    iget-object v0, p0, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/は〲ぱなで/げつ〴ぬぐ;->げつ〴ぬぐ:Lcom/google/android/material/bottomsheet/BottomSheetBehavior;

    .line 1
    iget-object v0, v0, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->ぺぁあねじ:Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/ぉひのべい/〳ぜぞぜべっ;

    if-eqz v0, :cond_13

    .line 2
    invoke-virtual {v0, p1}, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/ぉひのべい/〳ぜぞぜべっ;->ざっざへづ(F)V

    :cond_13
    return-void
.end method
