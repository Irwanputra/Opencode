.class public Landroidx/transition/TransitionSet$〺つふすそ;
.super Lづざかべべ/は〲ぱなで/ざっざへづ;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/transition/TransitionSet;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "\u303a\u3064\u3075\u3059\u305d"
.end annotation


# instance fields
.field public げつ〴ぬぐ:Landroidx/transition/TransitionSet;


# direct methods
.method public constructor <init>(Landroidx/transition/TransitionSet;)V
    .registers 2

    invoke-direct {p0}, Lづざかべべ/は〲ぱなで/ざっざへづ;-><init>()V

    iput-object p1, p0, Landroidx/transition/TransitionSet$〺つふすそ;->げつ〴ぬぐ:Landroidx/transition/TransitionSet;

    return-void
.end method


# virtual methods
.method public げつ〴ぬぐ(Landroidx/transition/Transition;)V
    .registers 3

    iget-object p1, p0, Landroidx/transition/TransitionSet$〺つふすそ;->げつ〴ぬぐ:Landroidx/transition/TransitionSet;

    iget-boolean v0, p1, Landroidx/transition/TransitionSet;->どぇぞほだ:Z

    if-nez v0, :cond_e

    invoke-virtual {p1}, Landroidx/transition/Transition;->ぉひのべい()V

    iget-object p1, p0, Landroidx/transition/TransitionSet$〺つふすそ;->げつ〴ぬぐ:Landroidx/transition/TransitionSet;

    const/4 v0, 0x1

    iput-boolean v0, p1, Landroidx/transition/TransitionSet;->どぇぞほだ:Z

    :cond_e
    return-void
.end method

.method public づざかべべ(Landroidx/transition/Transition;)V
    .registers 4

    iget-object v0, p0, Landroidx/transition/TransitionSet$〺つふすそ;->げつ〴ぬぐ:Landroidx/transition/TransitionSet;

    iget v1, v0, Landroidx/transition/TransitionSet;->なぶひせが:I

    add-int/lit8 v1, v1, -0x1

    iput v1, v0, Landroidx/transition/TransitionSet;->なぶひせが:I

    if-nez v1, :cond_10

    const/4 v1, 0x0

    iput-boolean v1, v0, Landroidx/transition/TransitionSet;->どぇぞほだ:Z

    invoke-virtual {v0}, Landroidx/transition/Transition;->のぷのちつ()V

    :cond_10
    invoke-virtual {p1, p0}, Landroidx/transition/Transition;->ぶでにく〼〳(Landroidx/transition/Transition$びぐびあび;)Landroidx/transition/Transition;

    return-void
.end method
