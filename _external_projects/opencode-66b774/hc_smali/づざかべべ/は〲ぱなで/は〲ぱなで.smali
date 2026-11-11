.class public Lづざかべべ/は〲ぱなで/は〲ぱなで;
.super Landroid/animation/AnimatorListenerAdapter;
.source ""


# instance fields
.field public final synthetic 〺つふすそ:Landroidx/transition/Transition;

.field public final synthetic げつ〴ぬぐ:Lづざかべべ/づざかべべ/げつ〴ぬぐ;


# direct methods
.method public constructor <init>(Landroidx/transition/Transition;Lづざかべべ/づざかべべ/げつ〴ぬぐ;)V
    .registers 3

    iput-object p1, p0, Lづざかべべ/は〲ぱなで/は〲ぱなで;->〺つふすそ:Landroidx/transition/Transition;

    iput-object p2, p0, Lづざかべべ/は〲ぱなで/は〲ぱなで;->げつ〴ぬぐ:Lづざかべべ/づざかべべ/げつ〴ぬぐ;

    invoke-direct {p0}, Landroid/animation/AnimatorListenerAdapter;-><init>()V

    return-void
.end method


# virtual methods
.method public onAnimationEnd(Landroid/animation/Animator;)V
    .registers 3

    iget-object v0, p0, Lづざかべべ/は〲ぱなで/は〲ぱなで;->げつ〴ぬぐ:Lづざかべべ/づざかべべ/げつ〴ぬぐ;

    invoke-virtual {v0, p1}, Lづざかべべ/づざかべべ/〳ぜぞぜべっ;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v0, p0, Lづざかべべ/は〲ぱなで/は〲ぱなで;->〺つふすそ:Landroidx/transition/Transition;

    iget-object v0, v0, Landroidx/transition/Transition;->へぬ〴づぞ:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    return-void
.end method

.method public onAnimationStart(Landroid/animation/Animator;)V
    .registers 3

    iget-object v0, p0, Lづざかべべ/は〲ぱなで/は〲ぱなで;->〺つふすそ:Landroidx/transition/Transition;

    iget-object v0, v0, Landroidx/transition/Transition;->へぬ〴づぞ:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    return-void
.end method
