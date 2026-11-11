.class public Landroidx/transition/ChangeClipBounds$げつ〴ぬぐ;
.super Landroid/animation/AnimatorListenerAdapter;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/transition/ChangeClipBounds;->ぺふねづ〺(Landroid/view/ViewGroup;Lづざかべべ/は〲ぱなで/ぉ〲なぱぽた;Lづざかべべ/は〲ぱなで/ぉ〲なぱぽた;)Landroid/animation/Animator;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic げつ〴ぬぐ:Landroid/view/View;


# direct methods
.method public constructor <init>(Landroidx/transition/ChangeClipBounds;Landroid/view/View;)V
    .registers 3

    iput-object p2, p0, Landroidx/transition/ChangeClipBounds$げつ〴ぬぐ;->げつ〴ぬぐ:Landroid/view/View;

    invoke-direct {p0}, Landroid/animation/AnimatorListenerAdapter;-><init>()V

    return-void
.end method


# virtual methods
.method public onAnimationEnd(Landroid/animation/Animator;)V
    .registers 3

    iget-object p1, p0, Landroidx/transition/ChangeClipBounds$げつ〴ぬぐ;->げつ〴ぬぐ:Landroid/view/View;

    const/4 v0, 0x0

    invoke-static {p1, v0}, Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/おぐぴう〸ず;->げがぴうあだ(Landroid/view/View;Landroid/graphics/Rect;)V

    return-void
.end method
