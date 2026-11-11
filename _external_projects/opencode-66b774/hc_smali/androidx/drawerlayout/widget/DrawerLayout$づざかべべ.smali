.class public Landroidx/drawerlayout/widget/DrawerLayout$づざかべべ;
.super Lづざかべべ/いいにぽつ/げつ〴ぬぐ/づざかべべ$くし〴〺ぅ;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/drawerlayout/widget/DrawerLayout;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "\u3065\u3056\u304b\u3079\u3079"
.end annotation


# instance fields
.field public 〺つふすそ:Lづざかべべ/いいにぽつ/げつ〴ぬぐ/づざかべべ;

.field public final くし〴〺ぅ:Ljava/lang/Runnable;

.field public final げつ〴ぬぐ:I

.field public final synthetic びぐびあび:Landroidx/drawerlayout/widget/DrawerLayout;


# direct methods
.method public constructor <init>(Landroidx/drawerlayout/widget/DrawerLayout;I)V
    .registers 3

    iput-object p1, p0, Landroidx/drawerlayout/widget/DrawerLayout$づざかべべ;->びぐびあび:Landroidx/drawerlayout/widget/DrawerLayout;

    invoke-direct {p0}, Lづざかべべ/いいにぽつ/げつ〴ぬぐ/づざかべべ$くし〴〺ぅ;-><init>()V

    new-instance p1, Landroidx/drawerlayout/widget/DrawerLayout$づざかべべ$げつ〴ぬぐ;

    invoke-direct {p1, p0}, Landroidx/drawerlayout/widget/DrawerLayout$づざかべべ$げつ〴ぬぐ;-><init>(Landroidx/drawerlayout/widget/DrawerLayout$づざかべべ;)V

    iput-object p1, p0, Landroidx/drawerlayout/widget/DrawerLayout$づざかべべ;->くし〴〺ぅ:Ljava/lang/Runnable;

    iput p2, p0, Landroidx/drawerlayout/widget/DrawerLayout$づざかべべ;->げつ〴ぬぐ:I

    return-void
.end method


# virtual methods
.method public 〳ぜぞぜべっ(Landroid/view/View;I)V
    .registers 3

    invoke-virtual {p1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object p1

    check-cast p1, Landroidx/drawerlayout/widget/DrawerLayout$LayoutParams;

    const/4 p2, 0x0

    iput-boolean p2, p1, Landroidx/drawerlayout/widget/DrawerLayout$LayoutParams;->くし〴〺ぅ:Z

    invoke-virtual {p0}, Landroidx/drawerlayout/widget/DrawerLayout$づざかべべ;->のぷのちつ()V

    return-void
.end method

.method public 〺つふすそ(Landroid/view/View;II)I
    .registers 4

    invoke-virtual {p1}, Landroid/view/View;->getTop()I

    move-result p1

    return p1
.end method

.method public ぁごぐすすぃ(II)V
    .registers 5

    iget-object p1, p0, Landroidx/drawerlayout/widget/DrawerLayout$づざかべべ;->びぐびあび:Landroidx/drawerlayout/widget/DrawerLayout;

    iget-object p2, p0, Landroidx/drawerlayout/widget/DrawerLayout$づざかべべ;->くし〴〺ぅ:Ljava/lang/Runnable;

    const-wide/16 v0, 0xa0

    invoke-virtual {p1, p2, v0, v1}, Landroid/view/ViewGroup;->postDelayed(Ljava/lang/Runnable;J)Z

    return-void
.end method

.method public いいにぽつ(Landroid/view/View;IIII)V
    .registers 6

    invoke-virtual {p1}, Landroid/view/View;->getWidth()I

    move-result p3

    iget-object p4, p0, Landroidx/drawerlayout/widget/DrawerLayout$づざかべべ;->びぐびあび:Landroidx/drawerlayout/widget/DrawerLayout;

    const/4 p5, 0x3

    invoke-virtual {p4, p1, p5}, Landroidx/drawerlayout/widget/DrawerLayout;->げつ〴ぬぐ(Landroid/view/View;I)Z

    move-result p4

    if-eqz p4, :cond_10

    add-int/2addr p2, p3

    int-to-float p2, p2

    goto :goto_18

    :cond_10
    iget-object p4, p0, Landroidx/drawerlayout/widget/DrawerLayout$づざかべべ;->びぐびあび:Landroidx/drawerlayout/widget/DrawerLayout;

    invoke-virtual {p4}, Landroid/view/ViewGroup;->getWidth()I

    move-result p4

    sub-int/2addr p4, p2

    int-to-float p2, p4

    :goto_18
    int-to-float p3, p3

    div-float/2addr p2, p3

    iget-object p3, p0, Landroidx/drawerlayout/widget/DrawerLayout$づざかべべ;->びぐびあび:Landroidx/drawerlayout/widget/DrawerLayout;

    invoke-virtual {p3, p1, p2}, Landroidx/drawerlayout/widget/DrawerLayout;->でどあくず(Landroid/view/View;F)V

    const/4 p3, 0x0

    cmpl-float p2, p2, p3

    if-nez p2, :cond_26

    const/4 p2, 0x4

    goto :goto_27

    :cond_26
    const/4 p2, 0x0

    :goto_27
    invoke-virtual {p1, p2}, Landroid/view/View;->setVisibility(I)V

    iget-object p1, p0, Landroidx/drawerlayout/widget/DrawerLayout$づざかべべ;->びぐびあび:Landroidx/drawerlayout/widget/DrawerLayout;

    invoke-virtual {p1}, Landroid/view/ViewGroup;->invalidate()V

    return-void
.end method

.method public くし〴〺ぅ(Landroid/view/View;)I
    .registers 3

    iget-object v0, p0, Landroidx/drawerlayout/widget/DrawerLayout$づざかべべ;->びぐびあび:Landroidx/drawerlayout/widget/DrawerLayout;

    invoke-virtual {v0, p1}, Landroidx/drawerlayout/widget/DrawerLayout;->ぇぬぎばつ(Landroid/view/View;)Z

    move-result v0

    if-eqz v0, :cond_d

    invoke-virtual {p1}, Landroid/view/View;->getWidth()I

    move-result p1

    goto :goto_e

    :cond_d
    const/4 p1, 0x0

    :goto_e
    return p1
.end method

.method public げつ〴ぬぐ(Landroid/view/View;II)I
    .registers 5

    iget-object p3, p0, Landroidx/drawerlayout/widget/DrawerLayout$づざかべべ;->びぐびあび:Landroidx/drawerlayout/widget/DrawerLayout;

    const/4 v0, 0x3

    invoke-virtual {p3, p1, v0}, Landroidx/drawerlayout/widget/DrawerLayout;->げつ〴ぬぐ(Landroid/view/View;I)Z

    move-result p3

    if-eqz p3, :cond_18

    invoke-virtual {p1}, Landroid/view/View;->getWidth()I

    move-result p1

    neg-int p1, p1

    const/4 p3, 0x0

    :goto_f
    invoke-static {p2, p3}, Ljava/lang/Math;->min(II)I

    move-result p2

    invoke-static {p1, p2}, Ljava/lang/Math;->max(II)I

    move-result p1

    return p1

    :cond_18
    iget-object p3, p0, Landroidx/drawerlayout/widget/DrawerLayout$づざかべべ;->びぐびあび:Landroidx/drawerlayout/widget/DrawerLayout;

    invoke-virtual {p3}, Landroid/view/ViewGroup;->getWidth()I

    move-result p3

    invoke-virtual {p1}, Landroid/view/View;->getWidth()I

    move-result p1

    sub-int p1, p3, p1

    goto :goto_f
.end method

.method public づざかべべ(II)V
    .registers 4

    const/4 v0, 0x1

    and-int/2addr p1, v0

    if-ne p1, v0, :cond_8

    iget-object p1, p0, Landroidx/drawerlayout/widget/DrawerLayout$づざかべべ;->びぐびあび:Landroidx/drawerlayout/widget/DrawerLayout;

    const/4 v0, 0x3

    goto :goto_b

    :cond_8
    iget-object p1, p0, Landroidx/drawerlayout/widget/DrawerLayout$づざかべべ;->びぐびあび:Landroidx/drawerlayout/widget/DrawerLayout;

    const/4 v0, 0x5

    :goto_b
    invoke-virtual {p1, v0}, Landroidx/drawerlayout/widget/DrawerLayout;->づざかべべ(I)Landroid/view/View;

    move-result-object p1

    if-eqz p1, :cond_1e

    iget-object v0, p0, Landroidx/drawerlayout/widget/DrawerLayout$づざかべべ;->びぐびあび:Landroidx/drawerlayout/widget/DrawerLayout;

    invoke-virtual {v0, p1}, Landroidx/drawerlayout/widget/DrawerLayout;->ぺぁあねじ(Landroid/view/View;)I

    move-result v0

    if-nez v0, :cond_1e

    iget-object v0, p0, Landroidx/drawerlayout/widget/DrawerLayout$づざかべべ;->〺つふすそ:Lづざかべべ/いいにぽつ/げつ〴ぬぐ/づざかべべ;

    invoke-virtual {v0, p1, p2}, Lづざかべべ/いいにぽつ/げつ〴ぬぐ/づざかべべ;->くし〴〺ぅ(Landroid/view/View;I)V

    :cond_1e
    return-void
.end method

.method public てぜきぽく(Landroid/view/View;I)Z
    .registers 4

    iget-object p2, p0, Landroidx/drawerlayout/widget/DrawerLayout$づざかべべ;->びぐびあび:Landroidx/drawerlayout/widget/DrawerLayout;

    invoke-virtual {p2, p1}, Landroidx/drawerlayout/widget/DrawerLayout;->ぇぬぎばつ(Landroid/view/View;)Z

    move-result p2

    if-eqz p2, :cond_1c

    iget-object p2, p0, Landroidx/drawerlayout/widget/DrawerLayout$づざかべべ;->びぐびあび:Landroidx/drawerlayout/widget/DrawerLayout;

    iget v0, p0, Landroidx/drawerlayout/widget/DrawerLayout$づざかべべ;->げつ〴ぬぐ:I

    invoke-virtual {p2, p1, v0}, Landroidx/drawerlayout/widget/DrawerLayout;->げつ〴ぬぐ(Landroid/view/View;I)Z

    move-result p2

    if-eqz p2, :cond_1c

    iget-object p2, p0, Landroidx/drawerlayout/widget/DrawerLayout$づざかべべ;->びぐびあび:Landroidx/drawerlayout/widget/DrawerLayout;

    invoke-virtual {p2, p1}, Landroidx/drawerlayout/widget/DrawerLayout;->ぺぁあねじ(Landroid/view/View;)I

    move-result p1

    if-nez p1, :cond_1c

    const/4 p1, 0x1

    goto :goto_1d

    :cond_1c
    const/4 p1, 0x0

    :goto_1d
    return p1
.end method

.method public なぎぱいぢぎ(I)Z
    .registers 2

    const/4 p1, 0x0

    return p1
.end method

.method public final のぷのちつ()V
    .registers 4

    iget v0, p0, Landroidx/drawerlayout/widget/DrawerLayout$づざかべべ;->げつ〴ぬぐ:I

    const/4 v1, 0x3

    if-ne v0, v1, :cond_6

    const/4 v1, 0x5

    :cond_6
    iget-object v0, p0, Landroidx/drawerlayout/widget/DrawerLayout$づざかべべ;->びぐびあび:Landroidx/drawerlayout/widget/DrawerLayout;

    invoke-virtual {v0, v1}, Landroidx/drawerlayout/widget/DrawerLayout;->づざかべべ(I)Landroid/view/View;

    move-result-object v0

    if-eqz v0, :cond_14

    iget-object v1, p0, Landroidx/drawerlayout/widget/DrawerLayout$づざかべべ;->びぐびあび:Landroidx/drawerlayout/widget/DrawerLayout;

    const/4 v2, 0x1

    .line 1
    invoke-virtual {v1, v0, v2}, Landroidx/drawerlayout/widget/DrawerLayout;->くし〴〺ぅ(Landroid/view/View;Z)V

    :cond_14
    return-void
.end method

.method public へぬ〴づぞ()V
    .registers 3

    iget-object v0, p0, Landroidx/drawerlayout/widget/DrawerLayout$づざかべべ;->びぐびあび:Landroidx/drawerlayout/widget/DrawerLayout;

    iget-object v1, p0, Landroidx/drawerlayout/widget/DrawerLayout$づざかべべ;->くし〴〺ぅ:Ljava/lang/Runnable;

    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->removeCallbacks(Ljava/lang/Runnable;)Z

    return-void
.end method

.method public ぺぁあねじ(I)V
    .registers 4

    iget-object v0, p0, Landroidx/drawerlayout/widget/DrawerLayout$づざかべべ;->びぐびあび:Landroidx/drawerlayout/widget/DrawerLayout;

    iget-object v1, p0, Landroidx/drawerlayout/widget/DrawerLayout$づざかべべ;->〺つふすそ:Lづざかべべ/いいにぽつ/げつ〴ぬぐ/づざかべべ;

    .line 1
    iget-object v1, v1, Lづざかべべ/いいにぽつ/げつ〴ぬぐ/づざかべべ;->は〲ぱなで:Landroid/view/View;

    .line 2
    invoke-virtual {v0, p1, v1}, Landroidx/drawerlayout/widget/DrawerLayout;->〻ぞまぎな〻(ILandroid/view/View;)V

    return-void
.end method

.method public ぺふねづ〺(Landroid/view/View;FF)V
    .registers 9

    iget-object p3, p0, Landroidx/drawerlayout/widget/DrawerLayout$づざかべべ;->びぐびあび:Landroidx/drawerlayout/widget/DrawerLayout;

    .line 1
    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {p1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object p3

    check-cast p3, Landroidx/drawerlayout/widget/DrawerLayout$LayoutParams;

    iget p3, p3, Landroidx/drawerlayout/widget/DrawerLayout$LayoutParams;->〺つふすそ:F

    .line 2
    invoke-virtual {p1}, Landroid/view/View;->getWidth()I

    move-result v0

    iget-object v1, p0, Landroidx/drawerlayout/widget/DrawerLayout$づざかべべ;->びぐびあび:Landroidx/drawerlayout/widget/DrawerLayout;

    const/4 v2, 0x3

    invoke-virtual {v1, p1, v2}, Landroidx/drawerlayout/widget/DrawerLayout;->げつ〴ぬぐ(Landroid/view/View;I)Z

    move-result v1

    const/high16 v2, 0x3f000000    # 0.5f

    const/4 v3, 0x0

    if-eqz v1, :cond_2e

    cmpl-float v1, p2, v3

    if-gtz v1, :cond_2c

    cmpl-float p2, p2, v3

    if-nez p2, :cond_2a

    cmpl-float p2, p3, v2

    if-lez p2, :cond_2a

    goto :goto_2c

    :cond_2a
    neg-int p2, v0

    goto :goto_42

    :cond_2c
    :goto_2c
    const/4 p2, 0x0

    goto :goto_42

    :cond_2e
    iget-object v1, p0, Landroidx/drawerlayout/widget/DrawerLayout$づざかべべ;->びぐびあび:Landroidx/drawerlayout/widget/DrawerLayout;

    invoke-virtual {v1}, Landroid/view/ViewGroup;->getWidth()I

    move-result v1

    cmpg-float v4, p2, v3

    if-ltz v4, :cond_40

    cmpl-float p2, p2, v3

    if-nez p2, :cond_41

    cmpl-float p2, p3, v2

    if-lez p2, :cond_41

    :cond_40
    sub-int/2addr v1, v0

    :cond_41
    move p2, v1

    :goto_42
    iget-object p3, p0, Landroidx/drawerlayout/widget/DrawerLayout$づざかべべ;->〺つふすそ:Lづざかべべ/いいにぽつ/げつ〴ぬぐ/づざかべべ;

    invoke-virtual {p1}, Landroid/view/View;->getTop()I

    move-result p1

    invoke-virtual {p3, p2, p1}, Lづざかべべ/いいにぽつ/げつ〴ぬぐ/づざかべべ;->〻ぞまぎな〻(II)Z

    iget-object p1, p0, Landroidx/drawerlayout/widget/DrawerLayout$づざかべべ;->びぐびあび:Landroidx/drawerlayout/widget/DrawerLayout;

    invoke-virtual {p1}, Landroid/view/ViewGroup;->invalidate()V

    return-void
.end method
