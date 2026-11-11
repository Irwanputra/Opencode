.class public Lづざかべべ/は〲ぱなで/なぎぱいぢぎ$びぐびあび;
.super Landroidx/transition/Transition$くし〴〺ぅ;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lづざかべべ/は〲ぱなで/なぎぱいぢぎ;->ぉざぅち〻(Ljava/lang/Object;Landroid/graphics/Rect;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic げつ〴ぬぐ:Landroid/graphics/Rect;


# direct methods
.method public constructor <init>(Lづざかべべ/は〲ぱなで/なぎぱいぢぎ;Landroid/graphics/Rect;)V
    .registers 3

    iput-object p2, p0, Lづざかべべ/は〲ぱなで/なぎぱいぢぎ$びぐびあび;->げつ〴ぬぐ:Landroid/graphics/Rect;

    invoke-direct {p0}, Landroidx/transition/Transition$くし〴〺ぅ;-><init>()V

    return-void
.end method


# virtual methods
.method public げつ〴ぬぐ(Landroidx/transition/Transition;)Landroid/graphics/Rect;
    .registers 2

    iget-object p1, p0, Lづざかべべ/は〲ぱなで/なぎぱいぢぎ$びぐびあび;->げつ〴ぬぐ:Landroid/graphics/Rect;

    if-eqz p1, :cond_e

    invoke-virtual {p1}, Landroid/graphics/Rect;->isEmpty()Z

    move-result p1

    if-eqz p1, :cond_b

    goto :goto_e

    :cond_b
    iget-object p1, p0, Lづざかべべ/は〲ぱなで/なぎぱいぢぎ$びぐびあび;->げつ〴ぬぐ:Landroid/graphics/Rect;

    return-object p1

    :cond_e
    :goto_e
    const/4 p1, 0x0

    return-object p1
.end method
