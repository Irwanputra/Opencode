.class public Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/ぺぁあねじ$づざかべべ;
.super Landroid/view/animation/AnimationSet;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/ぺぁあねじ;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "\u3065\u3056\u304b\u3079\u3079"
.end annotation


# instance fields
.field public final 〺つふすそ:Landroid/view/ViewGroup;

.field public final くし〴〺ぅ:Landroid/view/View;

.field public づざかべべ:Z

.field public なぎぱいぢぎ:Z

.field public びぐびあび:Z


# direct methods
.method public constructor <init>(Landroid/view/animation/Animation;Landroid/view/ViewGroup;Landroid/view/View;)V
    .registers 5

    const/4 v0, 0x0

    invoke-direct {p0, v0}, Landroid/view/animation/AnimationSet;-><init>(Z)V

    const/4 v0, 0x1

    iput-boolean v0, p0, Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/ぺぁあねじ$づざかべべ;->なぎぱいぢぎ:Z

    iput-object p2, p0, Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/ぺぁあねじ$づざかべべ;->〺つふすそ:Landroid/view/ViewGroup;

    iput-object p3, p0, Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/ぺぁあねじ$づざかべべ;->くし〴〺ぅ:Landroid/view/View;

    invoke-virtual {p0, p1}, Landroid/view/animation/AnimationSet;->addAnimation(Landroid/view/animation/Animation;)V

    invoke-virtual {p2, p0}, Landroid/view/ViewGroup;->post(Ljava/lang/Runnable;)Z

    return-void
.end method


# virtual methods
.method public getTransformation(JLandroid/view/animation/Transformation;)Z
    .registers 6

    const/4 v0, 0x1

    iput-boolean v0, p0, Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/ぺぁあねじ$づざかべべ;->なぎぱいぢぎ:Z

    iget-boolean v1, p0, Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/ぺぁあねじ$づざかべべ;->びぐびあび:Z

    if-eqz v1, :cond_b

    iget-boolean p1, p0, Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/ぺぁあねじ$づざかべべ;->づざかべべ:Z

    xor-int/2addr p1, v0

    return p1

    :cond_b
    invoke-super {p0, p1, p2, p3}, Landroid/view/animation/AnimationSet;->getTransformation(JLandroid/view/animation/Transformation;)Z

    move-result p1

    if-nez p1, :cond_18

    iput-boolean v0, p0, Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/ぺぁあねじ$づざかべべ;->びぐびあび:Z

    iget-object p1, p0, Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/ぺぁあねじ$づざかべべ;->〺つふすそ:Landroid/view/ViewGroup;

    invoke-static {p1, p0}, Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/てぜきぽく;->げつ〴ぬぐ(Landroid/view/View;Ljava/lang/Runnable;)Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/てぜきぽく;

    :cond_18
    return v0
.end method

.method public getTransformation(JLandroid/view/animation/Transformation;F)Z
    .registers 7

    const/4 v0, 0x1

    iput-boolean v0, p0, Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/ぺぁあねじ$づざかべべ;->なぎぱいぢぎ:Z

    iget-boolean v1, p0, Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/ぺぁあねじ$づざかべべ;->びぐびあび:Z

    if-eqz v1, :cond_b

    iget-boolean p1, p0, Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/ぺぁあねじ$づざかべべ;->づざかべべ:Z

    xor-int/2addr p1, v0

    return p1

    :cond_b
    invoke-super {p0, p1, p2, p3, p4}, Landroid/view/animation/AnimationSet;->getTransformation(JLandroid/view/animation/Transformation;F)Z

    move-result p1

    if-nez p1, :cond_18

    iput-boolean v0, p0, Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/ぺぁあねじ$づざかべべ;->びぐびあび:Z

    iget-object p1, p0, Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/ぺぁあねじ$づざかべべ;->〺つふすそ:Landroid/view/ViewGroup;

    invoke-static {p1, p0}, Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/てぜきぽく;->げつ〴ぬぐ(Landroid/view/View;Ljava/lang/Runnable;)Lづざかべべ/〳ぜぞぜべっ/のぷのちつ/てぜきぽく;

    :cond_18
    return v0
.end method

.method public run()V
    .registers 3

    iget-boolean v0, p0, Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/ぺぁあねじ$づざかべべ;->びぐびあび:Z

    if-nez v0, :cond_11

    iget-boolean v0, p0, Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/ぺぁあねじ$づざかべべ;->なぎぱいぢぎ:Z

    if-eqz v0, :cond_11

    const/4 v0, 0x0

    iput-boolean v0, p0, Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/ぺぁあねじ$づざかべべ;->なぎぱいぢぎ:Z

    iget-object v0, p0, Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/ぺぁあねじ$づざかべべ;->〺つふすそ:Landroid/view/ViewGroup;

    invoke-virtual {v0, p0}, Landroid/view/ViewGroup;->post(Ljava/lang/Runnable;)Z

    goto :goto_1b

    :cond_11
    iget-object v0, p0, Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/ぺぁあねじ$づざかべべ;->〺つふすそ:Landroid/view/ViewGroup;

    iget-object v1, p0, Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/ぺぁあねじ$づざかべべ;->くし〴〺ぅ:Landroid/view/View;

    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->endViewTransition(Landroid/view/View;)V

    const/4 v0, 0x1

    iput-boolean v0, p0, Lづざかべべ/ぺふねづ〺/げつ〴ぬぐ/ぺぁあねじ$づざかべべ;->づざかべべ:Z

    :goto_1b
    return-void
.end method
