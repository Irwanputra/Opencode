.class public Lづざかべべ/は〲ぱなで/ごづごきえ;
.super Landroid/animation/AnimatorListenerAdapter;
.source ""


# instance fields
.field public final synthetic げつ〴ぬぐ:Landroidx/transition/Transition;


# direct methods
.method public constructor <init>(Landroidx/transition/Transition;)V
    .registers 2

    iput-object p1, p0, Lづざかべべ/は〲ぱなで/ごづごきえ;->げつ〴ぬぐ:Landroidx/transition/Transition;

    invoke-direct {p0}, Landroid/animation/AnimatorListenerAdapter;-><init>()V

    return-void
.end method


# virtual methods
.method public onAnimationEnd(Landroid/animation/Animator;)V
    .registers 3

    iget-object v0, p0, Lづざかべべ/は〲ぱなで/ごづごきえ;->げつ〴ぬぐ:Landroidx/transition/Transition;

    invoke-virtual {v0}, Landroidx/transition/Transition;->のぷのちつ()V

    invoke-virtual {p1, p0}, Landroid/animation/Animator;->removeListener(Landroid/animation/Animator$AnimatorListener;)V

    return-void
.end method
