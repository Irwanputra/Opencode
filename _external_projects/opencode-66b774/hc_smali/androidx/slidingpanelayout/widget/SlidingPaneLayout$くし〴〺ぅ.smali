.class public Landroidx/slidingpanelayout/widget/SlidingPaneLayout$くし〴〺ぅ;
.super Lづざかべべ/いいにぽつ/げつ〴ぬぐ/づざかべべ$くし〴〺ぅ;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/slidingpanelayout/widget/SlidingPaneLayout;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "\u304f\u3057\u3034\u303a\u3045"
.end annotation


# instance fields
.field public final synthetic げつ〴ぬぐ:Landroidx/slidingpanelayout/widget/SlidingPaneLayout;


# direct methods
.method public constructor <init>(Landroidx/slidingpanelayout/widget/SlidingPaneLayout;)V
    .registers 2

    iput-object p1, p0, Landroidx/slidingpanelayout/widget/SlidingPaneLayout$くし〴〺ぅ;->げつ〴ぬぐ:Landroidx/slidingpanelayout/widget/SlidingPaneLayout;

    invoke-direct {p0}, Lづざかべべ/いいにぽつ/げつ〴ぬぐ/づざかべべ$くし〴〺ぅ;-><init>()V

    return-void
.end method


# virtual methods
.method public 〳ぜぞぜべっ(Landroid/view/View;I)V
    .registers 3

    iget-object p1, p0, Landroidx/slidingpanelayout/widget/SlidingPaneLayout$くし〴〺ぅ;->げつ〴ぬぐ:Landroidx/slidingpanelayout/widget/SlidingPaneLayout;

    invoke-virtual {p1}, Landroidx/slidingpanelayout/widget/SlidingPaneLayout;->〳ぜぞぜべっ()V

    return-void
.end method

.method public 〺つふすそ(Landroid/view/View;II)I
    .registers 4

    invoke-virtual {p1}, Landroid/view/View;->getTop()I

    move-result p1

    return p1
.end method

.method public いいにぽつ(Landroid/view/View;IIII)V
    .registers 7

    iget-object p1, p0, Landroidx/slidingpanelayout/widget/SlidingPaneLayout$くし〴〺ぅ;->げつ〴ぬぐ:Landroidx/slidingpanelayout/widget/SlidingPaneLayout;

    .line 1
    iget-object p3, p1, Landroidx/slidingpanelayout/widget/SlidingPaneLayout;->〳ぜぞぜべっ:Landroid/view/View;

    if-nez p3, :cond_a

    const/4 p2, 0x0

    iput p2, p1, Landroidx/slidingpanelayout/widget/SlidingPaneLayout;->ぺぁあねじ:F

    goto :goto_5f

    :cond_a
    invoke-virtual {p1}, Landroidx/slidingpanelayout/widget/SlidingPaneLayout;->づざかべべ()Z

    move-result p3

    iget-object p4, p1, Landroidx/slidingpanelayout/widget/SlidingPaneLayout;->〳ぜぞぜべっ:Landroid/view/View;

    invoke-virtual {p4}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object p4

    check-cast p4, Landroidx/slidingpanelayout/widget/SlidingPaneLayout$LayoutParams;

    iget-object p5, p1, Landroidx/slidingpanelayout/widget/SlidingPaneLayout;->〳ぜぞぜべっ:Landroid/view/View;

    invoke-virtual {p5}, Landroid/view/View;->getWidth()I

    move-result p5

    if-eqz p3, :cond_25

    invoke-virtual {p1}, Landroid/view/ViewGroup;->getWidth()I

    move-result v0

    sub-int/2addr v0, p2

    sub-int p2, v0, p5

    :cond_25
    if-eqz p3, :cond_2c

    invoke-virtual {p1}, Landroid/view/ViewGroup;->getPaddingRight()I

    move-result p5

    goto :goto_30

    :cond_2c
    invoke-virtual {p1}, Landroid/view/ViewGroup;->getPaddingLeft()I

    move-result p5

    :goto_30
    if-eqz p3, :cond_35

    iget p3, p4, Landroid/view/ViewGroup$MarginLayoutParams;->rightMargin:I

    goto :goto_37

    :cond_35
    iget p3, p4, Landroid/view/ViewGroup$MarginLayoutParams;->leftMargin:I

    :goto_37
    add-int/2addr p5, p3

    sub-int/2addr p2, p5

    int-to-float p2, p2

    iget p3, p1, Landroidx/slidingpanelayout/widget/SlidingPaneLayout;->ぺふねづ〺:I

    int-to-float p3, p3

    div-float/2addr p2, p3

    iput p2, p1, Landroidx/slidingpanelayout/widget/SlidingPaneLayout;->ぺぁあねじ:F

    iget p3, p1, Landroidx/slidingpanelayout/widget/SlidingPaneLayout;->のぷのちつ:I

    if-eqz p3, :cond_47

    invoke-virtual {p1, p2}, Landroidx/slidingpanelayout/widget/SlidingPaneLayout;->ぁごぐすすぃ(F)V

    :cond_47
    iget-boolean p2, p4, Landroidx/slidingpanelayout/widget/SlidingPaneLayout$LayoutParams;->くし〴〺ぅ:Z

    if-eqz p2, :cond_54

    iget-object p2, p1, Landroidx/slidingpanelayout/widget/SlidingPaneLayout;->〳ぜぞぜべっ:Landroid/view/View;

    iget p3, p1, Landroidx/slidingpanelayout/widget/SlidingPaneLayout;->ぺぁあねじ:F

    iget p4, p1, Landroidx/slidingpanelayout/widget/SlidingPaneLayout;->〺つふすそ:I

    invoke-virtual {p1, p2, p3, p4}, Landroidx/slidingpanelayout/widget/SlidingPaneLayout;->〺つふすそ(Landroid/view/View;FI)V

    :cond_54
    iget-object p2, p1, Landroidx/slidingpanelayout/widget/SlidingPaneLayout;->〳ぜぞぜべっ:Landroid/view/View;

    .line 2
    iget-object p3, p1, Landroidx/slidingpanelayout/widget/SlidingPaneLayout;->ぇぬぎばつ:Landroidx/slidingpanelayout/widget/SlidingPaneLayout$びぐびあび;

    if-eqz p3, :cond_5f

    iget p1, p1, Landroidx/slidingpanelayout/widget/SlidingPaneLayout;->ぺぁあねじ:F

    invoke-interface {p3, p2, p1}, Landroidx/slidingpanelayout/widget/SlidingPaneLayout$びぐびあび;->げつ〴ぬぐ(Landroid/view/View;F)V

    .line 3
    :cond_5f
    :goto_5f
    iget-object p1, p0, Landroidx/slidingpanelayout/widget/SlidingPaneLayout$くし〴〺ぅ;->げつ〴ぬぐ:Landroidx/slidingpanelayout/widget/SlidingPaneLayout;

    invoke-virtual {p1}, Landroid/view/ViewGroup;->invalidate()V

    return-void
.end method

.method public くし〴〺ぅ(Landroid/view/View;)I
    .registers 2

    iget-object p1, p0, Landroidx/slidingpanelayout/widget/SlidingPaneLayout$くし〴〺ぅ;->げつ〴ぬぐ:Landroidx/slidingpanelayout/widget/SlidingPaneLayout;

    iget p1, p1, Landroidx/slidingpanelayout/widget/SlidingPaneLayout;->ぺふねづ〺:I

    return p1
.end method

.method public げつ〴ぬぐ(Landroid/view/View;II)I
    .registers 5

    iget-object p1, p0, Landroidx/slidingpanelayout/widget/SlidingPaneLayout$くし〴〺ぅ;->げつ〴ぬぐ:Landroidx/slidingpanelayout/widget/SlidingPaneLayout;

    iget-object p1, p1, Landroidx/slidingpanelayout/widget/SlidingPaneLayout;->〳ぜぞぜべっ:Landroid/view/View;

    invoke-virtual {p1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object p1

    check-cast p1, Landroidx/slidingpanelayout/widget/SlidingPaneLayout$LayoutParams;

    iget-object p3, p0, Landroidx/slidingpanelayout/widget/SlidingPaneLayout$くし〴〺ぅ;->げつ〴ぬぐ:Landroidx/slidingpanelayout/widget/SlidingPaneLayout;

    invoke-virtual {p3}, Landroidx/slidingpanelayout/widget/SlidingPaneLayout;->づざかべべ()Z

    move-result p3

    if-eqz p3, :cond_3a

    iget-object p3, p0, Landroidx/slidingpanelayout/widget/SlidingPaneLayout$くし〴〺ぅ;->げつ〴ぬぐ:Landroidx/slidingpanelayout/widget/SlidingPaneLayout;

    invoke-virtual {p3}, Landroid/view/ViewGroup;->getWidth()I

    move-result p3

    iget-object v0, p0, Landroidx/slidingpanelayout/widget/SlidingPaneLayout$くし〴〺ぅ;->げつ〴ぬぐ:Landroidx/slidingpanelayout/widget/SlidingPaneLayout;

    invoke-virtual {v0}, Landroid/view/ViewGroup;->getPaddingRight()I

    move-result v0

    iget p1, p1, Landroid/view/ViewGroup$MarginLayoutParams;->rightMargin:I

    add-int/2addr v0, p1

    iget-object p1, p0, Landroidx/slidingpanelayout/widget/SlidingPaneLayout$くし〴〺ぅ;->げつ〴ぬぐ:Landroidx/slidingpanelayout/widget/SlidingPaneLayout;

    iget-object p1, p1, Landroidx/slidingpanelayout/widget/SlidingPaneLayout;->〳ぜぞぜべっ:Landroid/view/View;

    invoke-virtual {p1}, Landroid/view/View;->getWidth()I

    move-result p1

    add-int/2addr p1, v0

    sub-int/2addr p3, p1

    iget-object p1, p0, Landroidx/slidingpanelayout/widget/SlidingPaneLayout$くし〴〺ぅ;->げつ〴ぬぐ:Landroidx/slidingpanelayout/widget/SlidingPaneLayout;

    iget p1, p1, Landroidx/slidingpanelayout/widget/SlidingPaneLayout;->ぺふねづ〺:I

    sub-int p1, p3, p1

    invoke-static {p2, p3}, Ljava/lang/Math;->min(II)I

    move-result p2

    invoke-static {p2, p1}, Ljava/lang/Math;->max(II)I

    move-result p1

    goto :goto_50

    :cond_3a
    iget-object p3, p0, Landroidx/slidingpanelayout/widget/SlidingPaneLayout$くし〴〺ぅ;->げつ〴ぬぐ:Landroidx/slidingpanelayout/widget/SlidingPaneLayout;

    invoke-virtual {p3}, Landroid/view/ViewGroup;->getPaddingLeft()I

    move-result p3

    iget p1, p1, Landroid/view/ViewGroup$MarginLayoutParams;->leftMargin:I

    add-int/2addr p3, p1

    iget-object p1, p0, Landroidx/slidingpanelayout/widget/SlidingPaneLayout$くし〴〺ぅ;->げつ〴ぬぐ:Landroidx/slidingpanelayout/widget/SlidingPaneLayout;

    iget p1, p1, Landroidx/slidingpanelayout/widget/SlidingPaneLayout;->ぺふねづ〺:I

    add-int/2addr p1, p3

    invoke-static {p2, p3}, Ljava/lang/Math;->max(II)I

    move-result p2

    invoke-static {p2, p1}, Ljava/lang/Math;->min(II)I

    move-result p1

    :goto_50
    return p1
.end method

.method public づざかべべ(II)V
    .registers 4

    iget-object p1, p0, Landroidx/slidingpanelayout/widget/SlidingPaneLayout$くし〴〺ぅ;->げつ〴ぬぐ:Landroidx/slidingpanelayout/widget/SlidingPaneLayout;

    iget-object v0, p1, Landroidx/slidingpanelayout/widget/SlidingPaneLayout;->ぉざぅち〻:Lづざかべべ/いいにぽつ/げつ〴ぬぐ/づざかべべ;

    iget-object p1, p1, Landroidx/slidingpanelayout/widget/SlidingPaneLayout;->〳ぜぞぜべっ:Landroid/view/View;

    invoke-virtual {v0, p1, p2}, Lづざかべべ/いいにぽつ/げつ〴ぬぐ/づざかべべ;->くし〴〺ぅ(Landroid/view/View;I)V

    return-void
.end method

.method public てぜきぽく(Landroid/view/View;I)Z
    .registers 3

    iget-object p2, p0, Landroidx/slidingpanelayout/widget/SlidingPaneLayout$くし〴〺ぅ;->げつ〴ぬぐ:Landroidx/slidingpanelayout/widget/SlidingPaneLayout;

    iget-boolean p2, p2, Landroidx/slidingpanelayout/widget/SlidingPaneLayout;->てぜきぽく:Z

    if-eqz p2, :cond_8

    const/4 p1, 0x0

    return p1

    :cond_8
    invoke-virtual {p1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object p1

    check-cast p1, Landroidx/slidingpanelayout/widget/SlidingPaneLayout$LayoutParams;

    iget-boolean p1, p1, Landroidx/slidingpanelayout/widget/SlidingPaneLayout$LayoutParams;->〺つふすそ:Z

    return p1
.end method

.method public ぺぁあねじ(I)V
    .registers 5

    iget-object p1, p0, Landroidx/slidingpanelayout/widget/SlidingPaneLayout$くし〴〺ぅ;->げつ〴ぬぐ:Landroidx/slidingpanelayout/widget/SlidingPaneLayout;

    iget-object v0, p1, Landroidx/slidingpanelayout/widget/SlidingPaneLayout;->ぉざぅち〻:Lづざかべべ/いいにぽつ/げつ〴ぬぐ/づざかべべ;

    .line 1
    iget v0, v0, Lづざかべべ/いいにぽつ/げつ〴ぬぐ/づざかべべ;->げつ〴ぬぐ:I

    if-nez v0, :cond_39

    .line 2
    iget v0, p1, Landroidx/slidingpanelayout/widget/SlidingPaneLayout;->ぺぁあねじ:F

    const/4 v1, 0x0

    const/16 v2, 0x20

    cmpl-float v0, v0, v1

    if-nez v0, :cond_28

    iget-object v0, p1, Landroidx/slidingpanelayout/widget/SlidingPaneLayout;->〳ぜぞぜべっ:Landroid/view/View;

    invoke-virtual {p1, v0}, Landroidx/slidingpanelayout/widget/SlidingPaneLayout;->いいにぽつ(Landroid/view/View;)V

    iget-object p1, p0, Landroidx/slidingpanelayout/widget/SlidingPaneLayout$くし〴〺ぅ;->げつ〴ぬぐ:Landroidx/slidingpanelayout/widget/SlidingPaneLayout;

    iget-object v0, p1, Landroidx/slidingpanelayout/widget/SlidingPaneLayout;->〳ぜぞぜべっ:Landroid/view/View;

    .line 3
    iget-object v1, p1, Landroidx/slidingpanelayout/widget/SlidingPaneLayout;->ぇぬぎばつ:Landroidx/slidingpanelayout/widget/SlidingPaneLayout$びぐびあび;

    if-eqz v1, :cond_21

    invoke-interface {v1, v0}, Landroidx/slidingpanelayout/widget/SlidingPaneLayout$びぐびあび;->くし〴〺ぅ(Landroid/view/View;)V

    :cond_21
    invoke-virtual {p1, v2}, Landroid/view/ViewGroup;->sendAccessibilityEvent(I)V

    .line 4
    iget-object p1, p0, Landroidx/slidingpanelayout/widget/SlidingPaneLayout$くし〴〺ぅ;->げつ〴ぬぐ:Landroidx/slidingpanelayout/widget/SlidingPaneLayout;

    const/4 v0, 0x0

    goto :goto_37

    :cond_28
    iget-object v0, p1, Landroidx/slidingpanelayout/widget/SlidingPaneLayout;->〳ぜぞぜべっ:Landroid/view/View;

    .line 5
    iget-object v1, p1, Landroidx/slidingpanelayout/widget/SlidingPaneLayout;->ぇぬぎばつ:Landroidx/slidingpanelayout/widget/SlidingPaneLayout$びぐびあび;

    if-eqz v1, :cond_31

    invoke-interface {v1, v0}, Landroidx/slidingpanelayout/widget/SlidingPaneLayout$びぐびあび;->〺つふすそ(Landroid/view/View;)V

    :cond_31
    invoke-virtual {p1, v2}, Landroid/view/ViewGroup;->sendAccessibilityEvent(I)V

    .line 6
    iget-object p1, p0, Landroidx/slidingpanelayout/widget/SlidingPaneLayout$くし〴〺ぅ;->げつ〴ぬぐ:Landroidx/slidingpanelayout/widget/SlidingPaneLayout;

    const/4 v0, 0x1

    :goto_37
    iput-boolean v0, p1, Landroidx/slidingpanelayout/widget/SlidingPaneLayout;->ざとぅぼこ〺:Z

    :cond_39
    return-void
.end method

.method public ぺふねづ〺(Landroid/view/View;FF)V
    .registers 7

    invoke-virtual {p1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object p3

    check-cast p3, Landroidx/slidingpanelayout/widget/SlidingPaneLayout$LayoutParams;

    iget-object v0, p0, Landroidx/slidingpanelayout/widget/SlidingPaneLayout$くし〴〺ぅ;->げつ〴ぬぐ:Landroidx/slidingpanelayout/widget/SlidingPaneLayout;

    invoke-virtual {v0}, Landroidx/slidingpanelayout/widget/SlidingPaneLayout;->づざかべべ()Z

    move-result v0

    const/high16 v1, 0x3f000000    # 0.5f

    const/4 v2, 0x0

    if-eqz v0, :cond_40

    iget-object v0, p0, Landroidx/slidingpanelayout/widget/SlidingPaneLayout$くし〴〺ぅ;->げつ〴ぬぐ:Landroidx/slidingpanelayout/widget/SlidingPaneLayout;

    invoke-virtual {v0}, Landroid/view/ViewGroup;->getPaddingRight()I

    move-result v0

    iget p3, p3, Landroid/view/ViewGroup$MarginLayoutParams;->rightMargin:I

    add-int/2addr v0, p3

    cmpg-float p3, p2, v2

    if-ltz p3, :cond_2a

    cmpl-float p2, p2, v2

    if-nez p2, :cond_2f

    iget-object p2, p0, Landroidx/slidingpanelayout/widget/SlidingPaneLayout$くし〴〺ぅ;->げつ〴ぬぐ:Landroidx/slidingpanelayout/widget/SlidingPaneLayout;

    iget p2, p2, Landroidx/slidingpanelayout/widget/SlidingPaneLayout;->ぺぁあねじ:F

    cmpl-float p2, p2, v1

    if-lez p2, :cond_2f

    :cond_2a
    iget-object p2, p0, Landroidx/slidingpanelayout/widget/SlidingPaneLayout$くし〴〺ぅ;->げつ〴ぬぐ:Landroidx/slidingpanelayout/widget/SlidingPaneLayout;

    iget p2, p2, Landroidx/slidingpanelayout/widget/SlidingPaneLayout;->ぺふねづ〺:I

    add-int/2addr v0, p2

    :cond_2f
    iget-object p2, p0, Landroidx/slidingpanelayout/widget/SlidingPaneLayout$くし〴〺ぅ;->げつ〴ぬぐ:Landroidx/slidingpanelayout/widget/SlidingPaneLayout;

    iget-object p2, p2, Landroidx/slidingpanelayout/widget/SlidingPaneLayout;->〳ぜぞぜべっ:Landroid/view/View;

    invoke-virtual {p2}, Landroid/view/View;->getWidth()I

    move-result p2

    iget-object p3, p0, Landroidx/slidingpanelayout/widget/SlidingPaneLayout$くし〴〺ぅ;->げつ〴ぬぐ:Landroidx/slidingpanelayout/widget/SlidingPaneLayout;

    invoke-virtual {p3}, Landroid/view/ViewGroup;->getWidth()I

    move-result p3

    sub-int/2addr p3, v0

    sub-int/2addr p3, p2

    goto :goto_5e

    :cond_40
    iget-object v0, p0, Landroidx/slidingpanelayout/widget/SlidingPaneLayout$くし〴〺ぅ;->げつ〴ぬぐ:Landroidx/slidingpanelayout/widget/SlidingPaneLayout;

    invoke-virtual {v0}, Landroid/view/ViewGroup;->getPaddingLeft()I

    move-result v0

    iget p3, p3, Landroid/view/ViewGroup$MarginLayoutParams;->leftMargin:I

    add-int/2addr p3, v0

    cmpl-float v0, p2, v2

    if-gtz v0, :cond_59

    cmpl-float p2, p2, v2

    if-nez p2, :cond_5e

    iget-object p2, p0, Landroidx/slidingpanelayout/widget/SlidingPaneLayout$くし〴〺ぅ;->げつ〴ぬぐ:Landroidx/slidingpanelayout/widget/SlidingPaneLayout;

    iget p2, p2, Landroidx/slidingpanelayout/widget/SlidingPaneLayout;->ぺぁあねじ:F

    cmpl-float p2, p2, v1

    if-lez p2, :cond_5e

    :cond_59
    iget-object p2, p0, Landroidx/slidingpanelayout/widget/SlidingPaneLayout$くし〴〺ぅ;->げつ〴ぬぐ:Landroidx/slidingpanelayout/widget/SlidingPaneLayout;

    iget p2, p2, Landroidx/slidingpanelayout/widget/SlidingPaneLayout;->ぺふねづ〺:I

    add-int/2addr p3, p2

    :cond_5e
    :goto_5e
    iget-object p2, p0, Landroidx/slidingpanelayout/widget/SlidingPaneLayout$くし〴〺ぅ;->げつ〴ぬぐ:Landroidx/slidingpanelayout/widget/SlidingPaneLayout;

    iget-object p2, p2, Landroidx/slidingpanelayout/widget/SlidingPaneLayout;->ぉざぅち〻:Lづざかべべ/いいにぽつ/げつ〴ぬぐ/づざかべべ;

    invoke-virtual {p1}, Landroid/view/View;->getTop()I

    move-result p1

    invoke-virtual {p2, p3, p1}, Lづざかべべ/いいにぽつ/げつ〴ぬぐ/づざかべべ;->〻ぞまぎな〻(II)Z

    iget-object p1, p0, Landroidx/slidingpanelayout/widget/SlidingPaneLayout$くし〴〺ぅ;->げつ〴ぬぐ:Landroidx/slidingpanelayout/widget/SlidingPaneLayout;

    invoke-virtual {p1}, Landroid/view/ViewGroup;->invalidate()V

    return-void
.end method
