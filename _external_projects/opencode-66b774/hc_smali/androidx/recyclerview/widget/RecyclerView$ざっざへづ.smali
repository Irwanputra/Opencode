.class public abstract Landroidx/recyclerview/widget/RecyclerView$ざっざへづ;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/recyclerview/widget/RecyclerView;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x409
    name = "\u3056\u3063\u3056\u3078\u3065"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroidx/recyclerview/widget/RecyclerView$ざっざへづ$〺つふすそ;,
        Landroidx/recyclerview/widget/RecyclerView$ざっざへづ$げつ〴ぬぐ;
    }
.end annotation


# instance fields
.field public 〳ぜぞぜべっ:Z

.field public 〺つふすそ:Landroidx/recyclerview/widget/RecyclerView;

.field public final ぁごぐすすぃ:Landroidx/recyclerview/widget/RecyclerView$ざっざへづ$げつ〴ぬぐ;

.field public くし〴〺ぅ:Landroidx/recyclerview/widget/RecyclerView$てぜきぽく;

.field public げつ〴ぬぐ:I

.field public づざかべべ:Z

.field public なぎぱいぢぎ:Landroid/view/View;

.field public びぐびあび:Z


# direct methods
.method public constructor <init>()V
    .registers 3

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, -0x1

    iput v0, p0, Landroidx/recyclerview/widget/RecyclerView$ざっざへづ;->げつ〴ぬぐ:I

    new-instance v0, Landroidx/recyclerview/widget/RecyclerView$ざっざへづ$げつ〴ぬぐ;

    const/4 v1, 0x0

    invoke-direct {v0, v1, v1}, Landroidx/recyclerview/widget/RecyclerView$ざっざへづ$げつ〴ぬぐ;-><init>(II)V

    iput-object v0, p0, Landroidx/recyclerview/widget/RecyclerView$ざっざへづ;->ぁごぐすすぃ:Landroidx/recyclerview/widget/RecyclerView$ざっざへづ$げつ〴ぬぐ;

    return-void
.end method


# virtual methods
.method public abstract 〺つふすそ(Landroid/view/View;Landroidx/recyclerview/widget/RecyclerView$でどあくず;Landroidx/recyclerview/widget/RecyclerView$ざっざへづ$げつ〴ぬぐ;)V
.end method

.method public final くし〴〺ぅ()V
    .registers 5

    iget-boolean v0, p0, Landroidx/recyclerview/widget/RecyclerView$ざっざへづ;->づざかべべ:Z

    if-nez v0, :cond_5

    return-void

    :cond_5
    const/4 v0, 0x0

    iput-boolean v0, p0, Landroidx/recyclerview/widget/RecyclerView$ざっざへづ;->づざかべべ:Z

    move-object v1, p0

    check-cast v1, Lづざかべべ/ぇぬぎばつ/びぐびあび/おぐぴう〸ず;

    .line 1
    iput v0, v1, Lづざかべべ/ぇぬぎばつ/びぐびあび/おぐぴう〸ず;->ぇぬぎばつ:I

    iput v0, v1, Lづざかべべ/ぇぬぎばつ/びぐびあび/おぐぴう〸ず;->おぐぴう〸ず:I

    const/4 v2, 0x0

    iput-object v2, v1, Lづざかべべ/ぇぬぎばつ/びぐびあび/おぐぴう〸ず;->ぺふねづ〺:Landroid/graphics/PointF;

    .line 2
    iget-object v1, p0, Landroidx/recyclerview/widget/RecyclerView$ざっざへづ;->〺つふすそ:Landroidx/recyclerview/widget/RecyclerView;

    iget-object v1, v1, Landroidx/recyclerview/widget/RecyclerView;->〴ねぷぐくぼ:Landroidx/recyclerview/widget/RecyclerView$でどあくず;

    const/4 v3, -0x1

    iput v3, v1, Landroidx/recyclerview/widget/RecyclerView$でどあくず;->げつ〴ぬぐ:I

    iput-object v2, p0, Landroidx/recyclerview/widget/RecyclerView$ざっざへづ;->なぎぱいぢぎ:Landroid/view/View;

    iput v3, p0, Landroidx/recyclerview/widget/RecyclerView$ざっざへづ;->げつ〴ぬぐ:I

    iput-boolean v0, p0, Landroidx/recyclerview/widget/RecyclerView$ざっざへづ;->びぐびあび:Z

    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView$ざっざへづ;->くし〴〺ぅ:Landroidx/recyclerview/widget/RecyclerView$てぜきぽく;

    .line 3
    iget-object v1, v0, Landroidx/recyclerview/widget/RecyclerView$てぜきぽく;->ぁごぐすすぃ:Landroidx/recyclerview/widget/RecyclerView$ざっざへづ;

    if-ne v1, p0, :cond_27

    iput-object v2, v0, Landroidx/recyclerview/widget/RecyclerView$てぜきぽく;->ぁごぐすすぃ:Landroidx/recyclerview/widget/RecyclerView$ざっざへづ;

    .line 4
    :cond_27
    iput-object v2, p0, Landroidx/recyclerview/widget/RecyclerView$ざっざへづ;->くし〴〺ぅ:Landroidx/recyclerview/widget/RecyclerView$てぜきぽく;

    iput-object v2, p0, Landroidx/recyclerview/widget/RecyclerView$ざっざへづ;->〺つふすそ:Landroidx/recyclerview/widget/RecyclerView;

    return-void
.end method

.method public げつ〴ぬぐ(II)V
    .registers 10

    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView$ざっざへづ;->〺つふすそ:Landroidx/recyclerview/widget/RecyclerView;

    iget v1, p0, Landroidx/recyclerview/widget/RecyclerView$ざっざへづ;->げつ〴ぬぐ:I

    const/4 v2, -0x1

    if-eq v1, v2, :cond_9

    if-nez v0, :cond_c

    :cond_9
    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$ざっざへづ;->くし〴〺ぅ()V

    :cond_c
    iget-boolean v1, p0, Landroidx/recyclerview/widget/RecyclerView$ざっざへづ;->びぐびあび:Z

    const/4 v3, 0x0

    const/4 v4, 0x0

    if-eqz v1, :cond_45

    iget-object v1, p0, Landroidx/recyclerview/widget/RecyclerView$ざっざへづ;->なぎぱいぢぎ:Landroid/view/View;

    if-nez v1, :cond_45

    iget-object v1, p0, Landroidx/recyclerview/widget/RecyclerView$ざっざへづ;->くし〴〺ぅ:Landroidx/recyclerview/widget/RecyclerView$てぜきぽく;

    if-eqz v1, :cond_45

    iget v5, p0, Landroidx/recyclerview/widget/RecyclerView$ざっざへづ;->げつ〴ぬぐ:I

    .line 1
    instance-of v6, v1, Landroidx/recyclerview/widget/RecyclerView$ざっざへづ$〺つふすそ;

    if-eqz v6, :cond_27

    check-cast v1, Landroidx/recyclerview/widget/RecyclerView$ざっざへづ$〺つふすそ;

    invoke-interface {v1, v5}, Landroidx/recyclerview/widget/RecyclerView$ざっざへづ$〺つふすそ;->げつ〴ぬぐ(I)Landroid/graphics/PointF;

    move-result-object v1

    goto :goto_28

    :cond_27
    move-object v1, v4

    :goto_28
    if-eqz v1, :cond_45

    .line 2
    iget v5, v1, Landroid/graphics/PointF;->x:F

    cmpl-float v6, v5, v3

    if-nez v6, :cond_36

    iget v6, v1, Landroid/graphics/PointF;->y:F

    cmpl-float v6, v6, v3

    if-eqz v6, :cond_45

    :cond_36
    invoke-static {v5}, Ljava/lang/Math;->signum(F)F

    move-result v5

    float-to-int v5, v5

    iget v1, v1, Landroid/graphics/PointF;->y:F

    invoke-static {v1}, Ljava/lang/Math;->signum(F)F

    move-result v1

    float-to-int v1, v1

    invoke-virtual {v0, v5, v1, v4}, Landroidx/recyclerview/widget/RecyclerView;->な〱ちぉじ(II[I)V

    :cond_45
    const/4 v1, 0x0

    iput-boolean v1, p0, Landroidx/recyclerview/widget/RecyclerView$ざっざへづ;->びぐびあび:Z

    iget-object v5, p0, Landroidx/recyclerview/widget/RecyclerView$ざっざへづ;->なぎぱいぢぎ:Landroid/view/View;

    if-eqz v5, :cond_73

    .line 3
    iget-object v6, p0, Landroidx/recyclerview/widget/RecyclerView$ざっざへづ;->〺つふすそ:Landroidx/recyclerview/widget/RecyclerView;

    .line 4
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {v5}, Landroidx/recyclerview/widget/RecyclerView;->おかぷせ〱(Landroid/view/View;)Landroidx/recyclerview/widget/RecyclerView$ぉ〲なぱぽた;

    move-result-object v5

    if-eqz v5, :cond_5b

    invoke-virtual {v5}, Landroidx/recyclerview/widget/RecyclerView$ぉ〲なぱぽた;->なぎぱいぢぎ()I

    move-result v2

    .line 5
    :cond_5b
    iget v5, p0, Landroidx/recyclerview/widget/RecyclerView$ざっざへづ;->げつ〴ぬぐ:I

    if-ne v2, v5, :cond_71

    iget-object v2, p0, Landroidx/recyclerview/widget/RecyclerView$ざっざへづ;->なぎぱいぢぎ:Landroid/view/View;

    iget-object v5, v0, Landroidx/recyclerview/widget/RecyclerView;->〴ねぷぐくぼ:Landroidx/recyclerview/widget/RecyclerView$でどあくず;

    iget-object v6, p0, Landroidx/recyclerview/widget/RecyclerView$ざっざへづ;->ぁごぐすすぃ:Landroidx/recyclerview/widget/RecyclerView$ざっざへづ$げつ〴ぬぐ;

    invoke-virtual {p0, v2, v5, v6}, Landroidx/recyclerview/widget/RecyclerView$ざっざへづ;->〺つふすそ(Landroid/view/View;Landroidx/recyclerview/widget/RecyclerView$でどあくず;Landroidx/recyclerview/widget/RecyclerView$ざっざへづ$げつ〴ぬぐ;)V

    iget-object v2, p0, Landroidx/recyclerview/widget/RecyclerView$ざっざへづ;->ぁごぐすすぃ:Landroidx/recyclerview/widget/RecyclerView$ざっざへづ$げつ〴ぬぐ;

    invoke-virtual {v2, v0}, Landroidx/recyclerview/widget/RecyclerView$ざっざへづ$げつ〴ぬぐ;->げつ〴ぬぐ(Landroidx/recyclerview/widget/RecyclerView;)V

    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$ざっざへづ;->くし〴〺ぅ()V

    goto :goto_73

    :cond_71
    iput-object v4, p0, Landroidx/recyclerview/widget/RecyclerView$ざっざへづ;->なぎぱいぢぎ:Landroid/view/View;

    :cond_73
    :goto_73
    iget-boolean v2, p0, Landroidx/recyclerview/widget/RecyclerView$ざっざへづ;->づざかべべ:Z

    if-eqz v2, :cond_128

    iget-object v2, v0, Landroidx/recyclerview/widget/RecyclerView;->〴ねぷぐくぼ:Landroidx/recyclerview/widget/RecyclerView$でどあくず;

    iget-object v2, p0, Landroidx/recyclerview/widget/RecyclerView$ざっざへづ;->ぁごぐすすぃ:Landroidx/recyclerview/widget/RecyclerView$ざっざへづ$げつ〴ぬぐ;

    move-object v5, p0

    check-cast v5, Lづざかべべ/ぇぬぎばつ/びぐびあび/おぐぴう〸ず;

    .line 6
    iget-object v6, v5, Landroidx/recyclerview/widget/RecyclerView$ざっざへづ;->〺つふすそ:Landroidx/recyclerview/widget/RecyclerView;

    iget-object v6, v6, Landroidx/recyclerview/widget/RecyclerView;->のぷのちつ:Landroidx/recyclerview/widget/RecyclerView$てぜきぽく;

    invoke-virtual {v6}, Landroidx/recyclerview/widget/RecyclerView$てぜきぽく;->ぉ〲なぱぽた()I

    move-result v6

    if-nez v6, :cond_8d

    .line 7
    invoke-virtual {v5}, Landroidx/recyclerview/widget/RecyclerView$ざっざへづ;->くし〴〺ぅ()V

    goto/16 :goto_110

    :cond_8d
    iget v6, v5, Lづざかべべ/ぇぬぎばつ/びぐびあび/おぐぴう〸ず;->おぐぴう〸ず:I

    sub-int p1, v6, p1

    mul-int v6, v6, p1

    if-gtz v6, :cond_96

    const/4 p1, 0x0

    :cond_96
    iput p1, v5, Lづざかべべ/ぇぬぎばつ/びぐびあび/おぐぴう〸ず;->おぐぴう〸ず:I

    iget v6, v5, Lづざかべべ/ぇぬぎばつ/びぐびあび/おぐぴう〸ず;->ぇぬぎばつ:I

    sub-int p2, v6, p2

    mul-int v6, v6, p2

    if-gtz v6, :cond_a1

    const/4 p2, 0x0

    :cond_a1
    iput p2, v5, Lづざかべべ/ぇぬぎばつ/びぐびあび/おぐぴう〸ず;->ぇぬぎばつ:I

    if-nez p1, :cond_110

    if-nez p2, :cond_110

    .line 8
    iget p1, v5, Landroidx/recyclerview/widget/RecyclerView$ざっざへづ;->げつ〴ぬぐ:I

    .line 9
    iget-object p2, v5, Landroidx/recyclerview/widget/RecyclerView$ざっざへづ;->くし〴〺ぅ:Landroidx/recyclerview/widget/RecyclerView$てぜきぽく;

    .line 10
    instance-of v6, p2, Landroidx/recyclerview/widget/RecyclerView$ざっざへづ$〺つふすそ;

    if-eqz v6, :cond_b5

    check-cast p2, Landroidx/recyclerview/widget/RecyclerView$ざっざへづ$〺つふすそ;

    invoke-interface {p2, p1}, Landroidx/recyclerview/widget/RecyclerView$ざっざへづ$〺つふすそ;->げつ〴ぬぐ(I)Landroid/graphics/PointF;

    move-result-object v4

    :cond_b5
    if-eqz v4, :cond_109

    .line 11
    iget p1, v4, Landroid/graphics/PointF;->x:F

    cmpl-float p2, p1, v3

    if-nez p2, :cond_c4

    iget p2, v4, Landroid/graphics/PointF;->y:F

    cmpl-float p2, p2, v3

    if-nez p2, :cond_c4

    goto :goto_109

    :cond_c4
    mul-float p1, p1, p1

    .line 12
    iget p2, v4, Landroid/graphics/PointF;->y:F

    mul-float p2, p2, p2

    add-float/2addr p2, p1

    float-to-double p1, p2

    invoke-static {p1, p2}, Ljava/lang/Math;->sqrt(D)D

    move-result-wide p1

    double-to-float p1, p1

    iget p2, v4, Landroid/graphics/PointF;->x:F

    div-float/2addr p2, p1

    iput p2, v4, Landroid/graphics/PointF;->x:F

    iget v3, v4, Landroid/graphics/PointF;->y:F

    div-float/2addr v3, p1

    iput v3, v4, Landroid/graphics/PointF;->y:F

    .line 13
    iput-object v4, v5, Lづざかべべ/ぇぬぎばつ/びぐびあび/おぐぴう〸ず;->ぺふねづ〺:Landroid/graphics/PointF;

    const p1, 0x461c4000    # 10000.0f

    mul-float p2, p2, p1

    float-to-int p2, p2

    iput p2, v5, Lづざかべべ/ぇぬぎばつ/びぐびあび/おぐぴう〸ず;->おぐぴう〸ず:I

    mul-float v3, v3, p1

    float-to-int p1, v3

    iput p1, v5, Lづざかべべ/ぇぬぎばつ/びぐびあび/おぐぴう〸ず;->ぇぬぎばつ:I

    const/16 p1, 0x2710

    invoke-virtual {v5, p1}, Lづざかべべ/ぇぬぎばつ/びぐびあび/おぐぴう〸ず;->ぁごぐすすぃ(I)I

    move-result p1

    iget p2, v5, Lづざかべべ/ぇぬぎばつ/びぐびあび/おぐぴう〸ず;->おぐぴう〸ず:I

    int-to-float p2, p2

    const v3, 0x3f99999a    # 1.2f

    mul-float p2, p2, v3

    float-to-int p2, p2

    iget v4, v5, Lづざかべべ/ぇぬぎばつ/びぐびあび/おぐぴう〸ず;->ぇぬぎばつ:I

    int-to-float v4, v4

    mul-float v4, v4, v3

    float-to-int v4, v4

    int-to-float p1, p1

    mul-float p1, p1, v3

    float-to-int p1, p1

    iget-object v3, v5, Lづざかべべ/ぇぬぎばつ/びぐびあび/おぐぴう〸ず;->ぺぁあねじ:Landroid/view/animation/LinearInterpolator;

    invoke-virtual {v2, p2, v4, p1, v3}, Landroidx/recyclerview/widget/RecyclerView$ざっざへづ$げつ〴ぬぐ;->〺つふすそ(IIILandroid/view/animation/Interpolator;)V

    goto :goto_110

    .line 14
    :cond_109
    :goto_109
    iget p1, v5, Landroidx/recyclerview/widget/RecyclerView$ざっざへづ;->げつ〴ぬぐ:I

    .line 15
    iput p1, v2, Landroidx/recyclerview/widget/RecyclerView$ざっざへづ$げつ〴ぬぐ;->びぐびあび:I

    .line 16
    invoke-virtual {v5}, Landroidx/recyclerview/widget/RecyclerView$ざっざへづ;->くし〴〺ぅ()V

    .line 17
    :cond_110
    :goto_110
    iget-object p1, p0, Landroidx/recyclerview/widget/RecyclerView$ざっざへづ;->ぁごぐすすぃ:Landroidx/recyclerview/widget/RecyclerView$ざっざへづ$げつ〴ぬぐ;

    .line 18
    iget p2, p1, Landroidx/recyclerview/widget/RecyclerView$ざっざへづ$げつ〴ぬぐ;->びぐびあび:I

    const/4 v2, 0x1

    if-ltz p2, :cond_118

    const/4 v1, 0x1

    .line 19
    :cond_118
    invoke-virtual {p1, v0}, Landroidx/recyclerview/widget/RecyclerView$ざっざへづ$げつ〴ぬぐ;->げつ〴ぬぐ(Landroidx/recyclerview/widget/RecyclerView;)V

    if-eqz v1, :cond_128

    iget-boolean p1, p0, Landroidx/recyclerview/widget/RecyclerView$ざっざへづ;->づざかべべ:Z

    if-eqz p1, :cond_128

    iput-boolean v2, p0, Landroidx/recyclerview/widget/RecyclerView$ざっざへづ;->びぐびあび:Z

    iget-object p1, v0, Landroidx/recyclerview/widget/RecyclerView;->くぎぶ〼のそ:Landroidx/recyclerview/widget/RecyclerView$〻ぞまぎな〻;

    invoke-virtual {p1}, Landroidx/recyclerview/widget/RecyclerView$〻ぞまぎな〻;->げつ〴ぬぐ()V

    :cond_128
    return-void
.end method
