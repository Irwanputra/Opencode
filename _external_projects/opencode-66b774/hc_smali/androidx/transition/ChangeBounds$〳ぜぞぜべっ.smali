.class public Landroidx/transition/ChangeBounds$〳ぜぞぜべっ;
.super Landroid/animation/AnimatorListenerAdapter;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/transition/ChangeBounds;->ぺふねづ〺(Landroid/view/ViewGroup;Lづざかべべ/は〲ぱなで/ぉ〲なぱぽた;Lづざかべべ/は〲ぱなで/ぉ〲なぱぽた;)Landroid/animation/Animator;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic 〺つふすそ:Landroid/view/View;

.field public final synthetic ぁごぐすすぃ:I

.field public final synthetic くし〴〺ぅ:Landroid/graphics/Rect;

.field public げつ〴ぬぐ:Z

.field public final synthetic づざかべべ:I

.field public final synthetic なぎぱいぢぎ:I

.field public final synthetic びぐびあび:I


# direct methods
.method public constructor <init>(Landroidx/transition/ChangeBounds;Landroid/view/View;Landroid/graphics/Rect;IIII)V
    .registers 8

    iput-object p2, p0, Landroidx/transition/ChangeBounds$〳ぜぞぜべっ;->〺つふすそ:Landroid/view/View;

    iput-object p3, p0, Landroidx/transition/ChangeBounds$〳ぜぞぜべっ;->くし〴〺ぅ:Landroid/graphics/Rect;

    iput p4, p0, Landroidx/transition/ChangeBounds$〳ぜぞぜべっ;->びぐびあび:I

    iput p5, p0, Landroidx/transition/ChangeBounds$〳ぜぞぜべっ;->づざかべべ:I

    iput p6, p0, Landroidx/transition/ChangeBounds$〳ぜぞぜべっ;->なぎぱいぢぎ:I

    iput p7, p0, Landroidx/transition/ChangeBounds$〳ぜぞぜべっ;->ぁごぐすすぃ:I

    invoke-direct {p0}, Landroid/animation/AnimatorListenerAdapter;-><init>()V

    return-void
.end method


# virtual methods
.method public onAnimationCancel(Landroid/animation/Animator;)V
    .registers 2

    const/4 p1, 0x1

    iput-boolean p1, p0, Landroidx/transition/ChangeBounds$〳ぜぞぜべっ;->げつ〴ぬぐ:Z

    return-void
.end method

.method public onAnimationEnd(Landroid/animation/Animator;)V
    .registers 6

    iget-boolean p1, p0, Landroidx/transition/ChangeBounds$〳ぜぞぜべっ;->げつ〴ぬぐ:Z

    if-nez p1, :cond_18

    iget-object p1, p0, Landroidx/transition/ChangeBounds$〳ぜぞぜべっ;->〺つふすそ:Landroid/view/View;

    iget-object v0, p0, Landroidx/transition/ChangeBounds$〳ぜぞぜべっ;->くし〴〺ぅ:Landroid/graphics/Rect;

    invoke-static {p1, v0}, Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/おぐぴう〸ず;->げがぴうあだ(Landroid/view/View;Landroid/graphics/Rect;)V

    iget-object p1, p0, Landroidx/transition/ChangeBounds$〳ぜぞぜべっ;->〺つふすそ:Landroid/view/View;

    iget v0, p0, Landroidx/transition/ChangeBounds$〳ぜぞぜべっ;->びぐびあび:I

    iget v1, p0, Landroidx/transition/ChangeBounds$〳ぜぞぜべっ;->づざかべべ:I

    iget v2, p0, Landroidx/transition/ChangeBounds$〳ぜぞぜべっ;->なぎぱいぢぎ:I

    iget v3, p0, Landroidx/transition/ChangeBounds$〳ぜぞぜべっ;->ぁごぐすすぃ:I

    invoke-static {p1, v0, v1, v2, v3}, Lづざかべべ/は〲ぱなで/せづっ〸ちね;->くし〴〺ぅ(Landroid/view/View;IIII)V

    :cond_18
    return-void
.end method
