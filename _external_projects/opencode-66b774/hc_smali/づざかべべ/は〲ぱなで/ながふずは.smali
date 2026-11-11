.class public Lづざかべべ/は〲ぱなで/ながふずは;
.super Lづざかべべ/は〲ぱなで/ざっざへづ;
.source ""


# instance fields
.field public final synthetic 〺つふすそ:Landroid/view/View;

.field public final synthetic くし〴〺ぅ:Landroid/view/View;

.field public final synthetic げつ〴ぬぐ:Landroid/view/ViewGroup;

.field public final synthetic びぐびあび:Landroidx/transition/Visibility;


# direct methods
.method public constructor <init>(Landroidx/transition/Visibility;Landroid/view/ViewGroup;Landroid/view/View;Landroid/view/View;)V
    .registers 5

    iput-object p1, p0, Lづざかべべ/は〲ぱなで/ながふずは;->びぐびあび:Landroidx/transition/Visibility;

    iput-object p2, p0, Lづざかべべ/は〲ぱなで/ながふずは;->げつ〴ぬぐ:Landroid/view/ViewGroup;

    iput-object p3, p0, Lづざかべべ/は〲ぱなで/ながふずは;->〺つふすそ:Landroid/view/View;

    iput-object p4, p0, Lづざかべべ/は〲ぱなで/ながふずは;->くし〴〺ぅ:Landroid/view/View;

    invoke-direct {p0}, Lづざかべべ/は〲ぱなで/ざっざへづ;-><init>()V

    return-void
.end method


# virtual methods
.method public くし〴〺ぅ(Landroidx/transition/Transition;)V
    .registers 3

    iget-object p1, p0, Lづざかべべ/は〲ぱなで/ながふずは;->げつ〴ぬぐ:Landroid/view/ViewGroup;

    invoke-static {p1}, Lづざかべべ/は〲ぱなで/じぜこほぱ;->げつ〴ぬぐ(Landroid/view/ViewGroup;)Lづざかべべ/は〲ぱなで/ぅみぱぎぎ;

    move-result-object p1

    iget-object v0, p0, Lづざかべべ/は〲ぱなで/ながふずは;->〺つふすそ:Landroid/view/View;

    invoke-interface {p1, v0}, Lづざかべべ/は〲ぱなで/ぅみぱぎぎ;->〺つふすそ(Landroid/view/View;)V

    return-void
.end method

.method public づざかべべ(Landroidx/transition/Transition;)V
    .registers 5

    iget-object v0, p0, Lづざかべべ/は〲ぱなで/ながふずは;->くし〴〺ぅ:Landroid/view/View;

    sget v1, Lづざかべべ/は〲ぱなで/へぬ〴づぞ;->save_overlay_view:I

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Landroid/view/View;->setTag(ILjava/lang/Object;)V

    iget-object v0, p0, Lづざかべべ/は〲ぱなで/ながふずは;->げつ〴ぬぐ:Landroid/view/ViewGroup;

    invoke-static {v0}, Lづざかべべ/は〲ぱなで/じぜこほぱ;->げつ〴ぬぐ(Landroid/view/ViewGroup;)Lづざかべべ/は〲ぱなで/ぅみぱぎぎ;

    move-result-object v0

    iget-object v1, p0, Lづざかべべ/は〲ぱなで/ながふずは;->〺つふすそ:Landroid/view/View;

    invoke-interface {v0, v1}, Lづざかべべ/は〲ぱなで/ぅみぱぎぎ;->〺つふすそ(Landroid/view/View;)V

    invoke-virtual {p1, p0}, Landroidx/transition/Transition;->ぶでにく〼〳(Landroidx/transition/Transition$びぐびあび;)Landroidx/transition/Transition;

    return-void
.end method

.method public びぐびあび(Landroidx/transition/Transition;)V
    .registers 6

    iget-object p1, p0, Lづざかべべ/は〲ぱなで/ながふずは;->〺つふすそ:Landroid/view/View;

    invoke-virtual {p1}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object p1

    if-nez p1, :cond_14

    iget-object p1, p0, Lづざかべべ/は〲ぱなで/ながふずは;->げつ〴ぬぐ:Landroid/view/ViewGroup;

    invoke-static {p1}, Lづざかべべ/は〲ぱなで/じぜこほぱ;->げつ〴ぬぐ(Landroid/view/ViewGroup;)Lづざかべべ/は〲ぱなで/ぅみぱぎぎ;

    move-result-object p1

    iget-object v0, p0, Lづざかべべ/は〲ぱなで/ながふずは;->〺つふすそ:Landroid/view/View;

    invoke-interface {p1, v0}, Lづざかべべ/は〲ぱなで/ぅみぱぎぎ;->げつ〴ぬぐ(Landroid/view/View;)V

    goto :goto_51

    :cond_14
    iget-object p1, p0, Lづざかべべ/は〲ぱなで/ながふずは;->びぐびあび:Landroidx/transition/Visibility;

    .line 1
    iget-object v0, p1, Landroidx/transition/Transition;->へぬ〴づぞ:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    :goto_1c
    add-int/lit8 v0, v0, -0x1

    if-ltz v0, :cond_2c

    iget-object v1, p1, Landroidx/transition/Transition;->へぬ〴づぞ:Ljava/util/ArrayList;

    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/animation/Animator;

    invoke-virtual {v1}, Landroid/animation/Animator;->cancel()V

    goto :goto_1c

    :cond_2c
    iget-object v0, p1, Landroidx/transition/Transition;->ざとぅぼこ〺:Ljava/util/ArrayList;

    if-eqz v0, :cond_51

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-lez v0, :cond_51

    iget-object v0, p1, Landroidx/transition/Transition;->ざとぅぼこ〺:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v1

    const/4 v2, 0x0

    :goto_43
    if-ge v2, v1, :cond_51

    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Landroidx/transition/Transition$びぐびあび;

    invoke-interface {v3, p1}, Landroidx/transition/Transition$びぐびあび;->〺つふすそ(Landroidx/transition/Transition;)V

    add-int/lit8 v2, v2, 0x1

    goto :goto_43

    :cond_51
    :goto_51
    return-void
.end method
