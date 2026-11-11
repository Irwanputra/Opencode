.class public Lづざかべべ/は〲ぱなで/なぎぱいぢぎ$〺つふすそ;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Landroidx/transition/Transition$びぐびあび;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lづざかべべ/は〲ぱなで/なぎぱいぢぎ;->おぐぴう〸ず(Ljava/lang/Object;Landroid/view/View;Ljava/util/ArrayList;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic 〺つふすそ:Ljava/util/ArrayList;

.field public final synthetic げつ〴ぬぐ:Landroid/view/View;


# direct methods
.method public constructor <init>(Lづざかべべ/は〲ぱなで/なぎぱいぢぎ;Landroid/view/View;Ljava/util/ArrayList;)V
    .registers 4

    iput-object p2, p0, Lづざかべべ/は〲ぱなで/なぎぱいぢぎ$〺つふすそ;->げつ〴ぬぐ:Landroid/view/View;

    iput-object p3, p0, Lづざかべべ/は〲ぱなで/なぎぱいぢぎ$〺つふすそ;->〺つふすそ:Ljava/util/ArrayList;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public 〺つふすそ(Landroidx/transition/Transition;)V
    .registers 2

    return-void
.end method

.method public くし〴〺ぅ(Landroidx/transition/Transition;)V
    .registers 2

    return-void
.end method

.method public げつ〴ぬぐ(Landroidx/transition/Transition;)V
    .registers 2

    return-void
.end method

.method public づざかべべ(Landroidx/transition/Transition;)V
    .registers 5

    invoke-virtual {p1, p0}, Landroidx/transition/Transition;->ぶでにく〼〳(Landroidx/transition/Transition$びぐびあび;)Landroidx/transition/Transition;

    iget-object p1, p0, Lづざかべべ/は〲ぱなで/なぎぱいぢぎ$〺つふすそ;->げつ〴ぬぐ:Landroid/view/View;

    const/16 v0, 0x8

    invoke-virtual {p1, v0}, Landroid/view/View;->setVisibility(I)V

    iget-object p1, p0, Lづざかべべ/は〲ぱなで/なぎぱいぢぎ$〺つふすそ;->〺つふすそ:Ljava/util/ArrayList;

    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    move-result p1

    const/4 v0, 0x0

    const/4 v1, 0x0

    :goto_12
    if-ge v1, p1, :cond_22

    iget-object v2, p0, Lづざかべべ/は〲ぱなで/なぎぱいぢぎ$〺つふすそ;->〺つふすそ:Ljava/util/ArrayList;

    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroid/view/View;

    invoke-virtual {v2, v0}, Landroid/view/View;->setVisibility(I)V

    add-int/lit8 v1, v1, 0x1

    goto :goto_12

    :cond_22
    return-void
.end method

.method public びぐびあび(Landroidx/transition/Transition;)V
    .registers 2

    return-void
.end method
