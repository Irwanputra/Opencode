.class public Lteam/dev/epro/apkcustom/widgets/FreshDownloadView$ぁごぐすすぃ;
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

    iput-object p1, p0, Lteam/dev/epro/apkcustom/widgets/FreshDownloadView$ぁごぐすすぃ;->げつ〴ぬぐ:Lteam/dev/epro/apkcustom/widgets/FreshDownloadView;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onAnimationUpdate(Landroid/animation/ValueAnimator;)V
    .registers 10

    invoke-virtual {p1}, Landroid/animation/ValueAnimator;->getAnimatedValue()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Float;

    invoke-virtual {p1}, Ljava/lang/Float;->floatValue()F

    move-result p1

    iget-object v0, p0, Lteam/dev/epro/apkcustom/widgets/FreshDownloadView$ぁごぐすすぃ;->げつ〴ぬぐ:Lteam/dev/epro/apkcustom/widgets/FreshDownloadView;

    new-instance v1, Landroid/graphics/DashPathEffect;

    const/4 v2, 0x2

    new-array v3, v2, [F

    iget-object v4, p0, Lteam/dev/epro/apkcustom/widgets/FreshDownloadView$ぁごぐすすぃ;->げつ〴ぬぐ:Lteam/dev/epro/apkcustom/widgets/FreshDownloadView;

    .line 1
    iget v4, v4, Lteam/dev/epro/apkcustom/widgets/FreshDownloadView;->おかぷせ〱:F

    const/4 v5, 0x0

    aput v4, v3, v5

    const/4 v6, 0x1

    aput v4, v3, v6

    mul-float v4, v4, p1

    .line 2
    invoke-direct {v1, v3, v4}, Landroid/graphics/DashPathEffect;-><init>([FF)V

    .line 3
    iput-object v1, v0, Lteam/dev/epro/apkcustom/widgets/FreshDownloadView;->ながふずは:Landroid/graphics/DashPathEffect;

    .line 4
    iget-object v0, p0, Lteam/dev/epro/apkcustom/widgets/FreshDownloadView$ぁごぐすすぃ;->げつ〴ぬぐ:Lteam/dev/epro/apkcustom/widgets/FreshDownloadView;

    new-instance v1, Landroid/graphics/DashPathEffect;

    new-array v3, v2, [F

    iget-object v4, p0, Lteam/dev/epro/apkcustom/widgets/FreshDownloadView$ぁごぐすすぃ;->げつ〴ぬぐ:Lteam/dev/epro/apkcustom/widgets/FreshDownloadView;

    .line 5
    iget v4, v4, Lteam/dev/epro/apkcustom/widgets/FreshDownloadView;->〺でおいここ:F

    aput v4, v3, v5

    aput v4, v3, v6

    mul-float v4, v4, p1

    .line 6
    invoke-direct {v1, v3, v4}, Landroid/graphics/DashPathEffect;-><init>([FF)V

    .line 7
    iput-object v1, v0, Lteam/dev/epro/apkcustom/widgets/FreshDownloadView;->ぃぜぶの〸ぃ:Landroid/graphics/DashPathEffect;

    const/high16 v0, 0x3f800000    # 1.0f

    sub-float/2addr v0, p1

    .line 8
    iget-object v1, p0, Lteam/dev/epro/apkcustom/widgets/FreshDownloadView$ぁごぐすすぃ;->げつ〴ぬぐ:Lteam/dev/epro/apkcustom/widgets/FreshDownloadView;

    .line 9
    iget v3, v1, Lteam/dev/epro/apkcustom/widgets/FreshDownloadView;->けときぜと:F

    .line 10
    iget v4, v1, Lteam/dev/epro/apkcustom/widgets/FreshDownloadView;->ぺふねづ〺:F

    sub-float/2addr v3, v4

    mul-float v3, v3, v0

    .line 11
    iget-object v0, v1, Lteam/dev/epro/apkcustom/widgets/FreshDownloadView;->どぇぞほだ:Landroid/graphics/Path;

    .line 12
    invoke-virtual {v0}, Landroid/graphics/Path;->reset()V

    iget-object v0, p0, Lteam/dev/epro/apkcustom/widgets/FreshDownloadView$ぁごぐすすぃ;->げつ〴ぬぐ:Lteam/dev/epro/apkcustom/widgets/FreshDownloadView;

    .line 13
    iget-object v1, v0, Lteam/dev/epro/apkcustom/widgets/FreshDownloadView;->どぇぞほだ:Landroid/graphics/Path;

    .line 14
    iget v4, v0, Lteam/dev/epro/apkcustom/widgets/FreshDownloadView;->ぺぁあねじ:F

    .line 15
    iget v7, v0, Lteam/dev/epro/apkcustom/widgets/FreshDownloadView;->〺つふすそ:F

    add-float/2addr v4, v7

    .line 16
    iget v0, v0, Lteam/dev/epro/apkcustom/widgets/FreshDownloadView;->ぺふねづ〺:F

    add-float/2addr v0, v3

    .line 17
    invoke-virtual {v1, v4, v0}, Landroid/graphics/Path;->moveTo(FF)V

    iget-object v0, p0, Lteam/dev/epro/apkcustom/widgets/FreshDownloadView$ぁごぐすすぃ;->げつ〴ぬぐ:Lteam/dev/epro/apkcustom/widgets/FreshDownloadView;

    .line 18
    iget-object v1, v0, Lteam/dev/epro/apkcustom/widgets/FreshDownloadView;->どぇぞほだ:Landroid/graphics/Path;

    .line 19
    iget v4, v0, Lteam/dev/epro/apkcustom/widgets/FreshDownloadView;->ぺぁあねじ:F

    .line 20
    iget v7, v0, Lteam/dev/epro/apkcustom/widgets/FreshDownloadView;->〺つふすそ:F

    add-float/2addr v4, v7

    .line 21
    iget v7, v0, Lteam/dev/epro/apkcustom/widgets/FreshDownloadView;->ぺふねづ〺:F

    add-float/2addr v7, v3

    .line 22
    iget v0, v0, Lteam/dev/epro/apkcustom/widgets/FreshDownloadView;->ぇとしたべど:F

    add-float/2addr v7, v0

    .line 23
    invoke-virtual {v1, v4, v7}, Landroid/graphics/Path;->lineTo(FF)V

    iget-object v0, p0, Lteam/dev/epro/apkcustom/widgets/FreshDownloadView$ぁごぐすすぃ;->げつ〴ぬぐ:Lteam/dev/epro/apkcustom/widgets/FreshDownloadView;

    new-instance v1, Landroid/graphics/DashPathEffect;

    new-array v2, v2, [F

    iget-object v3, p0, Lteam/dev/epro/apkcustom/widgets/FreshDownloadView$ぁごぐすすぃ;->げつ〴ぬぐ:Lteam/dev/epro/apkcustom/widgets/FreshDownloadView;

    .line 24
    iget v3, v3, Lteam/dev/epro/apkcustom/widgets/FreshDownloadView;->ぇとしたべど:F

    aput v3, v2, v5

    aput v3, v2, v6

    mul-float p1, p1, v3

    .line 25
    invoke-direct {v1, v2, p1}, Landroid/graphics/DashPathEffect;-><init>([FF)V

    .line 26
    iput-object v1, v0, Lteam/dev/epro/apkcustom/widgets/FreshDownloadView;->げがぴうあだ:Landroid/graphics/DashPathEffect;

    .line 27
    iget-object p1, p0, Lteam/dev/epro/apkcustom/widgets/FreshDownloadView$ぁごぐすすぃ;->げつ〴ぬぐ:Lteam/dev/epro/apkcustom/widgets/FreshDownloadView;

    invoke-virtual {p1}, Landroid/view/View;->invalidate()V

    return-void
.end method
