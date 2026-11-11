.class public Lteam/dev/epro/apkcustom/widgets/FreshDownloadView$なぎぱいぢぎ;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Landroid/animation/ValueAnimator$AnimatorUpdateListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lteam/dev/epro/apkcustom/widgets/FreshDownloadView;->getPrepareAnimator()Landroid/animation/AnimatorSet;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic げつ〴ぬぐ:Lteam/dev/epro/apkcustom/widgets/FreshDownloadView;


# direct methods
.method public constructor <init>(Lteam/dev/epro/apkcustom/widgets/FreshDownloadView;)V
    .registers 2

    iput-object p1, p0, Lteam/dev/epro/apkcustom/widgets/FreshDownloadView$なぎぱいぢぎ;->げつ〴ぬぐ:Lteam/dev/epro/apkcustom/widgets/FreshDownloadView;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onAnimationUpdate(Landroid/animation/ValueAnimator;)V
    .registers 6

    invoke-virtual {p1}, Landroid/animation/ValueAnimator;->getAnimatedValue()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Float;

    invoke-virtual {p1}, Ljava/lang/Float;->floatValue()F

    move-result p1

    iget-object v0, p0, Lteam/dev/epro/apkcustom/widgets/FreshDownloadView$なぎぱいぢぎ;->げつ〴ぬぐ:Lteam/dev/epro/apkcustom/widgets/FreshDownloadView;

    .line 1
    iget v1, v0, Lteam/dev/epro/apkcustom/widgets/FreshDownloadView;->けときぜと:F

    .line 2
    invoke-virtual {v0}, Lteam/dev/epro/apkcustom/widgets/FreshDownloadView;->getRadius()F

    move-result v2

    const v3, 0x3f051eb8    # 0.52f

    mul-float v2, v2, v3

    mul-float v2, v2, p1

    add-float/2addr v2, v1

    .line 3
    iput v2, v0, Lteam/dev/epro/apkcustom/widgets/FreshDownloadView;->ぷぞてのほき:F

    .line 4
    iget-object p1, p0, Lteam/dev/epro/apkcustom/widgets/FreshDownloadView$なぎぱいぢぎ;->げつ〴ぬぐ:Lteam/dev/epro/apkcustom/widgets/FreshDownloadView;

    .line 5
    invoke-virtual {p1}, Lteam/dev/epro/apkcustom/widgets/FreshDownloadView;->なぎぱいぢぎ()V

    .line 6
    iget-object p1, p0, Lteam/dev/epro/apkcustom/widgets/FreshDownloadView$なぎぱいぢぎ;->げつ〴ぬぐ:Lteam/dev/epro/apkcustom/widgets/FreshDownloadView;

    invoke-virtual {p1}, Landroid/view/View;->invalidate()V

    return-void
.end method
