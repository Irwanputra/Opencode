.class public Lづざかべべ/ぇぬぎばつ/びぐびあび/づざかべべ;
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

    iput-object p1, p0, Lづざかべべ/ぇぬぎばつ/びぐびあび/づざかべべ;->くし〴〺ぅ:Lづざかべべ/ぇぬぎばつ/びぐびあび/ぺふねづ〺;

    iput-object p2, p0, Lづざかべべ/ぇぬぎばつ/びぐびあび/づざかべべ;->〺つふすそ:Ljava/util/ArrayList;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .registers 9

    iget-object v0, p0, Lづざかべべ/ぇぬぎばつ/びぐびあび/づざかべべ;->〺つふすそ:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_6
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_3b

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroidx/recyclerview/widget/RecyclerView$ぉ〲なぱぽた;

    iget-object v2, p0, Lづざかべべ/ぇぬぎばつ/びぐびあび/づざかべべ;->くし〴〺ぅ:Lづざかべべ/ぇぬぎばつ/びぐびあび/ぺふねづ〺;

    .line 1
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object v3, v1, Landroidx/recyclerview/widget/RecyclerView$ぉ〲なぱぽた;->げつ〴ぬぐ:Landroid/view/View;

    invoke-virtual {v3}, Landroid/view/View;->animate()Landroid/view/ViewPropertyAnimator;

    move-result-object v4

    iget-object v5, v2, Lづざかべべ/ぇぬぎばつ/びぐびあび/ぺふねづ〺;->おぐぴう〸ず:Ljava/util/ArrayList;

    invoke-virtual {v5, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    const/high16 v5, 0x3f800000    # 1.0f

    invoke-virtual {v4, v5}, Landroid/view/ViewPropertyAnimator;->alpha(F)Landroid/view/ViewPropertyAnimator;

    move-result-object v5

    .line 2
    iget-wide v6, v2, Landroidx/recyclerview/widget/RecyclerView$ぺぁあねじ;->くし〴〺ぅ:J

    .line 3
    invoke-virtual {v5, v6, v7}, Landroid/view/ViewPropertyAnimator;->setDuration(J)Landroid/view/ViewPropertyAnimator;

    move-result-object v5

    new-instance v6, Lづざかべべ/ぇぬぎばつ/びぐびあび/ぁごぐすすぃ;

    invoke-direct {v6, v2, v1, v3, v4}, Lづざかべべ/ぇぬぎばつ/びぐびあび/ぁごぐすすぃ;-><init>(Lづざかべべ/ぇぬぎばつ/びぐびあび/ぺふねづ〺;Landroidx/recyclerview/widget/RecyclerView$ぉ〲なぱぽた;Landroid/view/View;Landroid/view/ViewPropertyAnimator;)V

    invoke-virtual {v5, v6}, Landroid/view/ViewPropertyAnimator;->setListener(Landroid/animation/Animator$AnimatorListener;)Landroid/view/ViewPropertyAnimator;

    move-result-object v1

    invoke-virtual {v1}, Landroid/view/ViewPropertyAnimator;->start()V

    goto :goto_6

    .line 4
    :cond_3b
    iget-object v0, p0, Lづざかべべ/ぇぬぎばつ/びぐびあび/づざかべべ;->〺つふすそ:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    iget-object v0, p0, Lづざかべべ/ぇぬぎばつ/びぐびあび/づざかべべ;->くし〴〺ぅ:Lづざかべべ/ぇぬぎばつ/びぐびあび/ぺふねづ〺;

    iget-object v0, v0, Lづざかべべ/ぇぬぎばつ/びぐびあび/ぺふねづ〺;->てぜきぽく:Ljava/util/ArrayList;

    iget-object v1, p0, Lづざかべべ/ぇぬぎばつ/びぐびあび/づざかべべ;->〺つふすそ:Ljava/util/ArrayList;

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    return-void
.end method
