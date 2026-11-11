.class public Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/なぶひせが/ぺぁあねじ;
.super Landroidx/transition/Transition;
.source ""


# direct methods
.method public constructor <init>()V
    .registers 1

    invoke-direct {p0}, Landroidx/transition/Transition;-><init>()V

    return-void
.end method


# virtual methods
.method public ぁごぐすすぃ(Lづざかべべ/は〲ぱなで/ぉ〲なぱぽた;)V
    .registers 2

    invoke-virtual {p0, p1}, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/なぶひせが/ぺぁあねじ;->ぷぞてのほき(Lづざかべべ/は〲ぱなで/ぉ〲なぱぽた;)V

    return-void
.end method

.method public びぐびあび(Lづざかべべ/は〲ぱなで/ぉ〲なぱぽた;)V
    .registers 2

    invoke-virtual {p0, p1}, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/なぶひせが/ぺぁあねじ;->ぷぞてのほき(Lづざかべべ/は〲ぱなで/ぉ〲なぱぽた;)V

    return-void
.end method

.method public final ぷぞてのほき(Lづざかべべ/は〲ぱなで/ぉ〲なぱぽた;)V
    .registers 4

    iget-object v0, p1, Lづざかべべ/は〲ぱなで/ぉ〲なぱぽた;->〺つふすそ:Landroid/view/View;

    instance-of v1, v0, Landroid/widget/TextView;

    if-eqz v1, :cond_17

    check-cast v0, Landroid/widget/TextView;

    iget-object p1, p1, Lづざかべべ/は〲ぱなで/ぉ〲なぱぽた;->げつ〴ぬぐ:Ljava/util/Map;

    invoke-virtual {v0}, Landroid/widget/TextView;->getScaleX()F

    move-result v0

    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v0

    const-string v1, "android:textscale:scale"

    invoke-interface {p1, v1, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_17
    return-void
.end method

.method public ぺふねづ〺(Landroid/view/ViewGroup;Lづざかべべ/は〲ぱなで/ぉ〲なぱぽた;Lづざかべべ/は〲ぱなで/ぉ〲なぱぽた;)Landroid/animation/Animator;
    .registers 8

    const/4 p1, 0x0

    if-eqz p2, :cond_59

    if-eqz p3, :cond_59

    iget-object v0, p2, Lづざかべべ/は〲ぱなで/ぉ〲なぱぽた;->〺つふすそ:Landroid/view/View;

    instance-of v0, v0, Landroid/widget/TextView;

    if-eqz v0, :cond_59

    iget-object v0, p3, Lづざかべべ/は〲ぱなで/ぉ〲なぱぽた;->〺つふすそ:Landroid/view/View;

    instance-of v1, v0, Landroid/widget/TextView;

    if-nez v1, :cond_12

    goto :goto_59

    :cond_12
    check-cast v0, Landroid/widget/TextView;

    iget-object p2, p2, Lづざかべべ/は〲ぱなで/ぉ〲なぱぽた;->げつ〴ぬぐ:Ljava/util/Map;

    iget-object p3, p3, Lづざかべべ/は〲ぱなで/ぉ〲なぱぽた;->げつ〴ぬぐ:Ljava/util/Map;

    const-string v1, "android:textscale:scale"

    invoke-interface {p2, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    const/high16 v3, 0x3f800000    # 1.0f

    if-eqz v2, :cond_2d

    invoke-interface {p2, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/lang/Float;

    invoke-virtual {p2}, Ljava/lang/Float;->floatValue()F

    move-result p2

    goto :goto_2f

    :cond_2d
    const/high16 p2, 0x3f800000    # 1.0f

    :goto_2f
    invoke-interface {p3, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    if-eqz v2, :cond_3f

    invoke-interface {p3, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Ljava/lang/Float;

    invoke-virtual {p3}, Ljava/lang/Float;->floatValue()F

    move-result v3

    :cond_3f
    cmpl-float p3, p2, v3

    if-nez p3, :cond_44

    return-object p1

    :cond_44
    const/4 p1, 0x2

    new-array p1, p1, [F

    const/4 p3, 0x0

    aput p2, p1, p3

    const/4 p2, 0x1

    aput v3, p1, p2

    invoke-static {p1}, Landroid/animation/ValueAnimator;->ofFloat([F)Landroid/animation/ValueAnimator;

    move-result-object p1

    new-instance p2, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/なぶひせが/ぺぁあねじ$げつ〴ぬぐ;

    invoke-direct {p2, p0, v0}, Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/なぶひせが/ぺぁあねじ$げつ〴ぬぐ;-><init>(Lなぎぱいぢぎ/なぎぱいぢぎ/〺つふすそ/〺つふすそ/なぶひせが/ぺぁあねじ;Landroid/widget/TextView;)V

    invoke-virtual {p1, p2}, Landroid/animation/ValueAnimator;->addUpdateListener(Landroid/animation/ValueAnimator$AnimatorUpdateListener;)V

    :cond_59
    :goto_59
    return-object p1
.end method
