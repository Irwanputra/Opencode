.class public Lcom/google/android/material/tabs/TabLayout$なぎぱいぢぎ$げつ〴ぬぐ;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Landroid/animation/ValueAnimator$AnimatorUpdateListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/google/android/material/tabs/TabLayout$なぎぱいぢぎ;->なぎぱいぢぎ(ZII)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic 〺つふすそ:I

.field public final synthetic くし〴〺ぅ:Lcom/google/android/material/tabs/TabLayout$なぎぱいぢぎ;

.field public final synthetic げつ〴ぬぐ:I


# direct methods
.method public constructor <init>(Lcom/google/android/material/tabs/TabLayout$なぎぱいぢぎ;II)V
    .registers 4

    iput-object p1, p0, Lcom/google/android/material/tabs/TabLayout$なぎぱいぢぎ$げつ〴ぬぐ;->くし〴〺ぅ:Lcom/google/android/material/tabs/TabLayout$なぎぱいぢぎ;

    iput p2, p0, Lcom/google/android/material/tabs/TabLayout$なぎぱいぢぎ$げつ〴ぬぐ;->げつ〴ぬぐ:I

    iput p3, p0, Lcom/google/android/material/tabs/TabLayout$なぎぱいぢぎ$げつ〴ぬぐ;->〺つふすそ:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onAnimationUpdate(Landroid/animation/ValueAnimator;)V
    .registers 6

    invoke-virtual {p1}, Landroid/animation/ValueAnimator;->getAnimatedFraction()F

    move-result p1

    iget-object v0, p0, Lcom/google/android/material/tabs/TabLayout$なぎぱいぢぎ$げつ〴ぬぐ;->くし〴〺ぅ:Lcom/google/android/material/tabs/TabLayout$なぎぱいぢぎ;

    .line 1
    iget v1, v0, Lcom/google/android/material/tabs/TabLayout$なぎぱいぢぎ;->ぺふねづ〺:I

    .line 2
    iget v2, p0, Lcom/google/android/material/tabs/TabLayout$なぎぱいぢぎ$げつ〴ぬぐ;->げつ〴ぬぐ:I

    .line 3
    sget-object v3, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/のぷのちつ/げつ〴ぬぐ;->げつ〴ぬぐ:Landroid/animation/TimeInterpolator;

    sub-int/2addr v2, v1

    int-to-float v2, v2

    mul-float v2, v2, p1

    invoke-static {v2}, Ljava/lang/Math;->round(F)I

    move-result v2

    add-int/2addr v2, v1

    .line 4
    iget-object v1, p0, Lcom/google/android/material/tabs/TabLayout$なぎぱいぢぎ$げつ〴ぬぐ;->くし〴〺ぅ:Lcom/google/android/material/tabs/TabLayout$なぎぱいぢぎ;

    .line 5
    iget v1, v1, Lcom/google/android/material/tabs/TabLayout$なぎぱいぢぎ;->てぜきぽく:I

    .line 6
    iget v3, p0, Lcom/google/android/material/tabs/TabLayout$なぎぱいぢぎ$げつ〴ぬぐ;->〺つふすそ:I

    sub-int/2addr v3, v1

    int-to-float v3, v3

    mul-float p1, p1, v3

    .line 7
    invoke-static {p1}, Ljava/lang/Math;->round(F)I

    move-result p1

    add-int/2addr p1, v1

    .line 8
    invoke-virtual {v0, v2, p1}, Lcom/google/android/material/tabs/TabLayout$なぎぱいぢぎ;->〺つふすそ(II)V

    return-void
.end method
