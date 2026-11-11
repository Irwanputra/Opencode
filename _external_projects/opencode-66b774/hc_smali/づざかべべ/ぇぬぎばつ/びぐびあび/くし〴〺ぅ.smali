.class public Lづざかべべ/ぇぬぎばつ/びぐびあび/くし〴〺ぅ;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic 〺つふすそ:Ljava/util/ArrayList;

.field public final synthetic くし〴〺ぅ:Lづざかべべ/ぇぬぎばつ/びぐびあび/ぺふねづ〺;


# direct methods
.method public constructor <init>(Lづざかべべ/ぇぬぎばつ/びぐびあび/ぺふねづ〺;Ljava/util/ArrayList;)V
    .registers 3

    iput-object p1, p0, Lづざかべべ/ぇぬぎばつ/びぐびあび/くし〴〺ぅ;->くし〴〺ぅ:Lづざかべべ/ぇぬぎばつ/びぐびあび/ぺふねづ〺;

    iput-object p2, p0, Lづざかべべ/ぇぬぎばつ/びぐびあび/くし〴〺ぅ;->〺つふすそ:Ljava/util/ArrayList;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .registers 12

    iget-object v0, p0, Lづざかべべ/ぇぬぎばつ/びぐびあび/くし〴〺ぅ;->〺つふすそ:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_6
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_58

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lづざかべべ/ぇぬぎばつ/びぐびあび/ぺふねづ〺$〺つふすそ;

    iget-object v3, p0, Lづざかべべ/ぇぬぎばつ/びぐびあび/くし〴〺ぅ;->くし〴〺ぅ:Lづざかべべ/ぇぬぎばつ/びぐびあび/ぺふねづ〺;

    iget-object v4, v1, Lづざかべべ/ぇぬぎばつ/びぐびあび/ぺふねづ〺$〺つふすそ;->げつ〴ぬぐ:Landroidx/recyclerview/widget/RecyclerView$ぉ〲なぱぽた;

    iget v2, v1, Lづざかべべ/ぇぬぎばつ/びぐびあび/ぺふねづ〺$〺つふすそ;->〺つふすそ:I

    iget v5, v1, Lづざかべべ/ぇぬぎばつ/びぐびあび/ぺふねづ〺$〺つふすそ;->くし〴〺ぅ:I

    iget v6, v1, Lづざかべべ/ぇぬぎばつ/びぐびあび/ぺふねづ〺$〺つふすそ;->びぐびあび:I

    iget v1, v1, Lづざかべべ/ぇぬぎばつ/びぐびあび/ぺふねづ〺$〺つふすそ;->づざかべべ:I

    .line 1
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object v7, v4, Landroidx/recyclerview/widget/RecyclerView$ぉ〲なぱぽた;->げつ〴ぬぐ:Landroid/view/View;

    sub-int/2addr v6, v2

    sub-int/2addr v1, v5

    const/4 v2, 0x0

    if-eqz v6, :cond_2f

    invoke-virtual {v7}, Landroid/view/View;->animate()Landroid/view/ViewPropertyAnimator;

    move-result-object v5

    invoke-virtual {v5, v2}, Landroid/view/ViewPropertyAnimator;->translationX(F)Landroid/view/ViewPropertyAnimator;

    :cond_2f
    if-eqz v1, :cond_38

    invoke-virtual {v7}, Landroid/view/View;->animate()Landroid/view/ViewPropertyAnimator;

    move-result-object v5

    invoke-virtual {v5, v2}, Landroid/view/ViewPropertyAnimator;->translationY(F)Landroid/view/ViewPropertyAnimator;

    :cond_38
    invoke-virtual {v7}, Landroid/view/View;->animate()Landroid/view/ViewPropertyAnimator;

    move-result-object v8

    iget-object v2, v3, Lづざかべべ/ぇぬぎばつ/びぐびあび/ぺふねづ〺;->ぇぬぎばつ:Ljava/util/ArrayList;

    invoke-virtual {v2, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 2
    iget-wide v9, v3, Landroidx/recyclerview/widget/RecyclerView$ぺぁあねじ;->づざかべべ:J

    .line 3
    invoke-virtual {v8, v9, v10}, Landroid/view/ViewPropertyAnimator;->setDuration(J)Landroid/view/ViewPropertyAnimator;

    move-result-object v9

    new-instance v10, Lづざかべべ/ぇぬぎばつ/びぐびあび/〳ぜぞぜべっ;

    move-object v2, v10

    move v5, v6

    move-object v6, v7

    move v7, v1

    invoke-direct/range {v2 .. v8}, Lづざかべべ/ぇぬぎばつ/びぐびあび/〳ぜぞぜべっ;-><init>(Lづざかべべ/ぇぬぎばつ/びぐびあび/ぺふねづ〺;Landroidx/recyclerview/widget/RecyclerView$ぉ〲なぱぽた;ILandroid/view/View;ILandroid/view/ViewPropertyAnimator;)V

    invoke-virtual {v9, v10}, Landroid/view/ViewPropertyAnimator;->setListener(Landroid/animation/Animator$AnimatorListener;)Landroid/view/ViewPropertyAnimator;

    move-result-object v1

    invoke-virtual {v1}, Landroid/view/ViewPropertyAnimator;->start()V

    goto :goto_6

    .line 4
    :cond_58
    iget-object v0, p0, Lづざかべべ/ぇぬぎばつ/びぐびあび/くし〴〺ぅ;->〺つふすそ:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    iget-object v0, p0, Lづざかべべ/ぇぬぎばつ/びぐびあび/くし〴〺ぅ;->くし〴〺ぅ:Lづざかべべ/ぇぬぎばつ/びぐびあび/ぺふねづ〺;

    iget-object v0, v0, Lづざかべべ/ぇぬぎばつ/びぐびあび/ぺふねづ〺;->のぷのちつ:Ljava/util/ArrayList;

    iget-object v1, p0, Lづざかべべ/ぇぬぎばつ/びぐびあび/くし〴〺ぅ;->〺つふすそ:Ljava/util/ArrayList;

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    return-void
.end method
